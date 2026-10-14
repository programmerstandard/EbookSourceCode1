import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JFrame;


public class MenuGUI extends JFrame implements ActionListener
{
    public static void main(String[] args) {
      MenuGUI app = new MenuGUI();
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

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}