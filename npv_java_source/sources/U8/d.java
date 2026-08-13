package U8;

/* JADX INFO: loaded from: classes2.dex */
abstract class d extends U8.c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(java.lang.String str, int i6) {
        if (str.charAt(i6) == '-') {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Expected '-' (hyphen) at index " + i6 + ", but was '" + str.charAt(i6) + '\'').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(long j6, byte[] bArr, int i6, int i10) {
        int i11 = i6 + (i10 * 2);
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = S8.AbstractC1633f.e()[(int) (255 & j6)];
            bArr[i11 - 1] = (byte) i13;
            i11 -= 2;
            bArr[i11] = (byte) (i13 >> 8);
            j6 >>= 8;
        }
    }
}
