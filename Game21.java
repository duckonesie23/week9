import java.util.*;
public class Game21 {
    public static void main(String[]args){
        int n1 = (int) (12*Math.random())+1;
        int n2 = (int) (12*Math.random())+1;
        int d1;
        int d2;
        int d3;
        int dsum;
        int tempnum;
        int sum = n1+n2;
        Scanner input = new Scanner(System.in);
        String answer;
        System.out.println("Your cards: "+n1+", "+n2);
        System.out.println("Your Sum: "+sum);
        System.out.println("Would you like to draw another card? y/n");
        answer = input.next();
        if(answer.equals("y")){
            tempnum = (int) (12*Math.random())+1;
            sum += tempnum;
            System.out.println("You drew "+tempnum);
            System.out.println("Your Sum: "+sum);
        }
        else
            return;
        d1 = (int) (12*Math.random())+1;
        d2 = (int) (12*Math.random())+1;
        d3 = (int) (12*Math.random())+1;
        dsum = d1+d2+d3;
        System.out.println("Dealer's cards: "+d1+", "+d2+", "+d3);
        System.out.println("Dealer's sum: "+dsum);

        if(sum > 21)
            System.out.println("You busted!");
        else if(dsum > 21)
            System.out.println("Dealer busted!");
        else if(sum>dsum)
            System.out.println("You win!");
        else if(dsum>sum)
            System.out.println("Dealer wins!");
        else if(dsum==sum)
            System.out.println("Tie.");
    }
}
