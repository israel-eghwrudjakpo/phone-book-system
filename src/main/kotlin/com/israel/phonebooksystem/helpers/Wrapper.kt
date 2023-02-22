package com.israel.phonebooksystem.helpers

import com.fasterxml.jackson.annotation.JsonInclude
import lombok.Getter

@Getter
class Wrapper<T> @JvmOverloads constructor(private val message: String, data: T? = null, meta: Meta? = null) {
    private var data: T? = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private val meta: Meta?

    @JvmOverloads
    constructor(data: T, meta: Meta? = null) : this("Operation Successful!", data, meta) {
    }

    init {
        if (data != null) {
            this.data = data
        }
        this.meta = meta
    }

    @Getter
    class Meta(
        private val currentPage: Int,
        private val from: Long,
        private val to: Long,
        private val perPage: Int,
        private val total: Long,
        private val lastPage: Int
    )
}