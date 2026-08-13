package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4704od {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5363ud f37842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3004Xe f37843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f37844c;

    private C4704od() {
        this.f37843b = com.google.android.gms.internal.ads.C3040Ye.v0();
        this.f37844c = false;
        this.f37842a = new com.google.android.gms.internal.ads.C5363ud();
    }

    public C4704od(com.google.android.gms.internal.ads.C5363ud c5363ud) {
        this.f37843b = com.google.android.gms.internal.ads.C3040Ye.v0();
        this.f37842a = c5363ud;
        this.f37844c = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25453W4)).booleanValue();
    }

    public static com.google.android.gms.internal.ads.C4704od a() {
        return new com.google.android.gms.internal.ads.C4704od();
    }

    private final synchronized java.lang.String d(int i6) {
        return java.lang.String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.f37843b.G(), java.lang.Long.valueOf(p174r3.v.c().c()), java.lang.Integer.valueOf(i6 - 1), android.util.Base64.encodeToString(((com.google.android.gms.internal.ads.C3040Ye) this.f37843b.u()).l(), 3));
    }

    private final synchronized void e(int i6) {
        java.io.File externalStorageDirectory = android.os.Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(new java.io.File(com.google.android.gms.internal.ads.AbstractC4267ke0.a(com.google.android.gms.internal.ads.AbstractC4157je0.a(), externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                fileOutputStream.write(d(i6).getBytes());
            } catch (java.io.IOException unused) {
                p214v3.AbstractC7265q0.k("Could not write Clearcut to file.");
            } finally {
                try {
                    fileOutputStream.close();
                } catch (java.io.IOException unused2) {
                    p214v3.AbstractC7265q0.k("Could not close Clearcut output stream.");
                }
            }
        } catch (java.io.FileNotFoundException unused3) {
            p214v3.AbstractC7265q0.k("Could not find file for Clearcut");
        }
    }

    private final synchronized void f(int i6) {
        com.google.android.gms.internal.ads.C3004Xe c3004Xe = this.f37843b;
        c3004Xe.K();
        c3004Xe.J(p214v3.E0.I());
        com.google.android.gms.internal.ads.C5143sd c5143sd = new com.google.android.gms.internal.ads.C5143sd(this.f37842a, ((com.google.android.gms.internal.ads.C3040Ye) this.f37843b.u()).l(), null);
        int i10 = i6 - 1;
        c5143sd.a(i10);
        c5143sd.c();
        p214v3.AbstractC7265q0.k("Logging Event with event code : ".concat(java.lang.String.valueOf(java.lang.Integer.toString(i10, 10))));
    }

    public final synchronized void b(com.google.android.gms.internal.ads.InterfaceC4594nd interfaceC4594nd) {
        if (this.f37844c) {
            try {
                interfaceC4594nd.a(this.f37843b);
            } catch (java.lang.NullPointerException e6) {
                p174r3.v.s().x(e6, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void c(int i6) {
        if (this.f37844c) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25464X4)).booleanValue()) {
                e(i6);
            } else {
                f(i6);
            }
        }
    }
}
