package Week4_Session2;

public class Calc {
    public static void main(String[] args) {
        double sum = 0.0;

        for(int i = 0;i<args.length;i++){
            sum += Double.parseDouble(args[i]);
        }
        System.out.print("합계 : " + sum);
    }
}
