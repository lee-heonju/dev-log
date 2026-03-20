package data.model.user;

import data.model.common.CourseCategory;
import data.model.common.Weekday;

import java.util.ArrayList;
import java.util.List;

    // 사용자 선호도 선택

public class UserPreference {
    // Room 확장 시: List 필드는 TypeConverter 또는 별도 테이블 분리를 고려하면 좋습니다.
    //목표 학점
    private int targetCredits;
    // 오전 수업 선호 여부 Soft Constraint 점수 가산에 사용
    private boolean prefersMorningClasses;
    //공강 원하는 요일 목록
    //추천 점수 계산 시 해당 요일 비어 있으면 가산점
    private List<Weekday> preferredDaysOff;
    // 전공 우선 여부, 전공 비율 높은 시간표에 가산점
    private boolean prioritizeMajorCourses;
    // 반드시 포함해야하는 과목 ID 목록. Hard Constraint에서 필수 체크
    private List<String> requiredCourseIds;
    // 연강 허용 여부. false면 연강 많은 시간표에 감점 가능
    private boolean allowConsecutiveClasses;
    // 공강 최소화 선호 여부, 시간표 내 gap 게산 점수에 사용
    private boolean minimizeGaps;
    //선호 과목 카테고리(전공/교양) 우선순위 반영
    private List<CourseCategory> preferredCategories;

    // 기본 생성자 List 필드 3개를 모두 new ArrayList<>()로 초기화
    // 목적 : null 때문에 생기는 예외 NullPointerException 방지
    public UserPreference() {
        this.preferredDaysOff = new ArrayList<>();
        this.requiredCourseIds = new ArrayList<>();
        this.preferredCategories = new ArrayList<>();
    }

    //전체 생성자
    //단순 대입이 아니라 setPreferredDaysOff(...) 같은 setter를 호출함.
    //이유: setter 안에 있는 null-safe 로직을 재사용하려고.
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

    //toString() 전체는 개체를 사람이 읽기 좋은 문자열로 바꿔주는 메서드야
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

