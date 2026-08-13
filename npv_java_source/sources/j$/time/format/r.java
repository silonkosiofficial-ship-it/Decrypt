package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
final class r implements j$.time.format.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.temporal.s f47866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j$.time.format.TextStyle f47867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j$.time.format.A f47868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile j$.time.format.j f47869d;

    r(j$.time.temporal.s sVar, j$.time.format.TextStyle textStyle, j$.time.format.A a6) {
        this.f47866a = sVar;
        this.f47867b = textStyle;
        this.f47868c = a6;
    }

    @Override // j$.time.format.f
    public final boolean n(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        java.lang.String strE;
        java.lang.Long lE = xVar.e(this.f47866a);
        if (lE == null) {
            return false;
        }
        j$.time.chrono.Chronology chronology = (j$.time.chrono.Chronology) xVar.d().x(j$.time.temporal.n.e());
        if (chronology == null || chronology == j$.time.chrono.q.f47758e) {
            strE = this.f47868c.e(this.f47866a, lE.longValue(), this.f47867b, xVar.c());
        } else {
            strE = this.f47868c.d(chronology, this.f47866a, lE.longValue(), this.f47867b, xVar.c());
        }
        if (strE != null) {
            sb.append(strE);
            return true;
        }
        if (this.f47869d == null) {
            this.f47869d = new j$.time.format.j(this.f47866a, 1, 19, j$.time.format.D.NORMAL);
        }
        return this.f47869d.n(xVar, sb);
    }

    @Override // j$.time.format.f
    public final int p(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i6) {
        int length = charSequence.length();
        if (i6 < 0 || i6 > length) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        j$.time.format.TextStyle textStyle = vVar.l() ? this.f47867b : null;
        j$.time.chrono.Chronology chronologyH = vVar.h();
        j$.time.format.A a6 = this.f47868c;
        j$.time.temporal.s sVar = this.f47866a;
        java.util.Iterator itG = (chronologyH == null || chronologyH == j$.time.chrono.q.f47758e) ? a6.g(sVar, textStyle, vVar.i()) : a6.f(chronologyH, sVar, textStyle, vVar.i());
        if (itG != null) {
            while (itG.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) itG.next();
                java.lang.String str = (java.lang.String) entry.getKey();
                if (vVar.s(str, 0, charSequence, i6, str.length())) {
                    return vVar.o(this.f47866a, ((java.lang.Long) entry.getValue()).longValue(), i6, str.length() + i6);
                }
            }
            if (sVar == j$.time.temporal.a.ERA && !vVar.l()) {
                for (j$.time.chrono.k kVar : chronologyH.H()) {
                    java.lang.String string = kVar.toString();
                    if (vVar.s(string, 0, charSequence, i6, string.length())) {
                        return vVar.o(this.f47866a, kVar.getValue(), i6, string.length() + i6);
                    }
                }
            }
            if (vVar.l()) {
                return ~i6;
            }
        }
        if (this.f47869d == null) {
            this.f47869d = new j$.time.format.j(this.f47866a, 1, 19, j$.time.format.D.NORMAL);
        }
        return this.f47869d.p(vVar, charSequence, i6);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb;
        j$.time.format.TextStyle textStyle = j$.time.format.TextStyle.FULL;
        j$.time.temporal.s sVar = this.f47866a;
        j$.time.format.TextStyle textStyle2 = this.f47867b;
        if (textStyle2 == textStyle) {
            sb = new java.lang.StringBuilder("Text(");
            sb.append(sVar);
        } else {
            sb = new java.lang.StringBuilder("Text(");
            sb.append(sVar);
            sb.append(",");
            sb.append(textStyle2);
        }
        sb.append(")");
        return sb.toString();
    }
}
