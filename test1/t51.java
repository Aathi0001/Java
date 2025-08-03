package test1;

import java.util.Arrays;

public class t51 {
    public static void FrequencyCount(int[] a) {
        boolean[] visited = new boolean[a.length];  // To avoid duplicate counting

        for (int i = 0; i < a.length; i++) {
            if (visited[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    visited[j] = true;  // Mark as visited
                }
            }

            System.out.println(a[i] + " → " + count + " time(s)");
        }
    }

    public static void main(String[] args) {
        int[] a = {400, 600, 452, 625, 400, 600, 600};
        System.out.println("Original Array: " + Arrays.toString(a));
        System.out.println("Frequency of elements:");
        FrequencyCount(a);
    }
}


/*
Step 1: visited[] array

boolean[] visited = new boolean[a.length];
Same size as array a

Tracks whether a number is already counted

Initially all values are false


visited = [false, false, false, false, false, false, false]
🔁 Outer loop: for (int i = 0; i < a.length; i++)
Looping through each element:

Index i = 0 → a[0] = 400
Step 2: Skip if already visited

if (visited[i]) continue;
At first, nothing is visited, so we continue.

🔁 Inner loop: count frequency

int count = 1;
for (int j = i + 1; j < a.length; j++) {
    if (a[i] == a[j]) {
        count++;
        visited[j] = true;
    }
}
Let’s go with an example:

🧮 First Iteration (i = 0)
a[i] = 400

Inner loop j runs from 1 to 6 and checks if any other value equals 400

j	a[j]	Is a[j] == a[i]?	Action	visited[] after
1	600	No	skip	[false, false,...]
2	452	No	skip	
3	625	No	skip	
4	400	Yes	count = 2, mark visited[4]=true	[false, false, false, false, true, ...]
5	600	No	skip	
6	600	No	skip	

✅ Print: 400 → 2 time(s)

🧮 Second Iteration (i = 1)
a[1] = 600

Inner loop checks for matches:

a[5] = 600 → match

a[6] = 600 → match

Count becomes 3

Mark visited[5] and visited[6]

✅ Print: 600 → 3 time(s)

🧮 Third Iteration (i = 2)
a[2] = 452

No duplicates
✅ Print: 452 → 1 time(s)

🧮 Fourth Iteration (i = 3)
a[3] = 625 → unique
✅ Print: 625 → 1 time(s)

🚫 Skipped Iterations
i = 4 → visited[4] = true → already counted 400

i = 5 → visited[5] = true → already counted 600

i = 6 → visited[6] = true → already counted 600

These are skipped.

*/