package p258z9;

/* JADX INFO: loaded from: classes2.dex */
public class b0 extends p258z9.AbstractC7388a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f57740e;

    public b0(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "source");
        this.f57740e = str;
    }

    @Override // p258z9.AbstractC7388a
    public int F(int i6) {
        if (i6 < B().length()) {
            return i6;
        }
        return -1;
    }

    @Override // p258z9.AbstractC7388a
    public int H() {
        char cCharAt;
        int i6 = this.f57735a;
        if (i6 == -1) {
            return i6;
        }
        java.lang.String strB = B();
        while (i6 < strB.length() && ((cCharAt = strB.charAt(i6)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i6++;
        }
        this.f57735a = i6;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p258z9.AbstractC7388a
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public java.lang.String B() {
        return this.f57740e;
    }

    @Override // p258z9.AbstractC7388a
    public boolean f() {
        int i6 = this.f57735a;
        if (i6 == -1) {
            return false;
        }
        java.lang.String strB = B();
        while (i6 < strB.length()) {
            char cCharAt = strB.charAt(i6);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f57735a = i6;
                return C(cCharAt);
            }
            i6++;
        }
        this.f57735a = i6;
        return false;
    }

    @Override // p258z9.AbstractC7388a
    public java.lang.String j() {
        m('\"');
        int i6 = this.f57735a;
        int iO0 = S8.r.o0(B(), '\"', i6, false, 4, null);
        if (iO0 != -1) {
            for (int i10 = i6; i10 < iO0; i10++) {
                if (B().charAt(i10) == '\\') {
                    return r(B(), this.f57735a, i10);
                }
            }
            this.f57735a = iO0 + 1;
            java.lang.String strSubstring = B().substring(i6, iO0);
            p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
            return strSubstring;
        }
        s();
        java.lang.String strC = p258z9.AbstractC7389b.c((byte) 1);
        int i11 = this.f57735a;
        p258z9.AbstractC7388a.y(this, "Expected " + strC + ", but had '" + ((i11 == B().length() || i11 < 0) ? "EOF" : java.lang.String.valueOf(B().charAt(i11))) + "' instead", i11, null, 4, null);
        throw new p087i7.C6665k();
    }

    @Override // p258z9.AbstractC7388a
    public byte k() {
        java.lang.String strB = B();
        int i6 = this.f57735a;
        while (i6 != -1 && i6 < strB.length()) {
            int i10 = i6 + 1;
            char cCharAt = strB.charAt(i6);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f57735a = i10;
                return p258z9.AbstractC7389b.a(cCharAt);
            }
            i6 = i10;
        }
        this.f57735a = strB.length();
        return (byte) 10;
    }

    @Override // p258z9.AbstractC7388a
    public void m(char c6) {
        if (this.f57735a == -1) {
            N(c6);
        }
        java.lang.String strB = B();
        int i6 = this.f57735a;
        while (i6 < strB.length()) {
            int i10 = i6 + 1;
            char cCharAt = strB.charAt(i6);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f57735a = i10;
                if (cCharAt == c6) {
                    return;
                } else {
                    N(c6);
                }
            }
            i6 = i10;
        }
        this.f57735a = -1;
        N(c6);
    }
}
