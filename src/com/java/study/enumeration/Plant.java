package com.java.study.enumeration;

/**
 * Crete by Marlon
 * Create Date: 2017/11/10
 * Class Describe  组织枚举
 **/

public interface Plant {

    enum Vegetable implements INumberEnum {

        POTATO(0, "土豆"),
        TOMATO(0, "西红柿");

        private int code;
        private String description;

        Vegetable(int number, String description) {
            this.code = number;
            this.description = description;
        }


        @Override
        public int getCode() {
            return 0;
        }

        @Override
        public String getDescription() {
            return null;
        }

    }

    enum Fruit implements INumberEnum {

        APPLE(0, "苹果"),
        ORANGE(0, "桔子"),
        BANANA(0, "香蕉");

        private int code;
        private String description;


        Fruit(int number, String description) {
            this.code = number;
            this.description = description;
        }


        @Override
        public int getCode() {
            return 0;
        }

        @Override
        public String getDescription() {
            return null;
        }
    }


}
