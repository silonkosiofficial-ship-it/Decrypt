package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class CallableC6450q3 implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.X2 f42598b;

    CallableC6450q3(com.google.android.gms.measurement.internal.X2 x6, com.google.android.gms.measurement.internal.M5 m6) {
        this.f42597a = m6;
        this.f42598b = x6;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() {
        this.f42598b.f42198C.z0();
        return new p085i4.C6650b(this.f42598b.f42198C.e(this.f42597a.f42031C));
    }
}
