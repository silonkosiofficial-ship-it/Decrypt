package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6130t4 extends com.google.android.gms.internal.measurement.D3 {
    private static java.util.Map<java.lang.Class<?>, com.google.android.gms.internal.measurement.AbstractC6130t4> zzc = new j$.util.concurrent.ConcurrentHashMap();
    private int zzd = -1;
    protected com.google.android.gms.internal.measurement.E5 zzb = com.google.android.gms.internal.measurement.E5.k();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t4$a */
    protected static class a extends com.google.android.gms.internal.measurement.G3 {
        public a(com.google.android.gms.internal.measurement.AbstractC6130t4 abstractC6130t4) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t4$b */
    public static abstract class b extends com.google.android.gms.internal.measurement.E3 {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final com.google.android.gms.internal.measurement.AbstractC6130t4 f41215C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        protected com.google.android.gms.internal.measurement.AbstractC6130t4 f41216D;

        protected b(com.google.android.gms.internal.measurement.AbstractC6130t4 abstractC6130t4) {
            this.f41215C = abstractC6130t4;
            if (abstractC6130t4.E()) {
                throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
            }
            this.f41216D = abstractC6130t4.y();
        }

        private static void m(java.lang.Object obj, java.lang.Object obj2) {
            com.google.android.gms.internal.measurement.C6073m5.a().c(obj).f(obj, obj2);
        }

        private final com.google.android.gms.internal.measurement.AbstractC6130t4.b u(byte[] bArr, int i6, int i10, com.google.android.gms.internal.measurement.C6018g4 c6018g4) throws com.google.android.gms.internal.measurement.C4 {
            if (!this.f41216D.E()) {
                t();
            }
            try {
                com.google.android.gms.internal.measurement.C6073m5.a().c(this.f41216D).h(this.f41216D, bArr, 0, i10, new com.google.android.gms.internal.measurement.K3(c6018g4));
                return this;
            } catch (com.google.android.gms.internal.measurement.C4 e6) {
                throw e6;
            } catch (java.io.IOException e10) {
                throw new java.lang.RuntimeException("Reading from byte array should not throw IOException.", e10);
            } catch (java.lang.IndexOutOfBoundsException unused) {
                throw com.google.android.gms.internal.measurement.C4.g();
            }
        }

        @Override // com.google.android.gms.internal.measurement.E3
        public /* synthetic */ java.lang.Object clone() {
            com.google.android.gms.internal.measurement.AbstractC6130t4.b bVar = (com.google.android.gms.internal.measurement.AbstractC6130t4.b) this.f41215C.q(com.google.android.gms.internal.measurement.AbstractC6130t4.c.f41221e, null, null);
            bVar.f41216D = (com.google.android.gms.internal.measurement.AbstractC6130t4) o();
            return bVar;
        }

        @Override // com.google.android.gms.internal.measurement.E3
        public final /* synthetic */ com.google.android.gms.internal.measurement.E3 e(byte[] bArr, int i6, int i10) {
            return u(bArr, 0, i10, com.google.android.gms.internal.measurement.C6018g4.f40948c);
        }

        @Override // com.google.android.gms.internal.measurement.E3
        public final /* synthetic */ com.google.android.gms.internal.measurement.E3 h(byte[] bArr, int i6, int i10, com.google.android.gms.internal.measurement.C6018g4 c6018g4) {
            return u(bArr, 0, i10, c6018g4);
        }

        public final com.google.android.gms.internal.measurement.AbstractC6130t4.b l(com.google.android.gms.internal.measurement.AbstractC6130t4 abstractC6130t4) {
            if (this.f41215C.equals(abstractC6130t4)) {
                return this;
            }
            if (!this.f41216D.E()) {
                t();
            }
            m(this.f41216D, abstractC6130t4);
            return this;
        }

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final com.google.android.gms.internal.measurement.AbstractC6130t4 q() {
            com.google.android.gms.internal.measurement.AbstractC6130t4 abstractC6130t4 = (com.google.android.gms.internal.measurement.AbstractC6130t4) o();
            if (com.google.android.gms.internal.measurement.AbstractC6130t4.u(abstractC6130t4, true)) {
                return abstractC6130t4;
            }
            throw new com.google.android.gms.internal.measurement.C5(abstractC6130t4);
        }

        @Override // com.google.android.gms.internal.measurement.Z4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public com.google.android.gms.internal.measurement.AbstractC6130t4 o() {
            if (!this.f41216D.E()) {
                return this.f41216D;
            }
            this.f41216D.C();
            return this.f41216D;
        }

        protected final void r() {
            if (this.f41216D.E()) {
                return;
            }
            t();
        }

        protected void t() {
            com.google.android.gms.internal.measurement.AbstractC6130t4 abstractC6130t4Y = this.f41215C.y();
            m(abstractC6130t4Y, this.f41216D);
            this.f41216D = abstractC6130t4Y;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t4$c */
    public static final enum c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f41217a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f41218b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f41219c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f41220d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f41221e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f41222f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f41223g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ int[] f41224h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f41224h.clone();
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t4$d */
    public static class d extends com.google.android.gms.internal.measurement.AbstractC6027h4 {
    }

    protected static com.google.android.gms.internal.measurement.InterfaceC6178z4 A() {
        return com.google.android.gms.internal.measurement.K4.f();
    }

    protected static com.google.android.gms.internal.measurement.D4 B() {
        return com.google.android.gms.internal.measurement.C6064l5.g();
    }

    private final int k() {
        return com.google.android.gms.internal.measurement.C6073m5.a().c(this).c(this);
    }

    static com.google.android.gms.internal.measurement.AbstractC6130t4 m(java.lang.Class cls) {
        com.google.android.gms.internal.measurement.AbstractC6130t4 abstractC6130t4 = zzc.get(cls);
        if (abstractC6130t4 == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC6130t4 = zzc.get(cls);
            } catch (java.lang.ClassNotFoundException e6) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (abstractC6130t4 == null) {
            abstractC6130t4 = (com.google.android.gms.internal.measurement.AbstractC6130t4) ((com.google.android.gms.internal.measurement.AbstractC6130t4) com.google.android.gms.internal.measurement.G5.b(cls)).q(com.google.android.gms.internal.measurement.AbstractC6130t4.c.f41222f, null, null);
            if (abstractC6130t4 == null) {
                throw new java.lang.IllegalStateException();
            }
            zzc.put(cls, abstractC6130t4);
        }
        return abstractC6130t4;
    }

    protected static com.google.android.gms.internal.measurement.InterfaceC6178z4 n(com.google.android.gms.internal.measurement.InterfaceC6178z4 interfaceC6178z4) {
        return interfaceC6178z4.r(interfaceC6178z4.size() << 1);
    }

    protected static com.google.android.gms.internal.measurement.D4 p(com.google.android.gms.internal.measurement.D4 d6) {
        return d6.r(d6.size() << 1);
    }

    protected static java.lang.Object r(com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.android.gms.internal.measurement.C6082n5(interfaceC5965a5, str, objArr);
    }

    static java.lang.Object s(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e6);
        } catch (java.lang.reflect.InvocationTargetException e10) {
            java.lang.Throwable cause = e10.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static void t(java.lang.Class cls, com.google.android.gms.internal.measurement.AbstractC6130t4 abstractC6130t4) {
        abstractC6130t4.D();
        zzc.put(cls, abstractC6130t4);
    }

    protected static final boolean u(com.google.android.gms.internal.measurement.AbstractC6130t4 abstractC6130t4, boolean z6) {
        byte bByteValue = ((java.lang.Byte) abstractC6130t4.q(com.google.android.gms.internal.measurement.AbstractC6130t4.c.f41217a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = com.google.android.gms.internal.measurement.C6073m5.a().c(abstractC6130t4).d(abstractC6130t4);
        if (z6) {
            abstractC6130t4.q(com.google.android.gms.internal.measurement.AbstractC6130t4.c.f41218b, zD ? abstractC6130t4 : null, null);
        }
        return zD;
    }

    private final int v(com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5) {
        return interfaceC6100p5 == null ? com.google.android.gms.internal.measurement.C6073m5.a().c(this).b(this) : interfaceC6100p5.b(this);
    }

    protected static com.google.android.gms.internal.measurement.B4 z() {
        return com.google.android.gms.internal.measurement.C6154w4.f();
    }

    protected final void C() {
        com.google.android.gms.internal.measurement.C6073m5.a().c(this).e(this);
        D();
    }

    final void D() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final boolean E() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5965a5
    public final void a(com.google.android.gms.internal.measurement.AbstractC5982c4 abstractC5982c4) {
        com.google.android.gms.internal.measurement.C6073m5.a().c(this).g(this, com.google.android.gms.internal.measurement.C6009f4.P(abstractC5982c4));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5983c5
    public final /* synthetic */ com.google.android.gms.internal.measurement.InterfaceC5965a5 b() {
        return (com.google.android.gms.internal.measurement.AbstractC6130t4) q(com.google.android.gms.internal.measurement.AbstractC6130t4.c.f41222f, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5965a5
    public final /* synthetic */ com.google.android.gms.internal.measurement.Z4 c() {
        return (com.google.android.gms.internal.measurement.AbstractC6130t4.b) q(com.google.android.gms.internal.measurement.AbstractC6130t4.c.f41221e, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5965a5
    public final int d() {
        return e(null);
    }

    @Override // com.google.android.gms.internal.measurement.D3
    final int e(com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5) {
        if (!E()) {
            if (h() != Integer.MAX_VALUE) {
                return h();
            }
            int iV = v(interfaceC6100p5);
            i(iV);
            return iV;
        }
        int iV2 = v(interfaceC6100p5);
        if (iV2 >= 0) {
            return iV2;
        }
        throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + iV2);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return com.google.android.gms.internal.measurement.C6073m5.a().c(this).i(this, (com.google.android.gms.internal.measurement.AbstractC6130t4) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.D3
    final int h() {
        return this.zzd & Integer.MAX_VALUE;
    }

    public int hashCode() {
        if (E()) {
            return k();
        }
        if (this.zza == 0) {
            this.zza = k();
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.D3
    final void i(int i6) {
        if (i6 >= 0) {
            this.zzd = (i6 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + i6);
        }
    }

    protected final com.google.android.gms.internal.measurement.AbstractC6130t4.b l(com.google.android.gms.internal.measurement.AbstractC6130t4 abstractC6130t4) {
        return w().l(abstractC6130t4);
    }

    protected abstract java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2);

    public java.lang.String toString() {
        return com.google.android.gms.internal.measurement.AbstractC5974b5.a(this, super.toString());
    }

    protected final com.google.android.gms.internal.measurement.AbstractC6130t4.b w() {
        return (com.google.android.gms.internal.measurement.AbstractC6130t4.b) q(com.google.android.gms.internal.measurement.AbstractC6130t4.c.f41221e, null, null);
    }

    public final com.google.android.gms.internal.measurement.AbstractC6130t4.b x() {
        return ((com.google.android.gms.internal.measurement.AbstractC6130t4.b) q(com.google.android.gms.internal.measurement.AbstractC6130t4.c.f41221e, null, null)).l(this);
    }

    final com.google.android.gms.internal.measurement.AbstractC6130t4 y() {
        return (com.google.android.gms.internal.measurement.AbstractC6130t4) q(com.google.android.gms.internal.measurement.AbstractC6130t4.c.f41220d, null, null);
    }
}
