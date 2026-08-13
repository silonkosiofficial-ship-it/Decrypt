package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2963Wb0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C2963Wb0 f32768c = new com.google.android.gms.internal.ads.C2963Wb0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList f32769a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.ArrayList f32770b = new java.util.ArrayList();

    private C2963Wb0() {
    }

    public static com.google.android.gms.internal.ads.C2963Wb0 a() {
        return f32768c;
    }

    public final java.util.Collection b() {
        return j$.util.DesugarCollections.unmodifiableCollection(this.f32770b);
    }

    public final java.util.Collection c() {
        return j$.util.DesugarCollections.unmodifiableCollection(this.f32769a);
    }

    public final void d(com.google.android.gms.internal.ads.C2339Fb0 c2339Fb0) {
        this.f32769a.add(c2339Fb0);
    }

    public final void e(com.google.android.gms.internal.ads.C2339Fb0 c2339Fb0) {
        java.util.ArrayList arrayList = this.f32769a;
        boolean zG = g();
        arrayList.remove(c2339Fb0);
        this.f32770b.remove(c2339Fb0);
        if (!zG || g()) {
            return;
        }
        com.google.android.gms.internal.ads.C3605ec0.c().g();
    }

    public final void f(com.google.android.gms.internal.ads.C2339Fb0 c2339Fb0) {
        java.util.ArrayList arrayList = this.f32770b;
        boolean zG = g();
        arrayList.add(c2339Fb0);
        if (zG) {
            return;
        }
        com.google.android.gms.internal.ads.C3605ec0.c().f();
    }

    public final boolean g() {
        return this.f32770b.size() > 0;
    }
}
