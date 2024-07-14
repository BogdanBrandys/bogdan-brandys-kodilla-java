package com.kodilla.food2door;

public class ExtraFoodShop implements Supplier{
    private String name = "ExtraFoodShop";
    @Override
    public OrderDto process(OrderRequest OrderRequest) {
             boolean isSuccessful = OrderOperator.buy(OrderRequest.getSupplier(), OrderRequest.getProduct());
        if (isSuccessful) {
            MailInformation mailInformation = new MailInformation();
            mailInformation.sendInfo();
            return new OrderDto(OrderRequest.getSupplier(), OrderRequest.getOrderId(), OrderRequest.getProduct(), true);
        } else {
            return new OrderDto(OrderRequest.getSupplier(), OrderRequest.getOrderId(), OrderRequest.getProduct(), false);
        }
    }

    @Override
    public String toString() {
        return "ExtraFoodShop{" +
                "name='" + name + '\'' +
                '}';
    }
}
