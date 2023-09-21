import java.util.Scanner;

class Tic_Tack_Toy {
  public static void main(String [] Arg)
  {
  Scanner sobj = new Scanner(System.in);
  System.out.println("Enter the Choice (E for Exit )  and (N for new Game)");
  char iChoice = sobj.next().charAt(0);
 
  while(true)
  {
    if(iChoice == 'E')
    {
      System.out.println("Thank you for playing ");
        break;
    }
    else if(iChoice == 'N')
    {
       Tik_Tac tobj = new Tik_Tac();
      tobj.Start_game();
    }
    else
    {
     System.out.println("Wrong Entry \n s");
    }
  System.out.println("\nEnter the Choice (E for Exit )  and (N for new Game)");
    iChoice = sobj.next().charAt(0);
  }   
  }
}

class Tik_Tac
{
  final private int iSize = 9 ;     // this is fix size TiCk_Tak Game Array 
  private char Trr[];               //  This is main array where our position get stored 
  private int iPos;                 //  X and O get stored on this Position 
  private int iCount;               //  iCount varible for chainging sequence of X O 
  private int iCHArr[];             //   Array for checking  Entery is Wrong or right
  

  public Tik_Tac ()  
  {
    System.out.println("Game Start ");
    iCount = 0;
     Trr = new char[iSize];
     iCHArr = new int [iSize];
     System.out.println("Enter the Position for your X and O ");
     System.out.println("1 | 2 | 3\t\n----------\n4 | 5 | 6\n----------\n7 | 8 | 9");
     System.out.println("Replace X and Y on Numrical values");
     int i = 0;
    //  Trr[0] = 'A';
    //  Trr[1] = 'B';
    //  Trr[2] = 'C';
    //  Trr[3] = 'D'; 
    //  Trr[4] = 'E';
    //  Trr[5] = 'F';
    //  Trr[6] = 'G';
    //  Trr[7] = 'H';
    //  Trr[8] = 'I';
  }

  public int Count()
  {
   return iCount;
  }

  public void Start_game()
  {
    char iAns =0;
    while(iCount < iSize)
    {
     this.Accept();
      iCount++;
    if(iCount >= 5)
    {
    //  System.out.println("Comparing  started ");
      iAns = this.Check();
      if(iAns == 'X'  || iAns == 'O')
      {
       System.out.println("\n"+iAns+"  You win the match ");
       break;
      }
     }  
   }
  }
  public char Check()
  
  {
    int i=0;
   
    if((Trr[0] == Trr [1]) &&  (Trr[0] == Trr [2]))       //  1
    {
      System.out.println(" Line 1 Checking  90 Line Executed and ");
      return Trr[0];
    }

    else if(Trr[0] == Trr [3] &&  Trr[0] == Trr [6])     // 2
    {
      System.out.println("Line 2 Checking   95 Line Executed and ");
      return Trr[0];
    }
    else if(Trr[0] == Trr [4] &&  Trr[0] == Trr [8])     // 8
    {
      System.out.println("Line 8 Checking   100  Line Executed and");
      return Trr[0];
    }
    else if(Trr[3] == Trr [4] &&  Trr[3] == Trr [5])     // 3
    {
      System.out.println("Line 3 Checking   105  Line Executed and");
      return Trr[3];
    }
    else if(Trr[6] == Trr [4] &&  Trr[6] == Trr [2])    //  4
    {
    System.out.println("Line 4 Checking   110 Line Executed and");
      return Trr[6];
    }
    else if(Trr[6] == Trr [7] &&  Trr[6] == Trr [8])   //  5   
    {
      System.out.println("Line 5 Checking   115  Line Executed and");
      return Trr[6];
    }
    else if(Trr[2] == Trr [5] &&  Trr[2] == Trr [8])    //  6
    {
      System.out.println("Line 6 Checking   120  Line Executed and");
      return Trr[2];
    }
    else if(Trr[3] == Trr[4] && Trr[3] == Trr[5])      //      7
    {
        System.out.println("Line 7 Checking   125 Line Executed and");
      return Trr[3];
    }
     else if(Trr[1] == Trr[4] && Trr[1] == Trr[7])      //      7
    {
    System.out.println("Line 8 Checking   130  Line Executed and");     //    8 middale Line Check
      return Trr[1];
    }
    return 'A';
  }
  public void Accept()
  {
   int A = 0;      //  integer for Arr position updation 
   boolean bAns = true;
   int iCou =this.Count();
   Scanner sobj = new Scanner(System.in);
   System.out.println("Enter the Position (1 To 9)");
   iPos = sobj.nextInt();
   bAns = this. bCheck(iPos);
   if(bAns == false)
   {
    System.out.println("Wrong Entery \n please renter your position ");
     Accept();
   }
   iCHArr[A] = iPos-1;
   A++;
   
   if(iCou % 2 == 0)
   {
   Trr[iPos-1] ='X';
   }
   else
   {
    Trr[iPos-1] ='O';
   }
   this.Display();
   }

   public void Display()
   {
       System.out.println("Updated positions is ");
   System.out.println(Trr[0]+" | "+Trr[1]+" | "+Trr[2]+"\n----------\n"+Trr[3]+" | "+Trr[4]+" |  "+Trr[5]+"\n----------\n"+Trr[6]+" | "+Trr[7]+" | "+Trr[8]);
  }

  public void NotE_Enter()                              // this funtion insruct to payer which number not Enter again                             //        this funtion will to player Not nter this thing 
  {   if(iCount == 0)
    {
        return;
    }
    System.out.println("Please dont enter following Numbers");
    int i = 0;
    for(i = 0; i < iCount ; i++)
    {
      System.out.println(iCHArr[i]+"\t");
    }
  }


    public boolean bCheck(int iPos)      //   this function for position checking this Number is already entered or not
    {
      boolean bChe = true;
     for(int i=0; i<iCount; i++)
     {
      if(iCHArr[i] == iPos)
      {
        bChe = false;
        break;
      }
     }

      return bChe;
    }

}