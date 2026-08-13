.class public final LN7/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ7/a;
.implements LQ7/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN7/i$a;,
        LN7/i$b;
    }
.end annotation


# static fields
.field static final synthetic i:[LF7/k;


# instance fields
.field private final a:LO7/G;

.field private final b:LN7/d;

.field private final c:LE8/i;

.field private final d:LF8/E;

.field private final e:LE8/i;

.field private final f:LE8/a;

.field private final g:LE8/i;

.field private final h:LE8/g;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ly7/G;

    const-class v1, LN7/i;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    const-string v3, "settings"

    const-string v4, "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;"

    invoke-direct {v0, v2, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    new-instance v2, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    const-string v4, "cloneableType"

    const-string v5, "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;"

    invoke-direct {v2, v3, v4, v5}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v2

    new-instance v3, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v4, "notConsideredDeprecation"

    const-string v5, "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"

    invoke-direct {v3, v1, v4, v5}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [LF7/k;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const/4 v0, 0x2

    aput-object v1, v3, v0

    sput-object v3, LN7/i;->i:[LF7/k;

    return-void
.end method

.method public constructor <init>(LO7/G;LE8/n;Lx7/a;)V
    .locals 1

    const-string v0, "moduleDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageManager"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingsComputation"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN7/i;->a:LO7/G;

    sget-object p1, LN7/d;->a:LN7/d;

    iput-object p1, p0, LN7/i;->b:LN7/d;

    invoke-interface {p2, p3}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LN7/i;->c:LE8/i;

    invoke-direct {p0, p2}, LN7/i;->l(LE8/n;)LF8/E;

    move-result-object p1

    iput-object p1, p0, LN7/i;->d:LF8/E;

    new-instance p1, LN7/i$c;

    invoke-direct {p1, p0, p2}, LN7/i$c;-><init>(LN7/i;LE8/n;)V

    invoke-interface {p2, p1}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LN7/i;->e:LE8/i;

    invoke-interface {p2}, LE8/n;->c()LE8/a;

    move-result-object p1

    iput-object p1, p0, LN7/i;->f:LE8/a;

    new-instance p1, LN7/i$k;

    invoke-direct {p1, p0}, LN7/i$k;-><init>(LN7/i;)V

    invoke-interface {p2, p1}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LN7/i;->g:LE8/i;

    new-instance p1, LN7/i$f;

    invoke-direct {p1, p0}, LN7/i$f;-><init>(LN7/i;)V

    invoke-interface {p2, p1}, LE8/n;->b(Lx7/l;)LE8/g;

    move-result-object p1

    iput-object p1, p0, LN7/i;->h:LE8/g;

    return-void
.end method

.method public static final synthetic f(LN7/i;)LN7/d;
    .locals 0

    iget-object p0, p0, LN7/i;->b:LN7/d;

    return-object p0
.end method

.method public static final synthetic g(LN7/i;)LO7/G;
    .locals 0

    iget-object p0, p0, LN7/i;->a:LO7/G;

    return-object p0
.end method

.method public static final synthetic h(LN7/i;)LN7/f$b;
    .locals 0

    invoke-direct {p0}, LN7/i;->u()LN7/f$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic i(LO7/b;)Ljava/lang/Iterable;
    .locals 0

    invoke-static {p0}, LN7/i;->w(LO7/b;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method static synthetic j(LN7/i;LO7/e;)Ljava/lang/Iterable;
    .locals 0

    invoke-static {p0, p1}, LN7/i;->s(LN7/i;LO7/e;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method private final k(LD8/d;LO7/Z;)LO7/Z;
    .locals 1

    invoke-interface {p2}, LO7/Z;->z()LO7/y$a;

    move-result-object p2

    invoke-interface {p2, p1}, LO7/y$a;->o(LO7/m;)LO7/y$a;

    sget-object v0, LO7/t;->e:LO7/u;

    invoke-interface {p2, v0}, LO7/y$a;->r(LO7/u;)LO7/y$a;

    invoke-virtual {p1}, LR7/a;->w()LF8/M;

    move-result-object v0

    invoke-interface {p2, v0}, LO7/y$a;->q(LF8/E;)LO7/y$a;

    invoke-virtual {p1}, LR7/a;->S0()LO7/X;

    move-result-object p1

    invoke-interface {p2, p1}, LO7/y$a;->B(LO7/X;)LO7/y$a;

    invoke-interface {p2}, LO7/y$a;->i()LO7/y;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast p1, LO7/Z;

    return-object p1
.end method

.method private final l(LE8/n;)LF8/E;
    .locals 12

    iget-object v0, p0, LN7/i;->a:LO7/G;

    new-instance v1, Ln8/c;

    const-string v2, "java.io"

    invoke-direct {v1, v2}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v4, LN7/i$d;

    invoke-direct {v4, v0, v1}, LN7/i$d;-><init>(LO7/G;Ln8/c;)V

    new-instance v0, LF8/H;

    new-instance v1, LN7/i$e;

    invoke-direct {v1, p0}, LN7/i$e;-><init>(LN7/i;)V

    invoke-direct {v0, p1, v1}, LF8/H;-><init>(LE8/n;Lx7/a;)V

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, LR7/h;

    const-string v2, "Serializable"

    invoke-static {v2}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v5

    sget-object v6, LO7/D;->G:LO7/D;

    sget-object v7, LO7/f;->E:LO7/f;

    move-object v8, v0

    check-cast v8, Ljava/util/Collection;

    sget-object v9, LO7/a0;->a:LO7/a0;

    const/4 v10, 0x0

    move-object v3, v1

    move-object v11, p1

    invoke-direct/range {v3 .. v11}, LR7/h;-><init>(LO7/m;Ln8/f;LO7/D;LO7/f;Ljava/util/Collection;LO7/a0;ZLE8/n;)V

    sget-object p1, Ly8/h$b;->b:Ly8/h$b;

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, LR7/h;->T0(Ly8/h;Ljava/util/Set;LO7/d;)V

    invoke-virtual {v1}, LR7/a;->w()LF8/M;

    move-result-object p1

    const-string v0, "getDefaultType(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final m(LO7/e;Lx7/l;)Ljava/util/Collection;
    .locals 7

    .prologue
    invoke-direct {p0, p1}, LN7/i;->q(LO7/e;)Lb8/f;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_0
    iget-object v1, p0, LN7/i;->b:LN7/d;

    invoke-static {v0}, Lv8/c;->l(LO7/m;)Ln8/c;

    move-result-object v2

    sget-object v3, LN7/b;->h:LN7/b$a;

    invoke-virtual {v3}, LN7/b$a;->a()LL7/g;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, LN7/d;->g(Ln8/c;LL7/g;)Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lj7/v;->u0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/e;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    sget-object v3, LP8/g;->E:LP8/g$b;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LO7/e;

    invoke-static {v5}, Lv8/c;->l(LO7/m;)Ln8/c;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v3, v4}, LP8/g$b;->b(Ljava/util/Collection;)LP8/g;

    move-result-object v1

    iget-object v3, p0, LN7/i;->b:LN7/d;

    invoke-virtual {v3, p1}, LN7/d;->c(LO7/e;)Z

    move-result p1

    iget-object v3, p0, LN7/i;->f:LE8/a;

    invoke-static {v0}, Lv8/c;->l(LO7/m;)Ln8/c;

    move-result-object v4

    new-instance v5, LN7/i$g;

    invoke-direct {v5, v0, v2}, LN7/i$g;-><init>(Lb8/f;LO7/e;)V

    invoke-interface {v3, v4, v5}, LE8/a;->a(Ljava/lang/Object;Lx7/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/e;

    invoke-interface {v0}, LO7/e;->M0()Ly8/h;

    move-result-object v0

    const-string v2, "getUnsubstitutedMemberScope(...)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LO7/Z;

    invoke-interface {v3}, LO7/b;->j()LO7/b$a;

    move-result-object v4

    sget-object v5, LO7/b$a;->C:LO7/b$a;

    if-eq v4, v5, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v3}, LO7/C;->h()LO7/u;

    move-result-object v4

    invoke-virtual {v4}, LO7/u;->d()Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_2

    :cond_5
    invoke-static {v3}, LL7/g;->k0(LO7/m;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_2

    :cond_6
    invoke-interface {v3}, LO7/y;->f()Ljava/util/Collection;

    move-result-object v4

    const-string v5, "getOverriddenDescriptors(...)"

    invoke-static {v4, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    instance-of v5, v4, Ljava/util/Collection;

    if-eqz v5, :cond_7

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_3

    :cond_7
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LO7/y;

    invoke-interface {v5}, LO7/y;->b()LO7/m;

    move-result-object v5

    const-string v6, "getContainingDeclaration(...)"

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lv8/c;->l(LO7/m;)Ln8/c;

    move-result-object v5

    invoke-virtual {v1, v5}, LP8/g;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_2

    :cond_9
    :goto_3
    invoke-direct {p0, v3, p1}, LN7/i;->v(LO7/Z;Z)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_a
    return-object v0
.end method

.method private final n()LF8/M;
    .locals 3

    iget-object v0, p0, LN7/i;->e:LE8/i;

    sget-object v1, LN7/i;->i:[LF7/k;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/M;

    return-object v0
.end method

.method private static final o(LO7/l;LF8/n0;LO7/l;)Z
    .locals 0

    .prologue
    invoke-interface {p2, p1}, LO7/l;->c(LF8/n0;)LO7/l;

    move-result-object p1

    invoke-static {p0, p1}, Lr8/l;->x(LO7/a;LO7/a;)Lr8/l$i$a;

    move-result-object p0

    sget-object p1, Lr8/l$i$a;->C:Lr8/l$i$a;

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private final q(LO7/e;)Lb8/f;
    .locals 3

    .prologue
    invoke-static {p1}, LL7/g;->a0(LO7/e;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {p1}, LL7/g;->B0(LO7/m;)Z

    move-result v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-static {p1}, Lv8/c;->m(LO7/m;)Ln8/d;

    move-result-object p1

    invoke-virtual {p1}, Ln8/d;->f()Z

    move-result v0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    sget-object v0, LN7/c;->a:LN7/c;

    invoke-virtual {v0, p1}, LN7/c;->n(Ln8/d;)Ln8/b;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ln8/b;->b()Ln8/c;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-direct {p0}, LN7/i;->u()LN7/f$b;

    move-result-object v0

    invoke-virtual {v0}, LN7/f$b;->a()LO7/G;

    move-result-object v0

    sget-object v2, LW7/d;->F:LW7/d;

    invoke-static {v0, p1, v2}, LO7/s;->d(LO7/G;Ln8/c;LW7/b;)LO7/e;

    move-result-object p1

    instance-of v0, p1, Lb8/f;

    if-eqz v0, :cond_4

    move-object v1, p1

    check-cast v1, Lb8/f;

    :cond_4
    :goto_0
    return-object v1
.end method

.method private final r(LO7/y;)LN7/i$a;
    .locals 4

    invoke-interface {p1}, LO7/y;->b()LO7/m;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LO7/e;

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v3, v3, v1, v2}, Lg8/y;->c(LO7/y;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ly7/O;

    invoke-direct {v1}, Ly7/O;-><init>()V

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    new-instance v2, LN7/h;

    invoke-direct {v2, p0}, LN7/h;-><init>(LN7/i;)V

    new-instance v3, LN7/i$i;

    invoke-direct {v3, p1, v1}, LN7/i$i;-><init>(Ljava/lang/String;Ly7/O;)V

    invoke-static {v0, v2, v3}, LP8/b;->b(Ljava/util/Collection;LP8/b$c;LP8/b$d;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "dfs(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LN7/i$a;

    return-object p1
.end method

.method private static final s(LN7/i;LO7/e;)Ljava/lang/Iterable;
    .locals 4

    .prologue
    const-string v0, "this$0"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/h;->p()LF8/e0;

    move-result-object p1

    invoke-interface {p1}, LF8/e0;->u()Ljava/util/Collection;

    move-result-object p1

    const-string v0, "getSupertypes(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF8/E;

    invoke-virtual {v1}, LF8/E;->W0()LF8/e0;

    move-result-object v1

    invoke-interface {v1}, LF8/e0;->w()LO7/h;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v1}, LO7/h;->a()LO7/h;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    instance-of v3, v1, LO7/e;

    if-eqz v3, :cond_2

    check-cast v1, LO7/e;

    goto :goto_2

    :cond_2
    move-object v1, v2

    :goto_2
    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-direct {p0, v1}, LN7/i;->q(LO7/e;)Lb8/f;

    move-result-object v2

    if-eqz v2, :cond_4

    goto :goto_3

    :cond_4
    move-object v2, v1

    :goto_3
    if-eqz v2, :cond_0

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    return-object v0
.end method

.method private final t()LP7/g;
    .locals 3

    iget-object v0, p0, LN7/i;->g:LE8/i;

    sget-object v1, LN7/i;->i:[LF7/k;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP7/g;

    return-object v0
.end method

.method private final u()LN7/f$b;
    .locals 3

    iget-object v0, p0, LN7/i;->c:LE8/i;

    sget-object v1, LN7/i;->i:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN7/f$b;

    return-object v0
.end method

.method private final v(LO7/Z;Z)Z
    .locals 4

    .prologue
    invoke-interface {p1}, LO7/y;->b()LO7/m;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LO7/e;

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v3, v3, v1, v2}, Lg8/y;->c(LO7/y;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, LN7/l;->a:LN7/l;

    invoke-virtual {v2}, LN7/l;->g()Ljava/util/Set;

    move-result-object v2

    sget-object v3, Lg8/A;->a:Lg8/A;

    invoke-static {v3, v0, v1}, Lg8/x;->a(Lg8/A;LO7/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr p2, v0

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-static {p1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    sget-object p2, LN7/g;->a:LN7/g;

    new-instance v0, LN7/i$j;

    invoke-direct {v0, p0}, LN7/i$j;-><init>(LN7/i;)V

    invoke-static {p1, p2, v0}, LP8/b;->e(Ljava/util/Collection;LP8/b$c;Lx7/l;)Ljava/lang/Boolean;

    move-result-object p1

    const-string p2, "ifAny(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method private static final w(LO7/b;)Ljava/lang/Iterable;
    .locals 0

    invoke-interface {p0}, LO7/b;->a()LO7/b;

    move-result-object p0

    invoke-interface {p0}, LO7/b;->f()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    return-object p0
.end method

.method private final x(LO7/l;LO7/e;)Z
    .locals 2

    .prologue
    invoke-interface {p1}, LO7/a;->n()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LO7/a;->n()Ljava/util/List;

    move-result-object p1

    const-string v0, "getValueParameters(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lj7/v;->G0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/j0;

    invoke-interface {p1}, LO7/i0;->getType()LF8/E;

    move-result-object p1

    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object p1

    invoke-interface {p1}, LF8/e0;->w()LO7/h;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lv8/c;->m(LO7/m;)Ln8/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p2}, Lv8/c;->m(LO7/m;)Ln8/d;

    move-result-object p2

    invoke-static {p1, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method


# virtual methods
.method public a(LO7/e;)Ljava/util/Collection;
    .locals 12

    .prologue
    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/e;->j()LO7/f;

    move-result-object v0

    sget-object v1, LO7/f;->D:LO7/f;

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, LN7/i;->u()LN7/f$b;

    move-result-object v0

    invoke-virtual {v0}, LN7/f$b;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, LN7/i;->q(LO7/e;)Lb8/f;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    :goto_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_2
    iget-object v1, p0, LN7/i;->b:LN7/d;

    invoke-static {v0}, Lv8/c;->l(LO7/m;)Ln8/c;

    move-result-object v2

    sget-object v3, LN7/b;->h:LN7/b$a;

    invoke-virtual {v3}, LN7/b$a;->a()LL7/g;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LN7/d;->f(LN7/d;Ln8/c;LL7/g;Ljava/lang/Integer;ILjava/lang/Object;)LO7/e;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {v1, v0}, LN7/m;->a(LO7/e;LO7/e;)LF8/f0;

    move-result-object v2

    invoke-virtual {v2}, LF8/l0;->c()LF8/n0;

    move-result-object v2

    invoke-virtual {v0}, Lb8/f;->X0()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x0

    if-eqz v5, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, LO7/d;

    invoke-interface {v9}, LO7/C;->h()LO7/u;

    move-result-object v10

    invoke-virtual {v10}, LO7/u;->d()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v1}, LO7/e;->r()Ljava/util/Collection;

    move-result-object v10

    const-string v11, "getConstructors(...)"

    invoke-static {v10, v11}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Ljava/lang/Iterable;

    instance-of v11, v10, Ljava/util/Collection;

    if-eqz v11, :cond_5

    move-object v11, v10

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LO7/d;

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v11, v2, v9}, LN7/i;->o(LO7/l;LF8/n0;LO7/l;)Z

    move-result v11

    if-eqz v11, :cond_6

    goto :goto_1

    :cond_7
    :goto_2
    invoke-direct {p0, v9, p1}, LN7/i;->x(LO7/l;LO7/e;)Z

    move-result v10

    if-nez v10, :cond_4

    invoke-static {v9}, LL7/g;->k0(LO7/m;)Z

    move-result v10

    if-nez v10, :cond_4

    sget-object v10, LN7/l;->a:LN7/l;

    invoke-virtual {v10}, LN7/l;->e()Ljava/util/Set;

    move-result-object v10

    sget-object v11, Lg8/A;->a:Lg8/A;

    invoke-static {v9, v8, v8, v7, v6}, Lg8/y;->c(LO7/y;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v11, v0, v6}, Lg8/x;->a(Lg8/A;LO7/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v10, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v4, v3}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LO7/d;

    invoke-interface {v4}, LO7/y;->z()LO7/y$a;

    move-result-object v5

    invoke-interface {v5, p1}, LO7/y$a;->o(LO7/m;)LO7/y$a;

    invoke-interface {p1}, LO7/e;->w()LF8/M;

    move-result-object v9

    invoke-interface {v5, v9}, LO7/y$a;->q(LF8/E;)LO7/y$a;

    invoke-interface {v5}, LO7/y$a;->n()LO7/y$a;

    invoke-virtual {v2}, LF8/n0;->j()LF8/l0;

    move-result-object v9

    invoke-interface {v5, v9}, LO7/y$a;->w(LF8/l0;)LO7/y$a;

    sget-object v9, LN7/l;->a:LN7/l;

    invoke-virtual {v9}, LN7/l;->h()Ljava/util/Set;

    move-result-object v9

    sget-object v10, Lg8/A;->a:Lg8/A;

    invoke-static {v4, v8, v8, v7, v6}, Lg8/y;->c(LO7/y;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v10, v0, v4}, Lg8/x;->a(Lg8/A;LO7/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v9, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    invoke-direct {p0}, LN7/i;->t()LP7/g;

    move-result-object v4

    invoke-interface {v5, v4}, LO7/y$a;->p(LP7/g;)LO7/y$a;

    :cond_9
    invoke-interface {v5}, LO7/y$a;->i()LO7/y;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor"

    invoke-static {v4, v5}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, LO7/d;

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_a
    return-object v1
.end method

.method public bridge synthetic b(LO7/e;)Ljava/util/Collection;
    .locals 0

    invoke-virtual {p0, p1}, LN7/i;->p(LO7/e;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public c(Ln8/f;LO7/e;)Ljava/util/Collection;
    .locals 6

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classDescriptor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LN7/a;->e:LN7/a$a;

    invoke-virtual {v0}, LN7/a$a;->a()Ln8/f;

    move-result-object v0

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    instance-of v0, p2, LD8/d;

    if-eqz v0, :cond_3

    invoke-static {p2}, LL7/g;->e0(LO7/e;)Z

    move-result v0

    if-eqz v0, :cond_3

    check-cast p2, LD8/d;

    invoke-virtual {p2}, LD8/d;->j1()Li8/c;

    move-result-object v0

    invoke-virtual {v0}, Li8/c;->I0()Ljava/util/List;

    move-result-object v0

    const-string v1, "getFunctionList(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li8/i;

    invoke-virtual {p2}, LD8/d;->i1()LB8/m;

    move-result-object v2

    invoke-virtual {v2}, LB8/m;->g()Lk8/c;

    move-result-object v2

    invoke-virtual {v1}, Li8/i;->d0()I

    move-result v1

    invoke-static {v2, v1}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object v1

    sget-object v2, LN7/a;->e:LN7/a$a;

    invoke-virtual {v2}, LN7/a$a;->a()Ln8/f;

    move-result-object v2

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    :goto_1
    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_2
    :goto_2
    invoke-direct {p0}, LN7/i;->n()LF8/M;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->u()Ly8/h;

    move-result-object v0

    sget-object v1, LW7/d;->F:LW7/d;

    invoke-interface {v0, p1, v1}, Ly8/h;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/v;->F0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/Z;

    invoke-direct {p0, p2, p1}, LN7/i;->k(LD8/d;LO7/Z;)LO7/Z;

    move-result-object p1

    invoke-static {p1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-direct {p0}, LN7/i;->u()LN7/f$b;

    move-result-object v0

    invoke-virtual {v0}, LN7/f$b;->b()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    new-instance v0, LN7/i$h;

    invoke-direct {v0, p1}, LN7/i$h;-><init>(Ln8/f;)V

    invoke-direct {p0, p2, v0}, LN7/i;->m(LO7/e;Lx7/l;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO7/Z;

    invoke-interface {v1}, LO7/y;->b()LO7/m;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v2, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LO7/e;

    invoke-static {v2, p2}, LN7/m;->a(LO7/e;LO7/e;)LF8/f0;

    move-result-object v2

    invoke-virtual {v2}, LF8/l0;->c()LF8/n0;

    move-result-object v2

    invoke-interface {v1, v2}, LO7/y;->c(LF8/n0;)LO7/y;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor"

    invoke-static {v2, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LO7/Z;

    invoke-interface {v2}, LO7/Z;->z()LO7/y$a;

    move-result-object v2

    invoke-interface {v2, p2}, LO7/y$a;->o(LO7/m;)LO7/y$a;

    invoke-interface {p2}, LO7/e;->S0()LO7/X;

    move-result-object v3

    invoke-interface {v2, v3}, LO7/y$a;->B(LO7/X;)LO7/y$a;

    invoke-interface {v2}, LO7/y$a;->n()LO7/y$a;

    invoke-direct {p0, v1}, LN7/i;->r(LO7/y;)LN7/i$a;

    move-result-object v3

    sget-object v4, LN7/i$b;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v3, v4, :cond_a

    const/4 v4, 0x2

    if-eq v3, v4, :cond_7

    const/4 v1, 0x3

    if-eq v3, v1, :cond_6

    const/4 v1, 0x4

    if-eq v3, v1, :cond_c

    goto :goto_6

    :cond_6
    invoke-direct {p0}, LN7/i;->t()LP7/g;

    move-result-object v1

    :goto_4
    invoke-interface {v2, v1}, LO7/y$a;->p(LP7/g;)LO7/y$a;

    goto :goto_6

    :cond_7
    invoke-interface {v1}, LO7/I;->getName()Ln8/f;

    move-result-object v3

    invoke-static {}, LN7/j;->a()Ln8/f;

    move-result-object v4

    invoke-static {v3, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    iget-object v3, p0, LN7/i;->h:LE8/g;

    invoke-interface {v1}, LO7/I;->getName()Ln8/f;

    move-result-object v1

    invoke-virtual {v1}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v1

    const-string v4, "first"

    :goto_5
    invoke-static {v1, v4}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v1

    invoke-interface {v3, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LP7/g;

    goto :goto_4

    :cond_8
    invoke-static {}, LN7/j;->b()Ln8/f;

    move-result-object v4

    invoke-static {v3, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    iget-object v3, p0, LN7/i;->h:LE8/g;

    invoke-interface {v1}, LO7/I;->getName()Ln8/f;

    move-result-object v1

    invoke-virtual {v1}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v1

    const-string v4, "last"

    goto :goto_5

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unexpected name: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-static {p2}, LO7/E;->a(LO7/e;)Z

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_7

    :cond_b
    invoke-interface {v2}, LO7/y$a;->u()LO7/y$a;

    :goto_6
    invoke-interface {v2}, LO7/y$a;->i()LO7/y;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object v5, v1

    check-cast v5, LO7/Z;

    :cond_c
    :goto_7
    if-eqz v5, :cond_5

    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_d
    return-object v0
.end method

.method public d(LO7/e;LO7/Z;)Z
    .locals 6

    .prologue
    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "functionDescriptor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LN7/i;->q(LO7/e;)Lb8/f;

    move-result-object p1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p2}, LP7/a;->k()LP7/g;

    move-result-object v1

    invoke-static {}, LQ7/d;->a()Ln8/c;

    move-result-object v2

    invoke-interface {v1, v2}, LP7/g;->H(Ln8/c;)Z

    move-result v1

    if-nez v1, :cond_1

    return v0

    :cond_1
    invoke-direct {p0}, LN7/i;->u()LN7/f$b;

    move-result-object v1

    invoke-virtual {v1}, LN7/f$b;->b()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const/4 v1, 0x3

    const/4 v3, 0x0

    invoke-static {p2, v2, v2, v1, v3}, Lg8/y;->c(LO7/y;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lb8/f;->b1()Lb8/g;

    move-result-object p1

    invoke-interface {p2}, LO7/I;->getName()Ln8/f;

    move-result-object p2

    const-string v5, "getName(...)"

    invoke-static {p2, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, LW7/d;->F:LW7/d;

    invoke-virtual {p1, p2, v5}, Lb8/g;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of p2, p1, Ljava/util/Collection;

    if-eqz p2, :cond_4

    move-object p2, p1

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_4

    :cond_3
    move v0, v2

    goto :goto_0

    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LO7/Z;

    invoke-static {p2, v2, v2, v1, v3}, Lg8/y;->c(LO7/y;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    :goto_0
    return v0
.end method

.method public e(LO7/e;)Ljava/util/Collection;
    .locals 3

    .prologue
    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lv8/c;->m(LO7/m;)Ln8/d;

    move-result-object p1

    sget-object v0, LN7/l;->a:LN7/l;

    invoke-virtual {v0, p1}, LN7/l;->j(Ln8/d;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, LN7/i;->n()LF8/M;

    move-result-object p1

    const-string v0, "<get-cloneableType>(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LN7/i;->d:LF8/E;

    const/4 v1, 0x2

    new-array v1, v1, [LF8/E;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object v0, v1, p1

    invoke-static {v1}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_0
    check-cast p1, Ljava/util/Collection;

    goto :goto_1

    :cond_0
    invoke-virtual {v0, p1}, LN7/l;->k(Ln8/d;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LN7/i;->d:LF8/E;

    invoke-static {p1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :goto_1
    return-object p1
.end method

.method public p(LO7/e;)Ljava/util/Set;
    .locals 1

    .prologue
    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LN7/i;->u()LN7/f$b;

    move-result-object v0

    invoke-virtual {v0}, LN7/f$b;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, LN7/i;->q(LO7/e;)Lb8/f;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lb8/f;->b1()Lb8/g;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lb8/j;->a()Ljava/util/Set;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    :cond_2
    return-object p1
.end method
