package app1;

public class LaunchCalc
{
    public static void main(String[] args)
    {
        Calc cal = new Calc();

        int num1 = 10;
        int num2 = 5;

        int actualResult = cal.divide(num1 , num2);

        int expectedResult = 2;

        if(actualResult == expectedResult)
        {
            System.out.println("Test is Passed");
        }
        else{
            System.out.println("Test Failed");
        }
    }
}
