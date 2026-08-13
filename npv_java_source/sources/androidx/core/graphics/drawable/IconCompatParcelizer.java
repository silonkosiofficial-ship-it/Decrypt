package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static androidx.core.graphics.drawable.IconCompat read(androidx.versionedparcelable.a aVar) {
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat();
        iconCompat.f21539a = aVar.p(iconCompat.f21539a, 1);
        iconCompat.f21541c = aVar.j(iconCompat.f21541c, 2);
        iconCompat.f21542d = aVar.r(iconCompat.f21542d, 3);
        iconCompat.f21543e = aVar.p(iconCompat.f21543e, 4);
        iconCompat.f21544f = aVar.p(iconCompat.f21544f, 5);
        iconCompat.f21545g = (android.content.res.ColorStateList) aVar.r(iconCompat.f21545g, 6);
        iconCompat.f21547i = aVar.t(iconCompat.f21547i, 7);
        iconCompat.f21548j = aVar.t(iconCompat.f21548j, 8);
        iconCompat.j();
        return iconCompat;
    }

    public static void write(androidx.core.graphics.drawable.IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(true, true);
        iconCompat.k(aVar.f());
        int i6 = iconCompat.f21539a;
        if (-1 != i6) {
            aVar.F(i6, 1);
        }
        byte[] bArr = iconCompat.f21541c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        android.os.Parcelable parcelable = iconCompat.f21542d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i10 = iconCompat.f21543e;
        if (i10 != 0) {
            aVar.F(i10, 4);
        }
        int i11 = iconCompat.f21544f;
        if (i11 != 0) {
            aVar.F(i11, 5);
        }
        android.content.res.ColorStateList colorStateList = iconCompat.f21545g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        java.lang.String str = iconCompat.f21547i;
        if (str != null) {
            aVar.J(str, 7);
        }
        java.lang.String str2 = iconCompat.f21548j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
