package com.kshrd.krorya.model.enumeration;

import com.kshrd.krorya.exception.CustomNotFoundException;

public enum IngredientsEnum {
    LESS_THAN_5("Less than 5 ingredients"),
    LESS_THAN_10("Less than 10 ingredients"),
    LESS_THAN_15("Less than 15 ingredients");

    private final String label;

    IngredientsEnum(String label) {
        this.label = label;
    }


    /*public static IngredientsEnum fromString(String value){
        for( IngredientsEnum ingredientsEnum : values()){
            if(ingredientsEnum.name().equalsIgnoreCase(value)){
                return ingredientsEnum;
            }
        }
        throw new CustomNotFoundException("Invalid ingredients enum value. ");
    }*/
}
