package org.example;

public class AssertThrows
{

    public int divide(int a, int b)
    {
        return a / b;
    }

    public void checkAge(int age)
    {
        if (age < 18)
        {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
    }
}