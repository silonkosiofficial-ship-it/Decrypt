package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5976b7 implements com.google.android.gms.internal.measurement.Y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40804a;

    static {
        com.google.android.gms.internal.measurement.C6121s3 c6121s3E = new com.google.android.gms.internal.measurement.C6121s3(com.google.android.gms.internal.measurement.AbstractC6062l3.a("com.google.android.gms.measurement")).f().e();
        f40804a = c6121s3E.d("measurement.gmscore_network_migration", false);
        c6121s3E.b("measurement.id.gmscore_network_migration", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.Y6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.Y6
    public final boolean b() {
        return ((java.lang.Boolean) f40804a.f()).booleanValue();
    }
}
