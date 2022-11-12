import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
//        System.out.print("*****\n");
//        System.out.print(" " + " " + " " + "*\n");
//        System.out.print(" " + " " + "*\n");
//        System.out.print(" " + "*\n");
//        System.out.print("***** ");

//        System.out.println("*****");
//        System.out.println("   *");
//        System.out.println("  *");
//        System.out.println(" *");
//        System.out.println("*****");

//        Scanner sc = new Scanner(System.in);
//        int marks = sc.nextInt();
//
//        if(marks > 90){
//            System.out.println("Excellent");
//        }
//        else if(marks > 80){
//            System.out.println("good");
//        }
//        else if(marks > 70){
//            System.out.println("fair");
//        }
//        else if(marks >60){
//            System.out.println("meets expectations");
//        }
//        else{
//            System.out.println("below pass");
//        }
//
//        int x =0 ;
//        while(x <= 9){
//            System.out.println(x);
//            x++;
//        }
//        System.out.println("DONE");

//        Scanner scn = new Scanner(System.in);
//        int a = Integer.parseInt(scn.nextLine());
//        String b = scn.nextLine();
//        System.out.println("Dear "+ b);
//        for(int i=0; i<=a; i++){
//            System.out.println(i);
//        }
//        Scanner scn = new Scanner(System.in);
//        int t = scn.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = scn.nextInt();
//            int count = 0;
//            /*  reducing time complexity  =*/
//            for (int div = 2; div * div <= n; div++) {
//
//                // for (int div = 1; div <= n; div++) {
//                if (n % div == 0) {
//                    count++;
//                    break;
//                }
//            }
//            if (count == 0) {
//                System.out.println("prime");
//            } else {
//                System.out.println("not prime");
//            }
//        }

//        Scanner scn = new Scanner(System.in);
//        int low = scn.nextInt();
//        int high = scn.nextInt();
//        for (int i = low; i <= high; i++) {
//            int count =0;
//            for(int div =2;div*div<=i;div++){
//                if(i % div ==0){
//                    count ++;
//                    break;
//                }
//            }
//            if(count ==0) {
//                System.out.println(i);
//            }
//        }
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        for (int i = 1; i <= n; i++) {
//            int temp = b + a;
//            a = b;
//            b = temp;
//            System.out.println(b);
//
//
//
//        }
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int count =0;
//        while(a != 0){
//            a /= 10;
//            count++;
//        }
//        System.out.println(count);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int dig =0;
        while(a !=0){
            a /=10;
            dig++;
        }
    }
}