package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3493db extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5357ua f34753h;

    public C3493db(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10, com.google.android.gms.internal.ads.C5357ua c5357ua) {
        super(c2262Da, "nIerOxKbHFkrAwaPfnOcaC2yUxDu3vgr+V6+Lz8BbuDzBx+zj9iucf6iyn5uQniV", "dvq2wU3xdgVVjZT9gC/0PMuBLs8WhmySJmrq8zzkkwM=", c5316u8, i6, 94);
        this.f34753h = c5357ua;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        int iIntValue = ((java.lang.Integer) this.f38978e.invoke(null, this.f34753h.a())).intValue();
        synchronized (this.f38977d) {
            this.f38977d.j0(com.google.android.gms.internal.ads.H8.a(iIntValue));
        }
    }
}
