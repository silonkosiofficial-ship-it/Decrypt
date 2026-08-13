package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ub0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2891Ub0 implements com.google.android.gms.internal.ads.InterfaceC2999Xb0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C2891Ub0 f32238e = new com.google.android.gms.internal.ads.C2891Ub0(new com.google.android.gms.internal.ads.C3035Yb0());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.Date f32239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3035Yb0 f32241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f32242d;

    private C2891Ub0(com.google.android.gms.internal.ads.C3035Yb0 c3035Yb0) {
        this.f32241c = c3035Yb0;
    }

    public static com.google.android.gms.internal.ads.C2891Ub0 b() {
        return f32238e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2999Xb0
    public final void a(boolean z6) {
        if (!this.f32242d && z6) {
            java.util.Date date = new java.util.Date();
            java.util.Date date2 = this.f32239a;
            if (date2 == null || date.after(date2)) {
                this.f32239a = date;
                if (this.f32240b) {
                    java.util.Iterator it = com.google.android.gms.internal.ads.C2963Wb0.a().b().iterator();
                    while (it.hasNext()) {
                        ((com.google.android.gms.internal.ads.C2339Fb0) it.next()).g().g(c());
                    }
                }
            }
        }
        this.f32242d = z6;
    }

    public final java.util.Date c() {
        java.util.Date date = this.f32239a;
        if (date != null) {
            return (java.util.Date) date.clone();
        }
        return null;
    }

    public final void d(android.content.Context context) {
        if (this.f32240b) {
            return;
        }
        this.f32241c.d(context);
        this.f32241c.e(this);
        this.f32241c.f();
        this.f32242d = this.f32241c.f33376D;
        this.f32240b = true;
    }
}
