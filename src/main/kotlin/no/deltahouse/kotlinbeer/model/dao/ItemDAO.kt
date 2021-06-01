package no.deltahouse.kotlinbeer.model.dao

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.io.Serializable
import java.time.ZonedDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "ITEMS")
data class ItemDAO(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_id_generator")
    val id: Long = 0,
    val name: String,
    val description: String,
    @CreationTimestamp
    val created: ZonedDateTime = ZonedDateTime.now(),
    @UpdateTimestamp
    val changed: ZonedDateTime? = null,
) : Serializable