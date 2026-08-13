package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class GQ implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f27806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f27807b;

    public GQ(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f27806a = interfaceC5078rz0;
        this.f27807b = interfaceC5078rz1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* synthetic */ java.lang.Object b() {
        com.google.android.gms.internal.ads.C5429v90 c5429v90 = (com.google.android.gms.internal.ads.C5429v90) this.f27806a.b();
        final android.webkit.CookieManager cookieManagerA = p174r3.v.u().a((android.content.Context) this.f27807b.b());
        com.google.android.gms.internal.ads.C4330l90 c4330l90I = com.google.android.gms.internal.ads.AbstractC3562e90.a(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.BQ
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                android.webkit.CookieManager cookieManager = cookieManagerA;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25471Y0));
            }
        }, com.google.android.gms.internal.ads.EnumC4770p90.WEBVIEW_COOKIE, c5429v90).i(1L, java.util.concurrent.TimeUnit.SECONDS);
        final com.google.android.gms.internal.ads.Y80 y80 = new com.google.android.gms.internal.ads.Y80() { // from class: com.google.android.gms.internal.ads.CQ
            @Override // com.google.android.gms.internal.ads.Y80
            public final java.lang.Object b(java.lang.Object obj) {
                return "";
            }
        };
        return c4330l90I.c(java.lang.Exception.class, new com.google.android.gms.internal.ads.InterfaceC5268tk0(y80) { // from class: com.google.android.gms.internal.ads.f90
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.h("");
            }
        }).a();
    }
}
