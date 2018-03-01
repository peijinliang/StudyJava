package com.java.study.serializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Crete by Marlon
 * Create Date: 12/6/2017
 * Class Describe
 *
 * Externalizable  接口能需要手动 进行序列化
 *
 **/
public class Position implements Externalizable {

    private String name;
    private String id;
    private int role;

    public Position() {
        System.out.println("none-arg constructor");
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(id);
        out.writeInt(role);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        role = in.readInt();
        name = (String) in.readObject();
        id = (String) in.readObject();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
