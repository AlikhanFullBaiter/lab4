package src;

public class MyTestingClass {
    private int id;
    private String name;

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 5;

        result = prime * result + id;
        result = prime * result + (name != null ? name.hashCode() : 0);

        return result;
    }
}
