package adventofcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.BufferedReader
import java.io.File
import java.io.FileReader

internal class Day02Test {

    @Test
    fun part1OnTestData() {
        val inputTxt = File("src/test/resources/input/day02/day02_test.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day02 = Day02()
        val sum = day02.part1(input)
        assertEquals(8, sum)
    }

    @Test
    fun part1() {
        val inputTxt = File("src/test/resources/input/day02/day02.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day02 = Day02()
        val sum = day02.part1(input)
        assertEquals(2278, sum)
    }

    @Test
    fun part2OnTestData() {
        val inputTxt = File("src/test/resources/input/day02/day02_test.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day02 = Day02()
        val sum = day02.part2(input)
        assertEquals(2286, sum)
    }

    @Test
    fun part2() {
        val inputTxt = File("src/test/resources/input/day02/day02.txt")
        val input = BufferedReader(FileReader(inputTxt)).readLines()
        val day02 = Day02()
        val sum = day02.part2(input)
        assertEquals(67953, sum)
    }
}