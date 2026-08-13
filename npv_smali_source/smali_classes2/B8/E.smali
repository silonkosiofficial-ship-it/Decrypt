.class public final LB8/E;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LB8/m;

.field private final b:LB8/E;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Lx7/l;

.field private final f:Lx7/l;

.field private final g:Ljava/util/Map;


# direct methods
.method public constructor <init>(LB8/m;LB8/E;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    const-string v0, "c"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameterProtos"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "debugName"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containerPresentableName"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB8/E;->a:LB8/m;

    iput-object p2, p0, LB8/E;->b:LB8/E;

    iput-object p4, p0, LB8/E;->c:Ljava/lang/String;

    iput-object p5, p0, LB8/E;->d:Ljava/lang/String;

    invoke-virtual {p1}, LB8/m;->h()LE8/n;

    move-result-object p2

    new-instance p4, LB8/E$a;

    invoke-direct {p4, p0}, LB8/E$a;-><init>(LB8/E;)V

    invoke-interface {p2, p4}, LE8/n;->h(Lx7/l;)LE8/h;

    move-result-object p2

    iput-object p2, p0, LB8/E;->e:Lx7/l;

    invoke-virtual {p1}, LB8/m;->h()LE8/n;

    move-result-object p1

    new-instance p2, LB8/E$c;

    invoke-direct {p2, p0}, LB8/E$c;-><init>(LB8/E;)V

    invoke-interface {p1, p2}, LE8/n;->h(Lx7/l;)LE8/h;

    move-result-object p1

    iput-object p1, p0, LB8/E;->f:Lx7/l;

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 p3, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    add-int/lit8 p4, p3, 0x1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Li8/s;

    invoke-virtual {p5}, Li8/s;->M()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LD8/m;

    iget-object v2, p0, LB8/E;->a:LB8/m;

    invoke-direct {v1, v2, p5, p3}, LD8/m;-><init>(LB8/m;Li8/s;I)V

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move p3, p4

    goto :goto_0

    :cond_1
    :goto_1
    iput-object p1, p0, LB8/E;->g:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic a(LB8/E;I)LO7/h;
    .locals 0

    invoke-direct {p0, p1}, LB8/E;->d(I)LO7/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LB8/E;I)LO7/h;
    .locals 0

    invoke-direct {p0, p1}, LB8/E;->f(I)LO7/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LB8/E;)LB8/m;
    .locals 0

    iget-object p0, p0, LB8/E;->a:LB8/m;

    return-object p0
.end method

.method private final d(I)LO7/h;
    .locals 1

    .prologue
    iget-object v0, p0, LB8/E;->a:LB8/m;

    invoke-virtual {v0}, LB8/m;->g()Lk8/c;

    move-result-object v0

    invoke-static {v0, p1}, LB8/y;->a(Lk8/c;I)Ln8/b;

    move-result-object p1

    invoke-virtual {p1}, Ln8/b;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LB8/E;->a:LB8/m;

    invoke-virtual {v0}, LB8/m;->c()LB8/k;

    move-result-object v0

    invoke-virtual {v0, p1}, LB8/k;->b(Ln8/b;)LO7/e;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, LB8/E;->a:LB8/m;

    invoke-virtual {v0}, LB8/m;->c()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->q()LO7/G;

    move-result-object v0

    invoke-static {v0, p1}, LO7/x;->b(LO7/G;Ln8/b;)LO7/h;

    move-result-object p1

    return-object p1
.end method

.method private final e(I)LF8/M;
    .locals 1

    .prologue
    iget-object v0, p0, LB8/E;->a:LB8/m;

    invoke-virtual {v0}, LB8/m;->g()Lk8/c;

    move-result-object v0

    invoke-static {v0, p1}, LB8/y;->a(Lk8/c;I)Ln8/b;

    move-result-object p1

    invoke-virtual {p1}, Ln8/b;->k()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LB8/E;->a:LB8/m;

    invoke-virtual {p1}, LB8/m;->c()LB8/k;

    move-result-object p1

    invoke-virtual {p1}, LB8/k;->o()LB8/w;

    move-result-object p1

    invoke-interface {p1}, LB8/w;->a()LF8/M;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final f(I)LO7/h;
    .locals 1

    .prologue
    iget-object v0, p0, LB8/E;->a:LB8/m;

    invoke-virtual {v0}, LB8/m;->g()Lk8/c;

    move-result-object v0

    invoke-static {v0, p1}, LB8/y;->a(Lk8/c;I)Ln8/b;

    move-result-object p1

    invoke-virtual {p1}, Ln8/b;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, LB8/E;->a:LB8/m;

    invoke-virtual {v0}, LB8/m;->c()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->q()LO7/G;

    move-result-object v0

    invoke-static {v0, p1}, LO7/x;->d(LO7/G;Ln8/b;)LO7/e0;

    move-result-object p1

    return-object p1
.end method

.method private final g(LF8/E;LF8/E;)LF8/M;
    .locals 8

    .prologue
    invoke-static {p1}, LK8/a;->i(LF8/E;)LL7/g;

    move-result-object v0

    invoke-virtual {p1}, LF8/E;->k()LP7/g;

    move-result-object v1

    invoke-static {p1}, LL7/f;->k(LF8/E;)LF8/E;

    move-result-object v2

    invoke-static {p1}, LL7/f;->e(LF8/E;)Ljava/util/List;

    move-result-object v3

    invoke-static {p1}, LL7/f;->m(LF8/E;)Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v4, v5}, Lj7/v;->d0(Ljava/util/List;I)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LF8/i0;

    invoke-interface {v6}, LF8/i0;->getType()LF8/E;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v4, v5

    move-object v5, v6

    move-object v6, p2

    invoke-static/range {v0 .. v7}, LL7/f;->b(LL7/g;LP7/g;LF8/E;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;Z)LF8/M;

    move-result-object p2

    invoke-virtual {p1}, LF8/E;->X0()Z

    move-result p1

    invoke-virtual {p2, p1}, LF8/M;->d1(Z)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method private final h(LF8/a0;LF8/e0;Ljava/util/List;Z)LF8/M;
    .locals 8

    .prologue
    invoke-interface {p2}, LF8/e0;->x()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v0, v1

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v2

    if-ltz v0, :cond_2

    invoke-interface {p2}, LF8/e0;->t()LL7/g;

    move-result-object v1

    invoke-virtual {v1, v0}, LL7/g;->X(I)LO7/e;

    move-result-object v0

    invoke-interface {v0}, LO7/h;->p()LF8/e0;

    move-result-object v2

    const-string v0, "getTypeConstructor(...)"

    invoke-static {v2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v3, p3

    move v4, p4

    invoke-static/range {v1 .. v7}, LF8/F;->l(LF8/a0;LF8/e0;Ljava/util/List;ZLG8/g;ILjava/lang/Object;)LF8/M;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, LB8/E;->i(LF8/a0;LF8/e0;Ljava/util/List;Z)LF8/M;

    move-result-object v1

    :cond_2
    :goto_0
    if-nez v1, :cond_3

    sget-object p1, LH8/k;->a:LH8/k;

    sget-object p4, LH8/j;->r0:LH8/j;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p1, p4, p3, p2, v0}, LH8/k;->f(LH8/j;Ljava/util/List;LF8/e0;[Ljava/lang/String;)LH8/h;

    move-result-object v1

    :cond_3
    return-object v1
.end method

.method private final i(LF8/a0;LF8/e0;Ljava/util/List;Z)LF8/M;
    .locals 7

    .prologue
    const/16 v5, 0x10

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    invoke-static/range {v0 .. v6}, LF8/F;->l(LF8/a0;LF8/e0;Ljava/util/List;ZLG8/g;ILjava/lang/Object;)LF8/M;

    move-result-object p1

    invoke-static {p1}, LL7/f;->q(LF8/E;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, LB8/E;->p(LF8/E;)LF8/M;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private final k(I)LO7/f0;
    .locals 2

    .prologue
    iget-object v0, p0, LB8/E;->g:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/f0;

    if-nez v0, :cond_1

    iget-object v0, p0, LB8/E;->b:LB8/E;

    if-eqz v0, :cond_0

    invoke-direct {v0, p1}, LB8/E;->k(I)LO7/f0;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return-object v0
.end method

.method private static final m(Li8/q;LB8/E;)Ljava/util/List;
    .locals 2

    .prologue
    invoke-virtual {p0}, Li8/q;->V()Ljava/util/List;

    move-result-object v0

    const-string v1, "getArgumentList(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    iget-object v1, p1, LB8/E;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->j()Lk8/g;

    move-result-object v1

    invoke-static {p0, v1}, Lk8/f;->j(Li8/q;Lk8/g;)Li8/q;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0, p1}, LB8/E;->m(Li8/q;LB8/E;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p0

    :cond_1
    check-cast p0, Ljava/lang/Iterable;

    invoke-static {v0, p0}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(LB8/E;Li8/q;ZILjava/lang/Object;)LF8/M;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2}, LB8/E;->l(Li8/q;Z)LF8/M;

    move-result-object p0

    return-object p0
.end method

.method private final o(Ljava/util/List;LP7/g;LF8/e0;LO7/m;)LF8/a0;
    .locals 2

    .prologue
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF8/Z;

    invoke-interface {v1, p2, p3, p4}, LF8/Z;->a(LP7/g;LF8/e0;LO7/m;)LF8/a0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lj7/v;->z(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    sget-object p2, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {p2, p1}, LF8/a0$a;->h(Ljava/util/List;)LF8/a0;

    move-result-object p1

    return-object p1
.end method

.method private final p(LF8/E;)LF8/M;
    .locals 5

    .prologue
    invoke-static {p1}, LL7/f;->m(LF8/E;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/i0;

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    invoke-interface {v0}, LF8/i0;->getType()LF8/E;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v2

    invoke-interface {v2}, LF8/e0;->w()LO7/h;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v2}, Lv8/c;->l(LO7/m;)Ln8/c;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    invoke-virtual {v0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_5

    sget-object v3, LL7/j;->t:Ln8/c;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {}, LB8/F;->a()Ln8/c;

    move-result-object v3

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->G0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/i0;

    invoke-interface {v0}, LF8/i0;->getType()LF8/E;

    move-result-object v0

    const-string v2, "getType(...)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LB8/E;->a:LB8/m;

    invoke-virtual {v2}, LB8/m;->e()LO7/m;

    move-result-object v2

    instance-of v3, v2, LO7/a;

    if-eqz v3, :cond_3

    check-cast v2, LO7/a;

    goto :goto_1

    :cond_3
    move-object v2, v1

    :goto_1
    if-eqz v2, :cond_4

    invoke-static {v2}, Lv8/c;->h(LO7/m;)Ln8/c;

    move-result-object v1

    :cond_4
    sget-object v2, LB8/D;->a:Ln8/c;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-direct {p0, p1, v0}, LB8/E;->g(LF8/E;LF8/E;)LF8/M;

    move-result-object p1

    return-object p1

    :cond_5
    :goto_2
    check-cast p1, LF8/M;

    return-object p1

    :cond_6
    :goto_3
    return-object v1
.end method

.method private final r(LO7/f0;Li8/q$b;)LF8/i0;
    .locals 2

    .prologue
    invoke-virtual {p2}, Li8/q$b;->x()Li8/q$b$c;

    move-result-object v0

    sget-object v1, Li8/q$b$c;->G:Li8/q$b$c;

    if-ne v0, v1, :cond_1

    if-nez p1, :cond_0

    new-instance p1, LF8/S;

    iget-object p2, p0, LB8/E;->a:LB8/m;

    invoke-virtual {p2}, LB8/m;->c()LB8/k;

    move-result-object p2

    invoke-virtual {p2}, LB8/k;->q()LO7/G;

    move-result-object p2

    invoke-interface {p2}, LO7/G;->t()LL7/g;

    move-result-object p2

    invoke-direct {p1, p2}, LF8/S;-><init>(LL7/g;)V

    goto :goto_0

    :cond_0
    new-instance p2, LF8/T;

    invoke-direct {p2, p1}, LF8/T;-><init>(LO7/f0;)V

    move-object p1, p2

    :goto_0
    return-object p1

    :cond_1
    sget-object p1, LB8/B;->a:LB8/B;

    invoke-virtual {p2}, Li8/q$b;->x()Li8/q$b$c;

    move-result-object v0

    const-string v1, "getProjection(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, LB8/B;->c(Li8/q$b$c;)LF8/u0;

    move-result-object p1

    iget-object v0, p0, LB8/E;->a:LB8/m;

    invoke-virtual {v0}, LB8/m;->j()Lk8/g;

    move-result-object v0

    invoke-static {p2, v0}, Lk8/f;->p(Li8/q$b;Lk8/g;)Li8/q;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance p1, LF8/k0;

    sget-object v0, LH8/j;->b1:LH8/j;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, LH8/k;->d(LH8/j;[Ljava/lang/String;)LH8/h;

    move-result-object p2

    invoke-direct {p1, p2}, LF8/k0;-><init>(LF8/E;)V

    return-object p1

    :cond_2
    new-instance p2, LF8/k0;

    invoke-virtual {p0, v0}, LB8/E;->q(Li8/q;)LF8/E;

    move-result-object v0

    invoke-direct {p2, p1, v0}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    return-object p2
.end method

.method private final s(Li8/q;)LF8/e0;
    .locals 3

    .prologue
    invoke-virtual {p1}, Li8/q;->m0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LB8/E;->e:Lx7/l;

    invoke-virtual {p1}, Li8/q;->W()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/h;

    if-nez v0, :cond_5

    invoke-virtual {p1}, Li8/q;->W()I

    move-result v0

    :goto_0
    invoke-static {p0, p1, v0}, LB8/E;->t(LB8/E;Li8/q;I)LO7/e;

    move-result-object v0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p1}, Li8/q;->v0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li8/q;->i0()I

    move-result v0

    invoke-direct {p0, v0}, LB8/E;->k(I)LO7/f0;

    move-result-object v0

    if-nez v0, :cond_5

    sget-object v0, LH8/k;->a:LH8/k;

    sget-object v1, LH8/j;->p0:LH8/j;

    invoke-virtual {p1}, Li8/q;->i0()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, LB8/E;->d:Ljava/lang/String;

    filled-new-array {p1, v2}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, LH8/k;->e(LH8/j;[Ljava/lang/String;)LH8/i;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Li8/q;->w0()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LB8/E;->a:LB8/m;

    invoke-virtual {v0}, LB8/m;->g()Lk8/c;

    move-result-object v0

    invoke-virtual {p1}, Li8/q;->j0()I

    move-result p1

    invoke-interface {v0, p1}, Lk8/c;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, LB8/E;->j()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LO7/f0;

    invoke-interface {v2}, LO7/I;->getName()Ln8/f;

    move-result-object v2

    invoke-virtual {v2}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    move-object v0, v1

    check-cast v0, LO7/f0;

    if-nez v0, :cond_5

    sget-object v0, LH8/k;->a:LH8/k;

    sget-object v1, LH8/j;->q0:LH8/j;

    iget-object v2, p0, LB8/E;->a:LB8/m;

    invoke-virtual {v2}, LB8/m;->e()LO7/m;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {p1, v2}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, LH8/k;->e(LH8/j;[Ljava/lang/String;)LH8/i;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {p1}, Li8/q;->u0()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, LB8/E;->f:Lx7/l;

    invoke-virtual {p1}, Li8/q;->h0()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/h;

    if-nez v0, :cond_5

    invoke-virtual {p1}, Li8/q;->h0()I

    move-result v0

    goto/16 :goto_0

    :cond_5
    :goto_2
    invoke-interface {v0}, LO7/h;->p()LF8/e0;

    move-result-object p1

    const-string v0, "getTypeConstructor(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_6
    sget-object p1, LH8/k;->a:LH8/k;

    sget-object v0, LH8/j;->t0:LH8/j;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, LH8/k;->e(LH8/j;[Ljava/lang/String;)LH8/i;

    move-result-object p1

    return-object p1
.end method

.method private static final t(LB8/E;Li8/q;I)LO7/e;
    .locals 2

    .prologue
    iget-object v0, p0, LB8/E;->a:LB8/m;

    invoke-virtual {v0}, LB8/m;->g()Lk8/c;

    move-result-object v0

    invoke-static {v0, p2}, LB8/y;->a(Lk8/c;I)Ln8/b;

    move-result-object p2

    new-instance v0, LB8/E$e;

    invoke-direct {v0, p0}, LB8/E$e;-><init>(LB8/E;)V

    invoke-static {p1, v0}, LR8/k;->n(Ljava/lang/Object;Lx7/l;)LR8/h;

    move-result-object p1

    sget-object v0, LB8/E$f;->D:LB8/E$f;

    invoke-static {p1, v0}, LR8/k;->G(LR8/h;Lx7/l;)LR8/h;

    move-result-object p1

    invoke-static {p1}, LR8/k;->N(LR8/h;)Ljava/util/List;

    move-result-object p1

    sget-object v0, LB8/E$d;->L:LB8/E$d;

    invoke-static {p2, v0}, LR8/k;->n(Ljava/lang/Object;Lx7/l;)LR8/h;

    move-result-object v0

    invoke-static {v0}, LR8/k;->u(LR8/h;)I

    move-result v0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v1, v0, :cond_0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p0, p0, LB8/E;->a:LB8/m;

    invoke-virtual {p0}, LB8/m;->c()LB8/k;

    move-result-object p0

    invoke-virtual {p0}, LB8/k;->r()LO7/J;

    move-result-object p0

    invoke-virtual {p0, p2, p1}, LO7/J;->d(Ln8/b;Ljava/util/List;)LO7/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final j()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LB8/E;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final l(Li8/q;Z)LF8/M;
    .locals 18

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "proto"

    invoke-static {v1, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Li8/q;->m0()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual/range {p1 .. p1}, Li8/q;->W()I

    move-result v2

    :goto_0
    invoke-direct {v0, v2}, LB8/E;->e(I)LF8/M;

    move-result-object v2

    goto :goto_1

    :cond_0
    invoke-virtual/range {p1 .. p1}, Li8/q;->u0()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual/range {p1 .. p1}, Li8/q;->h0()I

    move-result v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_2

    return-object v2

    :cond_2
    invoke-direct/range {p0 .. p1}, LB8/E;->s(Li8/q;)LF8/e0;

    move-result-object v4

    invoke-interface {v4}, LF8/e0;->w()LO7/h;

    move-result-object v2

    invoke-static {v2}, LH8/k;->m(LO7/m;)Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v1, LH8/k;->a:LH8/k;

    sget-object v2, LH8/j;->W0:LH8/j;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v4, v3}, LH8/k;->c(LH8/j;LF8/e0;[Ljava/lang/String;)LH8/h;

    move-result-object v1

    return-object v1

    :cond_3
    new-instance v2, LD8/a;

    iget-object v3, v0, LB8/E;->a:LB8/m;

    invoke-virtual {v3}, LB8/m;->h()LE8/n;

    move-result-object v3

    new-instance v5, LB8/E$b;

    invoke-direct {v5, v0, v1}, LB8/E$b;-><init>(LB8/E;Li8/q;)V

    invoke-direct {v2, v3, v5}, LD8/a;-><init>(LE8/n;Lx7/a;)V

    iget-object v3, v0, LB8/E;->a:LB8/m;

    invoke-virtual {v3}, LB8/m;->c()LB8/k;

    move-result-object v3

    invoke-virtual {v3}, LB8/k;->v()Ljava/util/List;

    move-result-object v3

    iget-object v5, v0, LB8/E;->a:LB8/m;

    invoke-virtual {v5}, LB8/m;->e()LO7/m;

    move-result-object v5

    invoke-direct {v0, v3, v2, v4, v5}, LB8/E;->o(Ljava/util/List;LP7/g;LF8/e0;LO7/m;)LF8/a0;

    move-result-object v3

    invoke-static {v1, v0}, LB8/E;->m(Li8/q;LB8/E;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v5, v7}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v10, 0x0

    move v7, v10

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v9, v7, 0x1

    if-gez v7, :cond_4

    invoke-static {}, Lj7/v;->w()V

    :cond_4
    check-cast v8, Li8/q$b;

    invoke-interface {v4}, LF8/e0;->x()Ljava/util/List;

    move-result-object v11

    const-string v12, "getParameters(...)"

    invoke-static {v11, v12}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11, v7}, Lj7/v;->l0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LO7/f0;

    invoke-direct {v0, v7, v8}, LB8/E;->r(LO7/f0;Li8/q$b;)LF8/i0;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v7, v9

    goto :goto_2

    :cond_5
    invoke-static {v6}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v4}, LF8/e0;->w()LO7/h;

    move-result-object v6

    if-eqz p2, :cond_8

    instance-of v7, v6, LO7/e0;

    if-eqz v7, :cond_8

    check-cast v6, LO7/e0;

    invoke-static {v6, v5}, LF8/F;->b(LO7/e0;Ljava/util/List;)LF8/M;

    move-result-object v3

    iget-object v5, v0, LB8/E;->a:LB8/m;

    invoke-virtual {v5}, LB8/m;->c()LB8/k;

    move-result-object v5

    invoke-virtual {v5}, LB8/k;->v()Ljava/util/List;

    move-result-object v5

    sget-object v6, LP7/g;->d:LP7/g$a;

    invoke-virtual {v3}, LF8/E;->k()LP7/g;

    move-result-object v7

    invoke-static {v2, v7}, Lj7/v;->A0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v6, v2}, LP7/g$a;->a(Ljava/util/List;)LP7/g;

    move-result-object v2

    iget-object v6, v0, LB8/E;->a:LB8/m;

    invoke-virtual {v6}, LB8/m;->e()LO7/m;

    move-result-object v6

    invoke-direct {v0, v5, v2, v4, v6}, LB8/E;->o(Ljava/util/List;LP7/g;LF8/e0;LO7/m;)LF8/a0;

    move-result-object v2

    invoke-static {v3}, LF8/G;->b(LF8/E;)Z

    move-result v4

    if-nez v4, :cond_7

    invoke-virtual/range {p1 .. p1}, Li8/q;->d0()Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_6
    move v4, v10

    goto :goto_4

    :cond_7
    :goto_3
    const/4 v4, 0x1

    :goto_4
    invoke-virtual {v3, v4}, LF8/M;->d1(Z)LF8/M;

    move-result-object v3

    invoke-virtual {v3, v2}, LF8/M;->e1(LF8/a0;)LF8/M;

    move-result-object v2

    goto :goto_5

    :cond_8
    sget-object v2, Lk8/b;->a:Lk8/b$b;

    invoke-virtual/range {p1 .. p1}, Li8/q;->Z()I

    move-result v6

    invoke-virtual {v2, v6}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v2

    const-string v11, "get(...)"

    invoke-static {v2, v11}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual/range {p1 .. p1}, Li8/q;->d0()Z

    move-result v2

    invoke-direct {v0, v3, v4, v5, v2}, LB8/E;->h(LF8/a0;LF8/e0;Ljava/util/List;Z)LF8/M;

    move-result-object v2

    goto :goto_5

    :cond_9
    invoke-virtual/range {p1 .. p1}, Li8/q;->d0()Z

    move-result v6

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, LF8/F;->l(LF8/a0;LF8/e0;Ljava/util/List;ZLG8/g;ILjava/lang/Object;)LF8/M;

    move-result-object v2

    sget-object v3, Lk8/b;->b:Lk8/b$b;

    invoke-virtual/range {p1 .. p1}, Li8/q;->Z()I

    move-result v4

    invoke-virtual {v3, v4}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v3, v11}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_b

    sget-object v12, LF8/o;->F:LF8/o$a;

    const/16 v16, 0x4

    const/16 v17, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    move-object v13, v2

    invoke-static/range {v12 .. v17}, LF8/o$a;->c(LF8/o$a;LF8/t0;ZZILjava/lang/Object;)LF8/o;

    move-result-object v3

    if-eqz v3, :cond_a

    move-object v2, v3

    goto :goto_5

    :cond_a
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "null DefinitelyNotNullType for \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x27

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    :goto_5
    iget-object v3, v0, LB8/E;->a:LB8/m;

    invoke-virtual {v3}, LB8/m;->j()Lk8/g;

    move-result-object v3

    invoke-static {v1, v3}, Lk8/f;->a(Li8/q;Lk8/g;)Li8/q;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-virtual {v0, v1, v10}, LB8/E;->l(Li8/q;Z)LF8/M;

    move-result-object v1

    invoke-static {v2, v1}, LF8/Q;->j(LF8/M;LF8/M;)LF8/M;

    move-result-object v1

    if-nez v1, :cond_c

    goto :goto_6

    :cond_c
    move-object v2, v1

    :cond_d
    :goto_6
    return-object v2
.end method

.method public final q(Li8/q;)LF8/E;
    .locals 6

    .prologue
    const-string v0, "proto"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Li8/q;->o0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LB8/E;->a:LB8/m;

    invoke-virtual {v0}, LB8/m;->g()Lk8/c;

    move-result-object v0

    invoke-virtual {p1}, Li8/q;->a0()I

    move-result v1

    invoke-interface {v0, v1}, Lk8/c;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p0, p1, v1, v2, v3}, LB8/E;->n(LB8/E;Li8/q;ZILjava/lang/Object;)LF8/M;

    move-result-object v4

    iget-object v5, p0, LB8/E;->a:LB8/m;

    invoke-virtual {v5}, LB8/m;->j()Lk8/g;

    move-result-object v5

    invoke-static {p1, v5}, Lk8/f;->f(Li8/q;Lk8/g;)Li8/q;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p0, v5, v1, v2, v3}, LB8/E;->n(LB8/E;Li8/q;ZILjava/lang/Object;)LF8/M;

    move-result-object v1

    iget-object v2, p0, LB8/E;->a:LB8/m;

    invoke-virtual {v2}, LB8/m;->c()LB8/k;

    move-result-object v2

    invoke-virtual {v2}, LB8/k;->m()LB8/s;

    move-result-object v2

    invoke-interface {v2, p1, v0, v4, v1}, LB8/s;->a(Li8/q;Ljava/lang/String;LF8/M;LF8/M;)LF8/E;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LB8/E;->l(Li8/q;Z)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LB8/E;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LB8/E;->b:LB8/E;

    if-nez v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ". Child of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LB8/E;->b:LB8/E;

    iget-object v2, v2, LB8/E;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
