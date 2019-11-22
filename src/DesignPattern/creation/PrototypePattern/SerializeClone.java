package DesignPattern.creation.PrototypePattern;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Firefly
 * @version 1.0
 * @date 2019/10/23 15:16
 */

public class SerializeClone {

    public static void main(String[] args) {

        ValueType valueType = new ValueType();

        valueType.setValueType("1");


        try {

            ByteOutputStream bos = new ByteOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(valueType);
            byte [] b = bos.getBytes();
            ByteArrayInputStream bis = new ByteArrayInputStream(b);
            ObjectInputStream ois = new ObjectInputStream(bis);
            ValueType clone = (ValueType)ois.readObject();
            System.out.println(clone == valueType);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
