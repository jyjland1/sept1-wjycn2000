package cn.edu.whut.sept.zuul;

public class Command
{
    private String commandWord;
    private String secondWord;

    /**
     * 初始化命令字和对象.
     */
    public Command(String firstWord, String secondWord)
    {
        commandWord = firstWord;
        this.secondWord = secondWord;
    }

    /**
     * 获取命令字.
     */
    public String getCommandWord()
    {
        return commandWord;
    }

    /**
     * 获取对象.
     */
    public String getSecondWord()
    {
        return secondWord;
    }

    /**
     * 判断命令是否为空.
     * @return 如果命令为空则返回true，否则返回false.
     */
    public boolean isUnknown()
    {
        return (commandWord == null);
    }

    /**
     * 判断对象是否为空.
     * @return 如果对象不为空则返回true，否则返回false.
     */
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}
