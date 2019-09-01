package codechef.practice;

import java.util.Scanner;

public class FlipCoin {

    int cases;
    int coinStatus[];
    Scanner curr;

    FlipCoin(int coins,int cases,Scanner scanner){
        this.cases = cases;
        this.coinStatus = new int[coins];
        this.curr = scanner;
    }

    private void giveOutput(){
        while (cases-->0) {
            int op = curr.nextInt();
            int from = curr.nextInt();
            int to = curr.nextInt();

            if (op == 0) {
                flip(from, to);
            } else {
                printStatus(from, to);
            }
        }
    }

    private void flip(int from, int to){
        for(int i = from; i<= to ;i++){
            if(coinStatus[i]==0){
                coinStatus[i]=1;
            }else {
                coinStatus[i]=0;
            }
        }
    }

    private void printStatus(int from,int to){
        int count = 0;
        for(int i=from;i<=to;i++){
            if(coinStatus[i]==1){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int q = scanner.nextInt();
        FlipCoin flipCoin = new FlipCoin(n,q,scanner);
        flipCoin.giveOutput();
        scanner.close();
    }
}
