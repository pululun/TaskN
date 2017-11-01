package es.esy.kapcapx;

public class ArrayVector {
    private float[] vector;
    private int arraySize;

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

    public void getNorm () {

    }

    public float[] mult () {
        float[] resultVector = new float[arraySize];

        return resultVector;
    }

}
