{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fmodern\fcharset0 CourierNewPS-BoldMT;\f1\fmodern\fcharset0 CourierNewPSMT;\f2\fnil\fcharset0 Monaco;
}
{\colortbl;\red255\green255\blue255;\red10\green82\blue135;\red255\green255\blue255;\red29\green38\blue43;
\red0\green0\blue0;\red15\green114\blue1;\red0\green0\blue255;\red18\green19\blue24;\red239\green240\blue240;
}
{\*\expandedcolortbl;;\cssrgb\c0\c40000\c60000;\cssrgb\c100000\c100000\c100000;\cssrgb\c15294\c19608\c22353;
\cssrgb\c0\c0\c0;\cssrgb\c0\c50980\c0;\cssrgb\c0\c0\c100000;\cssrgb\c8627\c9804\c12157;\cssrgb\c94902\c95294\c95294;
}
\paperw11900\paperh16840\margl1440\margr1440\vieww19320\viewh12380\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\b\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \cf2 \cb3 \expnd0\expndtw0\kerning0
import
\f1\b0\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4  
\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 java.util.*;
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \
\'a0\

\f0\b\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \cf2 class
\f1\b0\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4  
\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 GFG \{
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \
\'a0\

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0
\f0\b \AppleTypeServices\AppleTypeServicesF65539 \cf2 public
\f1\b0\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4  
\f0\b\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \cf2 static
\f1\b0\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4  
\f0\b\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \cf2 void
\f1\b0\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4  
\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 main(String[] args)
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\{
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \
\'a0\

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 // Scanner definition
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4 \

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Scanner scn = 
\f0\b \AppleTypeServices\AppleTypeServicesF65539 \cf2 new
\f1\b0\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4  
\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 Scanner(System.in);
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \
\'a0\

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 // input is a string ( one word )
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4 \

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 // read by next() function
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4 \

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0String str1 = scn.next();
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \
\'a0\

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 // print String
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4 \

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf7 "Entered String str1 : "
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4  
\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 + str1);
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \
\'a0\

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 // input is a String ( complete Sentence )
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4 \

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 // read by nextLine()function
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4 \

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0String str2 = scn.nextLine();
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \
\'a0\

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 // print string
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4 \

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf7 "Entered String str2 : "
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4  
\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 + str2);
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \
\'a0\

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 // input is an Integer
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4 \

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 // read by nextInt() function
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4 \

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \AppleTypeServices\AppleTypeServicesF65539 \cf2 int
\f1\b0\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4  
\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 x = scn.nextInt();
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \
\'a0\

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 // print integer
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4 \

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf7 "Entered Integer : "
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4  
\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 + x);
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \
\'a0\

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 // input is a floatingValue
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4 \

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 // read by nextFloat() function
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4 \

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \AppleTypeServices\AppleTypeServicesF65539 \cf2 float
\f1\b0\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4  
\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 f = scn.nextFloat();
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \
\'a0\

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 // print floating value
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4 \

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf7 "Entered FloatValue : "
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \cf4  
\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 + f);
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \'a0\'a0\'a0\'a0\}
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \

\fs29\fsmilli14667 \AppleTypeServices\AppleTypeServicesF65539 \}
\fs24 \AppleTypeServices\AppleTypeServicesF65539 \
\pard\pardeftab720\partightenfactor0

\f2 \AppleTypeServices \cf8 \cb9 \
}