package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
final class w implements j$.time.temporal.TemporalAccessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ j$.time.chrono.ChronoLocalDate f47886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.time.temporal.TemporalAccessor f47887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.time.chrono.Chronology f47888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.time.ZoneId f47889d;

    w(j$.time.chrono.ChronoLocalDate chronoLocalDate, j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.chrono.Chronology chronology, j$.time.ZoneId zoneId) {
        this.f47886a = chronoLocalDate;
        this.f47887b = temporalAccessor;
        this.f47888c = chronology;
        this.f47889d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.s sVar) {
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f47886a;
        return (chronoLocalDate == null || !sVar.M()) ? this.f47887b.e(sVar) : chronoLocalDate.e(sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int n(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.a(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f47886a;
        return (chronoLocalDate == null || !sVar.M()) ? this.f47887b.q(sVar) : chronoLocalDate.q(sVar);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2 = "";
        j$.time.chrono.Chronology chronology = this.f47888c;
        if (chronology != null) {
            str = " with chronology " + chronology;
        } else {
            str = "";
        }
        j$.time.ZoneId zoneId = this.f47889d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f47887b + str + str2;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f47886a;
        return (chronoLocalDate == null || !sVar.M()) ? this.f47887b.u(sVar) : chronoLocalDate.u(sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object x(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.e()) {
            return this.f47888c;
        }
        if (temporalQuery == j$.time.temporal.n.l()) {
            return this.f47889d;
        }
        return temporalQuery == j$.time.temporal.n.j() ? this.f47887b.x(temporalQuery) : temporalQuery.queryFrom(this);
    }
}
