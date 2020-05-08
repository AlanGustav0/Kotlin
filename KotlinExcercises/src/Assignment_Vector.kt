import java.util.Scanner

fun main() {


    val amount = mutableListOf<Int>()
    val price = mutableListOf<Float>()
    var grand_total: Float = 0f
    val commission: Float
    var sales_total: Float
    val quantity = Scanner(System.`in`)

    for (index in 0..4) {

        print("Insira a quantidade vendida do ${index + 1}º produto: ")
        amount.add(quantity.nextInt())

        print("Insira o preço do ${index + 1}º produto: ")
        price.add(quantity.nextFloat())

    }

    for (index in 0..4) {
        sales_total = amount[index] * price[index]
        print(
            "Quantidade vendida do ${index + 1}º produto: ${amount[index]}  Valor do ${index + 1}º produto: ${price[index]} \n " +
                    "Total geral das vendas: R$ %.2f \n".format(sales_total)
        )
        grand_total += sales_total
    }
    commission = grand_total * 0.05f

    print(
        "Valor total de vendas R$ %.2f: ".format(grand_total) + "\n Valor total da comissão: R$ %.2f".format(
            commission
        )
    )

}







