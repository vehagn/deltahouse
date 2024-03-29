package dev.stonegarden.deltahouse.item

import java.time.ZonedDateTime

data class BorrowedItem(
    val id: Long,
    val item: Item,
    val comment: String?,
    val borrowedDate: ZonedDateTime,
    val returnByDate: ZonedDateTime,
    val returnedDate: ZonedDateTime?
) {
    constructor(borrowedItem: BorrowedItemDAO) : this(
        id = borrowedItem.id,
        item = Item(borrowedItem.item),
        comment = borrowedItem.itemComment,
        borrowedDate = borrowedItem.borrowedDate,
        returnByDate = borrowedItem.borrowedDate,
        returnedDate = if (borrowedItem.returnedDate == null) borrowedItem.returnedDate else null
    )
}
