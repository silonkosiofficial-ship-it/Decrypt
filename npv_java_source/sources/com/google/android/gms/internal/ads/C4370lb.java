package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4370lb extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.StackTraceElement[] f37186h;

    public C4370lb(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10, java.lang.StackTraceElement[] stackTraceElementArr) {
        super(c2262Da, "xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=", c5316u8, i6, 45);
        this.f37186h = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        java.lang.StackTraceElement[] stackTraceElementArr = this.f37186h;
        if (stackTraceElementArr != null) {
            com.google.android.gms.internal.ads.C5247ta c5247ta = new com.google.android.gms.internal.ads.C5247ta((java.lang.String) this.f38978e.invoke(null, stackTraceElementArr));
            synchronized (this.f38977d) {
                try {
                    this.f38977d.F(c5247ta.f38971b.longValue());
                    if (c5247ta.f38972c.booleanValue()) {
                        this.f38977d.h0(true != c5247ta.f38973d.booleanValue() ? 2 : 1);
                    } else {
                        this.f38977d.h0(3);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }
}
