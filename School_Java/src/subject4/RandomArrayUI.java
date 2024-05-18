import javax.swing.*;
import java.awt.*;
import java.util.Random;
// 국립안동대학교 20181113 박준영
public class RandomArrayUI extends JFrame {
    static Random random;
    private static final int ARRAY_SIZE = 30; // 배열의 크기

    public RandomArrayUI() {
        setTitle("Random Number Array");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 패널 생성
        JPanel panel = new JPanel(new GridBagLayout());

        // 랜덤한 숫자 배열 생성
        int[] numbers = generateRandomNumbers(ARRAY_SIZE);

        // 레이블을 패널에 추가
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            random = new Random();
            JLabel label = new JLabel(Integer.toString(numbers[i]));

            // 랜덤 위치 설정
            gridBagConstraints.gridx = random.nextInt(500);
            gridBagConstraints.gridy = random.nextInt(300);
            gridBagConstraints.fill = GridBagConstraints.BOTH;

            panel.add(label, gridBagConstraints);
        }

        // 패널을 프레임에 추가
        add(panel);

        // 프레임을 화면에 표시
        setVisible(true);
    }

    // 주어진 크기만큼의 랜덤한 숫자 배열 생성
    private int[] generateRandomNumbers(int size) {
        random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(30) + 1; // 1부터 30 사이의 랜덤한 숫자 생성
        }
        return numbers;
    }

    public static void main(String[] args) {
        new RandomArrayUI();
    }
}
