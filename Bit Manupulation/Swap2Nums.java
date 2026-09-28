//Swap using a temp or using a 3rd variable
temp = a;
a = b;
b = temp;
//Swap using XOR 
int a = 5;
int b = 7;

a = a ^ b; 
b = a ^ b;  // now a = a ^ b and ^ b ---> b and b cancel so --->> a
a = a ^ b;  // now a = a ^ b and b is a so a ^ b and ^ a --->> now a and a cancel so its b

System.out.println(a);
System.out.println(b);