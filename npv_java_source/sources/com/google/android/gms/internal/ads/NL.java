package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class NL implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.ref.WeakReference f30275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f30276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3838gj f30277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.PL f30278d;

    /* synthetic */ NL(com.google.android.gms.internal.ads.PL pl, java.lang.ref.WeakReference weakReference, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj, com.google.android.gms.internal.ads.OL ol) {
        this.f30278d = pl;
        this.f30275a = weakReference;
        this.f30276b = str;
        this.f30277c = interfaceC3838gj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final void a(java.lang.Object obj, java.util.Map map) {
        java.lang.Object obj2 = this.f30275a.get();
        if (obj2 == null) {
            this.f30278d.n(this.f30276b, this);
        } else {
            this.f30277c.a(obj2, map);
        }
    }
}
