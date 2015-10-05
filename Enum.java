import javax.swing.JOptionPane;
	public class Enum{
	public enum Month {January, February, March, April, May, June, July, August, September, October, November, December}  
	public static void main (String [] args){
	Month [] choices= {Month.January, Month.February, Month.March, Month.April, Month.May, Month.June, Month.July, Month.August, Month.September, Month.October, Month.November, Month.December};
	Month select =(Month) JOptionPane.showInputDialog(null,"Select your favorite month","Month",JOptionPane.QUESTION_MESSAGE,null, choices, choices[0]);
	while(select!=null){
	switch (select){
	case January:
	case February:
	case December:
	JOptionPane.showMessageDialog(null,"Do you want to build a snowman?");
	break;
	case March:
	case April:
	case May:
	JOptionPane.showMessageDialog(null,"Happy Spring days!");
	break;
	case June:
	case July:
	case August:
	JOptionPane.showMessageDialog(null,"It's a summer time");
	break;
	default:
	JOptionPane.showMessageDialog(null,"Welcome to the foliage season!");
	}
	select =(Month) JOptionPane.showInputDialog(null,"Select yoru favorite month","Month",JOptionPane.QUESTION_MESSAGE,null, choices, choices[0]);
	}
	JOptionPane.showMessageDialog(null,"Goodbye!");
	}
	}
