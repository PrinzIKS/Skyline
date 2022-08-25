import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SkylineTest {

    @Test
    public void getSkylineWithoutBuildings() {
        int[][] setup = {};
        int[][] expected = new int[0][0];
        int[][] actual = Skyline.getSkyline(setup);
        assertArrayEquals(expected, actual);
    }

    // TODO implement more tests

}
