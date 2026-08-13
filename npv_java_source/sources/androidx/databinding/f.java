package androidx.databinding;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static androidx.databinding.d f21884a = new androidx.databinding.DataBinderMapperImpl();

    static androidx.databinding.g a(androidx.databinding.e eVar, android.view.View view, int i6) {
        return f21884a.b(eVar, view, i6);
    }

    static androidx.databinding.g b(androidx.databinding.e eVar, android.view.View[] viewArr, int i6) {
        return f21884a.c(eVar, viewArr, i6);
    }

    private static androidx.databinding.g c(androidx.databinding.e eVar, android.view.ViewGroup viewGroup, int i6, int i10) {
        int childCount = viewGroup.getChildCount();
        int i11 = childCount - i6;
        if (i11 == 1) {
            return a(eVar, viewGroup.getChildAt(childCount - 1), i10);
        }
        android.view.View[] viewArr = new android.view.View[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            viewArr[i12] = viewGroup.getChildAt(i12 + i6);
        }
        return b(eVar, viewArr, i10);
    }

    public static androidx.databinding.g d(android.view.LayoutInflater layoutInflater, int i6, android.view.ViewGroup viewGroup, boolean z6) {
        return e(layoutInflater, i6, viewGroup, z6, null);
    }

    public static androidx.databinding.g e(android.view.LayoutInflater layoutInflater, int i6, android.view.ViewGroup viewGroup, boolean z6, androidx.databinding.e eVar) {
        boolean z10 = viewGroup != null && z6;
        return z10 ? c(eVar, viewGroup, z10 ? viewGroup.getChildCount() : 0, i6) : a(eVar, layoutInflater.inflate(i6, viewGroup, z6), i6);
    }
}
