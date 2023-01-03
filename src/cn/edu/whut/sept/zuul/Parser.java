package cn.edu.whut.sept.zuul;

import java.util.Scanner;

public class Parser
{
    private CommandWords commands;
    private Scanner reader;

    /**
     * 创建解析器和输入流.
     */
    public Parser()
    {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }

    /**
     * 读取用户输入命令.
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
     * 向用户输出命令列表.
     */
    public void showCommands()
    {
        commands.showAll();
    }
}
