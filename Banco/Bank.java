package Banco;

public class Bank{
    CheckingAccount accountOne;
    private CheckingAccount accountTwo;
    
    public Bank(){
      accountOne = new CheckingAccount("Zeus", 100, "1");
      accountTwo = new CheckingAccount("Hades", 200, "2");
    }
    
  }
