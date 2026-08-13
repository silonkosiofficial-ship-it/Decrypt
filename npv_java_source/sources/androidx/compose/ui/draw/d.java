package androidx.compose.ui.draw;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p191t0.b bVar, boolean z6, p071h0.c cVar, D0.InterfaceC0889h interfaceC0889h, float f6, p141o0.AbstractC7019z0 abstractC7019z0) {
        return dVar.b(new androidx.compose.ui.draw.PainterElement(bVar, z6, cVar, interfaceC0889h, f6, abstractC7019z0));
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, p191t0.b bVar, boolean z6, p071h0.c cVar, D0.InterfaceC0889h interfaceC0889h, float f6, p141o0.AbstractC7019z0 abstractC7019z0, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = true;
        }
        boolean z10 = z6;
        if ((i6 & 4) != 0) {
            cVar = p071h0.c.f45778a.e();
        }
        p071h0.c cVar2 = cVar;
        if ((i6 & 8) != 0) {
            interfaceC0889h = D0.InterfaceC0889h.f1855a.b();
        }
        D0.InterfaceC0889h interfaceC0889h2 = interfaceC0889h;
        if ((i6 & 16) != 0) {
            f6 = 1.0f;
        }
        float f10 = f6;
        if ((i6 & 32) != 0) {
            abstractC7019z0 = null;
        }
        return a(dVar, bVar, z10, cVar2, interfaceC0889h2, f10, abstractC7019z0);
    }
}
