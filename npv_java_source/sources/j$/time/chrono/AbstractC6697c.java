package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6697c implements j$.time.chrono.ChronoLocalDate, j$.time.temporal.m, j$.time.temporal.o, java.io.Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    AbstractC6697c() {
    }

    static j$.time.chrono.ChronoLocalDate M(j$.time.chrono.Chronology chronology, j$.time.temporal.m mVar) {
        j$.time.chrono.ChronoLocalDate chronoLocalDate = (j$.time.chrono.ChronoLocalDate) mVar;
        if (chronology.equals(chronoLocalDate.a())) {
            return chronoLocalDate;
        }
        throw new java.lang.ClassCastException("Chronology mismatch, expected: " + chronology.getId() + ", actual: " + chronoLocalDate.a().getId());
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public j$.time.chrono.ChronoLocalDate C(j$.time.temporal.r rVar) {
        return M(a(), rVar.n(this));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean D() {
        return a().J(u(j$.time.temporal.a.YEAR));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int I() {
        return D() ? 366 : 365;
    }

    abstract j$.time.chrono.ChronoLocalDate N(long j6);

    abstract j$.time.chrono.ChronoLocalDate O(long j6);

    abstract j$.time.chrono.ChronoLocalDate P(long j6);

    @Override // j$.time.temporal.m
    public j$.time.chrono.ChronoLocalDate c(long j6, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
        }
        return M(a(), sVar.x(this, j6));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(j$.time.chrono.ChronoLocalDate chronoLocalDate) {
        return j$.time.chrono.AbstractC6701g.b(this, chronoLocalDate);
    }

    @Override // j$.time.temporal.m
    public j$.time.chrono.ChronoLocalDate d(long j6, j$.time.temporal.t tVar) {
        boolean z6 = tVar instanceof j$.time.temporal.b;
        if (!z6) {
            if (!z6) {
                return M(a(), tVar.n(this, j6));
            }
            throw new j$.time.temporal.u("Unsupported unit: " + tVar);
        }
        switch (j$.time.chrono.AbstractC6696b.f47725a[((j$.time.temporal.b) tVar).ordinal()]) {
            case 1:
                return N(j6);
            case 2:
                return N(j$.com.android.tools.r8.a.m(j6, 7));
            case 3:
                return O(j6);
            case 4:
                return P(j6);
            case 5:
                return P(j$.com.android.tools.r8.a.m(j6, 10));
            case 6:
                return P(j$.com.android.tools.r8.a.m(j6, 100));
            case 7:
                return P(j$.com.android.tools.r8.a.m(j6, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.com.android.tools.r8.a.g(u(aVar), j6), (j$.time.temporal.s) aVar);
            default:
                throw new j$.time.temporal.u("Unsupported unit: " + tVar);
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean e(j$.time.temporal.s sVar) {
        return j$.time.chrono.AbstractC6701g.h(this, sVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j$.time.chrono.ChronoLocalDate) && j$.time.chrono.AbstractC6701g.b(this, (j$.time.chrono.ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.temporal.m
    public j$.time.chrono.ChronoLocalDate f(long j6, j$.time.temporal.t tVar) {
        return M(a(), j$.time.temporal.n.b(this, j6, tVar));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return ((int) (epochDay ^ (epochDay >>> 32))) ^ ((j$.time.chrono.AbstractC6695a) a()).hashCode();
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: k */
    public j$.time.chrono.ChronoLocalDate p(j$.time.temporal.o oVar) {
        return M(a(), oVar.y(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int n(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.a(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.v q(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.d(this, sVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        return u(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public java.lang.String toString() {
        long jU = u(j$.time.temporal.a.YEAR_OF_ERA);
        long jU2 = u(j$.time.temporal.a.MONTH_OF_YEAR);
        long jU3 = u(j$.time.temporal.a.DAY_OF_MONTH);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
        sb.append(((j$.time.chrono.AbstractC6695a) a()).getId());
        sb.append(" ");
        sb.append(z());
        sb.append(" ");
        sb.append(jU);
        sb.append(jU2 < 10 ? "-0" : "-");
        sb.append(jU2);
        sb.append(jU3 < 10 ? "-0" : "-");
        sb.append(jU3);
        return sb.toString();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public j$.time.chrono.ChronoLocalDateTime w(j$.time.LocalTime localTime) {
        return j$.time.chrono.C6699e.O(this, localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ java.lang.Object x(j$.time.temporal.TemporalQuery temporalQuery) {
        return j$.time.chrono.AbstractC6701g.j(this, temporalQuery);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ j$.time.temporal.m y(j$.time.temporal.m mVar) {
        return j$.time.chrono.AbstractC6701g.a(this, mVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public j$.time.chrono.k z() {
        return a().K(j$.time.temporal.n.a(this, j$.time.temporal.a.ERA));
    }
}
