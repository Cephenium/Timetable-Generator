import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class IGUI
{
    static void intro_page()
    {
        JFrame intro =new JFrame("Timetable Generator - Introduction");
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
        JLabel el3 = new JLabel("      ");
        JLabel el4 = new JLabel("      ");
        JLabel el5 = new JLabel("      ");

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
                        LGUI.login_page();;
                        
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

    public static void main(String a)
    {
        intro_page();
    }
}
