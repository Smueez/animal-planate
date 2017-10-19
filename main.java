
public class main {
	public static void main(String arg[])
	{
		animal anml=new animal();
		oviparous ovi=new oviparous();
		mammal mam=new mammal();
		birds brd=new birds();
		insect ins=new insect();
		land lnd=new land();
		water war=new water();
		doSomething_varidic(anml,ovi,mam,ins,lnd,war);
	}
	private static void doSomething_varidic(animal ... a)
	{
		for(animal i:a)
		{
			try
			{
				if(i instanceof animal)
				{
					System.out.println("object from = "+i.getClass().getName());
				}
				
				
			}
			
			catch (Exception e)
			{
				System.out.println("Error");
			}
		}		
	}

}
