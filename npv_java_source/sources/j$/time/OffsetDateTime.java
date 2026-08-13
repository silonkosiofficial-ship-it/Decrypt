package j$.time;

/* JADX INFO: loaded from: classes4.dex */
public final class OffsetDateTime implements j$.time.temporal.m, j$.time.temporal.o, java.lang.Comparable<j$.time.OffsetDateTime>, java.io.Serializable {
    private static final long serialVersionUID = 2287754244819255394L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.LocalDateTime f47696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j$.time.ZoneOffset f47697b;

    static {
        j$.time.LocalDateTime localDateTime = j$.time.LocalDateTime.MIN;
        j$.time.ZoneOffset zoneOffset = j$.time.ZoneOffset.f47702g;
        localDateTime.getClass();
        M(localDateTime, zoneOffset);
        j$.time.LocalDateTime localDateTime2 = j$.time.LocalDateTime.MAX;
        j$.time.ZoneOffset zoneOffset2 = j$.time.ZoneOffset.f47701f;
        localDateTime2.getClass();
        M(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(j$.time.LocalDateTime localDateTime, j$.time.ZoneOffset zoneOffset) {
        this.f47696a = (j$.time.LocalDateTime) j$.util.Objects.requireNonNull(localDateTime, "dateTime");
        this.f47697b = (j$.time.ZoneOffset) j$.util.Objects.requireNonNull(zoneOffset, "offset");
    }

    public static j$.time.OffsetDateTime M(j$.time.LocalDateTime localDateTime, j$.time.ZoneOffset zoneOffset) {
        return new j$.time.OffsetDateTime(localDateTime, zoneOffset);
    }

    public static j$.time.OffsetDateTime N(j$.time.Instant instant, j$.time.ZoneId zoneId) {
        j$.util.Objects.requireNonNull(instant, "instant");
        j$.util.Objects.requireNonNull(zoneId, "zone");
        j$.time.ZoneOffset zoneOffsetD = zoneId.getRules().d(instant);
        return new j$.time.OffsetDateTime(j$.time.LocalDateTime.T(instant.getEpochSecond(), instant.O(), zoneOffsetD), zoneOffsetD);
    }

    static j$.time.OffsetDateTime P(java.io.ObjectInput objectInput) {
        j$.time.LocalDateTime localDateTime = j$.time.LocalDateTime.MIN;
        j$.time.LocalDate localDate = j$.time.LocalDate.MIN;
        return new j$.time.OffsetDateTime(j$.time.LocalDateTime.of(j$.time.LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j$.time.LocalTime.X(objectInput)), j$.time.ZoneOffset.T(objectInput));
    }

    private j$.time.OffsetDateTime Q(j$.time.LocalDateTime localDateTime, j$.time.ZoneOffset zoneOffset) {
        return (this.f47696a == localDateTime && this.f47697b.equals(zoneOffset)) ? this : new j$.time.OffsetDateTime(localDateTime, zoneOffset);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.n((byte) 10, this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final j$.time.OffsetDateTime d(long j6, j$.time.temporal.t tVar) {
        return tVar instanceof j$.time.temporal.b ? Q(this.f47696a.d(j6, tVar), this.f47697b) : (j$.time.OffsetDateTime) tVar.n(this, j6);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j6, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return (j$.time.OffsetDateTime) sVar.x(this, j6);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
        int i6 = j$.time.k.f47901a[aVar.ordinal()];
        j$.time.ZoneOffset zoneOffset = this.f47697b;
        j$.time.LocalDateTime localDateTime = this.f47696a;
        if (i6 != 1) {
            return i6 != 2 ? Q(localDateTime.c(j6, sVar), zoneOffset) : Q(localDateTime, j$.time.ZoneOffset.ofTotalSeconds(aVar.N(j6)));
        }
        return N(j$.time.Instant.ofEpochSecond(j6, localDateTime.O()), zoneOffset);
    }

    @Override // java.lang.Comparable
    public final int compareTo(j$.time.OffsetDateTime offsetDateTime) {
        int nano;
        j$.time.OffsetDateTime offsetDateTime2 = offsetDateTime;
        j$.time.ZoneOffset zoneOffset = offsetDateTime2.f47697b;
        j$.time.ZoneOffset zoneOffset2 = this.f47697b;
        if (zoneOffset2.equals(zoneOffset)) {
            nano = toLocalDateTime().compareTo((j$.time.chrono.ChronoLocalDateTime<?>) offsetDateTime2.toLocalDateTime());
        } else {
            j$.time.LocalDateTime localDateTime = this.f47696a;
            localDateTime.getClass();
            long jN = j$.time.chrono.AbstractC6701g.n(localDateTime, zoneOffset2);
            j$.time.LocalDateTime localDateTime2 = offsetDateTime2.f47696a;
            localDateTime2.getClass();
            int iCompare = java.lang.Long.compare(jN, j$.time.chrono.AbstractC6701g.n(localDateTime2, offsetDateTime2.f47697b));
            nano = iCompare == 0 ? localDateTime.toLocalTime().getNano() - localDateTime2.toLocalTime().getNano() : iCompare;
        }
        return nano == 0 ? toLocalDateTime().compareTo((j$.time.chrono.ChronoLocalDateTime<?>) offsetDateTime2.toLocalDateTime()) : nano;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.s sVar) {
        return (sVar instanceof j$.time.temporal.a) || (sVar != null && sVar.u(this));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j$.time.OffsetDateTime)) {
            return false;
        }
        j$.time.OffsetDateTime offsetDateTime = (j$.time.OffsetDateTime) obj;
        return this.f47696a.equals(offsetDateTime.f47696a) && this.f47697b.equals(offsetDateTime.f47697b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m f(long j6, j$.time.temporal.t tVar) {
        return j6 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j6, tVar);
    }

    public final int hashCode() {
        return this.f47696a.hashCode() ^ this.f47697b.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int n(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.n.a(this, sVar);
        }
        int i6 = j$.time.k.f47901a[((j$.time.temporal.a) sVar).ordinal()];
        if (i6 != 1) {
            return i6 != 2 ? this.f47696a.n(sVar) : this.f47697b.getTotalSeconds();
        }
        throw new j$.time.temporal.u("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(j$.time.LocalDate localDate) {
        return Q(this.f47696a.Z(localDate), this.f47697b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return (sVar == j$.time.temporal.a.INSTANT_SECONDS || sVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) sVar).n() : this.f47696a.q(sVar);
        }
        return sVar.y(this);
    }

    public j$.time.LocalDateTime toLocalDateTime() {
        return this.f47696a;
    }

    public final java.lang.String toString() {
        return this.f47696a.toString() + this.f47697b.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar.q(this);
        }
        int i6 = j$.time.k.f47901a[((j$.time.temporal.a) sVar).ordinal()];
        j$.time.ZoneOffset zoneOffset = this.f47697b;
        j$.time.LocalDateTime localDateTime = this.f47696a;
        if (i6 != 1) {
            return i6 != 2 ? localDateTime.u(sVar) : zoneOffset.getTotalSeconds();
        }
        localDateTime.getClass();
        return j$.time.chrono.AbstractC6701g.n(localDateTime, zoneOffset);
    }

    final void writeExternal(java.io.ObjectOutput objectOutput) {
        this.f47696a.c0(objectOutput);
        this.f47697b.U(objectOutput);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object x(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.i() || temporalQuery == j$.time.temporal.n.k()) {
            return this.f47697b;
        }
        if (temporalQuery == j$.time.temporal.n.l()) {
            return null;
        }
        j$.time.temporal.TemporalQuery temporalQueryF = j$.time.temporal.n.f();
        j$.time.LocalDateTime localDateTime = this.f47696a;
        if (temporalQuery == temporalQueryF) {
            return localDateTime.b();
        }
        if (temporalQuery == j$.time.temporal.n.g()) {
            return localDateTime.toLocalTime();
        }
        if (temporalQuery == j$.time.temporal.n.e()) {
            return j$.time.chrono.q.f47758e;
        }
        return temporalQuery == j$.time.temporal.n.j() ? j$.time.temporal.b.NANOS : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m y(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        j$.time.LocalDateTime localDateTime = this.f47696a;
        return mVar.c(localDateTime.b().toEpochDay(), aVar).c(localDateTime.toLocalTime().Y(), j$.time.temporal.a.NANO_OF_DAY).c(this.f47697b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }
}
