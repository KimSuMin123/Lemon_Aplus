package L02_0930;

public class school {
    /*1,2번문제 - school클래스에 필드를 만들고 기본생성자와 매개변수 생성자를 이용해 초기화한다*/
    String school_name;
    int grade;

    //기본 생성자
    public school(){
        school_name = "Jejuelementary";
        grade = 6;
        System.out.println(grade+" grade in"+school_name+" school");
    }

    //매개변수 생성자
    public school(String school_name, int grade){
        this.school_name = school_name;
        this.grade = grade;
        System.out.println(grade+" grade in"+school_name+" school");
    }


}
