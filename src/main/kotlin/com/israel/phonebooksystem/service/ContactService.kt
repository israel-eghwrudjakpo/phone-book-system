package com.israel.phonebooksystem.service

import com.israel.phonebooksystem.model.Contact
import com.israel.phonebooksystem.repo.ContactRepository
import org.springframework.stereotype.Service
import org.valiktor.ConstraintViolationException
import org.valiktor.functions.isNotNull
import org.valiktor.validate
import java.util.*

@Service
class ContactService(val contactRepository: ContactRepository) {

    fun createContact(contact: Contact) : Contact {
        try {
            validate(contact) {
                validate(Contact::name).isNotNull()
                validate(Contact::phone_number).isNotNull()
                validate(Contact::address).isNotNull()
            }
        } catch (ex: ConstraintViolationException) {
            ex.constraintViolations
                .map { "${it.property}: ${it.constraint.name}" }
                .forEach(::println);
        }
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