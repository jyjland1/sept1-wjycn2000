package cn.edu.whut.sept.zuul;

public class Command
{
    private String commandWord;
    private String secondWord;

    /**
     * ��ʼ�������ֺͶ���.
     */
    public Command(String firstWord, String secondWord)
    {
        commandWord = firstWord;
        this.secondWord = secondWord;
    }

    /**
     * ��ȡ������.
     */
    public String getCommandWord()
    {
        return commandWord;
    }

    /**
     * ��ȡ����.
     */
    public String getSecondWord()
    {
        return secondWord;
    }

    /**
     * �ж������Ƿ�Ϊ��.
     * @return �������Ϊ���򷵻�true�����򷵻�false.
     */
    public boolean isUnknown()
    {
        return (commandWord == null);
    }

    /**
     * �ж϶����Ƿ�Ϊ��.
     * @return �������Ϊ���򷵻�true�����򷵻�false.
     */
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}
