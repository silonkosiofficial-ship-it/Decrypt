package X9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b0 {
    public static final long a(java.lang.String str, int i6, int i10) {
        int i11;
        p247y7.AbstractC7350t.f(str, "<this>");
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException(("beginIndex < 0: " + i6).toString());
        }
        if (i10 < i6) {
            throw new java.lang.IllegalArgumentException(("endIndex < beginIndex: " + i10 + " < " + i6).toString());
        }
        if (i10 > str.length()) {
            throw new java.lang.IllegalArgumentException(("endIndex > string.length: " + i10 + " > " + str.length()).toString());
        }
        long j6 = 0;
        while (i6 < i10) {
            char cCharAt = str.charAt(i6);
            if (cCharAt < 128) {
                j6++;
            } else {
                if (cCharAt < 2048) {
                    i11 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i11 = 3;
                } else {
                    int i12 = i6 + 1;
                    char cCharAt2 = i12 < i10 ? str.charAt(i12) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j6++;
                        i6 = i12;
                    } else {
                        j6 += (long) 4;
                        i6 += 2;
                    }
                }
                j6 += (long) i11;
            }
            i6++;
        }
        return j6;
    }

    public static /* synthetic */ long b(java.lang.String str, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return a(str, i6, i10);
    }
}
