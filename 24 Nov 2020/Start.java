import java.util.Scanner;

public class Start {
    static int[] arrayElement;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        //Taking Array Element Input
        System.out.println("How Many Elements Want To Set:");
        int sizeofArray = sc.nextInt();
        arrayElement = new int[sizeofArray]; 
        for(int i=0;i<sizeofArray;i++)
        {
            System.out.println("Enter Number "+(i+1)+" Element:");
            arrayElement[i] = sc.nextInt();
        }

        while(flag)
        {
            System.out.println("Enter Your Option:");
            System.out.println("1.Check if an Array Is Empty");
            System.out.println("2.Print Array Current Array");
            System.out.println("3.Reverse an Array");
            System.out.println("4.Check if a value is present in an Array");
            System.out.println("5.Remove Duplicate From an Array");
            System.out.println("6.Insert a Value Between Two Values");
            System.out.println("7.Get a Random Value From an Array");
            System.out.println("8.Suffle The Elements of an Array");
            System.out.println("9.Remove any element of an Array");
            System.out.println("10.Find the Min Value in Array");
            System.out.println("11.Find the Max Value in Array");
            System.out.println("12.Sum of Array");
            System.out.println("13.Average of Array");
            System.out.println("14.Sort Array in Asecnding Order");
            System.out.println("15.Sort Array in Descending Oreder");
            System.out.println("16.Exit");
            int option  = sc.nextInt();
            switch(option)
            {
                case 1:
                {
                    if(arrayElement == null)
                    {
                        System.out.println("Array Is Null Or Empty");
                    }
                    else{System.out.println("Array is not Null or Empty");}
                    break;
                }

                case 2:
                {
                    if(arrayElement.length == 0)
                    {
                        System.out.println("Array Is Null Or Empty");
                    }
                    else{
                        for(int i=0;i<arrayElement.length;i++)
                        {
                            System.out.println((i+1)+" Element is "+arrayElement[i]);
                        }
                    }
                    break;
                }

                case 3:
                {
                    int[] reverseArray = new int[arrayElement.length];
                    int j = arrayElement.length;
                    for(int i=0;i<arrayElement.length;i++)
                    {
                        reverseArray[j-1] = arrayElement[i];
                        j=j-1;
                    }

                    System.out.println("Reversed Array:");
                    for(int i=0;i<arrayElement.length;i++)
                    {
                        System.out.println((i+1)+" Element is "+reverseArray[i]);
                    }
                    break;
                }

                case 4:
                {
                    System.out.println("Enter Your Value");
                    int value = sc.nextInt();

                    for(int i=0;i<arrayElement.length;i++)
                    {
                        if(arrayElement[i]==value)
                        {
                            System.out.println("Value Found At Index: "+i);
                        }
                        else{System.out.println("Value Not Found");}
                    }
                    break;
                }

                case 5:
                {
                    if(arrayElement.length==0 || arrayElement.length ==1)
                    {
                        System.out.println("Not Enough Elements");
                    }
                    
                    int[] temp = new int[arrayElement.length];
                    int j =0;

                    for(int i=0;i<arrayElement.length-1;i++)
                    {
                        if(arrayElement[i] != arrayElement[j+1])
                        {
                            temp[j++] = arrayElement[i];
                        }
                    }
                    temp[j++] = arrayElement[arrayElement.length-1];

                    for(int i=0;i<j;i++)
                    {
                        arrayElement[i] = temp[i];
                    }

                    for(int i=0;i<arrayElement.length;i++)
                    {
                        System.out.println(arrayElement[i]+" ");
                    }

                    break;
                }

                case 6:
                {
                    System.out.println("Enter Your Value");
                    int value = sc.nextInt();

                    System.out.println("Enter position:");
                    int position = sc.nextInt();
                    position = position-1;
                    for(int i=arrayElement.length;i>position;i--)
                    {
                        arrayElement[i]=arrayElement[i-1];
                    }
                    arrayElement[position] = value;

                    System.out.println("New Array is:");
                    for(int i=0;i<arrayElement.length;i++)
                    {
                        System.out.println(arrayElement[i]);
                    }

                    break;
                }

                case 7:
                {
                    int randomValue;
                    randomValue = (int)(Math.random()*arrayElement.length);

                    System.out.println(arrayElement[randomValue]);

                    break;
                }

                case 8:
                {
                    for(int i=0;i<arrayElement.length;i++)
                    {
                       int  randomIndex = (int) (Math.random()*arrayElement.length);
                       int temp = arrayElement[randomIndex];

                       arrayElement[randomIndex] = arrayElement[i];
                       arrayElement[i] = temp;

                    }
                    for(int i=0;i<arrayElement.length;i++)
                    {
                        System.out.println(arrayElement[i]);
                    }

                    break;
                }

                case 9:
                {
                    int removeIndex=0;
                    int[] deleteArray = new int[arrayElement.length-1];
                    System.out.println("Enter Element:");
                    int element = sc.nextInt();
                    for(int i=0;i<arrayElement.length;i++)
                    {
                        if(arrayElement[i]==element)
                        {
                            removeIndex=i;
                        }
                    }

                    for(int i=0,j=0;i<arrayElement.length;i++ )
                    {
                        if( i != removeIndex)
                            {
                                deleteArray[j++]=arrayElement[i];
                            }
                    }

                    System.out.println("After Deleting");
                    for(int i =0;i<deleteArray.length;i++)
                    {
                        System.out.println(deleteArray[i]);
                    }

                    break;
                }

                case 10:
                {
                    int maxValue = arrayElement[0];
                    for(int i=1;i<=arrayElement.length;i++)
                    {
                        if(arrayElement[i]>maxValue)
                        {
                            maxValue=arrayElement[i];
                        }
                    }
                    System.out.println("Max Value is: "+maxValue);

                    break;
                }

                case 11:
                {
                    int minValue = arrayElement[0];
                    for(int i=1;i<=arrayElement.length;i++)
                    {
                        if(arrayElement[i]<minValue)
                        {
                            minValue=arrayElement[i];
                        }
                    }
                    System.out.println("Max Value is: "+minValue);

                    break;
                }
                
                case 12:
                {
                    int totalSum=0;

                    for(int i=0;i<arrayElement.length;i++)
                    {
                        totalSum = totalSum+arrayElement[i];
                    }

                    System.out.println("Total Sum is: "+totalSum);

                    break;
                }

                case 13:
                {
                    int totalSum=0;

                    for(int i=0;i<arrayElement.length;i++)
                    {
                        totalSum = totalSum+arrayElement[i];
                    }

                    System.out.println("Total Average is"+(totalSum/arrayElement.length));

                    break;
                }

                case 14:
                {
                    int temp =0;
                    for(int i=0;i<arrayElement.length;i++)
                    {
                        for(int j=i+1;j<arrayElement.length;j++)
                        {
                            if(arrayElement[i]>arrayElement[j])
                            {
                                temp=arrayElement[i];
                                arrayElement[i]=arrayElement[j];
                                arrayElement[j]=temp;
                            }
                        }
                    }

                    System.out.println("Elements of array sorted in Ascending order:");
                    for(int i =0;i<arrayElement.length;i++)
                    {
                        System.out.println(arrayElement[i]);
                    }
                    break;
                }

                case 15:
                {
                    int temp=0;
                    for(int i=0;i<arrayElement.length;i++)
                    {
                        for(int j=i+1;j<arrayElement.length;j++)
                        {
                            if(arrayElement[i]<arrayElement[j])
                            {
                                temp=arrayElement[i];
                                arrayElement[i]=arrayElement[j];
                                arrayElement[j]=temp;
                            }
                        }
                    }

                    System.out.println("Elements of array sorted in descending order:");
                    for(int i=0;i<arrayElement.length;i++)
                    {
                        System.out.println(arrayElement[i]);
                    }
                    break;
                }
                case 16:
                {
                    System.out.println("Exiting");
                    flag=false;
                    break;
                }
                default:
                {
                    System.out.println("Invalid Option");
                    System.out.println("Choose Again");
                    break;
                }
            }
        }


        sc.close();

    }
}
