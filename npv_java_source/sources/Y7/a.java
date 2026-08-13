package Y7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: Y7.a$a, reason: collision with other inner class name */
    static class C0309a extends p178r8.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ B8.r f16456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.Set f16457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f16458c;

        /* JADX INFO: renamed from: Y7.a$a$a, reason: collision with other inner class name */
        class C0310a implements p237x7.l {
            C0310a() {
            }

            private static /* synthetic */ void a(int i6) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public p087i7.M l(O7.InterfaceC1421b interfaceC1421b) {
                if (interfaceC1421b == null) {
                    a(0);
                }
                Y7.a.C0309a.this.f16456a.a(interfaceC1421b);
                return p087i7.M.f46721a;
            }
        }

        C0309a(B8.r rVar, java.util.Set set, boolean z6) {
            this.f16456a = rVar;
            this.f16457b = set;
            this.f16458c = z6;
        }

        private static /* synthetic */ void f(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 == 1) {
                objArr[0] = "fromSuper";
            } else if (i6 == 2) {
                objArr[0] = "fromCurrent";
            } else if (i6 == 3) {
                objArr[0] = "member";
            } else if (i6 != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i6 == 1 || i6 == 2) {
                objArr[2] = "conflict";
            } else if (i6 == 3 || i6 == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p178r8.k
        public void a(O7.InterfaceC1421b interfaceC1421b) {
            if (interfaceC1421b == null) {
                f(0);
            }
            p178r8.l.K(interfaceC1421b, new Y7.a.C0309a.C0310a());
            this.f16457b.add(interfaceC1421b);
        }

        @Override // p178r8.k
        public void d(O7.InterfaceC1421b interfaceC1421b, java.util.Collection collection) {
            if (interfaceC1421b == null) {
                f(3);
            }
            if (collection == null) {
                f(4);
            }
            if (!this.f16458c || interfaceC1421b.j() == O7.InterfaceC1421b.a.FAKE_OVERRIDE) {
                super.d(interfaceC1421b, collection);
            }
        }

        @Override // p178r8.j
        public void e(O7.InterfaceC1421b interfaceC1421b, O7.InterfaceC1421b interfaceC1421b2) {
            if (interfaceC1421b == null) {
                f(1);
            }
            if (interfaceC1421b2 == null) {
                f(2);
            }
        }
    }

    private static /* synthetic */ void a(int i6) {
        java.lang.String str = i6 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i6 != 18 ? 3 : 2];
        switch (i6) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i6 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i6) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 == 18) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    public static O7.j0 b(p138n8.f fVar, O7.InterfaceC1424e interfaceC1424e) {
        if (fVar == null) {
            a(19);
        }
        if (interfaceC1424e == null) {
            a(20);
        }
        java.util.Collection collectionR = interfaceC1424e.r();
        if (collectionR.size() != 1) {
            return null;
        }
        for (O7.j0 j0Var : ((O7.InterfaceC1423d) collectionR.iterator().next()).n()) {
            if (j0Var.getName().equals(fVar)) {
                return j0Var;
            }
        }
        return null;
    }

    private static java.util.Collection c(p138n8.f fVar, java.util.Collection collection, java.util.Collection collection2, O7.InterfaceC1424e interfaceC1424e, B8.r rVar, p178r8.l lVar, boolean z6) {
        if (fVar == null) {
            a(12);
        }
        if (collection == null) {
            a(13);
        }
        if (collection2 == null) {
            a(14);
        }
        if (interfaceC1424e == null) {
            a(15);
        }
        if (rVar == null) {
            a(16);
        }
        if (lVar == null) {
            a(17);
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        lVar.v(fVar, collection, collection2, interfaceC1424e, new Y7.a.C0309a(rVar, linkedHashSet, z6));
        return linkedHashSet;
    }

    public static java.util.Collection d(p138n8.f fVar, java.util.Collection collection, java.util.Collection collection2, O7.InterfaceC1424e interfaceC1424e, B8.r rVar, p178r8.l lVar) {
        if (fVar == null) {
            a(0);
        }
        if (collection == null) {
            a(1);
        }
        if (collection2 == null) {
            a(2);
        }
        if (interfaceC1424e == null) {
            a(3);
        }
        if (rVar == null) {
            a(4);
        }
        if (lVar == null) {
            a(5);
        }
        return c(fVar, collection, collection2, interfaceC1424e, rVar, lVar, false);
    }

    public static java.util.Collection e(p138n8.f fVar, java.util.Collection collection, java.util.Collection collection2, O7.InterfaceC1424e interfaceC1424e, B8.r rVar, p178r8.l lVar) {
        if (fVar == null) {
            a(6);
        }
        if (collection == null) {
            a(7);
        }
        if (collection2 == null) {
            a(8);
        }
        if (interfaceC1424e == null) {
            a(9);
        }
        if (rVar == null) {
            a(10);
        }
        if (lVar == null) {
            a(11);
        }
        return c(fVar, collection, collection2, interfaceC1424e, rVar, lVar, true);
    }
}
