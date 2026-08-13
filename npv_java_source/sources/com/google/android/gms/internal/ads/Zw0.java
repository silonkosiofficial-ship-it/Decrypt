package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Zw0 implements com.google.android.gms.internal.ads.Nv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final com.google.android.gms.internal.ads.Nv0 f33947a = new com.google.android.gms.internal.ads.Zw0();

    private Zw0() {
    }

    @Override // com.google.android.gms.internal.ads.Nv0
    public final boolean r(int i6) {
        if (i6 != 0 && i6 != 1 && i6 != 2 && i6 != 1999) {
            switch (i6) {
                case 1000:
                case 1001:
                case 1002:
                case 1003:
                case 1004:
                case 1005:
                case 1006:
                case 1007:
                case 1008:
                case 1009:
                case 1010:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
