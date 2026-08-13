package p128m8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public static final byte[] a(java.lang.String[] strArr) {
        p247y7.AbstractC7350t.f(strArr, "strings");
        int length = 0;
        for (java.lang.String str : strArr) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int i6 = 0;
        for (java.lang.String str2 : strArr) {
            int length2 = str2.length();
            int i10 = 0;
            while (i10 < length2) {
                bArr[i6] = (byte) str2.charAt(i10);
                i10++;
                i6++;
            }
        }
        return bArr;
    }
}
