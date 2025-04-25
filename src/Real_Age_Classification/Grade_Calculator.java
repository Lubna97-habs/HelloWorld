package Real_Age_Classification;

public class Grade_Calculator {
    public static void main(String[] args) {
        String grade = args[0];
        System.out.println(grade);
       // System.out.println(grade instanceof String);
        int grade1 = Integer.parseInt(grade);
        String res = (grade1>90)? "A" : (grade1>80)? "B" : (grade1>70)? "C" : (grade1>60)? "D" : "F";
        System.out.println(res);
    }
}
