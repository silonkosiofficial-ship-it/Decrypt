package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4113jB implements com.google.android.gms.internal.ads.InterfaceC5770yF, com.google.android.gms.internal.ads.InterfaceC5326uD {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final V3.f f36605C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4333lB f36606D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f36607E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.String f36608F;

    C4113jB(V3.f fVar, com.google.android.gms.internal.ads.C4333lB c4333lB, com.google.android.gms.internal.ads.C4546n70 c4546n70, java.lang.String str) {
        this.f36605C = fVar;
        this.f36606D = c4333lB;
        this.f36607E = c4546n70;
        this.f36608F = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5770yF
    public final void a() {
        this.f36606D.e(this.f36608F, this.f36605C.c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5326uD
    public final void u() {
        V3.f fVar = this.f36605C;
        this.f36606D.d(this.f36607E.f37513f, this.f36608F, fVar.c());
    }
}
