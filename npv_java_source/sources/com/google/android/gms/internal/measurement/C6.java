package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class C6 implements com.google.android.gms.internal.measurement.InterfaceC6180z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40464b;

    static {
        com.google.android.gms.internal.measurement.C6121s3 c6121s3E = new com.google.android.gms.internal.measurement.C6121s3(com.google.android.gms.internal.measurement.AbstractC6062l3.a("com.google.android.gms.measurement")).f().e();
        c6121s3E.d("measurement.client.ad_id_consent_fix", true);
        c6121s3E.d("measurement.service.consent.aiid_reset_fix", false);
        c6121s3E.d("measurement.service.consent.aiid_reset_fix2", true);
        c6121s3E.d("measurement.service.consent.app_start_fix", true);
        f40463a = c6121s3E.d("measurement.service.consent.params_on_fx", true);
        f40464b = c6121s3E.d("measurement.service.consent.pfo_on_fx", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6180z6
    public final boolean a() {
        return ((java.lang.Boolean) f40463a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6180z6
    public final boolean b() {
        return ((java.lang.Boolean) f40464b.f()).booleanValue();
    }
}
