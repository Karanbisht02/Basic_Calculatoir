import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator_1 implements ActionListener
{	  
         Frame f;
        String  str[]={"+","-","*","/","9","8","7","6","5","4","3","2","1","0","C","="};
         Button b[] = new Button[str.length];
         TextField tf;
         String  s1="";
	      String s2="";
		  String s3="";
		  String s4="";
		  String result="";
		  int num2=0;
		  int c=0;
      Calculator_1(String s)
      {
	    f= new Frame(s);
	      
		 
		  
		 tf=new TextField();
         tf.setBounds(30,30,350,80);
		 f.add(tf);
		 
		 
		  int a=90,d=140,m=0;
		
		 for(int i=0;i<str.length;i++)
		 {  
		   b[i]=new Button(str[i]);
		   b[i].setBounds((40+(m*a)),d,50,50);
		   b[i].addActionListener(this);
		   m++;
		   if(i==3||i==7||i==11)
		   {
			   m=0;
			   d=d+90;
			}
		       f.add(b[i]);
		  }
		       f.addWindowListener(new Window_close());
		       f.setLayout(null);
		       f.setSize(500,500);
		       f.setVisible(true);
	
	  }
      
     public static void main(String [] args)
	 {
	     new Calculator_1("Calculator");
      }
	
	public void actionPerformed(ActionEvent e)
	{
	    
	     System.out.println("helo");
	     if(e.getSource()==b[0])
	     {  
	          s3=tf.getText();
	          tf.setText("");
		      c=1;
		      
		 }
		 if(e.getSource()==b[1])
	     {
		     s3=tf.getText();
	          tf.setText("");
			   c=2;  

		 }
		 if(e.getSource()==b[2])
	     {
		      s3=tf.getText();
	          tf.setText("");
			   c=3; 
		      
		 }
		 if(e.getSource()==b[3])
	     {
		      s3=tf.getText();
	          tf.setText("");
			   c=4; 
		    
		 }
		 if(e.getSource()==b[4])
	     {
		     s1=tf.getText();
		     s2="9";
		     result=s1+s2;
		     tf.setText(result);
		      
		 }
		 if(e.getSource()==b[5])
	     {
		     
		     s1=tf.getText();
		     s2="8";
		     result=s1+s2;
		     tf.setText(result);
		 }
		 if(e.getSource()==b[6])
	     {
	         s1=tf.getText();
	         s2="7";
	         result=s1+s2;
		     tf.setText(result);
		 }
		 if(e.getSource()==b[7])
	     {
	         s1=tf.getText();
	         s2="6";
	         result=s1+s2;
		     tf.setText(result);
		 }
		 if(e.getSource()==b[8])
	     {
	        s1=tf.getText();
	        s2="5";
	        result=s1+s2;
		     tf.setText(result);
		 }
		 if(e.getSource()==b[9])
	     {
	        s1=tf.getText();
	        s2="4";
	        result=s1+s2;
		    tf.setText(result);
		    
		 }
		 if(e.getSource()==b[10])
	     {
		    s1=tf.getText();
	        s2="3";
	        result=s1+s2;
		    tf.setText(result);
		 }
		 if(e.getSource()==b[11])
	     {
		     
		     s1=tf.getText();
	        s2="2";
	        result=s1+s2;
		    tf.setText(result);
		 }
		 if(e.getSource()==b[12])
	     {
		     s1=tf.getText();
	        s2="1";
	        result=s1+s2;
		    tf.setText(result);
		 }
		 if(e.getSource()==b[13])
	     {
		     s1=tf.getText();
	        s2="0";
	        result=s1+s2;
		    tf.setText(result);
		 }
		 if(e.getSource()==b[14])
	     {
		     tf.setText("");
		 }
		 if(e.getSource()==b[15])
	     {
		     s4=tf.getText();
		     tf.setText("");
		     if(c==1)
		     {
		      num2=Integer.parseInt(s3)+Integer.parseInt(s4);
		      String z=String.valueOf(num2);
		      tf.setText(z);
		     }
		     else if(c==2)
		     {
		      num2=Integer.parseInt(s3)-Integer.parseInt(s4);
		      String z=String.valueOf(num2);
		      tf.setText(z);
		     }
		     else if(c==3)
		     {
		      num2=Integer.parseInt(s3)*Integer.parseInt(s4);
		      String z=String.valueOf(num2);
		      tf.setText(z);
		     }
		     else if(c==4)
		     {
		      num2=Integer.parseInt(s3)/Integer.parseInt(s4);
		      String z=String.valueOf(num2);
		      tf.setText(z);
		     }
		 }
		 
	}
}
class Window_close extends WindowAdapter
{
     public void windowClosing(WindowEvent e1)
     {
	     System.exit(0);
	 }
}

