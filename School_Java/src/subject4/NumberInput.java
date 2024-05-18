package subject4;
// 국립안동대학교 20181113 박준영
import javax.swing.*;
import java.awt.*;

public class NumberInput extends JFrame {
    public NumberInput() {
        setTitle("전화번호 입력기");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 전화번호 입력란
        JTextField phoneNumberField = new JTextField();
        phoneNumberField.setHorizontalAlignment(JTextField.LEFT);

        // 숫자 및 기능 버튼 그리드
        JPanel buttonPanel = new JPanel(new GridLayout(4, 3, 5, 5));

        // 숫자 버튼 생성
        String[] numberButtons = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
        for (String number : numberButtons) {
            JButton button = new JButton(number);
            buttonPanel.add(button);
        }

        // 기능 버튼 생성
        JButton sendButton = new JButton("Send");
        JButton clearButton = new JButton("Clear");
        JButton endButton = new JButton("End");

        // 기능 버튼 패널 생성
        JPanel functionPanel = new JPanel(new GridLayout(1, 3, 5, 5));
        functionPanel.add(sendButton);
        functionPanel.add(endButton);

        // 버튼 패널에 기능 버튼 패널 추가
        JPanel buttonAndFunctionPanel = new JPanel(new BorderLayout());
        buttonAndFunctionPanel.add(buttonPanel, BorderLayout.CENTER);
        buttonAndFunctionPanel.add(functionPanel, BorderLayout.SOUTH);

        // 전체 프레임에 컴포넌트 추가
        add(phoneNumberField, BorderLayout.NORTH);
        add(buttonAndFunctionPanel, BorderLayout.CENTER);
        add(clearButton, BorderLayout.EAST);

        setVisible(true);
    }

    public static void main(String[] args) {
        new NumberInput();
    }
}

