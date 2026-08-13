package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class CallableC6456r3 implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.E f42611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.X2 f42613c;

    CallableC6456r3(com.google.android.gms.measurement.internal.X2 x6, com.google.android.gms.measurement.internal.E e6, java.lang.String str) {
        this.f42611a = e6;
        this.f42612b = str;
        this.f42613c = x6;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() {
        this.f42613c.f42198C.z0();
        return this.f42613c.f42198C.u0().y(this.f42611a, this.f42612b);
    }
}
