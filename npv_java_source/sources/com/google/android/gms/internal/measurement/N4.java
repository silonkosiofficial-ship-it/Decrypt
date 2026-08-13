package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class N4 implements com.google.android.gms.internal.measurement.InterfaceC6091o5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.W4 f40594b = new com.google.android.gms.internal.measurement.M4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.W4 f40595a;

    public N4() {
        this(new com.google.android.gms.internal.measurement.O4(com.google.android.gms.internal.measurement.C6138u4.c(), f40594b));
    }

    private N4(com.google.android.gms.internal.measurement.W4 w6) {
        this.f40595a = (com.google.android.gms.internal.measurement.W4) com.google.android.gms.internal.measurement.AbstractC6146v4.f(w6, "messageInfoFactory");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6091o5
    public final com.google.android.gms.internal.measurement.InterfaceC6100p5 a(java.lang.Class cls) {
        com.google.android.gms.internal.measurement.AbstractC6115r5.o(cls);
        com.google.android.gms.internal.measurement.Y4 y4A = this.f40595a.a(cls);
        if (y4A.c()) {
            return com.google.android.gms.internal.measurement.C6001e5.j(com.google.android.gms.internal.measurement.AbstractC6115r5.f(), com.google.android.gms.internal.measurement.AbstractC6045j4.a(), y4A.a());
        }
        return com.google.android.gms.internal.measurement.C5992d5.n(cls, y4A, com.google.android.gms.internal.measurement.AbstractC6037i5.a(), com.google.android.gms.internal.measurement.L4.a(), com.google.android.gms.internal.measurement.AbstractC6115r5.f(), com.google.android.gms.internal.measurement.P4.f40640a[y4A.b().ordinal()] != 1 ? com.google.android.gms.internal.measurement.AbstractC6045j4.a() : null, com.google.android.gms.internal.measurement.U4.a());
    }
}
