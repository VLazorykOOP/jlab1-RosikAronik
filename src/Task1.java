import java.util.Scanner;

public class Task1 {
    public Task1() {
    }

    public void t1() {
        Scanner scan = new Scanner(System.in);

        while(true) {
            label27:
            while(true) {
                System.out.println("------------------------------");
                System.out.println("What type of number should be used?");
                System.out.println("1. Int");
                System.out.println("2. Double");
                System.out.println("3. Leave");
                int opt = scan.nextInt();
                int opt2 = 0;
                double ad;
                double bd;
                int resint;
                double resd;
                switch (opt) {
                    case 1:
                        while(true) {
                            if (opt2 == 3) {
                                continue label27;
                            }

                            System.out.println("------------------------------");
                            System.out.println("What type do you want result to be?");
                            System.out.println("1. Int");
                            System.out.println("2. Double");
                            System.out.println("3. Back");
                            opt2 = scan.nextInt();
                            int aint;
                            int bint;
                            switch (opt2) {
                                case 1:
                                    System.out.println("Enter a: ");
                                    aint = scan.nextInt();
                                    System.out.println("Enter b: ");
                                    bint = scan.nextInt();
                                    resint = aint+(aint+bint-1)/((aint)*(aint)+2)-(aint*bint)*(aint*bint)*(aint*bint);
                                    System.out.println("Result: " + resint);
                                    break;
                                case 2:
                                    System.out.println("Enter a: ");
                                    aint = scan.nextInt();
                                    System.out.println("Enter b: ");
                                    bint = scan.nextInt();
                                    ad = (double)aint;
                                    bd = (double)bint;
                                    resd = ad+(ad+bd-1)/((ad)*(ad)+2)-(ad*bd)*(ad*bd)*(ad*bd);
                                    System.out.println("Result is: " + resd);
                                    break;
                                default:
                                    System.out.println("There is no option for this number");
                            }
                        }
                    case 2:
                        while(opt2 != 3) {
                            System.out.println("------------------------------");
                            System.out.println("What type do you want result to be?");
                            System.out.println("1. Int");
                            System.out.println("2. Double");
                            System.out.println("3. Back");
                            opt2 = scan.nextInt();
                            switch (opt2) {
                                case 1:
                                    System.out.println("Enter a: ");
                                    ad = scan.nextDouble();
                                    System.out.println("Enter b: ");
                                    bd = scan.nextDouble();
                                    resint = (int)(ad+(ad+bd-1)/((ad)*(ad)+2)-(ad*bd)*(ad*bd)*(ad*bd));
                                    System.out.println("Result is: " + resint);
                                    break;
                                case 2:
                                    System.out.println("Enter a: ");
                                    ad = scan.nextDouble();
                                    System.out.println("Enter b: ");
                                    bd = scan.nextDouble();
                                    resd = ad+(ad+bd-1)/((ad)*(ad)+2)-(ad*bd)*(ad*bd)*(ad*bd);
                                    System.out.println("Result is: " + resd);
                                    break;
                                default:
                                    System.out.println("There is no option for this number");
                            }
                        }
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("There is no option for this number");
                }
            }
        }
    }
}