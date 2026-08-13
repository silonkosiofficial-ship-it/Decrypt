package androidx.compose.ui.platform.coreshims;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f20091a;

    private static class a {
        static android.os.Bundle a(android.view.ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        static void b(android.view.ViewStructure viewStructure, java.lang.String str) {
            viewStructure.setClassName(str);
        }

        static void c(android.view.ViewStructure viewStructure, java.lang.CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void d(android.view.ViewStructure viewStructure, int i6, int i10, int i11, int i12, int i13, int i14) {
            viewStructure.setDimens(i6, i10, i11, i12, i13, i14);
        }

        static void e(android.view.ViewStructure viewStructure, int i6, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            viewStructure.setId(i6, str, str2, str3);
        }

        static void f(android.view.ViewStructure viewStructure, java.lang.CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        static void g(android.view.ViewStructure viewStructure, float f6, int i6, int i10, int i11) {
            viewStructure.setTextStyle(f6, i6, i10, i11);
        }
    }

    private f(android.view.ViewStructure viewStructure) {
        this.f20091a = viewStructure;
    }

    public static androidx.compose.ui.platform.coreshims.f i(android.view.ViewStructure viewStructure) {
        return new androidx.compose.ui.platform.coreshims.f(viewStructure);
    }

    public android.os.Bundle a() {
        return androidx.compose.ui.platform.coreshims.f.a.a((android.view.ViewStructure) this.f20091a);
    }

    public void b(java.lang.String str) {
        androidx.compose.ui.platform.coreshims.f.a.b((android.view.ViewStructure) this.f20091a, str);
    }

    public void c(java.lang.CharSequence charSequence) {
        androidx.compose.ui.platform.coreshims.f.a.c((android.view.ViewStructure) this.f20091a, charSequence);
    }

    public void d(int i6, int i10, int i11, int i12, int i13, int i14) {
        androidx.compose.ui.platform.coreshims.f.a.d((android.view.ViewStructure) this.f20091a, i6, i10, i11, i12, i13, i14);
    }

    public void e(int i6, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        androidx.compose.ui.platform.coreshims.f.a.e((android.view.ViewStructure) this.f20091a, i6, str, str2, str3);
    }

    public void f(java.lang.CharSequence charSequence) {
        androidx.compose.ui.platform.coreshims.f.a.f((android.view.ViewStructure) this.f20091a, charSequence);
    }

    public void g(float f6, int i6, int i10, int i11) {
        androidx.compose.ui.platform.coreshims.f.a.g((android.view.ViewStructure) this.f20091a, f6, i6, i10, i11);
    }

    public android.view.ViewStructure h() {
        return (android.view.ViewStructure) this.f20091a;
    }
}
