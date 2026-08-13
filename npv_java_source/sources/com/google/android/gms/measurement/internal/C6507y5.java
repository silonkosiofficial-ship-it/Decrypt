package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6507y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V3.f f42716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f42717b;

    public C6507y5(V3.f fVar) {
        Q3.AbstractC1477p.l(fVar);
        this.f42716a = fVar;
    }

    public final void a() {
        this.f42717b = 0L;
    }

    public final boolean b(long j6) {
        return this.f42717b == 0 || this.f42716a.c() - this.f42717b >= 3600000;
    }

    public final void c() {
        this.f42717b = this.f42716a.c();
    }
}
