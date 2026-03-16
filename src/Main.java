import data.model.common.ClassParity;
import data.model.common.CourseCategory;
import data.model.common.Weekday;
import data.model.course.Course;
import data.model.course.LectureSection;
import data.model.course.MeetingTime;
import data.model.timetable.RecommendationResult;
import data.model.timetable.ScoreDetail;
import data.model.timetable.Timetable;
import data.model.user.UserPreference;
import data.model.user.UserProfile;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile(
                "user-001",
                "김학생",
                "컴퓨터공학부",
                "소프트웨어전공",
                3,
                ClassParity.ODD
        );

        UserPreference userPreference = new UserPreference(
                18,
                true,
                Arrays.asList(Weekday.FRIDAY),
                true,
                Arrays.asList("CSE101"),
                true,
                true,
                Arrays.asList(CourseCategory.MAJOR, CourseCategory.GENERAL)
        );

        Course course = new Course(
                "course-001",
                "CSE101",
                "자료구조",
                CourseCategory.MAJOR,
                3
        );

        MeetingTime mondayClass = new MeetingTime(Weekday.MONDAY, 1, 2);
        MeetingTime wednesdayClass = new MeetingTime(Weekday.WEDNESDAY, 1, 2);

        LectureSection lectureSection = new LectureSection(
                "section-001",
                course.getCourseId(),
                "01",
                "박교수",
                ClassParity.ODD,
                Arrays.asList(mondayClass, wednesdayClass)
        );

        Timetable timetable = new Timetable(
                "tt-001",
                "1안 시간표",
                Arrays.asList(lectureSection),
                course.getCredits()
        );

        ScoreDetail morningScore = new ScoreDetail(
                "오전 수업 선호",
                10,
                "모든 수업이 1~2교시에 배치되어 가산점 부여"
        );

        ScoreDetail majorScore = new ScoreDetail(
                "전공 우선",
                15,
                "전공 과목이 포함되어 가산점 부여"
        );

        RecommendationResult recommendationResult = new RecommendationResult(
                "rec-001",
                timetable,
                morningScore.getScore() + majorScore.getScore(),
                Arrays.asList(morningScore, majorScore)
        );

        System.out.println("=== UserProfile ===");
        System.out.println(userProfile);
        System.out.println();

        System.out.println("=== UserPreference ===");
        System.out.println(userPreference);
        System.out.println();

        System.out.println("=== Course ===");
        System.out.println(course);
        System.out.println();

        System.out.println("=== LectureSection ===");
        System.out.println(lectureSection);
        System.out.println();

        System.out.println("=== Timetable ===");
        System.out.println(timetable);
        System.out.println();

        System.out.println("=== RecommendationResult ===");
        System.out.println(recommendationResult);
    }
}