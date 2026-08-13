package j$.time;

/* JADX INFO: loaded from: classes4.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.o, j$.time.chrono.ChronoLocalDateTime<j$.time.LocalDate>, java.io.Serializable {
    private static final long serialVersionUID = 6207766400415563566L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.LocalDate f47687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j$.time.LocalTime f47688b;
    public static final j$.time.LocalDateTime MIN = of(j$.time.LocalDate.MIN, j$.time.LocalTime.MIN);
    public static final j$.time.LocalDateTime MAX = of(j$.time.LocalDate.MAX, j$.time.LocalTime.MAX);

    private LocalDateTime(j$.time.LocalDate localDate, j$.time.LocalTime localTime) {
        this.f47687a = localDate;
        this.f47688b = localTime;
    }

    private int M(j$.time.LocalDateTime localDateTime) {
        int iM = this.f47687a.M(localDateTime.b());
        return iM == 0 ? this.f47688b.compareTo(localDateTime.toLocalTime()) : iM;
    }

    public static j$.time.LocalDateTime N(j$.time.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof j$.time.LocalDateTime) {
            return (j$.time.LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof j$.time.ZonedDateTime) {
            return ((j$.time.ZonedDateTime) temporalAccessor).S();
        }
        if (temporalAccessor instanceof j$.time.OffsetDateTime) {
            return ((j$.time.OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new j$.time.LocalDateTime(j$.time.LocalDate.O(temporalAccessor), j$.time.LocalTime.N(temporalAccessor));
        } catch (j$.time.DateTimeException e6) {
            throw new j$.time.DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e6);
        }
    }

    public static j$.time.LocalDateTime S(int i6) {
        return new j$.time.LocalDateTime(j$.time.LocalDate.of(i6, 12, 31), j$.time.LocalTime.P(0));
    }

    public static j$.time.LocalDateTime T(long j6, int i6, j$.time.ZoneOffset zoneOffset) {
        j$.util.Objects.requireNonNull(zoneOffset, "offset");
        long j10 = i6;
        j$.time.temporal.a.NANO_OF_SECOND.O(j10);
        long totalSeconds = j6 + ((long) zoneOffset.getTotalSeconds());
        long j11 = 86400;
        return new j$.time.LocalDateTime(j$.time.LocalDate.V(j$.com.android.tools.r8.a.l(totalSeconds, j11)), j$.time.LocalTime.Q((((long) ((int) j$.com.android.tools.r8.a.k(totalSeconds, j11))) * 1000000000) + j10));
    }

    private j$.time.LocalDateTime X(j$.time.LocalDate localDate, long j6, long j10, long j11, long j12) {
        long j13 = j6 | j10 | j11 | j12;
        j$.time.LocalTime localTimeQ = this.f47688b;
        if (j13 == 0) {
            return a0(localDate, localTimeQ);
        }
        long j14 = j6 / 24;
        long j15 = j14 + (j10 / 1440) + (j11 / 86400) + (j12 / 86400000000000L);
        long j16 = 1;
        long j17 = ((j6 % 24) * 3600000000000L) + ((j10 % 1440) * 60000000000L) + ((j11 % 86400) * 1000000000) + (j12 % 86400000000000L);
        long jY = localTimeQ.Y();
        long j18 = (j17 * j16) + jY;
        long jL = j$.com.android.tools.r8.a.l(j18, 86400000000000L) + (j15 * j16);
        long jK = j$.com.android.tools.r8.a.k(j18, 86400000000000L);
        if (jK != jY) {
            localTimeQ = j$.time.LocalTime.Q(jK);
        }
        return a0(localDate.Y(jL), localTimeQ);
    }

    private j$.time.LocalDateTime a0(j$.time.LocalDate localDate, j$.time.LocalTime localTime) {
        return (this.f47687a == localDate && this.f47688b == localTime) ? this : new j$.time.LocalDateTime(localDate, localTime);
    }

    public static j$.time.LocalDateTime of(int i6, int i10, int i11, int i12, int i13, int i14, int i15) {
        return new j$.time.LocalDateTime(j$.time.LocalDate.of(i6, i10, i11), j$.time.LocalTime.of(i12, i13, i14, i15));
    }

    public static j$.time.LocalDateTime of(j$.time.LocalDate localDate, j$.time.LocalTime localTime) {
        j$.util.Objects.requireNonNull(localDate, "date");
        j$.util.Objects.requireNonNull(localTime, "time");
        return new j$.time.LocalDateTime(localDate, localTime);
    }

    public static j$.time.LocalDateTime ofInstant(j$.time.Instant instant, j$.time.ZoneId zoneId) {
        j$.util.Objects.requireNonNull(instant, "instant");
        j$.util.Objects.requireNonNull(zoneId, "zone");
        return T(instant.getEpochSecond(), instant.O(), zoneId.getRules().d(instant));
    }

    public static j$.time.LocalDateTime parse(java.lang.CharSequence charSequence) {
        j$.time.format.DateTimeFormatter dateTimeFormatter = j$.time.format.DateTimeFormatter.f47794i;
        j$.util.Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (j$.time.LocalDateTime) dateTimeFormatter.parse(charSequence, new j$.time.d(1));
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.n((byte) 5, this);
    }

    public final int O() {
        return this.f47688b.getNano();
    }

    public final int P() {
        return this.f47688b.getSecond();
    }

    public final boolean Q(j$.time.LocalDateTime localDateTime) {
        if (localDateTime instanceof j$.time.LocalDateTime) {
            return M(localDateTime) > 0;
        }
        long epochDay = b().toEpochDay();
        long epochDay2 = localDateTime.b().toEpochDay();
        return epochDay > epochDay2 || (epochDay == epochDay2 && toLocalTime().Y() > localDateTime.toLocalTime().Y());
    }

    public final boolean R(j$.time.LocalDateTime localDateTime) {
        if (localDateTime instanceof j$.time.LocalDateTime) {
            return M(localDateTime) < 0;
        }
        long epochDay = b().toEpochDay();
        long epochDay2 = localDateTime.b().toEpochDay();
        return epochDay < epochDay2 || (epochDay == epochDay2 && toLocalTime().Y() < localDateTime.toLocalTime().Y());
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final j$.time.LocalDateTime d(long j6, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return (j$.time.LocalDateTime) tVar.n(this, j6);
        }
        switch (j$.time.f.f47778a[((j$.time.temporal.b) tVar).ordinal()]) {
            case 1:
                return X(this.f47687a, 0L, 0L, 0L, j6);
            case 2:
                j$.time.LocalDateTime localDateTimeV = V(j6 / 86400000000L);
                return localDateTimeV.X(localDateTimeV.f47687a, 0L, 0L, 0L, (j6 % 86400000000L) * 1000);
            case 3:
                j$.time.LocalDateTime localDateTimeV2 = V(j6 / 86400000);
                return localDateTimeV2.X(localDateTimeV2.f47687a, 0L, 0L, 0L, (j6 % 86400000) * 1000000);
            case 4:
                return W(j6);
            case 5:
                return X(this.f47687a, 0L, j6, 0L, 0L);
            case 6:
                return X(this.f47687a, j6, 0L, 0L, 0L);
            case 7:
                j$.time.LocalDateTime localDateTimeV3 = V(j6 / 256);
                return localDateTimeV3.X(localDateTimeV3.f47687a, (j6 % 256) * 12, 0L, 0L, 0L);
            default:
                return a0(this.f47687a.d(j6, tVar), this.f47688b);
        }
    }

    public final j$.time.LocalDateTime V(long j6) {
        return a0(this.f47687a.Y(j6), this.f47688b);
    }

    public final j$.time.LocalDateTime W(long j6) {
        return X(this.f47687a, 0L, 0L, j6, 0L);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final j$.time.LocalDateTime c(long j6, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return (j$.time.LocalDateTime) sVar.x(this, j6);
        }
        boolean zP = ((j$.time.temporal.a) sVar).P();
        j$.time.LocalTime localTime = this.f47688b;
        j$.time.LocalDate localDate = this.f47687a;
        return zP ? a0(localDate, localTime.c(j6, sVar)) : a0(localDate.c(j6, sVar), localTime);
    }

    public final j$.time.LocalDateTime Z(j$.time.LocalDate localDate) {
        return a0(localDate, this.f47688b);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.Chronology a() {
        return ((j$.time.LocalDate) b()).a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: atZone, reason: merged with bridge method [inline-methods] */
    public j$.time.ZonedDateTime m(j$.time.ZoneId zoneId) {
        return j$.time.ZonedDateTime.O(this, zoneId, null);
    }

    public final j$.time.LocalDateTime b0(int i6) {
        return a0(this.f47687a.e0(i6), this.f47688b);
    }

    final void c0(java.io.DataOutput dataOutput) {
        this.f47687a.h0(dataOutput);
        this.f47688b.b0(dataOutput);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(j$.time.chrono.ChronoLocalDateTime<?> chronoLocalDateTime) {
        return chronoLocalDateTime instanceof j$.time.LocalDateTime ? M((j$.time.LocalDateTime) chronoLocalDateTime) : j$.time.chrono.AbstractC6701g.c(this, chronoLocalDateTime);
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
        if (!(obj instanceof j$.time.LocalDateTime)) {
            return false;
        }
        j$.time.LocalDateTime localDateTime = (j$.time.LocalDateTime) obj;
        return this.f47687a.equals(localDateTime.f47687a) && this.f47688b.equals(localDateTime.f47688b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m f(long j6, j$.time.temporal.t tVar) {
        return j6 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j6, tVar);
    }

    public java.lang.String format(j$.time.format.DateTimeFormatter dateTimeFormatter) {
        j$.util.Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    public int getDayOfMonth() {
        return this.f47687a.getDayOfMonth();
    }

    public j$.time.Month getMonth() {
        return this.f47687a.getMonth();
    }

    public int getYear() {
        return this.f47687a.getYear();
    }

    public int hashCode() {
        return this.f47687a.hashCode() ^ this.f47688b.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int n(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) sVar).P() ? this.f47688b.n(sVar) : this.f47687a.n(sVar);
        }
        return j$.time.temporal.n.a(this, sVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(j$.time.LocalDate localDate) {
        return a0(localDate, this.f47688b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar.y(this);
        }
        if (!((j$.time.temporal.a) sVar).P()) {
            return this.f47687a.q(sVar);
        }
        j$.time.LocalTime localTime = this.f47688b;
        localTime.getClass();
        return j$.time.temporal.n.d(localTime, sVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long toEpochSecond(j$.time.ZoneOffset zoneOffset) {
        return j$.time.chrono.AbstractC6701g.n(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public j$.time.LocalDate b() {
        return this.f47687a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public j$.time.LocalTime toLocalTime() {
        return this.f47688b;
    }

    public java.lang.String toString() {
        return this.f47687a.toString() + "T" + this.f47688b.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) sVar).P() ? this.f47688b.u(sVar) : this.f47687a.u(sVar);
        }
        return sVar.q(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object x(j$.time.temporal.TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.n.f() ? this.f47687a : j$.time.chrono.AbstractC6701g.k(this, temporalQuery);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m y(j$.time.temporal.m mVar) {
        return mVar.c(b().toEpochDay(), j$.time.temporal.a.EPOCH_DAY).c(toLocalTime().Y(), j$.time.temporal.a.NANO_OF_DAY);
    }
}
