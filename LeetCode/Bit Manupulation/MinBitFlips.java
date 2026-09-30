int count = 0;
int ans = start ^ goal;
for(int i = 0; i <=31; i++){
    if((ans &(1<<i)) !=0){                               //T.C = O(No.of bits) 
                                                         //S.C = O(1)
        count+=1;
    }
}
return count;