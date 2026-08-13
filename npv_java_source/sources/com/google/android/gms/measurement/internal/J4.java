package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class J4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42002C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ boolean f42003D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.Y5 f42004E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F4 f42005F;

    J4(com.google.android.gms.measurement.internal.F4 f6, com.google.android.gms.measurement.internal.M5 m6, boolean z6, com.google.android.gms.measurement.internal.Y5 y6) {
        this.f42002C = m6;
        this.f42003D = z6;
        this.f42004E = y6;
        this.f42005F = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p085i4.InterfaceC6654f interfaceC6654f = this.f42005F.f41803d;
        if (interfaceC6654f == null) {
            this.f42005F.j().G().a("Discarding data. Failed to set user property");
            return;
        }
        Q3.AbstractC1477p.l(this.f42002C);
        this.f42005F.O(interfaceC6654f, this.f42003D ? null : this.f42004E, this.f42002C);
        this.f42005F.m0();
    }
}
