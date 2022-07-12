/*
 * Copyright (c) 7/12/2022, Pexers (https://github.com/Pexers)
 */

package model.authentication

import io.ktor.server.auth.OAuthServerSettings.*

interface CloudAuth {
    val shortName: String
    val configName: String
    var session: SessionData

    fun getOAuthSettings(): OAuth2ServerSettings
}
