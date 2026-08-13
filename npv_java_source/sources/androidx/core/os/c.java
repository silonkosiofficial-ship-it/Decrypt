package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    static class a {
        static <T> T a(android.os.Bundle bundle, java.lang.String str, java.lang.Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }

        static <T> T[] b(android.os.Bundle bundle, java.lang.String str, java.lang.Class<T> cls) {
            return (T[]) bundle.getParcelableArray(str, cls);
        }

        static <T> java.util.ArrayList<T> c(android.os.Bundle bundle, java.lang.String str, java.lang.Class<? extends T> cls) {
            return bundle.getParcelableArrayList(str, cls);
        }

        static <T extends java.io.Serializable> T d(android.os.Bundle bundle, java.lang.String str, java.lang.Class<T> cls) {
            return (T) bundle.getSerializable(str, cls);
        }

        static <T> android.util.SparseArray<T> e(android.os.Bundle bundle, java.lang.String str, java.lang.Class<? extends T> cls) {
            return bundle.getSparseParcelableArray(str, cls);
        }
    }

    public static java.lang.Object a(android.os.Bundle bundle, java.lang.String str, java.lang.Class cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.os.c.a.a(bundle, str, cls);
        }
        android.os.Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }
}
