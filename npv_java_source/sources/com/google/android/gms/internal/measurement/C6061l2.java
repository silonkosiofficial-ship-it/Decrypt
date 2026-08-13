package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6061l2 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.C6061l2 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private com.google.android.gms.internal.measurement.D4 zzf = com.google.android.gms.internal.measurement.AbstractC6130t4.B();
    private java.lang.String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l2$a */
    public static final class a extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private a() {
            super(com.google.android.gms.internal.measurement.C6061l2.zzc);
        }

        public final com.google.android.gms.internal.measurement.C6061l2.a A(com.google.android.gms.internal.measurement.C6079n2.a aVar) {
            r();
            com.google.android.gms.internal.measurement.C6061l2.K((com.google.android.gms.internal.measurement.C6061l2) this.f41216D, (com.google.android.gms.internal.measurement.C6079n2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q()));
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6061l2.a B(com.google.android.gms.internal.measurement.C6079n2 c6079n2) {
            r();
            com.google.android.gms.internal.measurement.C6061l2.K((com.google.android.gms.internal.measurement.C6061l2) this.f41216D, c6079n2);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6061l2.a C(java.lang.Iterable iterable) {
            r();
            com.google.android.gms.internal.measurement.C6061l2.L((com.google.android.gms.internal.measurement.C6061l2) this.f41216D, iterable);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6061l2.a E(java.lang.String str) {
            r();
            com.google.android.gms.internal.measurement.C6061l2.M((com.google.android.gms.internal.measurement.C6061l2) this.f41216D, str);
            return this;
        }

        public final long F() {
            return ((com.google.android.gms.internal.measurement.C6061l2) this.f41216D).P();
        }

        public final com.google.android.gms.internal.measurement.C6061l2.a G(long j6) {
            r();
            com.google.android.gms.internal.measurement.C6061l2.O((com.google.android.gms.internal.measurement.C6061l2) this.f41216D, j6);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6079n2 H(int i6) {
            return ((com.google.android.gms.internal.measurement.C6061l2) this.f41216D).F(i6);
        }

        public final long I() {
            return ((com.google.android.gms.internal.measurement.C6061l2) this.f41216D).Q();
        }

        public final com.google.android.gms.internal.measurement.C6061l2.a J() {
            r();
            com.google.android.gms.internal.measurement.C6061l2.G((com.google.android.gms.internal.measurement.C6061l2) this.f41216D);
            return this;
        }

        public final java.lang.String K() {
            return ((com.google.android.gms.internal.measurement.C6061l2) this.f41216D).T();
        }

        public final java.util.List L() {
            return j$.util.DesugarCollections.unmodifiableList(((com.google.android.gms.internal.measurement.C6061l2) this.f41216D).U());
        }

        public final boolean M() {
            return ((com.google.android.gms.internal.measurement.C6061l2) this.f41216D).X();
        }

        public final int v() {
            return ((com.google.android.gms.internal.measurement.C6061l2) this.f41216D).N();
        }

        public final com.google.android.gms.internal.measurement.C6061l2.a w(int i6) {
            r();
            com.google.android.gms.internal.measurement.C6061l2.H((com.google.android.gms.internal.measurement.C6061l2) this.f41216D, i6);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6061l2.a x(int i6, com.google.android.gms.internal.measurement.C6079n2.a aVar) {
            r();
            com.google.android.gms.internal.measurement.C6061l2.I((com.google.android.gms.internal.measurement.C6061l2) this.f41216D, i6, (com.google.android.gms.internal.measurement.C6079n2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q()));
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6061l2.a y(int i6, com.google.android.gms.internal.measurement.C6079n2 c6079n2) {
            r();
            com.google.android.gms.internal.measurement.C6061l2.I((com.google.android.gms.internal.measurement.C6061l2) this.f41216D, i6, c6079n2);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6061l2.a z(long j6) {
            r();
            com.google.android.gms.internal.measurement.C6061l2.J((com.google.android.gms.internal.measurement.C6061l2) this.f41216D, j6);
            return this;
        }
    }

    static {
        com.google.android.gms.internal.measurement.C6061l2 c6061l2 = new com.google.android.gms.internal.measurement.C6061l2();
        zzc = c6061l2;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.C6061l2.class, c6061l2);
    }

    private C6061l2() {
    }

    static /* synthetic */ void G(com.google.android.gms.internal.measurement.C6061l2 c6061l2) {
        c6061l2.zzf = com.google.android.gms.internal.measurement.AbstractC6130t4.B();
    }

    static /* synthetic */ void H(com.google.android.gms.internal.measurement.C6061l2 c6061l2, int i6) {
        c6061l2.Y();
        c6061l2.zzf.remove(i6);
    }

    static /* synthetic */ void I(com.google.android.gms.internal.measurement.C6061l2 c6061l2, int i6, com.google.android.gms.internal.measurement.C6079n2 c6079n2) {
        c6079n2.getClass();
        c6061l2.Y();
        c6061l2.zzf.set(i6, c6079n2);
    }

    static /* synthetic */ void J(com.google.android.gms.internal.measurement.C6061l2 c6061l2, long j6) {
        c6061l2.zze |= 4;
        c6061l2.zzi = j6;
    }

    static /* synthetic */ void K(com.google.android.gms.internal.measurement.C6061l2 c6061l2, com.google.android.gms.internal.measurement.C6079n2 c6079n2) {
        c6079n2.getClass();
        c6061l2.Y();
        c6061l2.zzf.add(c6079n2);
    }

    static /* synthetic */ void L(com.google.android.gms.internal.measurement.C6061l2 c6061l2, java.lang.Iterable iterable) {
        c6061l2.Y();
        com.google.android.gms.internal.measurement.D3.g(iterable, c6061l2.zzf);
    }

    static /* synthetic */ void M(com.google.android.gms.internal.measurement.C6061l2 c6061l2, java.lang.String str) {
        str.getClass();
        c6061l2.zze |= 1;
        c6061l2.zzg = str;
    }

    static /* synthetic */ void O(com.google.android.gms.internal.measurement.C6061l2 c6061l2, long j6) {
        c6061l2.zze |= 2;
        c6061l2.zzh = j6;
    }

    public static com.google.android.gms.internal.measurement.C6061l2.a R() {
        return (com.google.android.gms.internal.measurement.C6061l2.a) zzc.w();
    }

    private final void Y() {
        com.google.android.gms.internal.measurement.D4 d6 = this.zzf;
        if (d6.c()) {
            return;
        }
        this.zzf = com.google.android.gms.internal.measurement.AbstractC6130t4.p(d6);
    }

    public final com.google.android.gms.internal.measurement.C6079n2 F(int i6) {
        return (com.google.android.gms.internal.measurement.C6079n2) this.zzf.get(i6);
    }

    public final int N() {
        return this.zzf.size();
    }

    public final long P() {
        return this.zzi;
    }

    public final long Q() {
        return this.zzh;
    }

    public final java.lang.String T() {
        return this.zzg;
    }

    public final java.util.List U() {
        return this.zzf;
    }

    public final boolean V() {
        return (this.zze & 8) != 0;
    }

    public final boolean W() {
        return (this.zze & 4) != 0;
    }

    public final boolean X() {
        return (this.zze & 2) != 0;
    }

    public final int k() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.AbstractC6007f2.f40939a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.C6061l2();
            case 2:
                return new com.google.android.gms.internal.measurement.C6061l2.a();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new java.lang.Object[]{"zze", "zzf", com.google.android.gms.internal.measurement.C6079n2.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.C6061l2.class) {
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
