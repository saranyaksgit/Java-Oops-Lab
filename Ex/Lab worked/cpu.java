class CPU
{
	double price;
	static class processor
	{
		double cores;
		String manufacturer;
		double getcache()
		{
			return 5.6;
		}
	}
	static class RAM
	{
		double memory;
		String manufacturer;
		double getclockspeed()
		{
			return 6.6;
		}
	}
}
public class cpu
{
	public static void main(String args[])
	{
		CPU.processor processor = new CPU.processor();
		CPU.RAM ram = new CPU.RAM();
		System.out.println("Processor cache = "+ processor.getcache());
		System.out.println("Ram clockspeed = "+ ram.getclockspeed());
	}
}
		
