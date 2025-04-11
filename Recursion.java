import java.util.*;

public class Recursion {
    public static void main(String[] args) {
        int n = 5;
        int sum = 1;
        int i = 0;
        int a = 2;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        Recursion obj = new Recursion();
        // obj.printRecu(n, i, sum);
        // obj.fibSeries(a,b,n);//
        
        // System.out.println(obj.factCal(n));

        obj.nthTerm(a, n, sum);
        // int s = obj.calcPower(a, n);
        // System.out.println("the nth power value is: "+s);
        
    }

    public void printRecu(int n, int i, int sum) {
        if (i == n) {  // Base case: stop when i reaches 6
            System.out.println(sum);
            return;
        }

        sum += i;  // Add current i to sum
        printRecu(n, i + 1, sum);  // Recursive call with i incremented
        System.out.println(i);
    }


public int factCal(int n){
    if(n==0 || n==1){
        return 1;
    }

    int fact_fun1 = (factCal(n-1));
    int fact = n*fact_fun1;
    System.out.println(fact);
    return fact;
}

///
public int factCal1(int n){
if(n==0 || n==1){
    return 1;
}

int fact_fun1 = (factCal1(n-1));
return n*fact_fun1;


}

public void fibSeries(int a, int b, int n){
    if(n==0){
        return;
    }
    int c = a+b;
    System.out.println("fibunachi series: ");
    System.out.println(c);
    fibSeries(b,c,n-2);//we are passing b as a and c as b here for getting next value sum;
    // passed n-2 because i have already printed first value "a" and the second value "b" in the main method itself so 
    // n-2;
}

public void nthTerm(int a,int n,int su1){
    if(n==0){
        return;
    }
    su1*=a;
    System.out.println("the product of the nth term is: "+su1);
    nthTerm(a,n-1,su1);

}
///
public int calcPower(int a, int n){
    if(a==0){
        return 1;
    }
    if(n==1){
        return 0;
    }
    int xPower1 = calcPower(a, n-1);
    int xpow = a*xPower1;
    return xpow;
}

// using log size;
public int calcPower1(int a, int n) {
    if (n == 0) {
        return 1; // Base case: anything raised to power 0 is 1
    }
    if (a == 1) {
        return 1; // Fix: Return 1 instead of 0
    }

    int halfPower = calcPower1(a, n / 2); // Store the result to avoid redundant calls

    if (n % 2 == 0) {
        return halfPower * halfPower;
    } else {
        return halfPower * halfPower * a;
    }
}

}

