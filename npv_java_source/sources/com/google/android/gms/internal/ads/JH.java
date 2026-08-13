package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class JH implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4785pH f28656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f28657b;

    public JH(com.google.android.gms.internal.ads.C4785pH c4785pH, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0) {
        this.f28656a = c4785pH;
        this.f28657b = interfaceC5078rz0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        return this.f28656a.d((java.util.concurrent.Executor) this.f28657b.b());
    }
}
