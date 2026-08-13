package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class J1 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.J1 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private int zzf;
    private com.google.android.gms.internal.measurement.D4 zzg = com.google.android.gms.internal.measurement.AbstractC6130t4.B();
    private com.google.android.gms.internal.measurement.D4 zzh = com.google.android.gms.internal.measurement.AbstractC6130t4.B();
    private boolean zzi;
    private boolean zzj;

    public static final class a extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private a() {
            super(com.google.android.gms.internal.measurement.J1.zzc);
        }

        public final com.google.android.gms.internal.measurement.N1 A(int i6) {
            return ((com.google.android.gms.internal.measurement.J1) this.f41216D).J(i6);
        }

        public final int v() {
            return ((com.google.android.gms.internal.measurement.J1) this.f41216D).I();
        }

        public final com.google.android.gms.internal.measurement.J1.a w(int i6, com.google.android.gms.internal.measurement.K1.a aVar) {
            r();
            com.google.android.gms.internal.measurement.J1.G((com.google.android.gms.internal.measurement.J1) this.f41216D, i6, (com.google.android.gms.internal.measurement.K1) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q()));
            return this;
        }

        public final com.google.android.gms.internal.measurement.J1.a x(int i6, com.google.android.gms.internal.measurement.N1.a aVar) {
            r();
            com.google.android.gms.internal.measurement.J1.H((com.google.android.gms.internal.measurement.J1) this.f41216D, i6, (com.google.android.gms.internal.measurement.N1) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q()));
            return this;
        }

        public final com.google.android.gms.internal.measurement.K1 y(int i6) {
            return ((com.google.android.gms.internal.measurement.J1) this.f41216D).F(i6);
        }

        public final int z() {
            return ((com.google.android.gms.internal.measurement.J1) this.f41216D).K();
        }
    }

    static {
        com.google.android.gms.internal.measurement.J1 j6 = new com.google.android.gms.internal.measurement.J1();
        zzc = j6;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.J1.class, j6);
    }

    private J1() {
    }

    static /* synthetic */ void G(com.google.android.gms.internal.measurement.J1 j6, int i6, com.google.android.gms.internal.measurement.K1 k6) {
        k6.getClass();
        com.google.android.gms.internal.measurement.D4 d6 = j6.zzh;
        if (!d6.c()) {
            j6.zzh = com.google.android.gms.internal.measurement.AbstractC6130t4.p(d6);
        }
        j6.zzh.set(i6, k6);
    }

    static /* synthetic */ void H(com.google.android.gms.internal.measurement.J1 j6, int i6, com.google.android.gms.internal.measurement.N1 n6) {
        n6.getClass();
        com.google.android.gms.internal.measurement.D4 d6 = j6.zzg;
        if (!d6.c()) {
            j6.zzg = com.google.android.gms.internal.measurement.AbstractC6130t4.p(d6);
        }
        j6.zzg.set(i6, n6);
    }

    public final com.google.android.gms.internal.measurement.K1 F(int i6) {
        return (com.google.android.gms.internal.measurement.K1) this.zzh.get(i6);
    }

    public final int I() {
        return this.zzh.size();
    }

    public final com.google.android.gms.internal.measurement.N1 J(int i6) {
        return (com.google.android.gms.internal.measurement.N1) this.zzg.get(i6);
    }

    public final int K() {
        return this.zzg.size();
    }

    public final java.util.List M() {
        return this.zzh;
    }

    public final java.util.List N() {
        return this.zzg;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    public final int k() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.I1.f40540a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.J1();
            case 2:
                return new com.google.android.gms.internal.measurement.J1.a();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new java.lang.Object[]{"zze", "zzf", "zzg", com.google.android.gms.internal.measurement.N1.class, "zzh", com.google.android.gms.internal.measurement.K1.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.J1.class) {
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
