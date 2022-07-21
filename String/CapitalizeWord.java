
// --> it can be a big string.
// After capitalize
// --> It Can Be A Big String.

// Don't use Inbuild Method
// if a then convert into A
// if A is available then leave it as A
// if space then ignore it
// only (a-z) or (A-Z) characters are possible for capitalize

// Test Cases
// input can be string 
// "wORD" -> "WORD"
// " " -> " "
// "ABC" -> "ABC"
// "   abc" -> "   Abc"
// " a b c" -> " A B C"
// "abc  xyz" -> "Abc  Xyz"
// "  abc  " -> "  Abc  "

// package String;
// import java.util.Scanner;
// public class CapitalizeWord{


//     static Boolean isLowerCase(char ch){
//     return (ch >= 'a' && ch <= 'A');
//      }

//     static char capitalise(char ch)
//     {
//     return (char) (ch - 'a' + 'A');
//     }

//     static String CapitalizeString(String sen)
//     {
//      for(int i = 0; i<sen.length(); i++)
//          {
            
//             if(isLowerCase(s[i]))
//             {
//                 if(i==0 | s[i-1] == ' ')
//                 {
//                     s[i] = capitalise(s[i]);
//                 }
//             }
//              System.out.print(sen.charAt(i));
//          }
//     return sen;
//     }

//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a String : ");
//         String sen = sc.nextLine();
//         CapitalizeString(sen);
//     }
// }
