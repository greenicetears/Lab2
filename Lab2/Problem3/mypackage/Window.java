package mypackage;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;  
public class Window{  
private static int v = 50;//creating the number to begin with 
JFrame f;  
Window(){  
f=new JFrame("Problem3");//creating instance of JFrame 
JButton i=new JButton("Increment");//creating instance of JButton  
JButton d=new JButton("Decrement");//creating instance of JButton  
JTextField tf=new JTextField();//creating the instance of JTextField
tf.setText(String.valueOf(v));
tf.setBounds(75, 20, 50, 40);
i.setBounds(50,60,100, 40);  
d.setBounds(50,100,100, 40);
f.setSize(200,200);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible 
f.add(tf);//adding the Text
f.add(i);//adding button in JFrame  
f.add(d);//adding button in JFrame  
f.setBackground(Color.cyan);
f.setForeground(Color.BLACK);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
i.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){
			v+=1;
			tf.setText(String.valueOf(v));
        }}); 
d.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){
			v-=1;
			tf.setText(String.valueOf(v));
        }}); 

}

public static void main(String[] args) {  
new Window();  
}
}

  