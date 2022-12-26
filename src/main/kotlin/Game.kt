fun main(args: Array<String>) {
    val name = "Madrigal"
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
    val HPStatus = formatHPStat(healthPoints, isBlessed)
    //Аура
    val AuraColor = auraColor(isBlessed, healthPoints, isImmortal)
    //Состояние
    printPlayerStatus(AuraColor, isBlessed, name, HPStatus)
    castFireball()
}

private fun printPlayerStatus(
    AuraColor: String,
    isBlessed: Boolean,
    name: String,
    HPStatus: String
) {
    println("(Aura: $AuraColor)" + "(Blessed: ${if (isBlessed == true) "YES" else "NO"})")
    println("$name $HPStatus")
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String {
    val hasAura = isBlessed && healthPoints > 50 || isImmortal
    val AuraColor = if (hasAura) "HAS GREEN AURA" else "HAS NO AURA"
    return AuraColor
}

private fun formatHPStat(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {
        100 -> "is in excellent condition"
        in 90..99 -> "has a few scratches"
        in 75..89 -> if (isBlessed) "has some minor wounds but is healing quite quickly!" else "has some minor wounds"
        in 15..74 -> "Looks bad"
        else -> "is in awful condition"
    }

private fun castFireball(numFireballs: Int = 2) {
    println("A glass of Fireball springs into existence. (x$numFireballs)")
    println(
        "You are ${
            when (numFireballs) {
                0 -> "In normal condition"
                in 1..10 -> "Tipsy"
                in 11..20 -> "Sloshed"
                in 21..30 -> "Soused"
                in 31..40 -> "Stewed"
                else -> "t0aSt3d"
            }
        }",
    )
}