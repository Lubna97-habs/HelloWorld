package String;

public class String_function {
    public static void main(String[] args) {
        String name = "Habiba";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        //concat
        System.out.println(name.concat("  Anjum"));
        //contains
        System.out.println(name.contains("ba"));
        //equals
        System.out.println(name.equals("Habiba"));
        //equalIgnoreCase
        System.out.println(name.equalsIgnoreCase("habiba"));
        //indexOf
        System.out.println(name.indexOf('b'));
        //replace
        System.out.println(name.replace('b', 'B'));
        //split
        String email = "habs@gmail@com";
        String[] split = email.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);
        //substring
        System.out.println(name.substring(1,4));
        //toLowerCase
        System.out.println("Habiba".toLowerCase());
        //toUpperCase
        System.out.println("habiba".toUpperCase());
        //startsWith
        System.out.println(name.startsWith("L"));
        //endsWith
        System.out.println(name.endsWith("a"));
        //trim
        String city = "    Bengaluru    ";
        System.out.println(city.trim());
        //compareTo
        System.out.println(name.compareTo("Habiba"));


    }
}
