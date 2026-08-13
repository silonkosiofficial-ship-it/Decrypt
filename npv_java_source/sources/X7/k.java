package X7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    private static /* synthetic */ void a(int i6) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i6 == 1 || i6 == 2) {
            objArr[0] = "companionObject";
        } else if (i6 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i6 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i6 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i6 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(O7.InterfaceC1421b interfaceC1421b) {
        O7.InterfaceC1441w interfaceC1441wZ0;
        if (interfaceC1421b == null) {
            a(3);
        }
        if ((interfaceC1421b instanceof O7.U) && (interfaceC1441wZ0 = ((O7.U) interfaceC1421b).z0()) != null && interfaceC1441wZ0.k().H(X7.A.f15892b)) {
            return true;
        }
        return interfaceC1421b.k().H(X7.A.f15892b);
    }

    public static boolean c(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m == null) {
            a(1);
        }
        return p178r8.f.x(interfaceC1432m) && p178r8.f.w(interfaceC1432m.b()) && !d((O7.InterfaceC1424e) interfaceC1432m);
    }

    public static boolean d(O7.InterfaceC1424e interfaceC1424e) {
        if (interfaceC1424e == null) {
            a(2);
        }
        return L7.d.a(L7.c.f6243a, interfaceC1424e);
    }

    public static boolean e(O7.U u6) {
        if (u6 == null) {
            a(0);
        }
        if (u6.j() == O7.InterfaceC1421b.a.FAKE_OVERRIDE) {
            return false;
        }
        if (c(u6.b())) {
            return true;
        }
        return p178r8.f.x(u6.b()) && b(u6);
    }
}
