import java.util.Scanner;

public class Triangle{
    private Integer side1;
    private Integer side2;
    private Integer side3;

    public Triangle()
    {
        //Remove Slash If You Want To See Is It Working Or Not
        //System.out.println("Empty Constructor");
    }

    public Triangle(Integer side1,Integer side2,Integer side3)
    {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public void setSide1(Integer side1) {
        this.side1 = side1;
    }
    public Integer getSide1() {
        return side1;
    }
    public void setSide2(Integer side2) {
        this.side2 = side2;
    }
    public Integer getSide2() {
        return side2;
    }
    public void setSide3(Integer side3) {
        this.side3 = side3;
    }
    public Integer getSide3() {
        return side3;
    }

    public void showInfo()
    {
        System.out.println("Side 1 is: "+ side1);
        System.out.println("Side 2 is: "+ side2);
        System.out.println("Side 3 is: "+ side2);
    }

    public void testTriangle()
    {
        if(side1==0 && side2==0 && side3==0)
        {
            System.out.println("Triangle Not Possible");
        }
        else if(side1==side2 && side2==side3)
        {
            System.out.println("Equilateral Triangle");
        }
        else if(side1==side2 || side1==side3 || side2==side3)
        {
            System.out.println("Isosceles Triangle");
        }
        else{
            System.out.println("Scalene Triangle");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Tri means Triangle And S means Side
        Integer triS1,triS2,triS3,tri2S1,tri2S2,tri2S3;

        System.out.println("Enter Your 1st Side Of Triangle:");
        triS1=sc.nextInt();
        System.out.println("Enter Your 2nd Side of Triangle:");
        triS2=sc.nextInt();
        System.out.println("Enter Your 3rd Side of Triangle:");
        triS3=sc.nextInt();

        Triangle tri1 = new Triangle();
        tri1.setSide1(triS1);
        tri1.setSide2(triS2);
        tri1.setSide3(triS3);

        //set triangle side with permeteraised constructor
        System.out.println("Enter Your 1st Side Of 2nd Triangle:");
        tri2S1=sc.nextInt();
        System.out.println("Enter Your 2nd Side of 2nd Triangle:");
        tri2S2=sc.nextInt();
        System.out.println("Enter Your 3rd Side of 2nd Triangle:");
        tri2S3=sc.nextInt();

        Triangle tri2 = new Triangle(tri2S1, tri2S2, tri2S3);

        System.out.println("1.Display Sides"+ "\n"+ "2.Check Triangle"+ "\n"+"3.Exit");
        Integer option =  sc.nextInt();
        
        switch (option) {
            case 1:
                System.out.println("For Triangle 1:");
                tri1.showInfo();
                System.out.println("For Triangle 2:");
                tri2.showInfo();
                break;

            case 2:
                System.out.println("For Triangle 1:");
                tri1.testTriangle();
                System.out.println("For Triangle 2:");
                tri2.testTriangle();
                break;

            case 3:
                System.out.println("Exiting");
                break;

            default:
                System.out.println("You Dont Choose Right Option");
                break;
        }

        sc.close();
    }
}
