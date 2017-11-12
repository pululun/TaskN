package es.esy.kapcapx;

public class ArrayVector {
    private float[] vector;
    private int arraySize;
    private float vectorSize;

    public ArrayVector (float[] vector, int arraySize) {
        this.vector = vector;
        this.arraySize = arraySize;
    }

    public void setElement(int i, float values) {
        vector[i] = values;
    }

    public float getElement(int i) {
        return vector[i];
    }

    public float[] getVector() {
        return vector;
    }

    public int getSize () {
        return arraySize;
    }

    public float min () {
        float temp = vector[0];
        for (int i = 1; i < arraySize; i++) {
            temp = (vector[i] < temp) ? vector[i] : temp;
        }
        return temp;
    }

    public float max () {
        float temp = vector[0];
        for (int i = 1; i < arraySize; i++) {
            temp = (vector[i] > temp) ? vector[i] : temp;
        }
        return temp;
    }

    public void sort () {
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                float temp;
                if (vector[i] < vector[j]) {
                    temp = vector[i];
                    vector[i] = vector[j];
                    vector[j] = temp;
                }
            }
        }
    }

    public float getNorm () {
        float norm = 0.0f;
        for (int i = 0; i < arraySize; i++) {
            norm += vector[i] * vector[i];
        }
        return (float) Math.sqrt(norm);
    }

    public float[] mult (int mulNumber) {
        float[] resultVector = new float[arraySize];
        for (int i = 0; i < arraySize; i++) {
            resultVector[i] = vector[i] * mulNumber;
        }
        return resultVector;
    }

    public float[] sum (float[] secondVector) {
        if (secondVector.length == vector.length) {
            float[] resultVector = new float[arraySize];
            for (int i = 0; i < arraySize; i++) {
                resultVector[i] = vector[i] + secondVector[i];
            }
            return resultVector;
        } else {
            System.out.println("Ошибка векторы должны быть одинакового размера!");
            return secondVector;
        }
    }

    public float scalarMult (float[] secondVector) {
        if (secondVector.length == vector.length) {
            float result = 0.0f;
            for (int i = 0; i < arraySize; i++) {
                result += (vector[i] * secondVector[i]);
            }
            return result;
        } else {
            System.out.println("Ошибка векторы должны быть одинакового размера!");
            return 0.0f;
        }
    }
}