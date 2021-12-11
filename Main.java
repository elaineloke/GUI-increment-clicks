package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
	int count = 0;
	private JLabel label;

	public Main(){
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setSize(200,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Click-click button!");


		JButton button = new JButton("Click here");
		button.setVisible(true);
		frame.add(button);

		label = new JLabel("Number of clicks : 0");
		frame.add(label);

		button.addActionListener(e -> actionPerformed(e));
	}

    public static void main(String[] args) {
			new Main();
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks: " + count);
	}
}
