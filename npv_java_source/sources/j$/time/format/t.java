package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
class t implements j$.time.format.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile java.util.AbstractMap.SimpleImmutableEntry f47872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile java.util.AbstractMap.SimpleImmutableEntry f47873d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.temporal.TemporalQuery f47874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f47875b;

    t(j$.time.temporal.TemporalQuery temporalQuery, java.lang.String str) {
        this.f47874a = temporalQuery;
        this.f47875b = str;
    }

    private static int b(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i6, int i10, j$.time.format.k kVar) {
        java.lang.String upperCase = charSequence.subSequence(i6, i10).toString().toUpperCase();
        if (i10 >= charSequence.length() || charSequence.charAt(i10) == '0' || vVar.b(charSequence.charAt(i10), 'Z')) {
            vVar.n(j$.time.ZoneId.of(upperCase));
            return i10;
        }
        j$.time.format.v vVarD = vVar.d();
        int iP = kVar.p(vVarD, charSequence, i10);
        try {
            if (iP >= 0) {
                vVar.n(j$.time.ZoneId.N(upperCase, j$.time.ZoneOffset.ofTotalSeconds((int) vVarD.j(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
                return iP;
            }
            if (kVar == j$.time.format.k.f47844e) {
                return ~i6;
            }
            vVar.n(j$.time.ZoneId.of(upperCase));
            return i10;
        } catch (j$.time.DateTimeException unused) {
            return ~i6;
        }
    }

    protected j$.time.format.n a(j$.time.format.v vVar) {
        java.util.Set setA = j$.time.zone.i.a();
        int size = setA.size();
        java.util.AbstractMap.SimpleImmutableEntry simpleImmutableEntry = vVar.k() ? f47872c : f47873d;
        if (simpleImmutableEntry == null || ((java.lang.Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = vVar.k() ? f47872c : f47873d;
                    if (simpleImmutableEntry == null || ((java.lang.Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        simpleImmutableEntry = new java.util.AbstractMap.SimpleImmutableEntry(java.lang.Integer.valueOf(size), j$.time.format.n.g(setA, vVar));
                        if (vVar.k()) {
                            f47872c = simpleImmutableEntry;
                        } else {
                            f47873d = simpleImmutableEntry;
                        }
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return (j$.time.format.n) simpleImmutableEntry.getValue();
    }

    @Override // j$.time.format.f
    public boolean n(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        j$.time.ZoneId zoneId = (j$.time.ZoneId) xVar.f(this.f47874a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.getId());
        return true;
    }

    @Override // j$.time.format.f
    public final int p(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i6) {
        int i10;
        int length = charSequence.length();
        if (i6 > length) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i6 == length) {
            return ~i6;
        }
        char cCharAt = charSequence.charAt(i6);
        if (cCharAt == '+' || cCharAt == '-') {
            return b(vVar, charSequence, i6, i6, j$.time.format.k.f47844e);
        }
        int i11 = i6 + 2;
        if (length >= i11) {
            char cCharAt2 = charSequence.charAt(i6 + 1);
            if (vVar.b(cCharAt, 'U') && vVar.b(cCharAt2, 'T')) {
                int i12 = i6 + 3;
                return (length < i12 || !vVar.b(charSequence.charAt(i11), 'C')) ? b(vVar, charSequence, i6, i11, j$.time.format.k.f47845f) : b(vVar, charSequence, i6, i12, j$.time.format.k.f47845f);
            }
            if (vVar.b(cCharAt, 'G') && length >= (i10 = i6 + 3) && vVar.b(cCharAt2, 'M') && vVar.b(charSequence.charAt(i11), 'T')) {
                int i13 = i6 + 4;
                if (length < i13 || !vVar.b(charSequence.charAt(i10), '0')) {
                    return b(vVar, charSequence, i6, i10, j$.time.format.k.f47845f);
                }
                vVar.n(j$.time.ZoneId.of("GMT0"));
                return i13;
            }
        }
        j$.time.format.n nVarA = a(vVar);
        java.text.ParsePosition parsePosition = new java.text.ParsePosition(i6);
        java.lang.String strD = nVarA.d(charSequence, parsePosition);
        if (strD != null) {
            vVar.n(j$.time.ZoneId.of(strD));
            return parsePosition.getIndex();
        }
        if (!vVar.b(cCharAt, 'Z')) {
            return ~i6;
        }
        vVar.n(j$.time.ZoneOffset.UTC);
        return i6 + 1;
    }

    public final java.lang.String toString() {
        return this.f47875b;
    }
}
