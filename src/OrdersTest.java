
import static org.junit.Assert.*;
import org.junit.Test;
//import Orders.ShippingMethod;


public class OrdersTest {
	
	@Test
    public void testCalculateTotalSalesTaxILNextDay() {
       
        float testVal1 = Orders.calculateTotal(30.0f, Orders.ShippingMethod.NextDay, "IL");
        float actual = 58.29f;
       
        assertEquals(actual, testVal1, delta);
    }
   
   
       @Test
       public void testCalculateTotalSalesTaxILStandard() {
          
           float testVal1 = Orders.calculateTotal(30.0f, Orders.ShippingMethod.Standard, "IL");
           float actual = 42.40f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       
       @Test
       public void testCalculateTotalSalesTaxIllinoisNextDay() {
          
           float testVal1 = Orders.calculateTotal(30.0f, Orders.ShippingMethod.NextDay, "Illinios");
           float actual = 58.29f;
          
           assertEquals(actual, testVal1, delta);
       }
       
       @Test
       public void testCalculateTotalSalesTaxIllinoisStandard() {
          
           float testVal1 = Orders.calculateTotal(30.0f, Orders.ShippingMethod.Standard, "Illinios");
           float actual = 42.40f;
          
           assertEquals(actual, testVal1, delta);
       }
      
      
       @Test
       public void testCalculateTotalSalesTaxNewYorkStandard() {
          
           float testVal1 = Orders.calculateTotal(30.0f, Orders.ShippingMethod.Standard, "New York");
           float actual = 42.40f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test
       public void testCalculateTotalSalesTaxNewYorkNextDay() {
          
           float testVal1 = Orders.calculateTotal(30.0f, Orders.ShippingMethod.NextDay, "New York");
           float actual = 58.29f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test
       public void testCalculateTotalSalesTaxCAStandard() {
          
           float testVal1 = Orders.calculateTotal(30.0f, Orders.ShippingMethod.Standard, "CA");
           float actual = 42.40f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test
       public void testCalculateTotalSalesTaxCACNextDay() {
          
           float testVal1 = Orders.calculateTotal(30.0f, Orders.ShippingMethod.NextDay, "CA");
           float actual = 58.29f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test
       public void testCalculateTotalSalesTaxCaliforniaStandard() {
          
           float testVal1 = Orders.calculateTotal(30.0f, Orders.ShippingMethod.Standard, "California");
           float actual = 42.40f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test
       public void testCalculateTotalSalesTaxCaliforniaCNextDay() {
          
           float testVal1 = Orders.calculateTotal(30.0f, Orders.ShippingMethod.NextDay, "California");
           float actual = 58.29f;
          
           assertEquals(actual, testVal1, delta);
       }
       
       @Test
       public void testCalculateTotalSalesTaxNYStandard() {
          
           float testVal1 = Orders.calculateTotal(30.0f, Orders.ShippingMethod.Standard, "NY");
           float actual = 42.40f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test
       public void testCalculateTotalSalesTaxNYNextDay() {
          
           float testVal1 = Orders.calculateTotal(30.0f, Orders.ShippingMethod.NextDay, "NY");
           float actual = 58.29f;
          
           assertEquals(actual, testVal1, delta);
       }
      
      
       @Test
       public void testCalculateTotalAnyStateStandard() {
          
           float testVal1 = Orders.calculateTotal(30.0f, Orders.ShippingMethod.Standard, "WA");
           float actual = 40.00f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test
       public void testCalculateTotalAnyStateNextDay() {
          
           float testVal1 = Orders.calculateTotal(30.0f, Orders.ShippingMethod.NextDay, "MA");
           float actual = 55.00f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test
       public void testCalculateTotalAnyStateNextDay2() {
          
           float testVal1 = Orders.calculateTotal(60.0f, Orders.ShippingMethod.NextDay, "MA");
           float actual = 85.00f;
          
           assertEquals(actual, testVal1, delta);
       }
      

       @Test(expected=IllegalArgumentException.class)
       public void testCalculateTotalIsZero() {
          
           float testVal1 = Orders.calculateTotal(0.0f, Orders.ShippingMethod.Standard, "OR");
           float actual = 40.00f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test(expected=IllegalArgumentException.class)
       public void testCalculateTotalNegativeValue() {
          
           float testVal1 = Orders.calculateTotal(-30.0f, Orders.ShippingMethod.NextDay, "OR");
           float actual = 55.00f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test(expected=IllegalArgumentException.class)
       public void testCalculateTotalEmptyString() {
          
           float testVal1 = Orders.calculateTotal(40.0f, Orders.ShippingMethod.NextDay, "");
           float actual = 55.00f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test(expected=IllegalArgumentException.class)
       public void testCalculateTotalEmptyString2() {
          
           float testVal1 = Orders.calculateTotal(40.0f, Orders.ShippingMethod.NextDay, " ");
           float actual = 55.00f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test(expected=IllegalArgumentException.class)
       public void testCalculateTotalNullString() {
          
           float testVal1 = Orders.calculateTotal(30.0f, Orders.ShippingMethod.NextDay, null);
           float actual = 55.00f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test(expected=IllegalArgumentException.class)
       public void testCalculateTotalUSTerritory() {
          
           float testVal1 = Orders.calculateTotal(30.0f, Orders.ShippingMethod.NextDay, "Guam");
           float actual = 55.00f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test(expected=IllegalArgumentException.class)
       public void testCalculateTotalInvalidState() {
          
           float testVal1 = Orders.calculateTotal(30.0f, Orders.ShippingMethod.NextDay, "thishouldnotwork");
           float actual = 55.00f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test(expected=IllegalArgumentException.class)
       public void testCalculateTotalPositiveInfinity() {
          
           float testVal1 = Orders.calculateTotal(Float.POSITIVE_INFINITY, Orders.ShippingMethod.NextDay, "WA");
           float actual = Float.POSITIVE_INFINITY;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test(expected=IllegalArgumentException.class)
       public void testCalculateTotalNegativeInfinity() {
          
           float testVal1 = Orders.calculateTotal(Float.NEGATIVE_INFINITY, Orders.ShippingMethod.NextDay, "WA");
           float actual = Float.NEGATIVE_INFINITY;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test(expected=IllegalArgumentException.class)
       public void testCalculateTotalNaN() {
          
           float testVal1 = Orders.calculateTotal(30.0f/0.0f, Orders.ShippingMethod.NextDay, "WA");
           float actual = Float.POSITIVE_INFINITY;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test(expected=IllegalArgumentException.class)
      public void testCalculateTotalMaxValue() {  
           float testVal1 = Orders.calculateTotal(Float.MAX_VALUE, Orders.ShippingMethod.NextDay, "WA");
           float actual = Float.MAX_VALUE;
           
           assertEquals(actual, testVal1, delta);
       }
      
      
       @Test(expected=IllegalArgumentException.class)
       public void testCalculateTotalMinValue() {
          
           float testVal1 = Orders.calculateTotal(Float.MIN_VALUE, Orders.ShippingMethod.Standard, "WA");
           float actual = Float.MIN_VALUE+10.0f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test(expected=IllegalArgumentException.class)
       public void testCalculateTotalCheckForOverflow() {
          
           float testVal1 = Orders.calculateTotal(Float.MAX_VALUE+10.0f, Orders.ShippingMethod.Standard, "WA");
           float actual = Float.MAX_VALUE+10.0f+10.0f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test(expected=IllegalArgumentException.class)
       public void testCalculateTotalCheckForUnderflow() {
          
           float testVal1 = Orders.calculateTotal(Float.MIN_VALUE-10.0f, Orders.ShippingMethod.Standard, "WA");
           float actual = Float.MIN_NORMAL+10.0f+10.0f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       //Edge conditions
       @Test
       public void testCalculateTotalEdgeCaseIL() {
          
           float testVal1 = Orders.calculateTotal(50.01f, Orders.ShippingMethod.Standard, "IL");
           float actual = 53.01f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test
       public void testCalculateTotalEdgeCaseIllinois() {
          
           float testVal1 = Orders.calculateTotal(50.01f, Orders.ShippingMethod.NextDay, "Illinios");
           float actual = 79.51f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test
       public void testCalculateTotalEdgeCaseIllinois2() {
          
           float testVal1 = Orders.calculateTotal(50.01f, Orders.ShippingMethod.Standard, "Illinios");
           float actual = 53.01f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test
       public void testCalculateTotalEdgeCaseIllinois3() {
          
           float testVal1 = Orders.calculateTotal(49.99f, Orders.ShippingMethod.NextDay, "Illinios");
           float actual = 79.48f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test
       public void testCalculateTotalEdgeCaseIllinois4() {
          
           float testVal1 = Orders.calculateTotal(49.99f, Orders.ShippingMethod.Standard, "Illinios");
           float actual = 63.58f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test
       public void testCalculateTotalEdgeCaseCA() {
          
           float testVal1 = Orders.calculateTotal(50.01f, Orders.ShippingMethod.Standard, "CA");
           float actual = 53.01f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test
       public void testCalculateTotalEdgeCaseCalifornia() {
          
           float testVal1 = Orders.calculateTotal(50.01f, Orders.ShippingMethod.Standard, "California");
           float actual = 53.01f;
          
           assertEquals(actual, testVal1, delta);
       }
      
      
       @Test
       public void testCalculateTotalEdgeCaseNY() {
          
           float testVal1 = Orders.calculateTotal(50.01f, Orders.ShippingMethod.Standard, "NY");
           float actual = 53.01f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test
       public void testCalculateTotalEdgeCaseNewYork() {
          
           float testVal1 = Orders.calculateTotal(50.01f, Orders.ShippingMethod.Standard, "New York");
           float actual = 53.01f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test
       public void testCalculateTotalEdgeCaseAnyState() {
          
           float testVal1 = Orders.calculateTotal(50.01f, Orders.ShippingMethod.Standard, "WA");
           float actual = 50.01f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       @Test
       public void testCalculateTotalEdgeCaseAnyState2() {
          
           float testVal1 = Orders.calculateTotal(49.99f, Orders.ShippingMethod.Standard, "WA");
           float actual = 59.99f;
          
           assertEquals(actual, testVal1, delta);
       }
      
       //Data
       private static double delta = 0.01;

}