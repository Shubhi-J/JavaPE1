package com.stackroute.pe1;

import java.util.Scanner;

public class VowelConsonentChecker {

    public static void main(String[ ] arg)
        {
            int i=0;
            Scanner input=new Scanner(System.in);
            System.out.println("Enter a string : ");
            String inputString=input.nextLine( );
            for(i=0;i<inputString.length();i++) {
                char ch[]=inputString.toCharArray();
                if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||
                        ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
                {
                    System.out.print(ch[i]+" -  Vowel ");
                }
                else if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z'))
                    System.out.print(ch[i]+" - Consonant ");
                else
                    System.out.print(ch[i]+" Not an alphabet ");
            }
            }

    }

