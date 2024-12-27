package com.sbringboot.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {
    private long id;

    @NotEmpty(message = "Name can not be empty")
    private String name;

    @NotEmpty(message = "Enter a valid email")
    @Email
    private String email;

    @NotEmpty
    @Size(min = 10, message = "Enter at least 10 characters")
    private String body;
}
