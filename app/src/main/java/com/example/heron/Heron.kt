package com.example.heron

import kotlin.math.sqrt

/**
 * @author Hanna Górecka
 *Funckja zwraca powierzchnię trójkąta z boków podanych jako argumenty
 * @param l1 pierwszy bok trójkąta, dodatni
 * @param l2 drugi bok trójkąta, dodatni
 * @param l3 trzeci bok trójkąta, dodatni
 * @return powierzchnię trójkąta
 * @throws Exception jeśli któryś z boków jest niedodatni
 * @throws Exception jeśli jedna z par boków nie jest większa niż ostatni bok
 *
 */
fun heron (l1: Double, l2: Double, l3: Double): Double
{
    if(l1<=0||l2<=0||l3<=0) throw  Exception("Boki muszą być dodatnie")
    if(l1+l2<=l3||l1+l3<=l2||l2+l3<=l1) throw Exception("Te boki nie mogą stworzyć trójkąta")
    val p=(l1+l2+l3)/2
    return sqrt(p*(p-l1)*(p-l2)*(p-l3))

}

/**
 * Funkcja testowa funkcji heron()
 */
fun TestHeron ()
{
    val s = heron(4.0,2.0, sqrt(20.0))
    assert(s==4.0)  {"Test zakończony niepowodzeniem"}
    println("Test zakończony powodzeniem")
}

fun main()
{
    TestHeron()
}