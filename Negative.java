/*****************
 * Max Bondoc
 * 4/10/24
 * Negative.java
 */

public class Negative{
    public static void main(String[]args){
        int n1 = (int) (Math.random()*7)-3;
        int n2 = (int) (Math.random()*7)-3;
        int n3 = (int) (Math.random()*7)-3;
        int n4 = (int) (Math.random()*7)-3;
        int sum = n1+n2+n3+n4;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(sum);
        if(sum > 0)
            System.out.print("Not Negative");
        else if(sum < 0)
            System.out.print("Negative");
        
    }
}