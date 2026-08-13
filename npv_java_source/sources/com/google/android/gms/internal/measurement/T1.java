package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class T1 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.T1 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private java.lang.String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    public static final class a extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private a() {
            super(com.google.android.gms.internal.measurement.T1.zzc);
        }

        public final boolean A() {
            return ((com.google.android.gms.internal.measurement.T1) this.f41216D).K();
        }

        public final boolean B() {
            return ((com.google.android.gms.internal.measurement.T1) this.f41216D).L();
        }

        public final boolean C() {
            return ((com.google.android.gms.internal.measurement.T1) this.f41216D).M();
        }

        public final int v() {
            return ((com.google.android.gms.internal.measurement.T1) this.f41216D).k();
        }

        public final com.google.android.gms.internal.measurement.T1.a w(java.lang.String str) {
            r();
            com.google.android.gms.internal.measurement.T1.F((com.google.android.gms.internal.measurement.T1) this.f41216D, str);
            return this;
        }

        public final java.lang.String x() {
            return ((com.google.android.gms.internal.measurement.T1) this.f41216D).H();
        }

        public final boolean y() {
            return ((com.google.android.gms.internal.measurement.T1) this.f41216D).I();
        }

        public final boolean z() {
            return ((com.google.android.gms.internal.measurement.T1) this.f41216D).J();
        }
    }

    static {
        com.google.android.gms.internal.measurement.T1 t6 = new com.google.android.gms.internal.measurement.T1();
        zzc = t6;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.T1.class, t6);
    }

    private T1() {
    }

    static /* synthetic */ void F(com.google.android.gms.internal.measurement.T1 t6, java.lang.String str) {
        str.getClass();
        t6.zze |= 1;
        t6.zzf = str;
    }

    public final java.lang.String H() {
        return this.zzf;
    }

    public final boolean I() {
        return this.zzg;
    }

    public final boolean J() {
        return this.zzh;
    }

    public final boolean K() {
        return (this.zze & 2) != 0;
    }

    public final boolean L() {
        return (this.zze & 4) != 0;
    }

    public final boolean M() {
        return (this.zze & 8) != 0;
    }

    public final int k() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.AbstractC5971b2.f40800a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.T1();
            case 2:
                return new com.google.android.gms.internal.measurement.T1.a();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new java.lang.Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.T1.class) {
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
