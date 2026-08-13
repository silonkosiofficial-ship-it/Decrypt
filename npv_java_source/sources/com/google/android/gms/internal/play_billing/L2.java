package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public abstract class L2 extends com.google.android.gms.internal.play_billing.Z1 {
    private static final java.util.Map zzb = new j$.util.concurrent.ConcurrentHashMap();
    private int zzd = -1;
    protected com.google.android.gms.internal.play_billing.A3 zzc = com.google.android.gms.internal.play_billing.A3.c();

    private static com.google.android.gms.internal.play_billing.L2 f(com.google.android.gms.internal.play_billing.L2 l6, byte[] bArr, int i6, int i10, com.google.android.gms.internal.play_billing.A2 a6) throws com.google.android.gms.internal.play_billing.S2 {
        if (i10 == 0) {
            return l6;
        }
        com.google.android.gms.internal.play_billing.L2 l2P = l6.p();
        try {
            com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3B = com.google.android.gms.internal.play_billing.C6281q3.a().b(l2P.getClass());
            interfaceC6298t3B.f(l2P, bArr, 0, i10, new com.google.android.gms.internal.play_billing.C6196c2(a6));
            interfaceC6298t3B.a(l2P);
            return l2P;
        } catch (com.google.android.gms.internal.play_billing.S2 e6) {
            throw e6;
        } catch (com.google.android.gms.internal.play_billing.C6328y3 e10) {
            throw e10.a();
        } catch (java.io.IOException e11) {
            if (e11.getCause() instanceof com.google.android.gms.internal.play_billing.S2) {
                throw ((com.google.android.gms.internal.play_billing.S2) e11.getCause());
            }
            throw new com.google.android.gms.internal.play_billing.S2(e11);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new com.google.android.gms.internal.play_billing.S2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final int i(com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3) {
        return com.google.android.gms.internal.play_billing.C6281q3.a().b(getClass()).b(this);
    }

    static com.google.android.gms.internal.play_billing.L2 o(java.lang.Class cls) {
        java.util.Map map = zzb;
        com.google.android.gms.internal.play_billing.L2 l6 = (com.google.android.gms.internal.play_billing.L2) map.get(cls);
        if (l6 == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                l6 = (com.google.android.gms.internal.play_billing.L2) map.get(cls);
            } catch (java.lang.ClassNotFoundException e6) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (l6 == null) {
            l6 = (com.google.android.gms.internal.play_billing.L2) ((com.google.android.gms.internal.play_billing.L2) com.google.android.gms.internal.play_billing.G3.j(cls)).j(6, null, null);
            if (l6 == null) {
                throw new java.lang.IllegalStateException();
            }
            map.put(cls, l6);
        }
        return l6;
    }

    protected static com.google.android.gms.internal.play_billing.L2 q(com.google.android.gms.internal.play_billing.L2 l6, byte[] bArr, com.google.android.gms.internal.play_billing.A2 a6) throws com.google.android.gms.internal.play_billing.S2 {
        com.google.android.gms.internal.play_billing.L2 l2F = f(l6, bArr, 0, bArr.length, a6);
        if (l2F == null || z(l2F, true)) {
            return l2F;
        }
        throw new com.google.android.gms.internal.play_billing.C6328y3(l2F).a();
    }

    protected static com.google.android.gms.internal.play_billing.O2 r() {
        return com.google.android.gms.internal.play_billing.M2.f();
    }

    protected static com.google.android.gms.internal.play_billing.P2 s() {
        return com.google.android.gms.internal.play_billing.C6286r3.e();
    }

    static java.lang.Object t(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
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

    protected static java.lang.Object u(com.google.android.gms.internal.play_billing.InterfaceC6233i3 interfaceC6233i3, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.android.gms.internal.play_billing.C6292s3(interfaceC6233i3, str, objArr);
    }

    protected static void x(java.lang.Class cls, com.google.android.gms.internal.play_billing.L2 l6) {
        l6.w();
        zzb.put(cls, l6);
    }

    protected static final boolean z(com.google.android.gms.internal.play_billing.L2 l6, boolean z6) {
        byte bByteValue = ((java.lang.Byte) l6.j(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zG = com.google.android.gms.internal.play_billing.C6281q3.a().b(l6.getClass()).g(l6);
        if (z6) {
            l6.j(2, true != zG ? null : l6, null);
        }
        return zG;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6233i3
    public final /* synthetic */ com.google.android.gms.internal.play_billing.InterfaceC6227h3 H() {
        return (com.google.android.gms.internal.play_billing.J2) j(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6233i3
    public final void a(com.google.android.gms.internal.play_billing.AbstractC6309v2 abstractC6309v2) {
        com.google.android.gms.internal.play_billing.C6281q3.a().b(getClass()).h(this, com.google.android.gms.internal.play_billing.C6315w2.J(abstractC6309v2));
    }

    @Override // com.google.android.gms.internal.play_billing.Z1
    final int b(com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3) {
        if (e()) {
            int iB = interfaceC6298t3.b(this);
            if (iB >= 0) {
                return iB;
            }
            throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + iB);
        }
        int i6 = this.zzd & Integer.MAX_VALUE;
        if (i6 != Integer.MAX_VALUE) {
            return i6;
        }
        int iB2 = interfaceC6298t3.b(this);
        if (iB2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iB2;
            return iB2;
        }
        throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + iB2);
    }

    final boolean e() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return com.google.android.gms.internal.play_billing.C6281q3.a().b(getClass()).i(this, (com.google.android.gms.internal.play_billing.L2) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6239j3
    public final /* synthetic */ com.google.android.gms.internal.play_billing.InterfaceC6233i3 h() {
        return (com.google.android.gms.internal.play_billing.L2) j(6, null, null);
    }

    public final int hashCode() {
        if (e()) {
            return l();
        }
        int i6 = this.zza;
        if (i6 != 0) {
            return i6;
        }
        int iL = l();
        this.zza = iL;
        return iL;
    }

    protected abstract java.lang.Object j(int i6, java.lang.Object obj, java.lang.Object obj2);

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6233i3
    public final int k() {
        int i6;
        if (e()) {
            i6 = i(null);
            if (i6 < 0) {
                throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + i6);
            }
        } else {
            i6 = this.zzd & Integer.MAX_VALUE;
            if (i6 == Integer.MAX_VALUE) {
                i6 = i(null);
                if (i6 < 0) {
                    throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + i6);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i6;
            }
        }
        return i6;
    }

    final int l() {
        return com.google.android.gms.internal.play_billing.C6281q3.a().b(getClass()).c(this);
    }

    protected final com.google.android.gms.internal.play_billing.J2 m() {
        return (com.google.android.gms.internal.play_billing.J2) j(5, null, null);
    }

    public final com.google.android.gms.internal.play_billing.J2 n() {
        com.google.android.gms.internal.play_billing.J2 j6 = (com.google.android.gms.internal.play_billing.J2) j(5, null, null);
        j6.j(this);
        return j6;
    }

    final com.google.android.gms.internal.play_billing.L2 p() {
        return (com.google.android.gms.internal.play_billing.L2) j(4, null, null);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.internal.play_billing.AbstractC6245k3.a(this, super.toString());
    }

    protected final void v() {
        com.google.android.gms.internal.play_billing.C6281q3.a().b(getClass()).a(this);
        w();
    }

    final void w() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void y(int i6) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }
}
