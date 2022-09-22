package com.abdurashidov.photo4k.models

import com.abdurashidov.photo4k.R

object MyData {
    var pagerList=ArrayList<PagerItem>()
    var list=ArrayList<PagerItem>()


    var allList=ArrayList<ItemRv>()
    var techList=ArrayList<ItemRv>()
    var animalList=ArrayList<ItemRv>()
    var gradientList=ArrayList<ItemRv>()
    var natureList=ArrayList<ItemRv>()
    var blackList=ArrayList<ItemRv>()

    var likeList=ArrayList<ItemRv>()


    fun allData(){
        allListData()
        techListData()
        animalListData()
        gradientListData()
        natureListData()
        blackListData()
    }

    fun allListData(){
        allList.add(ItemRv(R.drawable.technology_1))
        allList.add(ItemRv(R.drawable.technology_2))
        allList.add(ItemRv(R.drawable.technology_3))
        allList.add(ItemRv(R.drawable.technology_4))
        allList.add(ItemRv(R.drawable.technology_5))
        allList.add(ItemRv(R.drawable.technology_6))
        allList.add(ItemRv(R.drawable.technology_7))
        allList.add(ItemRv(R.drawable.technology_8))
        allList.add(ItemRv(R.drawable.technology_9))
        allList.add(ItemRv(R.drawable.technology_10))
        allList.add(ItemRv(R.drawable.technology_11))

        allList.add(ItemRv(R.drawable.technology_1))
        allList.add(ItemRv(R.drawable.technology_2))
        allList.add(ItemRv(R.drawable.technology_3))
        allList.add(ItemRv(R.drawable.technology_4))
        allList.add(ItemRv(R.drawable.technology_5))
        allList.add(ItemRv(R.drawable.technology_6))
        allList.add(ItemRv(R.drawable.technology_7))
        allList.add(ItemRv(R.drawable.technology_8))
        allList.add(ItemRv(R.drawable.technology_9))
        allList.add(ItemRv(R.drawable.technology_10))
        allList.add(ItemRv(R.drawable.technology_11))

        allList.add(ItemRv(R.drawable.animal_1))
        allList.add(ItemRv(R.drawable.animal_2))
        allList.add(ItemRv(R.drawable.animal_3))
        allList.add(ItemRv(R.drawable.animal_4))
        allList.add(ItemRv(R.drawable.animal_5))
        allList.add(ItemRv(R.drawable.animal_6))
        allList.add(ItemRv(R.drawable.animal_7))
        allList.add(ItemRv(R.drawable.animal_8))
        allList.add(ItemRv(R.drawable.animal_9))
        allList.add(ItemRv(R.drawable.animal_10))

        allList.add(ItemRv(R.drawable.gradient_1))
        allList.add(ItemRv(R.drawable.gradient_2))
        allList.add(ItemRv(R.drawable.gradient_3))
        allList.add(ItemRv(R.drawable.gradient_4))
        allList.add(ItemRv(R.drawable.gradient_5))
        allList.add(ItemRv(R.drawable.gradient_6))
        allList.add(ItemRv(R.drawable.gradient_7))
        allList.add(ItemRv(R.drawable.gradient_8))

        allList.add(ItemRv(R.drawable.nature_1))
        allList.add(ItemRv(R.drawable.nature_2))
        allList.add(ItemRv(R.drawable.nature_3))
        allList.add(ItemRv(R.drawable.nature_4))
        allList.add(ItemRv(R.drawable.nature_5))
        allList.add(ItemRv(R.drawable.nature_6))
        allList.add(ItemRv(R.drawable.nature_7))
        allList.add(ItemRv(R.drawable.nature_8))
        allList.add(ItemRv(R.drawable.nature_9))
        allList.add(ItemRv(R.drawable.nature_10))
        allList.add(ItemRv(R.drawable.nature_11))
        allList.add(ItemRv(R.drawable.nature_12))
        allList.add(ItemRv(R.drawable.nature_13))
        allList.add(ItemRv(R.drawable.nature_14))
        allList.add(ItemRv(R.drawable.nature_15))
        allList.add(ItemRv(R.drawable.nature_17))
        allList.add(ItemRv(R.drawable.nature_18))
        allList.add(ItemRv(R.drawable.nature_19))
        allList.add(ItemRv(R.drawable.nature_20))
    }

    fun techListData(){
        techList.add(ItemRv(R.drawable.technology_1))
        techList.add(ItemRv(R.drawable.technology_2))
        techList.add(ItemRv(R.drawable.technology_3))
        techList.add(ItemRv(R.drawable.technology_4))
        techList.add(ItemRv(R.drawable.technology_5))
        techList.add(ItemRv(R.drawable.technology_6))
        techList.add(ItemRv(R.drawable.technology_7))
        techList.add(ItemRv(R.drawable.technology_8))
        techList.add(ItemRv(R.drawable.technology_9))
        techList.add(ItemRv(R.drawable.technology_10))
        techList.add(ItemRv(R.drawable.technology_11))
    }
    fun animalListData(){
        animalList.add(ItemRv(R.drawable.animal_1))
        animalList.add(ItemRv(R.drawable.animal_2))
        animalList.add(ItemRv(R.drawable.animal_3))
        animalList.add(ItemRv(R.drawable.animal_4))
        animalList.add(ItemRv(R.drawable.animal_5))
        animalList.add(ItemRv(R.drawable.animal_6))
        animalList.add(ItemRv(R.drawable.animal_7))
        animalList.add(ItemRv(R.drawable.animal_8))
        animalList.add(ItemRv(R.drawable.animal_9))
        animalList.add(ItemRv(R.drawable.animal_10))
    }
    fun gradientListData(){
        gradientList.add(ItemRv(R.drawable.gradient_1))
        gradientList.add(ItemRv(R.drawable.gradient_2))
        gradientList.add(ItemRv(R.drawable.gradient_3))
        gradientList.add(ItemRv(R.drawable.gradient_4))
        gradientList.add(ItemRv(R.drawable.gradient_5))
        gradientList.add(ItemRv(R.drawable.gradient_6))
        gradientList.add(ItemRv(R.drawable.gradient_7))
        gradientList.add(ItemRv(R.drawable.gradient_8))
    }
    fun natureListData(){
        natureList.add(ItemRv(R.drawable.nature_1))
        natureList.add(ItemRv(R.drawable.nature_2))
        natureList.add(ItemRv(R.drawable.nature_3))
        natureList.add(ItemRv(R.drawable.nature_4))
        natureList.add(ItemRv(R.drawable.nature_5))
        natureList.add(ItemRv(R.drawable.nature_6))
        natureList.add(ItemRv(R.drawable.nature_7))
        natureList.add(ItemRv(R.drawable.nature_8))
        natureList.add(ItemRv(R.drawable.nature_9))
        natureList.add(ItemRv(R.drawable.nature_10))
        natureList.add(ItemRv(R.drawable.nature_11))
        natureList.add(ItemRv(R.drawable.nature_12))
        natureList.add(ItemRv(R.drawable.nature_13))
        natureList.add(ItemRv(R.drawable.nature_14))
        natureList.add(ItemRv(R.drawable.nature_15))
        natureList.add(ItemRv(R.drawable.nature_17))
        natureList.add(ItemRv(R.drawable.nature_18))
        natureList.add(ItemRv(R.drawable.nature_19))
        natureList.add(ItemRv(R.drawable.nature_20))
    }
    fun blackListData(){
        blackList.add(ItemRv(R.drawable.black_1))
        blackList.add(ItemRv(R.drawable.black_2))
        blackList.add(ItemRv(R.drawable.black_3))
        blackList.add(ItemRv(R.drawable.black_4))
        blackList.add(ItemRv(R.drawable.black_5))
        blackList.add(ItemRv(R.drawable.black_6))
        blackList.add(ItemRv(R.drawable.black_7))
        blackList.add(ItemRv(R.drawable.black_8))
        blackList.add(ItemRv(R.drawable.black_9))
        blackList.add(ItemRv(R.drawable.black_10))
        blackList.add(ItemRv(R.drawable.black_11))
        blackList.add(ItemRv(R.drawable.black_12))
        blackList.add(ItemRv(R.drawable.black_13))
        blackList.add(ItemRv(R.drawable.black_14))
        blackList.add(ItemRv(R.drawable.black_15))
        blackList.add(ItemRv(R.drawable.black_16))
        blackList.add(ItemRv(R.drawable.black_17))
    }

    fun likeListData(itemRv: ItemRv){
        likeList.add(itemRv)
    }




    fun loadPagerData(){
        pagerList.add(PagerItem("All"))
        pagerList.add(PagerItem("New"))
        pagerList.add(PagerItem("Animals"))
        pagerList.add(PagerItem("Technology"))
    }


    fun loadList(){
        list.add(PagerItem("All"))
        list.add(PagerItem("New"))
        list.add(PagerItem("Animals"))
        list.add(PagerItem("Technology"))
        list.add(PagerItem("Science"))
    }
}