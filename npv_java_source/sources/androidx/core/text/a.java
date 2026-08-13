package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final androidx.core.text.p f21607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.lang.String f21608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.String f21609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final androidx.core.text.a f21610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final androidx.core.text.a f21611h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.core.text.p f21614c;

    /* JADX INFO: renamed from: androidx.core.text.a$a, reason: collision with other inner class name */
    public static final class C0408a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f21615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.core.text.p f21617c;

        public C0408a() {
            c(androidx.core.text.a.e(java.util.Locale.getDefault()));
        }

        private static androidx.core.text.a b(boolean z6) {
            return z6 ? androidx.core.text.a.f21611h : androidx.core.text.a.f21610g;
        }

        private void c(boolean z6) {
            this.f21615a = z6;
            this.f21617c = androidx.core.text.a.f21607d;
            this.f21616b = 2;
        }

        public androidx.core.text.a a() {
            return (this.f21616b == 2 && this.f21617c == androidx.core.text.a.f21607d) ? b(this.f21615a) : new androidx.core.text.a(this.f21615a, this.f21616b, this.f21617c);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f21618f = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.CharSequence f21619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f21620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f21621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f21622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private char f21623e;

        static {
            for (int i6 = 0; i6 < 1792; i6++) {
                f21618f[i6] = java.lang.Character.getDirectionality(i6);
            }
        }

        b(java.lang.CharSequence charSequence, boolean z6) {
            this.f21619a = charSequence;
            this.f21620b = z6;
            this.f21621c = charSequence.length();
        }

        private static byte c(char c6) {
            return c6 < 1792 ? f21618f[c6] : java.lang.Character.getDirectionality(c6);
        }

        private byte f() {
            char cCharAt;
            int i6 = this.f21622d;
            do {
                int i10 = this.f21622d;
                if (i10 <= 0) {
                    break;
                }
                java.lang.CharSequence charSequence = this.f21619a;
                int i11 = i10 - 1;
                this.f21622d = i11;
                cCharAt = charSequence.charAt(i11);
                this.f21623e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f21622d = i6;
            this.f21623e = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int i6 = this.f21622d;
                if (i6 >= this.f21621c) {
                    return (byte) 12;
                }
                java.lang.CharSequence charSequence = this.f21619a;
                this.f21622d = i6 + 1;
                cCharAt = charSequence.charAt(i6);
                this.f21623e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int i6 = this.f21622d;
            while (true) {
                int i10 = this.f21622d;
                if (i10 <= 0) {
                    break;
                }
                java.lang.CharSequence charSequence = this.f21619a;
                int i11 = i10 - 1;
                this.f21622d = i11;
                char cCharAt2 = charSequence.charAt(i11);
                this.f21623e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f21622d;
                        if (i12 <= 0) {
                            break;
                        }
                        java.lang.CharSequence charSequence2 = this.f21619a;
                        int i13 = i12 - 1;
                        this.f21622d = i13;
                        cCharAt = charSequence2.charAt(i13);
                        this.f21623e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f21622d = i6;
            this.f21623e = '>';
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int i6 = this.f21622d;
            while (true) {
                int i10 = this.f21622d;
                if (i10 >= this.f21621c) {
                    this.f21622d = i6;
                    this.f21623e = '<';
                    return (byte) 13;
                }
                java.lang.CharSequence charSequence = this.f21619a;
                this.f21622d = i10 + 1;
                char cCharAt2 = charSequence.charAt(i10);
                this.f21623e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i11 = this.f21622d;
                        if (i11 >= this.f21621c) {
                            break;
                        }
                        java.lang.CharSequence charSequence2 = this.f21619a;
                        this.f21622d = i11 + 1;
                        cCharAt = charSequence2.charAt(i11);
                        this.f21623e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f21619a.charAt(this.f21622d - 1);
            this.f21623e = cCharAt;
            if (java.lang.Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = java.lang.Character.codePointBefore(this.f21619a, this.f21622d);
                this.f21622d -= java.lang.Character.charCount(iCodePointBefore);
                return java.lang.Character.getDirectionality(iCodePointBefore);
            }
            this.f21622d--;
            byte bC = c(this.f21623e);
            if (!this.f21620b) {
                return bC;
            }
            char c6 = this.f21623e;
            if (c6 == '>') {
                return h();
            }
            return c6 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.f21619a.charAt(this.f21622d);
            this.f21623e = cCharAt;
            if (java.lang.Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = java.lang.Character.codePointAt(this.f21619a, this.f21622d);
                this.f21622d += java.lang.Character.charCount(iCodePointAt);
                return java.lang.Character.getDirectionality(iCodePointAt);
            }
            this.f21622d++;
            byte bC = c(this.f21623e);
            if (!this.f21620b) {
                return bC;
            }
            char c6 = this.f21623e;
            if (c6 == '<') {
                return i();
            }
            return c6 == '&' ? g() : bC;
        }

        int d() {
            this.f21622d = 0;
            int i6 = 0;
            int i10 = 0;
            int i11 = 0;
            while (this.f21622d < this.f21621c && i6 == 0) {
                byte b6 = b();
                if (b6 != 0) {
                    if (b6 == 1 || b6 == 2) {
                        if (i11 == 0) {
                            return 1;
                        }
                    } else if (b6 != 9) {
                        switch (b6) {
                            case 14:
                            case 15:
                                i11++;
                                i10 = -1;
                                continue;
                            case 16:
                            case 17:
                                i11++;
                                i10 = 1;
                                continue;
                            case 18:
                                i11--;
                                i10 = 0;
                                continue;
                        }
                    }
                } else if (i11 == 0) {
                    return -1;
                }
                i6 = i11;
            }
            if (i6 == 0) {
                return 0;
            }
            if (i10 != 0) {
                return i10;
            }
            while (this.f21622d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i6 == i11) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i6 == i11) {
                            return 1;
                        }
                        break;
                    case 18:
                        i11++;
                        continue;
                    default:
                        continue;
                }
                i11--;
            }
            return 0;
        }

        int e() {
            this.f21622d = this.f21621c;
            int i6 = 0;
            while (true) {
                int i10 = i6;
                while (this.f21622d > 0) {
                    byte bA = a();
                    if (bA == 0) {
                        if (i6 == 0) {
                            return -1;
                        }
                        if (i10 == 0) {
                        }
                    } else if (bA == 1 || bA == 2) {
                        if (i6 == 0) {
                            return 1;
                        }
                        if (i10 == 0) {
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i10 == i6) {
                                    return -1;
                                }
                                i6--;
                                break;
                            case 16:
                            case 17:
                                if (i10 == i6) {
                                    return 1;
                                }
                                i6--;
                                break;
                            case 18:
                                i6++;
                                break;
                            default:
                                if (i10 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }
    }

    static {
        androidx.core.text.p pVar = androidx.core.text.q.f21636c;
        f21607d = pVar;
        f21608e = java.lang.Character.toString((char) 8206);
        f21609f = java.lang.Character.toString((char) 8207);
        f21610g = new androidx.core.text.a(false, 2, pVar);
        f21611h = new androidx.core.text.a(true, 2, pVar);
    }

    a(boolean z6, int i6, androidx.core.text.p pVar) {
        this.f21612a = z6;
        this.f21613b = i6;
        this.f21614c = pVar;
    }

    private static int a(java.lang.CharSequence charSequence) {
        return new androidx.core.text.a.b(charSequence, false).d();
    }

    private static int b(java.lang.CharSequence charSequence) {
        return new androidx.core.text.a.b(charSequence, false).e();
    }

    public static androidx.core.text.a c() {
        return new androidx.core.text.a.C0408a().a();
    }

    static boolean e(java.util.Locale locale) {
        return androidx.core.text.r.a(locale) == 1;
    }

    private java.lang.String f(java.lang.CharSequence charSequence, androidx.core.text.p pVar) {
        boolean zA = pVar.a(charSequence, 0, charSequence.length());
        if (!this.f21612a && (zA || b(charSequence) == 1)) {
            return f21608e;
        }
        if (this.f21612a) {
            return (!zA || b(charSequence) == -1) ? f21609f : "";
        }
        return "";
    }

    private java.lang.String g(java.lang.CharSequence charSequence, androidx.core.text.p pVar) {
        boolean zA = pVar.a(charSequence, 0, charSequence.length());
        if (!this.f21612a && (zA || a(charSequence) == 1)) {
            return f21608e;
        }
        if (this.f21612a) {
            return (!zA || a(charSequence) == -1) ? f21609f : "";
        }
        return "";
    }

    public boolean d() {
        return (this.f21613b & 2) != 0;
    }

    public java.lang.CharSequence h(java.lang.CharSequence charSequence) {
        return i(charSequence, this.f21614c, true);
    }

    public java.lang.CharSequence i(java.lang.CharSequence charSequence, androidx.core.text.p pVar, boolean z6) {
        if (charSequence == null) {
            return null;
        }
        boolean zA = pVar.a(charSequence, 0, charSequence.length());
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (d() && z6) {
            spannableStringBuilder.append((java.lang.CharSequence) g(charSequence, zA ? androidx.core.text.q.f21635b : androidx.core.text.q.f21634a));
        }
        if (zA != this.f21612a) {
            spannableStringBuilder.append(zA ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z6) {
            spannableStringBuilder.append((java.lang.CharSequence) f(charSequence, zA ? androidx.core.text.q.f21635b : androidx.core.text.q.f21634a));
        }
        return spannableStringBuilder;
    }

    public java.lang.String j(java.lang.String str) {
        return k(str, this.f21614c, true);
    }

    public java.lang.String k(java.lang.String str, androidx.core.text.p pVar, boolean z6) {
        if (str == null) {
            return null;
        }
        return i(str, pVar, z6).toString();
    }
}
