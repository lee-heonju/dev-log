package data.model.user;

// 사용자 프로필 정보 저장 클래스

import data.model.common.ClassParity; //홀,짝 반 구분 목적 임포트

/*userprofile을 임포트 하게 된다면 private로 접근지정자 지정 해놓은 애들은 캡슐화를 위해
getter / setter로 접근할 수 있게 캡슐화
* */
public class UserProfile {

    // Room 확장 시: userId는 @PrimaryKey 후보입니다.
    private String userId; //고유 식별자, (학번이 될 수도 있음)
    private String name; //이름
    private String department; //학과
    private String major; //세부 전공 ( Ex) 컴퓨터공학과 내에서 소프트웨어,컴공 전공 등 )
    private int grade; //학년
    private ClassParity classParity;//홀, 짝, 전체가능 반 표시

    //디폴트 생성자 생성
    public UserProfile() {
        this.classParity = ClassParity.ALL; //null 대신 기본값 ALL로 설정( 제한 없음 )
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

