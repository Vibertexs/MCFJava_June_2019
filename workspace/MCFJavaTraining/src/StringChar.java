
public class StringChar {



	public static void main(String[] args) {
//		char [] StringArray = {'F', 'o', 'l', 's', 'o', 'm'};
//		System.out.println(StringArray);
//		
//		String location1 = "Folsom CA";
//		String blank= " ";
//		String location2 = "My House";
//		String locations =location1.concat(blank);
//		String FinalLoco = locations.concat(location2);
//		System.out.println(FinalLoco);
		
		
		String Language1 = "Java";
		String language2 = "java";
		if (Language1.equalsIgnoreCase(language2))
				System.out.println("Same Word");
		else
			System.out.println("Diffrent Word");

		String str1 = "Yo...Yo...";
		String replacedString = str1.replace("Y", "G");
		System.out.println(replacedString);
		System.out.println("Length is"+ str1.length());
		String s = "Learn Share Learn";
		int output = s.indexOf("Learn");
		System.out.println(output);
		
		String x ="unhappy".substring(2,7);
		System.out.println(x);
		
		
		
	}

}
