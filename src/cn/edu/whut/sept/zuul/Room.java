package cn.edu.whut.sept.zuul;

import java.util.*;

public class Room
{
    private String description;
    private Map<String, Room> exits;
    private List<Goods> goods;

    /**
     * 创建房间描述,初始化出口列表.
     */
    public Room(String description)
    {
        this.description = description;
        exits = new HashMap<String, Room>();
        goods = new ArrayList<Goods>();
    }

    /**
     * 设置当前房间出口信息.
     */
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }

    /**
     * 设置当前房间的物品信息.
     */
    public void setGoods(Goods good) {
        this.goods.add(good);
    }

    /**
     * 获取当前房间的描述信息.
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * 获取当前房间的描述信息和出口信息.
     */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }

    /**
     * 获取当前房间的出口信息字符串.
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
     * 获取输入出口方向的房间.
     * @param direction 输入的出口方向.
     * @return 输入的出口方向的房间.
     */
    public Room getExit(String direction)
    {
        return exits.get(direction);
    }

    /**
     * 获取当前房间的物品信息字符串.
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


