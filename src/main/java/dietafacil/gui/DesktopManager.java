package dietafacil.gui;

import java.util.Arrays;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class DesktopManager {

    private static JDesktopPane desktop;

    private DesktopManager() {
    }

    public static void setDesktop(JDesktopPane desktop) {
        DesktopManager.desktop = desktop;
    }

    public static void adicionar(JInternalFrame pTela) {
        if (!Arrays.asList(desktop.getAllFrames()).contains(pTela)) {
            desktop.add(pTela);
        }
    }

    public static void remover(JInternalFrame pTela) {
        pTela.dispose();
        desktop.remove(pTela);
    }
}
