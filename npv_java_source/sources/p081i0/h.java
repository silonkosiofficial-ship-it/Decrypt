package p081i0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p081i0.h f46622a = new p081i0.h();

    private h() {
    }

    public final int a(android.view.ViewStructure viewStructure, int i6) {
        return viewStructure.addChildCount(i6);
    }

    public final android.view.ViewStructure b(android.view.ViewStructure viewStructure, int i6) {
        return viewStructure.newChild(i6);
    }

    public final void c(android.view.ViewStructure viewStructure, int i6, int i10, int i11, int i12, int i13, int i14) {
        viewStructure.setDimens(i6, i10, i11, i12, i13, i14);
    }

    public final void d(android.view.ViewStructure viewStructure, int i6, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        viewStructure.setId(i6, str, str2, str3);
    }
}
