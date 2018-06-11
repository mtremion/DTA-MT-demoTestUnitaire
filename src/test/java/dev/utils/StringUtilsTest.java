package dev.utils;

import org.junit.Test;

import dev.exception.LevenshteinException;

import org.junit.Assert;

public class StringUtilsTest 
{	
	@Test
	public void testLevenshteinDistance()
	{
		try
		{
			int temp = StringUtils.levenshteinDistance("", "");
			Assert.assertTrue(temp == 0);
			
			temp = StringUtils.levenshteinDistance("Salut", "");
			Assert.assertTrue(temp == 5);
					
			temp = StringUtils.levenshteinDistance("", "Okay");
			Assert.assertTrue(temp == 4);
			
			temp = StringUtils.levenshteinDistance("Okai", "Okay");
			Assert.assertTrue(temp == 1);
		}
		catch(LevenshteinException e)
		{
			Assert.fail("On ne peut pas avoir de paramètre null");
		}
	}
	
	@Test(expected = LevenshteinException.class)
	public void testLevenshteinDistanceNullPointerExceptionCas1() throws LevenshteinException
	{
		int temp = StringUtils.levenshteinDistance(null, "");
	}
	
	@Test(expected = LevenshteinException.class)
	public void testLevenshteinDistanceNullPointerExceptionCas2() throws LevenshteinException
	{
		int temp = StringUtils.levenshteinDistance("", null);
	}
	
	@Test(expected = LevenshteinException.class)
	public void testLevenshteinDistanceNullPointerExceptionCas3() throws LevenshteinException
	{
		int temp = StringUtils.levenshteinDistance(null, null);
	}
}
