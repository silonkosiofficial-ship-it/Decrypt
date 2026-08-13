package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ld0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2565Ld0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.io.File f29530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.io.File f29531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.SharedPreferences f29532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29533d;

    public C2565Ld0(android.content.Context context, int i6) {
        this.f29532c = context.getSharedPreferences("pcvmspf", 0);
        java.io.File dir = context.getDir("pccache", 0);
        com.google.android.gms.internal.ads.AbstractC2601Md0.a(dir, false);
        this.f29530a = dir;
        java.io.File dir2 = context.getDir("tmppccache", 0);
        com.google.android.gms.internal.ads.AbstractC2601Md0.a(dir2, true);
        this.f29531b = dir2;
        this.f29533d = i6;
    }

    private final java.io.File d() {
        java.io.File file = new java.io.File(this.f29530a, java.lang.Integer.toString(this.f29533d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final java.lang.String e() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FBAMTD");
        sb.append(this.f29533d - 1);
        return sb.toString();
    }

    private final java.lang.String f() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LATMTD");
        sb.append(this.f29533d - 1);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    public final boolean a(com.google.android.gms.internal.ads.C5799yb c5799yb, com.google.android.gms.internal.ads.InterfaceC2823Sd0 interfaceC2823Sd0) {
        boolean z6;
        java.lang.String strK0 = c5799yb.d0().k0();
        byte[] bArrD = c5799yb.f0().d();
        byte[] bArrD2 = c5799yb.e0().d();
        if (!android.text.TextUtils.isEmpty(strK0) && bArrD2 != null && bArrD2.length != 0) {
            com.google.android.gms.internal.ads.AbstractC2601Md0.d(this.f29531b);
            this.f29531b.mkdirs();
            com.google.android.gms.internal.ads.AbstractC2601Md0.c(strK0, this.f29531b).mkdirs();
            java.io.File fileB = com.google.android.gms.internal.ads.AbstractC2601Md0.b(strK0, "pcam.jar", this.f29531b);
            if ((bArrD == null || bArrD.length <= 0 || com.google.android.gms.internal.ads.AbstractC2601Md0.e(fileB, bArrD)) && com.google.android.gms.internal.ads.AbstractC2601Md0.e(com.google.android.gms.internal.ads.AbstractC2601Md0.b(strK0, "pcbc", this.f29531b), bArrD2)) {
                java.io.File fileB2 = com.google.android.gms.internal.ads.AbstractC2601Md0.b(c5799yb.d0().k0(), "pcam.jar", this.f29531b);
                if (fileB2.exists() && interfaceC2823Sd0 != null && !interfaceC2823Sd0.a(fileB2)) {
                    return false;
                }
                java.lang.String strK1 = c5799yb.d0().k0();
                if (android.text.TextUtils.isEmpty(strK1)) {
                    z6 = false;
                } else {
                    java.io.File fileB3 = com.google.android.gms.internal.ads.AbstractC2601Md0.b(strK1, "pcam.jar", this.f29531b);
                    java.io.File fileB4 = com.google.android.gms.internal.ads.AbstractC2601Md0.b(strK1, "pcbc", this.f29531b);
                    java.io.File fileB5 = com.google.android.gms.internal.ads.AbstractC2601Md0.b(strK1, "pcam.jar", d());
                    java.io.File fileB6 = com.google.android.gms.internal.ads.AbstractC2601Md0.b(strK1, "pcbc", d());
                    if ((!fileB3.exists() || fileB3.renameTo(fileB5)) && fileB4.exists() && fileB4.renameTo(fileB6)) {
                        com.google.android.gms.internal.ads.C5909zb c5909zbE0 = com.google.android.gms.internal.ads.C2190Bb.e0();
                        c5909zbE0.E(c5799yb.d0().k0());
                        c5909zbE0.z(c5799yb.d0().j0());
                        c5909zbE0.A(c5799yb.d0().b0());
                        c5909zbE0.C(c5799yb.d0().d0());
                        c5909zbE0.B(c5799yb.d0().c0());
                        com.google.android.gms.internal.ads.C2190Bb c2190Bb = (com.google.android.gms.internal.ads.C2190Bb) c5909zbE0.u();
                        com.google.android.gms.internal.ads.C2190Bb c2190BbB = b(1);
                        android.content.SharedPreferences.Editor editorEdit = this.f29532c.edit();
                        if (c2190BbB != null && !c2190Bb.k0().equals(c2190BbB.k0())) {
                            editorEdit.putString(e(), V3.k.a(c2190BbB.l()));
                        }
                        editorEdit.putString(f(), V3.k.a(c2190Bb.l()));
                        if (editorEdit.commit()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        z6 = false;
                    }
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                com.google.android.gms.internal.ads.C2190Bb c2190BbB2 = b(1);
                if (c2190BbB2 != null) {
                    hashSet.add(c2190BbB2.k0());
                }
                com.google.android.gms.internal.ads.C2190Bb c2190BbB3 = b(2);
                if (c2190BbB3 != null) {
                    hashSet.add(c2190BbB3.k0());
                }
                for (java.io.File file : d().listFiles()) {
                    java.lang.String name = file.getName();
                    if (!hashSet.contains(name)) {
                        com.google.android.gms.internal.ads.AbstractC2601Md0.d(com.google.android.gms.internal.ads.AbstractC2601Md0.c(name, d()));
                    }
                }
                return z6;
            }
        }
        return false;
    }

    final com.google.android.gms.internal.ads.C2190Bb b(int i6) {
        android.content.SharedPreferences sharedPreferences;
        java.lang.String strE;
        if (i6 == 1) {
            sharedPreferences = this.f29532c;
            strE = f();
        } else {
            sharedPreferences = this.f29532c;
            strE = e();
        }
        java.lang.String string = sharedPreferences.getString(strE, null);
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrC = V3.k.c(string);
            com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0 = com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;
            com.google.android.gms.internal.ads.C2190Bb c2190BbH0 = com.google.android.gms.internal.ads.C2190Bb.h0(com.google.android.gms.internal.ads.AbstractC3753fv0.T(bArrC, 0, bArrC.length));
            java.lang.String strK0 = c2190BbH0.k0();
            java.io.File fileB = com.google.android.gms.internal.ads.AbstractC2601Md0.b(strK0, "pcam.jar", d());
            if (!fileB.exists()) {
                fileB = com.google.android.gms.internal.ads.AbstractC2601Md0.b(strK0, "pcam", d());
            }
            java.io.File fileB2 = com.google.android.gms.internal.ads.AbstractC2601Md0.b(strK0, "pcbc", d());
            if (fileB.exists() && fileB2.exists()) {
                return c2190BbH0;
            }
            return null;
        } catch (com.google.android.gms.internal.ads.Vv0 unused) {
        }
    }

    public final com.google.android.gms.internal.ads.C2528Kd0 c(int i6) {
        com.google.android.gms.internal.ads.C2190Bb c2190BbB = b(1);
        if (c2190BbB == null) {
            return null;
        }
        java.lang.String strK0 = c2190BbB.k0();
        java.io.File fileB = com.google.android.gms.internal.ads.AbstractC2601Md0.b(strK0, "pcam.jar", d());
        if (!fileB.exists()) {
            fileB = com.google.android.gms.internal.ads.AbstractC2601Md0.b(strK0, "pcam", d());
        }
        return new com.google.android.gms.internal.ads.C2528Kd0(c2190BbB, fileB, com.google.android.gms.internal.ads.AbstractC2601Md0.b(strK0, "pcbc", d()), com.google.android.gms.internal.ads.AbstractC2601Md0.b(strK0, "pcopt", d()));
    }
}
