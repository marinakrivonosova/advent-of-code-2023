package adventofcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.BufferedReader
import java.io.File
import java.io.FileReader

internal class Day09Test {

    @Test
    fun part1() {
        val inputTxt = File("src/test/resources/input/day09/day09.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day09 = Day09()
        val result = day09.part1(input)
        assertEquals(1939607039, result)
    }

    @Test
    fun part1OnTestData() {
        val inputTxt = File("src/test/resources/input/day09/day09_test.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day09 = Day09()
        val result = day09.part1(input)
        assertEquals(114, result)
    }

    @Test
    fun part2() {
        val inputTxt = File("src/test/resources/input/day09/day09.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day09 = Day09()
        val result = day09.part2(input)
        assertEquals(1041, result)
    }

    @Test
    fun part2OnTestData() {
        val inputTxt = File("src/test/resources/input/day09/day09_test.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day09 = Day09()
        val result = day09.part2(input)
        assertEquals(2, result)
    }
}