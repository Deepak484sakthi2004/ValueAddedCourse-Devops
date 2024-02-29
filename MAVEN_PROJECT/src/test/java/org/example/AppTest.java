package org.example;
import org.example.Main ;
import org.testng.Assert;
public class AppTest {
    public void loginTest1()
    {

        Main  myapp = new Main();
        Assert.assertEquals(0,myapp.login("asdwf","sdsdv"));

    }
    public void loginTest2()
    {
        Main  myapp = new Main();
        Assert.assertEquals(1,myapp.login("Deepaksakthi","12345"));

    }
}
