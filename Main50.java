class Calculator{
int add(int a,int b){
return a+b;
}
int sub(int a,int b){
return a-b;
}
int mul(int a,int b){
return a*b;
}
float div(int a,int b){
return a/b;

}}
class Main50{
public static void main (String []args){
Calculator s=new Calculator();
System.out.println(s.add(2,1));
System.out.println(s.sub(2,1));
System.out.println(s.mul(2,1));
System.out.println(s.div(2,1));
}}


