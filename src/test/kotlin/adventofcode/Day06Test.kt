package adventofcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.BufferedReader
import java.io.File
import java.io.FileReader

internal class Day06Test {

    @Test
    fun part1TestData() {
        val inputTxt = File("src/test/resources/input/day06/day06_test.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day06 = Day06()
        val result = day06.part1(input)
        assertEquals(288, result)
    }

    @Test
    fun part1() {
        val inputTxt = File("src/test/resources/input/day06/day06.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day06 = Day06()
        val result = day06.part1(input)
        assertEquals(781200, result)
    }

    @Test
    fun part2TestData() {
        val inputTxt = File("src/test/resources/input/day06/day06_test.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day06 = Day06()
        val result = day06.part2(input)
        assertEquals(71503, result)
    }

    @Test
    fun part2() {
        val inputTxt = File("src/test/resources/input/day06/day06.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day06 = Day06()
        val result = day06.part2(input)
        assertEquals(49240091, result)
    }
}