package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p170r.C7026a f23787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final p170r.C7026a f23788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final p170r.C7026a f23789c;

    public a(p170r.C7026a c7026a, p170r.C7026a c7026a2, p170r.C7026a c7026a3) {
        this.f23787a = c7026a;
        this.f23788b = c7026a2;
        this.f23789c = c7026a3;
    }

    private void N(F2.a aVar) {
        try {
            I(c(aVar.getClass()).getName());
        } catch (java.lang.ClassNotFoundException e6) {
            throw new java.lang.RuntimeException(aVar.getClass().getSimpleName() + " does not have a Parcelizer", e6);
        }
    }

    private java.lang.Class c(java.lang.Class cls) throws java.lang.ClassNotFoundException {
        java.lang.Class cls2 = (java.lang.Class) this.f23789c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        java.lang.Class<?> cls3 = java.lang.Class.forName(java.lang.String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f23789c.put(cls.getName(), cls3);
        return cls3;
    }

    private java.lang.reflect.Method d(java.lang.String str) throws java.lang.NoSuchMethodException {
        java.lang.reflect.Method method = (java.lang.reflect.Method) this.f23787a.get(str);
        if (method != null) {
            return method;
        }
        java.lang.System.currentTimeMillis();
        java.lang.reflect.Method declaredMethod = java.lang.Class.forName(str, true, androidx.versionedparcelable.a.class.getClassLoader()).getDeclaredMethod("read", androidx.versionedparcelable.a.class);
        this.f23787a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private java.lang.reflect.Method e(java.lang.Class cls) throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        java.lang.reflect.Method method = (java.lang.reflect.Method) this.f23788b.get(cls.getName());
        if (method != null) {
            return method;
        }
        java.lang.Class clsC = c(cls);
        java.lang.System.currentTimeMillis();
        java.lang.reflect.Method declaredMethod = clsC.getDeclaredMethod("write", cls, androidx.versionedparcelable.a.class);
        this.f23788b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    protected abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i6) {
        w(i6);
        A(bArr);
    }

    protected abstract void C(java.lang.CharSequence charSequence);

    public void D(java.lang.CharSequence charSequence, int i6) {
        w(i6);
        C(charSequence);
    }

    protected abstract void E(int i6);

    public void F(int i6, int i10) {
        w(i10);
        E(i6);
    }

    protected abstract void G(android.os.Parcelable parcelable);

    public void H(android.os.Parcelable parcelable, int i6) {
        w(i6);
        G(parcelable);
    }

    protected abstract void I(java.lang.String str);

    public void J(java.lang.String str, int i6) {
        w(i6);
        I(str);
    }

    protected void K(F2.a aVar, androidx.versionedparcelable.a aVar2) {
        try {
            e(aVar.getClass()).invoke(null, aVar, aVar2);
        } catch (java.lang.ClassNotFoundException e6) {
            throw new java.lang.RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
        } catch (java.lang.IllegalAccessException e10) {
            throw new java.lang.RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (java.lang.NoSuchMethodException e11) {
            throw new java.lang.RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
        } catch (java.lang.reflect.InvocationTargetException e12) {
            if (!(e12.getCause() instanceof java.lang.RuntimeException)) {
                throw new java.lang.RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
            }
            throw ((java.lang.RuntimeException) e12.getCause());
        }
    }

    protected void L(F2.a aVar) {
        if (aVar == null) {
            I(null);
            return;
        }
        N(aVar);
        androidx.versionedparcelable.a aVarB = b();
        K(aVar, aVarB);
        aVarB.a();
    }

    public void M(F2.a aVar, int i6) {
        w(i6);
        L(aVar);
    }

    protected abstract void a();

    protected abstract androidx.versionedparcelable.a b();

    public boolean f() {
        return false;
    }

    protected abstract boolean g();

    public boolean h(boolean z6, int i6) {
        return !m(i6) ? z6 : g();
    }

    protected abstract byte[] i();

    public byte[] j(byte[] bArr, int i6) {
        return !m(i6) ? bArr : i();
    }

    protected abstract java.lang.CharSequence k();

    public java.lang.CharSequence l(java.lang.CharSequence charSequence, int i6) {
        return !m(i6) ? charSequence : k();
    }

    protected abstract boolean m(int i6);

    protected F2.a n(java.lang.String str, androidx.versionedparcelable.a aVar) {
        try {
            return (F2.a) d(str).invoke(null, aVar);
        } catch (java.lang.ClassNotFoundException e6) {
            throw new java.lang.RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
        } catch (java.lang.IllegalAccessException e10) {
            throw new java.lang.RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (java.lang.NoSuchMethodException e11) {
            throw new java.lang.RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
        } catch (java.lang.reflect.InvocationTargetException e12) {
            if (e12.getCause() instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) e12.getCause());
            }
            throw new java.lang.RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
        }
    }

    protected abstract int o();

    public int p(int i6, int i10) {
        return !m(i10) ? i6 : o();
    }

    protected abstract android.os.Parcelable q();

    public android.os.Parcelable r(android.os.Parcelable parcelable, int i6) {
        return !m(i6) ? parcelable : q();
    }

    protected abstract java.lang.String s();

    public java.lang.String t(java.lang.String str, int i6) {
        return !m(i6) ? str : s();
    }

    protected F2.a u() {
        java.lang.String strS = s();
        if (strS == null) {
            return null;
        }
        return n(strS, b());
    }

    public F2.a v(F2.a aVar, int i6) {
        return !m(i6) ? aVar : u();
    }

    protected abstract void w(int i6);

    public void x(boolean z6, boolean z10) {
    }

    protected abstract void y(boolean z6);

    public void z(boolean z6, int i6) {
        w(i6);
        y(z6);
    }
}
