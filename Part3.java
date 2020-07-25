
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
    public boolean twoOccurences(String A,String B){
        int occurence=B.indexOf(A);
        if(occurence<2){
            return false;
        }
        else{
            System.out.println("Occurence is "+occurence);
            return true;
        }
    }
    
    public void testing(){
        String a1="by";
        String b1="A story by Abby Long";
        System.out.println("String A is "+a1);
        System.out.println("String B is "+b1);
        System.out.println(twoOccurences(a1,b1));
        
        String a2="na";
        String b2="banana";
        System.out.println("String A is "+a2);
        System.out.println("String B is "+b2);
        System.out.println(twoOccurences(a2,b2));
        
        String a3="a";
        String b3="hundred";
        System.out.println("String A is "+a3);
        System.out.println("String B is "+b3);
        System.out.println(twoOccurences(a3,b3));
    } 
    
    public String lastPart(String a,String b){
        int occurence=b.indexOf(a);
        int startfrom=a.length();
        String finalpa=b.substring(startfrom+occurence);
        if(occurence==-1){
           return b; 
        } 
        else{
           return finalpa;
        }
    }
    
    public void testing1(){
        String a1 = "an";
        String b1 = "banana";
        System.out.println("String A="+a1);
        System.out.println("String B="+b1);
        String res1=lastPart(a1,b1);
        System.out.println(res1);

        String a2 = "rest";
        String b2 = "deforestacion";
        System.out.println("String A="+a2);
        System.out.println("String B="+b2);
        String res2=lastPart(a2,b2);
        System.out.println(res2);
        
        String a3 = "cio";
        String b3 = "deforestacion";
        System.out.println("String A="+a3);
        System.out.println("String B="+b3);
        String res3=lastPart(a3,b3);
        System.out.println(res3);
    }
}

