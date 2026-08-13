package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4789pJ {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.C4789pJ f37963h = new com.google.android.gms.internal.ads.C4789pJ(new com.google.android.gms.internal.ads.C4569nJ());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2682Oh f37964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2572Lh f37965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3397ci f37966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3082Zh f37967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5597wk f37968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p170r.Y f37969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p170r.Y f37970g;

    private C4789pJ(com.google.android.gms.internal.ads.C4569nJ c4569nJ) {
        this.f37964a = c4569nJ.f37559a;
        this.f37965b = c4569nJ.f37560b;
        this.f37966c = c4569nJ.f37561c;
        this.f37969f = new p170r.Y(c4569nJ.f37564f);
        this.f37970g = new p170r.Y(c4569nJ.f37565g);
        this.f37967d = c4569nJ.f37562d;
        this.f37968e = c4569nJ.f37563e;
    }

    public final com.google.android.gms.internal.ads.InterfaceC2572Lh a() {
        return this.f37965b;
    }

    public final com.google.android.gms.internal.ads.InterfaceC2682Oh b() {
        return this.f37964a;
    }

    public final com.google.android.gms.internal.ads.InterfaceC2830Sh c(java.lang.String str) {
        return (com.google.android.gms.internal.ads.InterfaceC2830Sh) this.f37970g.get(str);
    }

    public final com.google.android.gms.internal.ads.InterfaceC2938Vh d(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return (com.google.android.gms.internal.ads.InterfaceC2938Vh) this.f37969f.get(str);
    }

    public final com.google.android.gms.internal.ads.InterfaceC3082Zh e() {
        return this.f37967d;
    }

    public final com.google.android.gms.internal.ads.InterfaceC3397ci f() {
        return this.f37966c;
    }

    public final com.google.android.gms.internal.ads.InterfaceC5597wk g() {
        return this.f37968e;
    }

    public final java.util.ArrayList h() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f37969f.size());
        for (int i6 = 0; i6 < this.f37969f.size(); i6++) {
            arrayList.add((java.lang.String) this.f37969f.f(i6));
        }
        return arrayList;
    }

    public final java.util.ArrayList i() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.f37966c != null) {
            arrayList.add(java.lang.Integer.toString(6));
        }
        if (this.f37964a != null) {
            arrayList.add(java.lang.Integer.toString(1));
        }
        if (this.f37965b != null) {
            arrayList.add(java.lang.Integer.toString(2));
        }
        if (!this.f37969f.isEmpty()) {
            arrayList.add(java.lang.Integer.toString(3));
        }
        if (this.f37968e != null) {
            arrayList.add(java.lang.Integer.toString(7));
        }
        return arrayList;
    }
}
