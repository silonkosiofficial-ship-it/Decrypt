package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class B2 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.B2 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private java.lang.String zzf = "";
    private com.google.android.gms.internal.measurement.D4 zzg = com.google.android.gms.internal.measurement.AbstractC6130t4.B();

    public static final class a extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private a() {
            super(com.google.android.gms.internal.measurement.B2.zzc);
        }
    }

    static {
        com.google.android.gms.internal.measurement.B2 b6 = new com.google.android.gms.internal.measurement.B2();
        zzc = b6;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.B2.class, b6);
    }

    private B2() {
    }

    public final java.lang.String G() {
        return this.zzf;
    }

    public final java.util.List H() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.F2.f40505a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.B2();
            case 2:
                return new com.google.android.gms.internal.measurement.B2.a();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new java.lang.Object[]{"zze", "zzf", "zzg", com.google.android.gms.internal.measurement.D2.class});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.B2.class) {
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
