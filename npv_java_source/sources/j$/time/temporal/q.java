package j$.time.temporal;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements j$.time.temporal.TemporalQuery, j$.time.temporal.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47958a;

    public /* synthetic */ q(int i6) {
        this.f47958a = i6;
    }

    @Override // j$.time.temporal.TemporalQuery
    public java.lang.Object queryFrom(j$.time.temporal.TemporalAccessor temporalAccessor) {
        switch (this.f47958a) {
            case 1:
                return (j$.time.ZoneId) temporalAccessor.x(j$.time.temporal.n.f47949a);
            case 2:
                return (j$.time.chrono.Chronology) temporalAccessor.x(j$.time.temporal.n.f47950b);
            case 3:
                return (j$.time.temporal.t) temporalAccessor.x(j$.time.temporal.n.f47951c);
            case 4:
                j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
                if (temporalAccessor.e(aVar)) {
                    return j$.time.ZoneOffset.ofTotalSeconds(temporalAccessor.n(aVar));
                }
                return null;
            case 5:
                j$.time.ZoneId zoneId = (j$.time.ZoneId) temporalAccessor.x(j$.time.temporal.n.f47949a);
                return zoneId != null ? zoneId : (j$.time.ZoneId) temporalAccessor.x(j$.time.temporal.n.f47952d);
            case 6:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.EPOCH_DAY;
                if (temporalAccessor.e(aVar2)) {
                    return j$.time.LocalDate.V(temporalAccessor.u(aVar2));
                }
                return null;
            default:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_DAY;
                if (temporalAccessor.e(aVar3)) {
                    return j$.time.LocalTime.Q(temporalAccessor.u(aVar3));
                }
                return null;
        }
    }

    public java.lang.String toString() {
        switch (this.f47958a) {
            case 1:
                return "ZoneId";
            case 2:
                return "Chronology";
            case 3:
                return "Precision";
            case 4:
                return "ZoneOffset";
            case 5:
                return "Zone";
            case 6:
                return "LocalDate";
            case 7:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    @Override // j$.time.temporal.o
    public j$.time.temporal.m y(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return mVar.c(mVar.q(aVar).d(), aVar);
    }
}
