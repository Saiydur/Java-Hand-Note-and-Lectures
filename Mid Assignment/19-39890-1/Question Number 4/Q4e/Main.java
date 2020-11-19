import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        courses c1 = new courses();//Creating Object

        /*Setting Student Details*/
        System.out.println("Enter Name:");
        String name=sc.nextLine();
        c1.setStudentName(name);
        System.out.println("Enter Id:");
        String id = sc.nextLine();
        c1.setStudentId(id);
        System.out.println("Enter Department (CSE/BBA/Other):");
        String dept = sc.nextLine();
        c1.setStudentDept(dept);
        System.out.println("Enter Semester:");
        String semester = sc.nextLine();
        c1.setSemester(semester);
        System.out.println("Enter Contact Number:");
        String number = sc.nextLine();
        c1.setContactNumber(number);

        String[] courseList;//Creating Array For Store Taken Courses

        /*CSE Section*/
        if(dept.toLowerCase().equals("cse"))
        {   
            System.out.println("Select Your Courses:");
            for(int i=0;i<c1.getCse().length;i++)
            {
                System.out.println((i+1)+" Course is "+c1.getCse()[i]);
            }
            System.out.println("How Many Course You Want??");
            int courseInput = sc.nextInt();
            sc.nextLine();
            courseList = new String[courseInput];
            if(courseInput<=5)
            {
                    for(int i=0;i<courseInput;i++)
                    {
                        System.out.println("Which course You Want??");
                        int courseNumber = sc.nextInt();
                        courseList[i]=c1.getCse()[courseNumber-1];
                    }
                    System.out.println("Want to See All Details??(y/n)");
                    sc.nextLine();
                    String option = sc.nextLine();
                    if(option.toLowerCase().charAt(0) == 'y')
                    {
                        c1.showDetails();
                        System.out.println("Added Course Is:");
                        for(int i=0;i<courseList.length;i++)
                        {
                            System.out.println((i+1)+" Course is "+ courseList[i]);
                        }
                    }
            }
            else{System.out.println("You Can Take Only 5 Courses");}
        }

        /* BBA Section */
        else if(dept.toLowerCase().equals("bba"))
        {   
            System.out.println("Select Your Courses:");
            for(int i=0;i<c1.getBba().length;i++)
            {
                System.out.println((i+1)+" Course is "+c1.getBba()[i]);
            }
            System.out.println("How Many Course You Want??");
            int courseInput = sc.nextInt();
            sc.nextLine();
            courseList = new String[courseInput];
            if(courseInput<=5)
            {
                for(int i=0;i<courseInput;i++)
                {
                    System.out.println("Which course You Want??");
                    int courseNumber = sc.nextInt();
                    courseList[i]=c1.getBba()[courseNumber-1];
                }
                System.out.println("Want to See All Details??(y/n)");
                sc.nextLine();
                String option = sc.nextLine();
                if(option.toLowerCase().charAt(0) == 'y')
                {
                    c1.showDetails();
                    System.out.println("Added Course Is:");
                    for(int i=0;i<courseList.length;i++)
                    {
                        System.out.println((i+1)+" Course is "+ courseList[i]);
                    }
                }
            }
            else{System.out.println("You Can Take Only 5 Courses");}
        }

        /* Other Section */
        else if(dept.toLowerCase().equals("other"))
        {   
            System.out.println("Select Your Courses:");
            for(int i=0;i<c1.getOther().length;i++)
            {
                System.out.println((i+1)+" Course is "+c1.getOther()[i]);
            }
            System.out.println("How Many Course You Want??");
            int courseInput = sc.nextInt();
            sc.nextLine();
            courseList = new String[courseInput];
            if(courseInput<=5)
            {
                for(int i=0;i<courseInput;i++)
                {
                    System.out.println("Which course You Want??");
                    int courseNumber = sc.nextInt();
                    courseList[i]=c1.getOther()[courseNumber-1];
                }
                System.out.println("Want to See All Details??(y/n)");
                sc.nextLine();
                String option = sc.nextLine();
                if(option.toLowerCase().charAt(0) == 'y')
                {
                    c1.showDetails();
                    System.out.println("Added Course Is:");
                    for(int i=0;i<courseList.length;i++)
                    {
                        System.out.println((i+1)+" Course is "+ courseList[i]);
                    }
                }
            }
            else{System.out.println("You Can Take Only 5 Courses");}
        }
        else{System.out.println("Input Error At Department");}

        sc.close();
    }
}