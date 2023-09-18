class charocuuurence
{
    public static void main(String[] args) {
        String s="ronny";
        int[]chcount=new int[255];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            chcount[c]++;
        }
        for(int i=0;i<=chcount.length;i++)
        {
            if(chcount[i]>0)
            {
                System.out.println("character: " +(char)i+ " OCCUERENCE TIME:  " +chcount[i]);
            }
        }

    }
}