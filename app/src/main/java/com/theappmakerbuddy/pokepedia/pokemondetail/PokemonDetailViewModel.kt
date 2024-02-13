package com.theappmakerbuddy.pokepedia.pokemondetail

import androidx.lifecycle.ViewModel
import com.theappmakerbuddy.pokepedia.data.remote.responses.Pokemon
import com.theappmakerbuddy.pokepedia.repository.PokemonRepository
import com.theappmakerbuddy.pokepedia.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}