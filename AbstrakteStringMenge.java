import java.util.LinkedList;
abstract class AbstrakteStringMenge implements StringMenge
{
    protected String stringMenge;
    protected LinkedList<String> list = new LinkedList<String>();

    abstract public void add(String s);
    abstract public void remove(String s);
    abstract public boolean contains(String s);
    abstract public int getSize();
    abstract public String[] getElements();
    
    public boolean isEmpty()
    {
        return list.isEmpty();
    } 

    public int getCharCount()
    {
        String currentString;
        int sum = 0;
        for(int i = 0; i<list.size(); i++)
        {
            currentString = list.get(i);
            sum += currentString.length();
        }
        return sum;
    }

    public void print()
    {
        System.out.println(list.toString());
    }
}