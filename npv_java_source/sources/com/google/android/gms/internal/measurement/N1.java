package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class N1 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.N1 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private int zzf;
    private java.lang.String zzg = "";
    private com.google.android.gms.internal.measurement.L1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public static final class a extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private a() {
            super(com.google.android.gms.internal.measurement.N1.zzc);
        }

        public final com.google.android.gms.internal.measurement.N1.a v(java.lang.String str) {
            r();
            com.google.android.gms.internal.measurement.N1.F((com.google.android.gms.internal.measurement.N1) this.f41216D, str);
            return this;
        }
    }

    static {
        com.google.android.gms.internal.measurement.N1 n6 = new com.google.android.gms.internal.measurement.N1();
        zzc = n6;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.N1.class, n6);
    }

    private N1() {
    }

    static /* synthetic */ void F(com.google.android.gms.internal.measurement.N1 n6, java.lang.String str) {
        str.getClass();
        n6.zze |= 2;
        n6.zzg = str;
    }

    public static com.google.android.gms.internal.measurement.N1.a H() {
        return (com.google.android.gms.internal.measurement.N1.a) zzc.w();
    }

    public final com.google.android.gms.internal.measurement.L1 G() {
        com.google.android.gms.internal.measurement.L1 l6 = this.zzh;
        return l6 == null ? com.google.android.gms.internal.measurement.L1.H() : l6;
    }

    public final java.lang.String J() {
        return this.zzg;
    }

    public final boolean K() {
        return this.zzi;
    }

    public final boolean L() {
        return this.zzj;
    }

    public final boolean M() {
        return this.zzk;
    }

    public final boolean N() {
        return (this.zze & 1) != 0;
    }

    public final boolean O() {
        return (this.zze & 32) != 0;
    }

    public final int k() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.I1.f40540a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.N1();
            case 2:
                return new com.google.android.gms.internal.measurement.N1.a();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new java.lang.Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.N1.class) {
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
