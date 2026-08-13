package p200u;

/* JADX INFO: renamed from: u.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7181m {
    public static final p200u.C7179l a(float f6, float f10, long j6, long j10, boolean z6) {
        return new p200u.C7179l(p200u.z0.i(p247y7.C7344m.f57303a), java.lang.Float.valueOf(f6), p200u.AbstractC7191s.a(f10), j6, j10, z6);
    }

    public static final p200u.C7179l b(p200u.x0 x0Var, java.lang.Object obj, java.lang.Object obj2, long j6, long j10, boolean z6) {
        return new p200u.C7179l(x0Var, obj, (p200u.r) x0Var.a().l(obj2), j6, j10, z6);
    }

    public static /* synthetic */ p200u.C7179l c(float f6, float f10, long j6, long j10, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            f10 = 0.0f;
        }
        long j11 = (i6 & 4) != 0 ? Long.MIN_VALUE : j6;
        long j12 = (i6 & 8) == 0 ? j10 : Long.MIN_VALUE;
        if ((i6 & 16) != 0) {
            z6 = false;
        }
        return a(f6, f10, j11, j12, z6);
    }

    public static final p200u.C7179l e(p200u.C7179l c7179l, float f6, float f10, long j6, long j10, boolean z6) {
        return new p200u.C7179l(c7179l.n(), java.lang.Float.valueOf(f6), p200u.AbstractC7191s.a(f10), j6, j10, z6);
    }

    public static final p200u.C7179l f(p200u.C7179l c7179l, java.lang.Object obj, p200u.r rVar, long j6, long j10, boolean z6) {
        return new p200u.C7179l(c7179l.n(), obj, rVar, j6, j10, z6);
    }

    public static /* synthetic */ p200u.C7179l g(p200u.C7179l c7179l, float f6, float f10, long j6, long j10, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            f6 = ((java.lang.Number) c7179l.getValue()).floatValue();
        }
        if ((i6 & 2) != 0) {
            f10 = ((p200u.C7183n) c7179l.q()).f();
        }
        float f11 = f10;
        if ((i6 & 4) != 0) {
            j6 = c7179l.g();
        }
        long j11 = j6;
        if ((i6 & 8) != 0) {
            j10 = c7179l.e();
        }
        long j12 = j10;
        if ((i6 & 16) != 0) {
            z6 = c7179l.r();
        }
        return e(c7179l, f6, f11, j11, j12, z6);
    }

    public static /* synthetic */ p200u.C7179l h(p200u.C7179l c7179l, java.lang.Object obj, p200u.r rVar, long j6, long j10, boolean z6, int i6, java.lang.Object obj2) {
        if ((i6 & 1) != 0) {
            obj = c7179l.getValue();
        }
        if ((i6 & 2) != 0) {
            rVar = p200u.AbstractC7191s.e(c7179l.q());
        }
        p200u.r rVar2 = rVar;
        if ((i6 & 4) != 0) {
            j6 = c7179l.g();
        }
        long j11 = j6;
        if ((i6 & 8) != 0) {
            j10 = c7179l.e();
        }
        long j12 = j10;
        if ((i6 & 16) != 0) {
            z6 = c7179l.r();
        }
        return f(c7179l, obj, rVar2, j11, j12, z6);
    }

    public static final p200u.r i(p200u.x0 x0Var, java.lang.Object obj) {
        p200u.r rVar = (p200u.r) x0Var.a().l(obj);
        rVar.d();
        return rVar;
    }
}
