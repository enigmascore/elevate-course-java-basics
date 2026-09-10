package answers.q14_file_io;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class Q14FileIoTest {

    private final FileWork work = new FileWork();

    @TempDir
    Path tempDir;

    private Path sampleFile() throws IOException {
        Path file = tempDir.resolve( "sample.txt" );
        Files.writeString( file, "first\n\nsecond\n   \nthird\n" );
        return file;
    }

    @Test
    void skipsBlankLines() throws IOException {
        assertEquals( List.of( "first", "second", "third" ),
                work.nonBlankLines( sampleFile() ) );
    }

    @Test
    void readsTheFirstLine() throws IOException {
        assertEquals( "first", work.firstLine( sampleFile() ) );
    }
}
