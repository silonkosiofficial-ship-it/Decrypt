package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class CallableC6415l3 implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.X2 f42508d;

    CallableC6415l3(com.google.android.gms.measurement.internal.X2 x6, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f42505a = str;
        this.f42506b = str2;
        this.f42507c = str3;
        this.f42508d = x6;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() {
        this.f42508d.f42198C.z0();
        return this.f42508d.f42198C.l0().R(this.f42505a, this.f42506b, this.f42507c);
    }
}
