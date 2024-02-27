package exampleTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.ExampleMethod;

public class ExampleTestClass {
    @Test
    public void TestCaseOne(){
        String a = "Hello";
        String b = "Hello";
        Assert.assertEquals(ExampleMethod.concat(a,b), "Hello Hello");
    }
}
