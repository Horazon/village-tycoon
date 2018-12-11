package pl.horazon.village.tycoon.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import static pl.horazon.village.tycoon.config.i18n.I18nSupport.getTxtForKey;

public class MainWindow extends JFrame {

    JLabel statusbar;


    public MainWindow() {

        initUI();
    }

    private void initUI() {

        createMenuBar();

        setTitle(getTxtForKey("window.title"));
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                statusbar.setText(String.format("%s:%s", e.getPoint().getX(), e.getPoint().getY()));
            }
        });
    }

    private void createMenuBar() {

        var menubar = new JMenuBar();
        var exitIcon = new ImageIcon("src/resources/exit.png");

        var fileMenu = new JMenu(getTxtForKey("game"));
        fileMenu.setMnemonic(KeyEvent.VK_F);

        var eMenuItem = new JMenuItem(getTxtForKey("game.exit"), exitIcon);
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.setToolTipText("Exit application");
        eMenuItem.addActionListener((event) -> System.exit(0));

        fileMenu.add(eMenuItem);
        menubar.add(fileMenu);

        setJMenuBar(menubar);

        this.add(new DrawPanel());
        add(new ButtonPanel(), BorderLayout.EAST);

        statusbar = new JLabel("Ready");
        statusbar.setBorder(BorderFactory.createEtchedBorder());
        add(statusbar, BorderLayout.SOUTH);
    }
}
