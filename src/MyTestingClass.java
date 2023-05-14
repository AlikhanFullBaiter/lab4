package src;

public class MyTestingClass {
    private int id;
    private String name;

    public MyTestingClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 5;

        result = prime * result + id;
        result = prime * result + (name != null ? name.hashCode() : 0);

        return result;
    }
}
