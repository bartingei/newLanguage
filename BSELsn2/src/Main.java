import javax.swing.JOptionPane;
public class Main{
    private static long bigNum;     //instance variable - has many instances
    private static float staticNum;    //class variable - has only one instance
    public static void main(String[] args){
        String user, holder;
        Short  num1;
        long num2;
        int resulta;
        //taking input
        user = JOptionPane.showInputDialog("Enter your name");
        holder = JOptionPane.showInputDialog(user + " What is your lucky number? ");
        // when we intend to add two integers use the parseDataType method since using the showInputDialog() returns string for all inputs
        num1 = Short.parseShort(holder);
        //type casting, coonverting string to a short
        num2 = Integer.parseInt(JOptionPane.showInputDialog(user + " Enter your unlucky number"));
        result = num1 + num2;
        // to display the message
        JOptionPane.showMessageDialog(null, user + " ,your neutral number is "+ result);
        //calling the first method
        //since the preceding class is not a static class i.e. instance class, we need to create an object for it that's why we use the new constructor
        Main obj = new Main();
        obj.setNumbers();
    }
    public void setNumbers(){     //if we remove static, we make this method an instance method
        bigNum = Long.parseLong(JOptionPane.showInputDialog("enter a large number"));
        staticNum = Float.parseFloat(JOptionPane.showInputDialog("Enter a number with decimal place"));
        JOptionPane.showMessageDialog(null, "Your numbers were captured");
    }
}