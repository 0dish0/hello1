package myapp1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ResultTest {

    @Test
    public void TestPass() {
        Assert.assertEquals(Result.Display(55), "pass");
    }
    
    @Test
    public void TestFail() {
        Assert.assertEquals(Result.Display(35), "fail");
    }
    
    @Test
    public void TestInvalid() {
        Assert.assertEquals(Result.Display(-5), "Invalid");
    }
}