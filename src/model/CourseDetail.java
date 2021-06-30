package model;

public class CourseDetail {
    private int id;
    private String name;
    private String courseFee;
    private String registrationFee;

    public CourseDetail(int id, String name, String courseFee, String registrationFee) {
        this.id = id;
        this.name = name;
        this.courseFee = courseFee;
        this.registrationFee = registrationFee;
    }

    public CourseDetail() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(String courseFee) {
        this.courseFee = courseFee;
    }

    public String getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(String registrationFee) {
        this.registrationFee = registrationFee;
    }

    @Override
    public String toString() {
        return "CourseDetail{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courseFee='" + courseFee + '\'' +
                ", registrationFee='" + registrationFee + '\'' +
                '}';
    }
}
