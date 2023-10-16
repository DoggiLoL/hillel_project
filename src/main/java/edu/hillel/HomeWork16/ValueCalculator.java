package edu.hillel.HomeWork16;

public class ValueCalculator {
    private float[] values;
    private int size;
    private int halfSize;

    public ValueCalculator(int size){
        if (size < 1_000_000){
            throw new IllegalArgumentException("Розмір масиву повинен бути не менше 1 000 000");
        }
        this.size = size;
        this.halfSize = size / 2;
        this.values = new float[size];
    }

    public void calculateValues(){
        long start = System.currentTimeMillis();

        for (int i = 0; i<size; i++){
            values[i] = 1.0f;
        }

        float[] a1 = new float[halfSize];
        float[] a2 = new float[halfSize];
        System.arraycopy(values, 0, a1, 0, halfSize);
        System.arraycopy(values, halfSize, a2, 0, halfSize);

        Thread thread1 = new Thread(() -> {
            calculateNewValues(a1, 0);
        });

        Thread thread2 = new Thread(() -> {
            calculateNewValues(a2, halfSize);
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, values, 0, halfSize);
        System.arraycopy(a2, 0, values, halfSize, halfSize);

        long end = System.currentTimeMillis();
        System.out.println("Час виконання: " + (end - start)+ "мс");
    }

    private void calculateNewValues(float[] subArray, int startIndex) {
        for (int i = 0; i < subArray.length; i++) {
            int index = startIndex + i;
            subArray[i] = (float) (values[index] * Math.sin(0.2f + index / 5) * Math.cos(0.2f + index / 5) * Math.cos(0.4f + index / 2));
        }
    }


}
