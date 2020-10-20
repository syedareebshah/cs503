public class Methods
{
public static void main(String []args)
{
int dollers=200;
double quarters=0;
quarters=dollersToQuatars(dollers);
System.out.println(dollers+" dollers are in quarters is "+quarters);
}

public static double dollersToQuatars(int dollers)
{
double quarters;
if(dollers>=0)
{
quarters=dollers/4.0;
return quarters;
}
else
{
return -999.99;
}
}

}