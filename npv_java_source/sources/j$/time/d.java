package j$.time;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements j$.time.temporal.TemporalQuery {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47775a;

    public /* synthetic */ d(int i6) {
        this.f47775a = i6;
    }

    @Override // j$.time.temporal.TemporalQuery
    public final java.lang.Object queryFrom(j$.time.temporal.TemporalAccessor temporalAccessor) {
        switch (this.f47775a) {
            case 0:
                return j$.time.LocalDate.O(temporalAccessor);
            case 1:
                return j$.time.LocalDateTime.N(temporalAccessor);
            default:
                return j$.time.LocalTime.N(temporalAccessor);
        }
    }
}
