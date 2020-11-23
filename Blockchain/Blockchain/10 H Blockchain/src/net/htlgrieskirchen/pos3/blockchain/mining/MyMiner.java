/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos3.blockchain.mining;

public class MyMiner extends Miner {

    
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        /**
         * Aufgabe 1
         *
         * Schaut euch den bereitgestellten Code an. Beginnt dabei mit der
         * Klasse MinerSerial im gleichen Package wie diese Klasse. Alle zum
         * genauen Verständnis notwendigen Klassen sind in folgendem Package
         * enthalten: net.htlgrieskirchen.pos3.blockchain.chain. Die Klasse Demo
         * im Package net.htlgrieskirchen.pos3.blockchain.demo zeigt noch einmal
         * exemplarisch, welche Funktionen mit der hier implementierten
         * Blockchain umgesetzt werden können.
         */
        
        /**
         * Beschreibung Mining:
         * 
         * In der Klasse Miner wird jeder BLOCKCHAIN zu Beginn ein Root-Block
         * hinzugefügt. In den erbenden Klassen (MinerSerial, MinderParallel)
         * werden nacheinander MiningBlocks instanziiert, welche, um gültig zu
         * sein, erst mit Hilfe der mine()-Methode berechnet werden müssen. Die
         * mine()-Methode erwartet als Parameter eine zufällige ganze Zahl
         * (magicNumer), wodurch der MiningBlock gültig wird. Hier die richtige
         * Zahl zu übergeben ist der eigentliche Aufwand beim Mining: Man muss
         * alle möglichen int-Zahlen durchzuprobieren. Ist die richtige
         * magicNumber gefunden, liefert die mine()-Methode true zurück und der
         * MiningBlock ist berechnet. Er liefert dann die durch das Mining
         * erhaltenen Coins durch den Aufruf der getCoins()-Methode zurück.
         */
        
        /**
         * Aufgabe 2
         *
         * Programmiert hier in der Klasse MyMiner einen weiteren Miner, welcher
         * einen ExecuterSerivce benutzt um das Mining zu beschleunigen. Die
         * Anzahl der Thread sollte variabel sein (siehe Aufgabe 3). Auch hier
         * müsst ihr - wie in der Schulübung - die möglichen Zahlen für die
         * magicNumber in Teilbereiche zerlegen und jedem Thread einen Teil zur
         * Berechnung mitgeben. Einen Anhaltpunkt bietet die Klasse
         * MinerParallel in diesem Package, welche bereits klassische Threads zu
         * Parallelisierung einsetzt.
         */
        
        /**
         * Aufgabe 3
         *
         * Messt die Laufzeit zur Berechnung von 100 Coins. Sie sollte in etwa
         * der der Klasse MinerParallel entsprechen. Experimentiert mit der
         * Threadanzahl, bis ihr die schnellste Variante gefunden habt.
         */

        long end = System.currentTimeMillis();
        checkBlockchain();
        System.out.println("\n" + getCoins() + " coins mined in " + DF.format((end - start)/1000.0) + " s");
    }
}
