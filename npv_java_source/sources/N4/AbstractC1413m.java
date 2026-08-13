package N4;

/* JADX INFO: renamed from: N4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC1413m {
    static int a(int i6, double d6) {
        int iMax = java.lang.Math.max(i6, 2);
        int iHighestOneBit = java.lang.Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d6 * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i10 = iHighestOneBit << 1;
        if (i10 > 0) {
            return i10;
        }
        return 1073741824;
    }

    static int b(int i6) {
        return (int) (((long) java.lang.Integer.rotateLeft((int) (((long) i6) * (-862048943)), 15)) * 461845907);
    }

    static int c(java.lang.Object obj) {
        return b(obj == null ? 0 : obj.hashCode());
    }
}
