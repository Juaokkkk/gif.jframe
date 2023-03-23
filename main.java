package javaapplication3;

    import java.awt.FlowLayout;

    import java.awt.event.ActionListener;

    import java.awt.event.ActionEvent;

    import javax.swing.JFrame;

    import javax.swing.JButton;

    import javax.swing.Icon;

    import javax.swing.ImageIcon;

    import javax.swing.JOptionPane;

    

            public class JavaApplication3 extends JFrame{

            private JButton plainJButton;

            private JButton fancyJButton;

            

    public JavaApplication3 () 

    {

       super("lesting buttons");

       setLayout(new FlowLayout());

       plainJButton= new JButton("Plain Button");

       add(plainJButton);

       

       Icon bug1= new ImageIcon(getClass().getResource("bug1.gif"));

        Icon bug2= new ImageIcon(getClass().getResource("bug2.gif"));

        fancyJButton= new JButton ("fancy button", bug1);

        fancyJButton.setRolloverIcon(bug2);

        add(fancyJButton);

        

        ButtonHandler handler= new ButtonHandler();

        fancyJButton.addActionListener(handler);

        plainJButton.addActionListener(handler);

    }

    

    private class ButtonHandler implements ActionListener

    {   

        @Override

        public void actionPerformed(ActionEvent event)

        {

            JOptionPane.showMessageDialog(null, String.format("You pressed: %s", event.getActionCommand()));

        }

    }

    

}
