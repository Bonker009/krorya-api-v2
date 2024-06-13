package com.kshrd.krorya.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroceryList {
    private UUID groceryListId;
    private String groceryListTitle;    private UUID userID;
}
