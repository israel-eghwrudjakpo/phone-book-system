package com.israel.phonebooksystem.service

import com.israel.phonebooksystem.model.Contact
import com.israel.phonebooksystem.repo.ContactRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ContactService(val contactRepository: ContactRepository) {

    fun createContact(contact: Contact): Contact {
       return contactRepository.save(contact)
    }

    fun findById(long: Long): Optional<Contact> {
        return contactRepository.findById(long)
    }

    fun findAll(): Iterable<Contact> {
        return contactRepository.findAll()
    }

    fun deleteContact(long: Long) {
        return contactRepository.deleteById(long)
    }
}