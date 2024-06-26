package com.jonghun.all_in_one.common

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CommonController {

    @GetMapping(value = ["/"])
    fun health(): Boolean {
        return true
    }
}