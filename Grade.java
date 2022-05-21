public class Grade {
    int english;
    int math;
    void input_grade(int value1) {
        english = value1;
        math = 80;
    }
    void out_grade() {
        System.out.println(english + math);
    }
}
