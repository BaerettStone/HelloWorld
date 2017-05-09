import java.util.*;




public class CryptoConverter
{
  private String first = "send";
  private String second = "more";
  private String third = "money";
  ArrayList<Character> total = new ArrayList<Character>();
  Map<Character, Integer> code = new HashMap<Character, Integer>();
  
  public void convert()
  {
    char [] firstChar = first.toCharArray();
    char [] secondChar = second.toCharArray();
    char [] thirdChar = third.toCharArray();
    
    
    
    
    for(char c: firstChar)
    {
      if(!total.contains(c))
      {
        total.add(c);
      }
    }
    for(char c: secondChar)
    {
      if(!total.contains(c))
      {
        total.add(c);
      }
      
    }
    
    for(char c: thirdChar)
    {
      if(!total.contains(c))
      {
        total.add(c);
      }
    }
  }
  
  public void solve()
  {
    for(int ones = 0; ones < 10; ones++)
    {
      for(int tens = 0; tens < 10; tens++)
      {
        
      }
    }
  }
    
  
  
}