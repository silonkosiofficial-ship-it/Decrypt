package j$.time.chrono;

/* JADX INFO: loaded from: classes4.dex */
final class j implements j$.time.chrono.ChronoZonedDateTime, java.io.Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient j$.time.chrono.C6699e f47736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient j$.time.ZoneOffset f47737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient j$.time.ZoneId f47738c;

    private j(j$.time.ZoneId zoneId, j$.time.ZoneOffset zoneOffset, j$.time.chrono.C6699e c6699e) {
        this.f47736a = (j$.time.chrono.C6699e) j$.util.Objects.requireNonNull(c6699e, "dateTime");
        this.f47737b = (j$.time.ZoneOffset) j$.util.Objects.requireNonNull(zoneOffset, "offset");
        this.f47738c = (j$.time.ZoneId) j$.util.Objects.requireNonNull(zoneId, "zone");
    }

    static j$.time.chrono.j M(j$.time.chrono.Chronology chronology, j$.time.temporal.m mVar) {
        j$.time.chrono.j jVar = (j$.time.chrono.j) mVar;
        if (chronology.equals(jVar.a())) {
            return jVar;
        }
        throw new java.lang.ClassCastException("Chronology mismatch, required: " + chronology.getId() + ", actual: " + jVar.a().getId());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    static j$.time.chrono.ChronoZonedDateTime O(j$.time.ZoneId zoneId, j$.time.ZoneOffset zoneOffset, j$.time.chrono.C6699e c6699e) {
        j$.util.Objects.requireNonNull(c6699e, "localDateTime");
        j$.util.Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof j$.time.ZoneOffset) {
            return new j$.time.chrono.j(zoneId, (j$.time.ZoneOffset) zoneId, c6699e);
        }
        j$.time.zone.ZoneRules rules = zoneId.getRules();
        j$.time.LocalDateTime localDateTimeN = j$.time.LocalDateTime.N(c6699e);
        java.util.List listG = rules.g(localDateTimeN);
        if (listG.size() == 1) {
            zoneOffset = (j$.time.ZoneOffset) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = rules.f(localDateTimeN);
            c6699e = c6699e.Q(bVarF.q().u());
            zoneOffset = bVarF.u();
        } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
            zoneOffset = (j$.time.ZoneOffset) listG.get(0);
        }
        j$.util.Objects.requireNonNull(zoneOffset, "offset");
        return new j$.time.chrono.j(zoneId, zoneOffset, c6699e);
    }

    static j$.time.chrono.j P(j$.time.chrono.Chronology chronology, j$.time.Instant instant, j$.time.ZoneId zoneId) {
        j$.time.ZoneOffset zoneOffsetD = zoneId.getRules().d(instant);
        j$.util.Objects.requireNonNull(zoneOffsetD, "offset");
        return new j$.time.chrono.j(zoneId, zoneOffsetD, (j$.time.chrono.C6699e) chronology.r(j$.time.LocalDateTime.T(instant.getEpochSecond(), instant.O(), zoneOffsetD)));
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.chrono.C((byte) 3, this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.ChronoLocalDateTime A() {
        return this.f47736a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long L() {
        return j$.time.chrono.AbstractC6701g.o(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final j$.time.chrono.ChronoZonedDateTime f(long j6, j$.time.temporal.t tVar) {
        return M(a(), j$.time.temporal.n.b(this, j6, tVar));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final j$.time.chrono.ChronoZonedDateTime d(long j6, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return M(a(), tVar.n(this, j6));
        }
        return M(a(), this.f47736a.d(j6, tVar).y(this));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.Chronology a() {
        return b().a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.ChronoLocalDate b() {
        return ((j$.time.chrono.C6699e) A()).b();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j6, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return M(a(), sVar.x(this, j6));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
        int i6 = j$.time.chrono.i.f47735a[aVar.ordinal()];
        if (i6 == 1) {
            return d(j6 - j$.time.chrono.AbstractC6701g.o(this), j$.time.temporal.b.SECONDS);
        }
        j$.time.ZoneId zoneId = this.f47738c;
        j$.time.chrono.C6699e c6699e = this.f47736a;
        if (i6 != 2) {
            return O(zoneId, this.f47737b, c6699e.c(j6, sVar));
        }
        j$.time.ZoneOffset zoneOffsetOfTotalSeconds = j$.time.ZoneOffset.ofTotalSeconds(aVar.N(j6));
        c6699e.getClass();
        return P(a(), j$.time.Instant.ofEpochSecond(j$.time.chrono.AbstractC6701g.n(c6699e, zoneOffsetOfTotalSeconds), c6699e.toLocalTime().getNano()), zoneId);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.s sVar) {
        return (sVar instanceof j$.time.temporal.a) || (sVar != null && sVar.u(this));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j$.time.chrono.ChronoZonedDateTime) && j$.time.chrono.AbstractC6701g.d(this, (j$.time.chrono.ChronoZonedDateTime) obj) == 0;
    }

    public final int hashCode() {
        return (this.f47736a.hashCode() ^ this.f47737b.hashCode()) ^ java.lang.Integer.rotateLeft(this.f47738c.hashCode(), 3);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.ZoneOffset i() {
        return this.f47737b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.ChronoZonedDateTime j(j$.time.ZoneId zoneId) {
        return O(zoneId, this.f47737b, this.f47736a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int n(j$.time.temporal.s sVar) {
        return j$.time.chrono.AbstractC6701g.e(this, sVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(j$.time.LocalDate localDate) {
        return M(a(), localDate.y(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return (sVar == j$.time.temporal.a.INSTANT_SECONDS || sVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) sVar).n() : ((j$.time.chrono.C6699e) A()).q(sVar);
        }
        return sVar.y(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.ZoneId s() {
        return this.f47738c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.Instant toInstant() {
        return j$.time.Instant.ofEpochSecond(L(), toLocalTime().getNano());
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.LocalTime toLocalTime() {
        return ((j$.time.chrono.C6699e) A()).toLocalTime();
    }

    public final java.lang.String toString() {
        java.lang.String string = this.f47736a.toString();
        j$.time.ZoneOffset zoneOffset = this.f47737b;
        java.lang.String str = string + zoneOffset.toString();
        j$.time.ZoneId zoneId = this.f47738c;
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
        int i6 = j$.time.chrono.AbstractC6702h.f47734a[((j$.time.temporal.a) sVar).ordinal()];
        if (i6 != 1) {
            return i6 != 2 ? ((j$.time.chrono.C6699e) A()).u(sVar) : i().getTotalSeconds();
        }
        return L();
    }

    final void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        objectOutput.writeObject(this.f47736a);
        objectOutput.writeObject(this.f47737b);
        objectOutput.writeObject(this.f47738c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ java.lang.Object x(j$.time.temporal.TemporalQuery temporalQuery) {
        return j$.time.chrono.AbstractC6701g.l(this, temporalQuery);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ int compareTo(j$.time.chrono.ChronoZonedDateTime chronoZonedDateTime) {
        return j$.time.chrono.AbstractC6701g.d(this, chronoZonedDateTime);
    }
}
