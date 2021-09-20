package Collections;

public class Student {

    private Integer Id;
    private String Name;
    private String city;

    public Student() {
    }

    public Student(Integer id, String name, String city) {
        Id = id;
        Name = name;
        this.city = city;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }


}





