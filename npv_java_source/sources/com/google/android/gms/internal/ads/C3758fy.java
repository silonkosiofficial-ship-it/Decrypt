package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3758fy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f35488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2358Fl f35489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f35490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4306ky f35491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3838gj f35492e = new com.google.android.gms.internal.ads.C3210ay(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3838gj f35493f = new com.google.android.gms.internal.ads.C3648ey(this);

    public C3758fy(java.lang.String str, com.google.android.gms.internal.ads.C2358Fl c2358Fl, java.util.concurrent.Executor executor) {
        this.f35488a = str;
        this.f35489b = c2358Fl;
        this.f35490c = executor;
    }

    static /* bridge */ /* synthetic */ boolean g(com.google.android.gms.internal.ads.C3758fy c3758fy, java.util.Map map) {
        if (map == null) {
            return false;
        }
        java.lang.String str = (java.lang.String) map.get("hashCode");
        return !android.text.TextUtils.isEmpty(str) && str.equals(c3758fy.f35488a);
    }

    public final void c(com.google.android.gms.internal.ads.C4306ky c4306ky) {
        this.f35489b.b("/updateActiveView", this.f35492e);
        this.f35489b.b("/untrackActiveViewUnit", this.f35493f);
        this.f35491d = c4306ky;
    }

    public final void d(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        interfaceC2698Ot.g1("/updateActiveView", this.f35492e);
        interfaceC2698Ot.g1("/untrackActiveViewUnit", this.f35493f);
    }

    public final void e() {
        this.f35489b.c("/updateActiveView", this.f35492e);
        this.f35489b.c("/untrackActiveViewUnit", this.f35493f);
    }

    public final void f(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        interfaceC2698Ot.Y0("/updateActiveView", this.f35492e);
        interfaceC2698Ot.Y0("/untrackActiveViewUnit", this.f35493f);
    }
}
