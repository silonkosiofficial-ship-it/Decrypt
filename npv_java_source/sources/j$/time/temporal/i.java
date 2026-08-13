package j$.time.temporal;

/* JADX INFO: loaded from: classes4.dex */
enum i implements j$.time.temporal.t {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f47939a;

    static {
        j$.time.Duration duration = j$.time.Duration.f47679c;
    }

    i(java.lang.String str) {
        this.f47939a = str;
    }

    @Override // j$.time.temporal.t
    public final j$.time.temporal.m n(j$.time.temporal.m mVar, long j6) {
        int i6 = j$.time.temporal.c.f47935a[ordinal()];
        if (i6 == 1) {
            j$.time.temporal.s sVar = j$.time.temporal.j.f47942c;
            return mVar.c(j$.com.android.tools.r8.a.g(mVar.n(sVar), j6), sVar);
        }
        if (i6 == 2) {
            return mVar.d(j6 / 4, j$.time.temporal.b.YEARS).d((j6 % 4) * 3, j$.time.temporal.b.MONTHS);
        }
        throw new java.lang.IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f47939a;
    }
}
