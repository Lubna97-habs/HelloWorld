package CLI_Task;

public class Max_number {
    public static void main(String[] args) {
        String a = args[0];
        String b = args[1];
        System.out.println(a);
        System.out.println(b);
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        String res = (a1>b1) ? (a1 + "greter" +b1) : (b1 +  "smaller" +a1);
        System.out.println(res);
    }
}
