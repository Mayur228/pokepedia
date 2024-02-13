package com.theappmakerbuddy.pokepedia.data.remote.responses

import com.google.gson.annotations.SerializedName
import com.theappmakerbuddy.pokepedia.data.remote.responses.Ability
import com.theappmakerbuddy.pokepedia.data.remote.responses.Form
import com.theappmakerbuddy.pokepedia.data.remote.responses.GameIndice
import com.theappmakerbuddy.pokepedia.data.remote.responses.Move
import com.theappmakerbuddy.pokepedia.data.remote.responses.Species
import com.theappmakerbuddy.pokepedia.data.remote.responses.Sprites
import com.theappmakerbuddy.pokepedia.data.remote.responses.Stat
import com.theappmakerbuddy.pokepedia.data.remote.responses.Type

data class Pokemon(
    val abilities: List<Ability>,
    @SerializedName("base_experience")
    val baseExperience: Int,
    val forms: List<Form>,
    @SerializedName("game_indices")
    val gameIndices: List<GameIndice>,
    val height: Int,
    @SerializedName("held_items")
    val heldItems: List<Any>,
    val id: Int,
    @SerializedName("is_default")
    val isDefault: Boolean,
    @SerializedName("location_area_encounters")
    val locationAreaEncounters: String,
    val moves: List<Move>,
    val name: String,
    val order: Int,
    @SerializedName("past_types")
    val pastTypes: List<Any>,
    val species: Species,
    val sprites: Sprites,
    val stats: List<Stat>,
    val types: List<Type>,
    val weight: Int
)