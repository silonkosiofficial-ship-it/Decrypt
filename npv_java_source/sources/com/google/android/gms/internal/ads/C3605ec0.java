package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ec0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3605ec0 implements com.google.android.gms.internal.ads.InterfaceC2999Xb0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static com.google.android.gms.internal.ads.C3605ec0 f35011d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f35012a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2819Sb0 f35013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2963Wb0 f35014c;

    public C3605ec0(com.google.android.gms.internal.ads.C2855Tb0 c2855Tb0, com.google.android.gms.internal.ads.C2782Rb0 c2782Rb0) {
    }

    public static com.google.android.gms.internal.ads.C3605ec0 c() {
        if (f35011d == null) {
            f35011d = new com.google.android.gms.internal.ads.C3605ec0(new com.google.android.gms.internal.ads.C2855Tb0(), new com.google.android.gms.internal.ads.C2782Rb0());
        }
        return f35011d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2999Xb0
    public final void a(boolean z6) {
        if (z6) {
            com.google.android.gms.internal.ads.C2378Gc0.d().i();
        } else {
            com.google.android.gms.internal.ads.C2378Gc0.d().h();
        }
    }

    public final float b() {
        return this.f35012a;
    }

    public final void d(android.content.Context context) {
        this.f35013b = new com.google.android.gms.internal.ads.C2819Sb0(new android.os.Handler(), context, new com.google.android.gms.internal.ads.C2745Qb0(), this);
    }

    public final void e(float f6) {
        this.f35012a = f6;
        if (this.f35014c == null) {
            this.f35014c = com.google.android.gms.internal.ads.C2963Wb0.a();
        }
        java.util.Iterator it = this.f35014c.b().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.C2339Fb0) it.next()).g().l(f6);
        }
    }

    public final void f() {
        com.google.android.gms.internal.ads.C2927Vb0.i().e(this);
        com.google.android.gms.internal.ads.C2927Vb0.i().f();
        com.google.android.gms.internal.ads.C2378Gc0.d().i();
        this.f35013b.a();
    }

    public final void g() {
        com.google.android.gms.internal.ads.C2378Gc0.d().j();
        com.google.android.gms.internal.ads.C2927Vb0.i().g();
        this.f35013b.b();
    }
}
