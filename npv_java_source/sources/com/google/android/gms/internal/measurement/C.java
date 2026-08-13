package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.C6167y1 f40456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.C5963a3 f40457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.google.android.gms.internal.measurement.C5986d f40458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.C5968b f40459d;

    public C() {
        this(new com.google.android.gms.internal.measurement.C6167y1());
    }

    private C(com.google.android.gms.internal.measurement.C6167y1 c6167y1) {
        this.f40456a = c6167y1;
        this.f40457b = c6167y1.f41301b.d();
        this.f40458c = new com.google.android.gms.internal.measurement.C5986d();
        this.f40459d = new com.google.android.gms.internal.measurement.C5968b();
        c6167y1.b("internal.registerCallback", new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f40784a.e();
            }
        });
        c6167y1.b("internal.eventLogger", new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.measurement.F0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return new com.google.android.gms.internal.measurement.A4(this.f40502a.f40458c);
            }
        });
    }

    public final com.google.android.gms.internal.measurement.C5986d a() {
        return this.f40458c;
    }

    public final void b(com.google.android.gms.internal.measurement.C2 c6) throws com.google.android.gms.internal.measurement.C5996e0 {
        com.google.android.gms.internal.measurement.AbstractC6076n abstractC6076n;
        try {
            this.f40457b = this.f40456a.f41301b.d();
            if (this.f40456a.a(this.f40457b, (com.google.android.gms.internal.measurement.D2[]) c6.H().toArray(new com.google.android.gms.internal.measurement.D2[0])) instanceof com.google.android.gms.internal.measurement.C6058l) {
                throw new java.lang.IllegalStateException("Program loading failed");
            }
            for (com.google.android.gms.internal.measurement.B2 b6 : c6.F().H()) {
                java.util.List listH = b6.H();
                java.lang.String strG = b6.G();
                java.util.Iterator it = listH.iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sA = this.f40456a.a(this.f40457b, (com.google.android.gms.internal.measurement.D2) it.next());
                    if (!(interfaceC6117sA instanceof com.google.android.gms.internal.measurement.r)) {
                        throw new java.lang.IllegalArgumentException("Invalid rule definition");
                    }
                    com.google.android.gms.internal.measurement.C5963a3 c5963a3 = this.f40457b;
                    if (c5963a3.g(strG)) {
                        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sC = c5963a3.c(strG);
                        if (!(interfaceC6117sC instanceof com.google.android.gms.internal.measurement.AbstractC6076n)) {
                            throw new java.lang.IllegalStateException("Invalid function name: " + strG);
                        }
                        abstractC6076n = (com.google.android.gms.internal.measurement.AbstractC6076n) interfaceC6117sC;
                    } else {
                        abstractC6076n = null;
                    }
                    if (abstractC6076n == null) {
                        throw new java.lang.IllegalStateException("Rule function is undefined: " + strG);
                    }
                    abstractC6076n.a(this.f40457b, java.util.Collections.singletonList(interfaceC6117sA));
                }
            }
        } catch (java.lang.Throwable th) {
            throw new com.google.android.gms.internal.measurement.C5996e0(th);
        }
    }

    public final void c(java.lang.String str, java.util.concurrent.Callable callable) {
        this.f40456a.b(str, callable);
    }

    public final boolean d(com.google.android.gms.internal.measurement.C5995e c5995e) {
        try {
            this.f40458c.b(c5995e);
            this.f40456a.f41302c.h("runtime.counter", new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(0.0d)));
            this.f40459d.b(this.f40457b.d(), this.f40458c);
            return g() || f();
        } catch (java.lang.Throwable th) {
            throw new com.google.android.gms.internal.measurement.C5996e0(th);
        }
    }

    final /* synthetic */ com.google.android.gms.internal.measurement.AbstractC6076n e() {
        return new com.google.android.gms.internal.measurement.L7(this.f40459d);
    }

    public final boolean f() {
        return !this.f40458c.f().isEmpty();
    }

    public final boolean g() {
        return !this.f40458c.d().equals(this.f40458c.a());
    }
}
