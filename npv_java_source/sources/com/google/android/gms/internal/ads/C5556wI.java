package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5556wI implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.ref.WeakReference f39570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.ref.WeakReference f39571b;

    /* synthetic */ C5556wI(com.google.android.gms.internal.ads.C5886zI c5886zI, android.view.View view, com.google.android.gms.internal.ads.AbstractC5776yI abstractC5776yI) {
        this.f39570a = new java.lang.ref.WeakReference(c5886zI);
        this.f39571b = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Lc)).booleanValue() ? new java.lang.ref.WeakReference(view) : new java.lang.ref.WeakReference(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final void a(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.C5886zI c5886zI = (com.google.android.gms.internal.ads.C5886zI) this.f39570a.get();
        if (c5886zI == null) {
            return;
        }
        c5886zI.f40257g.a();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Lc)).booleanValue()) {
            c5886zI.f40250D.a((android.view.View) this.f39571b.get(), c5886zI.f40260j);
        }
    }
}
