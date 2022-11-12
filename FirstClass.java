import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstClass implements ActionListener {
    JFrame frame;
    JTextArea myarea;
    JButton button;
    FirstClass(){
        frame=new JFrame("First Session");
        frame.setBounds(250,250,300,300); // fix size of window
        frame.setBackground(Color.black);
        frame.getContentPane().setBackground(Color.black);
        // creating button
        button=new JButton("Click");
        button.setBounds(120,20,50,20);
        // adding function to the button
        button.addActionListener(this);
        // creating my text area
        myarea=new JTextArea("Welcome to the TextArea");
        myarea.setBounds(50,50,200,200);
        myarea.setBackground(Color.RED);
        //adding button to my frame
        frame.add(button);
        //adding textarea to freame
        frame.add(myarea);
        //rest of these are
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //close button use then window and programme run stop
    }
    public static void  main(String [] arg){
        FirstClass object=new FirstClass();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        myarea.setText("You have Clicked the Button");
    }
}
