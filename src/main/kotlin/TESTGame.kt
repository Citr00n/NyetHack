fun main(args: Array<String>) {
    val name = "Citr0n"
    var healthPoints = 89
    var isBlessed = true
    var isImmortal = false
    val race = "gnome"
    val faction = when (race) {
        "dwarf" -> "Keepers of the Mines"
        "gnome" -> "Keepers of the Mines"
        "orc" -> "Free People of the Rolling Hills"
        "human" -> "Free People of the Rolling Hills"
        else -> {}
    }
    val HPStatus = when (healthPoints) {
        100 -> "is in excellent condition"
        in 90..99 -> "has a few scrathes"
        in 75..89 -> if (isBlessed == true) "has some minor wounds but is healing quite quickly!" else "has some minor wounds"
        in 15..74 -> "Looks bad"
        else -> "is in awful position"
    }
    //Аура
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) *
            20 ).toInt()
    val AuraColor = when (karma) {
        in 0..5 -> "RED"
        in 6..10 -> "ORANGE"
        in 11..15 -> "PURPLE"
        in 16..20 -> "GREEN"
        else -> {}
    }
    //Состояние
    val StatusBar = "(HP: $healthPoints) (Aura: $AuraColor) -> $name $HPStatus"
    println(StatusBar)
}