package p051f0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final int a(int[] iArr, int i6) {
        int length = iArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            int i12 = iArr[i11];
            if (i6 > i12) {
                i10 = i11 + 1;
            } else {
                if (i6 >= i12) {
                    return i11;
                }
                length = i11 - 1;
            }
        }
        return -(i10 + 1);
    }
}
