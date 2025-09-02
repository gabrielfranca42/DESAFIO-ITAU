package service;

import lombok.Data;
import lombok.Getter;
import model.Transaction;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
@Data
@Service
public class TransactionService {

     private final Queue <Transaction> transactions = new ConcurrentLinkedDeque<>();

     public void addTransaction(Transaction transaction){
         transactions.add(transaction);

     }
     public void clearTransactions(){
         transactions.clear();
     }
     public DoubleSummaryStatistics getStastics(){
         OffsetDateTime now = OffsetDateTime.now();
         return transactions.stream()
                 .filter(t -> t.getDataHora().isAfter(now.minusSeconds(60)))
                 .mapToDouble(Transaction::getValor)
                 .summaryStatistics();
     }
}
