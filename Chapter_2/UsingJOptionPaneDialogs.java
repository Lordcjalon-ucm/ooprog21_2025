import javax.swing.JOptionPane;

public class UsingJOPtionPaneDialog {
    public static void main(String[] args) {
        String name;
        int confirm;

        do {
            
            name = JOptionPane.showInputDialog(null, "Enter your name:", "Name Input", JOptionPane.QUESTION_MESSAGE);

           
            if (name == null) {
                int exit = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
                if (exit == JOptionPane.YES_OPTION) {
                    System.exit(0); 
                } else {
                    continue; 
                }
            }

            
            confirm = JOptionPane.showConfirmDialog(null, "Do you want to display your name?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);

            
            if (confirm != JOptionPane.YES_OPTION) {
                continue; 
            }

            
            JOptionPane.showMessageDialog(null, "Your name is: " + name, "Name Display", JOptionPane.INFORMATION_MESSAGE);

        } while (confirm != JOptionPane.YES_OPTION); 

        
    }
}