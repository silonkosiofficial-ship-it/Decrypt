package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class CallableC6498x3 implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.X2 f42699b;

    CallableC6498x3(com.google.android.gms.measurement.internal.X2 x6, java.lang.String str) {
        this.f42698a = str;
        this.f42699b = x6;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() {
        this.f42699b.f42198C.z0();
        return this.f42699b.f42198C.l0().Y0(this.f42698a);
    }
}
