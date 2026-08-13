package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6112r2 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.C6112r2 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private int zzf = 1;
    private com.google.android.gms.internal.measurement.D4 zzg = com.google.android.gms.internal.measurement.AbstractC6130t4.B();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r2$a */
    public static final class a extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private a() {
            super(com.google.android.gms.internal.measurement.C6112r2.zzc);
        }

        public final com.google.android.gms.internal.measurement.C6112r2.a v(com.google.android.gms.internal.measurement.C6070m2.a aVar) {
            r();
            com.google.android.gms.internal.measurement.C6112r2.G((com.google.android.gms.internal.measurement.C6112r2) this.f41216D, (com.google.android.gms.internal.measurement.C6070m2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q()));
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r2$b */
    public enum b implements com.google.android.gms.internal.measurement.InterfaceC6170y4 {
        RADS(1),
        PROVISIONING(2);


        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f41169C;

        b(int i6) {
            this.f41169C = i6;
        }

        public static com.google.android.gms.internal.measurement.C6112r2.b e(int i6) {
            if (i6 == 1) {
                return RADS;
            }
            if (i6 != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public static com.google.android.gms.internal.measurement.InterfaceC6162x4 g() {
            return com.google.android.gms.internal.measurement.C6176z2.f41312a;
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC6170y4
        public final int a() {
            return this.f41169C;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return "<" + com.google.android.gms.internal.measurement.C6112r2.b.class.getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " number=" + this.f41169C + " name=" + name() + '>';
        }
    }

    static {
        com.google.android.gms.internal.measurement.C6112r2 c6112r2 = new com.google.android.gms.internal.measurement.C6112r2();
        zzc = c6112r2;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.C6112r2.class, c6112r2);
    }

    private C6112r2() {
    }

    public static com.google.android.gms.internal.measurement.C6112r2.a F() {
        return (com.google.android.gms.internal.measurement.C6112r2.a) zzc.w();
    }

    static /* synthetic */ void G(com.google.android.gms.internal.measurement.C6112r2 c6112r2, com.google.android.gms.internal.measurement.C6070m2 c6070m2) {
        c6070m2.getClass();
        com.google.android.gms.internal.measurement.D4 d6 = c6112r2.zzg;
        if (!d6.c()) {
            c6112r2.zzg = com.google.android.gms.internal.measurement.AbstractC6130t4.p(d6);
        }
        c6112r2.zzg.add(c6070m2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.AbstractC6007f2.f40939a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.C6112r2();
            case 2:
                return new com.google.android.gms.internal.measurement.C6112r2.a();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new java.lang.Object[]{"zze", "zzf", com.google.android.gms.internal.measurement.C6112r2.b.g(), "zzg", com.google.android.gms.internal.measurement.C6070m2.class});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.C6112r2.class) {
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
