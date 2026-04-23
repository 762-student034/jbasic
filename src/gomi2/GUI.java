package gomi2;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class GUI extends JFrame {

    private JPanel panel;
    private JLabel label;

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {

        // レイアウトを BorderLayout にする
        this.setLayout(new BorderLayout());

        JFrame frame = new JFrame("SetMinimumSize Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1200);
        
        // 最小サイズを 300x200 に設定
        frame.setMinimumSize(new Dimension(1920, 1200));
        
        frame.setVisible(true);
    }
}
