package p258z9;

/* JADX INFO: renamed from: z9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7388a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57735a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f57737c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p258z9.J f57736b = new p258z9.J();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.StringBuilder f57738d = new java.lang.StringBuilder();

    private final int A(java.lang.CharSequence charSequence, int i6) {
        char cCharAt = charSequence.charAt(i6);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        y(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new p087i7.C6665k();
    }

    private final java.lang.String J() {
        java.lang.String str = this.f57737c;
        p247y7.AbstractC7350t.c(str);
        this.f57737c = null;
        return str;
    }

    public static /* synthetic */ boolean M(p258z9.AbstractC7388a abstractC7388a, boolean z6, int i6, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i6 & 1) != 0) {
            z6 = true;
        }
        return abstractC7388a.L(z6);
    }

    private final boolean O() {
        return B().charAt(this.f57735a - 1) != '\"';
    }

    private final int b(int i6) {
        int iF = F(i6);
        if (iF == -1) {
            y(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new p087i7.C6665k();
        }
        int i10 = iF + 1;
        char cCharAt = B().charAt(iF);
        if (cCharAt == 'u') {
            return d(B(), i10);
        }
        char cB = p258z9.AbstractC7389b.b(cCharAt);
        if (cB != 0) {
            this.f57738d.append(cB);
            return i10;
        }
        y(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new p087i7.C6665k();
    }

    private final int c(int i6, int i10) {
        e(i6, i10);
        return b(i10 + 1);
    }

    private final int d(java.lang.CharSequence charSequence, int i6) {
        int i10 = i6 + 4;
        if (i10 < charSequence.length()) {
            this.f57738d.append((char) ((A(charSequence, i6) << 12) + (A(charSequence, i6 + 1) << 8) + (A(charSequence, i6 + 2) << 4) + A(charSequence, i6 + 3)));
            return i10;
        }
        this.f57735a = i6;
        v();
        if (this.f57735a + 4 < charSequence.length()) {
            return d(charSequence, this.f57735a);
        }
        y(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new p087i7.C6665k();
    }

    private final boolean g(int i6) {
        int iF = F(i6);
        if (iF >= B().length() || iF == -1) {
            y(this, "EOF", 0, null, 6, null);
            throw new p087i7.C6665k();
        }
        int i10 = iF + 1;
        int iCharAt = B().charAt(iF) | ' ';
        if (iCharAt == 102) {
            i("alse", i10);
            return false;
        }
        if (iCharAt == 116) {
            i("rue", i10);
            return true;
        }
        y(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
        throw new p087i7.C6665k();
    }

    private final void i(java.lang.String str, int i6) {
        if (B().length() - i6 < str.length()) {
            y(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new p087i7.C6665k();
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != (B().charAt(i6 + i10) | ' ')) {
                y(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
                throw new p087i7.C6665k();
            }
        }
        this.f57735a = i6 + str.length();
    }

    private static final double o(long j6, boolean z6) {
        double d6;
        if (!z6) {
            d6 = -j6;
        } else {
            if (!z6) {
                throw new p087i7.s();
            }
            d6 = j6;
        }
        return java.lang.Math.pow(10.0d, d6);
    }

    private final java.lang.String u(int i6, int i10) {
        e(i6, i10);
        java.lang.String string = this.f57738d.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        this.f57738d.setLength(0);
        return string;
    }

    public static /* synthetic */ java.lang.Void y(p258z9.AbstractC7388a abstractC7388a, java.lang.String str, int i6, java.lang.String str2, int i10, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i10 & 2) != 0) {
            i6 = abstractC7388a.f57735a;
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        return abstractC7388a.x(str, i6, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract java.lang.CharSequence B();

    protected final boolean C(char c6) {
        return (c6 == ',' || c6 == ':' || c6 == ']' || c6 == '}') ? false : true;
    }

    public byte D() {
        java.lang.CharSequence charSequenceB = B();
        int i6 = this.f57735a;
        while (true) {
            int iF = F(i6);
            if (iF == -1) {
                this.f57735a = iF;
                return (byte) 10;
            }
            char cCharAt = charSequenceB.charAt(iF);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f57735a = iF;
                return p258z9.AbstractC7389b.a(cCharAt);
            }
            i6 = iF + 1;
        }
    }

    public final java.lang.String E(boolean z6) {
        java.lang.String strQ;
        byte bD = D();
        if (z6) {
            if (bD != 1 && bD != 0) {
                return null;
            }
            strQ = s();
        } else {
            if (bD != 1) {
                return null;
            }
            strQ = q();
        }
        this.f57737c = strQ;
        return strQ;
    }

    public abstract int F(int i6);

    public final void G(boolean z6) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        byte bD = D();
        if (bD != 8 && bD != 6) {
            s();
            return;
        }
        while (true) {
            byte bD2 = D();
            if (bD2 != 1) {
                if (bD2 == 8 || bD2 == 6) {
                    arrayList.add(java.lang.Byte.valueOf(bD2));
                } else {
                    if (bD2 == 9) {
                        if (((java.lang.Number) p097j7.AbstractC6879v.t0(arrayList)).byteValue() != 8) {
                            throw p258z9.G.f(this.f57735a, "found ] instead of } at path: " + this.f57736b, B());
                        }
                    } else if (bD2 == 7) {
                        if (((java.lang.Number) p097j7.AbstractC6879v.t0(arrayList)).byteValue() != 6) {
                            throw p258z9.G.f(this.f57735a, "found } instead of ] at path: " + this.f57736b, B());
                        }
                    } else if (bD2 == 10) {
                        y(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                        throw new p087i7.C6665k();
                    }
                    p097j7.AbstractC6879v.L(arrayList);
                }
                k();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z6) {
                s();
            } else {
                j();
            }
        }
    }

    public abstract int H();

    public java.lang.String I(int i6, int i10) {
        return B().subSequence(i6, i10).toString();
    }

    public final boolean K() {
        int iH = H();
        java.lang.CharSequence charSequenceB = B();
        if (iH >= charSequenceB.length() || iH == -1 || charSequenceB.charAt(iH) != ',') {
            return false;
        }
        this.f57735a++;
        return true;
    }

    public final boolean L(boolean z6) {
        int iF = F(H());
        int length = B().length() - iF;
        if (length < 4 || iF == -1) {
            return false;
        }
        for (int i6 = 0; i6 < 4; i6++) {
            if ("null".charAt(i6) != B().charAt(iF + i6)) {
                return false;
            }
        }
        if (length > 4 && p258z9.AbstractC7389b.a(B().charAt(iF + 4)) == 0) {
            return false;
        }
        if (!z6) {
            return true;
        }
        this.f57735a = iF + 4;
        return true;
    }

    protected final void N(char c6) {
        int i6 = this.f57735a;
        if (i6 > 0 && c6 == '\"') {
            try {
                this.f57735a = i6 - 1;
                java.lang.String strS = s();
                this.f57735a = i6;
                if (p247y7.AbstractC7350t.b(strS, "null")) {
                    x("Expected string literal but 'null' literal was found", this.f57735a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new p087i7.C6665k();
                }
            } catch (java.lang.Throwable th) {
                this.f57735a = i6;
                throw th;
            }
        }
        java.lang.String strC = p258z9.AbstractC7389b.c(p258z9.AbstractC7389b.a(c6));
        int i10 = this.f57735a;
        int i11 = i10 - 1;
        y(this, "Expected " + strC + ", but had '" + ((i10 == B().length() || i11 < 0) ? "EOF" : java.lang.String.valueOf(B().charAt(i11))) + "' instead", i11, null, 4, null);
        throw new p087i7.C6665k();
    }

    protected void e(int i6, int i10) {
        this.f57738d.append(B(), i6, i10);
    }

    public abstract boolean f();

    public final boolean h() {
        boolean z6;
        int iH = H();
        if (iH == B().length()) {
            y(this, "EOF", 0, null, 6, null);
            throw new p087i7.C6665k();
        }
        if (B().charAt(iH) == '\"') {
            iH++;
            z6 = true;
        } else {
            z6 = false;
        }
        boolean zG = g(iH);
        if (z6) {
            if (this.f57735a == B().length()) {
                y(this, "EOF", 0, null, 6, null);
                throw new p087i7.C6665k();
            }
            if (B().charAt(this.f57735a) != '\"') {
                y(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new p087i7.C6665k();
            }
            this.f57735a++;
        }
        return zG;
    }

    public abstract java.lang.String j();

    public abstract byte k();

    public final byte l(byte b6) {
        byte bK = k();
        if (bK == b6) {
            return bK;
        }
        java.lang.String strC = p258z9.AbstractC7389b.c(b6);
        int i6 = this.f57735a;
        int i10 = i6 - 1;
        y(this, "Expected " + strC + ", but had '" + ((i6 == B().length() || i10 < 0) ? "EOF" : java.lang.String.valueOf(B().charAt(i10))) + "' instead", i10, null, 4, null);
        throw new p087i7.C6665k();
    }

    public abstract void m(char c6);

    public final long n() {
        boolean z6;
        boolean z10;
        int iF = F(H());
        if (iF >= B().length() || iF == -1) {
            y(this, "EOF", 0, null, 6, null);
            throw new p087i7.C6665k();
        }
        if (B().charAt(iF) == '\"') {
            iF++;
            if (iF == B().length()) {
                y(this, "EOF", 0, null, 6, null);
                throw new p087i7.C6665k();
            }
            z6 = true;
        } else {
            z6 = false;
        }
        int i6 = iF;
        long j6 = 0;
        long j10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        loop0: while (true) {
            z10 = false;
            while (true) {
                if (i6 == B().length()) {
                    break loop0;
                }
                char cCharAt = B().charAt(i6);
                if ((cCharAt == 'e' || cCharAt == 'E') && !z11) {
                    if (i6 == iF) {
                        y(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, null, 6, null);
                        throw new p087i7.C6665k();
                    }
                    i6++;
                    z11 = true;
                } else if (cCharAt != '-' || !z11) {
                    if (cCharAt != '+' || !z11) {
                        if (cCharAt != '-') {
                            if (p258z9.AbstractC7389b.a(cCharAt) != 0) {
                                break loop0;
                            }
                            i6++;
                            int i10 = cCharAt - '0';
                            if (i10 < 0 || i10 >= 10) {
                                y(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6, null);
                                throw new p087i7.C6665k();
                            }
                            long j11 = 10;
                            if (z11) {
                                j10 = (j10 * j11) + ((long) i10);
                            } else {
                                j6 = (j6 * j11) - ((long) i10);
                                if (j6 > 0) {
                                    y(this, "Numeric value overflow", 0, null, 6, null);
                                    throw new p087i7.C6665k();
                                }
                            }
                        } else {
                            if (i6 != iF) {
                                y(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                                throw new p087i7.C6665k();
                            }
                            i6++;
                            z12 = true;
                        }
                    } else {
                        if (i6 == iF) {
                            y(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
                            throw new p087i7.C6665k();
                        }
                        i6++;
                    }
                }
                z10 = true;
            }
            if (i6 == iF) {
                y(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                throw new p087i7.C6665k();
            }
            i6++;
        }
        boolean z13 = i6 != iF;
        if (iF == i6 || (z12 && iF == i6 - 1)) {
            y(this, "Expected numeric literal", 0, null, 6, null);
            throw new p087i7.C6665k();
        }
        if (z6) {
            if (!z13) {
                y(this, "EOF", 0, null, 6, null);
                throw new p087i7.C6665k();
            }
            if (B().charAt(i6) != '\"') {
                y(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new p087i7.C6665k();
            }
            i6++;
        }
        this.f57735a = i6;
        if (z11) {
            double dO = j6 * o(j10, z10);
            if (dO > 9.223372036854776E18d || dO < -9.223372036854776E18d) {
                y(this, "Numeric value overflow", 0, null, 6, null);
                throw new p087i7.C6665k();
            }
            if (java.lang.Math.floor(dO) != dO) {
                y(this, "Can't convert " + dO + " to Long", 0, null, 6, null);
                throw new p087i7.C6665k();
            }
            j6 = (long) dO;
        }
        if (z12) {
            return j6;
        }
        if (j6 != Long.MIN_VALUE) {
            return -j6;
        }
        y(this, "Numeric value overflow", 0, null, 6, null);
        throw new p087i7.C6665k();
    }

    public final long p() {
        long jN = n();
        if (k() == 10) {
            return jN;
        }
        p258z9.AbstractC7389b.c((byte) 10);
        int i6 = this.f57735a;
        int i10 = i6 - 1;
        y(this, "Expected input to contain a single valid number, but got '" + ((i6 == B().length() || i10 < 0) ? "EOF" : java.lang.String.valueOf(B().charAt(i10))) + "' after it", i10, null, 4, null);
        throw new p087i7.C6665k();
    }

    public final java.lang.String q() {
        return this.f57737c != null ? J() : j();
    }

    protected final java.lang.String r(java.lang.CharSequence charSequence, int i6, int i10) {
        int iF;
        p247y7.AbstractC7350t.f(charSequence, "source");
        char cCharAt = charSequence.charAt(i10);
        boolean z6 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                iF = F(c(i6, i10));
                if (iF == -1) {
                    y(this, "Unexpected EOF", iF, null, 4, null);
                    throw new p087i7.C6665k();
                }
            } else {
                i10++;
                if (i10 >= charSequence.length()) {
                    e(i6, i10);
                    iF = F(i10);
                    if (iF == -1) {
                        y(this, "Unexpected EOF", iF, null, 4, null);
                        throw new p087i7.C6665k();
                    }
                } else {
                    continue;
                }
                cCharAt = charSequence.charAt(i10);
            }
            z6 = true;
            i6 = iF;
            i10 = i6;
            cCharAt = charSequence.charAt(i10);
        }
        java.lang.String strI = !z6 ? I(i6, i10) : u(i6, i10);
        this.f57735a = i10 + 1;
        return strI;
    }

    public final java.lang.String s() {
        if (this.f57737c != null) {
            return J();
        }
        int iH = H();
        if (iH >= B().length() || iH == -1) {
            y(this, "EOF", iH, null, 4, null);
            throw new p087i7.C6665k();
        }
        byte bA = p258z9.AbstractC7389b.a(B().charAt(iH));
        if (bA == 1) {
            return q();
        }
        if (bA != 0) {
            y(this, "Expected beginning of the string, but got " + B().charAt(iH), 0, null, 6, null);
            throw new p087i7.C6665k();
        }
        boolean z6 = false;
        while (p258z9.AbstractC7389b.a(B().charAt(iH)) == 0) {
            iH++;
            if (iH >= B().length()) {
                e(this.f57735a, iH);
                int iF = F(iH);
                if (iF == -1) {
                    this.f57735a = iH;
                    return u(0, 0);
                }
                iH = iF;
                z6 = true;
            }
        }
        int i6 = this.f57735a;
        java.lang.String strI = !z6 ? I(i6, iH) : u(i6, iH);
        this.f57735a = iH;
        return strI;
    }

    public final java.lang.String t() {
        java.lang.String strS = s();
        if (!p247y7.AbstractC7350t.b(strS, "null") || !O()) {
            return strS;
        }
        y(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new p087i7.C6665k();
    }

    public java.lang.String toString() {
        return "JsonReader(source='" + ((java.lang.Object) B()) + "', currentPosition=" + this.f57735a + ')';
    }

    public void v() {
    }

    public final void w() {
        if (k() == 10) {
            return;
        }
        y(this, "Expected EOF after parsing, but had " + B().charAt(this.f57735a - 1) + " instead", 0, null, 6, null);
        throw new p087i7.C6665k();
    }

    public final java.lang.Void x(java.lang.String str, int i6, java.lang.String str2) {
        java.lang.String str3;
        p247y7.AbstractC7350t.f(str, "message");
        p247y7.AbstractC7350t.f(str2, "hint");
        if (str2.length() == 0) {
            str3 = "";
        } else {
            str3 = '\n' + str2;
        }
        throw p258z9.G.f(i6, str + " at path: " + this.f57736b.a() + str3, B());
    }

    public final void z(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "key");
        int iW0 = S8.r.w0(I(0, this.f57735a), str, 0, false, 6, null);
        throw new p258z9.C("Encountered an unknown key '" + str + "' at offset " + iW0 + " at path: " + this.f57736b.a() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((java.lang.Object) p258z9.G.i(B(), iW0)));
    }
}
