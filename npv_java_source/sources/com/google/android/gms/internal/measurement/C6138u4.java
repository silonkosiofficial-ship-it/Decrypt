package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6138u4 implements com.google.android.gms.internal.measurement.W4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.C6138u4 f41234a = new com.google.android.gms.internal.measurement.C6138u4();

    private C6138u4() {
    }

    public static com.google.android.gms.internal.measurement.C6138u4 c() {
        return f41234a;
    }

    @Override // com.google.android.gms.internal.measurement.W4
    public final com.google.android.gms.internal.measurement.Y4 a(java.lang.Class cls) {
        if (!com.google.android.gms.internal.measurement.AbstractC6130t4.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (com.google.android.gms.internal.measurement.Y4) com.google.android.gms.internal.measurement.AbstractC6130t4.m(cls.asSubclass(com.google.android.gms.internal.measurement.AbstractC6130t4.class)).q(com.google.android.gms.internal.measurement.AbstractC6130t4.c.f41219c, null, null);
        } catch (java.lang.Exception e6) {
            throw new java.lang.RuntimeException("Unable to get message info for " + cls.getName(), e6);
        }
    }

    @Override // com.google.android.gms.internal.measurement.W4
    public final boolean b(java.lang.Class cls) {
        return com.google.android.gms.internal.measurement.AbstractC6130t4.class.isAssignableFrom(cls);
    }
}
