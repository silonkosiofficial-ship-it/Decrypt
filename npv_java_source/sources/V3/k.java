package V3;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f15123a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f15124b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static java.lang.String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i6 = 0;
        for (byte b6 : bArr) {
            char[] cArr2 = f15124b;
            cArr[i6] = cArr2[(b6 & 255) >>> 4];
            cArr[i6 + 1] = cArr2[b6 & 15];
            i6 += 2;
        }
        return new java.lang.String(cArr);
    }

    public static java.lang.String b(byte[] bArr, boolean z6) {
        int length = bArr.length;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + length);
        for (int i6 = 0; i6 < length && (!z6 || i6 != length - 1 || (bArr[i6] & 255) != 0); i6++) {
            char[] cArr = f15123a;
            sb.append(cArr[(bArr[i6] & 240) >>> 4]);
            sb.append(cArr[bArr[i6] & 15]);
        }
        return sb.toString();
    }

    public static byte[] c(java.lang.String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new java.lang.IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i6 = 0;
        while (i6 < length) {
            int i10 = i6 + 2;
            bArr[i6 / 2] = (byte) java.lang.Integer.parseInt(str.substring(i6, i10), 16);
            i6 = i10;
        }
        return bArr;
    }
}
