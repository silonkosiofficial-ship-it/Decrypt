package W5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    private final void c(java.lang.String str, java.lang.StringBuilder sb) {
        int length = str.length();
        int i6 = 0;
        while (i6 < length) {
            int iA = a(str, i6, sb);
            if (iA == 0) {
                char cCharAt = str.charAt(i6);
                sb.append(cCharAt);
                int i10 = i6 + 1;
                if (java.lang.Character.isHighSurrogate(cCharAt) && i10 < length) {
                    char cCharAt2 = str.charAt(i10);
                    if (java.lang.Character.isLowSurrogate(cCharAt2)) {
                        sb.append(cCharAt2);
                        i6 += 2;
                    }
                }
                i6 = i10;
            } else {
                for (int i11 = 0; i11 < iA; i11++) {
                    i6++;
                }
            }
        }
    }

    public abstract int a(java.lang.String str, int i6, java.lang.StringBuilder sb);

    public final java.lang.String b(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "input");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() * 2);
        c(str, sb);
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
