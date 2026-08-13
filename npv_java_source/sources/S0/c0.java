package S0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public static final java.util.concurrent.Executor d(final android.view.Choreographer choreographer) {
        return new java.util.concurrent.Executor() { // from class: S0.a0
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                S0.c0.e(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(android.view.Choreographer choreographer, final java.lang.Runnable runnable) {
        choreographer.postFrameCallback(new android.view.Choreographer.FrameCallback() { // from class: S0.b0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j6) {
                S0.c0.f(runnable, j6);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(java.lang.Runnable runnable, long j6) {
        runnable.run();
    }

    private static final boolean g(int i6, int i10) {
        return (i6 & i10) == i10;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0166  */
    public static final void h(android.view.inputmethod.EditorInfo editorInfo, S0.C1610s c1610s, S0.V v6) {
        int i6;
        int i10;
        int iE = c1610s.e();
        S0.r.a aVar = S0.r.f12375b;
        int i11 = 6;
        if (S0.r.m(iE, aVar.a())) {
            if (!c1610s.h()) {
                i11 = 0;
            }
        } else if (S0.r.m(iE, aVar.e())) {
            i11 = 1;
        } else if (S0.r.m(iE, aVar.c())) {
            i11 = 2;
        } else if (S0.r.m(iE, aVar.d())) {
            i11 = 5;
        } else if (S0.r.m(iE, aVar.f())) {
            i11 = 7;
        } else if (S0.r.m(iE, aVar.g())) {
            i11 = 3;
        } else if (S0.r.m(iE, aVar.h())) {
            i11 = 4;
        } else if (!S0.r.m(iE, aVar.b())) {
            throw new java.lang.IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i11;
        c1610s.g();
        int iF = c1610s.f();
        S0.C1616y.a aVar2 = S0.C1616y.f12405b;
        if (S0.C1616y.n(iF, aVar2.h())) {
            editorInfo.inputType = 1;
        } else if (S0.C1616y.n(iF, aVar2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (S0.C1616y.n(iF, aVar2.d())) {
            editorInfo.inputType = 2;
        } else if (S0.C1616y.n(iF, aVar2.g())) {
            editorInfo.inputType = 3;
        } else {
            if (S0.C1616y.n(iF, aVar2.j())) {
                i6 = 17;
            } else if (S0.C1616y.n(iF, aVar2.c())) {
                i6 = 33;
            } else if (S0.C1616y.n(iF, aVar2.f())) {
                i6 = 129;
            } else if (S0.C1616y.n(iF, aVar2.e())) {
                i6 = 18;
            } else {
                if (!S0.C1616y.n(iF, aVar2.b())) {
                    throw new java.lang.IllegalStateException("Invalid Keyboard Type".toString());
                }
                i6 = 8194;
            }
            editorInfo.inputType = i6;
        }
        if (!c1610s.h() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (S0.r.m(c1610s.e(), aVar.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int iC = c1610s.c();
            S0.C1615x.a aVar3 = S0.C1615x.f12398b;
            if (S0.C1615x.i(iC, aVar3.a())) {
                i10 = editorInfo.inputType | 4096;
            } else if (S0.C1615x.i(iC, aVar3.e())) {
                i10 = editorInfo.inputType | 8192;
            } else if (S0.C1615x.i(iC, aVar3.c())) {
                i10 = editorInfo.inputType | 16384;
            } else if (c1610s.b()) {
                editorInfo.inputType |= 32768;
            }
            editorInfo.inputType = i10;
            if (c1610s.b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = M0.N.n(v6.h());
        editorInfo.initialSelEnd = M0.N.i(v6.h());
        F1.c.f(editorInfo, v6.i());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(android.view.inputmethod.EditorInfo editorInfo) {
        if (androidx.emoji2.text.f.k()) {
            androidx.emoji2.text.f.c().x(editorInfo);
        }
    }
}
