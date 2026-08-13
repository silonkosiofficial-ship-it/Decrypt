package j$.time.chrono;

/* JADX INFO: loaded from: classes4.dex */
public interface Chronology extends java.lang.Comparable<j$.time.chrono.Chronology> {

    /* JADX INFO: renamed from: j$.time.chrono.Chronology$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static j$.time.chrono.Chronology a(j$.time.temporal.TemporalAccessor temporalAccessor) {
            j$.util.Objects.requireNonNull(temporalAccessor, "temporal");
            java.lang.Object objRequireNonNull = (j$.time.chrono.Chronology) temporalAccessor.x(j$.time.temporal.n.e());
            j$.time.chrono.q qVar = j$.time.chrono.q.f47758e;
            if (objRequireNonNull == null) {
                objRequireNonNull = j$.util.Objects.requireNonNull(qVar, "defaultObj");
            }
            return (j$.time.chrono.Chronology) objRequireNonNull;
        }

        public static j$.time.chrono.Chronology ofLocale(java.util.Locale locale) {
            return j$.time.chrono.AbstractC6695a.x(locale);
        }
    }

    j$.time.chrono.ChronoLocalDate B(int i6, int i10, int i11);

    j$.time.chrono.ChronoLocalDate E(java.util.Map map, j$.time.format.C c6);

    j$.time.temporal.v F(j$.time.temporal.a aVar);

    j$.time.chrono.ChronoZonedDateTime G(j$.time.Instant instant, j$.time.ZoneId zoneId);

    java.util.List H();

    boolean J(long j6);

    j$.time.chrono.k K(int i6);

    boolean equals(java.lang.Object obj);

    /* JADX INFO: renamed from: g */
    int compareTo(j$.time.chrono.Chronology chronology);

    java.lang.String getId();

    int h(j$.time.chrono.k kVar, int i6);

    int hashCode();

    j$.time.chrono.ChronoLocalDate l(long j6);

    j$.time.chrono.ChronoLocalDate o(j$.time.temporal.TemporalAccessor temporalAccessor);

    j$.time.chrono.ChronoLocalDateTime r(j$.time.LocalDateTime localDateTime);

    java.lang.String t();

    java.lang.String toString();

    j$.time.chrono.ChronoLocalDate v(int i6, int i10);
}
