package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4621nq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f37682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f37683b;

    /* synthetic */ C4621nq0(com.google.android.gms.internal.ads.AbstractC4951qq0 abstractC4951qq0) {
        this.f37682a = new java.util.HashMap();
        this.f37683b = new java.util.HashMap();
    }

    /* synthetic */ C4621nq0(com.google.android.gms.internal.ads.C5060rq0 c5060rq0, com.google.android.gms.internal.ads.AbstractC4951qq0 abstractC4951qq0) {
        this.f37682a = new java.util.HashMap(c5060rq0.f38562a);
        this.f37683b = new java.util.HashMap(c5060rq0.f38563b);
    }

    public final com.google.android.gms.internal.ads.C4621nq0 a(com.google.android.gms.internal.ads.AbstractC4511mq0 abstractC4511mq0) throws java.security.GeneralSecurityException {
        if (abstractC4511mq0 == null) {
            throw new java.lang.NullPointerException("primitive constructor must be non-null");
        }
        com.google.android.gms.internal.ads.C4731oq0 c4731oq0 = new com.google.android.gms.internal.ads.C4731oq0(abstractC4511mq0.c(), abstractC4511mq0.d(), null);
        if (this.f37682a.containsKey(c4731oq0)) {
            com.google.android.gms.internal.ads.AbstractC4511mq0 abstractC4511mq1 = (com.google.android.gms.internal.ads.AbstractC4511mq0) this.f37682a.get(c4731oq0);
            if (!abstractC4511mq1.equals(abstractC4511mq0) || !abstractC4511mq0.equals(abstractC4511mq1)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(c4731oq0.toString()));
            }
        } else {
            this.f37682a.put(c4731oq0, abstractC4511mq0);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.C4621nq0 b(com.google.android.gms.internal.ads.InterfaceC5610wq0 interfaceC5610wq0) throws java.security.GeneralSecurityException {
        java.util.Map map = this.f37683b;
        java.lang.Class clsB = interfaceC5610wq0.b();
        if (map.containsKey(clsB)) {
            com.google.android.gms.internal.ads.InterfaceC5610wq0 interfaceC5610wq1 = (com.google.android.gms.internal.ads.InterfaceC5610wq0) this.f37683b.get(clsB);
            if (!interfaceC5610wq1.equals(interfaceC5610wq0) || !interfaceC5610wq0.equals(interfaceC5610wq1)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsB.toString()));
            }
        } else {
            this.f37683b.put(clsB, interfaceC5610wq0);
        }
        return this;
    }
}
