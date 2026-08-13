package j$.time.temporal;

/* JADX INFO: loaded from: classes4.dex */
enum k implements j$.time.temporal.s {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient java.lang.String f47945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient j$.time.temporal.v f47946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient long f47947c;

    static {
        j$.time.temporal.b bVar = j$.time.temporal.b.NANOS;
    }

    k(java.lang.String str, long j6) {
        this.f47945a = str;
        this.f47946b = j$.time.temporal.v.j((-365243219162L) + j6, 365241780471L + j6);
        this.f47947c = j6;
    }

    @Override // j$.time.temporal.s
    public final boolean M() {
        return true;
    }

    @Override // j$.time.temporal.s
    public final j$.time.temporal.v n() {
        return this.f47946b;
    }

    @Override // j$.time.temporal.s
    public final j$.time.temporal.TemporalAccessor p(java.util.Map map, j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.format.C c6) {
        long jLongValue = ((java.lang.Long) map.remove(this)).longValue();
        j$.time.chrono.Chronology chronologyA = j$.time.chrono.Chronology.CC.a(temporalAccessor);
        j$.time.format.C c10 = j$.time.format.C.LENIENT;
        long j6 = this.f47947c;
        if (c6 == c10) {
            return chronologyA.l(j$.com.android.tools.r8.a.n(jLongValue, j6));
        }
        this.f47946b.b(jLongValue, this);
        return chronologyA.l(jLongValue - j6);
    }

    @Override // j$.time.temporal.s
    public final long q(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.u(j$.time.temporal.a.EPOCH_DAY) + this.f47947c;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f47945a;
    }

    @Override // j$.time.temporal.s
    public final boolean u(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.e(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.s
    public final j$.time.temporal.m x(j$.time.temporal.m mVar, long j6) {
        if (this.f47946b.i(j6)) {
            return mVar.c(j$.com.android.tools.r8.a.n(j6, this.f47947c), j$.time.temporal.a.EPOCH_DAY);
        }
        throw new j$.time.DateTimeException("Invalid value: " + this.f47945a + " " + j6);
    }

    @Override // j$.time.temporal.s
    public final j$.time.temporal.v y(j$.time.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor.e(j$.time.temporal.a.EPOCH_DAY)) {
            return this.f47946b;
        }
        throw new j$.time.DateTimeException("Unsupported field: " + this);
    }
}
