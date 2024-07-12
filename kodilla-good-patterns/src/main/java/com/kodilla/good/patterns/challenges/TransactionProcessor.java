package com.kodilla.good.patterns.challenges;

public class TransactionProcessor {
    private InformationService informationService;
    private TransactionService transactionService;
    private TransactionRepository transactionRepository;

    public TransactionProcessor(final InformationService informationService,
                                final TransactionService transactionService,
                                final TransactionRepository transactionRepository) {
        this.informationService = informationService;
        this.transactionService = transactionService;
        this.transactionRepository = transactionRepository;
    }
    public TransactionDto process(final TransactionRequest transactionRequest) {
        boolean isSuccessful = transactionService.buy(transactionRequest.getUser(), transactionRequest.getProduct());
        if (isSuccessful) {
            informationService.inform(transactionRequest.getUser());
            transactionRepository.createTransaction(transactionRequest.getUser(), transactionRequest.getProduct());
            return new TransactionDto(transactionRequest.getUser(), transactionRequest.getProduct(), true);
        } else {
            return new TransactionDto(transactionRequest.getUser(), transactionRequest.getProduct(), false);
        }
    }
}
