package cn.edu.whut.sept.zuul;

public class CommandWords
{
    private static final String[] VALID_COMMANDS = {
            "go", "quit", "help", "look", "back"
    };

    public CommandWords()
    {
        // nothing to do at the moment...
    }

    /**
     * �ж��û��������Ƿ���������.
     * @param aString ���жϵ��û�����.
     * @return ����û������������֣��򷵻�true�����򷵻�false.
     */
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < VALID_COMMANDS.length; i++) {
            if(VALID_COMMANDS[i].equals(aString)) {
                return true;
            }
        }
        return false;
    }

    /**
     * ���û���������б�.
     */
    public void showAll()
    {
        for(String command: VALID_COMMANDS) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
