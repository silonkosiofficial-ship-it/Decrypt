package androidx.databinding.library.baseAdapters;

/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends androidx.databinding.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final android.util.SparseIntArray f21908a = new android.util.SparseIntArray(0);

    @Override // androidx.databinding.d
    public java.util.List a() {
        return new java.util.ArrayList(0);
    }

    @Override // androidx.databinding.d
    public androidx.databinding.g b(androidx.databinding.e eVar, android.view.View view, int i6) {
        if (f21908a.get(i6) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new java.lang.RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.d
    public androidx.databinding.g c(androidx.databinding.e eVar, android.view.View[] viewArr, int i6) {
        if (viewArr == null || viewArr.length == 0 || f21908a.get(i6) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new java.lang.RuntimeException("view must have a tag");
    }
}
