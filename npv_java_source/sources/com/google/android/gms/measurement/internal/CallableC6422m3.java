package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class CallableC6422m3 implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.X2 f42527d;

    CallableC6422m3(com.google.android.gms.measurement.internal.X2 x6, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f42524a = str;
        this.f42525b = str2;
        this.f42526c = str3;
        this.f42527d = x6;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() {
        this.f42527d.f42198C.z0();
        return this.f42527d.f42198C.l0().R(this.f42524a, this.f42525b, this.f42526c);
    }
}
