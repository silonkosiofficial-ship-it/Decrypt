package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements j$.time.chrono.k {
    public static final j$.time.chrono.r BCE;
    public static final j$.time.chrono.r CE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ j$.time.chrono.r[] f47759a;

    static {
        j$.time.chrono.r rVar = new j$.time.chrono.r("BCE", 0);
        BCE = rVar;
        j$.time.chrono.r rVar2 = new j$.time.chrono.r("CE", 1);
        CE = rVar2;
        f47759a = new j$.time.chrono.r[]{rVar, rVar2};
    }

    public static j$.time.chrono.r valueOf(java.lang.String str) {
        return (j$.time.chrono.r) java.lang.Enum.valueOf(j$.time.chrono.r.class, str);
    }

    public static j$.time.chrono.r[] values() {
        return (j$.time.chrono.r[]) f47759a.clone();
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
