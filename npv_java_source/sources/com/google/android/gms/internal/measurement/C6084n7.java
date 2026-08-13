package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6084n7 implements com.google.android.gms.internal.measurement.InterfaceC6057k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41118k;

    static {
        com.google.android.gms.internal.measurement.C6121s3 c6121s3E = new com.google.android.gms.internal.measurement.C6121s3(com.google.android.gms.internal.measurement.AbstractC6062l3.a("com.google.android.gms.measurement")).f().e();
        f41108a = c6121s3E.d("measurement.rb.attribution.ad_campaign_info", false);
        f41109b = c6121s3E.d("measurement.rb.attribution.client.bundle_on_backgrounded", true);
        f41110c = c6121s3E.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f41111d = c6121s3E.d("measurement.rb.attribution.client2", true);
        c6121s3E.d("measurement.rb.attribution.dma_fix", true);
        f41112e = c6121s3E.d("measurement.rb.attribution.followup1.service", false);
        c6121s3E.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f41113f = c6121s3E.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f41114g = c6121s3E.d("measurement.rb.attribution.retry_disposition", false);
        f41115h = c6121s3E.d("measurement.rb.attribution.service", true);
        f41116i = c6121s3E.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f41117j = c6121s3E.d("measurement.rb.attribution.uuid_generation", true);
        c6121s3E.b("measurement.id.rb.attribution.retry_disposition", 0L);
        f41118k = c6121s3E.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6057k7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6057k7
    public final boolean b() {
        return ((java.lang.Boolean) f41108a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6057k7
    public final boolean c() {
        return ((java.lang.Boolean) f41109b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6057k7
    public final boolean d() {
        return ((java.lang.Boolean) f41111d.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6057k7
    public final boolean e() {
        return ((java.lang.Boolean) f41112e.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6057k7
    public final boolean f() {
        return ((java.lang.Boolean) f41110c.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6057k7
    public final boolean g() {
        return ((java.lang.Boolean) f41114g.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6057k7
    public final boolean h() {
        return ((java.lang.Boolean) f41115h.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6057k7
    public final boolean i() {
        return ((java.lang.Boolean) f41113f.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6057k7
    public final boolean j() {
        return ((java.lang.Boolean) f41116i.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6057k7
    public final boolean k() {
        return ((java.lang.Boolean) f41117j.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6057k7
    public final boolean l() {
        return ((java.lang.Boolean) f41118k.f()).booleanValue();
    }
}
