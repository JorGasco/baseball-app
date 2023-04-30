package controllers

import models.Players
import persistence.Serializer

class PlayersAPI(serializerType: Serializer) {

    private var serializer: Serializer = serializerType

    private var players = ArrayList<Players>()

}
