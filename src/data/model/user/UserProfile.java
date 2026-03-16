package data.model.user;

import data.model.common.ClassParity;

public class UserProfile {
    // Room 확장 시: userId는 @PrimaryKey 후보입니다.
    private String userId;
    private String name;
    private String department;
    private String major;
    private int grade;
    private ClassParity classParity;

    public UserProfile() {
        this.classParity = ClassParity.ALL;
    }

    public UserProfile(String userId, String name, String department, String major, int grade, ClassParity classParity) {
        this.userId = userId;
        this.name = name;
        this.department = department;
        this.major = major;
        this.grade = grade;
        this.classParity = classParity == null ? ClassParity.ALL : classParity;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public ClassParity getClassParity() {
        return classParity;
    }

    public void setClassParity(ClassParity classParity) {
        this.classParity = classParity == null ? ClassParity.ALL : classParity;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", major='" + major + '\'' +
                ", grade=" + grade +
                ", classParity=" + classParity +
                '}';
    }
}

