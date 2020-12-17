package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;

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
    public void checkForSKUIDA(){
        Map<String, Integer> SKUid = new HashMap();
        SKUid.put("A", 6);
        Checkout checkoutTest = new Checkout();
        double payableAmt = checkoutTest.processItem(SKUid);
        Assert.assertEquals(260, payableAmt, 0);
    }

    @Test
    public void checkForSKUIDAwithLeftOver(){
        Map<String, Integer> SKUid = new HashMap();
        SKUid.put("A", 5);
        Checkout checkoutTest = new Checkout();
        double payableAmt = checkoutTest.processItem(SKUid);
        Assert.assertEquals(230.0, payableAmt, 0);
    }

    @Test
    public void checkForSKUIDB(){
        Map<String, Integer> SKUid = new HashMap();
        SKUid.put("B", 4);
        Checkout checkoutTest = new Checkout();
        double payableAmt = checkoutTest.processItem(SKUid);
        Assert.assertEquals(90.0, payableAmt, 0);
    }

    @Test
    public void checkForSKUIDBwithleftOver(){
        Map<String, Integer> SKUid = new HashMap();
        SKUid.put("B", 7);
        Checkout checkoutTest = new Checkout();
        double payableAmt = checkoutTest.processItem(SKUid);
        Assert.assertEquals(165.0, payableAmt, 0);
    }

    @Test
    public void checkForSKUIDC(){
        Map<String, Integer> SKUid = new HashMap();
        SKUid.put("C", 4);
        Checkout checkoutTest = new Checkout();
        double payableAmt = checkoutTest.processItem(SKUid);
        Assert.assertEquals(80.0, payableAmt, 0);
    }

    @Test
    public void checkForSKUIdD(){
        Map<String, Integer> SKUid = new HashMap();
        SKUid.put("D", 4);
        Checkout checkoutTest = new Checkout();
        double payableAmt = checkoutTest.processItem(SKUid);
        Assert.assertEquals(60.0, payableAmt, 0);
    }

    @Test
    public void checkForSKUIDwithDgreaterThanC(){
        Map<String, Integer> SKUid = new HashMap();
        SKUid.put("C", 3);
        SKUid.put("D", 4);
        Checkout checkoutTest = new Checkout();
        double payableAmt = checkoutTest.processItem(SKUid);
        Assert.assertEquals(105.0, payableAmt, 0);
    }

    @Test
    public void checkForSKUIDwithCgreaterThanD(){
        Map<String, Integer> SKUid = new HashMap();
        SKUid.put("C", 4);
        SKUid.put("D", 3);
        Checkout checkoutTest = new Checkout();
        double payableAmt = checkoutTest.processItem(SKUid);
        Assert.assertEquals(110.0, payableAmt, 0);
    }

    @Test
    public void checkForSKUIDABC(){
        Map<String, Integer> SKUid = new HashMap();
        SKUid.put("A", 5);
        SKUid.put("B", 5);
        SKUid.put("C", 1);
        Checkout checkoutTest = new Checkout();
        double payableAmt = checkoutTest.processItem(SKUid);
        Assert.assertEquals(370.0, payableAmt, 0);
    }

    @Test
    public void checkForSKUIDABD(){
        Map<String, Integer> SKUid = new HashMap();
        SKUid.put("A", 5);
        SKUid.put("B", 5);
        SKUid.put("D", 3);
        Checkout checkoutTest = new Checkout();
        double payableAmt = checkoutTest.processItem(SKUid);
        Assert.assertEquals(395.0, payableAmt, 0);
    }

    @Test
    public void checkForSKUIDABCD(){
        Map<String, Integer> SKUid = new HashMap();
        SKUid.put("A", 5);
        SKUid.put("B", 5);
        SKUid.put("C", 1);
        SKUid.put("D", 1);
        Checkout checkoutTest = new Checkout();
        double payableAmt = checkoutTest.processItem(SKUid);
        Assert.assertEquals(380.0, payableAmt, 0);
    }

    @Test
    public void checkForSKUIDABCDwithLeftOverCorD(){
        Map<String, Integer> SKUid = new HashMap();
        SKUid.put("A", 5);
        SKUid.put("B", 5);
        SKUid.put("C", 2);
        SKUid.put("D", 1);
        Checkout checkoutTest = new Checkout();
        double payableAmt = checkoutTest.processItem(SKUid);
        Assert.assertEquals(400.0, payableAmt, 0);
    }

}
