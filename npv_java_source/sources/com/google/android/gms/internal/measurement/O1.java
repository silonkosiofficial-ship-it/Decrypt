package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class O1 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.O1 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private java.lang.String zzg = "";
    private com.google.android.gms.internal.measurement.D4 zzi = com.google.android.gms.internal.measurement.AbstractC6130t4.B();

    public static final class a extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private a() {
            super(com.google.android.gms.internal.measurement.O1.zzc);
        }
    }

    public enum b implements com.google.android.gms.internal.measurement.InterfaceC6170y4 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);


        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f40628C;

        b(int i6) {
            this.f40628C = i6;
        }

        public static com.google.android.gms.internal.measurement.O1.b e(int i6) {
            switch (i6) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static com.google.android.gms.internal.measurement.InterfaceC6162x4 g() {
            return com.google.android.gms.internal.measurement.Q1.f40646a;
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC6170y4
        public final int a() {
            return this.f40628C;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return "<" + com.google.android.gms.internal.measurement.O1.b.class.getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " number=" + this.f40628C + " name=" + name() + '>';
        }
    }

    static {
        com.google.android.gms.internal.measurement.O1 o6 = new com.google.android.gms.internal.measurement.O1();
        zzc = o6;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.O1.class, o6);
    }

    private O1() {
    }

    public static com.google.android.gms.internal.measurement.O1 H() {
        return zzc;
    }

    public final com.google.android.gms.internal.measurement.O1.b F() {
        com.google.android.gms.internal.measurement.O1.b bVarE = com.google.android.gms.internal.measurement.O1.b.e(this.zzf);
        return bVarE == null ? com.google.android.gms.internal.measurement.O1.b.UNKNOWN_MATCH_TYPE : bVarE;
    }

    public final java.lang.String I() {
        return this.zzg;
    }

    public final java.util.List J() {
        return this.zzi;
    }

    public final boolean K() {
        return this.zzh;
    }

    public final boolean L() {
        return (this.zze & 4) != 0;
    }

    public final boolean M() {
        return (this.zze & 2) != 0;
    }

    public final boolean N() {
        return (this.zze & 1) != 0;
    }

    public final int k() {
        return this.zzi.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.I1.f40540a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.O1();
            case 2:
                return new com.google.android.gms.internal.measurement.O1.a();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new java.lang.Object[]{"zze", "zzf", com.google.android.gms.internal.measurement.O1.b.g(), "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.O1.class) {
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
