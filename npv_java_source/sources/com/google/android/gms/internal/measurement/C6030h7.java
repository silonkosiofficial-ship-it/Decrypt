package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6030h7 implements com.google.android.gms.internal.measurement.InterfaceC6003e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40968f;

    static {
        com.google.android.gms.internal.measurement.C6121s3 c6121s3E = new com.google.android.gms.internal.measurement.C6121s3(com.google.android.gms.internal.measurement.AbstractC6062l3.a("com.google.android.gms.measurement")).f().e();
        f40963a = c6121s3E.d("measurement.test.boolean_flag", false);
        f40964b = c6121s3E.b("measurement.test.cached_long_flag", -1L);
        f40965c = c6121s3E.a("measurement.test.double_flag", -3.0d);
        f40966d = c6121s3E.b("measurement.test.int_flag", -2L);
        f40967e = c6121s3E.b("measurement.test.long_flag", -1L);
        f40968f = c6121s3E.c("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6003e7
    public final double a() {
        return ((java.lang.Double) f40965c.f()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6003e7
    public final long b() {
        return ((java.lang.Long) f40964b.f()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6003e7
    public final long c() {
        return ((java.lang.Long) f40966d.f()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6003e7
    public final java.lang.String d() {
        return (java.lang.String) f40968f.f();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6003e7
    public final boolean e() {
        return ((java.lang.Boolean) f40963a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6003e7
    public final long f() {
        return ((java.lang.Long) f40967e.f()).longValue();
    }
}
