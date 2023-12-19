
 
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  



class RanDomGUI
{
 public static void main(String [] Arg)
 {
  Number nobj = new Number();
  int iGs = nobj.NumberGentor();
  AWTEXP1 aobj = new AWTEXP1(iGs);

 }
  }

  class Number
  {
     public int NumberGentor()
   {
    int iNum=0;
    Scanner sobj2 = new Scanner(System.in);
    iNum = (int)((Math.random() + Math.random()+ Math.random()) * 40);
    return iNum;
   }
  }

 class AWTEXP1 extends Frame implements ActionListener
 {
    public TextField Text1;        // Aceept User Input
    public int GetGesser;
    public Label LBHelper; 
    public Button ButtoN,FButt2,FButt12;
    public Frame Frame1,Frame2;
    
   public AWTEXP1 (int XNum)
    {
        GetGesser = XNum;
        Frame1 = new Frame();
        Frame2 = new Frame();
        LBHelper= new Label(" Lets Gess magic Number ");
        Label LB = new Label("  Welcome ");

        ButtoN = new Button("Check");
        FButt2 = new Button( " Start Game");
        FButt12 = new Button(" Exit");
       
        // Create Componets
        Text1 = new TextField();
        
         
        
        LB.setBounds(200,30,70,30);
        Text1.setBounds(90,150,150,20);
        ButtoN.setBounds(90,200,150,30);
       
        LBHelper.setBounds(90,100,200,30);

        // for frame 2
        FButt2.setBounds(90,100,150,30);
        FButt12.setBounds(90,150,150,30);
       
        // register listner

        ButtoN.addActionListener(this); // passing currunt instance

        FButt2.addActionListener(this);
        FButt12.addActionListener(this);
        

        // add add compponents and set size,layOut and visibility
        Frame1.add(ButtoN);
        Frame1.add(LB);
        Frame1.add(Text1);
        Frame1.add(LBHelper);
       
        Frame2.add(FButt2);
        Frame2.add(FButt12);
       
        Frame1.setTitle("Magic_Number");

        Frame1.setSize(500,300);

        Frame1.setLayout(null);


         Frame2.setTitle("First_Page");
         Frame2.setSize(500,300);
         Frame2.setLayout(null);
  

        // Frame is by Default is not visible so we send true para for visible
        Frame2.setVisible(true);
        LB.setBackground(Color.green);

        ButtoN.setBackground(Color.ORANGE);
        Text1.setBackground(Color.yellow);
        
        Frame2.setBackground(Color.blue);

    }

    public void actionPerformed(ActionEvent e)
    {
        try{
        if(e.getSource() == FButt2)
        { Frame2.setVisible(false);
          Frame1.setVisible(true);
        }
        else if(e.getSource() == FButt12)
        {
           Frame2.setVisible(false);
        }
       if(e.getSource() == ButtoN)
       {
        int No1 =Integer.parseInt(Text1.getText());
        if(No1 == GetGesser) 
        {
          LBHelper.setText(" Great ,You Win ");
          LBHelper.setBackground(Color.PINK);
          // Frame1.setVisible(false);
        }
        else if(No1 > GetGesser)
        {
          LBHelper.setText(" OPPS , Big number is Entered ");
          LBHelper.setBackground(Color.red);
        }
          else if(No1 < GetGesser)
        {
          LBHelper.setText(" OPPS , Small number is Entered ");
           LBHelper.setBackground(Color.red); 
        }
        else
        {
           LBHelper.setText(" Please Enter the Number ");
           LBHelper.setBackground(Color.red);
        }
        Text1.setText("");
      }

        }
        catch(Exception eobj)
        {}
    }

    public void SwitchGame()
    {

    }
    public void SwitchMain()
    {

    }

}




//   if it press then open this Frame or Exit form here