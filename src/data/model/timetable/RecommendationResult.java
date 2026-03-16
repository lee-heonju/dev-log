package data.model.timetable;

import java.util.ArrayList;
import java.util.List;

public class RecommendationResult {
    // Room 확장 시: Timetable 1개와 ScoreDetail 여러 개를 관계형으로 나누면 조회가 쉬워집니다.
    private String recommendationId;
    private Timetable timetable;
    private int totalScore;
    private List<ScoreDetail> scoreDetails;

    public RecommendationResult() {
        this.scoreDetails = new ArrayList<>();
    }

    public RecommendationResult(String recommendationId, Timetable timetable, int totalScore, List<ScoreDetail> scoreDetails) {
        this.recommendationId = recommendationId;
        this.timetable = timetable;
        this.totalScore = totalScore;
        setScoreDetails(scoreDetails);
    }

    public String getRecommendationId() {
        return recommendationId;
    }

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    public Timetable getTimetable() {
        return timetable;
    }

    public void setTimetable(Timetable timetable) {
        this.timetable = timetable;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public List<ScoreDetail> getScoreDetails() {
        return new ArrayList<>(scoreDetails);
    }

    public void setScoreDetails(List<ScoreDetail> scoreDetails) {
        this.scoreDetails = scoreDetails == null ? new ArrayList<>() : new ArrayList<>(scoreDetails);
    }

    @Override
    public String toString() {
        return "RecommendationResult{" +
                "recommendationId='" + recommendationId + '\'' +
                ", timetable=" + timetable +
                ", totalScore=" + totalScore +
                ", scoreDetails=" + scoreDetails +
                '}';
    }
}

