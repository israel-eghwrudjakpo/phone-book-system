package com.israel.phonebooksystem.configs

class Routes {
    object Exception {
        const val DEFAULT_ERROR = "/error"
    }

    object Contact {
        const val INDEX = "phone-contact"
        const val SHOW = "phone-contact/all"

        object Operation {
            const val CREATE = "/create"
            const val RESOURCE = "/{id}"
        }
    }
}