package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6148v6 implements com.google.android.gms.internal.measurement.InterfaceC6124s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41259c;

    static {
        com.google.android.gms.internal.measurement.C6121s3 c6121s3E = new com.google.android.gms.internal.measurement.C6121s3(com.google.android.gms.internal.measurement.AbstractC6062l3.a("com.google.android.gms.measurement")).f().e();
        c6121s3E.d("measurement.dma_consent.client", true);
        c6121s3E.d("measurement.dma_consent.client_bow_check2", true);
        c6121s3E.d("measurement.dma_consent.separate_service_calls_fix", true);
        c6121s3E.d("measurement.dma_consent.service", true);
        f41257a = c6121s3E.d("measurement.dma_consent.service_database_update_fix", true);
        c6121s3E.d("measurement.dma_consent.service_dcu_event", true);
        f41258b = c6121s3E.d("measurement.dma_consent.service_dcu_event2", true);
        c6121s3E.d("measurement.dma_consent.service_npa_remote_default", true);
        c6121s3E.d("measurement.dma_consent.service_split_batch_on_consent", true);
        c6121s3E.d("measurement.dma_consent.set_consent_inline_on_worker", true);
        f41259c = c6121s3E.d("measurement.dma_consent.setting_npa_inline_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6124s6
    public final boolean a() {
        return ((java.lang.Boolean) f41257a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6124s6
    public final boolean b() {
        return ((java.lang.Boolean) f41258b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6124s6
    public final boolean c() {
        return ((java.lang.Boolean) f41259c.f()).booleanValue();
    }
}
