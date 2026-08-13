package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6097p2 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.C6097p2 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private com.google.android.gms.internal.measurement.D4 zzf = com.google.android.gms.internal.measurement.AbstractC6130t4.B();
    private java.lang.String zzg = "";
    private java.lang.String zzh = "";
    private int zzi;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p2$a */
    public static final class a extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private a() {
            super(com.google.android.gms.internal.measurement.C6097p2.zzc);
        }

        public final com.google.android.gms.internal.measurement.C6097p2.a A() {
            r();
            com.google.android.gms.internal.measurement.C6097p2.L((com.google.android.gms.internal.measurement.C6097p2) this.f41216D);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6097p2.a B(java.lang.String str) {
            r();
            com.google.android.gms.internal.measurement.C6097p2.M((com.google.android.gms.internal.measurement.C6097p2) this.f41216D, str);
            return this;
        }

        public final java.lang.String C() {
            return ((com.google.android.gms.internal.measurement.C6097p2) this.f41216D).O();
        }

        public final java.util.List E() {
            return j$.util.DesugarCollections.unmodifiableList(((com.google.android.gms.internal.measurement.C6097p2) this.f41216D).Q());
        }

        public final int v() {
            return ((com.google.android.gms.internal.measurement.C6097p2) this.f41216D).k();
        }

        public final com.google.android.gms.internal.measurement.C6097p2.a w(com.google.android.gms.internal.measurement.C6105q2.a aVar) {
            r();
            com.google.android.gms.internal.measurement.C6097p2.H((com.google.android.gms.internal.measurement.C6097p2) this.f41216D, (com.google.android.gms.internal.measurement.C6105q2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q()));
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6097p2.a x(java.lang.Iterable iterable) {
            r();
            com.google.android.gms.internal.measurement.C6097p2.I((com.google.android.gms.internal.measurement.C6097p2) this.f41216D, iterable);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6097p2.a y(java.lang.String str) {
            r();
            com.google.android.gms.internal.measurement.C6097p2.J((com.google.android.gms.internal.measurement.C6097p2) this.f41216D, str);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6105q2 z(int i6) {
            return ((com.google.android.gms.internal.measurement.C6097p2) this.f41216D).G(0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p2$b */
    public enum b implements com.google.android.gms.internal.measurement.InterfaceC6170y4 {
        SDK(0),
        SGTM(1);


        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f41141C;

        b(int i6) {
            this.f41141C = i6;
        }

        public static com.google.android.gms.internal.measurement.C6097p2.b e(int i6) {
            if (i6 == 0) {
                return SDK;
            }
            if (i6 != 1) {
                return null;
            }
            return SGTM;
        }

        public static com.google.android.gms.internal.measurement.InterfaceC6162x4 g() {
            return com.google.android.gms.internal.measurement.C6168y2.f41304a;
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC6170y4
        public final int a() {
            return this.f41141C;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return "<" + com.google.android.gms.internal.measurement.C6097p2.b.class.getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " number=" + this.f41141C + " name=" + name() + '>';
        }
    }

    static {
        com.google.android.gms.internal.measurement.C6097p2 c6097p2 = new com.google.android.gms.internal.measurement.C6097p2();
        zzc = c6097p2;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.C6097p2.class, c6097p2);
    }

    private C6097p2() {
    }

    public static com.google.android.gms.internal.measurement.C6097p2.a F(com.google.android.gms.internal.measurement.C6097p2 c6097p2) {
        return (com.google.android.gms.internal.measurement.C6097p2.a) zzc.l(c6097p2);
    }

    static /* synthetic */ void H(com.google.android.gms.internal.measurement.C6097p2 c6097p2, com.google.android.gms.internal.measurement.C6105q2 c6105q2) {
        c6105q2.getClass();
        c6097p2.T();
        c6097p2.zzf.add(c6105q2);
    }

    static /* synthetic */ void I(com.google.android.gms.internal.measurement.C6097p2 c6097p2, java.lang.Iterable iterable) {
        c6097p2.T();
        com.google.android.gms.internal.measurement.D3.g(iterable, c6097p2.zzf);
    }

    static /* synthetic */ void J(com.google.android.gms.internal.measurement.C6097p2 c6097p2, java.lang.String str) {
        str.getClass();
        c6097p2.zze |= 1;
        c6097p2.zzg = str;
    }

    public static com.google.android.gms.internal.measurement.C6097p2.a K() {
        return (com.google.android.gms.internal.measurement.C6097p2.a) zzc.w();
    }

    static /* synthetic */ void L(com.google.android.gms.internal.measurement.C6097p2 c6097p2) {
        c6097p2.zzf = com.google.android.gms.internal.measurement.AbstractC6130t4.B();
    }

    static /* synthetic */ void M(com.google.android.gms.internal.measurement.C6097p2 c6097p2, java.lang.String str) {
        str.getClass();
        c6097p2.zze |= 2;
        c6097p2.zzh = str;
    }

    private final void T() {
        com.google.android.gms.internal.measurement.D4 d6 = this.zzf;
        if (d6.c()) {
            return;
        }
        this.zzf = com.google.android.gms.internal.measurement.AbstractC6130t4.p(d6);
    }

    public final com.google.android.gms.internal.measurement.C6105q2 G(int i6) {
        return (com.google.android.gms.internal.measurement.C6105q2) this.zzf.get(0);
    }

    public final java.lang.String O() {
        return this.zzg;
    }

    public final java.lang.String P() {
        return this.zzh;
    }

    public final java.util.List Q() {
        return this.zzf;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    public final boolean S() {
        return (this.zze & 2) != 0;
    }

    public final int k() {
        return this.zzf.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.AbstractC6007f2.f40939a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.C6097p2();
            case 2:
                return new com.google.android.gms.internal.measurement.C6097p2.a();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new java.lang.Object[]{"zze", "zzf", com.google.android.gms.internal.measurement.C6105q2.class, "zzg", "zzh", "zzi", com.google.android.gms.internal.measurement.C6097p2.b.g()});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.C6097p2.class) {
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
