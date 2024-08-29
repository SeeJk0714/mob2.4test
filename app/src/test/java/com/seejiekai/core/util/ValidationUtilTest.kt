package com.seejiekai.core.util

import com.seejiekai.mob24test.core.util.ValidationUtil
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class ValidationUtilTest {
    @Test
    fun `validateEmail should return true for a@a,com`() {
        assertTrue(ValidationUtil.ValidationEmail("a@a.com"))
    }

    @Test
    fun `validateEmail should return false for a@1234`() {
        assertFalse(ValidationUtil.ValidationEmail("a@1234"))
    }

    @Test
    fun `validateEmail should return false for a@a,com$`() {
        assertFalse(ValidationUtil.ValidationEmail("a@a.com$"))
    }
}