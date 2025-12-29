package hesap_makinesi;

import javax.swing.SwingUtilities;


public class Hesap_makinesi {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }
    
}
