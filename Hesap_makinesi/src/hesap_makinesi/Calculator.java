package hesap_makinesi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;

public class Calculator extends JFrame implements ActionListener {
    
    private JLabel historyLabel; // Üstteki küçük yazı (Geçmiş)
    private JLabel displayLabel; // Alttaki büyük yazı (Sonuç/Giriş)
    
    
    private String operator = "";  
    private double num1 = 0;        
    private boolean isNewEntry = true; 

    public Calculator() {
        
        setTitle("Hesap Makinesi");
        setSize(350, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.BLACK); 

        //  EKRAN KISMI (Üst Panel) geçmişin yazdığı yer
        JPanel screenPanel = new JPanel();
        screenPanel.setLayout(new GridLayout(2, 1)); // 2 satır: Üstte geçmiş, altta sayı
        screenPanel.setBackground(Color.BLACK);
        screenPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Kenar boşluğu

        // Geçmiş 
        historyLabel = new JLabel(""); 
        historyLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        historyLabel.setForeground(Color.LIGHT_GRAY); // Tam beyaz değil, hafif gri olsun
        historyLabel.setHorizontalAlignment(JLabel.RIGHT);

        // Ana Ekran 
        displayLabel = new JLabel("0");
        displayLabel.setFont(new Font("Arial", Font.BOLD, 48));
        displayLabel.setForeground(Color.WHITE);
        displayLabel.setHorizontalAlignment(JLabel.RIGHT);

        screenPanel.add(historyLabel);
        screenPanel.add(displayLabel);
        add(screenPanel, BorderLayout.NORTH);

        // TUŞLAR KISMI 
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10)); // 4x4 ızgara, 10px boşluk
        buttonPanel.setBackground(Color.BLACK);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Tuşların listesi
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "x",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            
            
            btn.setFont(new Font("Arial", Font.BOLD, 24));
            btn.setBackground(Color.BLACK);       
            btn.setForeground(Color.WHITE);      
            btn.setFocusPainted(false);           
            btn.setBorder(new LineBorder(Color.DARK_GRAY, 1)); 
            
            // Eğer operatör tuşu ise rengi biraz farklı olsun (İsteğe bağlı)
            if ("C".equals(text) || "=".equals(text) || "/".equals(text) || "x".equals(text) || "-".equals(text) || "+".equals(text)) {
                 btn.setForeground(new Color(255, 140, 0)); // Turuncu renk (Örn: iOS tarzı)
            }

            btn.addActionListener(this); // Tıklama olayını ekle
            buttonPanel.add(btn);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // 1. Sayı Tuşlarına Basılırsa
        if ("0123456789".contains(command)) {
            if (isNewEntry) {
                displayLabel.setText(command);
                isNewEntry = false;
            } else {
                displayLabel.setText(displayLabel.getText() + command);
            }
        }
        // 2. "C" (Temizle) Tuşuna Basılırsa
        else if (command.equals("C")) {
            displayLabel.setText("0");
            historyLabel.setText("");
            num1 = 0;
            operator = "";
            isNewEntry = true;
        }
        
        // 3. İşlem Tuşlarına (+, -, x, /) Basılırsa
        else if ("+-x/".contains(command)) {
            num1 = Double.parseDouble(displayLabel.getText());
            operator = command;
            isNewEntry = true;
            
            // Üstteki küçük ekrana yaz: "10 +" gibi
            historyLabel.setText(formatResult(num1) + " " + operator);
        }
        // 4. Eşittir (=) Tuşuna Basılırsa
        else if (command.equals("=")) {
            if (operator.isEmpty()) return; // İşlem yoksa bir şey yapma

            double num2 = Double.parseDouble(displayLabel.getText());
            double result = 0;

            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "x": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }

            // Sonucu ekrana yaz
            displayLabel.setText(formatResult(result));
            
            // Üstteki geçmişi tamamla: "10 + 5 =" gibi
            historyLabel.setText(formatResult(num1) + " " + operator + " " + formatResult(num2) + " =");
            
            isNewEntry = true; // Sonraki giriş yeni sayı olsun
            operator = ""; // İşlemi sıfırla
        }
    }

    // Yardımcı Metot: Sonuç tamsayı ise ".0" kısmını siler (Örn: 15.0 -> 15)
    private String formatResult(double number) {
        if (number == (long) number) {
            return String.format("%d", (long) number);
        } else {
            return String.format("%s", number);
        }
    }
}
