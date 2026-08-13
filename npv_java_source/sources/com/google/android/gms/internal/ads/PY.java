package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class PY implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.L20 f30744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f30745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f30746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2914Uq f30747d;

    PY(com.google.android.gms.internal.ads.VZ vz, com.google.android.gms.internal.ads.C4546n70 c4546n70, android.content.Context context, com.google.android.gms.internal.ads.C2914Uq c2914Uq) {
        this.f30744a = vz;
        this.f30745b = c4546n70;
        this.f30746c = context;
        this.f30747d = c2914Uq;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.m(this.f30744a.b(), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.OY
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f30519a.c((com.google.android.gms.internal.ads.V20) obj);
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.QY c(com.google.android.gms.internal.ads.V20 v20) {
        java.lang.String str;
        boolean z6;
        java.lang.String strJ;
        float f6;
        int i6;
        int i10;
        int i11;
        android.util.DisplayMetrics displayMetrics;
        p184s3.c2 c2Var = this.f30745b.f37512e;
        p184s3.c2[] c2VarArr = c2Var.f54204I;
        if (c2VarArr != null) {
            str = null;
            boolean z10 = false;
            boolean z11 = false;
            z6 = false;
            for (p184s3.c2 c2Var2 : c2VarArr) {
                boolean z12 = c2Var2.f54206K;
                if (!z12 && !z10) {
                    str = c2Var2.f54198C;
                    z10 = true;
                }
                if (z12) {
                    if (z11) {
                        z11 = true;
                    } else {
                        z11 = true;
                        z6 = true;
                    }
                }
                if (z10 && z11) {
                    break;
                }
            }
        } else {
            str = c2Var.f54198C;
            z6 = c2Var.f54206K;
        }
        android.content.res.Resources resources = this.f30746c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            strJ = null;
            f6 = 0.0f;
            i6 = 0;
            i10 = 0;
        } else {
            com.google.android.gms.internal.ads.C2914Uq c2914Uq = this.f30747d;
            f6 = displayMetrics.density;
            i10 = displayMetrics.widthPixels;
            i6 = displayMetrics.heightPixels;
            strJ = c2914Uq.j().j();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        p184s3.c2[] c2VarArr2 = c2Var.f54204I;
        if (c2VarArr2 != null) {
            boolean z13 = false;
            for (p184s3.c2 c2Var3 : c2VarArr2) {
                if (c2Var3.f54206K) {
                    z13 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i12 = c2Var3.f54202G;
                    if (i12 == -1) {
                        i12 = f6 != 0.0f ? (int) (c2Var3.f54203H / f6) : -1;
                    }
                    sb.append(i12);
                    sb.append("x");
                    int i13 = c2Var3.f54199D;
                    if (i13 == -2) {
                        i13 = f6 != 0.0f ? (int) (c2Var3.f54200E / f6) : -2;
                    }
                    sb.append(i13);
                }
            }
            if (z13) {
                if (sb.length() != 0) {
                    i11 = 0;
                    sb.insert(0, "|");
                } else {
                    i11 = 0;
                }
                sb.insert(i11, "320x50");
            }
        }
        return new com.google.android.gms.internal.ads.QY(c2Var, str, z6, sb.toString(), f6, i10, i6, strJ, this.f30745b.f37524q);
    }
}
