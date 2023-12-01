package adventofcode

class Day01 {

    fun part1(input: List<String>): Int {
        return input.sumOf { line ->
            line.filter { it.isDigit() }.map { it - '0' }.let { it.first() * 10 + it.last() }
        }
    }

    fun part2(input: List<String>): Int {
        val numbers = listOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

        return input.sumOf { line ->
            val digits = line.mapIndexedNotNull { index, c ->
                if (c.isDigit()) c - '0'
                else (numbers.indexOfFirst { line.startsWith(it, index) } + 1).takeIf { it > 0 }
            }
            digits.first() * 10 + digits.last()
        }
    }
}