package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class CallableC6401j3 implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.X2 f42454d;

    CallableC6401j3(com.google.android.gms.measurement.internal.X2 x6, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f42451a = str;
        this.f42452b = str2;
        this.f42453c = str3;
        this.f42454d = x6;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() {
        this.f42454d.f42198C.z0();
        return this.f42454d.f42198C.l0().D0(this.f42451a, this.f42452b, this.f42453c);
    }
}
