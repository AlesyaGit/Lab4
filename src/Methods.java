import java.util.Scanner;

public class Methods {

    int UserInput;

    int num1;

    int num2;

    int result;

    void AMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the system:");
        System.out.println("1. Binary");
        System.out.println("2. Hexadecimal");

        UserInput = scanner.nextInt();

        switch (UserInput){
            case 1 :
                System.out.println("Enter a binary number:");
                String binary = scanner.next();
                int FromBinaryToDecimal = Integer.parseInt(binary,2);
                System.out.println("Result(decimal system): "+ FromBinaryToDecimal);
                break;
            case 2:
                System.out.println("Enter a hexadecimal number:");
                String hexa = scanner.next();
                int FromHexaToDecimal = Integer.parseInt(hexa,16);
                System.out.println("Result(decimal system): "+ FromHexaToDecimal);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    void BMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the system:");
        System.out.println("1. Decimal to binary");
        System.out.println("2. Decimal to hexadecimal");

        UserInput = scanner.nextInt();

        switch (UserInput){
            case 1 :
                System.out.println("Enter a decimal number:");
                int opt1 = scanner.nextInt();
                String ToBinary = Integer.toBinaryString(opt1);
                System.out.println("Result(Binary): "+ ToBinary);
                break;
            case 2:
                System.out.println("Enter a decimal number:");
                int opt2 = scanner.nextInt();
                String ToHexa = Integer.toHexString(opt2);
                System.out.println("Result(Hexadecimal): "+ ToHexa);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    void CMethod(){

      Scanner scanner = new Scanner(System.in);
      System.out.println("Choose the system:");
      System.out.println("1. Binary");
      System.out.println("2. Hexadecimal");

      UserInput = scanner.nextInt();

      switch (UserInput){

          case 1:
              System.out.println("Enter the first number:");
              String binary1 = scanner.next();
              num1 = Integer.parseInt(binary1,2);
              System.out.println("Enter the second number:");
              String binary2 = scanner.next();
              num2 = Integer.parseInt(binary2,2);

              System.out.println("Calculating...");

              result = num1 + num2;
              String BinaryResult = Integer.toBinaryString(result);

              System.out.println("The result of summing up is " + BinaryResult);
              break;

          case 2:

              System.out.println("Enter the first number:");
              String hexa1 = scanner.next();
              num1 = Integer.parseInt(hexa1,16);
              System.out.println("Enter the second number:");
              String hexa2 = scanner.next();
              num2 = Integer.parseInt(hexa2,16);

              System.out.println("Calculating...");

              result = num1 + num2;
              String HexResult = Integer.toHexString(result);

              System.out.println("The result of summing up is " + HexResult);
              break;

          default:
              System.out.println("Error");


      }
    }

    void DMethod(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the system:");
        System.out.println("1. Binary");
        System.out.println("2. Hexadecimal");

        UserInput = scanner.nextInt();

        switch (UserInput) {

            case 1:
                System.out.println("Enter the first number:");
                String binary1 = scanner.next();
                num1 = Integer.parseInt(binary1, 2);
                System.out.println("Enter the second number:");
                String binary2 = scanner.next();
                num2 = Integer.parseInt(binary2, 2);

                System.out.println("Calculating...");

                result = num1 - num2;
                String BinaryResult = Integer.toBinaryString(result);

                System.out.println("The result of subtraction is " + BinaryResult);

                break;

            case 2:

                System.out.println("Enter the first number:");
                String hexa1 = scanner.next();
                num1 = Integer.parseInt(hexa1, 16);
                System.out.println("Enter the second number:");
                String hexa2 = scanner.next();
                num2 = Integer.parseInt(hexa2, 16);

                System.out.println("Calculating...");

                result = num1 + num2;
                String HexResult = Integer.toHexString(result);

                System.out.println("The result of subtraction is " + HexResult);

                break;

            default:

                System.out.println("Error");


        }
    }

    void EMethod() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the system:");
        System.out.println("1. Binary");
        System.out.println("2. Hexadecimal");

        UserInput = scanner.nextInt();

        switch (UserInput) {

            case 1:
                System.out.println("Enter the first number:");
                String binary1 = scanner.next();
                num1 = Integer.parseInt(binary1, 2);
                System.out.println("Enter the second number:");
                String binary2 = scanner.next();
                num2 = Integer.parseInt(binary2, 2);

                System.out.println("Calculating...");

                result = num1 * num2;
                String BinaryResult = Integer.toBinaryString(result);

                System.out.println("The result of multiplying is " + BinaryResult);

                break;

            case 2:

                System.out.println("Enter the first number:");
                String hexa1 = scanner.next();
                num1 = Integer.parseInt(hexa1, 16);
                System.out.println("Enter the second number:");
                String hexa2 = scanner.next();
                num2 = Integer.parseInt(hexa2, 16);

                System.out.println("Calculating...");

                result = num1 * num2;
                String HexResult = Integer.toHexString(result);

                System.out.println("The result of multiplying " + HexResult);

                break;

            default:

                System.out.println("Error");


        }
    }

    void FMethod() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the system:");
        System.out.println("1. Binary");
        System.out.println("2. Hexadecimal");

        UserInput = scanner.nextInt();

        switch (UserInput) {

            case 1:
                System.out.println("Enter the first number:");
                String binary1 = scanner.next();
                num1 = Integer.parseInt(binary1, 2);
                System.out.println("Enter the second number:");
                String binary2 = scanner.next();
                num2 = Integer.parseInt(binary2, 2);

                System.out.println("Calculating...");

                result = num1 / num2;
                String BinaryResult = Integer.toBinaryString(result);

                System.out.println("The result of dividing is " + BinaryResult);

                break;

            case 2:

                System.out.println("Enter the first number:");
                String hexa1 = scanner.next();
                num1 = Integer.parseInt(hexa1, 16);
                System.out.println("Enter the second number:");
                String hexa2 = scanner.next();
                num2 = Integer.parseInt(hexa2, 16);

                System.out.println("Calculating...");

                result = num1 / num2;
                String HexResult = Integer.toHexString(result);

                System.out.println("The result of dividing " + HexResult);

                break;

            default:

                System.out.println("Error");

        }
    }
}


