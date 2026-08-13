package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class V6 implements com.google.android.gms.internal.measurement.W6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40696b;

    static {
        com.google.android.gms.internal.measurement.C6121s3 c6121s3E = new com.google.android.gms.internal.measurement.C6121s3(com.google.android.gms.internal.measurement.AbstractC6062l3.a("com.google.android.gms.measurement")).f().e();
        f40695a = c6121s3E.d("measurement.gmscore_feature_tracking", true);
        f40696b = c6121s3E.d("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.W6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.W6
    public final boolean b() {
        return ((java.lang.Boolean) f40695a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.W6
    public final boolean c() {
        return ((java.lang.Boolean) f40696b.f()).booleanValue();
    }
}
