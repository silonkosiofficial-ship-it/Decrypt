package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class Z2 implements com.google.android.gms.internal.measurement.InterfaceC6035i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p170r.Y f40781a;

    Z2(p170r.Y y6) {
        this.f40781a = y6;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0019 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x001b  */
    /* JADX WARN: Code duplicated, block: B:8:0x000e  */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x001b, please report this as an issue */
    @Override // com.google.android.gms.internal.measurement.InterfaceC6035i3
    public final java.lang.String a(android.net.Uri uri, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        p170r.Y y6;
        if (uri == null) {
            if (str == null) {
                y6 = null;
            }
            if (y6 == null) {
                return null;
            }
            if (str2 != null) {
                str3 = str2 + str3;
            }
            return (java.lang.String) y6.get(str3);
        }
        str = uri.toString();
        p170r.Y y10 = this.f40781a;
        if (y10 == null) {
            y6 = null;
        } else {
            y6 = (p170r.Y) y10.get(str);
        }
        if (y6 == null) {
            return null;
        }
        if (str2 != null) {
            str3 = str2 + str3;
        }
        return (java.lang.String) y6.get(str3);
    }
}
