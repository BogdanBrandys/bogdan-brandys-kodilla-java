package com.kodilla.food2door;

public class HealthyShop implements Supplier {
    private String name = "HealthyShop";
    @Override
    public OrderDto process(OrderRequest OrderRequest) {
        boolean isSuccessful = OrderOperator.buy(OrderRequest.getSupplier(), OrderRequest.getProduct());
        if (isSuccessful) {
            SmsInfo smsInformation = new SmsInfo();
            smsInformation.sendInfo();
            return new OrderDto(OrderRequest.getSupplier(), OrderRequest.getOrderId(), OrderRequest.getProduct(), true);
        } else {
            return new OrderDto(OrderRequest.getSupplier(), OrderRequest.getOrderId(), OrderRequest.getProduct(), false);
        }
    }

    @Override
    public String toString() {
        return "HealthyShop{" +
                "name='" + name + '\'' +
                '}';
    }
}
