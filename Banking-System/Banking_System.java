import java.util.Scanner;
class ds_individual{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        list l=new list();
        l.initialaddaccountdetail();
        System.out.println();
        System.out.println();
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("*         Welcome Bank Account Application          *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println();
        while(true){
            System.out.println();
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("* Please Select Your Choice                         *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("*                                                   *");
            System.out.println("*  1] login                                         *");
            System.out.println("*  2] open digital Saving Account                   *");
            System.out.println("*  3] Exit                                          *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * *");
            System.out.print("* Enter your choice: ");
            int ch = sc.nextInt();       //user enter choice hear
            switch (ch) {
                case 1:{
                    System.out.print("Enter your mobile number :");
                    String User_mobile = sc.next(); 
                    System.out.print("Enter your app login pin :");
                    int User_login = sc.nextInt();                   //enter mobile number linked with account number
                    boolean mobilechecker=l.numberchecker(User_mobile);
                    boolean userchecker;
                    if(mobilechecker){
                        userchecker=l.userchecker(User_mobile, User_login);
                    }
                    else{
                        System.out.println("Enter valid number");
                        break;
                    }
                    while(true){
                    if(userchecker){
                        boolean exitflag=true;
                        do{
                            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * *");
                            System.out.println("* Please Select Your Choice                         *");
                            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * *");
                            System.out.println("*                                                   *");
                            System.out.println("*  1] Show All Acount Details                       *");
                            System.out.println("*  2] See Your Account Details                      *");
                            System.out.println("*  3] Check balance                                 *");
                            System.out.println("*  4] Withdraw Amount                               *");
                            System.out.println("*  5] Deposite Amount                               *");
                            System.out.println("*  6] Change PIN                                    *");
                            System.out.println("*  7] Delete Account                                *");
                            System.out.println("*  8] Exit                                          *");
                            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * *");
                            System.out.print("* Enter your choice: ");
                        int  ch1 = sc.nextInt();   //user enter choice hear
                        switch (ch1) {
                                case 1: {
                                    l.display();
                                break;
                                }
                                case 2:{
                                    System.out.print("Enter Your Pin : ");
                                    int Pin = sc.nextInt();    //user enter pin hear
                                    boolean found2 = false;    //check user enter pin is link with bank account or not
                                    found2=l.userchecker(User_mobile,Pin);
                                    if (!found2) {
                                        System.out.println("\n\n-------------------!!!\nInvalid Pin..!!\n-------------------!!!\n\n");
                                    }
                                    else{
                                        l.accountdetail(User_mobile,Pin);
                                    }
                                    break;
                                }
                                case 3:{
                                    System.out.print("Enter Your Pin : ");
                                    int Pin = sc.nextInt();    //user enter pin hear
                                    boolean found2 = false;    //check user enter pin is link with bank account or not
                                    found2=l.userchecker(User_mobile,Pin);
                                    if (!found2) {
                                        System.out.println("\n\n-------------------!!!\nInvalid Pin..!!\n-------------------!!!\n\n");
                                    }
                                    else{
                                    l.balancedisplay(User_mobile,Pin);
                                    }
                                break;
                                }
                                case 4:{
                                    System.out.print("Enter Your Pin : ");
                                    int Pin = sc.nextInt();    //user enter pin hear
                                    System.out.print("Enter amount You want to Withdraw: ");
                                    double amount=sc.nextDouble();
                                    boolean found2 = false;    //check user enter pin is link with bank account or not
                                    found2=l.userchecker(User_mobile,Pin);
                                    if (!found2) {
                                        System.out.println("\n\n-------------------!!!\nInvalid Pin..!!\n-------------------!!!\n\n");
                                    }
                                    else{
                                        l.withdraw(User_mobile,Pin, amount);
                                    }
                                break;
                                }
                                case 5:{
                                    System.out.print("Enter Your Pin : ");
                                    int Pin = sc.nextInt();    //user enter pin hear
                                    System.out.print("Enter amount You want to Deposite: ");
                                    double amount=sc.nextDouble();
                                    boolean found2 = false;    //check user enter pin is link with bank account or not
                                    found2=l.userchecker(User_mobile,Pin);
                                    if (!found2) {
                                        System.out.println("\n\n-------------------!!!\nInvalid Pin..!!\n-------------------!!!\n\n");
                                    }
                                    else{
                                        l.Deposite(User_mobile,Pin, amount);
                                    }
                                break;
                                }
                                case 6:{
                                    System.out.print("Enter Your Pin : ");
                                    int Pin = sc.nextInt();    //user enter pin hear
                                    boolean found2 = false;    //check user enter pin is link with bank account or not
                                    found2=l.userchecker(User_mobile,Pin);
                                    l.Change_PIN(User_mobile,Pin);
                                    if (!found2) {
                                        System.out.println("\n\n-------------------!!!\nInvalid Pin..!!\n-------------------!!!\n\n");
                                    }
                                break;
                                }
                                case 7:{
                                        System.out.print("Enter Your Pin : ");
                                        int Pin = sc.nextInt();    //user enter pin hear
                                        boolean found2 = false;    //check user enter pin is link with bank account or not
                                        found2=l.userchecker(User_mobile,Pin);
                                        if (!found2) {
                                            System.out.println("\n\n-------------------!!!\nInvalid Pin..!!\n-------------------!!!\n\n");
                                            break;
                                        }
                                        else{
                                            l.deleteValue(User_login);
                                        }
                                }
                                case 8:{
                                        exitflag=false;
                                    break;
                                }
                                default:{
                                    System.out.println("\n\n-------------------!!!\nInvalid Choice..!!\n-------------------!!!\n\n");
                                    break;
                                }
                            }
                        }while(exitflag); 
                        if(exitflag==false){break;}
                    } 
                    else{
                            System.out.println("...NO user found...");
                            break; 
                        }

                    }
                    break; 
                    }
                case 2:{
                        long account_number=l.checkaccount_no();
                        sc.nextLine();
                        System.out.println("Enter account holder name");
                        String account_name=sc.nextLine();
                        System.out.println("Enter account holder Email");
                        String account_Email=sc.nextLine();
                        String account_phonenumber=l.checkphone_no();
                        System.out.println("Enter Account Holder Age");
                        int age=sc.nextInt();
                        boolean C_P_found = false;
                        int account_pin=0;
                        while (C_P_found == false) {
                            System.out.println("Enter Account Pin");
                            account_pin=sc.nextInt();
                            if (account_pin >= 1000 && account_pin <= 9999) {
                                    C_P_found = true;
                                    break;
                            }       
                            else {
                                System.out.println("\n\n-------------------------------------------!!!\nInvalid Combination , Enter valid PIN\n-------------------------------------------!!!\n\n");
                                C_P_found = false;
                            }
                        }
                        System.out.println("Enter Amount you want to Deposite in your Acconunt");
                        double account_balance=sc.nextDouble();
                        Account account=new Account(account_name, account_number, age, account_balance, account_pin, 
                        account_phonenumber, account_Email);
                        l.insertAtLast(account);
                        }
                    break;
                
                case 3:{
                    System.out.println();
                    System.out.println("     Thank you for using our banking services      ");
                    System.exit(0); 
                }
                default:{
                    System.out.println("\n\n-------------------!!!\nInvalid Choice..!!\n-------------------!!!\n\n");
                    break;
                }
            }
        }
    }
}

class list{
    class Node{
        Account account;
        Node next;
        Node prev;
        Node(Account account) {
            this.account = account;
            this.next = null;
            this.prev = null;
        }
    }
    Node First = null;
    void insertAtLast(Account account) {
        Node newNode = new Node(account);
        if (First == null) {
            First = newNode; 
        } 
        else {
            Node temp = First;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    void deleteValue(int User_login){
        if(First== null){
            System.out.println("Empty");
        }
        else if(First.account.Account_pin == User_login){
            First=First.next;
            if(First!=null){
                First.prev = null;
            }
        }
        else{
            Node temp = First;
            while(temp!=null && temp.account.Account_pin != User_login){
                temp = temp.next;
            }
            if(temp!= null){
                temp.prev.next = temp.next;
                if(temp.next!=null)
                    temp.next.prev= temp.prev;
                else {
                    temp.prev = null;
                }
            }
            else{                    
                System.out.println("Account not found");
            }
        }
    }
    void display() {
        if (First == null)
        {
            System.out.println("No Account Added");
        }
        else
        {                      
            Node temp = First;
            do{
                System.out.println("\n\n  $$$--------------------------------$$$\n ");
                System.out.println("Account Number:"+temp.account.Account_number);
                System.out.println("Account Holder Name:"+temp.account.Account_name);
                System.out.println("Account Holder Phone number:"+temp.account.Account_phonenumber);
                //System.out.println("Account Holder Pin:"+temp.account.Account_pin);
                System.out.println("Account Balance:"+temp.account.Acconunt_balance);
                System.out.println("\n\n  $$$--------------------------------$$$\n ");
                temp = temp.next;
            }while (temp != null);
        }
    }

    boolean userchecker(String User_mobile,int User_login){
        Node valueCheck=First;
        Node temp=null;
        int flag = 0;
        while (valueCheck != null) {
            if (valueCheck.account.Account_phonenumber.equals(User_mobile)) {
                flag = 1;
                temp=valueCheck;
            }
            valueCheck = valueCheck.next;
        }
        if (temp.account.Account_pin==User_login) {
            return true;
        }
        else{
            return false;
        }
    }
    boolean numberchecker(String User_mobile){
        Node valueCheck=First;
        int flag = 0;
        while (valueCheck != null) {
            if (valueCheck.account.Account_phonenumber.equals(User_mobile)) {
                flag = 1;
            }
            valueCheck = valueCheck.next;
        }
        if (flag == 0) {
            return false;
        }
        else{
            return true;
        }
    }
    void accountdetail(String User_mobile,int User_login){
        Node valueCheck=First;
        Node temp=null;
        int flag = 0;
        while (valueCheck != null) {
            if (valueCheck.account.Account_phonenumber.equals(User_mobile) && valueCheck.account.Account_pin==User_login) {
                flag = 1;
                temp=valueCheck;
            }   
            valueCheck = valueCheck.next;
        }
        if (flag == 0) {
            System.out.println("...Invalid Pin found...");
        }
        else{
            System.out.println("\n\n  $$$--------------------------------$$$\n ");
            System.out.println("Account Number:"+temp.account.Account_number);
            System.out.println("Account Holder Name:"+temp.account.Account_name);
            System.out.println("Account Holder Phone number:"+temp.account.Account_phonenumber);
            System.out.println("Account Holder Pin:"+temp.account.Account_pin);
            System.out.println("Account Holder Age:"+temp.account.Accholder_age);
            System.out.println("Account Holder Email:"+temp.account.Accounholder_Email+"@gmail.com");
            System.out.println("Account Balance:"+temp.account.Acconunt_balance);
            System.out.println( "\n  $$$--------------------------------$$$\n\n");
        }
    }

    void balancedisplay(String User_mobile,int User_login){
        Node valueCheck=First;
        Node temp=null;
        int flag = 0;
        while (valueCheck != null) {
            if (valueCheck.account.Account_phonenumber.equals(User_mobile) && valueCheck.account.Account_pin==User_login) {
                flag = 1;
                temp=valueCheck;
            }
            valueCheck = valueCheck.next;
        }
        if (flag == 0) {
            System.out.println("...NO Phonenumber found...");
        }
        else{
            System.out.println("\n\n  $$$--------------------------------$$$\n  Balance :" + temp.account.Acconunt_balance + "\n  $$$--------------------------------$$$\n\n");
        }
    }
    void withdraw(String User_mobile,int User_login,double amount){
        Node valueCheck=First;
        Node temp=null;
        int flag = 0;
        while (valueCheck != null) {
            if (valueCheck.account.Account_phonenumber.equals(User_mobile) && valueCheck.account.Account_pin==User_login) {
                flag = 1;
                temp=valueCheck;
            }
            valueCheck = valueCheck.next;
        }
        if (flag == 0) {
            System.out.println("...NO Phonenumber found...");
        }
        else{
            if(temp.account.Acconunt_balance>amount){
                System.out.println("--------------Withdrawal Susuccessfully------------");
                temp.account.Acconunt_balance=temp.account.Acconunt_balance-amount;
                System.out.println("Your Remaining balance is:");
                System.out.println("\n\n  $$$--------------------------------$$$\n  Balance :" + temp.account.Acconunt_balance + "\n  $$$--------------------------------$$$\n\n");
            }
            else{
                System.out.println("Not Enough Balance");
            }
        }
    }
    void Deposite(String User_mobile,int User_login,double amount){
        Node valueCheck=First;
        Node temp=null;
        int flag = 0;
        while (valueCheck != null) {
            if (valueCheck.account.Account_phonenumber.equals(User_mobile) && valueCheck.account.Account_pin==User_login) {
                flag = 1;
                temp=valueCheck;
            }
            valueCheck = valueCheck.next;
        }
        if (flag == 0) {
            System.out.println("...NO Phonenumber found...");
        }
        else{
            if(temp.account.Acconunt_balance>amount){
                System.out.println("--------------Deposite Susuccessfully------------");
                temp.account.Acconunt_balance=temp.account.Acconunt_balance+amount;
                System.out.println("Your Updated balance is:");
                System.out.println("\n\n  $$$--------------------------------$$$\n  Balance :" + temp.account.Acconunt_balance + "\n  $$$--------------------------------$$$\n\n");
            }
        }
    }

    void Change_PIN(String User_mobile,int User_login){
        Node valueCheck=First;
        Node temp=null;
        int flag = 0;
        while (valueCheck != null) {
            if (valueCheck.account.Account_phonenumber.equals(User_mobile) && valueCheck.account.Account_pin==User_login) {
                flag = 1;
                temp=valueCheck;
            }
            valueCheck = valueCheck.next;
        }
        if (flag == 0) {
            System.out.println("...NO Phonenumber found...");
        }
        else{
            Scanner sc=new Scanner(System.in);
            System.out.println("\n============= Change PIN =============\n");
            boolean C_P_found = false;
            while (C_P_found == false) {
                System.out.println("Enter New PIN :");
                int PIN1 = sc.nextInt();
                System.out.println("Conform New PIN :");
                int PIN2 = sc.nextInt();
                if (PIN1 == PIN2 && PIN1 >= 1000 && PIN1 <= 9999) {
                    User_login= PIN1;
                    C_P_found = true;
                    System.out.println("\n\n $$$------------------------------$$$\n     PIN Successfully Change...\n $$$------------------------------$$$\n\n");
                    temp.account.Account_pin=PIN1;
                    break;
                }       
                else {
                    System.out.println("\n\n-------------------------------------------!!!\nInvalid Combination , Enter valid PIN\n-------------------------------------------!!!\n\n");
                    C_P_found = false;
                }
            }
        }
    }
    
    void initialaddaccountdetail(){
        Account acc1=new Account("DODIYA MAYURDHVAJSINH PRAVINSINH",1234567801,19,50000.00,1101,"9999999901","dodiyamayurdhvajsinh007");
        insertAtLast(acc1);
        Account acc2=new Account("MALL PRINCE MAHENDRAPAL",1234567802, 19, 50000, 1102, "9999999902", "MALLPRINCE23");
        Account acc3=new Account("PATEL MEET MADHAVLAL",1234567803, 20, 50000, 1103, "9999999903", "meetmadhavlal99");
        Account acc4=new Account("PATEL RUDRA PANKAJBHAI",1234567804, 21, 50000, 1104, "9999999904", "rudrapatel55");
        Account acc5=new Account("CHUHAN AJAY JAGDISHBHAI",1234567805, 19, 50000, 1105, "9999999905", "ajayjagdishbhaichauhan81");
        Account acc6=new Account("GAMI PRANAVKUMAR GHANSHYAMBHAI",1234567806, 22, 50000, 1106, "9999999906", "pranavgami98");
        Account acc7=new Account("GAMBHAVA BHAVYA JAGDISHBHAI",1234567807, 25, 50000, 1107, "9999999907", "gambhavabhavy456");
        Account acc8=new Account("THAKKAR HET RAJESHBHAI",1234567808, 20, 50000, 1108, "9999999908", "hetrajeshbhaithakkar121");
        Account acc9=new Account("PATEL PRIT PRAKASHKUMAR",1234567809, 28, 50000, 1109, "9999999909", "PRITPATEL32");
        Account acc10=new Account("MALL HELLY VIJAYBHAI",1234567810, 30, 50000, 1110, "9999999910", "mallhelly23");
        insertAtLast(acc2);
        insertAtLast(acc3);
        insertAtLast(acc4);
        insertAtLast(acc5);
        insertAtLast(acc6);
        insertAtLast(acc7);
        insertAtLast(acc8);
        insertAtLast(acc9);
        insertAtLast(acc10);
    }
    Scanner sc=new Scanner(System.in);     // check Phone_no is only 12 digit not a charter method no:1
    String checkphone_no(){
		String s="";     // given input score in this verybal
		int flag=0;       // come out side the for loop                  
		
		for(int i=0;flag==0;i++)
		{
			int count=0;     // check how many digit enter
			System.out.print("Enter Account Holder phone_no: ");
			s=sc.nextLine();
			if(s.length()==10)
			{
				for(int j=0;j<10;j++)
				{
					if(s.charAt(j)>='0'&&s.charAt(j)<='9'){count++;}
					else{System.out.println("Enter Only Digit For Phone No");break;}
					if(count==10){flag=1;}
				}
			}
			else{System.out.println("Enter 10 Digit Phone No");}
			if(flag==1){break;}
		}
		return(s);
	}                                       // check account_no is only 12 digit not a charter method no:1
    long checkaccount_no(){
		String s="";     // given input score in this verybal
		int flag=0;       // come out side the for loop                  
		
		for(int i=0;flag==0;i++)
		{
			int count=0;     // check how many digit enter
			System.out.print("Enter Account_no: ");
			s=sc.nextLine();
			if(s.length()==12)
			{
				for(int j=0;j<12;j++)
				{
					if(s.charAt(j)>='0'&&s.charAt(j)<='9'){count++;}
					else{System.out.println("Enter Only Digit For Account No");break;}
					if(count==12){flag=1;}
				}
			}
			else{System.out.println("Enter 12 Digit Account No");}
			if(flag==1){break;}
		}
		return(Long.parseLong(s));
	}
}

class Account{
    long Account_number;
    String Account_name;
    int Accholder_age;
    int Account_pin;
    String Account_phonenumber;
    double Acconunt_balance;
    String Accounholder_Email;
    public Account(String account_name,long account_number,int accholder_age, double acconunt_balance,int account_pin, String account_phonenumber,String accounholder_Email) {
        Account_number = account_number;
        Account_name = account_name;
        Accholder_age = accholder_age;
        Account_pin = account_pin;
        Account_phonenumber = account_phonenumber;
        Acconunt_balance = acconunt_balance;
        Accounholder_Email = accounholder_Email;
    }
}