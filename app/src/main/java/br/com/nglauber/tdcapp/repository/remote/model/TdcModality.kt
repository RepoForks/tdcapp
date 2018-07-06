package br.com.nglauber.tdcapp.repository.remote.model

import com.google.gson.annotations.SerializedName

data class TdcModality(
        val id: Int,
        @SerializedName("descricao")
        val description: String,
        val urlSite: String,
        @SerializedName("ativo")
        val active: Boolean,
        @SerializedName("posicaoNoEvento")
        val positionOnEvent: Int,
        val slogan: String,
        @SerializedName("descricaoDetalhada")
        val detailedDescription: String,
        @SerializedName("publicoAlvo")
        val targetAudience: String,
        @SerializedName("topicos")
        val topics: String,
        @SerializedName("prerequisitos")
        val prerequisites: String,
        @SerializedName("waning")
        val waning: String,
        @SerializedName("publicarNoSite")
        val publishOnSite: Boolean,
        @SerializedName("data")
        val date: String
)