
package com.pepsico.sb.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

    @Schema(description = "User email address", example = "alice@pepsico.com")
    private String email;

    @Schema(description = "User first name", example = "Alice")
    private String firstName;

    @Schema(description = "User last name", example = "Hood")
    private String lastName;
}