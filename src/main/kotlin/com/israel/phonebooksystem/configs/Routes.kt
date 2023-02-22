package com.israel.phonebooksystem.configs

class Routes {
    object Exception {
        const val DEFAULT_ERROR = "/error"
    }

    object Contact {
        const val INDEX = "phonebooks"
        const val SHOW = "phonebooks/all"

        object Operation {
            const val CREATE = "/create"
            const val RESOURCE = "/{id}"
        }
    }
}