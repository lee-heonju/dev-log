package data.model.user;

import data.model.common.CourseCategory;
import data.model.common.Weekday;

import java.util.ArrayList;
import java.util.List;

public class UserPreference {
    // Room 확장 시: List 필드는 TypeConverter 또는 별도 테이블 분리를 고려하면 좋습니다.
    private int targetCredits;
    private boolean prefersMorningClasses;
    private List<Weekday> preferredDaysOff;
    private boolean prioritizeMajorCourses;
    private List<String> requiredCourseIds;
    private boolean allowConsecutiveClasses;
    private boolean minimizeGaps;
    private List<CourseCategory> preferredCategories;

    public UserPreference() {
        this.preferredDaysOff = new ArrayList<>();
        this.requiredCourseIds = new ArrayList<>();
        this.preferredCategories = new ArrayList<>();
    }

    public UserPreference(int targetCredits, boolean prefersMorningClasses, List<Weekday> preferredDaysOff,
                          boolean prioritizeMajorCourses, List<String> requiredCourseIds,
                          boolean allowConsecutiveClasses, boolean minimizeGaps,
                          List<CourseCategory> preferredCategories) {
        this.targetCredits = targetCredits;
        this.prefersMorningClasses = prefersMorningClasses;
        setPreferredDaysOff(preferredDaysOff);
        this.prioritizeMajorCourses = prioritizeMajorCourses;
        setRequiredCourseIds(requiredCourseIds);
        this.allowConsecutiveClasses = allowConsecutiveClasses;
        this.minimizeGaps = minimizeGaps;
        setPreferredCategories(preferredCategories);
    }

    public int getTargetCredits() {
        return targetCredits;
    }

    public void setTargetCredits(int targetCredits) {
        this.targetCredits = targetCredits;
    }

    public boolean isPrefersMorningClasses() {
        return prefersMorningClasses;
    }

    public void setPrefersMorningClasses(boolean prefersMorningClasses) {
        this.prefersMorningClasses = prefersMorningClasses;
    }

    public List<Weekday> getPreferredDaysOff() {
        return new ArrayList<>(preferredDaysOff);
    }

    public void setPreferredDaysOff(List<Weekday> preferredDaysOff) {
        this.preferredDaysOff = preferredDaysOff == null ? new ArrayList<>() : new ArrayList<>(preferredDaysOff);
    }

    public boolean isPrioritizeMajorCourses() {
        return prioritizeMajorCourses;
    }

    public void setPrioritizeMajorCourses(boolean prioritizeMajorCourses) {
        this.prioritizeMajorCourses = prioritizeMajorCourses;
    }

    public List<String> getRequiredCourseIds() {
        return new ArrayList<>(requiredCourseIds);
    }

    public void setRequiredCourseIds(List<String> requiredCourseIds) {
        this.requiredCourseIds = requiredCourseIds == null ? new ArrayList<>() : new ArrayList<>(requiredCourseIds);
    }

    public boolean isAllowConsecutiveClasses() {
        return allowConsecutiveClasses;
    }

    public void setAllowConsecutiveClasses(boolean allowConsecutiveClasses) {
        this.allowConsecutiveClasses = allowConsecutiveClasses;
    }

    public boolean isMinimizeGaps() {
        return minimizeGaps;
    }

    public void setMinimizeGaps(boolean minimizeGaps) {
        this.minimizeGaps = minimizeGaps;
    }

    public List<CourseCategory> getPreferredCategories() {
        return new ArrayList<>(preferredCategories);
    }

    public void setPreferredCategories(List<CourseCategory> preferredCategories) {
        this.preferredCategories = preferredCategories == null ? new ArrayList<>() : new ArrayList<>(preferredCategories);
    }

    @Override
    public String toString() {
        return "UserPreference{" +
                "targetCredits=" + targetCredits +
                ", prefersMorningClasses=" + prefersMorningClasses +
                ", preferredDaysOff=" + preferredDaysOff +
                ", prioritizeMajorCourses=" + prioritizeMajorCourses +
                ", requiredCourseIds=" + requiredCourseIds +
                ", allowConsecutiveClasses=" + allowConsecutiveClasses +
                ", minimizeGaps=" + minimizeGaps +
                ", preferredCategories=" + preferredCategories +
                '}';
    }
}

