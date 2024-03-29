package dev.stonegarden.deltahouse.wallet

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["/api/v1"])
class WalletController(
    @Autowired val walletService: WalletService,
) {

    @GetMapping("/users/{id}/wallet", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getWallet(@PathVariable id: Long): UserWalletDTO {
        return UserWalletDTO(walletService.getWallet(id))
    }

    @PostMapping("/users/{id}/wallet/spend")
    fun purchase(@PathVariable id: Long, @RequestParam value: Short) {
        walletService.purchase(id, value)
    }

    @PostMapping("/users/{id}/wallet/deposit", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun deposit(@PathVariable id: Long, @RequestParam value: Short): UserWalletDTO {
        return UserWalletDTO(walletService.deposit(id, value))
    }
}