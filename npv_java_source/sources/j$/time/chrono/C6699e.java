package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6699e implements j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.m, j$.time.temporal.o, java.io.Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient j$.time.chrono.ChronoLocalDate f47727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient j$.time.LocalTime f47728b;

    private C6699e(j$.time.chrono.ChronoLocalDate chronoLocalDate, j$.time.LocalTime localTime) {
        j$.util.Objects.requireNonNull(chronoLocalDate, "date");
        j$.util.Objects.requireNonNull(localTime, "time");
        this.f47727a = chronoLocalDate;
        this.f47728b = localTime;
    }

    static j$.time.chrono.C6699e M(j$.time.chrono.Chronology chronology, j$.time.temporal.m mVar) {
        j$.time.chrono.C6699e c6699e = (j$.time.chrono.C6699e) mVar;
        if (chronology.equals(c6699e.f47727a.a())) {
            return c6699e;
        }
        throw new java.lang.ClassCastException("Chronology mismatch, required: " + chronology.getId() + ", actual: " + c6699e.f47727a.a().getId());
    }

    static j$.time.chrono.C6699e O(j$.time.chrono.ChronoLocalDate chronoLocalDate, j$.time.LocalTime localTime) {
        return new j$.time.chrono.C6699e(chronoLocalDate, localTime);
    }

    private j$.time.chrono.C6699e R(j$.time.chrono.ChronoLocalDate chronoLocalDate, long j6, long j10, long j11, long j12) {
        long j13 = j6 | j10 | j11 | j12;
        j$.time.LocalTime localTimeQ = this.f47728b;
        if (j13 == 0) {
            return T(chronoLocalDate, localTimeQ);
        }
        long j14 = j10 / 1440;
        long j15 = j6 / 24;
        long j16 = (j10 % 1440) * 60000000000L;
        long j17 = ((j6 % 24) * 3600000000000L) + j16 + ((j11 % 86400) * 1000000000) + (j12 % 86400000000000L);
        long jY = localTimeQ.Y();
        long j18 = j17 + jY;
        long jL = j$.com.android.tools.r8.a.l(j18, 86400000000000L) + j15 + j14 + (j11 / 86400) + (j12 / 86400000000000L);
        long jK = j$.com.android.tools.r8.a.k(j18, 86400000000000L);
        if (jK != jY) {
            localTimeQ = j$.time.LocalTime.Q(jK);
        }
        return T(chronoLocalDate.d(jL, (j$.time.temporal.t) j$.time.temporal.b.DAYS), localTimeQ);
    }

    private j$.time.chrono.C6699e T(j$.time.temporal.m mVar, j$.time.LocalTime localTime) {
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f47727a;
        return (chronoLocalDate == mVar && this.f47728b == localTime) ? this : new j$.time.chrono.C6699e(j$.time.chrono.AbstractC6697c.M(chronoLocalDate.a(), mVar), localTime);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.chrono.C((byte) 2, this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final j$.time.chrono.ChronoLocalDateTime f(long j6, j$.time.temporal.t tVar) {
        return M(a(), j$.time.temporal.n.b(this, j6, tVar));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final j$.time.chrono.C6699e d(long j6, j$.time.temporal.t tVar) {
        boolean z6 = tVar instanceof j$.time.temporal.b;
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f47727a;
        if (!z6) {
            return M(chronoLocalDate.a(), tVar.n(this, j6));
        }
        int i6 = j$.time.chrono.AbstractC6698d.f47726a[((j$.time.temporal.b) tVar).ordinal()];
        j$.time.LocalTime localTime = this.f47728b;
        switch (i6) {
            case 1:
                return R(this.f47727a, 0L, 0L, 0L, j6);
            case 2:
                j$.time.chrono.C6699e c6699eT = T(chronoLocalDate.d(j6 / 86400000000L, (j$.time.temporal.t) j$.time.temporal.b.DAYS), localTime);
                return c6699eT.R(c6699eT.f47727a, 0L, 0L, 0L, (j6 % 86400000000L) * 1000);
            case 3:
                j$.time.chrono.C6699e c6699eT2 = T(chronoLocalDate.d(j6 / 86400000, (j$.time.temporal.t) j$.time.temporal.b.DAYS), localTime);
                return c6699eT2.R(c6699eT2.f47727a, 0L, 0L, 0L, (j6 % 86400000) * 1000000);
            case 4:
                return Q(j6);
            case 5:
                return R(this.f47727a, 0L, j6, 0L, 0L);
            case 6:
                return R(this.f47727a, j6, 0L, 0L, 0L);
            case 7:
                j$.time.chrono.C6699e c6699eT3 = T(chronoLocalDate.d(j6 / 256, (j$.time.temporal.t) j$.time.temporal.b.DAYS), localTime);
                return c6699eT3.R(c6699eT3.f47727a, (j6 % 256) * 12, 0L, 0L, 0L);
            default:
                return T(chronoLocalDate.d(j6, tVar), localTime);
        }
    }

    final j$.time.chrono.C6699e Q(long j6) {
        return R(this.f47727a, 0L, 0L, j6, 0L);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final j$.time.chrono.C6699e c(long j6, j$.time.temporal.s sVar) {
        boolean z6 = sVar instanceof j$.time.temporal.a;
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f47727a;
        if (!z6) {
            return M(chronoLocalDate.a(), sVar.x(this, j6));
        }
        boolean zP = ((j$.time.temporal.a) sVar).P();
        j$.time.LocalTime localTime = this.f47728b;
        return zP ? T(chronoLocalDate, localTime.c(j6, sVar)) : T(chronoLocalDate.c(j6, sVar), localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.Chronology a() {
        return this.f47727a.a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.ChronoLocalDate b() {
        return this.f47727a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ int compareTo(j$.time.chrono.ChronoLocalDateTime chronoLocalDateTime) {
        return j$.time.chrono.AbstractC6701g.c(this, chronoLocalDateTime);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(j$.time.chrono.ChronoLocalDateTime<?> chronoLocalDateTime) {
        return compareTo((j$.time.chrono.ChronoLocalDateTime) chronoLocalDateTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar != null && sVar.u(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
        return aVar.M() || aVar.P();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j$.time.chrono.ChronoLocalDateTime) && j$.time.chrono.AbstractC6701g.c(this, (j$.time.chrono.ChronoLocalDateTime) obj) == 0;
    }

    public final int hashCode() {
        return this.f47727a.hashCode() ^ this.f47728b.hashCode();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.ChronoZonedDateTime m(j$.time.ZoneId zoneId) {
        return j$.time.chrono.j.O(zoneId, null, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int n(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) sVar).P() ? this.f47728b.n(sVar) : this.f47727a.n(sVar);
        }
        return q(sVar).a(u(sVar), sVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(j$.time.LocalDate localDate) {
        return T(localDate, this.f47728b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar.y(this);
        }
        if (!((j$.time.temporal.a) sVar).P()) {
            return this.f47727a.q(sVar);
        }
        j$.time.LocalTime localTime = this.f47728b;
        localTime.getClass();
        return j$.time.temporal.n.d(localTime, sVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long toEpochSecond(j$.time.ZoneOffset zoneOffset) {
        return j$.time.chrono.AbstractC6701g.n(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.LocalTime toLocalTime() {
        return this.f47728b;
    }

    public final java.lang.String toString() {
        return this.f47727a.toString() + "T" + this.f47728b.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) sVar).P() ? this.f47728b.u(sVar) : this.f47727a.u(sVar);
        }
        return sVar.q(this);
    }

    final void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        objectOutput.writeObject(this.f47727a);
        objectOutput.writeObject(this.f47728b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ java.lang.Object x(j$.time.temporal.TemporalQuery temporalQuery) {
        return j$.time.chrono.AbstractC6701g.k(this, temporalQuery);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m y(j$.time.temporal.m mVar) {
        return mVar.c(b().toEpochDay(), j$.time.temporal.a.EPOCH_DAY).c(toLocalTime().Y(), j$.time.temporal.a.NANO_OF_DAY);
    }
}
