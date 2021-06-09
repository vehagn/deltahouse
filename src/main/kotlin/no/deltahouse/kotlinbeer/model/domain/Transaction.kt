package no.deltahouse.kotlinbeer.model.domain

import no.deltahouse.kotlinbeer.model.dao.TransactionDAO
import java.time.ZonedDateTime

class Transaction(transaction: TransactionDAO) {
    val walletId = transaction.wallet.id
    val previousBalance: Int = transaction.previousBalance
    val balanceChange: Short = transaction.balanceChange
    val transactionDate: ZonedDateTime = transaction.transactionDate
}