import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.TextField;
public class Randomiser
{
    static Randomiser ob = new Randomiser ();
    final String lexicon =  "0123456789ABCDEF";
    static final String lex ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz12345674890!@#";
    static final java.util.Random rand = new java.util.Random();
    static final Set<String> identifiers2 = new HashSet<String>();
    // consider using a Map<String,Boolean> to say whether the identifier is being used or not 
    final Set<String> identifiers = new HashSet<String>();
    public  String randomIdentifier() {
        StringBuilder builder = new StringBuilder();
        while(builder.toString().length() == 0) {
            int length = 8;
            for(int i = 0; i < length; i++) {
                builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
            }
            if(identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        return builder.toString();
    }
    
    public  String randomIdentifier2() {
        StringBuilder builder = new StringBuilder();
        while(builder.toString().length() == 0) {
            int length = rand.nextInt(2147483647);
            for(int i = 0; i < length; i++) {
                builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
            }
            if(identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        return builder.toString();
    }

    public static void main()
    { 
        String tableid= ob.randomIdentifier();
        Generator.main(tableid);

    }

    public static void test()
    {
        int i ;
        JFrame F = new JFrame();
            JOptionPane.showMessageDialog(F, "Are you sure?.","Alert",JOptionPane.WARNING_MESSAGE);
            String A[] = new String[99999];
        for (i = 0; i <= 9999999; i++)
        {
            String ids= ob.randomIdentifier2();
            A[i]= ids;
            System.out.println(ids + "         ");
            System.out.println(ids + "         ");
            System.out.println(ids + "         ");
            System.out.println(ids + "         ");
            System.out.println(ids + "         ");
            System.out.println(ids + "         ");
            System.out.println(ids + "         ");
            System.out.println(ids + "         ");
            System.out.println(ids + "         ");
            System.out.println(ids + "         ");
            System.out.println(ids + "         ");
            System.out.println(ids + "         ");

        }
    }
    public static String Captia()
    {
        StringBuilder builder = new StringBuilder();
        while(builder.toString().length() == 0) {
            int length = rand.nextInt(5)+5;
            for(int i = 0; i < length; i++) {
                builder.append(lex.charAt(rand.nextInt(lex.length())));
            }
            if(identifiers2.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        return builder.toString() ;
    }
}
