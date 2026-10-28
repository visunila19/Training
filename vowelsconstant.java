import java.util.*;
     public class Main {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String s3=new String("bye");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));
    }
}




public class Main {
    public static void main(String[] args) {
        String s = "hello world";
        int vowels=0,consonants= 0;
        for (int i=0;i<s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch>='a'&&ch<='z'){
                if(ch=='a'||ch =='e'||ch=='i'
                        ||ch=='o'||ch=='u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
    }
}
