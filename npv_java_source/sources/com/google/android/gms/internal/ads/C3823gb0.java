package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3823gb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentMap f35630a = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentMap f35631b = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5360ub0 f35632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3165ab0 f35633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.content.Context f35634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile android.net.ConnectivityManager f35635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final V3.f f35636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicInteger f35637h;

    C3823gb0(com.google.android.gms.internal.ads.C5360ub0 c5360ub0, com.google.android.gms.internal.ads.C3165ab0 c3165ab0, android.content.Context context, V3.f fVar) {
        this.f35632c = c5360ub0;
        this.f35633d = c3165ab0;
        this.f35634e = context;
        this.f35636g = fVar;
    }

    static java.lang.String d(java.lang.String str, p104k3.EnumC6886c enumC6886c) {
        return str + "#" + (enumC6886c == null ? "NULL" : enumC6886c.name());
    }

    private final synchronized com.google.android.gms.internal.ads.AbstractC5250tb0 n(java.lang.String str, p104k3.EnumC6886c enumC6886c) {
        return (com.google.android.gms.internal.ads.AbstractC5250tb0) this.f35630a.get(d(str, enumC6886c));
    }

    private final synchronized java.util.List o(java.util.List list) {
        java.util.ArrayList arrayList;
        java.util.concurrent.ConcurrentMap concurrentMap;
        try {
            java.util.HashSet hashSet = new java.util.HashSet();
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                p184s3.I1 i6 = (p184s3.I1) it.next();
                java.lang.String strD = d(i6.f54130C, p104k3.EnumC6886c.e(i6.f54131D));
                hashSet.add(strD);
                com.google.android.gms.internal.ads.AbstractC5250tb0 abstractC5250tb0 = (com.google.android.gms.internal.ads.AbstractC5250tb0) this.f35630a.get(strD);
                if (abstractC5250tb0 != null) {
                    if (abstractC5250tb0.f38985e.equals(i6)) {
                        abstractC5250tb0.w(i6.f54133F);
                    } else {
                        this.f35631b.put(strD, abstractC5250tb0);
                        concurrentMap = this.f35630a;
                        concurrentMap.remove(strD);
                    }
                } else if (this.f35631b.containsKey(strD)) {
                    com.google.android.gms.internal.ads.AbstractC5250tb0 abstractC5250tb1 = (com.google.android.gms.internal.ads.AbstractC5250tb0) this.f35631b.get(strD);
                    if (abstractC5250tb1.f38985e.equals(i6)) {
                        abstractC5250tb1.w(i6.f54133F);
                        abstractC5250tb1.t();
                        this.f35630a.put(strD, abstractC5250tb1);
                        concurrentMap = this.f35631b;
                        concurrentMap.remove(strD);
                    }
                } else {
                    arrayList.add(i6);
                }
            }
            java.util.Iterator it2 = this.f35630a.entrySet().iterator();
            while (it2.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                if (!hashSet.contains((java.lang.String) entry.getKey())) {
                    this.f35631b.put((java.lang.String) entry.getKey(), (com.google.android.gms.internal.ads.AbstractC5250tb0) entry.getValue());
                    it2.remove();
                }
            }
            java.util.Iterator it3 = this.f35631b.entrySet().iterator();
            while (it3.hasNext()) {
                com.google.android.gms.internal.ads.AbstractC5250tb0 abstractC5250tb2 = (com.google.android.gms.internal.ads.AbstractC5250tb0) ((java.util.Map.Entry) it3.next()).getValue();
                abstractC5250tb2.v();
                if (!abstractC5250tb2.x()) {
                    it3.remove();
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return arrayList;
    }

    private final synchronized j$.util.Optional p(final java.lang.Class cls, java.lang.String str, final p104k3.EnumC6886c enumC6886c) {
        this.f35633d.d(enumC6886c, this.f35636g.a());
        com.google.android.gms.internal.ads.AbstractC5250tb0 abstractC5250tb0N = n(str, enumC6886c);
        if (abstractC5250tb0N == null) {
            return j$.util.Optional.empty();
        }
        try {
            final j$.util.Optional optionalJ = abstractC5250tb0N.j();
            j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(abstractC5250tb0N.i());
            j$.util.Objects.requireNonNull(cls);
            j$.util.Optional map = optionalOfNullable.map(new java.util.function.Function() { // from class: com.google.android.gms.internal.ads.cb0
                public /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                    return j$.util.function.Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return cls.cast(obj);
                }

                public /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                    return j$.util.function.Function$CC.$default$compose(this, function);
                }
            });
            map.ifPresent(new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.db0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f34754a.g(enumC6886c, optionalJ, obj);
                }

                public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return map;
        } catch (java.lang.ClassCastException e6) {
            p174r3.v.s().x(e6, "PreloadAdManager.pollAd");
            p214v3.AbstractC7265q0.l("Unable to cast ad to the requested type:".concat(cls.getName()), e6);
            return j$.util.Optional.empty();
        }
    }

    private final synchronized void q(java.lang.String str, com.google.android.gms.internal.ads.AbstractC5250tb0 abstractC5250tb0) {
        abstractC5250tb0.g();
        this.f35630a.put(str, abstractC5250tb0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void r(boolean z6) {
        try {
            if (z6) {
                java.util.Iterator it = this.f35630a.values().iterator();
                while (it.hasNext()) {
                    ((com.google.android.gms.internal.ads.AbstractC5250tb0) it.next()).t();
                }
            } else {
                java.util.Iterator it2 = this.f35630a.values().iterator();
                while (it2.hasNext()) {
                    ((com.google.android.gms.internal.ads.AbstractC5250tb0) it2.next()).f38986f.set(false);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void s(boolean z6) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25691t)).booleanValue()) {
            r(z6);
        }
    }

    private final synchronized boolean t(java.lang.String str, p104k3.EnumC6886c enumC6886c) {
        boolean z6;
        try {
            long jA = this.f35636g.a();
            com.google.android.gms.internal.ads.AbstractC5250tb0 abstractC5250tb0N = n(str, enumC6886c);
            z6 = false;
            if (abstractC5250tb0N != null && abstractC5250tb0N.x()) {
                z6 = true;
            }
            this.f35633d.a(enumC6886c, jA, z6 ? j$.util.Optional.of(java.lang.Long.valueOf(this.f35636g.a())) : j$.util.Optional.empty(), abstractC5250tb0N == null ? j$.util.Optional.empty() : abstractC5250tb0N.j());
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return z6;
    }

    public final synchronized com.google.android.gms.internal.ads.InterfaceC2414Hc a(java.lang.String str) {
        return (com.google.android.gms.internal.ads.InterfaceC2414Hc) p(com.google.android.gms.internal.ads.InterfaceC2414Hc.class, str, p104k3.EnumC6886c.APP_OPEN_AD).orElse(null);
    }

    public final synchronized p184s3.V b(java.lang.String str) {
        return (p184s3.V) p(p184s3.V.class, str, p104k3.EnumC6886c.INTERSTITIAL).orElse(null);
    }

    public final synchronized com.google.android.gms.internal.ads.InterfaceC5497vp c(java.lang.String str) {
        return (com.google.android.gms.internal.ads.InterfaceC5497vp) p(com.google.android.gms.internal.ads.InterfaceC5497vp.class, str, p104k3.EnumC6886c.REWARDED).orElse(null);
    }

    final /* synthetic */ void g(p104k3.EnumC6886c enumC6886c, j$.util.Optional optional, java.lang.Object obj) {
        this.f35633d.e(enumC6886c, this.f35636g.a(), optional);
    }

    public final void h() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        if (this.f35635f == null) {
            synchronized (this) {
                if (this.f35635f == null) {
                    try {
                        this.f35635f = (android.net.ConnectivityManager) this.f35634e.getSystemService("connectivity");
                    } catch (java.lang.ClassCastException e6) {
                        p224w3.p.h("Failed to get connectivity manager", e6);
                    }
                }
            }
        }
        if (!V3.n.i() || this.f35635f == null) {
            atomicInteger = new java.util.concurrent.atomic.AtomicInteger(((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25741y)).intValue());
        } else {
            try {
                this.f35635f.registerDefaultNetworkCallback(new com.google.android.gms.internal.ads.C3713fb0(this));
                return;
            } catch (java.lang.RuntimeException e10) {
                p224w3.p.h("Failed to register network callback", e10);
                atomicInteger = new java.util.concurrent.atomic.AtomicInteger(((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25741y)).intValue());
            }
        }
        this.f35637h = atomicInteger;
    }

    public final void i(com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        this.f35632c.b(interfaceC2945Vl);
    }

    public final synchronized void j(java.util.List list, p184s3.InterfaceC7083c0 interfaceC7083c0) {
        try {
            java.util.List<p184s3.I1> listO = o(list);
            java.util.EnumMap enumMap = new java.util.EnumMap(p104k3.EnumC6886c.class);
            for (p184s3.I1 i6 : listO) {
                java.lang.String str = i6.f54130C;
                p104k3.EnumC6886c enumC6886cE = p104k3.EnumC6886c.e(i6.f54131D);
                com.google.android.gms.internal.ads.AbstractC5250tb0 abstractC5250tb0A = this.f35632c.a(i6, interfaceC7083c0);
                if (enumC6886cE != null && abstractC5250tb0A != null) {
                    java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f35637h;
                    if (atomicInteger != null) {
                        abstractC5250tb0A.s(atomicInteger.get());
                    }
                    abstractC5250tb0A.u(this.f35633d);
                    q(d(str, enumC6886cE), abstractC5250tb0A);
                    enumMap.put(enumC6886cE, java.lang.Integer.valueOf(((java.lang.Integer) j$.util.Map.EL.getOrDefault(enumMap, enumC6886cE, 0)).intValue() + 1));
                }
            }
            this.f35633d.f(enumMap, this.f35636g.a());
            p174r3.v.e().c(new com.google.android.gms.internal.ads.C3603eb0(this));
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean k(java.lang.String str) {
        return t(str, p104k3.EnumC6886c.APP_OPEN_AD);
    }

    public final synchronized boolean l(java.lang.String str) {
        return t(str, p104k3.EnumC6886c.INTERSTITIAL);
    }

    public final synchronized boolean m(java.lang.String str) {
        return t(str, p104k3.EnumC6886c.REWARDED);
    }
}
