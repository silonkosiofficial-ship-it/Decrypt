package p258z9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f57757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f57758b;

    static {
        java.lang.String[] strArr = new java.lang.String[93];
        for (int i6 = 0; i6 < 32; i6++) {
            strArr[i6] = "\\u" + e(i6 >> 12) + e(i6 >> 8) + e(i6 >> 4) + e(i6);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f57757a = strArr;
        byte[] bArr = new byte[93];
        for (int i10 = 0; i10 < 32; i10++) {
            bArr[i10] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f57758b = bArr;
    }

    public static final byte[] a() {
        return f57758b;
    }

    public static final java.lang.String[] b() {
        return f57757a;
    }

    public static final void c(java.lang.StringBuilder sb, java.lang.String str) {
        p247y7.AbstractC7350t.f(sb, "<this>");
        p247y7.AbstractC7350t.f(str, "value");
        sb.append('\"');
        int length = str.length();
        int i6 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            java.lang.String[] strArr = f57757a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb.append((java.lang.CharSequence) str, i6, i10);
                sb.append(strArr[cCharAt]);
                i6 = i10 + 1;
            }
        }
        if (i6 != 0) {
            sb.append((java.lang.CharSequence) str, i6, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    public static final java.lang.Boolean d(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        if (S8.r.K(str, "true", true)) {
            return java.lang.Boolean.TRUE;
        }
        if (S8.r.K(str, "false", true)) {
            return java.lang.Boolean.FALSE;
        }
        return null;
    }

    private static final char e(int i6) {
        int i10 = i6 & 15;
        return (char) (i10 < 10 ? i10 + 48 : i10 + 87);
    }
}
