public class bill2 {
    public static void main(String[] args) {
        int p1=399;
        int p2 = 499;
        int p3 =599;
        int p4 =699;
        int total=p1+p2+p3+p4;
        float discount= 0f;
        if(total<500){
            System.out.println("no discount is applied");
        
        }
        if(total>=500 && total<1000){
               discount =total*0.10f;

        }
        else{
            discount = total*0.20f;
        }
        float grandtotal = total-discount;
        System.out.println("Total:"+total);
        System.out.println("Discount:"+discount);
        System.out.println("Grandtotal:"+grandtotal);
    }
    
}
