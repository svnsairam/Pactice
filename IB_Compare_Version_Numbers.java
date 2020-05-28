class IB_Compare_Version_Numbers{
    public static void main(String[] args) {
        System.out.println(new IB_Compare_Version_Numbers().compareVersion("55", "445"));
    }
    public int compareVersion(String A, String B) {
        String ver1[] = A.split("\\.");
        String ver2[] = B.split("\\.");
        if(ver1.length >0 && ver2.length>0){
            String v1=ver1[0];
            String v2=ver2[0];
            String temp="";
            
            if(v1.length()>=v2.length()){
                for(int j=0;j<v1.length()-v2.length();j++){
                    temp=temp+'0';
                }
                if(v1.length()!=v2.length()){
                    v2 = temp.concat(v2);
                }
                
                for(int j=0;j<v2.length();j++){
                    if(v1.charAt(j)>v2.charAt(j)){
                        return 1;
                    }else if(v2.charAt(j)>v1.charAt(j)){
                        return -1;
                    }
                }
                for(int j=v2.length();j<v1.length();j++){
                    if(v1.charAt(j)>'0'){
                        return 1;
                    }
                }
                if(v1.length()!=v2.length()){
                    for(int j=0;j<v2.length();j++){
                        if(v1.charAt(j)>'0'){
                            return 1;
                        }
                    }
                }

            }
            else{
                for(int j=0;j<v2.length()-v1.length();j++){
                    temp=temp+'0';
                }
                if(v1.length()!=v2.length()){
                    v1 = temp.concat(v1);
                }
                for(int j=0;j<v1.length();j++){
                    if(v1.charAt(j)>v2.charAt(j)){
                        return 1;
                    }else if(v2.charAt(j)>v1.charAt(j)){
                        return -1;
                    }
                }
                for(int j=v1.length();j<v2.length();j++){
                    if(v2.charAt(j)>'0'){
                        return -1;
                    }
                }
                if(v1.length()!=v2.length()){
                for(int j=0;j<v1.length();j++){
                    if(v2.charAt(j)>'0'){
                        return -1;
                    }
                }}
            }

        }
       
        if(ver1.length<=ver2.length){
           
            for(int i=1;i<ver1.length;i++){
                String v1=ver1[i];
                String v2=ver2[i];
               
                
                if(v1.length()>=v2.length()){
                    for(int j=0;j<v2.length();j++){
                        if(v1.charAt(j)>v2.charAt(j)){
                            return 1;
                        }else if(v2.charAt(j)>v1.charAt(j)){
                            return -1;
                        }
                    }
                    for(int j=v2.length();j<v1.length();j++){
                        if(v1.charAt(j)>'0'){
                            return 1;
                        }
                    }
                    if(v1.length()!=v2.length()){
                    for(int j=0;j<v2.length();j++){
                        if(v1.charAt(j)>'0'){
                            return 1;
                        }
                    }}
                }
                else{
                    for(int j=0;j<v1.length();j++){
                        if(v1.charAt(j)>v2.charAt(j)){
                            return 1;
                        }else if(v2.charAt(j)>v1.charAt(j)){
                            return -1;
                        }
                    }
                    for(int j=v1.length();j<v2.length();j++){
                        if(v2.charAt(j)>'0'){
                            return -1;
                        }
                    }
                    if(v1.length()!=v2.length()){
                    for(int j=0;j<v1.length();j++){
                        if(v2.charAt(j)>'0'){
                            return -1;
                        }
                    }}
                }
                
            }
        }else{
            for(int i=1;i<ver2.length;i++){
                String v1=ver1[i];
                String v2=ver2[i];
                if(v1.length()>=v2.length()){
                    for(int j=0;j<v2.length();j++){
                        if(v1.charAt(j)>v2.charAt(j)){
                            return 1;
                        }else if(v2.charAt(j)>v1.charAt(j)){
                            return -1;
                        }
                    }
                    for(int j=v2.length();j<v1.length();j++){
                        if(v1.charAt(j)>'0'){
                            return 1;
                        }
                    }if(v1.length()!=v2.length()){
                    for(int j=0;j<v2.length();j++){
                        if(v1.charAt(j)>'0'){
                            return 1;
                        }
                    }}
                }
                else{
                    for(int j=0;j<v1.length();j++){
                        if(v1.charAt(j)>v2.charAt(j)){
                            return 1;
                        }else if(v2.charAt(j)>v1.charAt(j)){
                            return -1;
                        }
                    }
                    for(int j=v1.length();j<v2.length();j++){
                        if(v2.charAt(j)>'0'){
                            return -1;
                        }
                    }
                    if(v1.length()!=v2.length()){
                    for(int j=0;j<v1.length();j++){
                        if(v2.charAt(j)>'0'){
                            return -1;
                        }
                    }}
                }
                
            }
        }
        if(ver1.length > ver2.length){
            for(int i=ver2.length;i<ver1.length;i++){
                String v1=ver1[i];                
                for(int j=0;j<v1.length();j++){
                    if(v1.charAt(j)>'0'){
                        return 1;
                    }
                }
            }
        }else if(ver1.length < ver2.length){
            for(int i=ver1.length;i<ver2.length;i++){
                String v2=new String(ver2[i]);                
                for(int j=0;j<v2.length();j++){
                    if(v2.charAt(j)>'0'){
                        return -1;
                    }
                }
            }
        }
        return 0;
    }
}