package others;

import java.util.ArrayList;

public class TestArrayList
{
    public static void main(String [] args)
    {
	ArrayList strings = new ArrayList();

	strings.add("hello");
	
	String word = (String) strings.get(0);
	System.out.println (word);


	ArrayList<String> strings2 = new ArrayList <String>();
	strings2.add("hello");
	String word2 = strings2.get(0);
	System.out.println (word2);

    } 


}