package models

data class Players(
        var playerName: String,
        var playerSurname: String,
        var age: Int,
        var height: Int,
        var weight: Int,
        var position: String,
        var isNoteArchived: Boolean)
{}