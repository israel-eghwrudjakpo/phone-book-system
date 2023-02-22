package com.israel.phonebooksystem.helpers

import org.springframework.data.domain.Page
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

object ResponseBuilder {
    fun <T> success(message: String): ResponseEntity<Wrapper<T>> {
        return ResponseEntity.ok(Wrapper(message))
    }

    fun <T> success(data: T): ResponseEntity<Wrapper<T>> {
        return ResponseEntity.ok(Wrapper(data))
    }

    fun <T> success(message: String, successType: Type): ResponseEntity<Wrapper<T>> {
        return ResponseEntity.status(if (Type.CREATED == successType) HttpStatus.OK else HttpStatus.CREATED)
            .body(Wrapper(message))
    }

    fun <T> success(data: T, successType: Type): ResponseEntity<Wrapper<T>> {
        return ResponseEntity.status(if (Type.CREATED == successType) HttpStatus.CREATED else HttpStatus.OK)
            .body(Wrapper(data))
    }

    fun <T> success(message: String?, data: T): ResponseEntity<Wrapper<T>> {
        return ResponseEntity.ok(Wrapper(message!!, data))
    }

    fun <T> success(message: String?, data: T, successType: Type): ResponseEntity<Wrapper<T>> {
        return ResponseEntity.status(if (Type.CREATED == successType) HttpStatus.CREATED else HttpStatus.OK).body(
            Wrapper(
                message!!, data
            )
        )
    }

    fun <D, T : Page<D>?> success(data: T): ResponseEntity<Wrapper<Collection<D>>> {
        val totalPages = data!!.totalPages
        val current = data.number + 1
        val total = data.totalElements
        val perPage = data.size
        var from = (current - 1).toLong() * perPage + 1
        var to = Math.min(total, current.toLong() * perPage)
        if (from > total) {
            to = 0
            from = to
        }
        val meta = Wrapper.Meta(current, from, to, perPage, total, totalPages)
        return ResponseEntity.ok(Wrapper(data.content, meta))
    }

    enum class Type {
        CREATED, OK
    }
}