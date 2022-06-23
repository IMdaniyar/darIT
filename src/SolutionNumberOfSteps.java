package java;

public class SolutionNumberOfSteps
{
    public int numberOfSteps(int num)
    {
        int raz = 0;
        for (raz=0; num > 0; raz++)
            if (num % 2 == 1) num--;
            else num /= 2;
        return raz;
    }
}
