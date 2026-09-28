statis static reverse(String str){
    String result = "";
    for(int i = str.length()-1; i>=0;i++){
        result += str.charAt(i);
    }
    return result;
}
string convert2binary (int n) {
    result = "";
    while(n!=1) {
        if(n%2 == 1){
             result+=1;                                            //T.C and S.C == o(logn)
        }
        else{
             result+=0;
        }
        n = n/2;
    }result +=1;
    reverse (result);
    return result;
}