package j$.time.chrono;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements j$.time.chrono.k, java.io.Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j$.time.chrono.w f47767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j$.time.chrono.w[] f47768e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient int f47769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient j$.time.LocalDate f47770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient java.lang.String f47771c;

    static {
        j$.time.chrono.w wVar = new j$.time.chrono.w(-1, j$.time.LocalDate.of(1868, 1, 1), "Meiji");
        f47767d = wVar;
        f47768e = new j$.time.chrono.w[]{wVar, new j$.time.chrono.w(0, j$.time.LocalDate.of(1912, 7, 30), "Taisho"), new j$.time.chrono.w(1, j$.time.LocalDate.of(1926, 12, 25), "Showa"), new j$.time.chrono.w(2, j$.time.LocalDate.of(1989, 1, 8), "Heisei"), new j$.time.chrono.w(3, j$.time.LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    private w(int i6, j$.time.LocalDate localDate, java.lang.String str) {
        this.f47769a = i6;
        this.f47770b = localDate;
        this.f47771c = str;
    }

    public static j$.time.chrono.w[] B() {
        j$.time.chrono.w[] wVarArr = f47768e;
        return (j$.time.chrono.w[]) java.util.Arrays.copyOf(wVarArr, wVarArr.length);
    }

    static j$.time.chrono.w g(j$.time.LocalDate localDate) {
        if (localDate.R(j$.time.chrono.v.f47763d)) {
            throw new j$.time.DateTimeException("JapaneseDate before Meiji 6 are not supported");
        }
        j$.time.chrono.w[] wVarArr = f47768e;
        for (int length = wVarArr.length - 1; length >= 0; length--) {
            j$.time.chrono.w wVar = wVarArr[length];
            if (localDate.compareTo((j$.time.chrono.ChronoLocalDate) wVar.f47770b) >= 0) {
                return wVar;
            }
        }
        return null;
    }

    static j$.time.chrono.w h() {
        j$.time.chrono.w[] wVarArr = f47768e;
        return wVarArr[wVarArr.length - 1];
    }

    public static j$.time.chrono.w r(int i6) {
        int i10 = i6 + 1;
        if (i10 >= 0) {
            j$.time.chrono.w[] wVarArr = f47768e;
            if (i10 < wVarArr.length) {
                return wVarArr[i10];
            }
        }
        throw new j$.time.DateTimeException("Invalid era: " + i6);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    static long t() {
        long jF = j$.time.temporal.a.DAY_OF_YEAR.n().f();
        for (j$.time.chrono.w wVar : f47768e) {
            jF = java.lang.Math.min(jF, (wVar.f47770b.I() - wVar.f47770b.Q()) + 1);
            if (wVar.o() != null) {
                jF = java.lang.Math.min(jF, wVar.o().f47770b.Q() - 1);
            }
        }
        return jF;
    }

    static long v() {
        int year = 1000000000 - h().f47770b.getYear();
        j$.time.chrono.w[] wVarArr = f47768e;
        int year2 = wVarArr[0].f47770b.getYear();
        for (int i6 = 1; i6 < wVarArr.length; i6++) {
            j$.time.chrono.w wVar = wVarArr[i6];
            year = java.lang.Math.min(year, (wVar.f47770b.getYear() - year2) + 1);
            year2 = wVar.f47770b.getYear();
        }
        return year;
    }

    private java.lang.Object writeReplace() {
        return new j$.time.chrono.C((byte) 5, this);
    }

    final void E(java.io.DataOutput dataOutput) throws java.io.IOException {
        dataOutput.writeByte(this.f47769a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean e(j$.time.temporal.s sVar) {
        return j$.time.chrono.AbstractC6701g.i(this, sVar);
    }

    @Override // j$.time.chrono.k
    public final int getValue() {
        return this.f47769a;
    }

    final j$.time.LocalDate l() {
        return this.f47770b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int n(j$.time.temporal.s sVar) {
        return j$.time.chrono.AbstractC6701g.f(this, sVar);
    }

    final j$.time.chrono.w o() {
        if (this == h()) {
            return null;
        }
        return r(this.f47769a + 1);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return sVar == aVar ? j$.time.chrono.t.f47761e.F(aVar) : j$.time.temporal.n.d(this, sVar);
    }

    public final java.lang.String toString() {
        return this.f47771c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long u(j$.time.temporal.s sVar) {
        return j$.time.chrono.AbstractC6701g.g(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ java.lang.Object x(j$.time.temporal.TemporalQuery temporalQuery) {
        return j$.time.chrono.AbstractC6701g.m(this, temporalQuery);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m y(j$.time.temporal.m mVar) {
        return mVar.c(getValue(), j$.time.temporal.a.ERA);
    }
}
