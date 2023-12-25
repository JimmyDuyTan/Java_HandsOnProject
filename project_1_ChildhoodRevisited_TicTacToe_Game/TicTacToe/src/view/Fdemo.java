package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fdemo extends JFrame implements ActionListener{
	Button b[] = new Button[10];
	Button b1;
	int k = 0;
	int x = 8, y = 28;
	int a = 0;
	int z = 0, z1 = 0, z2 = 0, z3 = 0,z4 = 0,z5 = 0, z6 = 0, z7 = 0,z8 = 0;
	int height = 28;
	public Fdemo(){ 
		this.setLayout(null);
		this.setTitle("Tic Tac Toe Game");
		this.setSize(800, 600);
		this.setLocation(400,100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.BLACK);
		this.setForeground(Color.white);
		this.setVisible(true);
		
		for(int i = 1;i <= 3;i++) {
			for(int j = 1;j <= 3;j++) {
				b[k] = new Button();
				b[k].setSize(100,100);
				b[k].setLocation(x, y);
				b[k].setFont(new Font("Arial",Font.BOLD,40));
				this.add(b[k]);
				b[k].addActionListener(this);
				b[k].setBackground(new Color(255,141,28)); //Orange
				b[k].setForeground(Color.white);			k++;
				x += 100; // generate another block into x latitude
			}
			x = 8;
			y += 100; // generate another block into y latitude
		}
		b1 = new Button("New Game");
		b1.setSize(150,40);
		b1.setLocation(500, 300);
		b1.setFont(new Font("Arial",Font.BOLD,20));
		b1.setForeground(Color.white);
		this.add(b1);
		b1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Label p1 = new Label("");
		// For new game
		if(e.getSource() == b1) {
			p1.setText("1");
			for(int i = 0;i < 9;i++) {
				b[i].setLabel("");
			}
			z = 0; z1 = 0; z2 = 0; z3 = 0;z4 = 0;z5 = 0; z6 = 0; z7 = 0;z8 = 0;
					
				}
		//For the nine Buttons
		if(e.getSource() == b[0] && z == 0) {
			if(a % 2 == 0) {
				b[0].setLabel("O");
				z++; //break loop
				a++; //switch choice
			}else {
				b[0].setLabel("X");
				z++; //break loop
				a++; //switch choice
			}
		}
		if(e.getSource() == b[1] && z1 == 0) {
			if(a % 2 == 0) {
				b[1].setLabel("O");
				z1++; //break loop
				a++; //switch choice
			}else {
				b[1].setLabel("X");
				z1++; //break loop
				a++; //switch choice
			}
		}
		if(e.getSource() == b[2] && z2 == 0) {
			if(a % 2 == 0) {
				b[2].setLabel("O");
				z2++; //break loop
				a++; //switch choice
			}else {
				b[2].setLabel("X");
				z2++; //break loop
				a++; //switch choice
			}
		}
		if(e.getSource() == b[3] && z3 == 0) {
			if(a % 2 == 0) {
				b[3].setLabel("O");
				z3++; //break loop
				a++; //switch choice
			}else {
				b[3].setLabel("X");
				z3++; //break loop
				a++; //switch choice
			}
		}
		if(e.getSource() == b[4] && z4 == 0) {
			if(a % 2 == 0) {
				b[4].setLabel("O");
				z4++; //break loop
				a++; //switch choice
			}else {
				b[4].setLabel("X");
				z4++; //break loop
				a++; //switch choice
			}
		}
		if(e.getSource() == b[5] && z5 == 0) {
			if(a % 2 == 0) {
				b[5].setLabel("O");
				z5++; //break loop
				a++; //switch choice
			}else {
				b[5].setLabel("X");
				z5++; //break loop
				a++; //switch choice
			}
		}
		if(e.getSource() == b[6] && z6 == 0) {
			if(a % 2 == 0) {
				b[6].setLabel("O");
				z6++; //break loop
				a++; //switch choice
			}else {
				b[6].setLabel("X");
				z6++; //break loop
				a++; //switch choice
			}
		}
		if(e.getSource() == b[7] && z7 == 0) {
			if(a % 2 == 0) {
				b[7].setLabel("O");
				z7++; //break loop
				a++; //switch choice
			}else {
				b[7].setLabel("X");
				z7++; //break loop
				a++; //switch choice
			}
		}
		if(e.getSource() == b[8] && z8 == 0) {
			if(a % 2 == 0) {
				b[8].setLabel("O");
				z8++; //break loop
				a++; //switch choice
			}else {
				b[8].setLabel("X");
				z8++; //break loop
				a++; //switch choice
			}
		}
		//Winning Conditions
		if(b[0].getLabel() == b[1].getLabel() && b[0].getLabel() == b[2].getLabel()) {
			if(b[0].getLabel() == "O") {
				p1.setText("Player 1 Win");
				p1.setSize(150,50);
				p1.setLocation(510,height);
				p1.setFont(new Font("Arial",Font.BOLD,20));
				p1.setForeground(Color.black);
				this.add(p1);
				height += 50;
				for(int i = 0;i < 9;i++) {
					b[i].setLabel("");
				}
				z = 0; z1 = 0; z2 = 0; z3 = 0;z4 = 0;z5 = 0; z6 = 0; z7 = 0;z8 = 0;
			}
			if(b[0].getLabel() == "X"){
				p1.setText("Player 2 Win");
				p1.setSize(150,50);
				p1.setLocation(510,height);
				p1.setFont(new Font("Arial",Font.BOLD,20));
				p1.setForeground(Color.black);
				this.add(p1);
				height += 50;
				for(int i = 0;i < 9;i++) {
					b[i].setLabel("");
				}
				z = 0; z1 = 0; z2 = 0; z3 = 0;z4 = 0;z5 = 0; z6 = 0; z7 = 0;z8 = 0;
			}
		}
		if(b[3].getLabel() == b[4].getLabel() && b[3].getLabel() == b[5].getLabel()) {
			if(b[3].getLabel() == "O") {
				p1.setText("Player 1 Win");
				p1.setSize(150,50);
				p1.setLocation(510,height);
				p1.setFont(new Font("Arial",Font.BOLD,20));
				p1.setForeground(Color.black);
				this.add(p1);
				height += 50;
				for(int i = 0;i < 9;i++) {
					b[i].setLabel("");
				}
				z = 0; z1 = 0; z2 = 0; z3 = 0;z4 = 0;z5 = 0; z6 = 0; z7 = 0;z8 = 0;
			}
			if(b[3].getLabel() == "X"){
				p1.setText("Player 2 Win");
				p1.setSize(150,50);
				p1.setLocation(510,height);
				p1.setFont(new Font("Arial",Font.BOLD,20));
				p1.setForeground(Color.black);
				this.add(p1);
				height += 50;
				for(int i = 0;i < 9;i++) {
					b[i].setLabel("");
				}
				z = 0; z1 = 0; z2 = 0; z3 = 0;z4 = 0;z5 = 0; z6 = 0; z7 = 0;z8 = 0;
			}
		}
		
		if(b[6].getLabel() == b[7].getLabel() && b[6].getLabel() == b[8].getLabel()) {
			if(b[6].getLabel() == "O") {
				p1.setText("Player 1 Win");
				p1.setSize(150,50);
				p1.setLocation(510,height);
				p1.setFont(new Font("Arial",Font.BOLD,20));
				p1.setForeground(Color.black);
				this.add(p1);
				height += 50;
				for(int i = 0;i < 9;i++) {
					b[i].setLabel("");
				}
				z = 0; z1 = 0; z2 = 0; z3 = 0;z4 = 0;z5 = 0; z6 = 0; z7 = 0;z8 = 0;
			}
			if(b[6].getLabel() == "X"){
				p1.setText("Player 2 Win");
				p1.setSize(150,50);
				p1.setLocation(510,height);
				p1.setFont(new Font("Arial",Font.BOLD,20));
				p1.setForeground(Color.black);
				this.add(p1);
				height += 50;
				for(int i = 0;i < 9;i++) {
					b[i].setLabel("");
				}
				z = 0; z1 = 0; z2 = 0; z3 = 0;z4 = 0;z5 = 0; z6 = 0; z7 = 0;z8 = 0;
			}
		}
		if(b[0].getLabel() == b[3].getLabel() && b[0].getLabel() == b[6].getLabel()) {
			if(b[0].getLabel() == "O") {
				p1.setText("Player 1 Win");
				p1.setSize(150,50);
				p1.setLocation(510,height);
				p1.setFont(new Font("Arial",Font.BOLD,20));
				p1.setForeground(Color.black);
				this.add(p1);
				height += 50;
				for(int i = 0;i < 9;i++) {
					b[i].setLabel("");
				}
				z = 0; z1 = 0; z2 = 0; z3 = 0;z4 = 0;z5 = 0; z6 = 0; z7 = 0;z8 = 0;
			}
			if(b[0].getLabel() == "X"){
				p1.setText("Player 2 Win");
				p1.setSize(150,50);
				p1.setLocation(510,height);
				p1.setFont(new Font("Arial",Font.BOLD,20));
				p1.setForeground(Color.black);
				this.add(p1);
				height += 50;
				for(int i = 0;i < 9;i++) {
					b[i].setLabel("");
				}
				z = 0; z1 = 0; z2 = 0; z3 = 0;z4 = 0;z5 = 0; z6 = 0; z7 = 0;z8 = 0;
			}
		}
		if(b[1].getLabel() == b[4].getLabel() && b[1].getLabel() == b[7].getLabel()) {
			if(b[1].getLabel() == "O") {
				p1.setText("Player 1 Win");
				p1.setSize(150,50);
				p1.setLocation(510,height);
				p1.setFont(new Font("Arial",Font.BOLD,20));
				p1.setForeground(Color.black);
				this.add(p1);
				height += 50;
				for(int i = 0;i < 9;i++) {
					b[i].setLabel("");
				}
				z = 0; z1 = 0; z2 = 0; z3 = 0;z4 = 0;z5 = 0; z6 = 0; z7 = 0;z8 = 0;
			}
			if(b[1].getLabel() == "X"){
				p1.setText("Player 2 Win");
				p1.setSize(150,50);
				p1.setLocation(510,height);
				p1.setFont(new Font("Arial",Font.BOLD,20));
				p1.setForeground(Color.black);
				this.add(p1);
				height += 50;
				for(int i = 0;i < 9;i++) {
					b[i].setLabel("");
				}
				z = 0; z1 = 0; z2 = 0; z3 = 0;z4 = 0;z5 = 0; z6 = 0; z7 = 0;z8 = 0;
			}
		}
		if(b[2].getLabel() == b[5].getLabel() && b[2].getLabel() == b[8].getLabel()) {
			if(b[2].getLabel() == "O") {
				p1.setText("Player 1 Win");
				p1.setSize(150,50);
				p1.setLocation(510,height);
				p1.setFont(new Font("Arial",Font.BOLD,20));
				p1.setForeground(Color.black);
				this.add(p1);
				height += 50;
				for(int i = 0;i < 9;i++) {
					b[i].setLabel("");
				}
				z = 0; z1 = 0; z2 = 0; z3 = 0;z4 = 0;z5 = 0; z6 = 0; z7 = 0;z8 = 0;
			}
			if(b[2].getLabel() == "X"){
				p1.setText("Player 2 Win");
				p1.setSize(150,50);
				p1.setLocation(510,height);
				p1.setFont(new Font("Arial",Font.BOLD,20));
				p1.setForeground(Color.black);
				this.add(p1);
				height += 50;
				for(int i = 0;i < 9;i++) {
					b[i].setLabel("");
				}
				z = 0; z1 = 0; z2 = 0; z3 = 0;z4 = 0;z5 = 0; z6 = 0; z7 = 0;z8 = 0;
			}
		}
		if(b[0].getLabel() == b[4].getLabel() && b[0].getLabel() == b[8].getLabel()) {
			if(b[0].getLabel() == "O") {
				p1.setText("Player 1 Win");
				p1.setSize(150,50);
				p1.setLocation(510,height);
				p1.setFont(new Font("Arial",Font.BOLD,20));
				p1.setForeground(Color.black);
				this.add(p1);
				height += 50;
				for(int i = 0;i < 9;i++) {
					b[i].setLabel("");
				}
				z = 0; z1 = 0; z2 = 0; z3 = 0;z4 = 0;z5 = 0; z6 = 0; z7 = 0;z8 = 0;
			}
			if(b[0].getLabel() == "X"){
				p1.setText("Player 2 Win");
				p1.setSize(150,50);
				p1.setLocation(510,height);
				p1.setFont(new Font("Arial",Font.BOLD,20));
				p1.setForeground(Color.black);
				this.add(p1);
				height += 50;
				for(int i = 0;i < 9;i++) {
					b[i].setLabel("");
				}
				z = 0; z1 = 0; z2 = 0; z3 = 0;z4 = 0;z5 = 0; z6 = 0; z7 = 0;z8 = 0;
			}
		}
		if(b[2].getLabel() == b[4].getLabel() && b[2].getLabel() == b[6].getLabel()) {
			if(b[2].getLabel() == "O") {
				p1.setText("Player 1 Win");
				p1.setSize(150,50);
				p1.setLocation(510,height);
				p1.setFont(new Font("Arial",Font.BOLD,20));
				p1.setForeground(Color.black);
				this.add(p1);
				height += 50;
				for(int i = 0;i < 9;i++) {
					b[i].setLabel("");
				}
				z = 0; z1 = 0; z2 = 0; z3 = 0;z4 = 0;z5 = 0; z6 = 0; z7 = 0;z8 = 0;
			}
			if(b[2].getLabel() == "X"){
				p1.setText("Player 2 Win");
				p1.setSize(150,50);
				p1.setLocation(510,height);
				p1.setFont(new Font("Arial",Font.BOLD,20));
				p1.setForeground(Color.black);
				this.add(p1);
				height += 50;
				for(int i = 0;i < 9;i++) {
					b[i].setLabel("");
				}
				z = 0; z1 = 0; z2 = 0; z3 = 0;z4 = 0;z5 = 0; z6 = 0; z7 = 0;z8 = 0;
			}
		}
		
	}

}

