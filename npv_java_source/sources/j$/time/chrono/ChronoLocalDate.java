package j$.time.chrono;

/* JADX INFO: loaded from: classes4.dex */
public interface ChronoLocalDate extends j$.time.temporal.m, j$.time.temporal.o, java.lang.Comparable<j$.time.chrono.ChronoLocalDate> {
    j$.time.chrono.ChronoLocalDate C(j$.time.temporal.r rVar);

    boolean D();

    int I();

    j$.time.chrono.Chronology a();

    @Override // j$.time.temporal.m
    j$.time.chrono.ChronoLocalDate c(long j6, j$.time.temporal.s sVar);

    int compareTo(j$.time.chrono.ChronoLocalDate chronoLocalDate);

    @Override // j$.time.temporal.m
    j$.time.chrono.ChronoLocalDate d(long j6, j$.time.temporal.t tVar);

    @Override // j$.time.temporal.TemporalAccessor
    boolean e(j$.time.temporal.s sVar);

    boolean equals(java.lang.Object obj);

    @Override // j$.time.temporal.m
    j$.time.chrono.ChronoLocalDate f(long j6, j$.time.temporal.t tVar);

    int hashCode();

    /* JADX INFO: renamed from: k */
    j$.time.chrono.ChronoLocalDate p(j$.time.temporal.o oVar);

    long toEpochDay();

    java.lang.String toString();

    j$.time.chrono.ChronoLocalDateTime w(j$.time.LocalTime localTime);

    j$.time.chrono.k z();
}
