import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
    private Container cp;
    private JButton btnAdd = new JButton("Add");
    private JButton btnSub = new JButton("Substract");
    private JButton btnMul = new JButton("Multiplication");
    private JButton btnDiv = new JButton("Division");
    private JButton btnExit = new JButton("Exit");
    private JLabel lab = new JLabel("0");
    private int count =  0;

    public MainFrame(){
        initComp();
    }
    private void initComp(){
        this.setBounds(100,100,400,450);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(new GridLayout(3,2,3,3));
        cp.add(lab);
        lab.setHorizontalAlignment(JLabel.CENTER);
        cp.add(btnExit);
        cp.add(btnAdd);
        cp.add(btnSub);
        cp.add(btnMul);
        cp.add(btnDiv);

        btnExit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnAdd.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                lab.setText(Integer.toString(count));
            }
        });

        btnSub.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                lab.setText(Integer.toString(count));
            }
        });

        btnMul.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count *= 2;
                lab.setText(Integer.toString(count));
            }
        });

        btnDiv.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count/=2;
                lab.setText(Integer.toString(count));
            }
        });

    }
}
