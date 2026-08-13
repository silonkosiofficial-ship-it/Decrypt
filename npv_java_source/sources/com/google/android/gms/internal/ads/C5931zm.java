package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5931zm implements p244y3.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Date f40373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Set f40375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f40376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.location.Location f40377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f40378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3505dh f40379g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f40381i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.List f40380h = new java.util.ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.Map f40382j = new java.util.HashMap();

    public C5931zm(java.util.Date date, int i6, java.util.Set set, android.location.Location location, boolean z6, int i10, com.google.android.gms.internal.ads.C3505dh c3505dh, java.util.List list, boolean z10, int i11, java.lang.String str) {
        java.util.Map map;
        java.lang.String str2;
        java.lang.Boolean bool;
        this.f40373a = date;
        this.f40374b = i6;
        this.f40375c = set;
        this.f40377e = location;
        this.f40376d = z6;
        this.f40378f = i10;
        this.f40379g = c3505dh;
        this.f40381i = z10;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                if (str3.startsWith("custom:")) {
                    java.lang.String[] strArrSplit = str3.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            map = this.f40382j;
                            str2 = strArrSplit[1];
                            bool = java.lang.Boolean.TRUE;
                        } else if ("false".equals(strArrSplit[2])) {
                            map = this.f40382j;
                            str2 = strArrSplit[1];
                            bool = java.lang.Boolean.FALSE;
                        }
                        map.put(str2, bool);
                    }
                } else {
                    this.f40380h.add(str3);
                }
            }
        }
    }

    @Override // p244y3.p
    public final java.util.Map a() {
        return this.f40382j;
    }

    @Override // p244y3.p
    public final boolean b() {
        return this.f40380h.contains("3");
    }

    @Override // p244y3.p
    public final com.google.android.gms.ads.nativead.c c() {
        return com.google.android.gms.internal.ads.C3505dh.e(this.f40379g);
    }

    @Override // p244y3.e
    public final int d() {
        return this.f40378f;
    }

    @Override // p244y3.p
    public final boolean e() {
        return this.f40380h.contains("6");
    }

    @Override // p244y3.e
    public final boolean f() {
        return this.f40381i;
    }

    @Override // p244y3.e
    public final boolean g() {
        return this.f40376d;
    }

    @Override // p244y3.e
    public final java.util.Set h() {
        return this.f40375c;
    }

    @Override // p244y3.p
    public final p134n3.e i() {
        n3.e.a aVar = new n3.e.a();
        com.google.android.gms.internal.ads.C3505dh c3505dh = this.f40379g;
        if (c3505dh != null) {
            int i6 = c3505dh.f34775C;
            if (i6 == 2) {
                aVar.b(c3505dh.f34779G);
            } else {
                if (i6 != 3) {
                    if (i6 == 4) {
                        aVar.e(c3505dh.f34781I);
                        aVar.d(c3505dh.f34782J);
                    }
                }
                p184s3.Q1 q6 = c3505dh.f34780H;
                if (q6 != null) {
                    aVar.h(new p104k3.x(q6));
                }
                aVar.b(c3505dh.f34779G);
            }
            aVar.g(c3505dh.f34776D);
            aVar.c(c3505dh.f34777E);
            aVar.f(c3505dh.f34778F);
        }
        return aVar.a();
    }
}
