public class Grade {
    int english;
    int math;
    void input_grade(int value1, int value2) {
        english = value1;
        math = value2;
    }
    void out_grade() {
        System.out.println(english + math);
    }
}
