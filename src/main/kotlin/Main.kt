fun main(args: Array<String>) {
   /*
   Exercício 2

1 - Crie um projeto no IntelliJ com o nome CirculoAreaPerimetro
2 - Crie um código que pede para o usuário digitar o diâmetro de um círculo (que será uma variável do tipo Int) e calcule a área e o perímetro (que serão Doubles).
4 - Faça uma conversão de tipos (de Int para Double) quando for calcular os resultados


    */

    var diametro = 0
    var calcule = 0.0
    var area = 0.0
    var perimetro = 0.0
    var pi = 3.14


    print("Digite o diâmetro de um circulo ")
    diametro = readLine()!!.toInt()

    area = pi * diametro * diametro / 4

    println("A área é: $area")

    val raio = diametro / 2

    perimetro = 2 * pi * raio

    println("O perimetro é: $perimetro")













}