package com.drstealth.soulcraft.utility;

import com.drstealth.soulcraft.reference.Reference;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.message.Message;

import static org.apache.logging.log4j.Level.*;


/**
 * Created by DrStealth on 8/11/2016.
 */
public class LogHelper
{
    public static final Marker MOD_MARKER = MarkerManager.getMarker(Reference.MOD_ID);
    private static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);

    public static void log(Level level, Marker marker, Message message) {
        LOGGER.log(level, marker, message);
    }

    public static void log(Level level, Message message) {
        log(level, MOD_MARKER, message);
    }

    // ALL
    public static void all(Marker marker, Message message) {
        log(ALL, marker, message);
    }

    public static void all(Message message) {
        all(MOD_MARKER, message);
    }

    // DEBUG
    public static void debug(Marker marker, Message message) {
        log(DEBUG, marker, message);
    }

    public static void debug(Message message) {
        debug(MOD_MARKER, message);
    }

    // ERROR
    public static void error(Marker marker, Message message) {
        log(ERROR, marker, message);
    }

    public static void error(Message message) {
        error(MOD_MARKER, message);
    }

    // FATAL
    public static void fatal(Marker marker, Message message) {
        log(FATAL, marker, message);
    }

    public static void fatal(Message message) {
        fatal(MOD_MARKER, message);
    }

    // INFO
    public static void info(Marker marker, Message message) {
        log(INFO, marker, message);
    }

    public static void info(Message message) {
        info(MOD_MARKER, message);
    }

    // OFF
    public static void off(Marker marker, Message message) {
        log(OFF, marker, message);
    }

    public static void off(Message message) {
        off(MOD_MARKER, message);
    }

    // TRACE
    public static void trace(Marker marker, Message message) {
        log(TRACE, marker, message);
    }

    public static void trace(Message message) {
        trace(MOD_MARKER, message);
    }

    // WARN
    public static void warn(Marker marker, Message message) {
        log(WARN, marker, message);
    }

    public static void warn(Message message) {
        warn(MOD_MARKER, message);
    }
}
