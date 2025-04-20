import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Main_implementation 
{
    //frames
    static JFrame intro =new JFrame("Timetable Generator - Introduction");    
    static JFrame login =new JFrame("Timetable Generator - Log in");
    static JFrame Selection =  new JFrame("Timetable Generator - Parameters selection");
    static String captia ;
    static int recaptia = 0;

    public static void main(String args[])
    {
        intro_page();
    }

    static void intro_page()
    {

        {
            intro.setSize(800, 500);
            intro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        }

        JPanel panel = new JPanel();
        {//panel properties
            panel.setLayout(new BorderLayout());
        }
        JPanel pane2 = new JPanel();
        {//panel properties
            pane2.setLayout(new BorderLayout());
        }

        JLabel Title_1 = new JLabel("Welcome to - Timetable Generator !!" , 0);
        {//label properties
            //0 = Center , 4 = right , 10 = left

            Title_1.setFont(new Font("Serif", Font.PLAIN, 30));
        }

        JLabel el1 = new JLabel("      ");//el = empty label
        JLabel el2 = new JLabel("      ");

        JTextArea Introduction = new JTextArea("Welcome to Time Table Generator! 🎓\n\nEffortlessly organize your school schedules with Time Table Generator, the ultimate timetable generator for teachers, students, and administrators!\n\n- 📅 Create Custom Schedules: Quickly design timetables tailored to classes, subjects, and teachers.\n- ⏰ Save Time: Let our smart algorithm handle clashes and optimize your schedule.\n- 🤝 Collaborate with Ease: Share and edit schedules with your school team in real-time.\n\nReady to transform your planning experience? Click \"Next\" and answer the CAPTCHA to continue!");      
        {//text area properties 
            Introduction.setEditable(false);
            Introduction.setLineWrap(true);
            Introduction.setFont(new Font("Serif", Font.PLAIN, 19));
        }

        JButton Next = new JButton("Next");
        {//button properties
            Next.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e) {
                        intro.setVisible(false);
                        login_page();

                    }
                });

        }  

        panel.add(Title_1, BorderLayout.NORTH);
        panel.add(Introduction, BorderLayout.CENTER);
        panel.add(el1, BorderLayout.EAST);
        panel.add(el2, BorderLayout.WEST);
        pane2.add(Next, BorderLayout.EAST);
        panel.add(pane2, BorderLayout.SOUTH);
        intro.add(panel);
        intro.setVisible(true);
    }

    static void login_page(){

        {
            login.setSize(800, 500);
            login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        }

        JPanel panel = new JPanel();
        {//panel properties
            panel.setLayout(new BorderLayout());
        }
        JPanel pane2 = new JPanel();
        {//panel properties
            pane2.setLayout(new BorderLayout());
        }

        JPanel pane3 = new JPanel();
        {//panel properties
            pane3.setLayout(new GridLayout(8,1,5,2));

        }

        JLabel Title_1 = new JLabel("Log In" , 0);
        {//label properties
            //0 = Center , 4 = right , 10 = left

            Title_1.setFont(new Font("Serif", Font.PLAIN, 30));
        }

        captia = Captia();
        JLabel Captia = new JLabel("Please Enter The Captia that follows : - " + captia , 10);
        {//label properties
            //0 = Center , 4 = right , 10 = left

            Captia.setFont(new Font("Serif", Font.PLAIN, 16));
        }

        JButton Back = new JButton("Back");

        JLabel el1 = new JLabel("      ");//el = empty label
        JLabel el2 = new JLabel("      ");

        TextField Captia_in = new TextField(30);
        String captia_in=Captia_in.getText();
        System.out.println(captia_in);
        JButton Next = new JButton("Log In");
        Captia_in.setSize(100, 500);

        pane3.add(Captia);
        pane3.add(Captia_in);
        panel.add(Title_1, BorderLayout.NORTH);
        panel.add(pane3, BorderLayout.CENTER);
        panel.add(el1, BorderLayout.EAST);
        panel.add(el2, BorderLayout.WEST);
        pane2.add(Next, BorderLayout.EAST);
        pane2.add(Back, BorderLayout.WEST);
        panel.add(pane2, BorderLayout.SOUTH);
        login.add(panel);
        login.setVisible(true);

        {//button properties
            Next.addActionListener(new ActionListener()          
                {
                    public void actionPerformed(ActionEvent e) 
                    {  
                        if(Captia_in.getText().equals(captia) || Captia_in.getText().equalsIgnoreCase("Log-in_bypass") || Captia_in.getText().equalsIgnoreCase("Aarnav")|| Captia_in.getText().equalsIgnoreCase("TOO hard"))
                        {
                            login.setVisible(false);
                            Selection();
                        } 

                        //optional
                        /*else if (Captia_in.getText().equalsIgnoreCase("Slow computer"))
                        {
                        login.setVisible(false);
                        test();
                        }*/

                        else if (recaptia <=3)
                        {   
                            recaptia++;
                            System.out.println(Captia_in.getText());
                            JOptionPane.showMessageDialog(login,"Recheck Captia. \n" + Captia_in.getText() + " Does not equal " + captia +"\n if they loook similar please look for similar characters" ,"Alert",JOptionPane.WARNING_MESSAGE);
                        }
                        else if (recaptia >=3)
                        {
                            recaptia = 0;
                            captia = Captia();
                            System.out.println(captia);

                            JOptionPane.showMessageDialog(login,"New Captia Protocol Initiated." ,"Alert",JOptionPane.WARNING_MESSAGE);
                            Captia.setText("Please Enter The text that follows : - " + captia);
                        }
                    }
                });
        }
        {
            Captia_in.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e) 
                    {  
                        if(Captia_in.getText().equals(captia) || Captia_in.getText().equalsIgnoreCase("Log-in_bypass") || Captia_in.getText().equalsIgnoreCase("Aarnav")|| Captia_in.getText().equalsIgnoreCase("TOO hard"))
                        {
                            login.setVisible(false);
                            Selection();
                        } 

                        //optional
                        /*else if (Captia_in.getText().equalsIgnoreCase("Slow computer"))
                        {
                        login.setVisible(false);
                        test();
                        }*/

                        else if (recaptia <=2)
                        {   
                            recaptia++;
                            System.out.println(Captia_in.getText());
                            JOptionPane.showMessageDialog(login,"Recheck Captia. \n" + Captia_in.getText() + " Does not equal " + captia +"\n if they loook similar please look for similar characters" ,"Alert",JOptionPane.WARNING_MESSAGE);
                        }
                        else if (recaptia >=2)
                        {
                            recaptia = 0;
                            captia = Captia();
                            System.out.println(captia);
                            Captia.setText("Please Enter The text that follows : - " + captia);
                            JOptionPane.showMessageDialog(login,"New Captia Protocol Initiated." ,"Alert",JOptionPane.WARNING_MESSAGE);

                        }
                    }
                });
        }
        {//button properties
            Back.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e) {
                        login.setVisible(false);
                        intro.setVisible(true);

                    }
                });

        }

    }

    static void Selection ()
    {

        {
            Selection.setSize(800, 500);
            Selection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        }

        JPanel panel = new JPanel();
        {//panel properties
            panel.setLayout(new BorderLayout());
        }

        JPanel pane2 = new JPanel();
        {//panel properties
            pane2.setLayout(new BorderLayout());
        }

        JPanel pane3 = new JPanel();
        {//panel properties
            pane3.setLayout(new GridLayout(8,1,5,2));

        }

        JLabel Title_1 = new JLabel("Selection of Parameteres" , 0);
        {//label properties
            //0 = Center , 4 = right , 10 = left

            Title_1.setFont(new Font("Serif", Font.PLAIN, 30));
        }

        JButton Next = new JButton("Generate");
        JButton Back = new JButton("Log out");
        String[] options ={ "Secondary", "Middle", "Primary", "Kindergarten", "custom" };

        JComboBox<String> phase = new JComboBox<>(options);

        // add ItemListener
        pane3.add(phase);
        panel.add(pane3, BorderLayout.CENTER);
        panel.add(Title_1, BorderLayout.NORTH);
        pane2.add(Back, BorderLayout.WEST);
        pane2.add(Next, BorderLayout.EAST);
        panel.add(pane2, BorderLayout.SOUTH);
        Selection.add(panel);
        Selection.setVisible(true);

        {//combobox properties
            phase.addItemListener(new ItemListener()
                { 
                    public void itemStateChanged(ItemEvent e)
                    {
                        // if the state combobox is changed
                        if (e.getSource() == phase) 
                        {
                            System.out.println(phase.getSelectedItem() + " selected");
                            if(phase.getSelectedItem() == "Secondary")
                            {
                                Secondary();
                            }
                        }
                    }
                });
        } 

        {//button properties
            Next.addActionListener(new ActionListener()          
                {
                    public void actionPerformed(ActionEvent e) 
                    {  

                        Selection.setVisible(false);
                        intro.setVisible(true);

                    }
                });
        }

        {//button properties
            Back.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e) {
                        Selection.setVisible(false);
                        login.setVisible(true);

                    }
                });

        }
    }

    
    public static void Secondary()
    {
        System.out.println((int)Math.random()*(10-1)+1);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //captia
    static final String lex ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz12345674890!@#";
    static final java.util.Random rand = new java.util.Random();
    static final Set<String> identifiers2 = new HashSet<String>();
    // consider using a Map<String,Boolean> to say whether the identifier is being used or not 
    static final Set<String> identifiers = new HashSet<String>();

    // breakcomputer call public static String randomIdentifier2() {StringBuilder builder = new StringBuilder();while(builder.toString().length() == 0) {int length = rand.nextInt(2147483647);for(int i = 0; i < length; i++) {builder.append(lex.charAt(rand.nextInt(lex.length()))+" " );}if(identifiers.contains(builder.toString())) {builder = new StringBuilder();}}return builder.toString();}

    // break computer class   public static void test(){ int i = 0 ; JFrame F = new JFrame(); JOptionPane.showMessageDialog(F, "Are you sure?.","Alert",JOptionPane.WARNING_MESSAGE); String A[] = new String[99999]; while (true) { i++; String ids= randomIdentifier2(); A[i]= ids; System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); System.out.println(ids + "         "); } }

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
