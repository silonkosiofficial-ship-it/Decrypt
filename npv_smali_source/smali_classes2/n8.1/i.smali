.class public final Ln8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final A:Ln8/b;

.field private static final A0:Ln8/b;

.field private static final B:Ln8/b;

.field private static final B0:Ln8/b;

.field private static final C:Ln8/b;

.field private static final C0:Ln8/b;

.field private static final D:Ln8/b;

.field private static final D0:Ln8/b;

.field private static final E:Ln8/b;

.field private static final E0:Ln8/b;

.field private static final F:Ln8/b;

.field private static final F0:Ln8/b;

.field private static final G:Ln8/b;

.field private static final G0:Ln8/b;

.field private static final H:Ln8/b;

.field private static final H0:Ln8/b;

.field private static final I:Ln8/b;

.field private static final J:Ln8/b;

.field private static final K:Ln8/b;

.field private static final L:Ln8/b;

.field private static final M:Ln8/b;

.field private static final N:Ln8/b;

.field private static final O:Ln8/b;

.field private static final P:Ln8/b;

.field private static final Q:Ln8/b;

.field private static final R:Ln8/b;

.field private static final S:Ln8/b;

.field private static final T:Ln8/b;

.field private static final U:Ln8/b;

.field private static final V:Ln8/b;

.field private static final W:Ln8/b;

.field private static final X:Ln8/b;

.field private static final Y:Ln8/b;

.field private static final Z:Ln8/b;

.field public static final a:Ln8/i;

.field private static final a0:Ln8/b;

.field private static final b:Ln8/c;

.field private static final b0:Ljava/util/Set;

.field private static final c:Ln8/c;

.field private static final c0:Ljava/util/Map;

.field private static final d:Ln8/c;

.field private static final d0:Ljava/util/Map;

.field private static final e:Ln8/c;

.field private static final e0:Ljava/util/Set;

.field private static final f:Ln8/c;

.field private static final f0:Ljava/util/Map;

.field private static final g:Ln8/c;

.field private static final g0:Ljava/util/Map;

.field private static final h:Ln8/c;

.field private static final h0:Ljava/util/Set;

.field private static final i:Ln8/c;

.field private static final i0:Ln8/b;

.field private static final j:Ln8/c;

.field private static final j0:Ln8/b;

.field private static final k:Ln8/c;

.field private static final k0:Ln8/b;

.field private static final l:Ln8/c;

.field private static final l0:Ln8/b;

.field private static final m:Ln8/c;

.field private static final m0:Ln8/b;

.field private static final n:Ln8/c;

.field private static final n0:Ln8/b;

.field private static final o:Ln8/c;

.field private static final o0:Ln8/b;

.field private static final p:Ljava/util/Set;

.field private static final p0:Ln8/b;

.field private static final q:Ln8/b;

.field private static final q0:Ln8/b;

.field private static final r:Ln8/b;

.field private static final r0:Ln8/b;

.field private static final s:Ln8/b;

.field private static final s0:Ln8/b;

.field private static final t:Ln8/b;

.field private static final t0:Ln8/b;

.field private static final u:Ln8/b;

.field private static final u0:Ln8/b;

.field private static final v:Ln8/b;

.field private static final v0:Ln8/b;

.field private static final w:Ln8/b;

.field private static final w0:Ln8/b;

.field private static final x:Ln8/b;

.field private static final x0:Ln8/b;

.field private static final y:Ln8/b;

.field private static final y0:Ln8/b;

.field private static final z:Ln8/b;

.field private static final z0:Ln8/b;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .prologue
    new-instance v0, Ln8/i;

    invoke-direct {v0}, Ln8/i;-><init>()V

    sput-object v0, Ln8/i;->a:Ln8/i;

    new-instance v0, Ln8/c;

    const-string v1, "kotlin"

    invoke-direct {v0, v1}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Ln8/i;->b:Ln8/c;

    const-string v1, "reflect"

    invoke-static {v1}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln8/c;->c(Ln8/f;)Ln8/c;

    move-result-object v1

    const-string v2, "child(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v1, Ln8/i;->c:Ln8/c;

    const-string v3, "collections"

    invoke-static {v3}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v3

    invoke-virtual {v0, v3}, Ln8/c;->c(Ln8/f;)Ln8/c;

    move-result-object v3

    invoke-static {v3, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v3, Ln8/i;->d:Ln8/c;

    const-string v4, "ranges"

    invoke-static {v4}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v4

    invoke-virtual {v0, v4}, Ln8/c;->c(Ln8/f;)Ln8/c;

    move-result-object v4

    invoke-static {v4, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v4, Ln8/i;->e:Ln8/c;

    const-string v5, "jvm"

    invoke-static {v5}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v5

    invoke-virtual {v0, v5}, Ln8/c;->c(Ln8/f;)Ln8/c;

    move-result-object v5

    invoke-static {v5, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v5, Ln8/i;->f:Ln8/c;

    const-string v6, "internal"

    invoke-static {v6}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v7

    invoke-virtual {v5, v7}, Ln8/c;->c(Ln8/f;)Ln8/c;

    move-result-object v5

    invoke-static {v5, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v5, Ln8/i;->g:Ln8/c;

    const-string v5, "annotation"

    invoke-static {v5}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v5

    invoke-virtual {v0, v5}, Ln8/c;->c(Ln8/f;)Ln8/c;

    move-result-object v5

    invoke-static {v5, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v5, Ln8/i;->h:Ln8/c;

    invoke-static {v6}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v6

    invoke-virtual {v0, v6}, Ln8/c;->c(Ln8/f;)Ln8/c;

    move-result-object v6

    invoke-static {v6, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v6, Ln8/i;->i:Ln8/c;

    const-string v7, "ir"

    invoke-static {v7}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v7

    invoke-virtual {v6, v7}, Ln8/c;->c(Ln8/f;)Ln8/c;

    move-result-object v7

    invoke-static {v7, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v7, Ln8/i;->j:Ln8/c;

    const-string v7, "coroutines"

    invoke-static {v7}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v7

    invoke-virtual {v0, v7}, Ln8/c;->c(Ln8/f;)Ln8/c;

    move-result-object v7

    invoke-static {v7, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v7, Ln8/i;->k:Ln8/c;

    const-string v8, "enums"

    invoke-static {v8}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v8

    invoke-virtual {v0, v8}, Ln8/c;->c(Ln8/f;)Ln8/c;

    move-result-object v8

    invoke-static {v8, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v8, Ln8/i;->l:Ln8/c;

    const-string v8, "contracts"

    invoke-static {v8}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v8

    invoke-virtual {v0, v8}, Ln8/c;->c(Ln8/f;)Ln8/c;

    move-result-object v8

    invoke-static {v8, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v8, Ln8/i;->m:Ln8/c;

    const-string v8, "concurrent"

    invoke-static {v8}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v8

    invoke-virtual {v0, v8}, Ln8/c;->c(Ln8/f;)Ln8/c;

    move-result-object v8

    invoke-static {v8, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v8, Ln8/i;->n:Ln8/c;

    const-string v8, "test"

    invoke-static {v8}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v8

    invoke-virtual {v0, v8}, Ln8/c;->c(Ln8/f;)Ln8/c;

    move-result-object v8

    invoke-static {v8, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v8, Ln8/i;->o:Ln8/c;

    const/4 v2, 0x7

    new-array v8, v2, [Ln8/c;

    const/4 v9, 0x0

    aput-object v0, v8, v9

    const/4 v0, 0x1

    aput-object v3, v8, v0

    const/4 v3, 0x2

    aput-object v4, v8, v3

    const/4 v4, 0x3

    aput-object v5, v8, v4

    const/4 v5, 0x4

    aput-object v1, v8, v5

    const/4 v1, 0x5

    aput-object v6, v8, v1

    const/4 v6, 0x6

    aput-object v7, v8, v6

    invoke-static {v8}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    sput-object v7, Ln8/i;->p:Ljava/util/Set;

    const-string v7, "Nothing"

    invoke-static {v7}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v7

    sput-object v7, Ln8/i;->q:Ln8/b;

    const-string v7, "Unit"

    invoke-static {v7}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v7

    sput-object v7, Ln8/i;->r:Ln8/b;

    const-string v7, "Any"

    invoke-static {v7}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v7

    sput-object v7, Ln8/i;->s:Ln8/b;

    const-string v7, "Enum"

    invoke-static {v7}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v7

    sput-object v7, Ln8/i;->t:Ln8/b;

    const-string v7, "Annotation"

    invoke-static {v7}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v7

    sput-object v7, Ln8/i;->u:Ln8/b;

    const-string v7, "Array"

    invoke-static {v7}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v7

    sput-object v7, Ln8/i;->v:Ln8/b;

    const-string v7, "Boolean"

    invoke-static {v7}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v7

    sput-object v7, Ln8/i;->w:Ln8/b;

    const-string v8, "Char"

    invoke-static {v8}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v8

    sput-object v8, Ln8/i;->x:Ln8/b;

    const-string v10, "Byte"

    invoke-static {v10}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v10

    sput-object v10, Ln8/i;->y:Ln8/b;

    const-string v11, "Short"

    invoke-static {v11}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v11

    sput-object v11, Ln8/i;->z:Ln8/b;

    const-string v12, "Int"

    invoke-static {v12}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v12

    sput-object v12, Ln8/i;->A:Ln8/b;

    const-string v13, "Long"

    invoke-static {v13}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v13

    sput-object v13, Ln8/i;->B:Ln8/b;

    const-string v14, "Float"

    invoke-static {v14}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v14

    sput-object v14, Ln8/i;->C:Ln8/b;

    const-string v15, "Double"

    invoke-static {v15}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v15

    sput-object v15, Ln8/i;->D:Ln8/b;

    invoke-static {v10}, Ln8/j;->j(Ln8/b;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->E:Ln8/b;

    invoke-static {v11}, Ln8/j;->j(Ln8/b;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->F:Ln8/b;

    invoke-static {v12}, Ln8/j;->j(Ln8/b;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->G:Ln8/b;

    invoke-static {v13}, Ln8/j;->j(Ln8/b;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->H:Ln8/b;

    const-string v16, "CharSequence"

    invoke-static/range {v16 .. v16}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->I:Ln8/b;

    const-string v16, "String"

    invoke-static/range {v16 .. v16}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->J:Ln8/b;

    const-string v16, "Throwable"

    invoke-static/range {v16 .. v16}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->K:Ln8/b;

    const-string v16, "Cloneable"

    invoke-static/range {v16 .. v16}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->L:Ln8/b;

    const-string v16, "KProperty"

    invoke-static/range {v16 .. v16}, Ln8/j;->i(Ljava/lang/String;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->M:Ln8/b;

    const-string v16, "KMutableProperty"

    invoke-static/range {v16 .. v16}, Ln8/j;->i(Ljava/lang/String;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->N:Ln8/b;

    const-string v16, "KProperty0"

    invoke-static/range {v16 .. v16}, Ln8/j;->i(Ljava/lang/String;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->O:Ln8/b;

    const-string v16, "KMutableProperty0"

    invoke-static/range {v16 .. v16}, Ln8/j;->i(Ljava/lang/String;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->P:Ln8/b;

    const-string v16, "KProperty1"

    invoke-static/range {v16 .. v16}, Ln8/j;->i(Ljava/lang/String;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->Q:Ln8/b;

    const-string v16, "KMutableProperty1"

    invoke-static/range {v16 .. v16}, Ln8/j;->i(Ljava/lang/String;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->R:Ln8/b;

    const-string v16, "KProperty2"

    invoke-static/range {v16 .. v16}, Ln8/j;->i(Ljava/lang/String;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->S:Ln8/b;

    const-string v16, "KMutableProperty2"

    invoke-static/range {v16 .. v16}, Ln8/j;->i(Ljava/lang/String;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->T:Ln8/b;

    const-string v16, "KFunction"

    invoke-static/range {v16 .. v16}, Ln8/j;->i(Ljava/lang/String;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->U:Ln8/b;

    const-string v16, "KClass"

    invoke-static/range {v16 .. v16}, Ln8/j;->i(Ljava/lang/String;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->V:Ln8/b;

    const-string v16, "KCallable"

    invoke-static/range {v16 .. v16}, Ln8/j;->i(Ljava/lang/String;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->W:Ln8/b;

    const-string v16, "KType"

    invoke-static/range {v16 .. v16}, Ln8/j;->i(Ljava/lang/String;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->X:Ln8/b;

    const-string v16, "Comparable"

    invoke-static/range {v16 .. v16}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->Y:Ln8/b;

    const-string v16, "Number"

    invoke-static/range {v16 .. v16}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->Z:Ln8/b;

    const-string v16, "Function"

    invoke-static/range {v16 .. v16}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v16

    sput-object v16, Ln8/i;->a0:Ln8/b;

    const/16 v2, 0x8

    new-array v2, v2, [Ln8/b;

    aput-object v7, v2, v9

    aput-object v8, v2, v0

    aput-object v10, v2, v3

    aput-object v11, v2, v4

    aput-object v12, v2, v5

    aput-object v13, v2, v1

    aput-object v14, v2, v6

    const/4 v1, 0x7

    aput-object v15, v2, v1

    invoke-static {v2}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    sput-object v1, Ln8/i;->b0:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/LinkedHashMap;

    const/16 v6, 0xa

    invoke-static {v1, v6}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-static {v7}, Lj7/S;->d(I)I

    move-result v7

    const/16 v8, 0x10

    invoke-static {v7, v8}, LE7/j;->d(II)I

    move-result v7

    invoke-direct {v2, v7}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const-string v10, "getShortClassName(...)"

    if-eqz v7, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v11, v7

    check-cast v11, Ln8/b;

    invoke-virtual {v11}, Ln8/b;->j()Ln8/f;

    move-result-object v11

    invoke-static {v11, v10}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11}, Ln8/j;->g(Ln8/f;)Ln8/b;

    move-result-object v10

    invoke-interface {v2, v7, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sput-object v2, Ln8/i;->c0:Ljava/util/Map;

    invoke-static {v2}, Ln8/j;->f(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    sput-object v1, Ln8/i;->d0:Ljava/util/Map;

    new-array v1, v5, [Ln8/b;

    sget-object v2, Ln8/i;->E:Ln8/b;

    aput-object v2, v1, v9

    sget-object v2, Ln8/i;->F:Ln8/b;

    aput-object v2, v1, v0

    sget-object v0, Ln8/i;->G:Ln8/b;

    aput-object v0, v1, v3

    sget-object v0, Ln8/i;->H:Ln8/b;

    aput-object v0, v1, v4

    invoke-static {v1}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ln8/i;->e0:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-static {v0, v6}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lj7/S;->d(I)I

    move-result v2

    invoke-static {v2, v8}, LE7/j;->d(II)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ln8/b;

    invoke-virtual {v3}, Ln8/b;->j()Ln8/f;

    move-result-object v3

    invoke-static {v3, v10}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Ln8/j;->g(Ln8/f;)Ln8/b;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    sput-object v1, Ln8/i;->f0:Ljava/util/Map;

    invoke-static {v1}, Ln8/j;->f(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Ln8/i;->g0:Ljava/util/Map;

    sget-object v0, Ln8/i;->b0:Ljava/util/Set;

    sget-object v1, Ln8/i;->e0:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lj7/Z;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    sget-object v1, Ln8/i;->J:Ln8/b;

    invoke-static {v0, v1}, Lj7/Z;->k(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ln8/i;->h0:Ljava/util/Set;

    const-string v0, "Continuation"

    invoke-static {v0}, Ln8/j;->d(Ljava/lang/String;)Ln8/b;

    move-result-object v0

    sput-object v0, Ln8/i;->i0:Ln8/b;

    const-string v0, "Iterator"

    invoke-static {v0}, Ln8/j;->c(Ljava/lang/String;)Ln8/b;

    move-result-object v0

    sput-object v0, Ln8/i;->j0:Ln8/b;

    const-string v0, "Iterable"

    invoke-static {v0}, Ln8/j;->c(Ljava/lang/String;)Ln8/b;

    move-result-object v0

    sput-object v0, Ln8/i;->k0:Ln8/b;

    const-string v0, "Collection"

    invoke-static {v0}, Ln8/j;->c(Ljava/lang/String;)Ln8/b;

    move-result-object v0

    sput-object v0, Ln8/i;->l0:Ln8/b;

    const-string v0, "List"

    invoke-static {v0}, Ln8/j;->c(Ljava/lang/String;)Ln8/b;

    move-result-object v0

    sput-object v0, Ln8/i;->m0:Ln8/b;

    const-string v0, "ListIterator"

    invoke-static {v0}, Ln8/j;->c(Ljava/lang/String;)Ln8/b;

    move-result-object v0

    sput-object v0, Ln8/i;->n0:Ln8/b;

    const-string v0, "Set"

    invoke-static {v0}, Ln8/j;->c(Ljava/lang/String;)Ln8/b;

    move-result-object v0

    sput-object v0, Ln8/i;->o0:Ln8/b;

    const-string v0, "Map"

    invoke-static {v0}, Ln8/j;->c(Ljava/lang/String;)Ln8/b;

    move-result-object v0

    sput-object v0, Ln8/i;->p0:Ln8/b;

    const-string v1, "MutableIterator"

    invoke-static {v1}, Ln8/j;->c(Ljava/lang/String;)Ln8/b;

    move-result-object v1

    sput-object v1, Ln8/i;->q0:Ln8/b;

    const-string v1, "CharIterator"

    invoke-static {v1}, Ln8/j;->c(Ljava/lang/String;)Ln8/b;

    move-result-object v1

    sput-object v1, Ln8/i;->r0:Ln8/b;

    const-string v1, "MutableIterable"

    invoke-static {v1}, Ln8/j;->c(Ljava/lang/String;)Ln8/b;

    move-result-object v1

    sput-object v1, Ln8/i;->s0:Ln8/b;

    const-string v1, "MutableCollection"

    invoke-static {v1}, Ln8/j;->c(Ljava/lang/String;)Ln8/b;

    move-result-object v1

    sput-object v1, Ln8/i;->t0:Ln8/b;

    const-string v1, "MutableList"

    invoke-static {v1}, Ln8/j;->c(Ljava/lang/String;)Ln8/b;

    move-result-object v1

    sput-object v1, Ln8/i;->u0:Ln8/b;

    const-string v1, "MutableListIterator"

    invoke-static {v1}, Ln8/j;->c(Ljava/lang/String;)Ln8/b;

    move-result-object v1

    sput-object v1, Ln8/i;->v0:Ln8/b;

    const-string v1, "MutableSet"

    invoke-static {v1}, Ln8/j;->c(Ljava/lang/String;)Ln8/b;

    move-result-object v1

    sput-object v1, Ln8/i;->w0:Ln8/b;

    const-string v1, "MutableMap"

    invoke-static {v1}, Ln8/j;->c(Ljava/lang/String;)Ln8/b;

    move-result-object v1

    sput-object v1, Ln8/i;->x0:Ln8/b;

    const-string v2, "Entry"

    invoke-static {v2}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v2

    invoke-virtual {v0, v2}, Ln8/b;->d(Ln8/f;)Ln8/b;

    move-result-object v0

    const-string v2, "createNestedClassId(...)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Ln8/i;->y0:Ln8/b;

    const-string v0, "MutableEntry"

    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    invoke-virtual {v1, v0}, Ln8/b;->d(Ln8/f;)Ln8/b;

    move-result-object v0

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Ln8/i;->z0:Ln8/b;

    const-string v0, "Result"

    invoke-static {v0}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v0

    sput-object v0, Ln8/i;->A0:Ln8/b;

    const-string v0, "IntRange"

    invoke-static {v0}, Ln8/j;->h(Ljava/lang/String;)Ln8/b;

    move-result-object v0

    sput-object v0, Ln8/i;->B0:Ln8/b;

    const-string v0, "LongRange"

    invoke-static {v0}, Ln8/j;->h(Ljava/lang/String;)Ln8/b;

    move-result-object v0

    sput-object v0, Ln8/i;->C0:Ln8/b;

    const-string v0, "CharRange"

    invoke-static {v0}, Ln8/j;->h(Ljava/lang/String;)Ln8/b;

    move-result-object v0

    sput-object v0, Ln8/i;->D0:Ln8/b;

    const-string v0, "AnnotationRetention"

    invoke-static {v0}, Ln8/j;->a(Ljava/lang/String;)Ln8/b;

    move-result-object v0

    sput-object v0, Ln8/i;->E0:Ln8/b;

    const-string v0, "AnnotationTarget"

    invoke-static {v0}, Ln8/j;->a(Ljava/lang/String;)Ln8/b;

    move-result-object v0

    sput-object v0, Ln8/i;->F0:Ln8/b;

    const-string v0, "DeprecationLevel"

    invoke-static {v0}, Ln8/j;->b(Ljava/lang/String;)Ln8/b;

    move-result-object v0

    sput-object v0, Ln8/i;->G0:Ln8/b;

    const-string v0, "EnumEntries"

    invoke-static {v0}, Ln8/j;->e(Ljava/lang/String;)Ln8/b;

    move-result-object v0

    sput-object v0, Ln8/i;->H0:Ln8/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ln8/b;
    .locals 1

    sget-object v0, Ln8/i;->v:Ln8/b;

    return-object v0
.end method

.method public final b()Ln8/c;
    .locals 1

    sget-object v0, Ln8/i;->h:Ln8/c;

    return-object v0
.end method

.method public final c()Ln8/c;
    .locals 1

    sget-object v0, Ln8/i;->d:Ln8/c;

    return-object v0
.end method

.method public final d()Ln8/c;
    .locals 1

    sget-object v0, Ln8/i;->k:Ln8/c;

    return-object v0
.end method

.method public final e()Ln8/c;
    .locals 1

    sget-object v0, Ln8/i;->l:Ln8/c;

    return-object v0
.end method

.method public final f()Ln8/c;
    .locals 1

    sget-object v0, Ln8/i;->b:Ln8/c;

    return-object v0
.end method

.method public final g()Ln8/c;
    .locals 1

    sget-object v0, Ln8/i;->e:Ln8/c;

    return-object v0
.end method

.method public final h()Ln8/c;
    .locals 1

    sget-object v0, Ln8/i;->c:Ln8/c;

    return-object v0
.end method

.method public final i()Ln8/b;
    .locals 1

    sget-object v0, Ln8/i;->H0:Ln8/b;

    return-object v0
.end method

.method public final j()Ln8/b;
    .locals 1

    sget-object v0, Ln8/i;->V:Ln8/b;

    return-object v0
.end method

.method public final k()Ln8/b;
    .locals 1

    sget-object v0, Ln8/i;->U:Ln8/b;

    return-object v0
.end method

.method public final l()Ln8/b;
    .locals 1

    sget-object v0, Ln8/i;->u0:Ln8/b;

    return-object v0
.end method

.method public final m()Ln8/b;
    .locals 1

    sget-object v0, Ln8/i;->x0:Ln8/b;

    return-object v0
.end method

.method public final n()Ln8/b;
    .locals 1

    sget-object v0, Ln8/i;->w0:Ln8/b;

    return-object v0
.end method
