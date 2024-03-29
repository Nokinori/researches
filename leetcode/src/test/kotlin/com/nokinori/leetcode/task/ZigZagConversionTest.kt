package com.nokinori.leetcode.task

import com.nokinori.leetcode.TestCase
import org.assertj.core.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class ZigZagConversionTest {
    @ParameterizedTest
    @MethodSource("provideArguments")
    fun simpleSolution(string: String, numRows: Int, expect: String) {
        val result = ZigZagConversion.convert(string, numRows)
        Assertions.assertThat(result).isEqualTo(expect)
    }

    companion object {
        @Suppress("unused")
        @JvmStatic
        fun provideArguments(): Stream<Arguments> = TestCase
            .of(
                TestCase.create(input = "PAYPALISHIRING" to 3, expect = "PAHNAPLSIIGYIR"),
                TestCase.create(input = "PAYPALISHIRING" to 4, expect = "PINALSIGYAHRPI"),
                TestCase.create(input = "A" to 1, expect = "A"),
            )
    }
}