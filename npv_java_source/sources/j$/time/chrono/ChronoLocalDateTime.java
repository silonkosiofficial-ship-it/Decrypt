package j$.time.chrono;

/* JADX INFO: loaded from: classes4.dex */
public interface ChronoLocalDateTime<D extends j$.time.chrono.ChronoLocalDate> extends j$.time.temporal.m, j$.time.temporal.o, java.lang.Comparable<j$.time.chrono.ChronoLocalDateTime<?>> {
    j$.time.chrono.Chronology a();

    j$.time.chrono.ChronoLocalDate b();

    int compareTo(j$.time.chrono.ChronoLocalDateTime chronoLocalDateTime);

    j$.time.chrono.ChronoZonedDateTime m(j$.time.ZoneId zoneId);

    long toEpochSecond(j$.time.ZoneOffset zoneOffset);

    j$.time.LocalTime toLocalTime();
}
