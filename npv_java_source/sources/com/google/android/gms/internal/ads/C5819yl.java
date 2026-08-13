package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5819yl implements com.google.android.gms.internal.ads.InterfaceC4732or {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4512mr f40128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3294bl f40129b;

    C5819yl(com.google.android.gms.internal.ads.C2173Al c2173Al, com.google.android.gms.internal.ads.C4512mr c4512mr, com.google.android.gms.internal.ads.C3294bl c3294bl) {
        this.f40128a = c4512mr;
        this.f40129b = c3294bl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732or
    public final void a() {
        p214v3.AbstractC7265q0.k("callJs > getEngine: Promise rejected");
        this.f40128a.d(new com.google.android.gms.internal.ads.C4280kl("Unable to obtain a JavascriptEngine."));
        this.f40129b.h();
    }
}
