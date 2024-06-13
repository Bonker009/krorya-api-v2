package com.kshrd.krorya.model.entity;

import com.kshrd.krorya.model.dto.AppUserDTO;
import com.kshrd.krorya.model.dto.CookingStepsDTO;
import com.kshrd.krorya.model.dto.IngredientDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    private UUID recipeId;
    private String recipeTitle;
    private String description;
    private String creatorName;
    private Boolean isDraft;
    private Boolean isPublic;
    private Boolean isBookmarked;
    private Integer servingSizes;
    private String cookingLevel;
    private Integer cookingTime;
    private String cuisineName;
    private String recipeImage;
    private Date createdAt;
    private Date updatedAt;
    private List<Ingredient> ingredients;
    private List<CookingSteps> cookingSteps;
    private List<String> tagName;
}
