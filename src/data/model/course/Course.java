package data.model.course;

import data.model.common.CourseCategory;

public class Course {
    // Room 확장 시: courseId를 @PrimaryKey로 두고 개설 분반은 별도 Entity로 분리하기 좋습니다.
    private String courseId;
    private String courseCode;
    private String courseName;
    private CourseCategory category;
    private int credits;

    public Course() {
    }

    public Course(String courseId, String courseCode, String courseName, CourseCategory category, int credits) {
        this.courseId = courseId;
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.category = category;
        this.credits = credits;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public CourseCategory getCategory() {
        return category;
    }

    public void setCategory(CourseCategory category) {
        this.category = category;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", courseName='" + courseName + '\'' +
                ", category=" + category +
                ", credits=" + credits +
                '}';
    }
}

