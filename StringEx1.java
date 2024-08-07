//Concatenate two string "Hello" and "World"
/*public class StringEx1{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String con = s1+s2;
        //String con = s1.concat(" ").concat(s2);
        System.out.println(con); 
    }
} */



class StringEx1{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        char[] ch3 = new char[s1.length()+s2.length()];
        for(int i=0;i<s1.length();i++){
            ch3[i]=ch1[i];
            }
            for(int i=0;i<s2.length();i++){
               ch3[ch1.length+i]=ch2[i];
            }
            String str=new String(ch3);
            System.out.println(str);
    }
}