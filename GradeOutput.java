public class GradeOutput {
    public static void main(String args[]) {
        Grade g1, g2;
        g1 = new Grade();
        g2 = new Grade();
        g1.input_grade(90, 80);
        g2.input_grade(80, 80);
        g1.out_grade();
        g2.out_grade();
    }
}
