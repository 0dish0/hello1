package myapp1;

import org.testng.assert;
import org.testng.annotations.test;

public class ResultTest {

    @Test
    public void TestPass() {
        Assert.assertEquals("pass", Result.Display(55),"pass");
    }
    
    @Test
    public void TestFail() {
        Assert.assertEquals("fail", Result.Display(35), "fail");
    }
    
    @Test
    public void TestInvalid() {
        Assert.assertEquals("Invalid", Result.Display(-5), "Invalid");
    }
}