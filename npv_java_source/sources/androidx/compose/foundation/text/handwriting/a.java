package androidx.compose.foundation.text.handwriting;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f19508a = Y0.i.q(40);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f19509b = Y0.i.q(10);

    public static final float a() {
        return f19509b;
    }

    public static final float b() {
        return f19508a;
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, boolean z6, p237x7.a aVar) {
        return (z6 && I.c.a()) ? androidx.compose.foundation.layout.m.j(dVar.b(new androidx.compose.foundation.text.handwriting.StylusHandwritingElementWithNegativePadding(aVar)), f19509b, f19508a) : dVar;
    }
}
