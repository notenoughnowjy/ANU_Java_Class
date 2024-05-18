import javax.swing.*;
import java.awt.*;
// 국립안동대학교 20181113 박준영
    public class GridLayoutRandomColor extends JFrame {
    public static final int rows = 4;
    public static final int cols = 5;

    public GridLayoutRandomColor(){
        setTitle("My Frame");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(rows, cols));

        Button[][] buttons = new Button[rows][cols];

        int btn_value[][] = new int[rows][cols];
        int count = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                btn_value[i][j] = count; // 행(row)과 열(column)을 올바르게 지정
                buttons[i][j] = new Button(""+btn_value[i][j]);
                panel.add(buttons[i][j]);

                int R = (int)(Math.random() * 256);
                int G = (int)(Math.random() * 256);
                int B = (int)(Math.random() * 256);

                Color color = new Color(R, G, B);

                buttons[i][j].setBackground(color);

                count++;
            }
        }
        add(panel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        GridLayoutRandomColor gridLayoutRandomColor = new GridLayoutRandomColor();
    }
}
