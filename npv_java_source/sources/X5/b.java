package X5;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends W5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X5.b.a f15879b = new X5.b.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Set f15880c = p097j7.Z.c(X5.b.EnumC0302b.SemiColonRequired);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Set f15881a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX INFO: renamed from: X5.b$b, reason: collision with other inner class name */
    public enum EnumC0302b {
        SemiColonRequired,
        SemiColonOptional,
        ErrorIfNoSemiColon;


        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f15886G = p157p7.b.a(e());
    }

    public b(X5.b.EnumC0302b... enumC0302bArr) {
        p247y7.AbstractC7350t.f(enumC0302bArr, "options");
        this.f15881a = enumC0302bArr.length == 0 ? f15880c : p097j7.Z.g(java.util.Arrays.copyOf(enumC0302bArr, enumC0302bArr.length));
    }

    private final boolean d(X5.b.EnumC0302b enumC0302b) {
        return this.f15881a.contains(enumC0302b);
    }

    @Override // W5.e
    public int a(java.lang.String str, int i6, java.lang.StringBuilder sb) {
        int i10;
        java.lang.String string;
        int iA;
        char cCharAt;
        char cCharAt2;
        p247y7.AbstractC7350t.f(str, "input");
        p247y7.AbstractC7350t.f(sb, "stringBuilder");
        int length = str.length();
        if (str.charAt(i6) == '&' && i6 < length - 2 && str.charAt(i6 + 1) == '#') {
            int i11 = i6 + 2;
            char cCharAt3 = str.charAt(i11);
            if (cCharAt3 == 'x' || cCharAt3 == 'X') {
                i11 = i6 + 3;
                if (i11 == length) {
                    return 0;
                }
                i10 = 1;
            } else {
                i10 = 0;
            }
            int i12 = i11;
            while (i12 < length) {
                char cCharAt4 = str.charAt(i12);
                if (('0' > cCharAt4 || cCharAt4 >= ':') && (('a' > (cCharAt = str.charAt(i12)) || cCharAt >= 'g') && ('A' > (cCharAt2 = str.charAt(i12)) || cCharAt2 >= 'G'))) {
                    break;
                }
                i12++;
            }
            int i13 = (i12 == length || str.charAt(i12) != ';') ? 0 : 1;
            if (i13 == 0) {
                if (d(X5.b.EnumC0302b.SemiColonRequired)) {
                    return 0;
                }
                if (d(X5.b.EnumC0302b.ErrorIfNoSemiColon)) {
                    throw new java.lang.IllegalArgumentException("Semi-colon required at end of numeric entity");
                }
            }
            try {
                if (i10 != 0) {
                    string = str.subSequence(i11, i12).toString();
                    iA = S8.AbstractC1628a.a(16);
                } else {
                    string = str.subSequence(i11, i12).toString();
                    iA = S8.AbstractC1628a.a(10);
                }
                int i14 = java.lang.Integer.parseInt(string, iA);
                if (i14 > 65535) {
                    for (char c6 : Y5.a.f16415a.e(i14)) {
                        sb.append(c6);
                    }
                } else {
                    if (i14 < 0 || i14 > 65535) {
                        throw new java.lang.IllegalArgumentException("Invalid Char code: " + i14);
                    }
                    sb.append((char) i14);
                }
                return ((i12 + 2) - i11) + i10 + i13;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return 0;
    }
}
