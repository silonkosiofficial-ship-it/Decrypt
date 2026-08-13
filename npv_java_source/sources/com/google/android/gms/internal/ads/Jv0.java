package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Jv0 extends com.google.android.gms.internal.ads.Ou0 {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static java.util.Map<java.lang.Class<?>, com.google.android.gms.internal.ads.Jv0> zzc = new j$.util.concurrent.ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected com.google.android.gms.internal.ads.Mw0 zzt = com.google.android.gms.internal.ads.Mw0.c();

    protected static java.lang.Object A(com.google.android.gms.internal.ads.InterfaceC4523mw0 interfaceC4523mw0, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.android.gms.internal.ads.C5732xw0(interfaceC4523mw0, str, objArr);
    }

    protected static void F(java.lang.Class cls, com.google.android.gms.internal.ads.Jv0 jv0) {
        jv0.E();
        zzc.put(cls, jv0);
    }

    static com.google.android.gms.internal.ads.Jv0 I(java.lang.Class cls) {
        com.google.android.gms.internal.ads.Jv0 jv0A = zzc.get(cls);
        if (jv0A == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                jv0A = zzc.get(cls);
            } catch (java.lang.ClassNotFoundException e6) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (jv0A == null) {
            jv0A = ((com.google.android.gms.internal.ads.Jv0) com.google.android.gms.internal.ads.Sw0.o(cls)).a();
            if (jv0A == null) {
                throw new java.lang.IllegalStateException();
            }
            zzc.put(cls, jv0A);
        }
        return jv0A;
    }

    protected static com.google.android.gms.internal.ads.Jv0 L(com.google.android.gms.internal.ads.Jv0 jv0, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) throws com.google.android.gms.internal.ads.Vv0 {
        com.google.android.gms.internal.ads.C5730xv0 c5730xv0 = com.google.android.gms.internal.ads.C5730xv0.f39940c;
        int i6 = com.google.android.gms.internal.ads.C5512vw0.f39479d;
        com.google.android.gms.internal.ads.Jv0 jv0N = N(jv0, abstractC3753fv0, com.google.android.gms.internal.ads.C5730xv0.f39940c);
        X(jv0N);
        return jv0N;
    }

    protected static com.google.android.gms.internal.ads.Jv0 M(com.google.android.gms.internal.ads.Jv0 jv0, byte[] bArr) throws com.google.android.gms.internal.ads.Vv0 {
        int length = bArr.length;
        com.google.android.gms.internal.ads.C5730xv0 c5730xv0 = com.google.android.gms.internal.ads.C5730xv0.f39940c;
        int i6 = com.google.android.gms.internal.ads.C5512vw0.f39479d;
        com.google.android.gms.internal.ads.Jv0 jv0Z = Z(jv0, bArr, 0, length, com.google.android.gms.internal.ads.C5730xv0.f39940c);
        X(jv0Z);
        return jv0Z;
    }

    protected static com.google.android.gms.internal.ads.Jv0 N(com.google.android.gms.internal.ads.Jv0 jv0, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) throws com.google.android.gms.internal.ads.Vv0 {
        com.google.android.gms.internal.ads.Jv0 jv0Y = Y(jv0, abstractC3753fv0, c5730xv0);
        X(jv0Y);
        return jv0Y;
    }

    protected static com.google.android.gms.internal.ads.Jv0 O(com.google.android.gms.internal.ads.Jv0 jv0, java.io.InputStream inputStream, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) throws com.google.android.gms.internal.ads.Vv0 {
        com.google.android.gms.internal.ads.Jv0 jv0R = R(jv0, com.google.android.gms.internal.ads.AbstractC4301kv0.e(inputStream, 4096), c5730xv0);
        X(jv0R);
        return jv0R;
    }

    protected static com.google.android.gms.internal.ads.Jv0 Q(com.google.android.gms.internal.ads.Jv0 jv0, byte[] bArr, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) throws com.google.android.gms.internal.ads.Vv0 {
        com.google.android.gms.internal.ads.Jv0 jv0Z = Z(jv0, bArr, 0, bArr.length, c5730xv0);
        X(jv0Z);
        return jv0Z;
    }

    static com.google.android.gms.internal.ads.Jv0 R(com.google.android.gms.internal.ads.Jv0 jv0, com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv0, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) throws com.google.android.gms.internal.ads.Vv0 {
        com.google.android.gms.internal.ads.Jv0 jv0K = jv0.K();
        try {
            com.google.android.gms.internal.ads.Ew0 ew0B = com.google.android.gms.internal.ads.C5512vw0.a().b(jv0K.getClass());
            ew0B.j(jv0K, com.google.android.gms.internal.ads.C4411lv0.T(abstractC4301kv0), c5730xv0);
            ew0B.a(jv0K);
            return jv0K;
        } catch (com.google.android.gms.internal.ads.Kw0 e6) {
            throw e6.a();
        } catch (com.google.android.gms.internal.ads.Vv0 e10) {
            if (e10.b()) {
                throw new com.google.android.gms.internal.ads.Vv0(e10);
            }
            throw e10;
        } catch (java.io.IOException e11) {
            if (e11.getCause() instanceof com.google.android.gms.internal.ads.Vv0) {
                throw ((com.google.android.gms.internal.ads.Vv0) e11.getCause());
            }
            throw new com.google.android.gms.internal.ads.Vv0(e11);
        } catch (java.lang.RuntimeException e12) {
            if (e12.getCause() instanceof com.google.android.gms.internal.ads.Vv0) {
                throw ((com.google.android.gms.internal.ads.Vv0) e12.getCause());
            }
            throw e12;
        }
    }

    private int S(com.google.android.gms.internal.ads.Ew0 ew0) {
        if (ew0 != null) {
            return ew0.b(this);
        }
        return com.google.android.gms.internal.ads.C5512vw0.a().b(getClass()).b(this);
    }

    private static com.google.android.gms.internal.ads.Jv0 X(com.google.android.gms.internal.ads.Jv0 jv0) throws com.google.android.gms.internal.ads.Vv0 {
        if (jv0 == null || jv0.P()) {
            return jv0;
        }
        throw jv0.h().a();
    }

    private static com.google.android.gms.internal.ads.Jv0 Y(com.google.android.gms.internal.ads.Jv0 jv0, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) throws com.google.android.gms.internal.ads.Vv0 {
        com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv0E = abstractC3753fv0.E();
        com.google.android.gms.internal.ads.Jv0 jv0R = R(jv0, abstractC4301kv0E, c5730xv0);
        abstractC4301kv0E.z(0);
        return jv0R;
    }

    private static com.google.android.gms.internal.ads.Jv0 Z(com.google.android.gms.internal.ads.Jv0 jv0, byte[] bArr, int i6, int i10, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) throws com.google.android.gms.internal.ads.Vv0 {
        if (i10 == 0) {
            return jv0;
        }
        com.google.android.gms.internal.ads.Jv0 jv0K = jv0.K();
        try {
            com.google.android.gms.internal.ads.Ew0 ew0B = com.google.android.gms.internal.ads.C5512vw0.a().b(jv0K.getClass());
            ew0B.h(jv0K, bArr, i6, i6 + i10, new com.google.android.gms.internal.ads.Su0(c5730xv0));
            ew0B.a(jv0K);
            return jv0K;
        } catch (com.google.android.gms.internal.ads.Kw0 e6) {
            throw e6.a();
        } catch (com.google.android.gms.internal.ads.Vv0 e10) {
            if (e10.b()) {
                throw new com.google.android.gms.internal.ads.Vv0(e10);
            }
            throw e10;
        } catch (java.io.IOException e11) {
            if (e11.getCause() instanceof com.google.android.gms.internal.ads.Vv0) {
                throw ((com.google.android.gms.internal.ads.Vv0) e11.getCause());
            }
            throw new com.google.android.gms.internal.ads.Vv0(e11);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final boolean a0(com.google.android.gms.internal.ads.Jv0 jv0, boolean z6) {
        byte bByteValue = ((java.lang.Byte) jv0.W(com.google.android.gms.internal.ads.Iv0.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zI = com.google.android.gms.internal.ads.C5512vw0.a().b(jv0.getClass()).i(jv0);
        if (z6) {
            jv0.W(com.google.android.gms.internal.ads.Iv0.SET_MEMOIZED_IS_INITIALIZED, true != zI ? null : jv0, null);
        }
        return zI;
    }

    protected static com.google.android.gms.internal.ads.Ov0 q() {
        return com.google.android.gms.internal.ads.Kv0.g();
    }

    protected static com.google.android.gms.internal.ads.Ov0 r(com.google.android.gms.internal.ads.Ov0 ov0) {
        int size = ov0.size();
        return ov0.k(size + size);
    }

    protected static com.google.android.gms.internal.ads.Rv0 t() {
        return com.google.android.gms.internal.ads.C3317bw0.n();
    }

    protected static com.google.android.gms.internal.ads.Rv0 u(com.google.android.gms.internal.ads.Rv0 rv0) {
        int size = rv0.size();
        return rv0.k(size + size);
    }

    protected static com.google.android.gms.internal.ads.Sv0 v() {
        return com.google.android.gms.internal.ads.C5622ww0.e();
    }

    protected static com.google.android.gms.internal.ads.Sv0 w(com.google.android.gms.internal.ads.Sv0 sv0) {
        int size = sv0.size();
        return sv0.k(size + size);
    }

    static java.lang.Object z(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
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

    void B() {
        this.zzq = 0;
    }

    void C() {
        j(Integer.MAX_VALUE);
    }

    protected void D() {
        com.google.android.gms.internal.ads.C5512vw0.a().b(getClass()).a(this);
        E();
    }

    void E() {
        this.zzd &= Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4523mw0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.Fv0 b() {
        return (com.google.android.gms.internal.ads.Fv0) W(com.google.android.gms.internal.ads.Iv0.NEW_BUILDER, null, null);
    }

    public final com.google.android.gms.internal.ads.Fv0 H() {
        com.google.android.gms.internal.ads.Fv0 fv0 = (com.google.android.gms.internal.ads.Fv0) W(com.google.android.gms.internal.ads.Iv0.NEW_BUILDER, null, null);
        fv0.r(this);
        return fv0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4633nw0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.Jv0 a() {
        return (com.google.android.gms.internal.ads.Jv0) W(com.google.android.gms.internal.ads.Iv0.GET_DEFAULT_INSTANCE, null, null);
    }

    com.google.android.gms.internal.ads.Jv0 K() {
        return (com.google.android.gms.internal.ads.Jv0) W(com.google.android.gms.internal.ads.Iv0.NEW_MUTABLE_INSTANCE, null, null);
    }

    public final boolean P() {
        return a0(this, true);
    }

    void T(int i6) {
        this.zzq = i6;
    }

    boolean U() {
        return o() == 0;
    }

    boolean V() {
        return (this.zzd & zza) != 0;
    }

    protected abstract java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2);

    @Override // com.google.android.gms.internal.ads.InterfaceC4523mw0
    public int c() {
        return f(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4523mw0
    public void d(com.google.android.gms.internal.ads.AbstractC5070rv0 abstractC5070rv0) {
        com.google.android.gms.internal.ads.C5512vw0.a().b(getClass()).g(this, com.google.android.gms.internal.ads.C5180sv0.a(abstractC5070rv0));
    }

    @Override // com.google.android.gms.internal.ads.Ou0
    int e() {
        return this.zzd & Integer.MAX_VALUE;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return com.google.android.gms.internal.ads.C5512vw0.a().b(getClass()).f(this, (com.google.android.gms.internal.ads.Jv0) obj);
    }

    @Override // com.google.android.gms.internal.ads.Ou0
    int f(com.google.android.gms.internal.ads.Ew0 ew0) {
        if (!V()) {
            if (e() != Integer.MAX_VALUE) {
                return e();
            }
            int iS = S(ew0);
            j(iS);
            return iS;
        }
        int iS2 = S(ew0);
        if (iS2 >= 0) {
            return iS2;
        }
        throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + iS2);
    }

    public int hashCode() {
        if (V()) {
            return n();
        }
        if (U()) {
            T(n());
        }
        return o();
    }

    @Override // com.google.android.gms.internal.ads.Ou0
    void j(int i6) {
        if (i6 >= 0) {
            this.zzd = i6 | (this.zzd & zza);
            return;
        }
        throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + i6);
    }

    int n() {
        return com.google.android.gms.internal.ads.C5512vw0.a().b(getClass()).c(this);
    }

    int o() {
        return this.zzq;
    }

    protected final com.google.android.gms.internal.ads.Fv0 p() {
        return (com.google.android.gms.internal.ads.Fv0) W(com.google.android.gms.internal.ads.Iv0.NEW_BUILDER, null, null);
    }

    public java.lang.String toString() {
        return com.google.android.gms.internal.ads.AbstractC4743ow0.a(this, super.toString());
    }

    public final com.google.android.gms.internal.ads.InterfaceC5292tw0 x() {
        return (com.google.android.gms.internal.ads.InterfaceC5292tw0) W(com.google.android.gms.internal.ads.Iv0.GET_PARSER, null, null);
    }

    java.lang.Object y() {
        return W(com.google.android.gms.internal.ads.Iv0.BUILD_MESSAGE_INFO, null, null);
    }
}
