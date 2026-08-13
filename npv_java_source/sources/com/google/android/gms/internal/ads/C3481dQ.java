package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3481dQ extends E3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.lang.String f34708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ java.lang.String f34709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.BinderC4030iQ f34710c;

    C3481dQ(com.google.android.gms.internal.ads.BinderC4030iQ binderC4030iQ, java.lang.String str, java.lang.String str2) {
        this.f34708a = str;
        this.f34709b = str2;
        this.f34710c = binderC4030iQ;
    }

    @Override // p104k3.AbstractC6888e
    public final void a(p104k3.m mVar) {
        this.f34710c.y6(com.google.android.gms.internal.ads.BinderC4030iQ.x6(mVar), this.f34709b);
    }

    @Override // p104k3.AbstractC6888e
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        java.lang.String str = this.f34709b;
        this.f34710c.s6(this.f34708a, (E3.c) obj, str);
    }
}
