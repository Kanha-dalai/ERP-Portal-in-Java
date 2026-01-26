import java.util.*;
public class ERP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        while(true){
        System.out.println("Enter your choice for log in into the ERP Portal");
        System.out.println("1.Admin \n2.Teacher \n3.Student \n4.Exit");
        int login = sc.nextInt();
        if(login==4)
        {
            System.out.println("ERP Portal closed! Thank you.");
            break;
        }
        switch(login){
            case 1 :
                System.out.println("Enter your choice : ");
                System.out.println("1.Add \n2.Delete \n3.Update \n4.Exit");
                int admin_ch = sc.nextInt();
                if(admin_ch==1){
                    System.out.println("Enter your choice : ");
                    System.out.println("1.Teacher \n2.Student \n3.Time Table");
                    int add = sc.nextInt();
                    if(add==1){
                        int t1=r.nextInt(200-10+1)+10;
                        System.out.println("Teacher id is : " + t1);
                        System.out.println("New Teacher added successfully.");
                    }
                    else if(add==2){
                        int s1=r.nextInt(1000-100+1)+100;
                        System.out.println("Student id is : " + s1);
                        System.out.println("New Student added successfully.");
                    }
                    else if(add==3){
                        System.out.println("1pm : Java \n2pm : Python  \n3pm : Cloud Computing \n4pm : Data Science \n5pm : TOC");
                        System.out.println("Time Table added successfully.");
                    }
                    else{
                        System.out.println("Choose valid opttion.");
                    }
                }
                else if(admin_ch==2){
                    System.out.println("Enter your choice : ");
                    System.out.println("1.Teacher \n2.Student \n3.Time Table");
                    int del = sc.nextInt();
                    if(del==1){
                        int t2=r.nextInt(200-10+1)+10;
                        System.out.println(t2 + " Teacher deleted successfully.");
                    }
                    else if(del==2){
                        int s2=r.nextInt(1000-100+1)+100;
                        System.out.println(s2 + " Student deleted successfully.");
                    }
                    else if(del==3){
                        System.out.println("Time Table deleted successfully.");
                    }
                    else{
                        System.out.println("Choose valid opttion.");
                    }
                }
                else if(admin_ch==3){
                    System.out.println("Enter your choice : ");
                    System.out.println("1.Attendance \n2.Due \n3.Time Table");
                    int upd = sc.nextInt();
                    if(upd==1){
                        System.out.println("Attendance updated successfully.");
                    }
                    else if(upd==2){
                        System.out.println("Due updated successfully.");
                    }
                    else if(upd==3){
                        System.out.println("Time table updated successfully.");
                    }
                    else{
                        System.out.println("Please choose a valid option.");
                    }
                }
                else if(admin_ch==4){
                    System.out.println("Admin logout on the ERP Portal.");
                }
                else{
                    System.out.println("Choose a valid option.");
                }
            break;
            case 2 :
                int t3=r.nextInt(200-10+1)+10;
                System.out.println("Teacher id is : "+t3);
                System.out.println("Enter your choice : ");
                System.out.println("1.Upload \n2.View \n3.Exit");
                int teacher_ch = sc.nextInt();
                if(teacher_ch==1){
                    System.out.println("Enter your choice : ");
                    System.out.println("1.Marks \n2.Attendance");
                    int Up_ch = sc.nextInt();
                    if(Up_ch==1){
                        System.out.println("Student marks uploaded successfully.");
                    }
                    else if(Up_ch==2){
                        System.out.println("Student attendance uploaded successfully.");
                    }
                    else{
                        System.out.println("Choose a valid option.");
                    }
                }
                else if(teacher_ch==2){
                    System.out.println("Enter your choice : ");
                    System.out.println("1.Marks \n2.Attendance \n3.Time Table");
                    int View_ch = sc.nextInt();
                    if(View_ch==1){
                        System.out.println("Student marks displayed successfully.");
                    }
                    else if(View_ch==2){
                        System.out.println("Student attendance displayed successfully.");
                    }
                    else if(View_ch==3){
                        System.out.println("1pm : Java \n2pm : Python  \n3pm : Cloud Computing \n4pm : Data Science \n5pm : TOC");
                        System.out.println("Student time table displayed successfully.");
                    }
                    else{
                        System.out.println("Choose a valid option.");
                    }
                }
                else if(teacher_ch==3){
                    System.out.println("Teacher logout successfully.");
                }
                else{
                    System.out.println("Choose a valid option.");
                }
                System.out.println("Returning to main menu ...");
            break;
            case 3 :
                int s3=r.nextInt(1000-100+1)+100;
                System.out.println("Student id is : "+s3);
                System.out.println("Enter your choice : ");
                System.out.println("1.Profile \n2.Marks \n3.Time Table \n4.Attendance \n5.Due \n6.Exit");
                int student_ch = sc.nextInt();
                if(student_ch==1){
                    System.out.println("viewing profile of student "+s3+" ...");
                }
                else if(student_ch==2){
                    System.out.println("viewing marks of student "+s3+" ...");
                }
                else if(student_ch==3){
                    System.out.println("Time Table is : ");
                    System.out.println("1pm : Java \n2pm : Python  \n3pm : Cloud Computing \n4pm : Data Science \n5pm : TOC");
                    System.out.println("Student time table displayed successfully.");
                }
                else if(student_ch==4){
                    System.out.println("viewing attendance of student "+s3+" ...");
                }
                else if(student_ch==5){
                    System.out.println("viewing dues of student "+s3+" ...");
                }
                else if(student_ch==6){
                    System.out.println("Student logout Successfully");
                }
                else{
                    System.out.println("Invalid Input");
                }
                System.out.println("Returning to main menu ...");
            break;
            default :
              System.out.println("Invalid Input!");
              System.out.println("Returning to main menu ...");
        }
        }
        sc.close();
    }
}