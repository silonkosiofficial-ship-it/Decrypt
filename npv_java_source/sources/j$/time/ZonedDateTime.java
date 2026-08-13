package j$.time;

/* JADX INFO: loaded from: classes4.dex */
public final class ZonedDateTime implements j$.time.temporal.m, j$.time.chrono.ChronoZonedDateTime<j$.time.LocalDate>, java.io.Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.LocalDateTime f47705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j$.time.ZoneOffset f47706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j$.time.ZoneId f47707c;

    private ZonedDateTime(j$.time.LocalDateTime localDateTime, j$.time.ZoneId zoneId, j$.time.ZoneOffset zoneOffset) {
        this.f47705a = localDateTime;
        this.f47706b = zoneOffset;
        this.f47707c = zoneId;
    }

    private static j$.time.ZonedDateTime M(long j6, int i6, j$.time.ZoneId zoneId) {
        j$.time.ZoneOffset zoneOffsetD = zoneId.getRules().d(j$.time.Instant.ofEpochSecond(j6, i6));
        return new j$.time.ZonedDateTime(j$.time.LocalDateTime.T(j6, i6, zoneOffsetD), zoneId, zoneOffsetD);
    }

    public static j$.time.ZonedDateTime N(j$.time.Instant instant, j$.time.ZoneId zoneId) {
        j$.util.Objects.requireNonNull(instant, "instant");
        j$.util.Objects.requireNonNull(zoneId, "zone");
        return M(instant.getEpochSecond(), instant.O(), zoneId);
    }

    public static j$.time.ZonedDateTime O(j$.time.LocalDateTime localDateTime, j$.time.ZoneId zoneId, j$.time.ZoneOffset zoneOffset) {
        java.lang.Object objRequireNonNull;
        j$.util.Objects.requireNonNull(localDateTime, "localDateTime");
        j$.util.Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof j$.time.ZoneOffset) {
            return new j$.time.ZonedDateTime(localDateTime, zoneId, (j$.time.ZoneOffset) zoneId);
        }
        j$.time.zone.ZoneRules rules = zoneId.getRules();
        java.util.List listG = rules.g(localDateTime);
        if (listG.size() != 1) {
            if (listG.size() == 0) {
                j$.time.zone.b bVarF = rules.f(localDateTime);
                localDateTime = localDateTime.W(bVarF.q().u());
                zoneOffset = bVarF.u();
            } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
                objRequireNonNull = j$.util.Objects.requireNonNull((j$.time.ZoneOffset) listG.get(0), "offset");
            }
            return new j$.time.ZonedDateTime(localDateTime, zoneId, zoneOffset);
        }
        objRequireNonNull = listG.get(0);
        zoneOffset = (j$.time.ZoneOffset) objRequireNonNull;
        return new j$.time.ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    static j$.time.ZonedDateTime Q(java.io.ObjectInput objectInput) throws java.io.IOException {
        j$.time.LocalDateTime localDateTime = j$.time.LocalDateTime.MIN;
        j$.time.LocalDate localDate = j$.time.LocalDate.MIN;
        j$.time.LocalDateTime localDateTimeOf = j$.time.LocalDateTime.of(j$.time.LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j$.time.LocalTime.X(objectInput));
        j$.time.ZoneOffset zoneOffsetT = j$.time.ZoneOffset.T(objectInput);
        j$.time.ZoneId zoneId = (j$.time.ZoneId) j$.time.n.a(objectInput);
        j$.util.Objects.requireNonNull(localDateTimeOf, "localDateTime");
        j$.util.Objects.requireNonNull(zoneOffsetT, "offset");
        j$.util.Objects.requireNonNull(zoneId, "zone");
        if (!(zoneId instanceof j$.time.ZoneOffset) || zoneOffsetT.equals(zoneId)) {
            return new j$.time.ZonedDateTime(localDateTimeOf, zoneId, zoneOffsetT);
        }
        throw new java.lang.IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    private j$.time.ZonedDateTime R(j$.time.LocalDateTime localDateTime) {
        return O(localDateTime, this.f47707c, this.f47706b);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.n((byte) 6, this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.ChronoLocalDateTime A() {
        return this.f47705a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long L() {
        return j$.time.chrono.AbstractC6701g.o(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final j$.time.ZonedDateTime d(long j6, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return (j$.time.ZonedDateTime) tVar.n(this, j6);
        }
        j$.time.temporal.b bVar = (j$.time.temporal.b) tVar;
        int iCompareTo = bVar.compareTo(j$.time.temporal.b.DAYS);
        j$.time.LocalDateTime localDateTime = this.f47705a;
        if (iCompareTo >= 0 && bVar != j$.time.temporal.b.FOREVER) {
            return R(localDateTime.d(j6, tVar));
        }
        j$.time.LocalDateTime localDateTimeD = localDateTime.d(j6, tVar);
        j$.util.Objects.requireNonNull(localDateTimeD, "localDateTime");
        j$.time.ZoneOffset zoneOffset = this.f47706b;
        j$.util.Objects.requireNonNull(zoneOffset, "offset");
        j$.time.ZoneId zoneId = this.f47707c;
        j$.util.Objects.requireNonNull(zoneId, "zone");
        if (zoneId.getRules().g(localDateTimeD).contains(zoneOffset)) {
            return new j$.time.ZonedDateTime(localDateTimeD, zoneId, zoneOffset);
        }
        localDateTimeD.getClass();
        return M(j$.time.chrono.AbstractC6701g.n(localDateTimeD, zoneOffset), localDateTimeD.O(), zoneId);
    }

    public final j$.time.LocalDateTime S() {
        return this.f47705a;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final j$.time.ZonedDateTime p(j$.time.LocalDate localDate) {
        return R(j$.time.LocalDateTime.of(localDate, this.f47705a.toLocalTime()));
    }

    final void U(java.io.DataOutput dataOutput) {
        this.f47705a.c0(dataOutput);
        this.f47706b.U(dataOutput);
        this.f47707c.P(dataOutput);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.Chronology a() {
        return ((j$.time.LocalDate) b()).a();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j6, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return (j$.time.ZonedDateTime) sVar.x(this, j6);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
        int i6 = j$.time.t.f47921a[aVar.ordinal()];
        j$.time.ZoneId zoneId = this.f47707c;
        j$.time.LocalDateTime localDateTime = this.f47705a;
        if (i6 == 1) {
            return M(j6, localDateTime.O(), zoneId);
        }
        if (i6 != 2) {
            return R(localDateTime.c(j6, sVar));
        }
        j$.time.ZoneOffset zoneOffsetOfTotalSeconds = j$.time.ZoneOffset.ofTotalSeconds(aVar.N(j6));
        return (zoneOffsetOfTotalSeconds.equals(this.f47706b) || !zoneId.getRules().g(localDateTime).contains(zoneOffsetOfTotalSeconds)) ? this : new j$.time.ZonedDateTime(localDateTime, zoneId, zoneOffsetOfTotalSeconds);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.s sVar) {
        return (sVar instanceof j$.time.temporal.a) || (sVar != null && sVar.u(this));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j$.time.ZonedDateTime)) {
            return false;
        }
        j$.time.ZonedDateTime zonedDateTime = (j$.time.ZonedDateTime) obj;
        return this.f47705a.equals(zonedDateTime.f47705a) && this.f47706b.equals(zonedDateTime.f47706b) && this.f47707c.equals(zonedDateTime.f47707c);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m f(long j6, j$.time.temporal.t tVar) {
        return j6 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j6, tVar);
    }

    public final int hashCode() {
        return (this.f47705a.hashCode() ^ this.f47706b.hashCode()) ^ java.lang.Integer.rotateLeft(this.f47707c.hashCode(), 3);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.ZoneOffset i() {
        return this.f47706b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.ChronoZonedDateTime j(j$.time.ZoneId zoneId) {
        j$.util.Objects.requireNonNull(zoneId, "zone");
        return this.f47707c.equals(zoneId) ? this : O(this.f47705a, zoneId, this.f47706b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int n(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return j$.time.chrono.AbstractC6701g.e(this, sVar);
        }
        int i6 = j$.time.t.f47921a[((j$.time.temporal.a) sVar).ordinal()];
        if (i6 != 1) {
            return i6 != 2 ? this.f47705a.n(sVar) : this.f47706b.getTotalSeconds();
        }
        throw new j$.time.temporal.u("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return (sVar == j$.time.temporal.a.INSTANT_SECONDS || sVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) sVar).n() : this.f47705a.q(sVar);
        }
        return sVar.y(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.ZoneId s() {
        return this.f47707c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.Instant toInstant() {
        return j$.time.Instant.ofEpochSecond(L(), toLocalTime().getNano());
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public j$.time.LocalDate b() {
        return this.f47705a.b();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.LocalTime toLocalTime() {
        return this.f47705a.toLocalTime();
    }

    public final java.lang.String toString() {
        java.lang.String string = this.f47705a.toString();
        j$.time.ZoneOffset zoneOffset = this.f47706b;
        java.lang.String str = string + zoneOffset.toString();
        j$.time.ZoneId zoneId = this.f47707c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar.q(this);
        }
        int i6 = j$.time.t.f47921a[((j$.time.temporal.a) sVar).ordinal()];
        if (i6 != 1) {
            return i6 != 2 ? this.f47705a.u(sVar) : this.f47706b.getTotalSeconds();
        }
        return j$.time.chrono.AbstractC6701g.o(this);
    }

    public j$.time.ZonedDateTime withDayOfMonth(int i6) {
        return R(this.f47705a.b0(i6));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object x(j$.time.temporal.TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.n.f() ? b() : j$.time.chrono.AbstractC6701g.l(this, temporalQuery);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ int compareTo(j$.time.chrono.ChronoZonedDateTime chronoZonedDateTime) {
        return j$.time.chrono.AbstractC6701g.d(this, chronoZonedDateTime);
    }
}
