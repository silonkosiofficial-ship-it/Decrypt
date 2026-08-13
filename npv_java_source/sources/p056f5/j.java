package p056f5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    private enum a implements java.util.concurrent.Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            runnable.run();
        }
    }

    public static java.util.concurrent.Executor a() {
        return f5.j.a.INSTANCE;
    }

    public static java.util.concurrent.Executor b(java.util.concurrent.Executor executor) {
        return new p056f5.k(executor);
    }
}
