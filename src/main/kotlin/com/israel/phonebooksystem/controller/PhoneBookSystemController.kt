package com.israel.phonebooksystem.controller

import com.israel.phonebooksystem.configs.Routes
import com.israel.phonebooksystem.model.Contact
import com.israel.phonebooksystem.service.ContactService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.validation.Valid


@Tag(name = "Phone Contact Management")
@RestController
class PhoneBookSystemController(private var contactService: ContactService) {


    @Operation(summary = "create Contact", description = "This endpoint create Contact")
    @PostMapping(Routes.Contact.Operation.CREATE)
    fun createContact(@Valid @RequestBody contact: Contact): ResponseEntity<Contact> {
        return ResponseEntity.ok(contactService.createContact(contact))
    }

    @Operation(summary = "all contacts", description = "This endpoint return all Contact")
    @GetMapping(Routes.Contact.SHOW)
    fun allContact(): ResponseEntity<Iterable<Contact>> {
        return ResponseEntity.ok(contactService.findAll())
    }
    @Operation(summary = "fetch a  contacts", description = "This endpoint return a Contact")
    @GetMapping(Routes.Contact.Operation.RESOURCE)
    fun getAContact(@PathVariable id: Long): Optional<Contact> {
        return contactService.findById(id)
    }

    @PostMapping(Routes.Contact.Operation.RESOURCE)
    @Operation(summary = "delete a  contacts", description = "This endpoint delete a Contact")
    fun deleteContact(@PathVariable id: Long) {
        return contactService.deleteContact(id)
    }




}