package p141o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class K1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(float[] fArr, int i6, float[] fArr2, int i10) {
        int i11 = i6 * 4;
        return (fArr[i11] * fArr2[i10]) + (fArr[i11 + 1] * fArr2[4 + i10]) + (fArr[i11 + 2] * fArr2[8 + i10]) + (fArr[i11 + 3] * fArr2[12 + i10]);
    }

    public static final boolean c(float[] fArr) {
        int i6 = 0;
        while (i6 < 4) {
            int i10 = 0;
            while (i10 < 4) {
                if (fArr[(i6 * 4) + i10] != (i6 == i10 ? 1.0f : 0.0f)) {
                    return false;
                }
                i10++;
            }
            i6++;
        }
        return true;
    }
}
