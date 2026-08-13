package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class AZ implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f25187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p224w3.a f25188b;

    AZ(p224w3.a aVar, com.google.android.gms.internal.ads.Yk0 yk0) {
        this.f25188b = aVar;
        this.f25187a = yk0;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 54;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f25187a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zZ
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f40331a.c();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.BZ c() {
        return com.google.android.gms.internal.ads.BZ.a(this.f25188b);
    }
}
