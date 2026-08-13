package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class UO implements com.google.android.gms.internal.ads.GO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC3379cY f32203b;

    UO(long j6, android.content.Context context, com.google.android.gms.internal.ads.NO no, com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su, java.lang.String str) {
        this.f32202a = j6;
        com.google.android.gms.internal.ads.T50 t50B = abstractC2846Su.B();
        t50B.a(context);
        t50B.b(new p184s3.c2());
        t50B.y(str);
        com.google.android.gms.internal.ads.BinderC3379cY binderC3379cYA = t50B.f().a();
        this.f32203b = binderC3379cYA;
        binderC3379cYA.u3(new com.google.android.gms.internal.ads.TO(this, no));
    }

    @Override // com.google.android.gms.internal.ads.GO
    public final void a() {
        this.f32203b.C();
    }

    @Override // com.google.android.gms.internal.ads.GO
    public final void b(p184s3.X1 x6) {
        this.f32203b.K3(x6);
    }

    @Override // com.google.android.gms.internal.ads.GO
    public final void c() {
        this.f32203b.m6(X3.b.c2(null));
    }
}
