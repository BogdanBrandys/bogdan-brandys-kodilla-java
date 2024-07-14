package com.kodilla.food2door;

public interface Supplier {
    OrderDto process(final OrderRequest OrderRequest);
}
