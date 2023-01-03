package cn.edu.whut.sept.zuul;

public class Goods {
    private String description;
    private int weight;

    /**
     * 初始化物品的描述和重量.
     */
    public Goods(String description, int weight)
    {
        this.description = description;
        this.weight = weight;
    }

    /**
     * 获取当前物品的描述信息.
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * 获取当前物品的重量信息.
     */
    public int getWeight()
    {
        return weight;
    }

    /**
     * 获取当前房间的描述信息和重量信息.
     */
    public String getLongDescription()
    {
        return "" + description + "\t" + weight;
    }

}
