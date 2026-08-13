package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class B implements j$.time.chrono.k {
    public static final j$.time.chrono.B BEFORE_ROC;
    public static final j$.time.chrono.B ROC;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ j$.time.chrono.B[] f47713a;

    static {
        j$.time.chrono.B b6 = new j$.time.chrono.B("BEFORE_ROC", 0);
        BEFORE_ROC = b6;
        j$.time.chrono.B b10 = new j$.time.chrono.B("ROC", 1);
        ROC = b10;
        f47713a = new j$.time.chrono.B[]{b6, b10};
    }

    public static j$.time.chrono.B valueOf(java.lang.String str) {
        return (j$.time.chrono.B) java.lang.Enum.valueOf(j$.time.chrono.B.class, str);
    }

    public static j$.time.chrono.B[] values() {
        return (j$.time.chrono.B[]) f47713a.clone();
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
