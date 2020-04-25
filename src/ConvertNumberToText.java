import java.util.Scanner;

public class ConvertNumberToText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = sc.nextInt();
        String textOnes ="";
        String textTens ="";
        String textHundreds ="";
        int ones =0,tens =0,hundreds=0;
        if (number>0 && number<10){
            ones = number;
        }
        if (number>=10 && number<20){
            tens =number%10;
        }
        if (number>=20 && number<100){
            tens = number/10;
            ones = number%10;
        }
        if (number>=100 && number<1000){
            hundreds = number/100;
            if (number%100>=10){
                tens = (number%100)/10;
                ones = (number%100)%10;
            } else {ones = number%100;}
        }


        switch (ones){
            case 1:
                textOnes = "one";
                break;
            case 2:
                textOnes = "two";
                break;
            case 3:
                textOnes = "three";
                break;
            case 4:
                textOnes = "four";
                break;
            case 5 :
                textOnes = "five";
                break;
            case 6:
                textOnes = "six";
                break;
            case 7 :
                textOnes = "seven";
                break;
            case 8:
                textOnes = "eight";
                break;
            case 9:
                textOnes = " nine";
                break;
            default:
                textOnes ="";
        }
        switch (tens){
            case 1:
                textTens = "ten";
                break;
            case 2:
                textTens = "twen";
                break;
            case 3:
                textTens = "thir";
                break;
            case 4:
                textTens = "four";
                break;
            case 5 :
                textTens = "fif";
                break;
            case 6:
                textTens = "six";
                break;
            case 7 :
                textTens = "seven";
                break;
            case 8:
                textTens = "eigh";
                break;
            case 9:
                textTens = " nine";
                break;
            default:
                textTens ="";
        }
        switch (hundreds){
            case 1:
                textHundreds = "one";
                break;
            case 2:
                textHundreds = "two";
                break;
            case 3:
                textHundreds = "three";
                break;
            case 4:
                textHundreds = "four";
                break;
            case 5 :
                textHundreds = "five";
                break;
            case 6:
                textHundreds = "six";
                break;
            case 7 :
                textHundreds = "seven";
                break;
            case 8:
                textHundreds = "eight";
                break;
            case 9:
                textHundreds = " nine";
                break;
            default:
                textHundreds ="";
        }
        if (number>0 && number<10){
            System.out.printf("%d is %s",number,textOnes);
        }
        if (number==10){System.out.printf("%d is ten",number);}
        if (number==11){System.out.printf("%d is eleven",number);}
        if (number==12){System.out.printf("%d is twelve",number);}
        if (number>12 && number<20){
            System.out.printf("%d is %steen",number,textTens);
        }
        if (number>=20 && number < 100){
            System.out.printf("%d is %sty %s",number,textTens,textOnes);
        }
        if (number>=100 && number<1000){
            if (number%100==11){System.out.printf("%d is %shundred and eleven",number,textHundreds);}
            if (number%100==12){System.out.printf("%d is %shundred and twelve",number,textHundreds);}
            if (number%100==13){System.out.printf("%d is %shundred and thirteen",number,textHundreds);}
            if (number%100==14){System.out.printf("%d is %shundred and fourteen",number,textHundreds);}
            if (number%100==15){System.out.printf("%d is %shundred and fifteen",number,textHundreds);}
            if (number%100==16){System.out.printf("%d is %shundred and sixteen",number,textHundreds);}
            if (number%100==17){System.out.printf("%d is %shundred and seventeen",number,textHundreds);}
            if (number%100==18){System.out.printf("%d is %shundred and eighteen",number,textHundreds);}
            if (number%100==19){System.out.printf("%d is %shundred and nineteen",number,textHundreds);}
            if (number%100>=20){System.out.printf("%d is %shundred %sty %s",number,textHundreds,textTens,textOnes);}
            if (number%100<11){System.out.printf("%d is %shundred and %s %s",number,textHundreds,textTens,textOnes);}

        }


    }
}
