{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fmodern\fcharset0 CourierNewPS-BoldMT;\f1\fmodern\fcharset0 CourierNewPSMT;}
{\colortbl;\red255\green255\blue255;\red10\green82\blue135;\red255\green255\blue255;\red0\green0\blue0;
\red0\green0\blue0;\red0\green0\blue255;\red18\green139\blue2;\red15\green114\blue1;\red109\green109\blue109;
}
{\*\expandedcolortbl;;\cssrgb\c0\c40000\c60000;\cssrgb\c100000\c100000\c100000;\cssrgb\c0\c0\c0\c83922;
\cssrgb\c0\c0\c0;\cssrgb\c0\c0\c100000;\cssrgb\c0\c60000\c0;\cssrgb\c0\c50980\c0;\cssrgb\c50196\c50196\c50196;
}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720

\itap1\trowd \taflags1 \trgaph108\trleft-108 \trbrdrt\brdrnil \trbrdrl\brdrnil \trbrdrt\brdrnil \trbrdrr\brdrnil 
\clvertalt\clvertalbase \clshdrawnil \clwWidth16704\clftsWidth3 \clbrdrt\brdrnil \clbrdrl\brdrnil \clbrdrb\brdrnil \clbrdrr\brdrnil \clpadl0 \clpadr0 \gaph\cellx8640
\pard\intbl\itap1\pardeftab720\parhyphenfactor20\partightenfactor0

\f0\b\fs29\fsmilli14913 \cf2 \cb3 \expnd0\expndtw0\kerning0
import
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 java.net.*; 
\fs30\fsmilli15064 \

\f0\b\fs29\fsmilli14913 \cf2 import
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 java.io.*; 
\fs30\fsmilli15064 \

\f0\b\fs29\fsmilli14913 \cf2 import
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 java.util.*; 
\fs30\fsmilli15064 \

\f0\b\fs29\fsmilli14913 \cf2 public
\f1\b0\fs30\fsmilli15064 \cf4  
\f0\b\fs29\fsmilli14913 \cf2 class
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 GroupChat 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \{ 
\fs30\fsmilli15064 \
\pard\intbl\itap1\pardeftab720\parhyphenfactor20\partightenfactor0

\fs29\fsmilli14913 \cf4 \'a0\'a0\'a0\'a0
\f0\b \cf2 private
\f1\b0\fs30\fsmilli15064 \cf4  
\f0\b\fs29\fsmilli14913 \cf2 static
\f1\b0\fs30\fsmilli15064 \cf4  
\f0\b\fs29\fsmilli14913 \cf2 final
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 String TERMINATE = \cf6 "Exit"\cf4 ; 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0
\f0\b \cf2 static
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 String name; 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0
\f0\b \cf2 static
\f1\b0\fs30\fsmilli15064 \cf4  
\f0\b\fs29\fsmilli14913 \cf2 volatile
\f1\b0\fs30\fsmilli15064 \cf4  
\f0\b\fs29\fsmilli14913 \cf2 boolean
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 finished = 
\f0\b \cf2 false
\f1\b0 \cf4 ; 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0
\f0\b \cf2 public
\f1\b0\fs30\fsmilli15064 \cf4  
\f0\b\fs29\fsmilli14913 \cf2 static
\f1\b0\fs30\fsmilli15064 \cf4  
\f0\b\fs29\fsmilli14913 \cf2 void
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 main(String[] args) 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\{ 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 if
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 (args.length != \cf7 2\cf4 ) 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf6 "Two arguments required: <multicast-host> <port-number>"\cf4 ); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 else
\f1\b0\fs30\fsmilli15064 \cf4 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{ 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 try
\f1\b0\fs30\fsmilli15064 \cf4 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{ 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0InetAddress group = InetAddress.getByName(args[\cf7 0\cf4 ]); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 int
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 port = Integer.parseInt(args[\cf7 1\cf4 ]); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Scanner sc = 
\f0\b \cf2 new
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 Scanner(System.in); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.print(\cf6 "Enter your name: "\cf4 ); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0name = sc.nextLine(); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0MulticastSocket socket = 
\f0\b \cf2 new
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 MulticastSocket(port); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs30\fsmilli15064 \'a0\

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf8 // Since we are deploying 
\fs30\fsmilli15064 \cf4 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0socket.setTimeToLive(\cf7 0\cf4 ); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf8 //this on localhost only (For a subnet set it as 1) 
\fs30\fsmilli15064 \cf4 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs30\fsmilli15064 \'a0\

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0socket.joinGroup(group); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Thread t = 
\f0\b \cf2 new
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 Thread(
\f0\b \cf2 new
\f1\b0\fs30\fsmilli15064 \cf4 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ReadThread(socket,group,port)); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs30\fsmilli15064 \'a0\

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf8 // Spawn a thread for reading messages 
\fs30\fsmilli15064 \cf4 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0t.start();\'a0 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs30\fsmilli15064 \'a0\

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf8 // sent to the current group 
\fs30\fsmilli15064 \cf4 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf6 "Start typing messages...\\n"\cf4 ); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 while
\f1\b0 \cf4 (
\f0\b \cf2 true
\f1\b0 \cf4 ) 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{ 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0String message; 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0message = sc.nextLine(); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 if
\f1\b0 \cf4 (message.equalsIgnoreCase(GroupChat.TERMINATE)) 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{ 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0finished = 
\f0\b \cf2 true
\f1\b0 \cf4 ; 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0socket.leaveGroup(group); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0socket.close(); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 break
\f1\b0 \cf4 ; 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\} 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0message = name + \cf6 ": "
\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 + message; 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 byte
\f1\b0 \cf4 [] buffer = message.getBytes(); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0DatagramPacket datagram = 
\f0\b \cf2 new
\f1\b0\fs30\fsmilli15064 \cf4 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0DatagramPacket(buffer,buffer.length,group,port); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0socket.send(datagram); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\} 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\} 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 catch
\f1\b0 \cf4 (SocketException se) 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{ 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf6 "Error creating socket"\cf4 ); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0se.printStackTrace(); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\} 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 catch
\f1\b0 \cf4 (IOException ie) 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{ 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf6 "Error reading/writing from/to socket"\cf4 ); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ie.printStackTrace(); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\} 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\} 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\} 
\fs30\fsmilli15064 \
\pard\intbl\itap1\pardeftab720\parhyphenfactor20\partightenfactor0

\fs29\fsmilli14913 \cf4 \} 
\fs30\fsmilli15064 \

\f0\b\fs29\fsmilli14913 \cf2 class
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 ReadThread 
\f0\b \cf2 implements
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 Runnable 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \{ 
\fs30\fsmilli15064 \
\pard\intbl\itap1\pardeftab720\parhyphenfactor20\partightenfactor0

\fs29\fsmilli14913 \cf4 \'a0\'a0\'a0\'a0
\f0\b \cf2 private
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 MulticastSocket socket; 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0
\f0\b \cf2 private
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 InetAddress group; 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0
\f0\b \cf2 private
\f1\b0\fs30\fsmilli15064 \cf4  
\f0\b\fs29\fsmilli14913 \cf2 int
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 port; 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0
\f0\b \cf2 private
\f1\b0\fs30\fsmilli15064 \cf4  
\f0\b\fs29\fsmilli14913 \cf2 static
\f1\b0\fs30\fsmilli15064 \cf4  
\f0\b\fs29\fsmilli14913 \cf2 final
\f1\b0\fs30\fsmilli15064 \cf4  
\f0\b\fs29\fsmilli14913 \cf2 int
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 MAX_LEN = \cf7 1000\cf4 ; 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0ReadThread(MulticastSocket socket,InetAddress group,
\f0\b \cf2 int
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 port) 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\{ 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 this
\f1\b0 \cf4 .socket = socket; 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 this
\f1\b0 \cf4 .group = group; 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 this
\f1\b0 \cf4 .port = port; 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\} 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0
\fs30\fsmilli15064 \'a0\

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\cf9 @Override
\fs30\fsmilli15064 \cf4 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0
\f0\b \cf2 public
\f1\b0\fs30\fsmilli15064 \cf4  
\f0\b\fs29\fsmilli14913 \cf2 void
\f1\b0\fs30\fsmilli15064 \cf4  
\fs29\fsmilli14913 run() 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\{ 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 while
\f1\b0 \cf4 (!GroupChat.finished) 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{ 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 byte
\f1\b0 \cf4 [] buffer = 
\f0\b \cf2 new
\f1\b0\fs30\fsmilli15064 \cf4  
\f0\b\fs29\fsmilli14913 \cf2 byte
\f1\b0 \cf4 [ReadThread.MAX_LEN]; 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0DatagramPacket datagram = 
\f0\b \cf2 new
\f1\b0\fs30\fsmilli15064 \cf4 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0DatagramPacket(buffer,buffer.length,group,port); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0String message; 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 try
\f1\b0\fs30\fsmilli15064 \cf4 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{ 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0socket.receive(datagram); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0message = 
\f0\b \cf2 new
\f1\b0\fs30\fsmilli15064 \cf4 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0String(buffer,\cf7 0\cf4 ,datagram.getLength(),\cf6 "UTF-8"\cf4 ); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 if
\f1\b0 \cf4 (!message.startsWith(GroupChat.name)) 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(message); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\} 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \cf2 catch
\f1\b0 \cf4 (IOException e) 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{ 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf6 "Socket closed!"\cf4 ); 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\} 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\} 
\fs30\fsmilli15064 \

\fs29\fsmilli14913 \'a0\'a0\'a0\'a0\} 
\fs30\fsmilli15064 \
\pard\intbl\itap1\pardeftab720\parhyphenfactor20\partightenfactor0

\fs29\fsmilli14913 \cf4 \}
\fs30\fsmilli15064 \cell \lastrow\row
}