package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3152aQ extends p124m3.a.AbstractC0646a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.lang.String f34073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ java.lang.String f34074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.BinderC4030iQ f34075c;

    C3152aQ(com.google.android.gms.internal.ads.BinderC4030iQ binderC4030iQ, java.lang.String str, java.lang.String str2) {
        this.f34073a = str;
        this.f34074b = str2;
        this.f34075c = binderC4030iQ;
    }

    @Override // p104k3.AbstractC6888e
    public final void a(p104k3.m mVar) {
        this.f34075c.y6(com.google.android.gms.internal.ads.BinderC4030iQ.x6(mVar), this.f34074b);
    }

    @Override // p104k3.AbstractC6888e
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        java.lang.String str = this.f34074b;
        this.f34075c.s6(this.f34073a, (p124m3.a) obj, str);
    }
}
