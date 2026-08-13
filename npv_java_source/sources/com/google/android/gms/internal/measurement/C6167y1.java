package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6167y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.E f41300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.google.android.gms.internal.measurement.C5963a3 f41301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.google.android.gms.internal.measurement.C5963a3 f41302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.X4 f41303d;

    public C6167y1() {
        com.google.android.gms.internal.measurement.E e6 = new com.google.android.gms.internal.measurement.E();
        this.f41300a = e6;
        com.google.android.gms.internal.measurement.C5963a3 c5963a3 = new com.google.android.gms.internal.measurement.C5963a3(null, e6);
        this.f41302c = c5963a3;
        this.f41301b = c5963a3.d();
        com.google.android.gms.internal.measurement.X4 x6 = new com.google.android.gms.internal.measurement.X4();
        this.f41303d = x6;
        c5963a3.h("require", new com.google.android.gms.internal.measurement.O7(x6));
        x6.b("internal.platform", new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.measurement.g1
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return new com.google.android.gms.internal.measurement.N7();
            }
        });
        c5963a3.h("runtime.counter", new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(0.0d)));
    }

    public final com.google.android.gms.internal.measurement.InterfaceC6117s a(com.google.android.gms.internal.measurement.C5963a3 c5963a3, com.google.android.gms.internal.measurement.D2... d2Arr) {
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sA = com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
        for (com.google.android.gms.internal.measurement.D2 d6 : d2Arr) {
            interfaceC6117sA = com.google.android.gms.internal.measurement.AbstractC5973b4.a(d6);
            com.google.android.gms.internal.measurement.AbstractC6152w2.b(this.f41302c);
            if ((interfaceC6117sA instanceof com.google.android.gms.internal.measurement.C6141v) || (interfaceC6117sA instanceof com.google.android.gms.internal.measurement.C6125t)) {
                interfaceC6117sA = this.f41300a.a(c5963a3, interfaceC6117sA);
            }
        }
        return interfaceC6117sA;
    }

    public final void b(java.lang.String str, java.util.concurrent.Callable callable) {
        this.f41303d.b(str, callable);
    }
}
