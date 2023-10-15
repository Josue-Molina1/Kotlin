import java.util.Scanner

// Define a data class to represent a Currency with a name and exchange rate
data class Currency(val name: String, val exchangeRate: Double)

// Function to convert an amount from one currency to another
fun convertCurrency(amount: Double, fromCurrency: Currency, toCurrency: Currency): Double {
    return amount * fromCurrency.exchangeRate / toCurrency.exchangeRate
}

fun main() {
    val scanner = Scanner(System.`in`)

    // Define currencies
    val usd = Currency("USD", 1.0)
    val eur = Currency("EUR", 0.85)
    val gbp = Currency("GBP", 0.75)
    val lmp = Currency("LMP", 0.04)

    // Prompt the user for input
    println("Welcome to the Currency Exchange Calculator!")
    println("Available Currencies:")
    println("1. ${usd.name}")
    println("2. ${eur.name}")
    println("3. ${gbp.name}")
    println("4. ${lmp.name}")
    print("Enter the currency you are converting from (1/2/3/4): ")
    val fromChoice = scanner.nextInt()

    // Get the 'from' currency based on user input
    val fromCurrency = when (fromChoice) {
        1 -> usd
        2 -> eur
        3 -> gbp
        4 -> lmp
        else -> usd
    }

    print("Enter the amount you want to convert: ")
    val amountToConvert = scanner.nextDouble()

    print("Enter the currency you want to convert to (1/2/3/4): ")
    val toChoice = scanner.nextInt()

    // Get the 'to' currency based on user input
    val toCurrency = when (toChoice) {
        1 -> usd
        2 -> eur
        3 -> gbp
        4 -> lmp
        else -> usd
    }

    // Calculate and display the result
    val convertedAmount = convertCurrency(amountToConvert, fromCurrency, toCurrency)
    println("$amountToConvert ${fromCurrency.name} is equal to $convertedAmount ${toCurrency.name}")}