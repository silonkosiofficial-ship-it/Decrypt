.class public final LN7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN7/c$a;
    }
.end annotation


# static fields
.field public static final a:LN7/c;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;

.field private static final d:Ljava/lang/String;

.field private static final e:Ljava/lang/String;

.field private static final f:Ln8/b;

.field private static final g:Ln8/c;

.field private static final h:Ln8/b;

.field private static final i:Ln8/b;

.field private static final j:Ln8/b;

.field private static final k:Ljava/util/HashMap;

.field private static final l:Ljava/util/HashMap;

.field private static final m:Ljava/util/HashMap;

.field private static final n:Ljava/util/HashMap;

.field private static final o:Ljava/util/HashMap;

.field private static final p:Ljava/util/HashMap;

.field private static final q:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .prologue
    new-instance v0, LN7/c;

    invoke-direct {v0}, LN7/c;-><init>()V

    sput-object v0, LN7/c;->a:LN7/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, LM7/f$a;->e:LM7/f$a;

    invoke-virtual {v2}, LM7/f;->b()Ln8/c;

    move-result-object v3

    invoke-virtual {v3}, Ln8/c;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x2e

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, LM7/f;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, LN7/c;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, LM7/f$b;->e:LM7/f$b;

    invoke-virtual {v2}, LM7/f;->b()Ln8/c;

    move-result-object v4

    invoke-virtual {v4}, Ln8/c;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, LM7/f;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, LN7/c;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, LM7/f$d;->e:LM7/f$d;

    invoke-virtual {v2}, LM7/f;->b()Ln8/c;

    move-result-object v4

    invoke-virtual {v4}, Ln8/c;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, LM7/f;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, LN7/c;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, LM7/f$c;->e:LM7/f$c;

    invoke-virtual {v2}, LM7/f;->b()Ln8/c;

    move-result-object v4

    invoke-virtual {v4}, Ln8/c;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, LM7/f;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, LN7/c;->e:Ljava/lang/String;

    new-instance v1, Ln8/c;

    const-string v2, "kotlin.jvm.functions.FunctionN"

    invoke-direct {v1, v2}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v1

    const-string v2, "topLevel(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v1, LN7/c;->f:Ln8/b;

    invoke-virtual {v1}, Ln8/b;->b()Ln8/c;

    move-result-object v1

    const-string v4, "asSingleFqName(...)"

    invoke-static {v1, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v1, LN7/c;->g:Ln8/c;

    sget-object v1, Ln8/i;->a:Ln8/i;

    invoke-virtual {v1}, Ln8/i;->k()Ln8/b;

    move-result-object v4

    sput-object v4, LN7/c;->h:Ln8/b;

    invoke-virtual {v1}, Ln8/i;->j()Ln8/b;

    move-result-object v1

    sput-object v1, LN7/c;->i:Ln8/b;

    const-class v1, Ljava/lang/Class;

    invoke-direct {v0, v1}, LN7/c;->g(Ljava/lang/Class;)Ln8/b;

    move-result-object v1

    sput-object v1, LN7/c;->j:Ln8/b;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v1, LN7/c;->k:Ljava/util/HashMap;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v1, LN7/c;->l:Ljava/util/HashMap;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v1, LN7/c;->m:Ljava/util/HashMap;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v1, LN7/c;->n:Ljava/util/HashMap;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v1, LN7/c;->o:Ljava/util/HashMap;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v1, LN7/c;->p:Ljava/util/HashMap;

    sget-object v1, LL7/j$a;->U:Ln8/c;

    invoke-static {v1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, LL7/j$a;->c0:Ln8/c;

    new-instance v5, Ln8/b;

    invoke-virtual {v1}, Ln8/b;->h()Ln8/c;

    move-result-object v6

    invoke-virtual {v1}, Ln8/b;->h()Ln8/c;

    move-result-object v7

    const-string v8, "getPackageFqName(...)"

    invoke-static {v7, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v7}, Ln8/e;->g(Ln8/c;Ln8/c;)Ln8/c;

    move-result-object v4

    const/4 v7, 0x0

    invoke-direct {v5, v6, v4, v7}, Ln8/b;-><init>(Ln8/c;Ln8/c;Z)V

    new-instance v4, LN7/c$a;

    const-class v6, Ljava/lang/Iterable;

    invoke-direct {v0, v6}, LN7/c;->g(Ljava/lang/Class;)Ln8/b;

    move-result-object v6

    invoke-direct {v4, v6, v1, v5}, LN7/c$a;-><init>(Ln8/b;Ln8/b;Ln8/b;)V

    sget-object v1, LL7/j$a;->T:Ln8/c;

    invoke-static {v1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, LL7/j$a;->b0:Ln8/c;

    new-instance v6, Ln8/b;

    invoke-virtual {v1}, Ln8/b;->h()Ln8/c;

    move-result-object v9

    invoke-virtual {v1}, Ln8/b;->h()Ln8/c;

    move-result-object v10

    invoke-static {v10, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v10}, Ln8/e;->g(Ln8/c;Ln8/c;)Ln8/c;

    move-result-object v5

    invoke-direct {v6, v9, v5, v7}, Ln8/b;-><init>(Ln8/c;Ln8/c;Z)V

    new-instance v5, LN7/c$a;

    const-class v9, Ljava/util/Iterator;

    invoke-direct {v0, v9}, LN7/c;->g(Ljava/lang/Class;)Ln8/b;

    move-result-object v9

    invoke-direct {v5, v9, v1, v6}, LN7/c$a;-><init>(Ln8/b;Ln8/b;Ln8/b;)V

    sget-object v1, LL7/j$a;->V:Ln8/c;

    invoke-static {v1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, LL7/j$a;->d0:Ln8/c;

    new-instance v9, Ln8/b;

    invoke-virtual {v1}, Ln8/b;->h()Ln8/c;

    move-result-object v10

    invoke-virtual {v1}, Ln8/b;->h()Ln8/c;

    move-result-object v11

    invoke-static {v11, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v11}, Ln8/e;->g(Ln8/c;Ln8/c;)Ln8/c;

    move-result-object v6

    invoke-direct {v9, v10, v6, v7}, Ln8/b;-><init>(Ln8/c;Ln8/c;Z)V

    new-instance v6, LN7/c$a;

    const-class v10, Ljava/util/Collection;

    invoke-direct {v0, v10}, LN7/c;->g(Ljava/lang/Class;)Ln8/b;

    move-result-object v10

    invoke-direct {v6, v10, v1, v9}, LN7/c$a;-><init>(Ln8/b;Ln8/b;Ln8/b;)V

    sget-object v1, LL7/j$a;->W:Ln8/c;

    invoke-static {v1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, LL7/j$a;->e0:Ln8/c;

    new-instance v10, Ln8/b;

    invoke-virtual {v1}, Ln8/b;->h()Ln8/c;

    move-result-object v11

    invoke-virtual {v1}, Ln8/b;->h()Ln8/c;

    move-result-object v12

    invoke-static {v12, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9, v12}, Ln8/e;->g(Ln8/c;Ln8/c;)Ln8/c;

    move-result-object v9

    invoke-direct {v10, v11, v9, v7}, Ln8/b;-><init>(Ln8/c;Ln8/c;Z)V

    new-instance v9, LN7/c$a;

    const-class v11, Ljava/util/List;

    invoke-direct {v0, v11}, LN7/c;->g(Ljava/lang/Class;)Ln8/b;

    move-result-object v11

    invoke-direct {v9, v11, v1, v10}, LN7/c$a;-><init>(Ln8/b;Ln8/b;Ln8/b;)V

    sget-object v1, LL7/j$a;->Y:Ln8/c;

    invoke-static {v1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v10, LL7/j$a;->g0:Ln8/c;

    new-instance v11, Ln8/b;

    invoke-virtual {v1}, Ln8/b;->h()Ln8/c;

    move-result-object v12

    invoke-virtual {v1}, Ln8/b;->h()Ln8/c;

    move-result-object v13

    invoke-static {v13, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v13}, Ln8/e;->g(Ln8/c;Ln8/c;)Ln8/c;

    move-result-object v10

    invoke-direct {v11, v12, v10, v7}, Ln8/b;-><init>(Ln8/c;Ln8/c;Z)V

    new-instance v10, LN7/c$a;

    const-class v12, Ljava/util/Set;

    invoke-direct {v0, v12}, LN7/c;->g(Ljava/lang/Class;)Ln8/b;

    move-result-object v12

    invoke-direct {v10, v12, v1, v11}, LN7/c$a;-><init>(Ln8/b;Ln8/b;Ln8/b;)V

    sget-object v1, LL7/j$a;->X:Ln8/c;

    invoke-static {v1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v11, LL7/j$a;->f0:Ln8/c;

    new-instance v12, Ln8/b;

    invoke-virtual {v1}, Ln8/b;->h()Ln8/c;

    move-result-object v13

    invoke-virtual {v1}, Ln8/b;->h()Ln8/c;

    move-result-object v14

    invoke-static {v14, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11, v14}, Ln8/e;->g(Ln8/c;Ln8/c;)Ln8/c;

    move-result-object v11

    invoke-direct {v12, v13, v11, v7}, Ln8/b;-><init>(Ln8/c;Ln8/c;Z)V

    new-instance v11, LN7/c$a;

    const-class v13, Ljava/util/ListIterator;

    invoke-direct {v0, v13}, LN7/c;->g(Ljava/lang/Class;)Ln8/b;

    move-result-object v13

    invoke-direct {v11, v13, v1, v12}, LN7/c$a;-><init>(Ln8/b;Ln8/b;Ln8/b;)V

    sget-object v1, LL7/j$a;->Z:Ln8/c;

    invoke-static {v1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v12

    invoke-static {v12, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v13, LL7/j$a;->h0:Ln8/c;

    new-instance v14, Ln8/b;

    invoke-virtual {v12}, Ln8/b;->h()Ln8/c;

    move-result-object v15

    invoke-virtual {v12}, Ln8/b;->h()Ln8/c;

    move-result-object v3

    invoke-static {v3, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v13, v3}, Ln8/e;->g(Ln8/c;Ln8/c;)Ln8/c;

    move-result-object v3

    invoke-direct {v14, v15, v3, v7}, Ln8/b;-><init>(Ln8/c;Ln8/c;Z)V

    new-instance v3, LN7/c$a;

    const-class v13, Ljava/util/Map;

    invoke-direct {v0, v13}, LN7/c;->g(Ljava/lang/Class;)Ln8/b;

    move-result-object v13

    invoke-direct {v3, v13, v12, v14}, LN7/c$a;-><init>(Ln8/b;Ln8/b;Ln8/b;)V

    invoke-static {v1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v1

    sget-object v12, LL7/j$a;->a0:Ln8/c;

    invoke-virtual {v12}, Ln8/c;->g()Ln8/f;

    move-result-object v12

    invoke-virtual {v1, v12}, Ln8/b;->d(Ln8/f;)Ln8/b;

    move-result-object v1

    const-string v12, "createNestedClassId(...)"

    invoke-static {v1, v12}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v13, LL7/j$a;->i0:Ln8/c;

    new-instance v14, Ln8/b;

    invoke-virtual {v1}, Ln8/b;->h()Ln8/c;

    move-result-object v15

    invoke-virtual {v1}, Ln8/b;->h()Ln8/c;

    move-result-object v7

    invoke-static {v7, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v13, v7}, Ln8/e;->g(Ln8/c;Ln8/c;)Ln8/c;

    move-result-object v7

    const/4 v8, 0x0

    invoke-direct {v14, v15, v7, v8}, Ln8/b;-><init>(Ln8/c;Ln8/c;Z)V

    new-instance v7, LN7/c$a;

    const-class v13, Ljava/util/Map$Entry;

    invoke-direct {v0, v13}, LN7/c;->g(Ljava/lang/Class;)Ln8/b;

    move-result-object v13

    invoke-direct {v7, v13, v1, v14}, LN7/c$a;-><init>(Ln8/b;Ln8/b;Ln8/b;)V

    const/16 v1, 0x8

    new-array v1, v1, [LN7/c$a;

    aput-object v4, v1, v8

    const/4 v4, 0x1

    aput-object v5, v1, v4

    const/4 v5, 0x2

    aput-object v6, v1, v5

    const/4 v5, 0x3

    aput-object v9, v1, v5

    const/4 v5, 0x4

    aput-object v10, v1, v5

    const/4 v5, 0x5

    aput-object v11, v1, v5

    const/4 v5, 0x6

    aput-object v3, v1, v5

    const/4 v3, 0x7

    aput-object v7, v1, v3

    invoke-static {v1}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, LN7/c;->q:Ljava/util/List;

    const-class v3, Ljava/lang/Object;

    sget-object v5, LL7/j$a;->b:Ln8/d;

    invoke-direct {v0, v3, v5}, LN7/c;->f(Ljava/lang/Class;Ln8/d;)V

    const-class v3, Ljava/lang/String;

    sget-object v5, LL7/j$a;->h:Ln8/d;

    invoke-direct {v0, v3, v5}, LN7/c;->f(Ljava/lang/Class;Ln8/d;)V

    const-class v3, Ljava/lang/CharSequence;

    sget-object v5, LL7/j$a;->g:Ln8/d;

    invoke-direct {v0, v3, v5}, LN7/c;->f(Ljava/lang/Class;Ln8/d;)V

    const-class v3, Ljava/lang/Throwable;

    sget-object v5, LL7/j$a;->u:Ln8/c;

    invoke-direct {v0, v3, v5}, LN7/c;->e(Ljava/lang/Class;Ln8/c;)V

    const-class v3, Ljava/lang/Cloneable;

    sget-object v5, LL7/j$a;->d:Ln8/d;

    invoke-direct {v0, v3, v5}, LN7/c;->f(Ljava/lang/Class;Ln8/d;)V

    const-class v3, Ljava/lang/Number;

    sget-object v5, LL7/j$a;->r:Ln8/d;

    invoke-direct {v0, v3, v5}, LN7/c;->f(Ljava/lang/Class;Ln8/d;)V

    const-class v3, Ljava/lang/Comparable;

    sget-object v5, LL7/j$a;->v:Ln8/c;

    invoke-direct {v0, v3, v5}, LN7/c;->e(Ljava/lang/Class;Ln8/c;)V

    const-class v3, Ljava/lang/Enum;

    sget-object v5, LL7/j$a;->s:Ln8/d;

    invoke-direct {v0, v3, v5}, LN7/c;->f(Ljava/lang/Class;Ln8/d;)V

    const-class v3, Ljava/lang/annotation/Annotation;

    sget-object v5, LL7/j$a;->G:Ln8/c;

    invoke-direct {v0, v3, v5}, LN7/c;->e(Ljava/lang/Class;Ln8/c;)V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LN7/c$a;

    sget-object v3, LN7/c;->a:LN7/c;

    invoke-direct {v3, v1}, LN7/c;->d(LN7/c$a;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lw8/e;->values()[Lw8/e;

    move-result-object v0

    array-length v1, v0

    move v3, v8

    :goto_1
    if-ge v3, v1, :cond_1

    aget-object v5, v0, v3

    sget-object v6, LN7/c;->a:LN7/c;

    invoke-virtual {v5}, Lw8/e;->q()Ln8/c;

    move-result-object v7

    invoke-static {v7}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v7

    invoke-static {v7, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Lw8/e;->o()LL7/h;

    move-result-object v5

    const-string v9, "getPrimitiveType(...)"

    invoke-static {v5, v9}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, LL7/j;->c(LL7/h;)Ln8/c;

    move-result-object v5

    invoke-static {v5}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v5

    invoke-static {v5, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v7, v5}, LN7/c;->a(Ln8/b;Ln8/b;)V

    add-int/2addr v3, v4

    goto :goto_1

    :cond_1
    sget-object v0, LL7/c;->a:LL7/c;

    invoke-virtual {v0}, LL7/c;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln8/b;

    sget-object v3, LN7/c;->a:LN7/c;

    new-instance v5, Ln8/c;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "kotlin.jvm.internal."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ln8/b;->j()Ln8/f;

    move-result-object v7

    invoke-virtual {v7}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "CompanionObject"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v5

    invoke-static {v5, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Ln8/h;->d:Ln8/f;

    invoke-virtual {v1, v6}, Ln8/b;->d(Ln8/f;)Ln8/b;

    move-result-object v1

    invoke-static {v1, v12}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v5, v1}, LN7/c;->a(Ln8/b;Ln8/b;)V

    goto :goto_2

    :cond_2
    move v0, v8

    :goto_3
    const/16 v1, 0x17

    if-ge v0, v1, :cond_3

    sget-object v1, LN7/c;->a:LN7/c;

    new-instance v3, Ln8/c;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "kotlin.jvm.functions.Function"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v3

    invoke-static {v3, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LL7/j;->a(I)Ln8/b;

    move-result-object v5

    invoke-direct {v1, v3, v5}, LN7/c;->a(Ln8/b;Ln8/b;)V

    new-instance v3, Ln8/c;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, LN7/c;->c:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5}, Ln8/c;-><init>(Ljava/lang/String;)V

    sget-object v5, LN7/c;->h:Ln8/b;

    invoke-direct {v1, v3, v5}, LN7/c;->c(Ln8/c;Ln8/b;)V

    add-int/2addr v0, v4

    goto :goto_3

    :cond_3
    move v7, v8

    :goto_4
    const/16 v0, 0x16

    if-ge v7, v0, :cond_4

    sget-object v0, LM7/f$c;->e:LM7/f$c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, LM7/f;->b()Ln8/c;

    move-result-object v2

    invoke-virtual {v2}, Ln8/c;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2e

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LM7/f;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, LN7/c;->a:LN7/c;

    new-instance v3, Ln8/c;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ln8/c;-><init>(Ljava/lang/String;)V

    sget-object v0, LN7/c;->h:Ln8/b;

    invoke-direct {v1, v3, v0}, LN7/c;->c(Ln8/c;Ln8/b;)V

    add-int/2addr v7, v4

    goto :goto_4

    :cond_4
    sget-object v0, LN7/c;->a:LN7/c;

    sget-object v1, LL7/j$a;->c:Ln8/d;

    invoke-virtual {v1}, Ln8/d;->l()Ln8/c;

    move-result-object v1

    const-string v2, "toSafe(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Ljava/lang/Void;

    invoke-direct {v0, v2}, LN7/c;->g(Ljava/lang/Class;)Ln8/b;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LN7/c;->c(Ln8/c;Ln8/b;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ln8/b;Ln8/b;)V
    .locals 1

    invoke-direct {p0, p1, p2}, LN7/c;->b(Ln8/b;Ln8/b;)V

    invoke-virtual {p2}, Ln8/b;->b()Ln8/c;

    move-result-object p2

    const-string v0, "asSingleFqName(...)"

    invoke-static {p2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1}, LN7/c;->c(Ln8/c;Ln8/b;)V

    return-void
.end method

.method private final b(Ln8/b;Ln8/b;)V
    .locals 2

    sget-object v0, LN7/c;->k:Ljava/util/HashMap;

    invoke-virtual {p1}, Ln8/b;->b()Ln8/c;

    move-result-object p1

    invoke-virtual {p1}, Ln8/c;->j()Ln8/d;

    move-result-object p1

    const-string v1, "toUnsafe(...)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final c(Ln8/c;Ln8/b;)V
    .locals 2

    sget-object v0, LN7/c;->l:Ljava/util/HashMap;

    invoke-virtual {p1}, Ln8/c;->j()Ln8/d;

    move-result-object p1

    const-string v1, "toUnsafe(...)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final d(LN7/c$a;)V
    .locals 4

    invoke-virtual {p1}, LN7/c$a;->a()Ln8/b;

    move-result-object v0

    invoke-virtual {p1}, LN7/c$a;->b()Ln8/b;

    move-result-object v1

    invoke-virtual {p1}, LN7/c$a;->c()Ln8/b;

    move-result-object p1

    invoke-direct {p0, v0, v1}, LN7/c;->a(Ln8/b;Ln8/b;)V

    invoke-virtual {p1}, Ln8/b;->b()Ln8/c;

    move-result-object v2

    const-string v3, "asSingleFqName(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v2, v0}, LN7/c;->c(Ln8/c;Ln8/b;)V

    sget-object v0, LN7/c;->o:Ljava/util/HashMap;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, LN7/c;->p:Ljava/util/HashMap;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ln8/b;->b()Ln8/c;

    move-result-object v0

    invoke-static {v0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ln8/b;->b()Ln8/c;

    move-result-object v1

    invoke-static {v1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, LN7/c;->m:Ljava/util/HashMap;

    invoke-virtual {p1}, Ln8/b;->b()Ln8/c;

    move-result-object p1

    invoke-virtual {p1}, Ln8/c;->j()Ln8/d;

    move-result-object p1

    const-string v3, "toUnsafe(...)"

    invoke-static {p1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, LN7/c;->n:Ljava/util/HashMap;

    invoke-virtual {v0}, Ln8/c;->j()Ln8/d;

    move-result-object v0

    invoke-static {v0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final e(Ljava/lang/Class;Ln8/c;)V
    .locals 1

    invoke-direct {p0, p1}, LN7/c;->g(Ljava/lang/Class;)Ln8/b;

    move-result-object p1

    invoke-static {p2}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object p2

    const-string v0, "topLevel(...)"

    invoke-static {p2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LN7/c;->a(Ln8/b;Ln8/b;)V

    return-void
.end method

.method private final f(Ljava/lang/Class;Ln8/d;)V
    .locals 1

    invoke-virtual {p2}, Ln8/d;->l()Ln8/c;

    move-result-object p2

    const-string v0, "toSafe(...)"

    invoke-static {p2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LN7/c;->e(Ljava/lang/Class;Ln8/c;)V

    return-void
.end method

.method private final g(Ljava/lang/Class;)Ln8/b;
    .locals 1

    .prologue
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Ln8/c;

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object p1

    const-string v0, "topLevel(...)"

    :goto_0
    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-direct {p0, v0}, LN7/c;->g(Ljava/lang/Class;)Ln8/b;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln8/b;->d(Ln8/f;)Ln8/b;

    move-result-object p1

    const-string v0, "createNestedClassId(...)"

    goto :goto_0

    :goto_1
    return-object p1
.end method

.method private final j(Ln8/d;Ljava/lang/String;)Z
    .locals 3

    .prologue
    invoke-virtual {p1}, Ln8/d;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, "asString(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ""

    invoke-static {p1, p2, v0}, LS8/r;->g1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    const/4 v0, 0x0

    if-lez p2, :cond_0

    const/4 p2, 0x2

    const/4 v1, 0x0

    const/16 v2, 0x30

    invoke-static {p1, v2, v0, p2, v1}, LS8/r;->a1(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {p1}, LS8/r;->v(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 p2, 0x17

    if-lt p1, p2, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method


# virtual methods
.method public final h()Ln8/c;
    .locals 1

    sget-object v0, LN7/c;->g:Ln8/c;

    return-object v0
.end method

.method public final i()Ljava/util/List;
    .locals 1

    sget-object v0, LN7/c;->q:Ljava/util/List;

    return-object v0
.end method

.method public final k(Ln8/d;)Z
    .locals 1

    sget-object v0, LN7/c;->m:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final l(Ln8/d;)Z
    .locals 1

    sget-object v0, LN7/c;->n:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final m(Ln8/c;)Ln8/b;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LN7/c;->k:Ljava/util/HashMap;

    invoke-virtual {p1}, Ln8/c;->j()Ln8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln8/b;

    return-object p1
.end method

.method public final n(Ln8/d;)Ln8/b;
    .locals 1

    .prologue
    const-string v0, "kotlinFqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LN7/c;->b:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, LN7/c;->j(Ln8/d;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    sget-object p1, LN7/c;->f:Ln8/b;

    goto :goto_2

    :cond_0
    sget-object v0, LN7/c;->d:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, LN7/c;->j(Ln8/d;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, LN7/c;->c:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, LN7/c;->j(Ln8/d;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_1
    sget-object p1, LN7/c;->h:Ln8/b;

    goto :goto_2

    :cond_2
    sget-object v0, LN7/c;->e:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, LN7/c;->j(Ln8/d;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    sget-object v0, LN7/c;->l:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln8/b;

    :goto_2
    return-object p1
.end method

.method public final o(Ln8/d;)Ln8/c;
    .locals 1

    sget-object v0, LN7/c;->m:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln8/c;

    return-object p1
.end method

.method public final p(Ln8/d;)Ln8/c;
    .locals 1

    sget-object v0, LN7/c;->n:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln8/c;

    return-object p1
.end method
