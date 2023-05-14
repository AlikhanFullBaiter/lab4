package src;

/**
 * Represents a sample testing class with an ID and a name.
 */
public class MyTestingClass {
    private int id;
    private String name;

    /**
     * Constructs a MyTestingClass object with the specified ID and name.
     *
     * @param id   the ID of the testing class
     * @param name the name of the testing class
     */
    public MyTestingClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Generates a hash code for the MyTestingClass object based on its ID and name.
     *
     * @return the hash code value
     */
    @Override
    public int hashCode() {
        int prime = 31;
        int result = 5;

        result = prime * result + id;
        result = prime * result + (name != null ? name.hashCode() : 0);

        return result;
    }

    /**
     * Checks if the MyTestingClass object is equal to another object.
     *
     * @param obj the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MyTestingClass)) {
            return false;
        }
        MyTestingClass other = (MyTestingClass) obj;
        return this.id == other.id && this.name.equals(other.name);
    }


    /**
     * Returns a string representation of the MyTestingClass object.
     *
     * @return a string representation of the object
     */

    @Override
    public String toString() {
        return "MyTestingClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
