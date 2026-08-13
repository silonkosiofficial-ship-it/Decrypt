package p258z9;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends p258z9.b0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.lang.String str) {
        super(str);
        p247y7.AbstractC7350t.f(str, "source");
    }

    @Override // p258z9.AbstractC7388a
    public byte D() {
        java.lang.String strB = B();
        int iH = H();
        if (iH >= strB.length() || iH == -1) {
            return (byte) 10;
        }
        this.f57735a = iH;
        return p258z9.AbstractC7389b.a(strB.charAt(iH));
    }

    @Override // p258z9.b0, p258z9.AbstractC7388a
    public int H() {
        int i6;
        int iO0 = this.f57735a;
        if (iO0 == -1) {
            return iO0;
        }
        java.lang.String strB = B();
        while (iO0 < strB.length()) {
            char cCharAt = strB.charAt(iO0);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i6 = iO0 + 1) >= strB.length()) {
                    break;
                }
                char cCharAt2 = strB.charAt(i6);
                if (cCharAt2 == '*') {
                    int iP0 = S8.r.p0(strB, "*/", iO0 + 2, false, 4, null);
                    if (iP0 == -1) {
                        this.f57735a = strB.length();
                        p258z9.AbstractC7388a.y(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new p087i7.C6665k();
                    }
                    iO0 = iP0 + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iO0 = S8.r.o0(strB, '\n', iO0 + 2, false, 4, null);
                    if (iO0 == -1) {
                        iO0 = strB.length();
                    }
                }
            }
            iO0++;
        }
        this.f57735a = iO0;
        return iO0;
    }

    @Override // p258z9.b0, p258z9.AbstractC7388a
    public boolean f() {
        int iH = H();
        if (iH >= B().length() || iH == -1) {
            return false;
        }
        return C(B().charAt(iH));
    }

    @Override // p258z9.b0, p258z9.AbstractC7388a
    public byte k() {
        java.lang.String strB = B();
        int iH = H();
        if (iH >= strB.length() || iH == -1) {
            return (byte) 10;
        }
        this.f57735a = iH + 1;
        return p258z9.AbstractC7389b.a(strB.charAt(iH));
    }

    @Override // p258z9.b0, p258z9.AbstractC7388a
    public void m(char c6) {
        java.lang.String strB = B();
        int iH = H();
        if (iH >= strB.length() || iH == -1) {
            this.f57735a = -1;
            N(c6);
        }
        char cCharAt = strB.charAt(iH);
        this.f57735a = iH + 1;
        if (cCharAt == c6) {
            return;
        }
        N(c6);
    }
}
