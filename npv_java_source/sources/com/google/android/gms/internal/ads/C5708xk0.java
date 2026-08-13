package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5708xk0 extends com.google.android.gms.internal.ads.AbstractC5818yk0 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.util.concurrent.Callable f39913G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C5928zk0 f39914H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5708xk0(com.google.android.gms.internal.ads.C5928zk0 c5928zk0, java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        super(c5928zk0, executor);
        this.f39914H = c5928zk0;
        this.f39913G = callable;
    }

    @Override // com.google.android.gms.internal.ads.Vk0
    final java.lang.Object a() {
        return this.f39913G.call();
    }

    @Override // com.google.android.gms.internal.ads.Vk0
    final java.lang.String b() {
        return this.f39913G.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5818yk0
    final void h(java.lang.Object obj) {
        this.f39914H.f(obj);
    }
}
