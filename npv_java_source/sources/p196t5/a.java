package p196t5;

/* JADX INFO: loaded from: classes3.dex */
public class a implements p196t5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p196t5.d[] f54621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p196t5.b f54622c;

    public a(int i6, p196t5.d... dVarArr) {
        this.f54620a = i6;
        this.f54621b = dVarArr;
        this.f54622c = new p196t5.b(i6);
    }

    @Override // p196t5.d
    public java.lang.StackTraceElement[] a(java.lang.StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f54620a) {
            return stackTraceElementArr;
        }
        java.lang.StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (p196t5.d dVar : this.f54621b) {
            if (stackTraceElementArrA.length <= this.f54620a) {
                break;
            }
            stackTraceElementArrA = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.f54620a ? this.f54622c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
