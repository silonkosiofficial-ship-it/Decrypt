package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.String f41689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.lang.String f41690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f41691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f41692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f41693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f41694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f41695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final java.lang.Long f41696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final java.lang.Long f41697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final java.lang.Long f41698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final java.lang.Boolean f41699k;

    A(java.lang.String str, java.lang.String str2, long j6, long j10, long j11, long j12, long j13, java.lang.Long l6, java.lang.Long l10, java.lang.Long l11, java.lang.Boolean bool) {
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.f(str2);
        Q3.AbstractC1477p.a(j6 >= 0);
        Q3.AbstractC1477p.a(j10 >= 0);
        Q3.AbstractC1477p.a(j11 >= 0);
        Q3.AbstractC1477p.a(j13 >= 0);
        this.f41689a = str;
        this.f41690b = str2;
        this.f41691c = j6;
        this.f41692d = j10;
        this.f41693e = j11;
        this.f41694f = j12;
        this.f41695g = j13;
        this.f41696h = l6;
        this.f41697i = l10;
        this.f41698j = l11;
        this.f41699k = bool;
    }

    A(java.lang.String str, java.lang.String str2, long j6, long j10, long j11, long j12, java.lang.Long l6, java.lang.Long l10, java.lang.Long l11, java.lang.Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j11, 0L, null, null, null, null);
    }

    final com.google.android.gms.measurement.internal.A a(long j6) {
        return new com.google.android.gms.measurement.internal.A(this.f41689a, this.f41690b, this.f41691c, this.f41692d, this.f41693e, j6, this.f41695g, this.f41696h, this.f41697i, this.f41698j, this.f41699k);
    }

    final com.google.android.gms.measurement.internal.A b(long j6, long j10) {
        return new com.google.android.gms.measurement.internal.A(this.f41689a, this.f41690b, this.f41691c, this.f41692d, this.f41693e, this.f41694f, j6, java.lang.Long.valueOf(j10), this.f41697i, this.f41698j, this.f41699k);
    }

    final com.google.android.gms.measurement.internal.A c(java.lang.Long l6, java.lang.Long l10, java.lang.Boolean bool) {
        return new com.google.android.gms.measurement.internal.A(this.f41689a, this.f41690b, this.f41691c, this.f41692d, this.f41693e, this.f41694f, this.f41695g, this.f41696h, l6, l10, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
