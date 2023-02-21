package com.israel.phonebooksystem.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController


@Tag(name = "Phone Books Management")
@RestController
class PhoneBookSystemController {


    @Operation(summary = "create Contact", description = "This endpoint create Contact")
    @PostMapping("phonebooks/create")
    fun createContact() :String{
        return "null";
    }

    @Operation(summary = "all contacts", description = "This endpoint return all Contact")
    @GetMapping("phonebooks/all")
    fun allContact(): String {
        return "null";
    }
    @Operation(summary = "fetch a  contacts", description = "This endpoint return a Contact")
    @GetMapping("phonebooks/{id}")
    fun getAContact(): String {
        return "null";
    }

    @PostMapping("phonebooks/{id}")
    @Operation(summary = "delete a  contacts", description = "This endpoint delete a Contact")
    fun deleteContact(): String {
        return "null";
    }




}