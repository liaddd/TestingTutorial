import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotEquals


class MyFirstTest {

    @Test
    fun should_add_one_to_number(){
        var x = 1
        x = addOneToNumber(x)
        assertEquals(2, x)
    }

    @Test
    fun should_return_hundred_animals(){
        assertEquals(getAnimalsNames(100).size, 100)
    }

    @Test
    fun should_not_be_equal(){
        assertNotEquals(getAnimalsNames(1).size, 2)
    }

    @Test
    fun should_be_animal_no_name(){
        val animalsList = getAnimalsNames(10)
        animalsList.forEach {
            println(it)
            assert(it.contains("Animal no."))
        }
    }
}