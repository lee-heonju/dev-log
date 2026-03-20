# timetable-model-practice

순수 Java 기반 시간표 추천 앱의 `data/model` 설계 연습 프로젝트입니다.

## 현재 포함된 모델
- `data.model.common`
- `data.model.user`
- `data.model.course`
- `data.model.timetable`

## 실행 예제
`src/Main.java`에서 샘플 `UserProfile`, `UserPreference`, `Course`, `LectureSection`, `MeetingTime`, `Timetable`, `RecommendationResult`를 생성하고 출력합니다.

## Room 확장 메모
- 단일 ID 필드는 `@PrimaryKey` 후보
- `List` 필드는 `TypeConverter` 또는 관계 테이블 분리 고려
- `Course`와 `LectureSection`, `Timetable`과 `LectureSection`, `RecommendationResult`와 `ScoreDetail`는 관계형 분리 추천

 
 ＃３／２０ － 모든 패키지 안에 있는 클래스 주석 코멘트 업데이트 완료、 이후 공부 중 

