package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class u7 implements com.google.android.gms.internal.measurement.v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41244e;

    static {
        com.google.android.gms.internal.measurement.C6121s3 c6121s3E = new com.google.android.gms.internal.measurement.C6121s3(com.google.android.gms.internal.measurement.AbstractC6062l3.a("com.google.android.gms.measurement")).f().e();
        f41240a = c6121s3E.d("measurement.sgtm.google_signal.enable", false);
        f41241b = c6121s3E.d("measurement.sgtm.preview_mode_enabled", true);
        f41242c = c6121s3E.d("measurement.sgtm.rollout_percentage_fix", false);
        f41243d = c6121s3E.d("measurement.sgtm.service", true);
        f41244e = c6121s3E.d("measurement.sgtm.upload_queue", false);
        c6121s3E.b("measurement.id.sgtm", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.v7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.v7
    public final boolean b() {
        return ((java.lang.Boolean) f41240a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.v7
    public final boolean c() {
        return ((java.lang.Boolean) f41241b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.v7
    public final boolean d() {
        return ((java.lang.Boolean) f41243d.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.v7
    public final boolean e() {
        return ((java.lang.Boolean) f41244e.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.v7
    public final boolean f() {
        return ((java.lang.Boolean) f41242c.f()).booleanValue();
    }
}
