 String str="";

     int i=0;

     while(i<s.length()-1){

         if(s.charAt(i)==s.charAt(i+1)){

             i++;

         }

         else{

             str+=s.charAt(i);

             i++;

         }

     }

     str+=s.charAt(s.length()-1);

     return str;
