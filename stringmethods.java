class stringmethods{
    public static void main (String args[]){
        String s = "abcde";
        char ch=s.charAt(3);
        System.out.println(ch);
        String s1="Neha";
        String s2="Joshi";
        System.out.println(s1.concat(s2));
        int age=9;
        System.out.println("I am"+age+"years old");
        String s3="four:"+2+2;
        System.out.println(s3);
        String s4="Four:"+(2+2);
        System.out.println(s4);
        String s5="football";
        System.out.println(s5.endsWith("ball"));
        String s6="football";
        System.out.println(s6.startsWith("foot"));
        String s7="abcde";
        String s8="ABCDE";
        System.out.println(s7.equals(s8));
        String s9="hello";
        String s10="HELLO";
        System.out.println(s9.equals(s10));
        System.out.println(s9.equalsIgnoreCase(s10));   
    }
}
