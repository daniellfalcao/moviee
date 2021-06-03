package br.danielfalcao.shared

import br.danielfalcao.shared.Platform

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
