package src;

public class Student {
    private int age;
    private String name;

    public Student(String name , int age) {
        this.name  = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 5;
        result = prime * result + name.hashCode();
        result = prime * result + age;
        return result;
    }
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



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
