package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2742Qa extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {
    public C2742Qa(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10) {
        super(c2262Da, "IuqhWQe4tlbVfr7yvxlVNsd5e/l7lVHvlqpkvK+6tt5EoeON2tkyyhuv1x7KBAeM", "CXimWsgId9Q4NJ7Th/z0oZbD0fgxUqQs1m5HYkmnDaE=", c5316u8, i6, 49);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() throws java.lang.reflect.InvocationTargetException {
        int i6 = 1;
        this.f38977d.d0(3);
        try {
            boolean zBooleanValue = ((java.lang.Boolean) this.f38978e.invoke(null, this.f38974a.b())).booleanValue();
            com.google.android.gms.internal.ads.C5316u8 c5316u8 = this.f38977d;
            if (true == zBooleanValue) {
                i6 = 2;
            }
            c5316u8.d0(i6);
        } catch (java.lang.reflect.InvocationTargetException e6) {
            if (!(e6.getTargetException() instanceof android.provider.Settings.SettingNotFoundException)) {
                throw e6;
            }
        }
    }
}
