import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JFrame;
import javax.swing.*;


public class MenuGUI extends JFrame implements ActionListener
{
    public static void main(String[] args) {
    //  MenuGUI app = new MenuGUI();

          //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MenuGUI();
            }
        });
    }

  public MenuGUI()
  {
    super("Menu Utama");
    JMenuBar menu = new JMenuBar();

    // Create menu bar with menu
    JMenu submenu = new JMenu("File");
    submenu.setMnemonic('F');

    // Setup JMenuItem
    JMenuItem mhs = new JMenuItem("Data Nahasiswa");
    JMenuItem nilai = new JMenuItem("Nilai Nahasiswa");
    JMenuItem keluar = new JMenuItem("Keluar ");

    // Add JMenuItem
    submenu.add(mhs);
    submenu.add(nilai);
    submenu.addSeparator();
    submenu.add(keluar);
    
    menu.add(submenu);
    setJMenuBar(menu);

    setSize(800,600);
    show();
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}