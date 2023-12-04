package adventofcode

import kotlin.math.pow

class Day04 {

    private fun parseInput(input: List<String>): List<Pair<Set<String>, Set<String>>> {
        return input.map { line ->
            line.substringAfter(": ").split('|')
                .let { currLine ->
                    val winningCards = currLine[0].trim().split(" ").filter { a -> a != "" }.toSet()
                    val elfCards = currLine[1].trim().split(" ").filter { a -> a != "" }.toSet()
                    winningCards to elfCards
                }
        }
    }

    fun part1(input: List<String>): Int {
        return parseInput(input).sumOf { entry ->
            2.0.pow((entry.second.intersect(entry.first).size) - 1).toInt()
        }
    }

    fun part2(input: List<String>): Int {
        val cardsTaken = IntArray(input.size) { 1 }
        parseInput(input).withIndex().forEach { (index, entry) ->
            val matches = entry.second.intersect(entry.first).size
            for (t in 1..cardsTaken[index]) {
                for (i in 1..matches) {
                    cardsTaken[index + i] = cardsTaken[index + i] + 1
                }
            }
        }
        return cardsTaken.sum()
    }
}