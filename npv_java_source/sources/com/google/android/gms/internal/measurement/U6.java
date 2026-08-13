package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class U6 implements com.google.android.gms.internal.measurement.R6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40683b;

    static {
        com.google.android.gms.internal.measurement.C6121s3 c6121s3E = new com.google.android.gms.internal.measurement.C6121s3(com.google.android.gms.internal.measurement.AbstractC6062l3.a("com.google.android.gms.measurement")).f().e();
        f40682a = c6121s3E.d("measurement.gbraid_campaign.gbraid.client", true);
        f40683b = c6121s3E.d("measurement.gbraid_campaign.gbraid.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean b() {
        return ((java.lang.Boolean) f40682a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean c() {
        return ((java.lang.Boolean) f40683b.f()).booleanValue();
    }
}
