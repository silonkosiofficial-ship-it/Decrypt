package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5336uI implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.ref.WeakReference f39139a;

    /* synthetic */ C5336uI(com.google.android.gms.internal.ads.C5886zI c5886zI, com.google.android.gms.internal.ads.AbstractC5776yI abstractC5776yI) {
        this.f39139a = new java.lang.ref.WeakReference(c5886zI);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final void a(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.C5886zI c5886zI = (com.google.android.gms.internal.ads.C5886zI) this.f39139a.get();
        if (c5886zI != null && "_ac".equals((java.lang.String) map.get("eventName"))) {
            c5886zI.f40258h.e0();
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Fa)).booleanValue()) {
                c5886zI.f40259i.p0();
                if (android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("sccg"))) {
                    return;
                }
                c5886zI.f40259i.A();
            }
        }
    }
}
