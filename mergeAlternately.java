/*Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:
                     
Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s*/
import java.io.*;

class mc
{
public static void main(String arg[])throws IOException
{
    DataInputStream dis=new DataInputStream(System.in);
    String word1=dis.readLine();
    String word2=dis.readLine();
    int a=word1.length();
    int b=word2.length();
    Object obj=new Object();
    int i=0, j=0;
    while(i<a ||j<b){
        if(i<a){
            System.out.print(word1.charAt(i));
            i++;
        }
        if(j<b){
            System.out.print(word2.charAt(j));
            j++;
        }
        
    }
}
}
 
 