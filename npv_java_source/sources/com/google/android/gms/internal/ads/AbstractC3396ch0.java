package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ch0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3396ch0 extends com.google.android.gms.internal.ads.AbstractC5372uh0 implements com.google.android.gms.internal.ads.InterfaceC4605ni0 {
    protected AbstractC3396ch0(java.util.Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5372uh0
    final java.util.Collection i(java.util.Collection collection) {
        return j$.util.DesugarCollections.unmodifiableList((java.util.List) collection);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5372uh0
    final java.util.Collection j(java.lang.Object obj, java.util.Collection collection) {
        return l(obj, (java.util.List) collection, null);
    }
}
