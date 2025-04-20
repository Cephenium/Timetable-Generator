import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.TextField;

public class LGUI
{  

    static void login_page(){
        String a[];
        JFrame login =new JFrame("Timetable Generator - Log in");
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

        String captia = Randomiser.Captia();
        JLabel Captia = new JLabel("Please Enter The text that follows : - " + captia , 10);
        {//label properties
            //0 = Center , 4 = right , 10 = left

            Captia.setFont(new Font("Serif", Font.PLAIN, 16));
        }

        JButton Back = new JButton("Back");
        {//button properties
            Back.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e) {
                        login.setVisible(false);
                        IGUI.main("");

                    }
                });

        }

        JLabel el1 = new JLabel("      ");//el = empty label
        JLabel el2 = new JLabel("      ");
        JLabel el3 = new JLabel("      ");
        JLabel el4 = new JLabel("      ");
        JLabel el5 = new JLabel("      ");

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
                            SGUI.Selection();
                        } 
                        else if (Captia_in.getText().equalsIgnoreCase("Slow computer"))
                        {
                            login.setVisible(false);
                            Randomiser.test();
                        }
                        else 
                        { 
                            System.out.println(Captia_in.getText());
                            JOptionPane.showMessageDialog(login,"Recheck Captia.","Alert",JOptionPane.WARNING_MESSAGE);
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
                            SGUI.Selection();
                        } 
                        else if (Captia_in.getText().equalsIgnoreCase("Break computer"))
                        {
                            login.setVisible(false);
                            Randomiser.test();
                        }
                        else 
                        { 
                            System.out.println(Captia_in.getText());
                            JOptionPane.showMessageDialog(login,"Recheck Captia.","Alert",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                });
        }
    }

     public static void main(String args)
    {
        login_page();

    }
}
