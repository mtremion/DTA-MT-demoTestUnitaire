import dev.utils.StringUtils;

public class TestUnitaireLevenshteinDistance extends TestUnitaire
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			TestUnitaireLevenshteinDistance test = new TestUnitaireLevenshteinDistance();
			test.lancerTest(); 
		}
		catch(NullPointerException e)
		{
			System.out.println("Un param est " + (e.getMessage()));
			
		}
	}

	@Override
	public void lancerTest() 
	{
		// TODO Auto-generated method stub
		
		if(StringUtils.levenshteinDistance("Chien", "Chine") != 2)
		{
			throw new RuntimeException("Test numéro 1 à échoué");
		}
		
		if(StringUtils.levenshteinDistance("Salut", "Bonjour les gens") != 15)
		{
			throw new RuntimeException("Test numéro 2 à échoué");
		}
		
		if(StringUtils.levenshteinDistance("Pardon ?", null) != 8)
		{
			throw new RuntimeException("Test numéro 3 à échoué");
		}
		
	}
	
	
}
