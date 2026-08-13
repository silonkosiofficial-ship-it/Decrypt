package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3371cQ extends p234x3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.lang.String f34493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ java.lang.String f34494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.BinderC4030iQ f34495c;

    C3371cQ(com.google.android.gms.internal.ads.BinderC4030iQ binderC4030iQ, java.lang.String str, java.lang.String str2) {
        this.f34493a = str;
        this.f34494b = str2;
        this.f34495c = binderC4030iQ;
    }

    @Override // p104k3.AbstractC6888e
    public final void a(p104k3.m mVar) {
        this.f34495c.y6(com.google.android.gms.internal.ads.BinderC4030iQ.x6(mVar), this.f34494b);
    }

    @Override // p104k3.AbstractC6888e
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        java.lang.String str = this.f34494b;
        this.f34495c.s6(this.f34493a, (p234x3.a) obj, str);
    }
}
