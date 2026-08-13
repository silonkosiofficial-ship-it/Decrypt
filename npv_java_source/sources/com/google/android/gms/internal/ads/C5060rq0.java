package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5060rq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f38562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f38563b;

    /* synthetic */ C5060rq0(com.google.android.gms.internal.ads.C4621nq0 c4621nq0, com.google.android.gms.internal.ads.AbstractC4951qq0 abstractC4951qq0) {
        this.f38562a = new java.util.HashMap(c4621nq0.f37682a);
        this.f38563b = new java.util.HashMap(c4621nq0.f37683b);
    }

    public final java.lang.Class a(java.lang.Class cls) throws java.security.GeneralSecurityException {
        if (this.f38563b.containsKey(cls)) {
            return ((com.google.android.gms.internal.ads.InterfaceC5610wq0) this.f38563b.get(cls)).a();
        }
        throw new java.security.GeneralSecurityException("No input primitive class for " + cls.toString() + " available");
    }

    public final java.lang.Object b(com.google.android.gms.internal.ads.El0 el0, java.lang.Class cls) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.C4731oq0 c4731oq0 = new com.google.android.gms.internal.ads.C4731oq0(el0.getClass(), cls, null);
        if (this.f38562a.containsKey(c4731oq0)) {
            return ((com.google.android.gms.internal.ads.AbstractC4511mq0) this.f38562a.get(c4731oq0)).a(el0);
        }
        throw new java.security.GeneralSecurityException("No PrimitiveConstructor for " + c4731oq0.toString() + " available");
    }

    public final java.lang.Object c(com.google.android.gms.internal.ads.C5500vq0 c5500vq0, java.lang.Class cls) throws java.security.GeneralSecurityException {
        if (!this.f38563b.containsKey(cls)) {
            throw new java.security.GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        com.google.android.gms.internal.ads.InterfaceC5610wq0 interfaceC5610wq0 = (com.google.android.gms.internal.ads.InterfaceC5610wq0) this.f38563b.get(cls);
        if (c5500vq0.d().equals(interfaceC5610wq0.a()) && interfaceC5610wq0.a().equals(c5500vq0.d())) {
            return interfaceC5610wq0.c(c5500vq0);
        }
        throw new java.security.GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
