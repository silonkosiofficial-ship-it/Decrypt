package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.av, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3204av implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2990Wu f34173a;

    public C3204av(com.google.android.gms.internal.ads.C2990Wu c2990Wu) {
        this.f34173a = c2990Wu;
    }

    public static android.content.Context c(com.google.android.gms.internal.ads.C2990Wu c2990Wu) {
        android.content.Context contextB = c2990Wu.b();
        com.google.android.gms.internal.ads.AbstractC4089iz0.b(contextB);
        return contextB;
    }

    public final android.content.Context a() {
        return c(this.f34173a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* synthetic */ java.lang.Object b() {
        return c(this.f34173a);
    }
}
