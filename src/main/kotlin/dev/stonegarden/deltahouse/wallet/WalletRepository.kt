package dev.stonegarden.deltahouse.wallet

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface WalletRepository : JpaRepository<WalletDAO, Long> {
    fun findByUserId(userId: Long): Optional<WalletDAO>
}