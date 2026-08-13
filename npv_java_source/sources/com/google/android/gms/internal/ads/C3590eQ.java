package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3590eQ extends F3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.lang.String f34981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ java.lang.String f34982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.BinderC4030iQ f34983c;

    C3590eQ(com.google.android.gms.internal.ads.BinderC4030iQ binderC4030iQ, java.lang.String str, java.lang.String str2) {
        this.f34981a = str;
        this.f34982b = str2;
        this.f34983c = binderC4030iQ;
    }

    @Override // p104k3.AbstractC6888e
    public final void a(p104k3.m mVar) {
        this.f34983c.y6(com.google.android.gms.internal.ads.BinderC4030iQ.x6(mVar), this.f34982b);
    }

    @Override // p104k3.AbstractC6888e
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        java.lang.String str = this.f34982b;
        this.f34983c.s6(this.f34981a, (F3.a) obj, str);
    }
}
