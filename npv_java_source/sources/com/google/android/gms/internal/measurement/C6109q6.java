package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6109q6 implements com.google.android.gms.internal.measurement.InterfaceC6116r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41160b;

    static {
        com.google.android.gms.internal.measurement.C6121s3 c6121s3E = new com.google.android.gms.internal.measurement.C6121s3(com.google.android.gms.internal.measurement.AbstractC6062l3.a("com.google.android.gms.measurement")).f().e();
        f41159a = c6121s3E.d("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
        f41160b = c6121s3E.d("measurement.set_default_event_parameters_propagate_clear.service", false);
        c6121s3E.b("measurement.id.set_default_event_parameters_propagate_clear.experiment_id", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6116r6
    public final boolean a() {
        return ((java.lang.Boolean) f41159a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6116r6
    public final boolean b() {
        return ((java.lang.Boolean) f41160b.f()).booleanValue();
    }
}
