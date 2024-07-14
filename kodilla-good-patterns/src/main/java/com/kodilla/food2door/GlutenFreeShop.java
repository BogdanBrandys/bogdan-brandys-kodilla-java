package com.kodilla.food2door;

public class GlutenFreeShop implements Supplier{
    private String name = "GlutenFreeShop";
    @Override
    public OrderDto process(OrderRequest OrderRequest) {
        boolean isSuccessful = OrderOperator.buy(OrderRequest.getSupplier(), OrderRequest.getProduct());
        if (isSuccessful) {
            System.out.println("hey, you are gluten free man!:)");
            return new OrderDto(OrderRequest.getSupplier(), OrderRequest.getOrderId(), OrderRequest.getProduct(), true);
        } else {
            return new OrderDto(OrderRequest.getSupplier(), OrderRequest.getOrderId(), OrderRequest.getProduct(), false);
        }
    }

    @Override
    public String toString() {
        return "GlutenFreeShop{" +
                "name='" + name + '\'' +
                '}';
    }
}
