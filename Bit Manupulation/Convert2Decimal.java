static int convert2decimal(String n){
    int length = n.length();
    int p2 = 1;
    int num =0;
    for(int i = len-1; i >=0; i--){
        if(n.charAt(i)=='1'){                                //T.C = o(len) 
            num = num +p2;                                   //S.C = o(1)
        }
        p2 = p2*2;
    }
    return num;
}