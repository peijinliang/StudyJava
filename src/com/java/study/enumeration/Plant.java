package com.java.study.enumeration;

/**
 * Crete by Marlon
 * Create Date: 2017/11/10
 * Class Describe  ��֯ö��
 **/

public interface Plant {

    enum Vegetable implements INumberEnum {

        POTATO(0, "����"),
        TOMATO(0, "������");

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

        APPLE(0, "ƻ��"),
        ORANGE(0, "����"),
        BANANA(0, "�㽶");

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
