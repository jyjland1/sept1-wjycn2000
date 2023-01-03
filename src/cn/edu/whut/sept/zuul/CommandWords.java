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
     * 判断用户的输入是否是命令字.
     * @param aString 待判断的用户输入.
     * @return 如果用户输入是命令字，则返回true，否则返回false.
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
     * 向用户输出命令列表.
     */
    public void showAll()
    {
        for(String command: VALID_COMMANDS) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
