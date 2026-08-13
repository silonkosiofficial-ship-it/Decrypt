.class public abstract Lv8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ln8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "value"

    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    const-string v1, "identifier(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lv8/c;->a:Ln8/f;

    return-void
.end method

.method static synthetic a(LO7/j0;)Ljava/lang/Iterable;
    .locals 0

    invoke-static {p0}, Lv8/c;->d(LO7/j0;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(ZLO7/b;)Ljava/lang/Iterable;
    .locals 0

    invoke-static {p0, p1}, Lv8/c;->g(ZLO7/b;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LO7/j0;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    sget-object v0, Lv8/a;->a:Lv8/a;

    sget-object v1, Lv8/c$a;->L:Lv8/c$a;

    invoke-static {p0, v0, v1}, LP8/b;->e(Ljava/util/Collection;LP8/b$c;Lx7/l;)Ljava/lang/Boolean;

    move-result-object p0

    const-string v0, "ifAny(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final d(LO7/j0;)Ljava/lang/Iterable;
    .locals 2

    .prologue
    invoke-interface {p0}, LO7/j0;->f()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO7/j0;

    invoke-interface {v1}, LO7/j0;->a()LO7/j0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final e(LO7/b;ZLx7/l;)LO7/b;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "predicate"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly7/O;

    invoke-direct {v0}, Ly7/O;-><init>()V

    invoke-static {p0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    new-instance v1, Lv8/b;

    invoke-direct {v1, p1}, Lv8/b;-><init>(Z)V

    new-instance p1, Lv8/c$b;

    invoke-direct {p1, v0, p2}, Lv8/c$b;-><init>(Ly7/O;Lx7/l;)V

    invoke-static {p0, v1, p1}, LP8/b;->b(Ljava/util/Collection;LP8/b$c;LP8/b$d;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LO7/b;

    return-object p0
.end method

.method public static synthetic f(LO7/b;ZLx7/l;ILjava/lang/Object;)LO7/b;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lv8/c;->e(LO7/b;ZLx7/l;)LO7/b;

    move-result-object p0

    return-object p0
.end method

.method private static final g(ZLO7/b;)Ljava/lang/Iterable;
    .locals 1

    .prologue
    const/4 v0, 0x0

    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    invoke-interface {p1}, LO7/b;->a()LO7/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    invoke-interface {p1}, LO7/b;->f()Ljava/util/Collection;

    move-result-object v0

    :cond_2
    if-nez v0, :cond_3

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    goto :goto_1

    :cond_3
    move-object p0, v0

    check-cast p0, Ljava/lang/Iterable;

    :goto_1
    return-object p0
.end method

.method public static final h(LO7/m;)Ln8/c;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lv8/c;->m(LO7/m;)Ln8/d;

    move-result-object p0

    invoke-virtual {p0}, Ln8/d;->f()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ln8/d;->l()Ln8/c;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method public static final i(LP7/c;)LO7/e;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LP7/c;->getType()LF8/E;

    move-result-object p0

    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object p0

    invoke-interface {p0}, LF8/e0;->w()LO7/h;

    move-result-object p0

    instance-of v0, p0, LO7/e;

    if-eqz v0, :cond_0

    check-cast p0, LO7/e;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final j(LO7/m;)LL7/g;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lv8/c;->p(LO7/m;)LO7/G;

    move-result-object p0

    invoke-interface {p0}, LO7/G;->t()LL7/g;

    move-result-object p0

    return-object p0
.end method

.method public static final k(LO7/h;)Ln8/b;
    .locals 3

    .prologue
    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-interface {p0}, LO7/n;->b()LO7/m;

    move-result-object v1

    if-eqz v1, :cond_1

    instance-of v2, v1, LO7/K;

    if-eqz v2, :cond_0

    new-instance v0, Ln8/b;

    check-cast v1, LO7/K;

    invoke-interface {v1}, LO7/K;->e()Ln8/c;

    move-result-object v1

    invoke-interface {p0}, LO7/I;->getName()Ln8/f;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    goto :goto_0

    :cond_0
    instance-of v2, v1, LO7/i;

    if-eqz v2, :cond_1

    check-cast v1, LO7/h;

    invoke-static {v1}, Lv8/c;->k(LO7/h;)Ln8/b;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, LO7/I;->getName()Ln8/f;

    move-result-object p0

    invoke-virtual {v1, p0}, Ln8/b;->d(Ln8/f;)Ln8/b;

    move-result-object v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static final l(LO7/m;)Ln8/c;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lr8/f;->n(LO7/m;)Ln8/c;

    move-result-object p0

    const-string v0, "getFqNameSafe(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final m(LO7/m;)Ln8/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lr8/f;->m(LO7/m;)Ln8/d;

    move-result-object p0

    const-string v0, "getFqName(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final n(LO7/e;)LO7/z;
    .locals 2

    .prologue
    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-interface {p0}, LO7/e;->I0()LO7/h0;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    instance-of v1, p0, LO7/z;

    if-eqz v1, :cond_1

    move-object v0, p0

    check-cast v0, LO7/z;

    :cond_1
    return-object v0
.end method

.method public static final o(LO7/G;)LG8/g;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LG8/h;->a()LO7/F;

    move-result-object v0

    invoke-interface {p0, v0}, LO7/G;->q0(LO7/F;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    sget-object p0, LG8/g$a;->a:LG8/g$a;

    return-object p0
.end method

.method public static final p(LO7/m;)LO7/G;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lr8/f;->g(LO7/m;)LO7/G;

    move-result-object p0

    const-string v0, "getContainingModule(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final q(LO7/e;)LO7/H;
    .locals 2

    .prologue
    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-interface {p0}, LO7/e;->I0()LO7/h0;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    instance-of v1, p0, LO7/H;

    if-eqz v1, :cond_1

    move-object v0, p0

    check-cast v0, LO7/H;

    :cond_1
    return-object v0
.end method

.method public static final r(LO7/m;)LR8/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lv8/c;->s(LO7/m;)LR8/h;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, v0}, LR8/k;->v(LR8/h;I)LR8/h;

    move-result-object p0

    return-object p0
.end method

.method public static final s(LO7/m;)LR8/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lv8/c$c;->D:Lv8/c$c;

    invoke-static {p0, v0}, LR8/k;->n(Ljava/lang/Object;Lx7/l;)LR8/h;

    move-result-object p0

    return-object p0
.end method

.method public static final t(LO7/b;)LO7/b;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LO7/T;

    if-eqz v0, :cond_0

    check-cast p0, LO7/T;

    invoke-interface {p0}, LO7/T;->K0()LO7/U;

    move-result-object p0

    const-string v0, "getCorrespondingProperty(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public static final u(LO7/e;)LO7/e;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LO7/e;->w()LF8/M;

    move-result-object p0

    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object p0

    invoke-interface {p0}, LF8/e0;->u()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/E;

    invoke-static {v0}, LL7/g;->b0(LF8/E;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->w()LO7/h;

    move-result-object v0

    invoke-static {v0}, Lr8/f;->w(LO7/m;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v0, p0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LO7/e;

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final v(LO7/G;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LG8/h;->a()LO7/F;

    move-result-object v0

    invoke-interface {p0, v0}, LO7/G;->q0(LO7/F;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static final w(LO7/G;Ln8/c;LW7/b;)LO7/e;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topLevelClassFqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ln8/c;->d()Z

    invoke-virtual {p1}, Ln8/c;->e()Ln8/c;

    move-result-object v0

    const-string v1, "parent(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, v0}, LO7/G;->s0(Ln8/c;)LO7/P;

    move-result-object p0

    invoke-interface {p0}, LO7/P;->u()Ly8/h;

    move-result-object p0

    invoke-virtual {p1}, Ln8/c;->g()Ln8/f;

    move-result-object p1

    const-string v0, "shortName(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Ly8/k;->g(Ln8/f;LW7/b;)LO7/h;

    move-result-object p0

    instance-of p1, p0, LO7/e;

    if-eqz p1, :cond_0

    check-cast p0, LO7/e;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
