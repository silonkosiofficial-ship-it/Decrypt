package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4670oE0 extends android.database.ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.ContentResolver f37752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.net.Uri f37753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4999rE0 f37754c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4670oE0(com.google.android.gms.internal.ads.C4999rE0 c4999rE0, android.os.Handler handler, android.content.ContentResolver contentResolver, android.net.Uri uri) {
        super(handler);
        this.f37754c = c4999rE0;
        this.f37752a = contentResolver;
        this.f37753b = uri;
    }

    public final void a() {
        this.f37752a.registerContentObserver(this.f37753b, false, this);
    }

    public final void b() {
        this.f37752a.unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        com.google.android.gms.internal.ads.C4999rE0 c4999rE0 = this.f37754c;
        this.f37754c.j(com.google.android.gms.internal.ads.C4450mE0.c(c4999rE0.f38461a, c4999rE0.f38468h, c4999rE0.f38467g));
    }
}
