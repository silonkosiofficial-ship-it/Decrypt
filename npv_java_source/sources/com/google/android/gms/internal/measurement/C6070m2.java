package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6070m2 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.C6070m2 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private java.lang.String zzf = "";
    private long zzg;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m2$a */
    public static final class a extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private a() {
            super(com.google.android.gms.internal.measurement.C6070m2.zzc);
        }

        public final com.google.android.gms.internal.measurement.C6070m2.a v(long j6) {
            r();
            com.google.android.gms.internal.measurement.C6070m2.G((com.google.android.gms.internal.measurement.C6070m2) this.f41216D, j6);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6070m2.a w(java.lang.String str) {
            r();
            com.google.android.gms.internal.measurement.C6070m2.H((com.google.android.gms.internal.measurement.C6070m2) this.f41216D, str);
            return this;
        }
    }

    static {
        com.google.android.gms.internal.measurement.C6070m2 c6070m2 = new com.google.android.gms.internal.measurement.C6070m2();
        zzc = c6070m2;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.C6070m2.class, c6070m2);
    }

    private C6070m2() {
    }

    public static com.google.android.gms.internal.measurement.C6070m2.a F() {
        return (com.google.android.gms.internal.measurement.C6070m2.a) zzc.w();
    }

    static /* synthetic */ void G(com.google.android.gms.internal.measurement.C6070m2 c6070m2, long j6) {
        c6070m2.zze |= 2;
        c6070m2.zzg = j6;
    }

    static /* synthetic */ void H(com.google.android.gms.internal.measurement.C6070m2 c6070m2, java.lang.String str) {
        str.getClass();
        c6070m2.zze |= 1;
        c6070m2.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.AbstractC6007f2.f40939a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.C6070m2();
            case 2:
                return new com.google.android.gms.internal.measurement.C6070m2.a();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new java.lang.Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.C6070m2.class) {
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
