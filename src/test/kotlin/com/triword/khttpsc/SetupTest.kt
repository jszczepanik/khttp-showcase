package com.triword.khttpsc

import com.triword.khttpsc.main
import org.junit.Test

class SetupTest {

    @Test(expected = RuntimeException::class.java)
    fun `JUnit works`() {
        throw RuntimeException("Yep, it's an exception")
    }

    @Test
    fun `main executes`() {
    	main()
    }

}
