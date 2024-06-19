import input.input;
class m
{
static int temp;

public static void main(String args[])
{
input a=new input();
int s=a.input();
int arr[]=new int[s];
for(int i=0;i<s-1;i++)
{
for(int j=0;j<s-1-i;j++)
{
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
System.out.println("the sorted elements are:");
for(int j=0;j<s;j++)
{
System.out.println(+arr[j]);
}
}
}