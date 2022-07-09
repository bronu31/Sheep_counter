import static org.junit.jupiter.api.Assertions.*;

class SheepTest {

    @org.junit.jupiter.api.Test
    void TestForCount() {
        var counter=new SheepCounter();
        Boolean[] array1 = {
                true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
        assertEquals(17,counter.countSheeps(array1));
    }
    @org.junit.jupiter.api.Test
    void TestForNull() {
        var counter=new SheepCounter();
        Boolean[] array1 = {true,  true,  true,  false,
                null,  true,  true,  null ,
                true,  null, true,  false,
                true,  false, null, true ,
                null,  true,  true,  true ,
                false, false, true,  true };
        assertEquals(14,counter.countSheeps(array1));
    }

}