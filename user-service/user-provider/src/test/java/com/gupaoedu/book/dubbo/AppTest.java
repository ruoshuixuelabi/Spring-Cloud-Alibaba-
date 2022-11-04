package com.gupaoedu.book.dubbo;


import com.gupaoedu.book.dubbo.spi.Driver;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void connectTest(){
        ExtensionLoader<Driver> extensionLoader=ExtensionLoader.getExtensionLoader(Driver.class);
        Driver driver=extensionLoader.getExtension("mysqlDriver");
        System.out.println(driver.connect());
    }
}
