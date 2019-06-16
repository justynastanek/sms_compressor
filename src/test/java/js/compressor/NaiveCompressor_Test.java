package js.compressor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NaiveCompressor_Test {

    @Test
    public void test_compress() {
        NaiveCompressor nc = new NaiveCompressor();
        assertEquals("CompressMyMessage", nc.compress("Compress my message"));
    }

    @Test
    public void test_decompress() {
        NaiveCompressor nc = new NaiveCompressor();
        assertEquals("Compress My Message", nc.decompress("CompressMyMessage"));
    }

    @Test
    public void test_compress_and_decompress() {
        NaiveCompressor nc = new NaiveCompressor();
        String myMessage = "This is my message to you";
        String compressedMessage = nc.compress(myMessage);
        String decompressedMessage = nc.decompress(compressedMessage);

        assertEquals(myMessage.toLowerCase(), decompressedMessage.toLowerCase());
    }

}
