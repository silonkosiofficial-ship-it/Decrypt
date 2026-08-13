package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class i implements com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.InterfaceC0470a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.internal.C2148c f24920a;

    i(com.google.android.gms.common.api.internal.C2148c c2148c) {
        this.f24920a = c2148c;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.InterfaceC0470a
    public final void a(boolean z6) {
        com.google.android.gms.common.api.internal.C2148c c2148c = this.f24920a;
        c2148c.f24903P.sendMessage(c2148c.f24903P.obtainMessage(1, java.lang.Boolean.valueOf(z6)));
    }
}
