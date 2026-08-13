package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
abstract class z {
    private static androidx.core.os.i a(androidx.core.os.i iVar, androidx.core.os.i iVar2) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        int i6 = 0;
        while (i6 < iVar.g() + iVar2.g()) {
            java.util.Locale localeD = i6 < iVar.g() ? iVar.d(i6) : iVar2.d(i6 - iVar.g());
            if (localeD != null) {
                linkedHashSet.add(localeD);
            }
            i6++;
        }
        return androidx.core.os.i.a((java.util.Locale[]) linkedHashSet.toArray(new java.util.Locale[linkedHashSet.size()]));
    }

    static androidx.core.os.i b(androidx.core.os.i iVar, androidx.core.os.i iVar2) {
        return (iVar == null || iVar.f()) ? androidx.core.os.i.e() : a(iVar, iVar2);
    }
}
