package io.lindstrom.m3u8;

import java.io.IOException;

public class PlaylistParserException extends IOException {
    public PlaylistParserException(String message) {
        super(message);
    }
}
