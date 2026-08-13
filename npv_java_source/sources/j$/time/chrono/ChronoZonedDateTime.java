package j$.time.chrono;

/* JADX INFO: loaded from: classes4.dex */
public interface ChronoZonedDateTime<D extends j$.time.chrono.ChronoLocalDate> extends j$.time.temporal.m, java.lang.Comparable<j$.time.chrono.ChronoZonedDateTime<?>> {
    j$.time.chrono.ChronoLocalDateTime A();

    long L();

    j$.time.chrono.Chronology a();

    j$.time.chrono.ChronoLocalDate b();

    j$.time.ZoneOffset i();

    j$.time.chrono.ChronoZonedDateTime j(j$.time.ZoneId zoneId);

    j$.time.ZoneId s();

    j$.time.Instant toInstant();

    j$.time.LocalTime toLocalTime();
}
