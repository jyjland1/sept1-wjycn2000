package cn.edu.whut.sept.zuul;

import java.util.*;

public class Room
{
    private String description;
    private Map<String, Room> exits;
    private List<Goods> goods;

    /**
     * ������������,��ʼ�������б�.
     */
    public Room(String description)
    {
        this.description = description;
        exits = new HashMap<String, Room>();
        goods = new ArrayList<Goods>();
    }

    /**
     * ���õ�ǰ���������Ϣ.
     */
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }

    /**
     * ���õ�ǰ�������Ʒ��Ϣ.
     */
    public void setGoods(Goods good) {
        this.goods.add(good);
    }

    /**
     * ��ȡ��ǰ�����������Ϣ.
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * ��ȡ��ǰ�����������Ϣ�ͳ�����Ϣ.
     */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }

    /**
     * ��ȡ��ǰ����ĳ�����Ϣ�ַ���.
     */
    private String getExitString()
    {
        StringBuffer returnString = new StringBuffer("Exits:");
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString.append(" ");
            returnString.append(exit);
        }
        return returnString.toString();
    }

    /**
     * ��ȡ������ڷ���ķ���.
     * @param direction ����ĳ��ڷ���.
     * @return ����ĳ��ڷ���ķ���.
     */
    public Room getExit(String direction)
    {
        return exits.get(direction);
    }

    /**
     * ��ȡ��ǰ�������Ʒ��Ϣ�ַ���.
     */
    public String getGoodString()
    {
        StringBuffer returnString = new StringBuffer("Goods:");
        returnString.append('\n');
        for(Goods good : goods) {
            returnString.append(good.getLongDescription());
            returnString.append('\n');
        }
        return returnString.toString();
    }

}


