package com.israel.phonebooksystem.model

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.ZonedDateTime
import javax.persistence.*


@Entity
@Table(name = "CONTACT")
data class Contact (
     val name : String? = null,
     val phone_number : String? = null,
     val address : String? = null

){

    @Id @GeneratedValue var id: Long? = null

    @CreationTimestamp
    private val createdAt: ZonedDateTime? = null

    @UpdateTimestamp
    private val updatedAt: ZonedDateTime? = null

}
