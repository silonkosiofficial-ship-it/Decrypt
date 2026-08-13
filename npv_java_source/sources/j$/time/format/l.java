package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
final class l implements j$.time.format.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.format.f f47849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char f47851c;

    l(j$.time.format.f fVar, int i6, char c6) {
        this.f47849a = fVar;
        this.f47850b = i6;
        this.f47851c = c6;
    }

    @Override // j$.time.format.f
    public final boolean n(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        int length = sb.length();
        if (!this.f47849a.n(xVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i6 = this.f47850b;
        if (length2 <= i6) {
            for (int i10 = 0; i10 < i6 - length2; i10++) {
                sb.insert(length, this.f47851c);
            }
            return true;
        }
        throw new j$.time.DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i6);
    }

    @Override // j$.time.format.f
    public final int p(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i6) {
        boolean zL = vVar.l();
        if (i6 > charSequence.length()) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i6 == charSequence.length()) {
            return ~i6;
        }
        int length = this.f47850b + i6;
        if (length > charSequence.length()) {
            if (zL) {
                return ~i6;
            }
            length = charSequence.length();
        }
        int i10 = i6;
        while (i10 < length && vVar.b(charSequence.charAt(i10), this.f47851c)) {
            i10++;
        }
        int iP = this.f47849a.p(vVar, charSequence.subSequence(0, length), i10);
        return (iP == length || !zL) ? iP : ~(i6 + i10);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        char c6 = this.f47851c;
        if (c6 == ' ') {
            str = ")";
        } else {
            str = ",'" + c6 + "')";
        }
        return "Pad(" + this.f47849a + "," + this.f47850b + str;
    }
}
