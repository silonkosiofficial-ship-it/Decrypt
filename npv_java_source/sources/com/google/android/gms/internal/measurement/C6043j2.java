package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6043j2 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.C6043j2 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private int zzf;
    private com.google.android.gms.internal.measurement.C6120s2 zzg;
    private com.google.android.gms.internal.measurement.C6120s2 zzh;
    private boolean zzi;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j2$a */
    public static final class a extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private a() {
            super(com.google.android.gms.internal.measurement.C6043j2.zzc);
        }

        public final com.google.android.gms.internal.measurement.C6043j2.a v(int i6) {
            r();
            com.google.android.gms.internal.measurement.C6043j2.F((com.google.android.gms.internal.measurement.C6043j2) this.f41216D, i6);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6043j2.a w(com.google.android.gms.internal.measurement.C6120s2.a aVar) {
            r();
            com.google.android.gms.internal.measurement.C6043j2.G((com.google.android.gms.internal.measurement.C6043j2) this.f41216D, (com.google.android.gms.internal.measurement.C6120s2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q()));
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6043j2.a x(com.google.android.gms.internal.measurement.C6120s2 c6120s2) {
            r();
            com.google.android.gms.internal.measurement.C6043j2.J((com.google.android.gms.internal.measurement.C6043j2) this.f41216D, c6120s2);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6043j2.a y(boolean z6) {
            r();
            com.google.android.gms.internal.measurement.C6043j2.H((com.google.android.gms.internal.measurement.C6043j2) this.f41216D, z6);
            return this;
        }
    }

    static {
        com.google.android.gms.internal.measurement.C6043j2 c6043j2 = new com.google.android.gms.internal.measurement.C6043j2();
        zzc = c6043j2;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.C6043j2.class, c6043j2);
    }

    private C6043j2() {
    }

    static /* synthetic */ void F(com.google.android.gms.internal.measurement.C6043j2 c6043j2, int i6) {
        c6043j2.zze |= 1;
        c6043j2.zzf = i6;
    }

    static /* synthetic */ void G(com.google.android.gms.internal.measurement.C6043j2 c6043j2, com.google.android.gms.internal.measurement.C6120s2 c6120s2) {
        c6120s2.getClass();
        c6043j2.zzg = c6120s2;
        c6043j2.zze |= 2;
    }

    static /* synthetic */ void H(com.google.android.gms.internal.measurement.C6043j2 c6043j2, boolean z6) {
        c6043j2.zze |= 8;
        c6043j2.zzi = z6;
    }

    public static com.google.android.gms.internal.measurement.C6043j2.a I() {
        return (com.google.android.gms.internal.measurement.C6043j2.a) zzc.w();
    }

    static /* synthetic */ void J(com.google.android.gms.internal.measurement.C6043j2 c6043j2, com.google.android.gms.internal.measurement.C6120s2 c6120s2) {
        c6120s2.getClass();
        c6043j2.zzh = c6120s2;
        c6043j2.zze |= 4;
    }

    public final com.google.android.gms.internal.measurement.C6120s2 L() {
        com.google.android.gms.internal.measurement.C6120s2 c6120s2 = this.zzg;
        return c6120s2 == null ? com.google.android.gms.internal.measurement.C6120s2.S() : c6120s2;
    }

    public final com.google.android.gms.internal.measurement.C6120s2 M() {
        com.google.android.gms.internal.measurement.C6120s2 c6120s2 = this.zzh;
        return c6120s2 == null ? com.google.android.gms.internal.measurement.C6120s2.S() : c6120s2;
    }

    public final boolean N() {
        return this.zzi;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    public final boolean P() {
        return (this.zze & 8) != 0;
    }

    public final boolean Q() {
        return (this.zze & 4) != 0;
    }

    public final int k() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.AbstractC6007f2.f40939a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.C6043j2();
            case 2:
                return new com.google.android.gms.internal.measurement.C6043j2.a();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new java.lang.Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.C6043j2.class) {
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
