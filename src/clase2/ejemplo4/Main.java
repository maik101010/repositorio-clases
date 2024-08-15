package src.clase2.ejemplo4;


public class Main
{
    static boolean validate(String arg)
    {
        for (int i = 0; i < arg.length(); i++)
        {
            //anDres
            if (arg.charAt(i) < 90 && arg.charAt(i) > 64)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
//        Function uppers = (String text) -> text.toUpperCase().equals(text);
        Function uppers = (String text) -> validate(text);
        System.out.println(uppers.apply("MICHAEL"));
        System.out.println(uppers.apply("Michael"));
        System.out.println(uppers.apply("michael"));
    }

    interface Function
    {
        boolean apply(String inp);
    }
}