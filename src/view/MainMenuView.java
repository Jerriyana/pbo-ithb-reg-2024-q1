package view;

import javax.swing.JOptionPane;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MainMenuView {
    public int showMainMenu() {
        String[] options = {
                "Pilih Pesawat",
        };
        JList<String> list = new JList<>(options);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        int result = JOptionPane.showConfirmDialog(null, new JScrollPane(list), "Pilih Menu:",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            return list.getSelectedIndex();
        }

        return -1;
    }

    public int showPilihPesawat() {
        String[] options = {
                "Garuda Indonesia",
                "Lion Air",
                "Citilink",
                "Sriwijaya Air",
                "Emirates",
                "Singapore Airlines",
        };
        JList<String> list = new JList<>(options);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        int result = JOptionPane.showConfirmDialog(null, new JScrollPane(list), "Pilih Menu:",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            return list.getSelectedIndex();
        }

        return -1;
    }

    public String getInput(String message) {
        return JOptionPane.showInputDialog(null, message);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
