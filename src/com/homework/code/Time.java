package com.homework.code;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Time extends Frame implements ActionListener,Runnable{
	private TextField text_C,text_D;
	private Button button_d,button_e,button_f;
	Thread thread;                              //线程对象
    int sleeptime=1000;  
	public Time()
	{
		super("倒计时");
		this.setBounds(300,240,260,115); 
		this.setResizable(false);
		this.setBackground(Color.lightGray); 
		this.setLayout(new FlowLayout(FlowLayout.LEFT)); 
        this.add(new Label("seconds"));
        text_C = new TextField("",25);
        this.add(text_C);
        this.add(new Label("time"));
        text_D = new TextField("",25);
        this.add(text_D);
        button_d = new Button("start");
        this.add(button_d);
        button_d.addActionListener(this);
        button_e = new Button("pause");
        this.add(button_e);
        button_e.addActionListener(this);
        button_f = new Button("reset");
        this.add(button_f);
        button_f.addActionListener(this);
        this.setVisible(true);                             
        this.addWindowListener(new WinClose());
	}
	public void run()                                  //线程体，必须是公有方法    
    {
        while (true)   //线程活动且没中断时//thread_rollby.isAlive() && !thread_rollby.isInterrupted())
            try
            {   
    			String s3 = text_C.getText();
    			int second,fulltime;
    	    	second=Integer.parseInt(s3);
            	String str="";
            	fulltime=second;
            	int k=fulltime;
            	str+=fulltime;
            	for(int i=1;i<=k+1;i++)
            	{if(i<=k)
            		{text_D.setText(str);
                 Thread.sleep(sleeptime);        //线程睡眠，抛出中断异常
                 fulltime--;
                 str="";
                 str+=fulltime;}
            	else text_D.setText(str);
            	}
            	break;
            }
            catch(InterruptedException e)
            {
               break;                                 //退出循环
            }
    }                                                  //run()方法结束，线程对象终止
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==button_d)
		{
			thread=new Thread(this);
			thread.start();
		}
		if (e.getSource()==button_e)
		{
			thread.interrupt();
			String s3 = text_D.getText();
			text_C.setText(s3);	
		}
		if (e.getSource()==button_f)
		{
			thread.interrupt();
			String s3 ="";
			text_C.setText(s3);
			text_D.setText(s3);
		}
	}
	public static void main(String[] args)
	{
		new Time();
	}
}
class WinClose implements WindowListener         //实现窗口事件监听器接口
{
  public void windowClosing(WindowEvent e)     //窗口关闭事件处理方法
  {
      System.exit(0);                          //结束程序运行
  }

  public void windowOpened(WindowEvent e)         {  }
  public void windowActivated(WindowEvent e)      {  }
  public void windowDeactivated(WindowEvent e)    {  }
  public void windowClosed(WindowEvent e)         {  }
  public void windowIconified(WindowEvent e)      {  }
  public void windowDeiconified(WindowEvent e)    {  }
}