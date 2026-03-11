package dependency_injection;

import java.util.List;

public class Car {

    private String name;
    private int model_id;

    private List<Engine> engines;
    private List<Engine1> engines1;

    public void setName(String name) {
        this.name = name;
    }

    public void setModel_id(int model_id) {
        this.model_id = model_id;
    }

    public void setEngines(List<Engine> engines) {
        this.engines = engines;
    }

    public void setEngines1(List<Engine1> engines1) {
        this.engines1 = engines1;
    }

    public String getName() {
        return name;
    }

    public int getModel_id() {
        return model_id;
    }

    public List<Engine> getEngines() {
        return engines;
    }

    public List<Engine1> getEngines1() {
        return engines1;
    }

    @Override
    public String toString() {
        return name + " " + model_id + " " + engines + " " + engines1;
    }
}