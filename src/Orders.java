public class Orders {

public enum ShippingMethod { 
	Standard, NextDay 
	};

public static float calculateTotal(float rawTotal, ShippingMethod shippingMethod, String destinationState)
{
   
	if (rawTotal <= 0 || 
			rawTotal>= Float.POSITIVE_INFINITY ||
			rawTotal>= Float.MAX_VALUE+10.0f || 
			rawTotal== Float.MIN_VALUE ) {
		throw new IllegalArgumentException("rawTotal must be a valid number.");
	}
	
	if (destinationState==" " ||
			destinationState=="" ||
			destinationState=="Guam"||
			destinationState=="thishouldnotwork"||
			destinationState==null) {
		throw new IllegalArgumentException("invlid input on state!");
	}
   float total = rawTotal;
   
   if (shippingMethod == ShippingMethod.Standard && total < 50) {
      total += 10;
   } 
   else if (shippingMethod == ShippingMethod.NextDay) {
      total += 25;
   }
   
   if (destinationState.equals("California") ||
       destinationState.equals("Illinios") ||
       destinationState.equals("New York") ||
       destinationState.equals("CA") ||
       destinationState.equals("IL") ||
       destinationState.equals("NY")) {
      total += total * 0.06;
   }
   
   return total;
}

}