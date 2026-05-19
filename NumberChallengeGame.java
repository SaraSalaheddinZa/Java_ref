import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class NumberChallengeGame {

    static int secretNumber;
    static int attempts;
    static int maxAttempts = 5;
    static int score = 0;

    public static void main(String[] args) {

        Random random = new Random();
        secretNumber = random.nextInt(10) + 1;
        attempts = 0;

        // ------ Window ------
        JFrame frame = new JFrame("🎮 Cute Number Game");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // ------ Main Panel ------
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 228, 240)); // pastel pink
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // ------ Title ------
        JLabel title = new JLabel("Guess The Number 🌸");
        title.setFont(new Font("Poppins", Font.BOLD, 22));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        // ------ Instruction ------
        JLabel instruction =
                new JLabel("Choose a number between 1 - 10");
        instruction.setAlignmentX(Component.CENTER_ALIGNMENT);

        // ------ Input ------
        JTextField inputField = new JTextField();
        inputField.setMaximumSize(new Dimension(150,30));
        inputField.setAlignmentX(Component.CENTER_ALIGNMENT);

        // ------ Result Label ------
        JLabel resultLabel = new JLabel(" ");
        resultLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // ------ Score Label ------
        JLabel scoreLabel = new JLabel("Score: 0 | Attempts: 0/5");
        scoreLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // ------ Buttons ------
        JButton guessButton = new JButton("✨ Guess");
        JButton restartButton = new JButton("🔄 Restart");

        guessButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        restartButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        guessButton.setBackground(new Color(186, 225, 255));
        restartButton.setBackground(new Color(255, 204, 229));

        // ------ Guess Logic ------
        guessButton.addActionListener(e -> {

            try {
                int guess = Integer.parseInt(inputField.getText());
                attempts++;

                if (guess == secretNumber) {
                    resultLabel.setText("🎉 Correct! You Win!");
                    score += 10;
                }
                else if (guess > secretNumber)
                    resultLabel.setText("📈 Too High!");
                else
                    resultLabel.setText("📉 Too Low!");

                if(attempts >= maxAttempts && guess != secretNumber){
                    resultLabel.setText("💔 Game Over! Number was "
                            + secretNumber);
                }

                scoreLabel.setText(
                        "Score: " + score +
                                " | Attempts: " + attempts + "/5");

                inputField.setText("");

            } catch (Exception ex) {
                resultLabel.setText("⚠ Enter a valid number!");
            }
        });

        // ------ Restart Logic ------
        restartButton.addActionListener(e -> {
            Random random2 = new Random();
            secretNumber = random2.nextInt(10) + 1;
            attempts = 0;

            resultLabel.setText("🌷 New Game Started!");
            scoreLabel.setText(
                    "Score: " + score + " | Attempts: 0/5");
        });

        // ------ Layout spacing ------
        panel.add(Box.createVerticalStrut(15));
        panel.add(title);
        panel.add(Box.createVerticalStrut(10));
        panel.add(instruction);
        panel.add(Box.createVerticalStrut(15));
        panel.add(inputField);
        panel.add(Box.createVerticalStrut(15));
        panel.add(guessButton);
        panel.add(Box.createVerticalStrut(10));
        panel.add(restartButton);
        panel.add(Box.createVerticalStrut(15));
        panel.add(resultLabel);
        panel.add(Box.createVerticalStrut(10));
        panel.add(scoreLabel);

        frame.add(panel);
        frame.setVisible(true);
    }
}