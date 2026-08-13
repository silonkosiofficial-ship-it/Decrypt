package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3022Xq implements com.google.android.gms.internal.ads.InterfaceC3824gc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p214v3.InterfaceC7268s0 f33180b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final com.google.android.gms.internal.ads.C2950Vq f33182d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f33179a = new java.lang.Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final java.util.HashSet f33183e = new java.util.HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final java.util.HashSet f33184f = new java.util.HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f33185g = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2986Wq f33181c = new com.google.android.gms.internal.ads.C2986Wq();

    public C3022Xq(java.lang.String str, p214v3.InterfaceC7268s0 interfaceC7268s0) {
        this.f33182d = new com.google.android.gms.internal.ads.C2950Vq(str, interfaceC7268s0);
        this.f33180b = interfaceC7268s0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3824gc
    public final void a(boolean z6) {
        com.google.android.gms.internal.ads.C2950Vq c2950Vq;
        int iC;
        long jA = p174r3.v.c().a();
        if (!z6) {
            this.f33180b.F(jA);
            this.f33180b.E(this.f33182d.f32592d);
            return;
        }
        if (jA - this.f33180b.f() > ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25526d1)).longValue()) {
            c2950Vq = this.f33182d;
            iC = -1;
        } else {
            c2950Vq = this.f33182d;
            iC = this.f33180b.c();
        }
        c2950Vq.f32592d = iC;
        this.f33185g = true;
    }

    public final int b() {
        int iA;
        synchronized (this.f33179a) {
            iA = this.f33182d.a();
        }
        return iA;
    }

    public final com.google.android.gms.internal.ads.C2658Nq c(V3.f fVar, java.lang.String str) {
        return new com.google.android.gms.internal.ads.C2658Nq(fVar, this, this.f33181c.a(), str);
    }

    public final java.lang.String d() {
        return this.f33181c.b();
    }

    public final void e(com.google.android.gms.internal.ads.C2658Nq c2658Nq) {
        synchronized (this.f33179a) {
            this.f33183e.add(c2658Nq);
        }
    }

    public final void f() {
        synchronized (this.f33179a) {
            this.f33182d.c();
        }
    }

    public final void g() {
        synchronized (this.f33179a) {
            this.f33182d.d();
        }
    }

    public final void h() {
        synchronized (this.f33179a) {
            this.f33182d.e();
        }
    }

    public final void i() {
        synchronized (this.f33179a) {
            this.f33182d.f();
        }
    }

    public final void j(p184s3.X1 x6, long j6) {
        synchronized (this.f33179a) {
            this.f33182d.g(x6, j6);
        }
    }

    public final void k() {
        synchronized (this.f33179a) {
            this.f33182d.h();
        }
    }

    public final void l(java.util.HashSet hashSet) {
        synchronized (this.f33179a) {
            this.f33183e.addAll(hashSet);
        }
    }

    public final boolean m() {
        return this.f33185g;
    }

    public final android.os.Bundle n(android.content.Context context, com.google.android.gms.internal.ads.V70 v70) {
        java.util.HashSet hashSet = new java.util.HashSet();
        synchronized (this.f33179a) {
            hashSet.addAll(this.f33183e);
            this.f33183e.clear();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBundle("app", this.f33182d.b(context, this.f33181c.b()));
        android.os.Bundle bundle2 = new android.os.Bundle();
        java.util.Iterator it = this.f33184f.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.D.a(it.next());
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        java.util.Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((com.google.android.gms.internal.ads.C2658Nq) it2.next()).a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        v70.b(hashSet);
        return bundle;
    }
}
