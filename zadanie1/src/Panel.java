import javax.swing.JOptionPane;

public class Panel {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What's your name, buddy?");
        JOptionPane.showMessageDialog(null, "Hello "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old are you, "+name+"?"));
        JOptionPane.showMessageDialog(null, "Nice to meet you "+age+" years old "+name);

        if (age<18){
            JOptionPane.showMessageDialog(null, "I start kid mode for you :]");
        } else {
            JOptionPane.showMessageDialog(null, "You can use from normal mode");
        }
    }
}
