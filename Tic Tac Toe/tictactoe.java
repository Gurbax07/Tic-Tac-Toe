public class tictactoe
{
    public static void main (String args[])
    {
 new tictactoe ();
    }

    char a = ' ';
    char b = ' ';
    char c = ' ';
    char d = ' ';
    char e = ' ';
    char f = ' ';
    char g = ' ';
    char h = ' ';
    char i = ' ';

    char turn = 'X';

    public tictactoe ()
    {
 while (!winner ())
 {
     printboard ();
     makemove (turn);
     if (turn == 'X')
  turn = 'O';
     else
  turn = 'X';
 }
 printboard ();
 System.out.println ("\nThe winner is " + printWinner ());

    }


    public void printboard ()
    {
 //Print out the board like this:
System.out.println ("       1   2   3 ");
System.out.println ("    1  "+a+" | "+b+" | "+c+" ");
System.out.println ("     ------------");
System.out.println ("    2  "+d+" | "+e+" | "+f+" ");
System.out.println ("     ------------");
System.out.println ("    3  "+g+" | "+h+" | "+i+" ");
    //Instead of actually printing a, b, c etc, output the variables in that postion
    }


    public void makemove (char piece)
    {
 int x = IBIO.inputInt ("\nEnter the x-coordinate: ");
 int y = IBIO.inputInt ("Enter the y-coordinate: ");
 while (!isValid (x, y))
 {
     System.out.println ("Error - invalid coordinate. Try again.");
     x = IBIO.inputInt ("\nEnter the x-coordinate: ");
     y = IBIO.inputInt ("Enter the y-coordinate: ");
 }
 if (x == 1 && y == 1)
     a = piece;
 else if (x == 2 && y == 1)
     b = piece;
 else if (x == 3 && y == 1)
     c = piece;
 else if (x == 1 && y == 2)
     d = piece;
 else if (x == 2 && y == 2)
     e = piece;
 else if (x == 3 && y == 2)
     f = piece;
 else if (x == 1 && y == 3)
     g = piece;
 else if (x == 2 && y == 3)
     h = piece;
 else if (x == 3 && y == 3)
     i = piece;
 //complete the other 7 spaces


    }


    public boolean isValid (int x, int y)
    {
 
      if (y<1 || y>3 || x<1 || x>3)
	return false;
 
      else if (x==1 && y==1 && a!=' ')
	return false;
      else if (x==2 && y==1 && b!=' ')
	return false;
      else if (x==3 && y==1 && c!=' ')
	return false;
      else if (x==1 && y==2 && d!=' ')
	return false;
      else if (x==2 && y==2 && e!=' ')
	return false;
      else if (x==3 && y==2 && f!=' ')
	return false;
      else if (x==1 && y==3 && g!=' ')
	return false;
      else if (x==2 && y==3 && h!=' ')
	return false;
      else if (x==3 && y==3 && i!=' ')
	return false;
      
      else
 return true;
    }


    public boolean winner ()
    { //the first line a-b-c is a match
 if (a == b && a == c && a != ' ') //top horizontal
     return true;
 else if (d == e && d == f && d != ' ') //middle horizontal
     return true;
 else if (g == h && g == i && g != ' ') //bottom horizontal
     return true;
 else if (a == d && a == g && a != ' ') //left vertical
     return true;
 else if (b == e && b == h && b != ' ') //middle vertical
     return true;
 else if (c == f && c == i && c != ' ') //right vertical
     return true;
 //complete the other six positions
 else if (c == e && c == g && c != ' ') //diagonal backwards
     return true;
 else if (a == e && a == i && a != ' ') //diagonal backwards
     return true;
 //complete the other 7 winning conditions
 else
     return false;
    }


    public char printWinner ()
    { //returns who is in the winning condition
 if (a == b && a == c && a != ' ') //top horizontal
     return a;
 else if (d == e && d == f && d != ' ') //middle horizontal
     return d;
 else if (g == h && g == i && g != ' ') //bottom horizontal
     return g;
 else if (a == d && a == g && a != ' ') //left vertical
     return a;
 else if (b == e && b == h && b != ' ') //middle vertical
     return b;
 else if (c == f && c == i && c != ' ') //right vertical
     return c;
 //complete the other six positions
 else if (c == e && c == g && c != ' ') //diagonal backwards
     return c;
 else //diagonal forwards
     return a;
    }
}
