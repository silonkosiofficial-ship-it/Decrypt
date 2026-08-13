package j$.time.temporal;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final j$.time.temporal.TemporalQuery f47949a = new j$.time.temporal.q(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final j$.time.temporal.TemporalQuery f47950b = new j$.time.temporal.q(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final j$.time.temporal.TemporalQuery f47951c = new j$.time.temporal.q(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final j$.time.temporal.TemporalQuery f47952d = new j$.time.temporal.q(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final j$.time.temporal.TemporalQuery f47953e = new j$.time.temporal.q(5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final j$.time.temporal.TemporalQuery f47954f = new j$.time.temporal.q(6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final j$.time.temporal.TemporalQuery f47955g = new j$.time.temporal.q(7);

    public static int a(j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.temporal.s sVar) {
        j$.time.temporal.v vVarQ = temporalAccessor.q(sVar);
        if (!vVarQ.h()) {
            throw new j$.time.temporal.u("Invalid field " + sVar + " for get() method, use getLong() instead");
        }
        long jU = temporalAccessor.u(sVar);
        if (vVarQ.i(jU)) {
            return (int) jU;
        }
        throw new j$.time.DateTimeException("Invalid value for " + sVar + " (valid values " + vVarQ + "): " + jU);
    }

    public static j$.time.temporal.m b(j$.time.temporal.m mVar, long j6, j$.time.temporal.t tVar) {
        long j10;
        if (j6 == Long.MIN_VALUE) {
            mVar = mVar.d(Long.MAX_VALUE, tVar);
            j10 = 1;
        } else {
            j10 = -j6;
        }
        return mVar.d(j10, tVar);
    }

    public static java.lang.Object c(j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == f47949a || temporalQuery == f47950b || temporalQuery == f47951c) {
            return null;
        }
        return temporalQuery.queryFrom(temporalAccessor);
    }

    public static j$.time.temporal.v d(j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            j$.util.Objects.requireNonNull(sVar, "field");
            return sVar.y(temporalAccessor);
        }
        if (temporalAccessor.e(sVar)) {
            return ((j$.time.temporal.a) sVar).n();
        }
        throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
    }

    public static j$.time.temporal.TemporalQuery e() {
        return f47950b;
    }

    public static j$.time.temporal.TemporalQuery f() {
        return f47954f;
    }

    public static j$.time.temporal.TemporalQuery g() {
        return f47955g;
    }

    public static /* synthetic */ int h(int i6) {
        int i10 = i6 % 7;
        if (i10 == 0) {
            return 0;
        }
        return (((i6 ^ 7) >> 31) | 1) > 0 ? i10 : i10 + 7;
    }

    public static j$.time.temporal.TemporalQuery i() {
        return f47952d;
    }

    public static j$.time.temporal.TemporalQuery j() {
        return f47951c;
    }

    public static j$.time.temporal.TemporalQuery k() {
        return f47953e;
    }

    public static j$.time.temporal.TemporalQuery l() {
        return f47949a;
    }
}
