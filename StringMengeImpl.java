public class StringMengeImpl extends AbstrakteStringMenge
{
    public void add(String s)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i) == s)
            {
                return;
            }
        }
        list.addLast(s);
    }

    public void remove(String s)
    {
        while(list.contains(s) == true)
        {
            list.remove(s);
        }
    }

    public boolean contains(String s)
    {
        return list.contains(s);
    }

    public int getSize()
    {
        return list.size();
    }

    public String[] getElements()
    {
        String[] arr = new String[list.size()];
        for(int i = 0; i<list.size(); i++)
        {
            arr[i] = list.get(i);
        }
        return arr;
    }
}