package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3658f20 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2530Ke0 f35246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2530Ke0 f35247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f35249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f35250e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f35251f;

    public C3658f20(com.google.android.gms.internal.ads.C2530Ke0 c2530Ke0, com.google.android.gms.internal.ads.C2530Ke0 c2530Ke1, boolean z6, boolean z10, boolean z11) {
        this.f35246a = c2530Ke0;
        this.f35247b = c2530Ke1;
        this.f35248c = z6;
        this.f35249d = z10;
        this.f35251f = z11;
    }

    public C3658f20(boolean z6) {
        this.f35251f = z6;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x008e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a;
        if (this.f35250e) {
            return;
        }
        android.os.Bundle bundleA = com.google.android.gms.internal.ads.B70.a(bundle, "pii");
        if (!this.f35251f) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25539e3)).booleanValue()) {
                if (this.f35246a.c()) {
                    bundleA.putString("paidv1_id_android", this.f35246a.b());
                    bundleA.putLong("paidv1_creation_time_android", this.f35246a.a());
                }
            } else if (this.f35251f) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25561g3)).booleanValue()) {
                    if (this.f35246a.c()) {
                        bundleA.putString("paidv1_id_android", this.f35246a.b());
                        bundleA.putLong("paidv1_creation_time_android", this.f35246a.a());
                    }
                }
            }
        } else if (this.f35251f) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25561g3)).booleanValue()) {
                if (this.f35246a.c()) {
                    bundleA.putString("paidv1_id_android", this.f35246a.b());
                    bundleA.putLong("paidv1_creation_time_android", this.f35246a.a());
                }
            }
        }
        if (!this.f35251f) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25550f3)).booleanValue()) {
                if (this.f35247b.c()) {
                    bundleA.putString("paidv2_id_android", this.f35247b.b());
                    bundleA.putLong("paidv2_creation_time_android", this.f35247b.a());
                }
                bundleA.putBoolean("paidv2_pub_option_android", this.f35248c);
                bundleA.putBoolean("paidv2_user_option_android", this.f35249d);
            } else if (this.f35251f) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25572h3)).booleanValue()) {
                    if (this.f35247b.c()) {
                        bundleA.putString("paidv2_id_android", this.f35247b.b());
                        bundleA.putLong("paidv2_creation_time_android", this.f35247b.a());
                    }
                    bundleA.putBoolean("paidv2_pub_option_android", this.f35248c);
                    bundleA.putBoolean("paidv2_user_option_android", this.f35249d);
                }
            }
        } else if (this.f35251f) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25572h3)).booleanValue()) {
                if (this.f35247b.c()) {
                    bundleA.putString("paidv2_id_android", this.f35247b.b());
                    bundleA.putLong("paidv2_creation_time_android", this.f35247b.a());
                }
                bundleA.putBoolean("paidv2_pub_option_android", this.f35248c);
                bundleA.putBoolean("paidv2_user_option_android", this.f35249d);
            }
        }
        if (bundleA.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", bundleA);
    }
}
