package a.png;

import java.util.Random;

public class Main {

	public static void main(String[] args)
	{
		RandomCollection<String> initials = new RandomCollection<String>().add(1, "")
				.add(1, "'").add(4, "b").add(4, "c").add(1, "ch").add(4, "d").add(4, "f").add(4, "g")
				.add(3, "h").add(2, "j").add(2, "k").add(4, "l").add(4, "m").add(4, "n").add(3, "p")
				.add(1, "q").add(1, "qu").add(4, "r").add(4, "s").add(1, "sh").add(1, "st").add(3, "t")
				.add(3, "v").add(2, "w").add(1, "x").add(2, "y");
		RandomCollection<String> nuclei = new RandomCollection<String>().add(5, "a")
				.add(5, "e").add(5, "i").add(5, "o").add(5, "u").add(2, "au").add(1, "eu")
				.add(2, "ou").add(1, "ai").add(1, "ei").add(1, "ui");
		RandomCollection<String> codae = new RandomCollection<String>().add(3, "l")
				.add(3, "m").add(3, "n").add(3, "r").add(1, "s");
		RandomCollection<String> endings = new RandomCollection<String>().add(1, "os")
				.add(1, "us").add(1, "is").add(1, "a").add(1, "on").add(1, "um");
		
		String endname = "";
		Random random = new Random();
		int syllableCount = random.nextInt(2) + 2;
		for (int i = 0; i < syllableCount; i++)
		{
			endname = endname.concat(initials.next());
			endname = endname.concat(nuclei.next());
			if (random.nextBoolean()) endname = endname.concat(codae.next());
		}
		if (random.nextBoolean()) endname = endname.concat(endings.next());
		endname = endname.substring(0, 1).toUpperCase() + endname.substring(1);
		System.out.println("This is your planet name:");
		System.out.println(endname);
	}
}
