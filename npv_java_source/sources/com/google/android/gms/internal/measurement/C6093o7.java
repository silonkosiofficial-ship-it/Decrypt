package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6093o7 implements com.google.android.gms.internal.measurement.p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41135a;

    static {
        com.google.android.gms.internal.measurement.C6121s3 c6121s3E = new com.google.android.gms.internal.measurement.C6121s3(com.google.android.gms.internal.measurement.AbstractC6062l3.a("com.google.android.gms.measurement")).f().e();
        c6121s3E.d("measurement.collection.enable_session_stitching_token.client.dev", true);
        c6121s3E.d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f41135a = c6121s3E.d("measurement.session_stitching_token_enabled", false);
        c6121s3E.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final boolean b() {
        return ((java.lang.Boolean) f41135a.f()).booleanValue();
    }
}
