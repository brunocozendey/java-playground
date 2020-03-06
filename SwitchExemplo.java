public class SwitchExemplo
{
    public static void main(String[] args)
    {
        switch(args[0].charAt(0))
        {
            case 'a':
            case 'A': System.out.println("Vogal A");
                    break;
            case 'e':
            case 'E': System.out.println("Vogal E");
                    break;
            case 'i':
            case 'I': System.out.println("Vogal I");
                    break;
            case 'o':
            case 'O': System.out.println("Vogal O");
                    break;
            case 'u':
            case 'U': System.out.println("Vogal U");
                    break;
            default: System.out.println("A letra não é vogal");

        }   
    }
}