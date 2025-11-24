
package com.pepsico.sb.model;

import io.swagger.v3.oas.annotations.media.Schema;

public class UserResponse {

    @Schema(description = "User email address", example = "alice@pepsico.com")
    private String email;

    @Schema(description = "User first name", example = "Alice")
    private String firstName;

    @Schema(description = "User last name", example = "Hood")
    private String lastName;

    public UserResponse() {}

    public UserResponse(String email, String firstName, String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
}