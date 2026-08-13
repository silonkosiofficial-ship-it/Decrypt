package androidx.compose.foundation.lazy;

/* JADX INFO: loaded from: classes.dex */
public final class a implements B.InterfaceC0793d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private V.InterfaceC1745s0 f19346a = V.AbstractC1730l1.a(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V.InterfaceC1745s0 f19347b = V.AbstractC1730l1.a(Integer.MAX_VALUE);

    @Override // B.InterfaceC0793d
    public androidx.compose.ui.d a(androidx.compose.ui.d dVar, float f6) {
        return dVar.b(new androidx.compose.foundation.lazy.ParentSizeElement(f6, this.f19346a, null, "fillParentMaxWidth", 4, null));
    }

    public final void b(int i6, int i10) {
        this.f19346a.i(i6);
        this.f19347b.i(i10);
    }
}
