import java.io.*;
public class program
{
    public static void main(String args[])throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));        
        System.out.println("enter a word:");
        String name=br.readLine();       
        int l = name.length();
        char arr[]=new char[l];        
        for(int i=0;i<l;i++){          
            arr[i]=name.charAt(i);
        }        
        for(int k=0;k<l;k++){            
            for(int z=0;z<l-1;z++){               
                if(arr[z]<arr[z+1]){{
                   char temp=arr[z];
                    arr[z]=arr[z+1];                  
                    arr[z+1]=temp;
                }
            }
}
}
System.out.println("word after sorting:");
for(int m=0;m<l;m++){    
    System.out.print(arr[m]);
}
}
}








š Hi, Iām @aarushinair - Aarushi Nair (she/her/ella)
š Iām a Computer Science Engineering Student
šļø Iām looking to collaborate on #java, #python, #R, #applicationdevelopment
š± #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
š« How to reach me: https://www.linkedin.com/in/aarushinair/
š©āš« YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
šā Follow me on Twitter: https://twitter.com/aarushinair_
