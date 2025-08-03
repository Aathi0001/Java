
package test1;

public class t85 {
    private String type;
    private String stroke;
    private String power;
    
    public t85(String type, String stroke, String power) {
        this.type = type;
        this.stroke = stroke;
        this.power = power;
    }

    public void start() {
        System.out.println(type + " engine started.");
        detailofengine();
    }

    public String getType() {
        return type;
    }
    public String getStroke() {
    	return stroke;
    }
    public String getPower() {
    	return power;
    }
    public void detailofengine() {
    	System.out.println("--Details of Engine--");
    	System.out.println("Engine Stroke:"+stroke);
    	System.out.println("Engine Power:"+power);
    }
}
