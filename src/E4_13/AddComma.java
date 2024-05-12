package E4_13;

import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

public class AddComma {
        public String number;
        public int j = 1;
        public AddComma() {
            scan();
        }
        public void scan() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a number: ");
            number = scan.nextLine();
        }
        public String withComma() {
            String finalNumber=" ";
            for (int i = number.length()-1; i >= 0 ; i--) {
               finalNumber = finalNumber + number.charAt(i);
                if(j==3)finalNumber = finalNumber + ',';
                j++;
               if(j==4) j = 1;

            }
            String Ans=" ";
            for(int i=finalNumber.length()-1;i>=0;i--){
                Ans = Ans + finalNumber.charAt(i);
            }
            return Ans;
        }

    }


