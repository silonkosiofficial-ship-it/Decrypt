package p141o0;

/* JADX INFO: renamed from: o0.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6984n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p141o0.AbstractC6984n0.a f52247b = new p141o0.AbstractC6984n0.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f52248a;

    /* JADX INFO: renamed from: o0.n0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p141o0.AbstractC6984n0 a(p087i7.u[] uVarArr, long j6, long j10, int i6) {
            java.util.ArrayList arrayList = new java.util.ArrayList(uVarArr.length);
            for (p087i7.u uVar : uVarArr) {
                arrayList.add(p141o0.C7016y0.i(((p141o0.C7016y0) uVar.d()).w()));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(uVarArr.length);
            for (p087i7.u uVar2 : uVarArr) {
                arrayList2.add(java.lang.Float.valueOf(((java.lang.Number) uVar2.c()).floatValue()));
            }
            return new p141o0.I1(arrayList, arrayList2, j6, j10, i6, null);
        }

        public final p141o0.AbstractC6984n0 b(p087i7.u[] uVarArr, long j6, float f6, int i6) {
            java.util.ArrayList arrayList = new java.util.ArrayList(uVarArr.length);
            for (p087i7.u uVar : uVarArr) {
                arrayList.add(p141o0.C7016y0.i(((p141o0.C7016y0) uVar.d()).w()));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(uVarArr.length);
            for (p087i7.u uVar2 : uVarArr) {
                arrayList2.add(java.lang.Float.valueOf(((java.lang.Number) uVar2.c()).floatValue()));
            }
            return new p141o0.W1(arrayList, arrayList2, j6, f6, i6, null);
        }

        public final p141o0.AbstractC6984n0 c(p087i7.u[] uVarArr, long j6) {
            java.util.ArrayList arrayList = new java.util.ArrayList(uVarArr.length);
            for (p087i7.u uVar : uVarArr) {
                arrayList.add(p141o0.C7016y0.i(((p141o0.C7016y0) uVar.d()).w()));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(uVarArr.length);
            for (p087i7.u uVar2 : uVarArr) {
                arrayList2.add(java.lang.Float.valueOf(((java.lang.Number) uVar2.c()).floatValue()));
            }
            return new p141o0.i2(j6, arrayList, arrayList2, null);
        }
    }

    private AbstractC6984n0() {
        this.f52248a = p131n0.m.f51333b.a();
    }

    public /* synthetic */ AbstractC6984n0(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public abstract void a(long j6, p141o0.N1 n6, float f6);
}
