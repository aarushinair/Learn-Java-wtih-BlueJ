import java.io.*;
public class Matrix
{
    int arr[][];
    int m;
    int n;
    Matrix (int mm,int nn){
        m=mm;
        n=nn;
        arr=new int [m][n];
    }
    void fillarray()throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Enter values for array");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=Integer.parseInt(br.readLine());
            }
        }
    }
    Matrix SubMat (Matrix A){
        Matrix C=new Matrix(3,3);
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                C.arr[i][j]=this.arr[i][j]-A.arr[i][j];
            }
        }
        return C;
    }
    void display (){
        System.out.println("The resultant array");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main (String args[]) throws IOException{
        Matrix P = new Matrix (3,3);
        P.fillarray();
        Matrix Q=new Matrix (3,3);
        Q.fillarray();
        Matrix R=new Matrix (3,3);
        R=P.SubMat(Q);
        R.display();
    }
        }








👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
