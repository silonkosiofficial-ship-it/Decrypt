package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class L1 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.L1 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private com.google.android.gms.internal.measurement.O1 zzf;
    private com.google.android.gms.internal.measurement.M1 zzg;
    private boolean zzh;
    private java.lang.String zzi = "";

    public static final class a extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private a() {
            super(com.google.android.gms.internal.measurement.L1.zzc);
        }

        public final com.google.android.gms.internal.measurement.L1.a v(java.lang.String str) {
            r();
            com.google.android.gms.internal.measurement.L1.G((com.google.android.gms.internal.measurement.L1) this.f41216D, str);
            return this;
        }
    }

    static {
        com.google.android.gms.internal.measurement.L1 l6 = new com.google.android.gms.internal.measurement.L1();
        zzc = l6;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.L1.class, l6);
    }

    private L1() {
    }

    static /* synthetic */ void G(com.google.android.gms.internal.measurement.L1 l6, java.lang.String str) {
        str.getClass();
        l6.zze |= 8;
        l6.zzi = str;
    }

    public static com.google.android.gms.internal.measurement.L1 H() {
        return zzc;
    }

    public final com.google.android.gms.internal.measurement.M1 I() {
        com.google.android.gms.internal.measurement.M1 m6 = this.zzg;
        return m6 == null ? com.google.android.gms.internal.measurement.M1.H() : m6;
    }

    public final com.google.android.gms.internal.measurement.O1 J() {
        com.google.android.gms.internal.measurement.O1 o6 = this.zzf;
        return o6 == null ? com.google.android.gms.internal.measurement.O1.H() : o6;
    }

    public final java.lang.String K() {
        return this.zzi;
    }

    public final boolean L() {
        return this.zzh;
    }

    public final boolean M() {
        return (this.zze & 4) != 0;
    }

    public final boolean N() {
        return (this.zze & 2) != 0;
    }

    public final boolean O() {
        return (this.zze & 8) != 0;
    }

    public final boolean P() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.I1.f40540a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.L1();
            case 2:
                return new com.google.android.gms.internal.measurement.L1.a();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new java.lang.Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.L1.class) {
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
