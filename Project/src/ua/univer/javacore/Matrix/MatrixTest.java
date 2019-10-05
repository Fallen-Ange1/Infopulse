package ua.univer.javacore.Matrix;

import org.junit.Assert;
import ua.univer.javacore.Matrix.Matrix;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;


class MatrixTest {

    @org.junit.jupiter.api.Test
    void transp() {
    }

    @org.junit.jupiter.api.Test
    void testgetMaxLength() {
        int[][]matrix = {{1,2,3},{5,6}};
        int expRes=3;
        int actRes= Matrix.getMaxLength(matrix);
        Assert.assertEquals(expRes,actRes);
    }

    @org.junit.jupiter.api.Test
    void printMatrix() {
    }
}