package K;

/* JADX INFO: renamed from: K.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1303z {
    private static final boolean a(int i6, int i10) {
        return (i6 & i10) == i10;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x016f  */
    public static final void b(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, long j6, S0.C1610s c1610s, java.lang.String[] strArr) {
        int i6;
        int iE = c1610s.e();
        S0.r.a aVar = S0.r.f12375b;
        int i10 = 3;
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
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            K.v0.f5923a.a(editorInfo, c1610s.d());
        }
        int iF = c1610s.f();
        S0.C1616y.a aVar2 = S0.C1616y.f12405b;
        if (S0.C1616y.n(iF, aVar2.h())) {
            i10 = 1;
        } else if (S0.C1616y.n(iF, aVar2.a())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i10 = 1;
        } else if (S0.C1616y.n(iF, aVar2.d())) {
            i10 = 2;
        } else if (!S0.C1616y.n(iF, aVar2.g())) {
            if (S0.C1616y.n(iF, aVar2.j())) {
                i10 = 17;
            } else if (S0.C1616y.n(iF, aVar2.c())) {
                i10 = 33;
            } else if (S0.C1616y.n(iF, aVar2.f())) {
                i10 = 129;
            } else if (S0.C1616y.n(iF, aVar2.e())) {
                i10 = 18;
            } else {
                if (!S0.C1616y.n(iF, aVar2.b())) {
                    throw new java.lang.IllegalStateException("Invalid Keyboard Type".toString());
                }
                i10 = 8194;
            }
        }
        editorInfo.inputType = i10;
        if (!c1610s.h() && a(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (S0.r.m(c1610s.e(), aVar.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (a(editorInfo.inputType, 1)) {
            int iC = c1610s.c();
            S0.C1615x.a aVar3 = S0.C1615x.f12398b;
            if (S0.C1615x.i(iC, aVar3.a())) {
                i6 = editorInfo.inputType | 4096;
            } else if (S0.C1615x.i(iC, aVar3.e())) {
                i6 = editorInfo.inputType | 8192;
            } else if (S0.C1615x.i(iC, aVar3.c())) {
                i6 = editorInfo.inputType | 16384;
            } else if (c1610s.b()) {
                editorInfo.inputType |= 32768;
            }
            editorInfo.inputType = i6;
            if (c1610s.b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = M0.N.n(j6);
        editorInfo.initialSelEnd = M0.N.i(j6);
        F1.c.f(editorInfo, charSequence);
        if (strArr != null) {
            F1.c.d(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (!I.c.a() || S0.C1616y.n(c1610s.f(), aVar2.f()) || S0.C1616y.n(c1610s.f(), aVar2.e())) {
            F1.c.g(editorInfo, false);
        } else {
            F1.c.g(editorInfo, true);
            K.C1302y.f5936a.a(editorInfo);
        }
    }

    public static /* synthetic */ void c(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, long j6, S0.C1610s c1610s, java.lang.String[] strArr, int i6, java.lang.Object obj) {
        if ((i6 & 8) != 0) {
            strArr = null;
        }
        b(editorInfo, charSequence, j6, c1610s, strArr);
    }
}
