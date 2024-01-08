package com.example.demo;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Player {

    @NotBlank
    private String playerId;

    private String nickname;

    @NotNull
    private List<@Valid LevelComplete> levelsCompleted;

    @Data
    public static class LevelComplete {
        @NotBlank
        private String levelId;

        @NotNull
        private Boolean completed;

        @NotNull
        private Long timeCompleted;
    }

}
