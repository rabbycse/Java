public class StringBuilder {
 
 
    public static void main(String[] args) {
         
        // Inefficient
        String info = "";
         
        info += "My name is Rabby.";
        info += " ";
        info += "I am a Programmer.";
         
        System.out.println(info);
         
        // More efficient.
        StringBuilder sb = new StringBuilder("");
         
        sb.append("My name is Bob.");
        sb.append(" ");
        sb.append("I am a lion tamer.");
         
        System.out.println(sb.toString());
         
        // The same as above, but nicer ....
         
        StringBuilder s = new StringBuilder();
         
        s.append("My name is Gaus.")
        .append(" ")
        .append("I am a skydiver.");
         
        System.out.println(s.toString());
         
        System.out.print("Here is some text.\tThat was a tab.\nThat was a newline.");
        System.out.println(" More text.");
         
        System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
         
        for(int i=0; i<20; i++) {
            System.out.printf("%-2d: %s\n", i, "here is some text");
        }
         
        System.out.printf("Total value: %.2f\n", 5.6874);
         
        // One decimal place, left-aligned in 6-character field:
        System.out.printf("Total value: %-6.1f\n", 343.23423);
         
        // You can also use the String.format() method if you want to retrieve
        // a formatted string.
        String formatted = String.format("This is a floating-point value: %.3f", 5.12345);
        System.out.println(formatted);
         
        // Use double %% for outputting a % sign.
        System.out.printf("Giving it %d%% is physically impossible.", 100);
    }
 
}
