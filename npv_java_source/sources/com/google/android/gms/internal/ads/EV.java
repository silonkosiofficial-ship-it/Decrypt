package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class EV {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4062il0 f27051c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.UV f27054f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f27056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f27057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.TV f27058j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.gms.internal.ads.R60 f27059k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f27049a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f27050b = new java.util.ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f27052d = new java.util.ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.Set f27053e = new java.util.HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27055g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f27060l = false;

    EV(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.TV tv, com.google.android.gms.internal.ads.C4062il0 c4062il0) {
        this.f27057i = c3558e70.f34899b.f34448b.f32130r;
        this.f27058j = tv;
        this.f27051c = c4062il0;
        this.f27056h = com.google.android.gms.internal.ads.C3158aW.d(c3558e70);
        java.util.List list = c3558e70.f34899b.f34447a;
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.f27049a.put((com.google.android.gms.internal.ads.R60) list.get(i6), java.lang.Integer.valueOf(i6));
        }
        this.f27050b.addAll(list);
    }

    private final synchronized void e() {
        this.f27058j.i(this.f27059k);
        com.google.android.gms.internal.ads.UV uv = this.f27054f;
        if (uv != null) {
            this.f27051c.f(uv);
        } else {
            this.f27051c.h(new com.google.android.gms.internal.ads.XV(3, this.f27056h));
        }
    }

    private final synchronized boolean f(boolean z6) {
        try {
            for (com.google.android.gms.internal.ads.R60 r60 : this.f27050b) {
                java.lang.Integer num = (java.lang.Integer) this.f27049a.get(r60);
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z6 || !this.f27053e.contains(r60.f31199t0)) {
                    int i6 = this.f27055g;
                    if (iIntValue < i6) {
                        return true;
                    }
                    if (iIntValue > i6) {
                        break;
                    }
                }
            }
            return false;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean g() {
        try {
            java.util.Iterator it = this.f27052d.iterator();
            while (it.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) this.f27049a.get((com.google.android.gms.internal.ads.R60) it.next());
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.f27055g) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean h() {
        return f(true) || g();
    }

    private final synchronized boolean i() {
        if (this.f27060l) {
            return false;
        }
        if (!this.f27050b.isEmpty() && ((com.google.android.gms.internal.ads.R60) this.f27050b.get(0)).f31203v0 && !this.f27052d.isEmpty()) {
            return false;
        }
        if (!d()) {
            java.util.List list = this.f27052d;
            if (list.size() < this.f27057i && f(false)) {
                return true;
            }
        }
        return false;
    }

    final synchronized com.google.android.gms.internal.ads.R60 a() {
        try {
            if (i()) {
                for (int i6 = 0; i6 < this.f27050b.size(); i6++) {
                    com.google.android.gms.internal.ads.R60 r60 = (com.google.android.gms.internal.ads.R60) this.f27050b.get(i6);
                    java.lang.String str = r60.f31199t0;
                    if (!this.f27053e.contains(str)) {
                        if (r60.f31203v0) {
                            this.f27060l = true;
                        }
                        if (!android.text.TextUtils.isEmpty(str)) {
                            this.f27053e.add(str);
                        }
                        this.f27052d.add(r60);
                        return (com.google.android.gms.internal.ads.R60) this.f27050b.remove(i6);
                    }
                }
            }
            return null;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    final synchronized void b(java.lang.Throwable th, com.google.android.gms.internal.ads.R60 r60) {
        this.f27060l = false;
        this.f27052d.remove(r60);
        this.f27053e.remove(r60.f31199t0);
        if (d() || h()) {
            return;
        }
        e();
    }

    final synchronized void c(com.google.android.gms.internal.ads.UV uv, com.google.android.gms.internal.ads.R60 r60) {
        this.f27060l = false;
        this.f27052d.remove(r60);
        if (d()) {
            uv.t();
            return;
        }
        java.lang.Integer num = (java.lang.Integer) this.f27049a.get(r60);
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (iIntValue > this.f27055g) {
            this.f27058j.m(r60);
            return;
        }
        if (this.f27054f != null) {
            this.f27058j.m(this.f27059k);
        }
        this.f27055g = iIntValue;
        this.f27054f = uv;
        this.f27059k = r60;
        if (h()) {
            return;
        }
        e();
    }

    final synchronized boolean d() {
        return this.f27051c.isDone();
    }
}
