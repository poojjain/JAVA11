public class RunJavaProg {

    public static void main(String[] args) {
        System.out.println("This program is running without compilation");
        if (args.length > 0) {
            System.out.println("Performing addition of the parameters");
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int sum = num1+num2;
            System.out.println("sum : "+sum);
        }
    }

}
