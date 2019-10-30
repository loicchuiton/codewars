package four;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class MorseCodeDecoderTest {

    @Test
    public void testExampleFromDescription() {
        MatcherAssert.assertThat(
                MorseCodeDecoder
                        .decodeMorse(MorseCodeDecoder
                                .decodeBits(
                                        "1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011")),
                is("HEY JUDE"));
    }

    @Test
    public void test1() {
        MatcherAssert.assertThat(MorseCodeDecoder.decodeMorse(MorseCodeDecoder.decodeBits(" 01110 ")), is("E"));
        MatcherAssert.assertThat(MorseCodeDecoder.decodeMorse(MorseCodeDecoder.decodeBits(" 111  ")), is("E"));
    }

    @Test
    public void test2() {
        MatcherAssert.assertThat(MorseCodeDecoder.decodeMorse(MorseCodeDecoder.decodeBits(" 1  ")), is("E"));
        MatcherAssert.assertThat(MorseCodeDecoder.decodeMorse(MorseCodeDecoder.decodeBits(" 101  ")), is("I"));
        MatcherAssert.assertThat(MorseCodeDecoder.decodeMorse(MorseCodeDecoder.decodeBits(" 10001  ")), is("EE"));
        MatcherAssert.assertThat(MorseCodeDecoder.decodeMorse(MorseCodeDecoder.decodeBits(" 10111  ")), is("A"));
        MatcherAssert.assertThat(MorseCodeDecoder.decodeMorse(MorseCodeDecoder.decodeBits(" 1110111  ")), is("M"));

    }

    @Test
    public void test3() {
        MatcherAssert.assertThat(
                MorseCodeDecoder
                        .decodeMorse(MorseCodeDecoder
                                .decodeBits(
                                        " 0001110001010101000100000001110111010111000101011100010100011101011101000111010111000000011101010100010111010001110111011100010111011100011101000000010101110100011101110111000111010101110000000101110111011100010101110001110111000101110111010001010100000001110111011100010101011100010001011101000000011100010101010001000000010111010100010111000111011101010001110101110111000000011101010001110111011100011101110100010111010111010111011111111111111100000000000000011111000001111100000111110000011111000000000000000111110000000000000000000000000000000000011111111111111100000111111111111111000001111100000111111111111111000000000000000111110000011111000001111111111111110000000000000001111100000111110000000000000001111111111111110000011111000001111111111111110000011111000000000000000111111111111111000001111100000111111111111111000000000000000000000000000000000001111111111111110000011111000001111100000111110000000000000001111100000111111111111111000001111100000000000000011111111111111100000111111111111111000001111111111111110000000000000001111100000111111111111111000001111111111111110000000000000001111111111111110000011111000000000000000000000000000000000001111100000111110000011111111111111100000111110000000000000001111111111111110000011111111111111100000111111111111111000000000000000111111111111111000001111100000111110000011111111111111100000000000000000000000000000000000111110000011111111111111100000111111111111111000001111111111111110000000000000001111100000111110000011111111111111100000000000000011111111111111100000111111111111111000000000000000111110000011111111111111100000111111111111111000001111100000000000000011111000001111100000111110000000000000000000000000000000000011111111111111100000111111111111111000001111111111111110000000000000001111100000111110000011111000001111111111111110000000000000001111100000000000000011111000001111111111111110000011111000000000000000000000000000000000001111111111111110000000000000001111100000111110000011111000001111100000000000000011111000000000000000000000000000000000001111100000111111111111111000001111100000111110000000000000001111100000111111111111111000000000000000111111111111111000001111111111111110000011111000001111100000000000000011111111111111100000111110000011111111111111100000111111111111111000000000000000000000000000000000001111111111111110000011111000001111100000000000000011111111111111100000111111111111111000001111111111111110000000000000001111111111111110000011111111111111100000111110000000000000001111100000111111111111111000001111100000111111111111111000001111100000111111111111111  ")),
                is("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG."));
    }
}