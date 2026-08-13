package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Gu0 extends java.lang.ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.Hu0 f27913a;

    Gu0(com.google.android.gms.internal.ads.Hu0 hu0) {
        this.f27913a = hu0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final javax.crypto.Mac initialValue() {
        try {
            javax.crypto.Mac mac = (javax.crypto.Mac) com.google.android.gms.internal.ads.C5178su0.f38819c.a(this.f27913a.f28115b);
            mac.init(this.f27913a.f28116c);
            return mac;
        } catch (java.security.GeneralSecurityException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }
}
