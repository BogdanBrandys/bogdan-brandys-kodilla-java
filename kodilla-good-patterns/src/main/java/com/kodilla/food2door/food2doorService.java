package com.kodilla.food2door;

public class food2doorService {
    public static void main(String[] args) {
        OrderRequestRetriever retriever = new OrderRequestRetriever();
        OrderRequest request = retriever.retrieve();
        Supplier supplier = request.getSupplier();
        OrderDto dto = supplier.process(request);
        System.out.println();
        System.out.println(dto.getOrderId());
        System.out.println(dto.getProduct());
        System.out.println(dto.getSupplier());
    }
}
