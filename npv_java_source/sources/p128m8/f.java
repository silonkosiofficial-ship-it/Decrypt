package p128m8;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends p128m8.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l8.a.e f51219h;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(l8.a.e eVar, java.lang.String[] strArr) {
        java.util.Set setY0;
        p247y7.AbstractC7350t.f(eVar, "types");
        p247y7.AbstractC7350t.f(strArr, "strings");
        java.util.List listX = eVar.x();
        if (listX.isEmpty()) {
            setY0 = p097j7.Z.d();
        } else {
            p247y7.AbstractC7350t.c(listX);
            setY0 = p097j7.AbstractC6879v.Y0(listX);
        }
        java.util.List listY = eVar.y();
        p247y7.AbstractC7350t.e(listY, "getRecordList(...)");
        super(strArr, setY0, p128m8.h.a(listY));
        this.f51219h = eVar;
    }
}
