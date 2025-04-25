package Real_Age_Classification;

public class Age_classify {
    public static void main(String[] args) {
        String age = args[0];
        System.out.println(age);
        System.out.println(age instanceof String);
        int age1 = Integer.parseInt(age);
        String res = (age1<18) ? "Minor" : (age1<65) ? "Adult" :"Senior";
        System.out.println(res);
    }
}
