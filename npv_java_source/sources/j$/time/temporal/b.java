package j$.time.temporal;

/* JADX INFO: loaded from: classes4.dex */
public enum b implements j$.time.temporal.t {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f47934a;

    static {
        j$.time.Duration duration = j$.time.Duration.f47679c;
        j$.time.Duration.y(Long.MAX_VALUE, 999999999L);
    }

    b(java.lang.String str) {
        this.f47934a = str;
    }

    @Override // j$.time.temporal.t
    public final j$.time.temporal.m n(j$.time.temporal.m mVar, long j6) {
        return mVar.d(j6, this);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f47934a;
    }
}
