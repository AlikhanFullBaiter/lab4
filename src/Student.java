package src;

/**
 * Represents a student with a name and age.
 */
public class Student {
    private int age;
    private String name;

    /**
     * Constructs a Student object with the specified name and age.
     *
     * @param name the name of the student
     * @param age  the age of the student
     */
    public Student(String name , int age) {
        this.name  = name;
        this.age = age;
    }

    /**
     * Retrieves the name of the student.
     *
     * @return the name of the student
     */
    public String getName(){
        return name;
    }

    /**
     * Retrieves the age of the student.
     *
     * @return the age of the student
     */
    public int getAge() {
        return age;
    }

    /**
     * Generates a hash code for the Student object based on its name and age.
     *
     * @return the hash code value
     */
    @Override
    public int hashCode() {
        int prime = 31;
        int result = 5;
        result = prime * result + name.hashCode();
        result = prime * result + age;
        return result;
    }
    /**
     * Checks if the Student object is equal to another object.
     *
     * @param obj the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student other = (Student) obj;
        return this.name.equals(other.name) && this.age == other.age;
    }



    /**
     * Returns a string representation of the Student object.
     *
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
