package cn.edu.whut.sept.zuul;

import java.util.Scanner;

public class Parser
{
    private CommandWords commands;
    private Scanner reader;

    /**
     * ������������������.
     */
    public Parser()
    {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }

    /**
     * ��ȡ�û���������.
     */
    public Command getCommand()
    {
        String inputLine;
        String word1 = null;
        String word2 = null;

        System.out.print("> ");

        inputLine = reader.nextLine();

        Scanner tokenizer = new Scanner(inputLine);
        try{
            if(tokenizer.hasNext()) {
                word1 = tokenizer.next();
                if(tokenizer.hasNext()) {
                    word2 = tokenizer.next();
                }
            }
        } catch (Exception e) {
        } finally {
            tokenizer.close();
        }


        if(commands.isCommand(word1)) {
            return new Command(word1, word2);
        }
        else {
            return new Command(null, word2);
        }
    }

    /**
     * ���û���������б�.
     */
    public void showCommands()
    {
        commands.showAll();
    }
}
