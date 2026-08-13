package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4271kg0 implements com.google.android.gms.internal.ads.InterfaceC2201Bg0 {
    protected AbstractC4271kg0() {
    }

    public static com.google.android.gms.internal.ads.AbstractC4271kg0 c(char c6) {
        return new com.google.android.gms.internal.ads.C3943hg0(c6);
    }

    public abstract boolean a(char c6);

    @Override // com.google.android.gms.internal.ads.InterfaceC2201Bg0
    public final /* synthetic */ boolean b(java.lang.Object obj) {
        return a(((java.lang.Character) obj).charValue());
    }
}
