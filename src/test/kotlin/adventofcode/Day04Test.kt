package adventofcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.BufferedReader
import java.io.File
import java.io.FileReader

internal class Day04Test {

    @Test
    fun part1OnTestData() {
        val inputTxt = File("src/test/resources/input/day04/day04_test.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day04 = Day04()
        val sum = day04.part1(input)
        assertEquals(13, sum)
    }

    @Test
    fun part1() {
        val inputTxt = File("src/test/resources/input/day04/day04.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day04 = Day04()
        val sum = day04.part1(input)
        assertEquals(27845, sum)
    }

    @Test
    fun part2OnTestData() {
        val inputTxt = File("src/test/resources/input/day04/day04_test.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day04 = Day04()
        val sum = day04.part2(input)
        assertEquals(30, sum)
    }

    @Test
    fun part2() {
        val inputTxt = File("src/test/resources/input/day04/day04.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day04 = Day04()
        val sum = day04.part2(input)
        assertEquals(9496801, sum)
    }
}