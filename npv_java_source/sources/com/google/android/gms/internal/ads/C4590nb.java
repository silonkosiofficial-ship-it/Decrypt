package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4590nb extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2521Ka f37616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f37617i;

    public C4590nb(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10, com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2521Ka viewOnAttachStateChangeListenerC2521Ka) {
        super(c2262Da, "IhZL/A+AP3q6BJHYZzhe50ZZY+joh9QA4Yw9iPAZ5epuj4PBIlbCfCRKNYc+Lpx6", "aH+LkkSrrb3t9z/9chsxYBmeH34qaSymsmB0IYlZ8kA=", c5316u8, i6, 53);
        this.f37616h = viewOnAttachStateChangeListenerC2521Ka;
        if (viewOnAttachStateChangeListenerC2521Ka != null) {
            this.f37617i = viewOnAttachStateChangeListenerC2521Ka.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        if (this.f37616h != null) {
            this.f38977d.Q(((java.lang.Long) this.f38978e.invoke(null, java.lang.Long.valueOf(this.f37617i))).longValue());
        }
    }
}
