package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class XX implements com.google.android.gms.internal.ads.SD {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f33142C = new java.util.concurrent.atomic.AtomicReference();

    public final void a(p184s3.N0 n6) {
        this.f33142C.set(n6);
    }

    @Override // com.google.android.gms.internal.ads.SD
    public final void r(final p184s3.e2 e2Var) {
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f33142C, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.WX
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((p184s3.N0) obj).C2(e2Var);
            }
        });
    }
}
