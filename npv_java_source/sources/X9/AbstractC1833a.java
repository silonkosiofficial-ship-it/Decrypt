package X9;

/* JADX INFO: renamed from: X9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1833a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f16110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f16111b;

    static {
        X9.C1839g.a aVar = X9.C1839g.f16149F;
        f16110a = aVar.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").o();
        f16111b = aVar.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").o();
    }

    public static final java.lang.String a(byte[] bArr, byte[] bArr2) {
        p247y7.AbstractC7350t.f(bArr, "<this>");
        p247y7.AbstractC7350t.f(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i6 = 0;
        int i10 = 0;
        while (i6 < length) {
            byte b6 = bArr[i6];
            int i11 = i6 + 2;
            byte b10 = bArr[i6 + 1];
            i6 += 3;
            byte b11 = bArr[i11];
            bArr3[i10] = bArr2[(b6 & 255) >> 2];
            bArr3[i10 + 1] = bArr2[((b6 & 3) << 4) | ((b10 & 255) >> 4)];
            int i12 = i10 + 3;
            bArr3[i10 + 2] = bArr2[((b10 & 15) << 2) | ((b11 & 255) >> 6)];
            i10 += 4;
            bArr3[i12] = bArr2[b11 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b12 = bArr[i6];
            bArr3[i10] = bArr2[(b12 & 255) >> 2];
            bArr3[i10 + 1] = bArr2[(b12 & 3) << 4];
            bArr3[i10 + 2] = 61;
            bArr3[i10 + 3] = 61;
        } else if (length2 == 2) {
            int i13 = i6 + 1;
            byte b13 = bArr[i6];
            byte b14 = bArr[i13];
            bArr3[i10] = bArr2[(b13 & 255) >> 2];
            bArr3[i10 + 1] = bArr2[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            bArr3[i10 + 2] = bArr2[(b14 & 15) << 2];
            bArr3[i10 + 3] = 61;
        }
        return X9.d0.c(bArr3);
    }

    public static /* synthetic */ java.lang.String b(byte[] bArr, byte[] bArr2, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            bArr2 = f16110a;
        }
        return a(bArr, bArr2);
    }
}
