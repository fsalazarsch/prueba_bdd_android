package com.nullpointerex.comandoslinux;

/**
 * Created by felipesalazar on 13-08-17.
 */

public class ListItem {
    private String kanji;
    private String significado;
    private String kunyomi;

    public ListItem(String kanji, String significado, String kunyomi){
        this.kanji = kanji;
        this.significado = significado;
        this.kunyomi = kunyomi;
    }



    public String getKanji(){ return kanji;}
    public String getSignificado(){ return significado;}
    public String getKunyomi(){ return kunyomi;}
}
