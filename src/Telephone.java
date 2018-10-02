/**
 * TestTelephone tests the methods of the Telephone class
 * with hard-coded test data
 *
 * @author S. Lord
 * @version updated July 2015
 */

public class Telephone {
    private String myNumber;  // number someone else calls for this phone to ring
    private String accountType;   // Business or Residential
    private boolean lineBusy;   // true if the line is in use

    /**
     * No-args Constructor
     * sets data to 800-999-5555 for Business and the line is not busy)
     */
    public Telephone()
    {
        myNumber = "860-999-5555";
        accountType = "Business";
        lineBusy = false;
    }

    /**
     * 2-args Constructor (line is not busy)
     */
    public Telephone(String num, String type)
    {
        myNumber = num;
        accountType = type;
    }

    /**
     * Copy Constructor using object of Telephone type
     */
    public Telephone(Telephone tel)
    {
        myNumber = tel.getNumber();          // this.myNumber = tel.myNumber;
        accountType = tel.getAccountType();  // this.accountType = tel.accountType;
        lineBusy = tel.getLineBusy();        // this.lineBusy = tel.lineBusy;
    }

    /**
     * Accessor for Telephone Number
     */
    public String getNumber()
    {
        return myNumber;
    }

    /**
     * Accessor for accountType
     */
    public String getAccountType()
    {
        return accountType;
    }

    /**
     * Accessor for lineBusy
     */
    public boolean getLineBusy()
    {
        return lineBusy;
    }

    /**
     * Modifier/Mutator for Telephone Number
     */
    public void setNumber(String num)
    {
        myNumber = num;
    }

    /**
     * Modifier/Mutator for accountType
     */
    public void setAccountType(String type)
    {
        accountType = type;
    }

    /**
     * Modifier/Mutator for lineBusy - make it busy
     */
    public void setLineBusy()
    {
        lineBusy = true;
    }

    /**
     * Modifier/Mutator for lineBusy - make it not busy
     */
    public void setLineNotBusy()
    {
        lineBusy = false;
    }

    /**
     * Telephone rings - just print an appropriate ringing "sound"
     */
    public void ring()
    {
        System.out.println("Ring Ring");
    }

    /**
     * Answer the Telephone - line becomes busy and say "Hello"
     */
    public void answerThePhone()
    {
        lineBusy = true;
        System.out.println("Hello");
    }

    /**
     * End Call - say "Goodbye" and line is not busy
     */
    public void endCall()
    {
        lineBusy = false;
        System.out.println("Goodbye");
    }

    /**
     * print the message that you (listening) will hear
     */
    public void receives(String msg)
    {
        System.out.println(msg);
    }

    /**
     * print the message that you (speaking) will say
     */
    public void speak(String msg)
    {
        System.out.println(msg);
    }

    /**
     * print the phone number that you are calling
     */
    public void callNumber (String num)
    {
        System.out.println(num);
    }

    /**
     * overrides Object's equals(Object) method
     * Note: not checking lineBusy, just the Telephone account info
     */
    public boolean equals (Object obj)
    {
        Telephone other = (Telephone) obj;
        //if(other.myNumber == this.myNumber && ...etc....
        if (other.getNumber() == getNumber()
                && other.getAccountType() == getAccountType())
            return true;
        return false;
    }

    /**
     * overrides Object's toString() - include all instance data
     */
    public String toString()
    {
        return "Tel: " + myNumber + " of type: " + accountType + " is busy? " + lineBusy;
    }

}
