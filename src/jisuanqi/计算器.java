package jisuanqi;
/*************************************************************
 * 
 * java�γ����
 * ������������
 * ͼ�λ����������
 * 2018.6
 * ʵ�ֹ��ܻ��������Լ�һЩ���ú���sin cos tan��
 * �˸����㡢���š��Լ�ƽ������
 * ��ʵ�ֽ���ת��  ������   ʮ������  �˽���
 * �Ѿ��ϴ���github  
 * https://github.com/ChenxiaoW/Calculator
 * ���Ӳʵ���������������Ϊ��ǰϵͳ�������򴥷��ʵ�
 * �����Ի��򣬵�����ǡ����ż���ũҵ��ѧ��ҵ�衶���������ĵط���Ƭ��
 * 
 * 
 * 
 */
import java.util.Date;
import java.awt.EventQueue;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JTextField;

import javazoom.jl.player.Player;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
public class ������ {
 public  String shu ="";
 public  static String a ="";

	private JFrame frame;
	private JTextField textField;
	private JButton button;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JButton button_16;
	private JButton button_17;
	private JButton button_18;
    static ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");  
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					������ window = new ������();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/********************************�˸�************************************/
	public void tuige(){//�����˸�������µ��¼�
        
        int i = shu.length();
        if(i>0){
            shu = shu.substring(0,i-1);//ȥ�����һ���ַ�
            if (shu.length() == 0) {// ����ı�û�������ݣ����ʼ���������ĸ���ֵ
            	textField.setText("0");
            } else { // ��ʾ�µ��ı�
            	textField.setText(shu);
        }
        }
        }
	/*****************************end***************************************************************************************/
	
	public ������() {
		initialize();
	}
	/*******************************����************************/
	public void str(String a) {
		shu+=a;
		textField.setText(shu);
		
	} 
	/*******************************end**************************************************************************************/
	
	
	 /**********************************ƽ��**************/
     public void pingfang(){
         String i = textField.getText();
         Double j = Double.parseDouble(i);//���ַ���iת���ɶ�Ӧ��double���͵���ֵ
         double ans = j*j;  //��ƽ��
         String answer =String.valueOf(ans);//��int������ת����String����
         textField.setText(answer);//���ı�������Ϊƽ����Ľ��
     }
	 /********************************************end********************************************************************/
     
     /******************************************����***************/
     public void kaifang(){
         String i = textField.getText();
         Double j = Double.parseDouble(i);//���ַ���ת���ɶ�Ӧ��double���͵���ֵ
         double ans = (double)Math.sqrt(j);//�󿪷�
         String answer = String.valueOf(ans);//��double������ת����String����
         textField.setText(answer);//���ı�������Ϊ������Ľ��
     }
     
     /**********************************************end******************************************************************/
     
     /*****************************************tan****************************************************/
     public void tan(){
         String i = textField.getText();
         Double j = Double.parseDouble(i);//���ַ���ת���ɶ�Ӧ��double���͵���ֵ
         double a = Math.toRadians(j);   //������ת���ɶ�
         double ans = (double)Math.tan(a);//��tan
         String answer = String.valueOf(ans);//��double������ת����String����
         textField.setText(answer);//���ı�������Ϊ������Ľ��
     }
     /********************************************end******************************************************************/
     
     /*****************************************sin****************************************************/
     public void sin(){
         String i = textField.getText();
         Double j = Double.parseDouble(i);//���ַ���ת���ɶ�Ӧ��double���͵���ֵ
         double a = Math.toRadians(j);   //������ת���ɶ�
         double ans = (double)Math.sin(a);//��sin
         String answer = String.valueOf(ans);//��double������ת����String����
         textField.setText(answer);//���ı�������Ϊ������Ľ��
     }
     /********************************************end******************************************************************/
     
     /*****************************************cos****************************************************/
     public void cos(){
         String i = textField.getText();
         Double j = Double.parseDouble(i);//���ַ���ת���ɶ�Ӧ��double���͵���ֵ
         double a = Math.toRadians(j);      //������ת���ɶ�
         double ans = (double)Math.cos(a);//��cos
         String answer = String.valueOf(ans);//��double������ת����String����
         textField.setText(answer);//���ı�������Ϊ������Ľ��
     }
     /********************************************end******************************************************************/
     
     
     /*********************************************����******************************/

public void shu (String original) {
 	try {  
 		Object temp = jse.eval(original);
                shu =temp.toString();
               textField.setText(shu);

 	} catch (Exception t) {  
 		 textField.setText("�������ܼ���Ŷ��");
 	}
}
     /**************************************************end******************************************************************/
/********************************************�ʵ�***********************************/
public void caidan() {
	String filename="1.mp3"; 
    try { 
        BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(filename)); 
        Player player = new Player(buffer); player.play(); 
    } catch (Exception e) { 
         System.out.println(e); 
    } 
}

/*********************************************************end***********************************************************/
     
     
	private void initialize() {
		frame = new JFrame("JAVA�γ����֮������");
		frame.getContentPane().setFont(new Font("����", Font.PLAIN, 22));
		frame.setBounds(100, 100, 441, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("����", Font.PLAIN, 40));
		textField.setBounds(14, 13, 383, 53);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText("0");
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.setBackground(new Color(51, 204, 0));
		btnNewButton.setFont(new Font("����", Font.PLAIN, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shu="";
				textField.setText("0");
			}
		});
		btnNewButton.setBounds(14, 214, 57, 38);
		frame.getContentPane().add(btnNewButton);
		
		button = new JButton("%");
		button.setFont(new Font("����", Font.PLAIN, 22));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str("%");
			}
		});
		button.setBounds(175, 214, 57, 38);
		frame.getContentPane().add(button);
		
		button_2 = new JButton("��");
		button_2.setBackground(new Color(51, 204, 0));
		button_2.setForeground(new Color(51, 0, 0));
		button_2.setFont(new Font("����", Font.PLAIN, 22));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuige();
			}
		});
		button_2.setBounds(261, 214, 136, 38);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("7");
		button_3.setFont(new Font("����", Font.PLAIN, 22));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str("7");
			}
		});
		button_3.setBounds(14, 277, 57, 38);
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton("8");
		button_4.setFont(new Font("����", Font.PLAIN, 22));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str("8");
			}
		});
		button_4.setBounds(92, 277, 57, 38);
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton("9");
		button_5.setFont(new Font("����", Font.PLAIN, 22));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str("9");
			}
		});
		button_5.setBounds(175, 277, 57, 38);
		frame.getContentPane().add(button_5);
		
		button_6 = new JButton("/");    
		button_6.setFont(new Font("����", Font.PLAIN, 22));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str("/");
			}
		});
		button_6.setBounds(261, 277, 57, 38);
		frame.getContentPane().add(button_6);
		
		button_7 = new JButton("4");
		button_7.setFont(new Font("����", Font.PLAIN, 22));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str("4");
			}
		});
		button_7.setBounds(14, 351, 57, 38);
		frame.getContentPane().add(button_7);
		
		button_8 = new JButton("5");
		button_8.setFont(new Font("����", Font.PLAIN, 22));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str("5");
			}
		});
		button_8.setBounds(92, 351, 57, 38);
		frame.getContentPane().add(button_8);
		
		button_9 = new JButton("6");
		button_9.setFont(new Font("����", Font.PLAIN, 22));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str("6");
			}
		});
		button_9.setBounds(175, 351, 57, 38);
		frame.getContentPane().add(button_9);
		
		button_10 = new JButton("*");
		button_10.setFont(new Font("����", Font.PLAIN, 22));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str("*");
			}
		});
		button_10.setBounds(261, 351, 57, 38);
		frame.getContentPane().add(button_10);
		
		button_11 = new JButton("1");
		button_11.setFont(new Font("����", Font.PLAIN, 22));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str("1");
			}
		});
		button_11.setBounds(14, 424, 57, 38);
		frame.getContentPane().add(button_11);
		
		button_12 = new JButton("2");
		button_12.setFont(new Font("����", Font.PLAIN, 22));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str("2");
			}
		});
		button_12.setBounds(92, 424, 57, 38);
		frame.getContentPane().add(button_12);
		
		button_13 = new JButton("3");
		button_13.setFont(new Font("����", Font.PLAIN, 22));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str("3");
			}
		});
		button_13.setBounds(175, 424, 57, 38);
		frame.getContentPane().add(button_13);
		
		button_14 = new JButton("-");
		button_14.setFont(new Font("����", Font.PLAIN, 22));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str("-");
			}
		});
		button_14.setBounds(261, 424, 57, 38);
		frame.getContentPane().add(button_14);
		
		button_15 = new JButton("0");
		button_15.setFont(new Font("����", Font.PLAIN, 22));
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str("0");
			}
		});
		button_15.setBounds(14, 489, 135, 38);
		frame.getContentPane().add(button_15);
		
		button_16 = new JButton(".");
		button_16.setFont(new Font("����", Font.PLAIN, 22));
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str(".");
			}
		});
		button_16.setBounds(175, 489, 57, 38);
		frame.getContentPane().add(button_16);
		
		button_17 = new JButton("=");
		button_17.setFont(new Font("����", Font.BOLD, 35));
		button_17.setBackground(new Color(255, 51, 0));
		button_17.setForeground(Color.BLACK);
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Date d=new Date();//��ȡʱ��
				SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");//ת����ʽ
				String a=sdf.format(d);//��ӡ
				if(a.equals(shu)) {
					int res=JOptionPane.showConfirmDialog(null, "��⵽�������ʵ�����", "�Ƿ�ʼ�ʵ�", JOptionPane.YES_NO_OPTION);
					 if(res==JOptionPane.YES_OPTION){ 
						 	caidan();
						     }
					
					
				}
				
				
					shu(shu);	
			}
		});
		button_17.setBounds(340, 424, 57, 98);
		frame.getContentPane().add(button_17);
		
		button_18 = new JButton("+");
		button_18.setFont(new Font("����", Font.PLAIN, 22));
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str("+");
			}
		});
		button_18.setBounds(261, 489, 57, 38);
		frame.getContentPane().add(button_18);
		
/****************************��***************************/		
		JButton button_19 = new JButton("\u03C0");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shu= "3.1415926535";
				shu=String.valueOf(Math.PI);
				textField.setText(shu);
/************************end*****************************/
				
			}
		});
		button_19.setFont(new Font("����", Font.PLAIN, 22));
		button_19.setBounds(88, 214, 57, 38);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("\uFF08");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str("(");
			}
		});
		button_20.setFont(new Font("����", Font.PLAIN, 22));
		button_20.setBounds(261, 140, 57, 38);
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("\u221A");                          //����
		button_21.setFont(new Font("����", Font.PLAIN, 22));
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kaifang();
			}
		});
		button_21.setBounds(340, 277, 57, 38);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("sin");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sin();
			}
		});
		button_22.setFont(new Font("����", Font.PLAIN, 14));
		button_22.setBounds(14, 140, 57, 38);
		frame.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("cos");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cos();
			}
		});
		button_23.setFont(new Font("����", Font.PLAIN, 14));
		button_23.setBounds(92, 140, 57, 38);
		frame.getContentPane().add(button_23);
		
		JButton button_24 = new JButton("tan");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tan();
			}
		});
		button_24.setFont(new Font("����", Font.PLAIN, 14));
		button_24.setBounds(175, 140, 57, 38);
		frame.getContentPane().add(button_24);
		
		JButton button_25 = new JButton("x\u00B2");                             //ƽ��
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pingfang();
			}
		});
		button_25.setFont(new Font("����", Font.PLAIN, 22));
		button_25.setBounds(340, 351, 57, 38);
		frame.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("\uFF09");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str(")");
			}
		});
		button_26.setFont(new Font("����", Font.PLAIN, 22));
		button_26.setBounds(340, 140, 57, 38);
		frame.getContentPane().add(button_26);
		
		JButton button_1 = new JButton("\u5341\u516D\u8FDB\u5236");               //ʮ����ת��
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int a =Integer.parseInt(shu);
				textField.setText(Integer.toHexString(a));
				}catch(Exception e1) {
					 textField.setText("����������Ŷ��");
				}
			}
		});
		button_1.setForeground(new Color(51, 0, 0));
		button_1.setFont(new Font("����", Font.PLAIN, 20));
		button_1.setBackground(Color.PINK);
		button_1.setBounds(14, 79, 117, 38);
		frame.getContentPane().add(button_1);
		
		JButton button_27 = new JButton("\u4E8C\u8FDB\u5236");     //������
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int a =Integer.parseInt(shu);
				textField.setText(Integer.toBinaryString(a));
			}catch(Exception e1) {
				 textField.setText("����������Ŷ��");
			}
				
			}
		});
		button_27.setForeground(new Color(51, 0, 0));
		button_27.setFont(new Font("����", Font.PLAIN, 20));
		button_27.setBackground(Color.PINK);
		button_27.setBounds(292, 79, 117, 38);
		frame.getContentPane().add(button_27);
		
		JButton button_28 = new JButton("\u516B\u8FDB\u5236");         //�˽���
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int a =Integer.parseInt(shu);
				textField.setText(Integer.toOctalString(a));
			}catch(Exception e1) {
				 textField.setText("����������Ŷ��");
			}
			}
		});
		button_28.setForeground(new Color(51, 0, 0));
		button_28.setFont(new Font("����", Font.PLAIN, 20));
		button_28.setBackground(Color.PINK);
		button_28.setBounds(155, 79, 117, 38);
		frame.getContentPane().add(button_28);
	}
}
