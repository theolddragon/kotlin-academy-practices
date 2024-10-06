package function.chapter11.orthrow

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

inline fun <T> T?.orThrow(throwable: () -> Throwable): T = this ?: throw throwable()

@Suppress("RedundantNullableReturnType")
class OrThrowTest {
    @Test
    fun `should throw for null value`() {
        val value: String? = null
        val exception = RuntimeException("Value is null")
        val result = runCatching { value.orThrow { exception } }
        assertEquals(exception, result.exceptionOrNull())
    }

    @Test
    fun `should return value for non-null value`() {
        val value: String? = "Hello"
        val result = value.orThrow { RuntimeException("Value is null") }
        assertEquals("Hello", result)
    }

    private val value: String? = "Hello"
    val result = value.orThrow { RuntimeException("Value is null") }

    @Test
    fun `should specify result type as non-nullable`() {
        assertFalse(::result.returnType.isMarkedNullable)
    }
}