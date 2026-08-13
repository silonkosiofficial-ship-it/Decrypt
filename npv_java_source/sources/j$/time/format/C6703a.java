package j$.time.format;

/* JADX INFO: renamed from: j$.time.format.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6703a implements j$.time.temporal.TemporalQuery {
    @Override // j$.time.temporal.TemporalQuery
    public final java.lang.Object queryFrom(j$.time.temporal.TemporalAccessor temporalAccessor) {
        int i6 = j$.time.format.DateTimeFormatterBuilder.f47805j;
        j$.time.ZoneId zoneId = (j$.time.ZoneId) temporalAccessor.x(j$.time.temporal.n.l());
        if (zoneId == null || (zoneId instanceof j$.time.ZoneOffset)) {
            return null;
        }
        return zoneId;
    }
}
