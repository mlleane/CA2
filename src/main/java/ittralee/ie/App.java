//package com.bsu;
package ittralee.ie;
//added 3rd line
//newline
//added line 5
//added line 6
//addedline7
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        String str;
        char op=' ';
        int state = 0;

        try{
            System.out.println("1 number:");
            String a1 = sc.readLine();
            a = Integer.parseInt(a1);

            System.out.println("operator:");
            String op1 = sc.readLine();
            op = op1.charAt(0);

            System.out.println("2 number:");
            String a2 = sc.readLine();
            b = Integer.parseInt(a2);

        }
        catch (Exception e){
            System.out.println(" something went wrong((");
            System.exit(0);
        }

        System.out.print(a + " " + op + " " + b + " " + "=");

        System.out.print(calculate(a, b, op));

    }

    public static double calculate(double a, double b, char op){

        try{
            switch(op){
                case '+':{
                    return a+b;
                }
                case '-':{
                    return a-b;
                }
                case '*':{
                    return a*b;
                }
                case '/':{
                    if(b != 0){
                        return a/b;
                    }
                    else{
                        throw new Exception();
                    }
                }
                default: throw new Exception();
            }

        }
        catch(Exception e){
            System.out.println(" something went wrong((");
            return -5384;
        }
    }
}
