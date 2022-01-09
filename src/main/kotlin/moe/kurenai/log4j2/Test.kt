package moe.kurenai.log4j2

import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import kotlin.system.measureTimeMillis

object Test {

    private val log: Logger = LogManager.getLogger()

    @JvmStatic
    fun main(args: Array<String>) {
        measureTimeMillis {
            for (i in 0 until 10000) {
                log.info("Test log4j2 info")
                log.warn("Test log4j2 warn")
                log.error("Test log4j2 error")
            }
        }.let { log.info("cost ${it}ms") }
    }
}