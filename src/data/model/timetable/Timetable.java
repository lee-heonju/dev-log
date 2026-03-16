package data.model.timetable;

import data.model.course.LectureSection;

import java.util.ArrayList;
import java.util.List;

public class Timetable {
    // Room 확장 시: selectedSections는 중간 매핑 테이블로 분리하면 관리가 편합니다.
    private String timetableId;
    private String title;
    private List<LectureSection> selectedSections;
    private int totalCredits;

    public Timetable() {
        this.selectedSections = new ArrayList<>();
    }

    public Timetable(String timetableId, String title, List<LectureSection> selectedSections, int totalCredits) {
        this.timetableId = timetableId;
        this.title = title;
        setSelectedSections(selectedSections);
        this.totalCredits = totalCredits;
    }

    public String getTimetableId() {
        return timetableId;
    }

    public void setTimetableId(String timetableId) {
        this.timetableId = timetableId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<LectureSection> getSelectedSections() {
        return new ArrayList<>(selectedSections);
    }

    public void setSelectedSections(List<LectureSection> selectedSections) {
        this.selectedSections = selectedSections == null ? new ArrayList<>() : new ArrayList<>(selectedSections);
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    @Override
    public String toString() {
        return "Timetable{" +
                "timetableId='" + timetableId + '\'' +
                ", title='" + title + '\'' +
                ", selectedSections=" + selectedSections +
                ", totalCredits=" + totalCredits +
                '}';
    }
}

