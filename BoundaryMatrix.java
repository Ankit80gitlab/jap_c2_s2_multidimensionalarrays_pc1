package com.jap.boundaryelementsofmatrix;


public class BoundaryMatrix {
    public static void main(String[] args) {

    // Declare and initialize an integer array to find its boundary elements
    int integerArray[][] = null;

    BoundaryMatrix boundaryMatrix = new BoundaryMatrix();
    // Call the function to display the integer array
        boundaryMatrix.printArray(integerArray);
        System.out.println();

    // Display the sum of the boundary elements of the integer array
    long sumOfBoundaryElements = boundaryMatrix.printAndCalculateSumOfBoundaryElements(integerArray);
}

    // Function to print the input array
    public void printArray(int[][] array) {


		 if (array.length == 2)
         {
            for (int i = 0; i < array.length; i++)
            {
                System.out.print("  ");
                for (int j = 0; j < array[i].length; j++)
                {
                    System.out.print(array[i][j] + "  ");
                }
                System.out.println();
            }

         }

		 else if (array.length == 3)
         {
            for (int i = 0; i < array.length; i++)
            {
                System.out.print("  ");
                for (int j = 0; j < array[i].length; j++)
                {
                    if (i == 1 && j == 1) {
                        System.out.print("   ");
                    } else
                        System.out.print(array[i][j] + "  ");
                }
                System.out.println();
            }
		 }

		 else if (array.length == 4)
            {
                for (int i = 0; i < array.length; i++)
                {
                    System.out.print("  ");
                    for (int j = 0; j < array[i].length; j++)
                    {
                        if (i == 1 && j == 1)
                        {
                            System.out.print("   ");
                        }
                        else if (i == 1 && j == 2)
                        {
                            System.out.print("    ");
                        }
                        else if (i == 2 && j == 1)
                        {
                            System.out.print("   ");
                        }
                        else if (i == 2 && j == 2)
                        {
                            System.out.print("    ");
                        }
                        else
                            System.out.print(array[i][j] + "  ");
                    } 
                    System.out.println();	
			    }
			}
	    }	

    /*Function to print the boundary elements of the input array and calculate the sum of all the
     boundary elements
     */

	 
    public long printAndCalculateSumOfBoundaryElements(int[][] array) 
	{

		long sum=0;
	    long sum2=0;
		long sumOfBoundaryElements=0;


		if (array.length == 2)
        {
            for (int i = 0; i < array.length; i++)
            {
                for (int j = 0; j < array[i].length; j++)
                {
                    sum += array[i][j];
                }
            }
			sumOfBoundaryElements=sum;
		}

		if (array.length == 3)
        {
            for (int i = 0; i < array.length; i++)
            {
                for (int j = 0; j < array[i].length; j++)
                {
                    sum += array[i][j];
			    }	
		    }
			sum2 = sum - (array[1][1]);
			sumOfBoundaryElements=sum2;
		}

		if (array.length == 4)
        {
            for (int i = 0; i < array.length; i++)
            {
                for (int j = 0; j < array[i].length; j++)
                {
                    sum += array[i][j];
                }
            }
            sum2 = sum - (array[1][1] + array[1][2] + array[2][1] + array[2][2]);   
			sumOfBoundaryElements=sum2;
        }
		return sumOfBoundaryElements;
	}
	     
}		
         