package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4664oB0 implements com.google.android.gms.internal.ads.InterfaceC3676fB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.GH0 f37740a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37744e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f37742c = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f37741b = new java.lang.Object();

    public C4664oB0(com.google.android.gms.internal.ads.NH0 nh0, boolean z6) {
        this.f37740a = new com.google.android.gms.internal.ads.GH0(nh0, z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3676fB0
    public final com.google.android.gms.internal.ads.AbstractC4942qm a() {
        return this.f37740a.G();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3676fB0
    public final java.lang.Object b() {
        return this.f37741b;
    }

    public final void c(int i6) {
        this.f37743d = i6;
        this.f37744e = false;
        this.f37742c.clear();
    }
}
