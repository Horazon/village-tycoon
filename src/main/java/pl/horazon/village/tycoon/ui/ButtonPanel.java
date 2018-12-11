package pl.horazon.village.tycoon.ui;

import pl.horazon.village.tycoon.ui.img.Images;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ButtonPanel extends JToolBar {

    public ButtonPanel() {
        super(JToolBar.VERTICAL);

        initUI();
    }

    private void initUI() {

        setFloatable(false);

        setBorder(BorderFactory.createLineBorder(Color.black));
        setMargin(new Insets(10, 5, 5, 5));

        ImageIcon driveIcon = new ImageIcon(Images.getCastleImage());

        JButton castleBtn = new JButton(driveIcon);
        castleBtn.setBorder(new EmptyBorder(3, 3, 3, 3));

        this.add(castleBtn);
    }
}
