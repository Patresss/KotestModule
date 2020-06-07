package com.patres.kotest.logic

import org.slf4j.LoggerFactory

class MyService {

    private val logger = LoggerFactory.getLogger(MyService::class.java)!!

    fun isValid(): Boolean {
        logger.info("Start...")
        return true
    }
}