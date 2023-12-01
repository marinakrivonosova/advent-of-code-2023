package adventofcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.BufferedReader
import java.io.File
import java.io.FileReader

internal class Day01Test {

    @Test
    fun part1OnTestData() {
        val inputTxt = File("src/test/resources/input/day01/day01_test_part1.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day01 = Day01()

        val value = day01.part1(input)
        assertEquals(142, value)
    }

    @Test
    fun part2partOnTestData() {
        val inputTxt = File("src/test/resources/input/day01/day01_test_part2.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day01 = Day01()

        val value = day01.part2(input)
        assertEquals(281, value)
    }

    @Test
    fun part1OnRealData() {
        val inputTxt = File("src/test/resources/input/day01/day01.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day01 = Day01()

        val value = day01.part1(input)
        assertEquals(55816, value)
    }

    @Test
    fun part2OnRealData() {
        val inputTxt = File("src/test/resources/input/day01/day01.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day01 = Day01()

        val value = day01.part2(input)
        assertEquals(54980, value)
    }
}