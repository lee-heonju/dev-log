package data.model.timetable;

public class ScoreDetail {
    // Room 확장 시: RecommendationResult와 1:N 관계로 분리 저장하기 좋습니다.
    private String criterion;
    private int score;
    private String description;

    public ScoreDetail() {
    }

    public ScoreDetail(String criterion, int score, String description) {
        this.criterion = criterion;
        this.score = score;
        this.description = description;
    }

    public String getCriterion() {
        return criterion;
    }

    public void setCriterion(String criterion) {
        this.criterion = criterion;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ScoreDetail{" +
                "criterion='" + criterion + '\'' +
                ", score=" + score +
                ", description='" + description + '\'' +
                '}';
    }
}

