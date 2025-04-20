import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class SGUI
{
    static void Selection ()
    {
        JFrame Selection =  new JFrame("Timetable Generator - Parameters selection");
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
        String s1[] = { "Secondary", "Middle", "Primary", "Kindergarten", "custom" };

        // create checkbox
        JComboBox phase = new JComboBox(s1);

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
                        IGUI.intro_page();

                    }
                });
        }

        {//button properties
            Back.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e) {
                        Selection.setVisible(false);
                        LGUI.main("");

                    }
                });

        }
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);

    }
}
