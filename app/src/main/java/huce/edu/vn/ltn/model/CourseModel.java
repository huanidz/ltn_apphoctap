package huce.edu.vn.ltn.model;

public class Course {
    int id;
    String courseName;
    int courseImage;
    String courseDescription;

    public Course(int id, String courseName, int courseImage, String courseDescription) {
        this.id = id;
        this.courseName = courseName;
        this.courseImage = courseImage;
        this.courseDescription = courseDescription;
    }

    public Course(String courseName, int courseImage) {
        this.courseName = courseName;
        this.courseImage = courseImage;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseImage() {
        return courseImage;
    }

    public void setCourseImage(int courseImage) {
        this.courseImage = courseImage;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
}
