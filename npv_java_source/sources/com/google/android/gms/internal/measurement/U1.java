package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class U1 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.U1 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private com.google.android.gms.internal.measurement.R1 zzr;
    private com.google.android.gms.internal.measurement.W1 zzs;
    private com.google.android.gms.internal.measurement.Z1 zzt;
    private com.google.android.gms.internal.measurement.X1 zzu;
    private com.google.android.gms.internal.measurement.V1 zzv;
    private java.lang.String zzg = "";
    private com.google.android.gms.internal.measurement.D4 zzi = com.google.android.gms.internal.measurement.AbstractC6130t4.B();
    private com.google.android.gms.internal.measurement.D4 zzj = com.google.android.gms.internal.measurement.AbstractC6130t4.B();
    private com.google.android.gms.internal.measurement.D4 zzk = com.google.android.gms.internal.measurement.AbstractC6130t4.B();
    private java.lang.String zzl = "";
    private com.google.android.gms.internal.measurement.D4 zzn = com.google.android.gms.internal.measurement.AbstractC6130t4.B();
    private com.google.android.gms.internal.measurement.D4 zzo = com.google.android.gms.internal.measurement.AbstractC6130t4.B();
    private java.lang.String zzp = "";
    private java.lang.String zzq = "";

    public static final class a extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private a() {
            super(com.google.android.gms.internal.measurement.U1.zzc);
        }

        public final java.util.List A() {
            return j$.util.DesugarCollections.unmodifiableList(((com.google.android.gms.internal.measurement.U1) this.f41216D).R());
        }

        public final java.util.List B() {
            return j$.util.DesugarCollections.unmodifiableList(((com.google.android.gms.internal.measurement.U1) this.f41216D).S());
        }

        public final int v() {
            return ((com.google.android.gms.internal.measurement.U1) this.f41216D).I();
        }

        public final com.google.android.gms.internal.measurement.T1 w(int i6) {
            return ((com.google.android.gms.internal.measurement.U1) this.f41216D).F(i6);
        }

        public final com.google.android.gms.internal.measurement.U1.a x(int i6, com.google.android.gms.internal.measurement.T1.a aVar) {
            r();
            com.google.android.gms.internal.measurement.U1.H((com.google.android.gms.internal.measurement.U1) this.f41216D, i6, (com.google.android.gms.internal.measurement.T1) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q()));
            return this;
        }

        public final com.google.android.gms.internal.measurement.U1.a y() {
            r();
            com.google.android.gms.internal.measurement.U1.G((com.google.android.gms.internal.measurement.U1) this.f41216D);
            return this;
        }

        public final java.lang.String z() {
            return ((com.google.android.gms.internal.measurement.U1) this.f41216D).Q();
        }
    }

    static {
        com.google.android.gms.internal.measurement.U1 u6 = new com.google.android.gms.internal.measurement.U1();
        zzc = u6;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.U1.class, u6);
    }

    private U1() {
    }

    static /* synthetic */ void G(com.google.android.gms.internal.measurement.U1 u6) {
        u6.zzk = com.google.android.gms.internal.measurement.AbstractC6130t4.B();
    }

    static /* synthetic */ void H(com.google.android.gms.internal.measurement.U1 u6, int i6, com.google.android.gms.internal.measurement.T1 t6) {
        t6.getClass();
        com.google.android.gms.internal.measurement.D4 d6 = u6.zzj;
        if (!d6.c()) {
            u6.zzj = com.google.android.gms.internal.measurement.AbstractC6130t4.p(d6);
        }
        u6.zzj.set(i6, t6);
    }

    public static com.google.android.gms.internal.measurement.U1.a L() {
        return (com.google.android.gms.internal.measurement.U1.a) zzc.w();
    }

    public static com.google.android.gms.internal.measurement.U1 N() {
        return zzc;
    }

    public final com.google.android.gms.internal.measurement.T1 F(int i6) {
        return (com.google.android.gms.internal.measurement.T1) this.zzj.get(i6);
    }

    public final int I() {
        return this.zzj.size();
    }

    public final long J() {
        return this.zzf;
    }

    public final com.google.android.gms.internal.measurement.R1 K() {
        com.google.android.gms.internal.measurement.R1 r6 = this.zzr;
        return r6 == null ? com.google.android.gms.internal.measurement.R1.G() : r6;
    }

    public final com.google.android.gms.internal.measurement.Z1 O() {
        com.google.android.gms.internal.measurement.Z1 z6 = this.zzt;
        return z6 == null ? com.google.android.gms.internal.measurement.Z1.G() : z6;
    }

    public final java.lang.String P() {
        return this.zzg;
    }

    public final java.lang.String Q() {
        return this.zzp;
    }

    public final java.util.List R() {
        return this.zzk;
    }

    public final java.util.List S() {
        return this.zzo;
    }

    public final java.util.List T() {
        return this.zzn;
    }

    public final java.util.List U() {
        return this.zzi;
    }

    public final boolean V() {
        return (this.zze & 128) != 0;
    }

    public final boolean W() {
        return (this.zze & 2) != 0;
    }

    public final boolean X() {
        return (this.zze & 512) != 0;
    }

    public final boolean Y() {
        return (this.zze & 1) != 0;
    }

    public final int k() {
        return this.zzn.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.AbstractC5971b2.f40800a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.U1();
            case 2:
                return new com.google.android.gms.internal.measurement.U1.a();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new java.lang.Object[]{"zze", "zzf", "zzg", "zzh", "zzi", com.google.android.gms.internal.measurement.Y1.class, "zzj", com.google.android.gms.internal.measurement.T1.class, "zzk", com.google.android.gms.internal.measurement.J1.class, "zzl", "zzm", "zzn", com.google.android.gms.internal.measurement.C2.class, "zzo", com.google.android.gms.internal.measurement.S1.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.U1.class) {
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
