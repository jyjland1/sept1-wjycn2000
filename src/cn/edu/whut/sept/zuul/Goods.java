package cn.edu.whut.sept.zuul;

public class Goods {
    private String description;
    private int weight;

    /**
     * ��ʼ����Ʒ������������.
     */
    public Goods(String description, int weight)
    {
        this.description = description;
        this.weight = weight;
    }

    /**
     * ��ȡ��ǰ��Ʒ��������Ϣ.
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * ��ȡ��ǰ��Ʒ��������Ϣ.
     */
    public int getWeight()
    {
        return weight;
    }

    /**
     * ��ȡ��ǰ�����������Ϣ��������Ϣ.
     */
    public String getLongDescription()
    {
        return "" + description + "\t" + weight;
    }

}
