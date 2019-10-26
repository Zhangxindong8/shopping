import com.sun.org.apache.bcel.internal.generic.IMPDEP1;

public class Shopping {
    public static void main(String[] args) {
        Product P1 = new Product();
        Product P2 = new Product();
        Product P3 = new Product();
        Product P4 = new Product();
        Product P5 = new Product();
        P1.setProName("电视机");
        P1.setProName("洗衣机");
        P1.setProName("豆浆机");
        P1.setProName("空调机");
        P1.setProName("吹风机");

        Market m = new Market();
        m.setMarketName("家乐福");
        m.setProductArr(new Product[]{P1,P2,P3,P4,P5});

        Person p = new Person();
        p.setName("小韩");

        Product result  = p.shopping(m,"豆浆机");
        if(result != null){
            System.out.println(p.getName() + "在" + m.getMarketName()+"买到了"+result.getProName());
        }else{
            System.out.println(p.getName()+"白跑了一趟，在"+m.getMarketName()+"什么都没买到");
        }
    }

}
