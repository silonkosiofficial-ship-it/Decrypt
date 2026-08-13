package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6047j6 implements com.google.android.gms.internal.measurement.InterfaceC6020g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40998a;

    static {
        com.google.android.gms.internal.measurement.C6121s3 c6121s3E = new com.google.android.gms.internal.measurement.C6121s3(com.google.android.gms.internal.measurement.AbstractC6062l3.a("com.google.android.gms.measurement")).f().e();
        c6121s3E.d("measurement.client.consent_state_v1", true);
        c6121s3E.d("measurement.client.3p_consent_state_v1", true);
        c6121s3E.d("measurement.service.consent_state_v1_W36", true);
        f40998a = c6121s3E.b("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6020g6
    public final long a() {
        return ((java.lang.Long) f40998a.f()).longValue();
    }
}
