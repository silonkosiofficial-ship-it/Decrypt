package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements j$.time.chrono.k {
    public static final j$.time.chrono.p AH;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ j$.time.chrono.p[] f47757a;

    static {
        j$.time.chrono.p pVar = new j$.time.chrono.p("AH", 0);
        AH = pVar;
        f47757a = new j$.time.chrono.p[]{pVar};
    }

    public static j$.time.chrono.p valueOf(java.lang.String str) {
        return (j$.time.chrono.p) java.lang.Enum.valueOf(j$.time.chrono.p.class, str);
    }

    public static j$.time.chrono.p[] values() {
        return (j$.time.chrono.p[]) f47757a.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean e(j$.time.temporal.s sVar) {
        return j$.time.chrono.AbstractC6701g.i(this, sVar);
    }

    @Override // j$.time.chrono.k
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int n(j$.time.temporal.s sVar) {
        return j$.time.chrono.AbstractC6701g.f(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        return sVar == j$.time.temporal.a.ERA ? j$.time.temporal.v.j(1L, 1L) : j$.time.temporal.n.d(this, sVar);
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
        return mVar.c(1, j$.time.temporal.a.ERA);
    }
}
