//package IOC_with_XML;
//class Car {
//    String name;
//    int model_id;
//
//    @Override
//    public String toString() {
//        return name + " " + model_id;
//    }
//}

package ioc_with_xml;

public class Car {

    private String name;
    private int model_id;

    // Setter methods (used by Spring)
    public void setName(String name) {
        this.name = name;
    }

    public void setModel_id(int model_id) {
        this.model_id = model_id;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getModel_id() {
        return model_id;
    }

    @Override
    public String toString() {
        return name + " " + model_id;
    }
}