/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Games;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.URL;

public class SnakeGame extends JPanel implements KeyListener, ActionListener{
    private static final long serialVersionUID = 1L;
    private static final int WIDTH = 1240;
    private static final int HEIGHT = 600;
    private static final int UNIT_SIZE = 20;
    private static final int GAME_UNITS = (WIDTH * HEIGHT) / UNIT_SIZE;
    private static final int DELAY = 100;
    private final LinkedList<Point> snake = new LinkedList<>();
    private Point food;
    private char direction = 'R';
    private boolean running = false;
    private Timer timer;
    private Random random;
    private Clip clip;

    public SnakeGame() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(new Color(118,187,57));
        setFocusable(true);
        
        Font customFont = new Font("Poppins Light", Font.BOLD, 12);
        setFont(customFont);
        
        addKeyListener(this);
        startGame();
        requestFocus();
        
        try {
            URL url = getClass().getResource("/Sound/eatSound.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    private void startGame() {
        snake.clear();
        direction = 'R';
        snake.add(new Point(WIDTH / 2, HEIGHT / 2));
        generateFood();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
    	super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics g) {
        if (running) {
            g.setColor(Color.RED);
            g.fillOval(food.x, food.y, UNIT_SIZE, UNIT_SIZE);
            for (Point p : snake) {
                g.setColor(new Color(30, 73, 77));
                g.fillRoundRect(p.x, p.y, UNIT_SIZE, UNIT_SIZE, UNIT_SIZE, UNIT_SIZE);
            }
        } else {
            gameOver(g);
        }
    }

    private void generateFood() {
        random = new Random();
        food = new Point(random.nextInt((int) (WIDTH / UNIT_SIZE)) * UNIT_SIZE,
                random.nextInt((int) (HEIGHT / UNIT_SIZE)) * UNIT_SIZE);
    }

    private void move() {
        Point head = snake.getFirst();
        int x = head.x;
        int y = head.y;
        switch (direction) {
        case 'U':
            y -= UNIT_SIZE;
            break;
        case 'D':
            y += UNIT_SIZE;
            break;
        case 'L':
            x -= UNIT_SIZE;
            break;
        case 'R':
            x += UNIT_SIZE;
            break;
        }
        Point newHead = new Point(x, y);
        if (newHead.equals(food)) {
            snake.addFirst(newHead);
            generateFood();
            clip.setFramePosition(0);
            clip.start();
        } else {
            snake.removeLast();
            if (snake.contains(newHead) || x < 0 || x > WIDTH - UNIT_SIZE || y < 0 || y > HEIGHT - UNIT_SIZE) {
                running = false;
                timer.stop();
            } else {
                snake.addFirst(newHead);
            }
        }
    }

    private void gameOver(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawString("Game Over", WIDTH / 2 - 25, HEIGHT / 2);
        g.drawString("Score: " + (snake.size()), WIDTH / 2 - 25, HEIGHT / 2 + 20);
        g.drawString("Press ENTER to play again", WIDTH / 2 - 70, HEIGHT / 2 + 40);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
        }
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
        case KeyEvent.VK_UP:
            if (direction != 'D') {
                direction = 'U';
            }
            break;
        case KeyEvent.VK_DOWN:
            if (direction != 'U') {
                direction = 'D';
            }
            break;
        case KeyEvent.VK_LEFT:
            if (direction != 'R') {
                direction = 'L';
            }
            break;
        case KeyEvent.VK_RIGHT:
            if (direction != 'L') {
                direction = 'R';
            }
            break;
        case KeyEvent.VK_ENTER:
            if (!running) {
                startGame();
            }
            break;
        }
    }
    private Clip loadSound(String fileName) {
        Clip clip = null;
        try {
            URL soundURL = getClass().getResource(fileName);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundURL);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
        return clip;
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
