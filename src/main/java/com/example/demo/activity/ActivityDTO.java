package com.example.demo.activity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class ActivityDTO {
    private Long id;

    @NotNull(message = "Activity name is required")
    private String name;

    @Positive(message = "Difficulty must be a positive number")
    private Integer difficulty;

    public static class ActivityDTO {
        private Long id;

        //    @NotBlank(message = "Invalid Activity: Empty")
    //    @NotNull(message = "Invalid Activity: NULL")
    //    @Size(min = 3, max = 30, message = "Invalid Activity: Must be of 3 - 30 characters")
        private String name;

        //    @NotNull(message = "Difficulty field should not be null.")
    //    @Min(value = 1, message = "Difficulty  should be at least 1.")
    //    @Max(value = 5, message = "Difficulty  should not exceed 5.")
        private Integer difficulty;
    }
}