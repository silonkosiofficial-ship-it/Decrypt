package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class K1 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.K1 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private int zzf;
    private java.lang.String zzg = "";
    private com.google.android.gms.internal.measurement.D4 zzh = com.google.android.gms.internal.measurement.AbstractC6130t4.B();
    private boolean zzi;
    private com.google.android.gms.internal.measurement.M1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    public static final class a extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private a() {
            super(com.google.android.gms.internal.measurement.K1.zzc);
        }

        public final int v() {
            return ((com.google.android.gms.internal.measurement.K1) this.f41216D).k();
        }

        public final com.google.android.gms.internal.measurement.K1.a w(int i6, com.google.android.gms.internal.measurement.L1 l6) {
            r();
            com.google.android.gms.internal.measurement.K1.G((com.google.android.gms.internal.measurement.K1) this.f41216D, i6, l6);
            return this;
        }

        public final com.google.android.gms.internal.measurement.K1.a x(java.lang.String str) {
            r();
            com.google.android.gms.internal.measurement.K1.H((com.google.android.gms.internal.measurement.K1) this.f41216D, str);
            return this;
        }

        public final com.google.android.gms.internal.measurement.L1 y(int i6) {
            return ((com.google.android.gms.internal.measurement.K1) this.f41216D).F(i6);
        }

        public final java.lang.String z() {
            return ((com.google.android.gms.internal.measurement.K1) this.f41216D).M();
        }
    }

    static {
        com.google.android.gms.internal.measurement.K1 k6 = new com.google.android.gms.internal.measurement.K1();
        zzc = k6;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.K1.class, k6);
    }

    private K1() {
    }

    static /* synthetic */ void G(com.google.android.gms.internal.measurement.K1 k6, int i6, com.google.android.gms.internal.measurement.L1 l6) {
        l6.getClass();
        com.google.android.gms.internal.measurement.D4 d6 = k6.zzh;
        if (!d6.c()) {
            k6.zzh = com.google.android.gms.internal.measurement.AbstractC6130t4.p(d6);
        }
        k6.zzh.set(i6, l6);
    }

    static /* synthetic */ void H(com.google.android.gms.internal.measurement.K1 k6, java.lang.String str) {
        str.getClass();
        k6.zze |= 2;
        k6.zzg = str;
    }

    public static com.google.android.gms.internal.measurement.K1.a J() {
        return (com.google.android.gms.internal.measurement.K1.a) zzc.w();
    }

    public final com.google.android.gms.internal.measurement.L1 F(int i6) {
        return (com.google.android.gms.internal.measurement.L1) this.zzh.get(i6);
    }

    public final int I() {
        return this.zzf;
    }

    public final com.google.android.gms.internal.measurement.M1 L() {
        com.google.android.gms.internal.measurement.M1 m6 = this.zzj;
        return m6 == null ? com.google.android.gms.internal.measurement.M1.H() : m6;
    }

    public final java.lang.String M() {
        return this.zzg;
    }

    public final java.util.List N() {
        return this.zzh;
    }

    public final boolean O() {
        return this.zzk;
    }

    public final boolean P() {
        return this.zzl;
    }

    public final boolean Q() {
        return this.zzm;
    }

    public final boolean R() {
        return (this.zze & 8) != 0;
    }

    public final boolean S() {
        return (this.zze & 1) != 0;
    }

    public final boolean T() {
        return (this.zze & 64) != 0;
    }

    public final int k() {
        return this.zzh.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.I1.f40540a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.K1();
            case 2:
                return new com.google.android.gms.internal.measurement.K1.a();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new java.lang.Object[]{"zze", "zzf", "zzg", "zzh", com.google.android.gms.internal.measurement.L1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.K1.class) {
                        try {
                            aVar = zzd;
                            if (aVar == null) {
                                aVar = new com.google.android.gms.internal.measurement.AbstractC6130t4.a(zzc);
                                zzd = aVar;
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return aVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }
}
