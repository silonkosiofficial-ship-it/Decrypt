package p040e;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    public static final class a extends p040e.w {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p237x7.l f44466d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z6, p237x7.l lVar) {
            super(z6);
            this.f44466d = lVar;
        }

        @Override // p040e.w
        public void d() {
            this.f44466d.l(this);
        }
    }

    public static final p040e.w a(p040e.x xVar, androidx.lifecycle.r rVar, boolean z6, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(xVar, "<this>");
        p247y7.AbstractC7350t.f(lVar, "onBackPressed");
        e.z.a aVar = new e.z.a(z6, lVar);
        if (rVar != null) {
            xVar.h(rVar, aVar);
        } else {
            xVar.i(aVar);
        }
        return aVar;
    }

    public static /* synthetic */ p040e.w b(p040e.x xVar, androidx.lifecycle.r rVar, boolean z6, p237x7.l lVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            rVar = null;
        }
        if ((i6 & 2) != 0) {
            z6 = true;
        }
        return a(xVar, rVar, z6, lVar);
    }
}
