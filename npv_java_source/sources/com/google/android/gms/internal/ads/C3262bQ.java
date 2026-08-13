package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3262bQ extends p104k3.AbstractC6887d {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.lang.String f34315C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ p104k3.i f34316D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ java.lang.String f34317E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.BinderC4030iQ f34318F;

    C3262bQ(com.google.android.gms.internal.ads.BinderC4030iQ binderC4030iQ, java.lang.String str, p104k3.i iVar, java.lang.String str2) {
        this.f34315C = str;
        this.f34316D = iVar;
        this.f34317E = str2;
        this.f34318F = binderC4030iQ;
    }

    @Override // p104k3.AbstractC6887d
    public final void g(p104k3.m mVar) {
        this.f34318F.y6(com.google.android.gms.internal.ads.BinderC4030iQ.x6(mVar), this.f34317E);
    }

    @Override // p104k3.AbstractC6887d
    public final void k() {
        this.f34318F.s6(this.f34315C, this.f34316D, this.f34317E);
    }
}
