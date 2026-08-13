package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class D2 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.D2 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private int zzf;
    private com.google.android.gms.internal.measurement.D4 zzg = com.google.android.gms.internal.measurement.AbstractC6130t4.B();
    private java.lang.String zzh = "";
    private java.lang.String zzi = "";
    private boolean zzj;
    private double zzk;

    public enum a implements com.google.android.gms.internal.measurement.InterfaceC6170y4 {
        UNKNOWN(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        STATEMENT(4);


        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f40474C;

        a(int i6) {
            this.f40474C = i6;
        }

        public static com.google.android.gms.internal.measurement.D2.a e(int i6) {
            if (i6 == 0) {
                return UNKNOWN;
            }
            if (i6 == 1) {
                return STRING;
            }
            if (i6 == 2) {
                return NUMBER;
            }
            if (i6 == 3) {
                return BOOLEAN;
            }
            if (i6 != 4) {
                return null;
            }
            return STATEMENT;
        }

        public static com.google.android.gms.internal.measurement.InterfaceC6162x4 g() {
            return com.google.android.gms.internal.measurement.H2.f40528a;
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC6170y4
        public final int a() {
            return this.f40474C;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return "<" + com.google.android.gms.internal.measurement.D2.a.class.getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " number=" + this.f40474C + " name=" + name() + '>';
        }
    }

    public static final class b extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private b() {
            super(com.google.android.gms.internal.measurement.D2.zzc);
        }
    }

    static {
        com.google.android.gms.internal.measurement.D2 d6 = new com.google.android.gms.internal.measurement.D2();
        zzc = d6;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.D2.class, d6);
    }

    private D2() {
    }

    public final double F() {
        return this.zzk;
    }

    public final com.google.android.gms.internal.measurement.D2.a G() {
        com.google.android.gms.internal.measurement.D2.a aVarE = com.google.android.gms.internal.measurement.D2.a.e(this.zzf);
        return aVarE == null ? com.google.android.gms.internal.measurement.D2.a.UNKNOWN : aVarE;
    }

    public final java.lang.String I() {
        return this.zzh;
    }

    public final java.lang.String J() {
        return this.zzi;
    }

    public final java.util.List K() {
        return this.zzg;
    }

    public final boolean L() {
        return this.zzj;
    }

    public final boolean M() {
        return (this.zze & 8) != 0;
    }

    public final boolean N() {
        return (this.zze & 16) != 0;
    }

    public final boolean O() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.F2.f40505a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.D2();
            case 2:
                return new com.google.android.gms.internal.measurement.D2.b();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new java.lang.Object[]{"zze", "zzf", com.google.android.gms.internal.measurement.D2.a.g(), "zzg", com.google.android.gms.internal.measurement.D2.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.D2.class) {
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
