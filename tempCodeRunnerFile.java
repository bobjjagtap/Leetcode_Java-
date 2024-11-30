int sign=1;
        int j=0;
        String h="";
        s=s.replaceAll("\\s", "");
       //System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                h+=s.substring(i,i+1);
                
            }
            else if(s.charAt(i)=='-'){
                j++;
                sign=-1;
            }else if(s.charAt(i)=='+'){
                j++;
            }
            else{
                break;
            }
            if(j==2)
            {
                break;
            }
        }
        int i=0;
        if(h!="")
        i=Integer.parseInt(h);  
        return i*sign;  