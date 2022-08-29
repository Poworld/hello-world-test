import java.net.URL;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AccountingArrayApp {
  public static void main(String[] args) throws Exception{

    JOptionPane input = new JOptionPane();
    
    ImageIcon icon = new ImageIcon("images/java_icon.png");//.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));

    double supplyValue = Double.parseDouble((String)input.showInputDialog(null,"계산할 수를 입력하세요 : ", "Accounting", JOptionPane.INFORMATION_MESSAGE, icon, null, ""));
    double vat = supplyValue * 0.1;
    double total = supplyValue + vat;
    double expense = supplyValue * 0.3;
    double income = supplyValue - expense;

    double[] dividendRates = new double[3];
    dividendRates[0] = 0.5;
    dividendRates[1] = 0.3;
    dividendRates[2] = 0.2;

    double dividend1 = income * dividendRates[0];
    double dividend2 = income * dividendRates[1];
    double dividend3 = income * dividendRates[2];
    
    System.out.println("Value of supply : " + supplyValue);
    System.out.println("VAT : " + vat);
    System.out.println("Total : " + total);
    System.out.println("Expense : " + expense);
    System.out.println("Income : " + income);
    System.out.println("Dividend1 : " + dividend1);
    System.out.println("Dividend2 : " + dividend2);
    System.out.println("Dividend3 : " + dividend3);
  }
}