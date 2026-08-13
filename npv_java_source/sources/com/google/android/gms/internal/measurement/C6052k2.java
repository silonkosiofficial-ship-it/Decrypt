package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6052k2 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.C6052k2 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private int zzf;
    private long zzg;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k2$a */
    public static final class a extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private a() {
            super(com.google.android.gms.internal.measurement.C6052k2.zzc);
        }

        public final com.google.android.gms.internal.measurement.C6052k2.a v(int i6) {
            r();
            com.google.android.gms.internal.measurement.C6052k2.F((com.google.android.gms.internal.measurement.C6052k2) this.f41216D, i6);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6052k2.a w(long j6) {
            r();
            com.google.android.gms.internal.measurement.C6052k2.G((com.google.android.gms.internal.measurement.C6052k2) this.f41216D, j6);
            return this;
        }
    }

    static {
        com.google.android.gms.internal.measurement.C6052k2 c6052k2 = new com.google.android.gms.internal.measurement.C6052k2();
        zzc = c6052k2;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.C6052k2.class, c6052k2);
    }

    private C6052k2() {
    }

    static /* synthetic */ void F(com.google.android.gms.internal.measurement.C6052k2 c6052k2, int i6) {
        c6052k2.zze |= 1;
        c6052k2.zzf = i6;
    }

    static /* synthetic */ void G(com.google.android.gms.internal.measurement.C6052k2 c6052k2, long j6) {
        c6052k2.zze |= 2;
        c6052k2.zzg = j6;
    }

    public static com.google.android.gms.internal.measurement.C6052k2.a I() {
        return (com.google.android.gms.internal.measurement.C6052k2.a) zzc.w();
    }

    public final long H() {
        return this.zzg;
    }

    public final boolean K() {
        return (this.zze & 2) != 0;
    }

    public final boolean L() {
        return (this.zze & 1) != 0;
    }

    public final int k() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.AbstractC6007f2.f40939a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.C6052k2();
            case 2:
                return new com.google.android.gms.internal.measurement.C6052k2.a();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new java.lang.Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.C6052k2.class) {
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
