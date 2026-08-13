package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6110r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.AbstractC6110r0 f41162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final com.google.android.gms.internal.measurement.AbstractC6110r0 f41163b;

    static {
        com.google.android.gms.internal.measurement.AbstractC6103q0 abstractC6103q0B = new com.google.android.gms.internal.measurement.C6032i0().e("").c(false).b(com.google.android.gms.internal.measurement.EnumC6126t0.ALL_CHECKS);
        com.google.android.gms.internal.measurement.EnumC6118s0 enumC6118s0 = com.google.android.gms.internal.measurement.EnumC6118s0.READ_AND_WRITE;
        f41162a = abstractC6103q0B.a(enumC6118s0).d();
        f41163b = new com.google.android.gms.internal.measurement.C6032i0().e("").c(false).b(com.google.android.gms.internal.measurement.EnumC6126t0.NO_CHECKS).a(enumC6118s0).d();
        new com.google.android.gms.internal.measurement.C6032i0().e("").c(false).b(com.google.android.gms.internal.measurement.EnumC6126t0.SKIP_COMPLIANCE_CHECK).a(enumC6118s0).d();
    }

    public abstract com.google.android.gms.internal.measurement.InterfaceC6023h0 a();

    public abstract com.google.android.gms.internal.measurement.InterfaceC6014g0 b();

    public abstract com.google.android.gms.internal.measurement.EnumC6126t0 c();

    public abstract com.google.android.gms.internal.measurement.EnumC6118s0 d();

    public abstract java.lang.String e();

    public abstract boolean f();
}
