package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Владимир on 05.02.2017.
 */
public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Keyboard Trainer");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(Field.size);
        frame.setResizable(false);
        frame.add(new Field());
        frame.setVisible(true);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);

        JMenuBar menubar = new JMenuBar();

        JMenu game = new JMenu("Игра");
        JMenuItem newgame = new JMenuItem("Новая игра");
        JMenuItem loadgame = new JMenuItem("Загрузить игру");
        game.add(newgame);
        game.add(loadgame);
        menubar.add(game);

        JMenu level = new JMenu("Уровень");
        JMenuItem easy = new JMenuItem("Легкий");
        JMenuItem medium = new JMenuItem("Средний");
        JMenuItem hard = new JMenuItem("Сложный");
        level.add(easy);
        level.add(medium);
        level.add(hard);
        menubar.add(level);

        JMenu help = new JMenu("Помощь");
        JMenuItem about = new JMenuItem("О игре");
        help.add(about);
        menubar.add(help);

        JMenu exit = new JMenu("Выход");
        menubar.add(exit);
        frame.setJMenuBar(menubar);
    }
}
