package com.israel.phonebooksystem.dto.request

import lombok.Getter
import javax.validation.constraints.NotBlank

@Getter
 data class ContactRequest(@NotBlank val name :String, @NotBlank val phone : Number, @NotBlank val address: String)