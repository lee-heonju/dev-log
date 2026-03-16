package data.model.course;

import data.model.common.ClassParity;

import java.util.ArrayList;
import java.util.List;

public class LectureSection {
    // Room 확장 시: courseId는 Course와 연결되는 foreign key 후보입니다.
    private String sectionId;
    private String courseId;
    private String sectionNumber;
    private String instructorName;
    private ClassParity classParity;
    private List<MeetingTime> meetingTimes;

    public LectureSection() {
        this.classParity = ClassParity.ALL;
        this.meetingTimes = new ArrayList<>();
    }

    public LectureSection(String sectionId, String courseId, String sectionNumber, String instructorName,
                          ClassParity classParity, List<MeetingTime> meetingTimes) {
        this.sectionId = sectionId;
        this.courseId = courseId;
        this.sectionNumber = sectionNumber;
        this.instructorName = instructorName;
        this.classParity = classParity == null ? ClassParity.ALL : classParity;
        setMeetingTimes(meetingTimes);
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(String sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public ClassParity getClassParity() {
        return classParity;
    }

    public void setClassParity(ClassParity classParity) {
        this.classParity = classParity == null ? ClassParity.ALL : classParity;
    }

    public List<MeetingTime> getMeetingTimes() {
        return new ArrayList<>(meetingTimes);
    }

    public void setMeetingTimes(List<MeetingTime> meetingTimes) {
        this.meetingTimes = meetingTimes == null ? new ArrayList<>() : new ArrayList<>(meetingTimes);
    }

    @Override
    public String toString() {
        return "LectureSection{" +
                "sectionId='" + sectionId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", sectionNumber='" + sectionNumber + '\'' +
                ", instructorName='" + instructorName + '\'' +
                ", classParity=" + classParity +
                ", meetingTimes=" + meetingTimes +
                '}';
    }
}

