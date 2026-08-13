package j$.time.temporal;

/* JADX INFO: loaded from: classes4.dex */
public enum a implements j$.time.temporal.s {
    NANO_OF_SECOND("NanoOfSecond", j$.time.temporal.v.j(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", j$.time.temporal.v.j(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", j$.time.temporal.v.j(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", j$.time.temporal.v.j(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", j$.time.temporal.v.j(0, 999)),
    MILLI_OF_DAY("MilliOfDay", j$.time.temporal.v.j(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", j$.time.temporal.v.j(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", j$.time.temporal.v.j(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", j$.time.temporal.v.j(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", j$.time.temporal.v.j(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", j$.time.temporal.v.j(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", j$.time.temporal.v.j(1, 12)),
    HOUR_OF_DAY("HourOfDay", j$.time.temporal.v.j(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", j$.time.temporal.v.j(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", j$.time.temporal.v.j(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", j$.time.temporal.v.j(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", j$.time.temporal.v.j(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", j$.time.temporal.v.j(1, 7)),
    DAY_OF_MONTH("DayOfMonth", j$.time.temporal.v.k(1, 28, 31), 0),
    DAY_OF_YEAR("DayOfYear", j$.time.temporal.v.k(1, 365, 366)),
    EPOCH_DAY("EpochDay", j$.time.temporal.v.j(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", j$.time.temporal.v.k(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", j$.time.temporal.v.j(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", j$.time.temporal.v.j(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", j$.time.temporal.v.j(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", j$.time.temporal.v.k(1, 999999999, 1000000000)),
    YEAR("Year", j$.time.temporal.v.j(-999999999, 999999999), 0),
    ERA("Era", j$.time.temporal.v.j(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", j$.time.temporal.v.j(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", j$.time.temporal.v.j(-64800, 64800));


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f47931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j$.time.temporal.v f47932b;

    static {
        j$.time.temporal.b bVar = j$.time.temporal.b.NANOS;
    }

    a(java.lang.String str, j$.time.temporal.v vVar) {
        this.f47931a = str;
        this.f47932b = vVar;
    }

    a(java.lang.String str, j$.time.temporal.v vVar, int i6) {
        this.f47931a = str;
        this.f47932b = vVar;
    }

    @Override // j$.time.temporal.s
    public final boolean M() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final int N(long j6) {
        return this.f47932b.a(j6, this);
    }

    public final void O(long j6) {
        this.f47932b.b(j6, this);
    }

    public final boolean P() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // j$.time.temporal.s
    public final j$.time.temporal.v n() {
        return this.f47932b;
    }

    @Override // j$.time.temporal.s
    public final /* synthetic */ j$.time.temporal.TemporalAccessor p(java.util.Map map, j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.format.C c6) {
        return null;
    }

    @Override // j$.time.temporal.s
    public final long q(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.u(this);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f47931a;
    }

    @Override // j$.time.temporal.s
    public final boolean u(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.e(this);
    }

    @Override // j$.time.temporal.s
    public final j$.time.temporal.m x(j$.time.temporal.m mVar, long j6) {
        return mVar.c(j6, this);
    }

    @Override // j$.time.temporal.s
    public final j$.time.temporal.v y(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.q(this);
    }
}
