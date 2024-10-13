import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
class parking{
    public static void main(String[] args) {
        Slots sloat[][] =new Slots[2][10];
        Slots s=new Slots(false); 
        for(int i=0;i<=1;i++){
            for(int j=0;j<=9;j++){
                sloat[i][j]=new Slots(false);
            }
        }
        s.Defult_Entry(sloat);
        Scanner sc=new Scanner(System.in);
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("*                                                   *");
        System.out.println("*                                                   *");
        System.out.println("*                   Welcome To                      *");
        System.out.println("*            Parking Menegment System               *");
        System.out.println("*                                                   *");
        System.out.println("*                                                   *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * *");
        boolean Exit_flag;
        do{
            Exit_flag=true;
            System.out.println("*-----plese enter given one Option-----*");
            System.out.println("1).car is Enter");
            System.out.println("2).car is Exit");
            System.out.println("3).Exit System");
            System.out.print("Enter Option number:");
            int car_Option=sc.nextInt();
            System.out.println();
            switch(car_Option){
                case 1 -> {
                            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * *");
                            String flag=s.Enter_Detail(sloat);
                            if(null == flag){
                                s.Display_Receipt(sloat);
                            }else switch (flag) {
                    case "" ->  {
                        System.out.println("*--------This Car is Already Park----------*");
                        continue;
                                }
                    case "B" -> System.out.println("*---------Parking is Full------------------*");
                    default -> s.Display_Receipt(sloat);
                }
                        }
                case 2 -> {
                            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * *");
                            if(s.Exit_Detail(sloat)){
                                s.Display_Payment_Receipt(sloat);
                                s.Exit_Detail_Remove(sloat);
                            }
                        }
                case 3 -> {
                            Exit_flag=false;
                        }
                default -> {
                            System.out.println("-----Enter Valied Option number -----");
                        }
            }
        }while(Exit_flag);
    }
}
class Slots{
    Scanner sc=new Scanner(System.in);
    String Name=null;
    String Car_no="";
    long Mobile_no=0;
    int Sloat_no=0;
    String Enter_Date_Time=null;
    String Exit_Date_Time=null;
    double Total_Minutes=0;
    int payment=0;
    boolean slot_full=false;
    int colum;
    int row;
    int total_full_parking_slot=0;
    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    int i=0;
    Slots(boolean slot_full){
        this.slot_full=slot_full;
    }
    void Defult_Entry(Slots[][] arr){
        LocalDateTime now=LocalDateTime.now();
        arr[0][0].slot_full=true;arr[0][0].Name="PATEL RISHI";arr[0][0].Car_no="GJ01AB0801";arr[0][0].Mobile_no=1234567891;arr[0][0].Enter_Date_Time=dtf.format(now);arr[0][0].Sloat_no=1;
        arr[0][2].slot_full=true;arr[0][2].Name="SHAH DEV";arr[0][2].Car_no="GJ01AB0802";arr[0][2].Mobile_no=1234567892;arr[0][2].Enter_Date_Time=dtf.format(now);arr[0][2].Sloat_no=3;
        arr[0][3].slot_full=true;arr[0][3].Name="PATEL PARTH";arr[0][3].Car_no="GJ01AB0803";arr[0][3].Mobile_no=1234567893;arr[0][3].Enter_Date_Time=dtf.format(now);arr[0][3].Sloat_no=4;
        arr[0][6].slot_full=true;arr[0][6].Name="DHAMEL HARDIK";arr[0][6].Car_no="GJ01AB0804";arr[0][6].Mobile_no=1234567894;arr[0][6].Enter_Date_Time=dtf.format(now);arr[0][6].Sloat_no=7;
        arr[0][9].slot_full=true;arr[0][9].Name="SHAH TIRTH";arr[0][9].Car_no="GJ01AB0805";arr[0][9].Mobile_no=1234567895;arr[0][9].Enter_Date_Time=dtf.format(now);arr[0][9].Sloat_no=10;
        arr[1][1].slot_full=true;arr[1][1].Name="SHAH KANISHA";arr[1][1].Car_no="GJ01AB0806";arr[1][1].Mobile_no=1234567896;arr[1][1].Enter_Date_Time=dtf.format(now);arr[1][1].Sloat_no=12;
        arr[1][3].slot_full=true;arr[1][3].Name="GOHEL HARDIK";arr[1][3].Car_no="GJ01AB0807";arr[1][3].Mobile_no=1234567897;arr[1][3].Enter_Date_Time=dtf.format(now);arr[1][3].Sloat_no=14;
        arr[1][5].slot_full=true;arr[1][5].Name="DODIYA MAYURDHVA";arr[1][5].Car_no="GJ01AB0808";arr[1][5].Mobile_no=1234567898;arr[1][5].Enter_Date_Time=dtf.format(now);arr[1][5].Sloat_no=16;
        arr[1][8].slot_full=true;arr[1][8].Name="PATEL MEET";arr[1][8].Car_no="GJ01AB0809";arr[1][8].Mobile_no=1234567899;arr[1][8].Enter_Date_Time=dtf.format(now);arr[1][8].Sloat_no=19;
        total_full_parking_slot=9;
    }
    long Check_Mobile_No(){
		String s="0";     
		int flag=0;       // come out side the for loop                  
		
		for(int i=0;flag==0;i++)
		{
			int count=0;     // check how many digit enter
			System.out.print("Enter Mobile No: ");
			s=sc.next();
			if(s.length()==10)
			{
				for(int j=0;j<10;j++)
				{
					if(s.charAt(j)>='0'&&s.charAt(j)<='9'){count++;}
					else{System.out.println("Enter Only Digit For Mobile No");break;}
					if(count==10){flag=1;}
				}
			}
			else{System.out.println("Enter 10 Digit Mobile No");}
			if(flag==1){break;}
		}
		return(Long.parseLong(s));
	}          // Check_Car_No() is for check car formate
    String Check_Car_No(){
		String s="0";     
		int flag=0;       // come out side the for loop                  
		for(int i=0;flag==0&&i<=3;i++)
		{
            System.out.println("Hi");
			int count=0;     // check how many digit enter
            System.out.println("Car number Enter this Formate: GJ12CD0823");
			System.out.print("Enter Car No: ");
			s=sc.next();
			if(s.length()==10)
			{
				for(int j=0;j<10;j++)
				{
                    if(j==2||j==3||j==6||j==7||j==8||j==9){
					    if(s.charAt(j)>='0'&&s.charAt(j)<='9'){count++;}
					    else{System.out.println("Enter Only Digit For "+(j+1)+" charactor");break;}
                    }else{
                        if(s.charAt(j)>='A'&&s.charAt(j)<='Z'){count++;}
					    else{System.out.println("Enter Only A To Z  For "+(j+1)+" charactor");break;}
                    }
					if(count==10){flag=1;}
				}
			}
			else{System.out.println("Enter 10 charactor for Car No");}
			if(flag==1){break;}
		}
		return(s);
	}
    String Check_Car_NO(Slots[][] arr){
        boolean flag=true;
        int count=0;
        String Car="";
        do{
            //System.out.print("Enter car No :");
            flag=true;
            Car=Check_Car_No();                                 //sc.nextLine();
            for(int i=0;i<=1;i++){
                for(int j=0;j<=9;j++){
                    String dummy=arr[i][j].Car_no;
                    if(dummy.equals(Car)){
                        flag=false;        
                    }
                }
            }
            if(!flag){
                System.out.println("*--------Enter Valied Car NO--------*");
                System.out.println();
            }
            if(count==2){return "";}
            count++;
        }while(!flag);
        return Car;
    }
    String Enter_Detail(Slots[][] arr){
        if(total_full_parking_slot==20){
            return "B";
        }
        else{
        if(i>0){
            sc.nextLine();}
        i++;
        System.out.println();        
        System.out.print("Enter customer Name :");
        String C_Name=sc.nextLine();
        // System.out.print("Enter car No :");
        String C_car_No=Check_Car_NO(arr);
        if(C_car_No==""){return "";}
        //System.out.print("Enter Mobile No :");
        long C_Mobile_no=Check_Mobile_No();
        System.out.println();
        Parking_Opton(arr);
        arr[colum][row].slot_full=true;
        arr[colum][row].Name=C_Name;
        arr[colum][row].Car_no=C_car_No;
        arr[colum][row].Mobile_no=C_Mobile_no;
        LocalDateTime now=LocalDateTime.now();
        arr[colum][row].Enter_Date_Time=dtf.format(now);
        return "A";
        }
    }
    void Parking_Opton(Slots[][] arr){
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("*         plese enter given one Option for parking sloat          * ");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("*   1).Your Choice                                                * ");
        System.out.println("*   2).some suggested choice                                      * ");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.print("Enter your choice: ");
        int sloat_Option=sc.nextInt();
        System.out.println();
        switch(sloat_Option){
            case 1:{
                     System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
                    Display_Sample_Sloat();
                    Display_Your_Choice(arr);
                    Sloat_To_Arr(arr);
                   }
                break;
            case 2:{
                     System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
                    if(total_full_parking_slot>17){
                        Display_Sample_Sloat();
                        Display_Your_Choice(arr);
                    }
                    else{
                        Display_Sample_Sloat();
                        Dispaly_Suggested_Choice(arr);}
                    }
                    Sloat_To_Arr(arr);
                 break;
            default: {
                        System.out.println("-----Enter Valied Option number -----");
                    }
                break;
        }
    }
    void Display_Sample_Sloat(){
        System.out.println("*                           BluePrint of ParkingSloat                           *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("*       *       *       *       *       *       *       *       *       *       * ");
        System.out.println("*   1   *   2   *   3   *   4   *   5   *   6   *   7   *   8   *   9   *   10  * ");
        System.out.println("*       *       *       *       *       *       *       *       *       *       * ");
        System.out.println("                                                                                * ");
        System.out.println("ENTRY--->                          ROAD                                         * ");
        System.out.println("                                                                                * ");
        System.out.println("*       *       *       *       *       *       *       *       *       *       * ");
        System.out.println("*   11  *   12  *   13  *   14  *   15  *   16  *   17  *   18  *   19  *   20  * ");
        System.out.println("*       *       *       *       *       *       *       *       *       *       * ");
         System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println();
    }
    void Display_Your_Choice(Slots[][] arr){       
        int sloat_no=1;
        
        for(int i=0;i<=1;i++){
            int count=0;
            System.out.print("Line no:"+(i+1)+"   -->");
            for(int j=0;j<=9;j++){
                if(!arr[i][j].slot_full){
                     if(count>=1){
                        System.out.print(" , ");
                    }
                    System.out.print(sloat_no);
                    count++;
                }
                sloat_no++;
            }
            System.out.println();
        }
    }
    void Dispaly_Suggested_Choice(Slots[][] arr){
        int count=0;
        int i=0;
        int j=0;
        int flag=1;
        System.out.print("Suggested sloat: ");
        do{
            if(!arr[i][j].slot_full){
                if(j<1||!arr[i][j+1].slot_full){
                    if(count>=1){
                        System.out.print(" , ");
                    }
                    System.out.print(+(i*10+(j+1)));
                    count++;
                }
            }
            if(flag%2!=0){
                i=1;
            }else{
                i=0;
                j++;
            }
            flag++;
            if(j>10){
                j=0;
            }
            if(flag==20){
                if(count==0){
                    j=0;
                    flag=0;
                    do{
                        if(!arr[i][j].slot_full){
                            if(count>=1){
                                System.out.print(" , ");
                            }
                            System.out.print(+(i*10+(j+1)));
                            count++;
                        }
                        if(flag%2!=0){
                            i=1;
                        }else{
                            i=0;
                            j++;
                        }
                        flag++;
                        if(j>10){
                            j=0;
                        }
                        if(flag==20){
                            
                            break;
                        }
                    }while(count<2);
                }
                break;
            }
        }while(count<2);
        System.out.println();
    }
    void Sloat_To_Arr(Slots[][] arr){
        boolean flag=true;
        do{
            System.out.print("Enter parking sloat: ");
            int parking_sloat=sc.nextInt();
            if(parking_sloat<=10){
                colum=0;
                row=parking_sloat-1;
            }else{
                colum=1;
                row=parking_sloat-11;
            }
            if(!arr[colum][row].slot_full && parking_sloat<=20){
                total_full_parking_slot++;
                arr[colum][row].Sloat_no=parking_sloat;
                flag=false;
            }else{
                System.out.println("this sloat is not Available");
            }
        }while(flag);
    }
    void Display_Receipt(Slots[][] arr){
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("*                Parking Receipt                    ");
        System.out.println(  "*  Name: "+arr[colum][row].Name+"                   ");
        System.out.println(  "*  Mobile No: "+arr[colum][row].Mobile_no+"         ");
        System.out.println(  "*  Car No: "+arr[colum][row].Car_no+"               ");
        System.out.println( "*  Sloat No: "+arr[colum][row].Sloat_no+"             ");
        System.out.println("*  Enter_Date & Time: "+arr[colum][row].Enter_Date_Time );
        System.out.println("*                                                    ");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * ");
    }
    boolean Exit_Detail(Slots[][] arr){
        boolean flag=true;
        int count=1;
        do{
            
            //System.out.print("Enter Car No: ");
            String Car=Check_Car_No();              //sc.next();
            for(int i=0;i<=1;i++){
                for(int j=0;j<=9;j++){
                    String dummy=arr[i][j].Car_no;
                    if(dummy.equals(Car)){
                        colum=i;
                        row=j;
                        if(car_security(arr)){
                            LocalDateTime now=LocalDateTime.now();
                            arr[i][j].Exit_Date_Time=dtf.format(now);
                            Calculate_Money(arr);
                            arr[i][j].slot_full=false;
                            flag=false;
                        }else{
                            System.out.println("Plese Check your Receipt and try agin");
                            flag=false;
                            return false;
                        }
                    }
                }
            }
            if(flag){
                System.out.println("*--------Enter Valied Car NO--------*");
                count++;
            }
            if(count==3){flag=false; return false;}
        }while(flag);
        return true;
       
    }
    void Exit_Detail_Remove(Slots[][] arr){
        arr[colum][row].slot_full=false;
        arr[colum][row].Name=null;
        arr[colum][row].Car_no="";
        arr[colum][row].Mobile_no=0;
        arr[colum][row].Sloat_no=0;
        arr[colum][row].Enter_Date_Time=null;        
        arr[colum][row].Exit_Date_Time=null;
        arr[colum][row].Total_Minutes=0.0;
        arr[colum][row].payment=0;
    }
    void Calculate_Money(Slots[][]arr){
        SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        long difference=0;
        double difference_In_Minutes=0;
        try {
            Date d1 = sdf.parse(arr[colum][row].Enter_Date_Time);
            Date d2 = sdf.parse(arr[colum][row].Exit_Date_Time);
            difference= d2.getTime() - d1.getTime();
            difference_In_Minutes=(difference/ (1000 * 60));
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        arr[colum][row].Total_Minutes = difference_In_Minutes;
        arr[colum][row].payment=(int) ((difference/1000)*0.0833);  
    }
    void Display_Payment_Receipt(Slots[][] arr){
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("*                Parking Receipt                    ");
        System.out.println(  "*  Name: "+arr[colum][row].Name+"                   ");
        System.out.println(  "*  Mobile No: "+arr[colum][row].Mobile_no+"         ");
        System.out.println(  "*  Car No: "+arr[colum][row].Car_no+"               ");
        System.out.println(  "*  Sloat No: "+arr[colum][row].Sloat_no+"             ");
        System.out.println(  "*  Enter_Date & Time: "+arr[colum][row].Enter_Date_Time+"");
        System.out.println(  "*  Exit_Date & Time: "+arr[colum][row].Exit_Date_Time+"");
        System.out.println(  "*  Total minutes car park: "+arr[colum][row].Total_Minutes+"");
        System.out.println(  "*  payment: "+arr[colum][row].payment+"               ");
        System.out.println("*      🙏🙏Thank You for using System🙏🙏           ");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * ");
    }
    boolean car_security(Slots[][] arr){
        String mobile=Long.toString(arr[colum][row].Mobile_no);
        boolean flag=true;
        int count=0;
        do{
            System.out.println();
            System.out.print("Enter last four digit of Mobile no: ");
            String check=sc.next();
            if(mobile.charAt(6)==check.charAt(0)&&
                mobile.charAt(7)==check.charAt(1)&&
                mobile.charAt(8)==check.charAt(2)&&
                mobile.charAt(9)==check.charAt(3)){
                    System.out.println();
                    return true;
            }else{
                System.out.println("*----: Enter Valied Last four Digit of Mobile_no :----*");
                count++;
            }
            if(count==2){
                flag=false;
            }
        }while(flag);
        return false;
    }

}