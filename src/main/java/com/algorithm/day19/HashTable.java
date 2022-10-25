package com.algorithm.day19;

public class HashTable {
    private int size = 10000; //생성자로 사이즈를 받는다
    private int[] table = new int[size];

    public HashTable() {
    }

    public HashTable(int size) {
        this.size = size;//생성자로 사이즈 초기화
        this.table = new int[size];
    }

    //1. key 만들어 주기
    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size;//나머지로 index를 만드는 이유 :
        // ex) 배열 사이즈가 1000이면 asciiSum % 1000을 하면 0~999 사이의 값이 나와서 벗어나지 않음
        // 지정된 크기의 배열에 값을 저장하기 때문이다.
        // 사이즈로 정한 배열의 어딘가로 가도록 하기 위함
    }

    //2. table에 키와 밸류를 넣어준다 : key번째 방에 value 넣기
    public void insert(String key, int value) {
        int hashCode = hash(key);
        table[hash(key)] = value;
        System.out.println(hashCode + "방에 저장이 완료 되었습니다");
    }

    //3. 키를 통해서 값 찾기
    public int search(String key) {
        return table[hash(key)];
    }

    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"};

        HashTable ht = new HashTable(200);
        for (int i = 0; i < names.length; i++) {
            ht.insert(names[i], ht.hash(names[i]));
        }

        System.out.println(ht.search("DongyeonKang"));
        System.out.println(ht.search("JiyoungAhn"));

    }

}
