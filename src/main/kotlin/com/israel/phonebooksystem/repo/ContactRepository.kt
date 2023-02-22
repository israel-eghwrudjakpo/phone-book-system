package com.israel.phonebooksystem.repo

import com.israel.phonebooksystem.model.Contact
import org.springframework.data.repository.CrudRepository
import java.util.*

interface ContactRepository : CrudRepository<Contact, Long> {

    fun existsByName(name: String?): Boolean
    override fun findAll(): Iterable<Contact>
    override fun findById(id: Long): Optional<Contact>
    override fun deleteById(id: Long)
}