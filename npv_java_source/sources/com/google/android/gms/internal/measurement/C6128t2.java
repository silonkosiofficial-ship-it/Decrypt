package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6128t2 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.C6128t2 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private int zzf;
    private com.google.android.gms.internal.measurement.InterfaceC6178z4 zzg = com.google.android.gms.internal.measurement.AbstractC6130t4.A();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t2$a */
    public static final class a extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private a() {
            super(com.google.android.gms.internal.measurement.C6128t2.zzc);
        }

        public final com.google.android.gms.internal.measurement.C6128t2.a v(int i6) {
            r();
            com.google.android.gms.internal.measurement.C6128t2.G((com.google.android.gms.internal.measurement.C6128t2) this.f41216D, i6);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6128t2.a w(java.lang.Iterable iterable) {
            r();
            com.google.android.gms.internal.measurement.C6128t2.H((com.google.android.gms.internal.measurement.C6128t2) this.f41216D, iterable);
            return this;
        }
    }

    static {
        com.google.android.gms.internal.measurement.C6128t2 c6128t2 = new com.google.android.gms.internal.measurement.C6128t2();
        zzc = c6128t2;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.C6128t2.class, c6128t2);
    }

    private C6128t2() {
    }

    static /* synthetic */ void G(com.google.android.gms.internal.measurement.C6128t2 c6128t2, int i6) {
        c6128t2.zze |= 1;
        c6128t2.zzf = i6;
    }

    static /* synthetic */ void H(com.google.android.gms.internal.measurement.C6128t2 c6128t2, java.lang.Iterable iterable) {
        com.google.android.gms.internal.measurement.InterfaceC6178z4 interfaceC6178z4 = c6128t2.zzg;
        if (!interfaceC6178z4.c()) {
            c6128t2.zzg = com.google.android.gms.internal.measurement.AbstractC6130t4.n(interfaceC6178z4);
        }
        com.google.android.gms.internal.measurement.D3.g(iterable, c6128t2.zzg);
    }

    public static com.google.android.gms.internal.measurement.C6128t2.a J() {
        return (com.google.android.gms.internal.measurement.C6128t2.a) zzc.w();
    }

    public final long F(int i6) {
        return this.zzg.B(i6);
    }

    public final int I() {
        return this.zzf;
    }

    public final java.util.List L() {
        return this.zzg;
    }

    public final boolean M() {
        return (this.zze & 1) != 0;
    }

    public final int k() {
        return this.zzg.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.AbstractC6007f2.f40939a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.C6128t2();
            case 2:
                return new com.google.android.gms.internal.measurement.C6128t2.a();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new java.lang.Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.C6128t2.class) {
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
