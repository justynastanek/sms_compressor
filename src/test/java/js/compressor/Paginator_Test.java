package js.compressor;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Paginator_Test {

    @Test
    public void test_paginate() {
        Paginator pg = new Paginator(3);
        String[] paginated = pg.paginate("JustRandomTextToBePaginatedXX");
        assertEquals(10, paginated.length);
    }
}
