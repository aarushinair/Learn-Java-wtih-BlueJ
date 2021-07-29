import java.io.*;
class Circular_Matrix
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the number of elements : ");
            int n=Integer.parseInt(br.readLine());
 
            int A[][]=new int[n][n];
            int k=1, c1=0, c2=n-1, r1=0, r2=n-1;
 
            while(k<=n*n)
                {
                    for(int i=c1;i<=c2;i++)
                    {
                        A[r1][i]=k++;
                    }
 
                    for(int j=r1+1;j<=r2;j++)
                    {
                        A[j][c2]=k++;
                    }
 
                    for(int i=c2-1;i>=c1;i--)
                    {
                        A[r2][i]=k++;
                    }
 
                    for(int j=r2-1;j>=r1+1;j--)
                    {
                        A[j][c1]=k++;
                    }
 
                 c1++;
                 c2--;
                 r1++;
                 r2--;
                }
   
            /* Printing the Circular matrix */
            System.out.println("The Circular Matrix is:");
            for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                        {
                            System.out.print(A[i][j]+ "\t");
                        }
                 System.out.println();
                }
        }
    }

/*
Step 1   :               Start of algotithm
Step 2   :               Input the size of circular matrix and store it in integer variable ‘n’
Step 3   :               Create an integer square array of size ‘n*n’ which will be the circular matrix
Step 4   :               Declare and initialize variables k = 0 (for filling the matrix), c1 = 0 (for storing index of first column), c2 = n-1 (for storing index of last column), r1 = 0 (for storing index of first row), r2 = n-1 (for storing index of last row)
Step 5   :               Start a while loop till k<=n*n and repeat steps 6 to 10
Step 6   :
(a)          Start a for loop from i = c1 to c2, where ‘i’ increases by 1 every time and perform step (b)
(b)          Store the natural numbers in the first row using A[r1][i] = k++
Step 7   :
(a)          Start a for loop from j = r1+1 to r2, where ‘j’ increases by 1 every time and perform step (b)
(b)          Store the natural numbers in the last column using A[j][c2] = k++
Step 8   :
(a)          Start a for loop from i = c2-1 to c1, where ‘i’ decreases by 1 every time and perform step (b)
(b)          Store the natural numbers in the last row using A[r2][i] = k++
Step 9   :
(a)          Start a for loop from j = r2-1 to r1+1, where ‘j’ decreases by 1 every time and perform step (b)
(b)          Store the natural numbers in the first column using A[j][c1] = k++
Step 10 :               Update the variables c1, c2, r1 and r2
Step 11 :               Display the circular matrix A[ ]
Step 12 :               End of Algorithm

*/




👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
