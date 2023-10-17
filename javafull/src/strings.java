public class strings {

    public static void main(String[] args) {
        String a="python";
        String b="javaaa";
        char c='2';
        int i=c;
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.length());
        System.out.println(a.charAt(2));
        System.out.println(a.indexOf("j"));
        System.out.println(a.lastIndexOf("j"));
        System.out.println(a.concat(b));
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.replace(a,b));
        System.out.println(a.startsWith("j"));
        System.out.println(a.endsWith("a"));
        System.out.println(a.compareTo(b));
        System.out.println(a.compareToIgnoreCase(b));
        System.out.println(a.trim());
        System.out.println(a.substring(0,3));
        System.out.println(i);
    }
}
