package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4174jn implements p204u3.z {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.zzbrw f36731C;

    C4174jn(com.google.android.gms.internal.ads.zzbrw zzbrwVar) {
        this.f36731C = zzbrwVar;
    }

    @Override // p204u3.z
    public final void T2() {
        p224w3.p.b("Opening AdMobCustomTabsAdapter overlay.");
        com.google.android.gms.internal.ads.zzbrw zzbrwVar = this.f36731C;
        zzbrwVar.f40429b.s(zzbrwVar);
    }

    @Override // p204u3.z
    public final void d2() {
        p224w3.p.b("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // p204u3.z
    public final void f3() {
        p224w3.p.b("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // p204u3.z
    public final void p4(int i6) {
        p224w3.p.b("AdMobCustomTabsAdapter overlay is closed.");
        com.google.android.gms.internal.ads.zzbrw zzbrwVar = this.f36731C;
        zzbrwVar.f40429b.p(zzbrwVar);
    }

    @Override // p204u3.z
    public final void q0() {
    }

    @Override // p204u3.z
    public final void y0() {
        p224w3.p.b("AdMobCustomTabsAdapter overlay is paused.");
    }
}
