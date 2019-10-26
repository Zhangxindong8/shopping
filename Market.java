public class Market{
    private String marketName;
    private Product[] productArr;//仓库
    public String getMarketName(){
        return marketName;
    }
    public void setMarketName(String marketName){
        this.marketName = marketName;
    }
    public Product[] getProductArr(){
        return productArr;
    }
    public void setProductArr(Product[] productArr){
        this.productArr = productArr;
    }
    Product sell(String name){//卖货，指定商品名
        for(int i = 0;i < productArr.length;i++){
            if(productArr[i].getProName() == name){
                return productArr[i];
            }
        }
        return null;
    }
}