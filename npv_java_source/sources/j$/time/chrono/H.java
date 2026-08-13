package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class H implements j$.time.chrono.k {
    public static final j$.time.chrono.H BE;
    public static final j$.time.chrono.H BEFORE_BE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ j$.time.chrono.H[] f47720a;

    static {
        j$.time.chrono.H h6 = new j$.time.chrono.H("BEFORE_BE", 0);
        BEFORE_BE = h6;
        j$.time.chrono.H h10 = new j$.time.chrono.H("BE", 1);
        BE = h10;
        f47720a = new j$.time.chrono.H[]{h6, h10};
    }

    public static j$.time.chrono.H valueOf(java.lang.String str) {
        return (j$.time.chrono.H) java.lang.Enum.valueOf(j$.time.chrono.H.class, str);
    }

    public static j$.time.chrono.H[] values() {
        return (j$.time.chrono.H[]) f47720a.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean e(j$.time.temporal.s sVar) {
        return j$.time.chrono.AbstractC6701g.i(this, sVar);
    }

    @Override // j$.time.chrono.k
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int n(j$.time.temporal.s sVar) {
        return j$.time.chrono.AbstractC6701g.f(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.d(this, sVar);
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
