/**
 * Telephone simulates a very basic "old-fashioned" land line
 *
 * @author starter by S. Lord
 * @version updated July 2015
 */

public class TestTelephone {
    public static void main(String [] args)
    {
        Telephone tel1 = new Telephone();
        Telephone tel2 = new Telephone("222-111-3333", "Residential");
        Telephone tel3 = new Telephone(tel2);
        System.out.println("tel1: "+tel1+"\ntel2: "+tel2+"\ntel3: "+tel3);
        System.out.println("tel1 and tel2 are equal: " + tel1.equals(tel2));
        System.out.println("tel2 and tel3 are equal: " + tel2.equals(tel3));
        System.out.println("tel2 and tel3 are aliases: " + (tel2==tel3));

        tel1.callNumber("222-111-3333");
        tel2.ring();
        tel2.answerThePhone();
        String msg = "Hello, this is Sam from ABC computers. Your laptop has been fixed.";
        tel1.speak(msg);
        tel2.receives(msg);
        System.out.println("\nFor testing/debugging:\ntel1: "+tel1+"\ntel2: "+tel2+"\n");
        msg = "Thank you. I'll pick it up this afternoon.";
        tel2.speak(msg);
        tel1.receives(msg);
        tel2.endCall();
        tel1.endCall();
        System.out.println("\nFor testing/debugging:\ntel1: "+tel1+"\ntel2: "+tel2+"\n");
    }
     /*
Output should be:
tel1: Tel: 800-999-5555 of type: Business is busy? false
tel2: Tel: 222-111-3333 of type: Residential is busy? false
tel3: Tel: 222-111-3333 of type: Residential is busy? false
tel1 and tel2 are equal: false
tel2 and tel3 are equal: true
tel2 and tel3 are aliases: false
222-111-3333
Ring Ring
Hello
	tel1 said:
Hello, this is Sam from ABC computers. Your laptop has been fixed.
	tel2 heard:
Hello, this is Sam from ABC computers. Your laptop has been fixed.

For testing/debugging:
tel1: Tel: 800-999-5555 of type: Business is busy? true
tel2: Tel: 222-111-3333 of type: Residential is busy? true

	tel2 said:
Thank you. I'll pick it up this afternoon.
	tel1 heard:
Thank you. I'll pick it up this afternoon.
	tel2 said:
Goodbye
	tel1 said:
Goodbye

For testing/debugging:
tel1: Tel: 800-999-5555 of type: Business is busy? false
tel2: Tel: 222-111-3333 of type: Residential is busy? false

*/
}
