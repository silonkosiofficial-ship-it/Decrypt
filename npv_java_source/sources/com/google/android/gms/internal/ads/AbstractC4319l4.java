package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4319l4 {
    public static void a(com.google.android.gms.internal.ads.InterfaceC4539n4 interfaceC4539n4, com.google.android.gms.internal.ads.C4978r4 c4978r4, com.google.android.gms.internal.ads.InterfaceC5000rF interfaceC5000rF) {
        for (int i6 = 0; i6 < interfaceC4539n4.a(); i6++) {
            long jB = interfaceC4539n4.B(i6);
            java.util.List listC = interfaceC4539n4.C(jB);
            if (!listC.isEmpty()) {
                if (i6 == interfaceC4539n4.a() - 1) {
                    throw new java.lang.IllegalStateException();
                }
                long jB2 = interfaceC4539n4.B(i6 + 1) - interfaceC4539n4.B(i6);
                if (jB2 > 0) {
                    interfaceC5000rF.b(new com.google.android.gms.internal.ads.C4099j4(listC, jB, jB2));
                }
            }
        }
    }
}
