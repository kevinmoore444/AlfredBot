import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "How are you " + name;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "today is " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        return  conversation + ", okay I will";
    }

    
    public String respondBeforeAlexis(String conversation, String name) {
        // YOUR CODE HERE
        return  name + conversation;
    }

    public String goodmorning (String breakfast, String name) {
        Date date = new Date();
        return "Today is" + date + "the breakfast is" + breakfast + "happy birthday" + name;
    }

	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}


