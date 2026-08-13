package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class M1 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.M1 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private java.lang.String zzh = "";
    private java.lang.String zzi = "";
    private java.lang.String zzj = "";

    public static final class a extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private a() {
            super(com.google.android.gms.internal.measurement.M1.zzc);
        }
    }

    public enum b implements com.google.android.gms.internal.measurement.InterfaceC6170y4 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);


        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f40578C;

        b(int i6) {
            this.f40578C = i6;
        }

        public static com.google.android.gms.internal.measurement.M1.b e(int i6) {
            if (i6 == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i6 == 1) {
                return LESS_THAN;
            }
            if (i6 == 2) {
                return GREATER_THAN;
            }
            if (i6 == 3) {
                return EQUAL;
            }
            if (i6 != 4) {
                return null;
            }
            return BETWEEN;
        }

        public static com.google.android.gms.internal.measurement.InterfaceC6162x4 g() {
            return com.google.android.gms.internal.measurement.P1.f40636a;
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC6170y4
        public final int a() {
            return this.f40578C;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return "<" + com.google.android.gms.internal.measurement.M1.b.class.getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " number=" + this.f40578C + " name=" + name() + '>';
        }
    }

    static {
        com.google.android.gms.internal.measurement.M1 m6 = new com.google.android.gms.internal.measurement.M1();
        zzc = m6;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.M1.class, m6);
    }

    private M1() {
    }

    public static com.google.android.gms.internal.measurement.M1 H() {
        return zzc;
    }

    public final com.google.android.gms.internal.measurement.M1.b F() {
        com.google.android.gms.internal.measurement.M1.b bVarE = com.google.android.gms.internal.measurement.M1.b.e(this.zzf);
        return bVarE == null ? com.google.android.gms.internal.measurement.M1.b.UNKNOWN_COMPARISON_TYPE : bVarE;
    }

    public final java.lang.String I() {
        return this.zzh;
    }

    public final java.lang.String J() {
        return this.zzj;
    }

    public final java.lang.String K() {
        return this.zzi;
    }

    public final boolean L() {
        return this.zzg;
    }

    public final boolean M() {
        return (this.zze & 1) != 0;
    }

    public final boolean N() {
        return (this.zze & 4) != 0;
    }

    public final boolean O() {
        return (this.zze & 2) != 0;
    }

    public final boolean P() {
        return (this.zze & 16) != 0;
    }

    public final boolean Q() {
        return (this.zze & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.I1.f40540a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.M1();
            case 2:
                return new com.google.android.gms.internal.measurement.M1.a();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new java.lang.Object[]{"zze", "zzf", com.google.android.gms.internal.measurement.M1.b.g(), "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.M1.class) {
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
