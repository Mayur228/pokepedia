package com.theappmakerbuddy.pokepedia.data.remote.responses

import com.theappmakerbuddy.pokepedia.data.remote.responses.GenerationI
import com.theappmakerbuddy.pokepedia.data.remote.responses.GenerationIi
import com.theappmakerbuddy.pokepedia.data.remote.responses.GenerationIii
import com.theappmakerbuddy.pokepedia.data.remote.responses.GenerationIv
import com.theappmakerbuddy.pokepedia.data.remote.responses.GenerationV
import com.theappmakerbuddy.pokepedia.data.remote.responses.GenerationVi
import com.theappmakerbuddy.pokepedia.data.remote.responses.GenerationVii
import com.theappmakerbuddy.pokepedia.data.remote.responses.GenerationViii

data class Versions(
    val generationi: GenerationI,
    val generationii: GenerationIi,
    val generationiii: GenerationIii,
    val generationiv: GenerationIv,
    val generationv: GenerationV,
    val generationvi: GenerationVi,
    val generationvii: GenerationVii,
    val generationviii: GenerationViii
)