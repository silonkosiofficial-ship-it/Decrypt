package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5709xl implements com.google.android.gms.internal.ads.InterfaceC4952qr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3294bl f39915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ java.lang.Object f39916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4512mr f39917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2173Al f39918d;

    C5709xl(com.google.android.gms.internal.ads.C2173Al c2173Al, com.google.android.gms.internal.ads.C3294bl c3294bl, java.lang.Object obj, com.google.android.gms.internal.ads.C4512mr c4512mr) {
        this.f39915a = c3294bl;
        this.f39916b = obj;
        this.f39917c = c4512mr;
        this.f39918d = c2173Al;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4952qr
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        p214v3.AbstractC7265q0.k("callJs > getEngine: Promise fulfilled");
        java.lang.Object obj2 = this.f39916b;
        com.google.android.gms.internal.ads.C4512mr c4512mr = this.f39917c;
        com.google.android.gms.internal.ads.C2173Al.d(this.f39918d, this.f39915a, (com.google.android.gms.internal.ads.InterfaceC4061il) obj, obj2, c4512mr);
    }
}
