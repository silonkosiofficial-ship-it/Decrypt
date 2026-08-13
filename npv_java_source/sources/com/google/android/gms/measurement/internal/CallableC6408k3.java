package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class CallableC6408k3 implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.X2 f42489d;

    CallableC6408k3(com.google.android.gms.measurement.internal.X2 x6, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f42486a = str;
        this.f42487b = str2;
        this.f42488c = str3;
        this.f42489d = x6;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() {
        this.f42489d.f42198C.z0();
        return this.f42489d.f42198C.l0().D0(this.f42486a, this.f42487b, this.f42488c);
    }
}
