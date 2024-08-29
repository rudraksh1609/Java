package test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VowelCountGUI extends JFrame 
{
    private JTextField inputField;
    private JTextField resultField;
    private JButton countButton;
    private JButton resetButton;
    private JButton exitButton;
    public VowelCountGUI() 
    {
        setTitle("Vowel Counter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));
        inputField = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);
        countButton = new JButton("CountVowel");
        resetButton = new JButton("Reset");
        exitButton = new JButton("Exit");
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(countButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(exitButton);
        add(new JLabel("Enter String:"));
        add(inputField);
        add(new JLabel("Result:"));
        add(resultField);
        add(buttonPanel);
        countButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String input = inputField.getText();
                int vowelCount = countVowels(input);
                resultField.setText(String.valueOf(vowelCount));
            }
        });

        resetButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                inputField.setText("");
                resultField.setText("");
            }
        });

        exitButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                System.exit(0);
            }
        });
    }

    private int countVowels(String input) 
    {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : input.toCharArray()) 
        {
            if (vowels.indexOf(c) != -1) 
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                new VowelCountGUI().setVisible(true);
            }
        });
    }
}