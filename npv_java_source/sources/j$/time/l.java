package j$.time;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements j$.time.temporal.m, j$.time.temporal.o, java.lang.Comparable, java.io.Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.LocalTime f47902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j$.time.ZoneOffset f47903b;

    static {
        j$.time.LocalTime localTime = j$.time.LocalTime.MIN;
        j$.time.ZoneOffset zoneOffset = j$.time.ZoneOffset.f47702g;
        localTime.getClass();
        M(localTime, zoneOffset);
        j$.time.LocalTime localTime2 = j$.time.LocalTime.MAX;
        j$.time.ZoneOffset zoneOffset2 = j$.time.ZoneOffset.f47701f;
        localTime2.getClass();
        M(localTime2, zoneOffset2);
    }

    private l(j$.time.LocalTime localTime, j$.time.ZoneOffset zoneOffset) {
        this.f47902a = (j$.time.LocalTime) j$.util.Objects.requireNonNull(localTime, "time");
        this.f47903b = (j$.time.ZoneOffset) j$.util.Objects.requireNonNull(zoneOffset, "offset");
    }

    public static j$.time.l M(j$.time.LocalTime localTime, j$.time.ZoneOffset zoneOffset) {
        return new j$.time.l(localTime, zoneOffset);
    }

    static j$.time.l O(java.io.ObjectInput objectInput) {
        return new j$.time.l(j$.time.LocalTime.X(objectInput), j$.time.ZoneOffset.T(objectInput));
    }

    private j$.time.l P(j$.time.LocalTime localTime, j$.time.ZoneOffset zoneOffset) {
        return (this.f47902a == localTime && this.f47903b.equals(zoneOffset)) ? this : new j$.time.l(localTime, zoneOffset);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.n((byte) 9, this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final j$.time.l d(long j6, j$.time.temporal.t tVar) {
        return tVar instanceof j$.time.temporal.b ? P(this.f47902a.d(j6, tVar), this.f47903b) : (j$.time.l) tVar.n(this, j6);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j6, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return (j$.time.l) sVar.x(this, j6);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
        j$.time.LocalTime localTime = this.f47902a;
        return sVar == aVar ? P(localTime, j$.time.ZoneOffset.ofTotalSeconds(((j$.time.temporal.a) sVar).N(j6))) : P(localTime.c(j6, sVar), this.f47903b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        int iCompare;
        j$.time.l lVar = (j$.time.l) obj;
        j$.time.ZoneOffset zoneOffset = lVar.f47903b;
        j$.time.ZoneOffset zoneOffset2 = this.f47903b;
        boolean zEquals = zoneOffset2.equals(zoneOffset);
        j$.time.LocalTime localTime = lVar.f47902a;
        j$.time.LocalTime localTime2 = this.f47902a;
        return (zEquals || (iCompare = java.lang.Long.compare(localTime2.Y() - (((long) zoneOffset2.getTotalSeconds()) * 1000000000), localTime.Y() - (((long) lVar.f47903b.getTotalSeconds()) * 1000000000))) == 0) ? localTime2.compareTo(localTime) : iCompare;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) sVar).P() || sVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return sVar != null && sVar.u(this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j$.time.l)) {
            return false;
        }
        j$.time.l lVar = (j$.time.l) obj;
        return this.f47902a.equals(lVar.f47902a) && this.f47903b.equals(lVar.f47903b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m f(long j6, j$.time.temporal.t tVar) {
        return j6 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j6, tVar);
    }

    public final int hashCode() {
        return this.f47902a.hashCode() ^ this.f47903b.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int n(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.a(this, sVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(j$.time.LocalDate localDate) {
        return (j$.time.l) j$.time.chrono.AbstractC6701g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar.y(this);
        }
        if (sVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return ((j$.time.temporal.a) sVar).n();
        }
        j$.time.LocalTime localTime = this.f47902a;
        localTime.getClass();
        return j$.time.temporal.n.d(localTime, sVar);
    }

    public final java.lang.String toString() {
        return this.f47902a.toString() + this.f47903b.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return sVar == j$.time.temporal.a.OFFSET_SECONDS ? this.f47903b.getTotalSeconds() : this.f47902a.u(sVar);
        }
        return sVar.q(this);
    }

    final void writeExternal(java.io.ObjectOutput objectOutput) {
        this.f47902a.b0(objectOutput);
        this.f47903b.U(objectOutput);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object x(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.i() || temporalQuery == j$.time.temporal.n.k()) {
            return this.f47903b;
        }
        if (((temporalQuery == j$.time.temporal.n.l()) || (temporalQuery == j$.time.temporal.n.e())) || temporalQuery == j$.time.temporal.n.f()) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.n.g()) {
            return this.f47902a;
        }
        return temporalQuery == j$.time.temporal.n.j() ? j$.time.temporal.b.NANOS : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m y(j$.time.temporal.m mVar) {
        return mVar.c(this.f47902a.Y(), j$.time.temporal.a.NANO_OF_DAY).c(this.f47903b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }
}
