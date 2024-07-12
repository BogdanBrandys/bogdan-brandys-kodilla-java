package com.kodilla.good.patterns.challenges;

public class TransactionDto {
        private User user;
        private Product product;
        boolean isBuy;
        public TransactionDto(final User user, final Product product, final boolean isBuy)
        {
            this.user = user;
            this.product = product;
            this.isBuy = isBuy;
        }
        public User getUser() { return user; }
        public Product getProduct() { return product; }
        public boolean isBuy() { return isBuy; }
}
