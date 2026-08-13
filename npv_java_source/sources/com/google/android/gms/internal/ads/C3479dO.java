package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3479dO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f34704a = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3588eO f34705b;

    C3479dO(com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f34705b = c3588eO;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.C3479dO a(com.google.android.gms.internal.ads.C3479dO c3479dO) {
        c3479dO.f34704a.putAll(c3479dO.f34705b.f34978c);
        return c3479dO;
    }

    public final com.google.android.gms.internal.ads.C3479dO b(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
            this.f34704a.put(str, str2);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.C3479dO c(com.google.android.gms.internal.ads.R60 r60) {
        b("aai", r60.f31204w);
        b("request_id", r60.f31187n0);
        b("ad_format", com.google.android.gms.internal.ads.R60.a(r60.f31162b));
        return this;
    }

    public final com.google.android.gms.internal.ads.C3479dO d(com.google.android.gms.internal.ads.U60 u60) {
        b("gqi", u60.f32114b);
        return this;
    }

    public final java.lang.String e() {
        return this.f34705b.f34976a.b(this.f34704a);
    }

    public final void f() {
        this.f34705b.f34977b.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.cO
            @Override // java.lang.Runnable
            public final void run() {
                this.f34490C.i();
            }
        });
    }

    public final void g() {
        this.f34705b.f34977b.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.aO
            @Override // java.lang.Runnable
            public final void run() {
                this.f34071C.j();
            }
        });
    }

    public final void h() {
        this.f34705b.f34977b.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.bO
            @Override // java.lang.Runnable
            public final void run() {
                this.f34308C.k();
            }
        });
    }

    final /* synthetic */ void i() {
        this.f34705b.f34976a.e(this.f34704a);
    }

    final /* synthetic */ void j() {
        this.f34705b.f34976a.g(this.f34704a);
    }

    final /* synthetic */ void k() {
        this.f34705b.f34976a.f(this.f34704a);
    }
}
