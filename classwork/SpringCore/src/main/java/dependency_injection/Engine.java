package dependency_injection;

public class Engine {

    private int id;
    private String type;
    private int horsepower;

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", horsepower=" + horsepower +
                '}';
    }
}