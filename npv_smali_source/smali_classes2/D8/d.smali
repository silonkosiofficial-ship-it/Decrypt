.class public final LD8/d;
.super LR7/a;
.source "SourceFile"

# interfaces
.implements LO7/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD8/d$a;,
        LD8/d$b;,
        LD8/d$c;
    }
.end annotation


# instance fields
.field private final H:Li8/c;

.field private final I:Lk8/a;

.field private final J:LO7/a0;

.field private final K:Ln8/b;

.field private final L:LO7/D;

.field private final M:LO7/u;

.field private final N:LO7/f;

.field private final O:LB8/m;

.field private final P:Ly8/i;

.field private final Q:LD8/d$b;

.field private final R:LO7/Y;

.field private final S:LD8/d$c;

.field private final T:LO7/m;

.field private final U:LE8/j;

.field private final V:LE8/i;

.field private final W:LE8/j;

.field private final X:LE8/i;

.field private final Y:LE8/j;

.field private final Z:LB8/A$a;

.field private final a0:LP7/g;


# direct methods
.method public constructor <init>(LB8/m;Li8/c;Lk8/c;Lk8/a;LO7/a0;)V
    .locals 8

    .prologue
    const-string v0, "outerContext"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classProto"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadataVersion"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceElement"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LB8/m;->h()LE8/n;

    move-result-object v0

    invoke-virtual {p2}, Li8/c;->F0()I

    move-result v1

    invoke-static {p3, v1}, LB8/y;->a(Lk8/c;I)Ln8/b;

    move-result-object v1

    invoke-virtual {v1}, Ln8/b;->j()Ln8/f;

    move-result-object v1

    invoke-direct {p0, v0, v1}, LR7/a;-><init>(LE8/n;Ln8/f;)V

    iput-object p2, p0, LD8/d;->H:Li8/c;

    iput-object p4, p0, LD8/d;->I:Lk8/a;

    iput-object p5, p0, LD8/d;->J:LO7/a0;

    invoke-virtual {p2}, Li8/c;->F0()I

    move-result v0

    invoke-static {p3, v0}, LB8/y;->a(Lk8/c;I)Ln8/b;

    move-result-object v0

    iput-object v0, p0, LD8/d;->K:Ln8/b;

    sget-object v0, LB8/B;->a:LB8/B;

    sget-object v1, Lk8/b;->e:Lk8/b$d;

    invoke-virtual {p2}, Li8/c;->E0()I

    move-result v2

    invoke-virtual {v1, v2}, Lk8/b$d;->d(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li8/k;

    invoke-virtual {v0, v1}, LB8/B;->b(Li8/k;)LO7/D;

    move-result-object v1

    iput-object v1, p0, LD8/d;->L:LO7/D;

    sget-object v1, Lk8/b;->d:Lk8/b$d;

    invoke-virtual {p2}, Li8/c;->E0()I

    move-result v2

    invoke-virtual {v1, v2}, Lk8/b$d;->d(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li8/x;

    invoke-static {v0, v1}, LB8/C;->a(LB8/B;Li8/x;)LO7/u;

    move-result-object v1

    iput-object v1, p0, LD8/d;->M:LO7/u;

    sget-object v1, Lk8/b;->f:Lk8/b$d;

    invoke-virtual {p2}, Li8/c;->E0()I

    move-result v2

    invoke-virtual {v1, v2}, Lk8/b$d;->d(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li8/c$c;

    invoke-virtual {v0, v1}, LB8/B;->a(Li8/c$c;)LO7/f;

    move-result-object v0

    iput-object v0, p0, LD8/d;->N:LO7/f;

    invoke-virtual {p2}, Li8/c;->h1()Ljava/util/List;

    move-result-object v3

    const-string v1, "getTypeParameterList(...)"

    invoke-static {v3, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lk8/g;

    invoke-virtual {p2}, Li8/c;->i1()Li8/t;

    move-result-object v1

    const-string v2, "getTypeTable(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v1}, Lk8/g;-><init>(Li8/t;)V

    sget-object v1, Lk8/h;->b:Lk8/h$a;

    invoke-virtual {p2}, Li8/c;->k1()Li8/w;

    move-result-object v2

    const-string v4, "getVersionRequirementTable(...)"

    invoke-static {v2, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lk8/h$a;->a(Li8/w;)Lk8/h;

    move-result-object v6

    move-object v1, p1

    move-object v2, p0

    move-object v4, p3

    move-object v7, p4

    invoke-virtual/range {v1 .. v7}, LB8/m;->a(LO7/m;Ljava/util/List;Lk8/c;Lk8/g;Lk8/h;Lk8/a;)LB8/m;

    move-result-object p3

    iput-object p3, p0, LD8/d;->O:LB8/m;

    sget-object p4, LO7/f;->F:LO7/f;

    if-ne v0, p4, :cond_2

    sget-object v1, Lk8/b;->m:Lk8/b$b;

    invoke-virtual {p2}, Li8/c;->E0()I

    move-result v2

    invoke-virtual {v1, v2}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "get(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p3}, LB8/m;->c()LB8/k;

    move-result-object v1

    invoke-virtual {v1}, LB8/k;->i()LB8/q;

    move-result-object v1

    invoke-interface {v1}, LB8/q;->a()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    new-instance v2, Ly8/l;

    invoke-virtual {p3}, LB8/m;->h()LE8/n;

    move-result-object v3

    invoke-direct {v2, v3, p0, v1}, Ly8/l;-><init>(LE8/n;LO7/e;Z)V

    goto :goto_2

    :cond_2
    sget-object v2, Ly8/h$b;->b:Ly8/h$b;

    :goto_2
    iput-object v2, p0, LD8/d;->P:Ly8/i;

    new-instance v1, LD8/d$b;

    invoke-direct {v1, p0}, LD8/d$b;-><init>(LD8/d;)V

    iput-object v1, p0, LD8/d;->Q:LD8/d$b;

    sget-object v1, LO7/Y;->e:LO7/Y$a;

    invoke-virtual {p3}, LB8/m;->h()LE8/n;

    move-result-object v2

    invoke-virtual {p3}, LB8/m;->c()LB8/k;

    move-result-object v3

    invoke-virtual {v3}, LB8/k;->n()LG8/l;

    move-result-object v3

    invoke-interface {v3}, LG8/l;->c()LG8/g;

    move-result-object v3

    new-instance v4, LD8/d$i;

    invoke-direct {v4, p0}, LD8/d$i;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, p0, v2, v3, v4}, LO7/Y$a;->a(LO7/e;LE8/n;LG8/g;Lx7/l;)LO7/Y;

    move-result-object v1

    iput-object v1, p0, LD8/d;->R:LO7/Y;

    const/4 v1, 0x0

    if-ne v0, p4, :cond_3

    new-instance p4, LD8/d$c;

    invoke-direct {p4, p0}, LD8/d$c;-><init>(LD8/d;)V

    goto :goto_3

    :cond_3
    move-object p4, v1

    :goto_3
    iput-object p4, p0, LD8/d;->S:LD8/d$c;

    invoke-virtual {p1}, LB8/m;->e()LO7/m;

    move-result-object p1

    iput-object p1, p0, LD8/d;->T:LO7/m;

    invoke-virtual {p3}, LB8/m;->h()LE8/n;

    move-result-object p4

    new-instance v0, LD8/d$j;

    invoke-direct {v0, p0}, LD8/d$j;-><init>(LD8/d;)V

    invoke-interface {p4, v0}, LE8/n;->f(Lx7/a;)LE8/j;

    move-result-object p4

    iput-object p4, p0, LD8/d;->U:LE8/j;

    invoke-virtual {p3}, LB8/m;->h()LE8/n;

    move-result-object p4

    new-instance v0, LD8/d$h;

    invoke-direct {v0, p0}, LD8/d$h;-><init>(LD8/d;)V

    invoke-interface {p4, v0}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p4

    iput-object p4, p0, LD8/d;->V:LE8/i;

    invoke-virtual {p3}, LB8/m;->h()LE8/n;

    move-result-object p4

    new-instance v0, LD8/d$e;

    invoke-direct {v0, p0}, LD8/d$e;-><init>(LD8/d;)V

    invoke-interface {p4, v0}, LE8/n;->f(Lx7/a;)LE8/j;

    move-result-object p4

    iput-object p4, p0, LD8/d;->W:LE8/j;

    invoke-virtual {p3}, LB8/m;->h()LE8/n;

    move-result-object p4

    new-instance v0, LD8/d$k;

    invoke-direct {v0, p0}, LD8/d$k;-><init>(LD8/d;)V

    invoke-interface {p4, v0}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p4

    iput-object p4, p0, LD8/d;->X:LE8/i;

    invoke-virtual {p3}, LB8/m;->h()LE8/n;

    move-result-object p4

    new-instance v0, LD8/d$l;

    invoke-direct {v0, p0}, LD8/d$l;-><init>(LD8/d;)V

    invoke-interface {p4, v0}, LE8/n;->f(Lx7/a;)LE8/j;

    move-result-object p4

    iput-object p4, p0, LD8/d;->Y:LE8/j;

    new-instance p4, LB8/A$a;

    invoke-virtual {p3}, LB8/m;->g()Lk8/c;

    move-result-object v4

    invoke-virtual {p3}, LB8/m;->j()Lk8/g;

    move-result-object v5

    instance-of v0, p1, LD8/d;

    if-eqz v0, :cond_4

    check-cast p1, LD8/d;

    goto :goto_4

    :cond_4
    move-object p1, v1

    :goto_4
    if-eqz p1, :cond_5

    iget-object v1, p1, LD8/d;->Z:LB8/A$a;

    :cond_5
    move-object v7, v1

    move-object v2, p4

    move-object v3, p2

    move-object v6, p5

    invoke-direct/range {v2 .. v7}, LB8/A$a;-><init>(Li8/c;Lk8/c;Lk8/g;LO7/a0;LB8/A$a;)V

    iput-object p4, p0, LD8/d;->Z:LB8/A$a;

    sget-object p1, Lk8/b;->c:Lk8/b$b;

    invoke-virtual {p2}, Li8/c;->E0()I

    move-result p2

    invoke-virtual {p1, p2}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_6

    sget-object p1, LP7/g;->d:LP7/g$a;

    invoke-virtual {p1}, LP7/g$a;->b()LP7/g;

    move-result-object p1

    goto :goto_5

    :cond_6
    new-instance p1, LD8/n;

    invoke-virtual {p3}, LB8/m;->h()LE8/n;

    move-result-object p2

    new-instance p3, LD8/d$d;

    invoke-direct {p3, p0}, LD8/d$d;-><init>(LD8/d;)V

    invoke-direct {p1, p2, p3}, LD8/n;-><init>(LE8/n;Lx7/a;)V

    :goto_5
    iput-object p1, p0, LD8/d;->a0:LP7/g;

    return-void
.end method

.method public static final synthetic T0(LD8/d;)LO7/e;
    .locals 0

    invoke-direct {p0}, LD8/d;->c1()LO7/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic U0(LD8/d;)Ljava/util/Collection;
    .locals 0

    invoke-direct {p0}, LD8/d;->d1()Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic V0(LD8/d;)LO7/d;
    .locals 0

    invoke-direct {p0}, LD8/d;->e1()LO7/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic W0(LD8/d;)Ljava/util/Collection;
    .locals 0

    invoke-direct {p0}, LD8/d;->g1()Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic X0(LD8/d;)LO7/h0;
    .locals 0

    invoke-direct {p0}, LD8/d;->h1()LO7/h0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic Y0(LD8/d;)Ln8/b;
    .locals 0

    iget-object p0, p0, LD8/d;->K:Ln8/b;

    return-object p0
.end method

.method public static final synthetic Z0(LD8/d;)LD8/d$c;
    .locals 0

    iget-object p0, p0, LD8/d;->S:LD8/d$c;

    return-object p0
.end method

.method public static final synthetic a1(LD8/d;)LD8/d$b;
    .locals 0

    iget-object p0, p0, LD8/d;->Q:LD8/d$b;

    return-object p0
.end method

.method public static final synthetic b1(LD8/d;Ln8/f;)LF8/M;
    .locals 0

    invoke-direct {p0, p1}, LD8/d;->o1(Ln8/f;)LF8/M;

    move-result-object p0

    return-object p0
.end method

.method private final c1()LO7/e;
    .locals 4

    .prologue
    iget-object v0, p0, LD8/d;->H:Li8/c;

    invoke-virtual {v0}, Li8/c;->l1()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, LD8/d;->O:LB8/m;

    invoke-virtual {v0}, LB8/m;->g()Lk8/c;

    move-result-object v0

    iget-object v2, p0, LD8/d;->H:Li8/c;

    invoke-virtual {v2}, Li8/c;->r0()I

    move-result v2

    invoke-static {v0, v2}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object v0

    invoke-direct {p0}, LD8/d;->k1()LD8/d$a;

    move-result-object v2

    sget-object v3, LW7/d;->T:LW7/d;

    invoke-virtual {v2, v0, v3}, LD8/d$a;->g(Ln8/f;LW7/b;)LO7/h;

    move-result-object v0

    instance-of v2, v0, LO7/e;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, LO7/e;

    :cond_1
    return-object v1
.end method

.method private final d1()Ljava/util/Collection;
    .locals 2

    invoke-direct {p0}, LD8/d;->f1()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p0}, LD8/d;->X()LO7/d;

    move-result-object v1

    invoke-static {v1}, Lj7/v;->q(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    iget-object v1, p0, LD8/d;->O:LB8/m;

    invoke-virtual {v1}, LB8/m;->c()LB8/k;

    move-result-object v1

    invoke-virtual {v1}, LB8/k;->c()LQ7/a;

    move-result-object v1

    invoke-interface {v1, p0}, LQ7/a;->a(LO7/e;)Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method private final e1()LO7/d;
    .locals 6

    .prologue
    iget-object v0, p0, LD8/d;->N:LO7/f;

    invoke-virtual {v0}, LO7/f;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LO7/a0;->a:LO7/a0;

    invoke-static {p0, v0}, Lr8/e;->l(LO7/e;LO7/a0;)LR7/f;

    move-result-object v0

    invoke-virtual {p0}, LR7/a;->w()LF8/M;

    move-result-object v1

    invoke-virtual {v0, v1}, LR7/p;->p1(LF8/E;)V

    return-object v0

    :cond_0
    iget-object v0, p0, LD8/d;->H:Li8/c;

    invoke-virtual {v0}, Li8/c;->u0()Ljava/util/List;

    move-result-object v0

    const-string v1, "getConstructorList(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Li8/d;

    sget-object v5, Lk8/b;->n:Lk8/b$b;

    invoke-virtual {v4}, Li8/d;->J()I

    move-result v4

    invoke-virtual {v5, v4}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    xor-int/2addr v4, v3

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_2
    move-object v1, v2

    :goto_0
    check-cast v1, Li8/d;

    if-eqz v1, :cond_3

    iget-object v0, p0, LD8/d;->O:LB8/m;

    invoke-virtual {v0}, LB8/m;->f()LB8/x;

    move-result-object v0

    invoke-virtual {v0, v1, v3}, LB8/x;->i(Li8/d;Z)LO7/d;

    move-result-object v2

    :cond_3
    return-object v2
.end method

.method private final f1()Ljava/util/List;
    .locals 5

    .prologue
    iget-object v0, p0, LD8/d;->H:Li8/c;

    invoke-virtual {v0}, Li8/c;->u0()Ljava/util/List;

    move-result-object v0

    const-string v1, "getConstructorList(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Li8/d;

    sget-object v4, Lk8/b;->n:Lk8/b$b;

    invoke-virtual {v3}, Li8/d;->J()I

    move-result v3

    invoke-virtual {v4, v3}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "get(...)"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li8/d;

    iget-object v3, p0, LD8/d;->O:LB8/m;

    invoke-virtual {v3}, LB8/m;->f()LB8/x;

    move-result-object v3

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v4, 0x0

    invoke-virtual {v3, v2, v4}, LB8/x;->i(Li8/d;Z)LO7/d;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method private final g1()Ljava/util/Collection;
    .locals 5

    .prologue
    iget-object v0, p0, LD8/d;->L:LO7/D;

    sget-object v1, LO7/D;->E:LO7/D;

    if-eq v0, v1, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0

    :cond_0
    iget-object v0, p0, LD8/d;->H:Li8/c;

    invoke-virtual {v0}, Li8/c;->X0()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iget-object v3, p0, LD8/d;->O:LB8/m;

    invoke-virtual {v3}, LB8/m;->c()LB8/k;

    move-result-object v3

    iget-object v4, p0, LD8/d;->O:LB8/m;

    invoke-virtual {v4}, LB8/m;->g()Lk8/c;

    move-result-object v4

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v4, v2}, LB8/y;->a(Lk8/c;I)Ln8/b;

    move-result-object v2

    invoke-virtual {v3, v2}, LB8/k;->b(Ln8/b;)LO7/e;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1

    :cond_3
    sget-object v0, Lr8/a;->a:Lr8/a;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lr8/a;->a(LO7/e;Z)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method private final h1()LO7/h0;
    .locals 6

    .prologue
    invoke-virtual {p0}, LD8/d;->m()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LD8/d;->P()Z

    move-result v0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, LD8/d;->H:Li8/c;

    iget-object v2, p0, LD8/d;->O:LB8/m;

    invoke-virtual {v2}, LB8/m;->g()Lk8/c;

    move-result-object v2

    iget-object v3, p0, LD8/d;->O:LB8/m;

    invoke-virtual {v3}, LB8/m;->j()Lk8/g;

    move-result-object v3

    new-instance v4, LD8/d$f;

    iget-object v5, p0, LD8/d;->O:LB8/m;

    invoke-virtual {v5}, LB8/m;->i()LB8/E;

    move-result-object v5

    invoke-direct {v4, v5}, LD8/d$f;-><init>(Ljava/lang/Object;)V

    new-instance v5, LD8/d$g;

    invoke-direct {v5, p0}, LD8/d$g;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v2, v3, v4, v5}, LB8/G;->a(Li8/c;Lk8/c;Lk8/g;Lx7/l;Lx7/l;)LO7/h0;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, LD8/d;->I:Lk8/a;

    const/4 v2, 0x5

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v2, v3}, Lk8/a;->c(III)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, LD8/d;->X()LO7/d;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, LO7/a;->n()Ljava/util/List;

    move-result-object v0

    const-string v1, "getValueParameters(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/j0;

    invoke-interface {v0}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, LD8/d;->o1(Ln8/f;)LF8/M;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, LO7/z;

    invoke-direct {v2, v0, v1}, LO7/z;-><init>(Ln8/f;LJ8/j;)V

    return-object v2

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Value class has no underlying property: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Inline class has no primary constructor: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    return-object v1
.end method

.method private final k1()LD8/d$a;
    .locals 2

    iget-object v0, p0, LD8/d;->R:LO7/Y;

    iget-object v1, p0, LD8/d;->O:LB8/m;

    invoke-virtual {v1}, LB8/m;->c()LB8/k;

    move-result-object v1

    invoke-virtual {v1}, LB8/k;->n()LG8/l;

    move-result-object v1

    invoke-interface {v1}, LG8/l;->c()LG8/g;

    move-result-object v1

    invoke-virtual {v0, v1}, LO7/Y;->c(LG8/g;)Ly8/h;

    move-result-object v0

    check-cast v0, LD8/d$a;

    return-object v0
.end method

.method private final o1(Ln8/f;)LF8/M;
    .locals 5

    .prologue
    invoke-direct {p0}, LD8/d;->k1()LD8/d$a;

    move-result-object v0

    sget-object v1, LW7/d;->T:LW7/d;

    invoke-virtual {v0, p1, v1}, LD8/d$a;->c(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v2, v0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LO7/U;

    invoke-interface {v4}, LO7/a;->v0()LO7/X;

    move-result-object v4

    if-nez v4, :cond_0

    if-eqz v1, :cond_1

    :goto_1
    move-object v2, v0

    goto :goto_2

    :cond_1
    const/4 v1, 0x1

    move-object v2, v3

    goto :goto_0

    :cond_2
    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_2
    check-cast v2, LO7/U;

    if-eqz v2, :cond_4

    invoke-interface {v2}, LO7/i0;->getType()LF8/E;

    move-result-object v0

    :cond_4
    check-cast v0, LF8/M;

    return-object v0
.end method


# virtual methods
.method public A()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LD8/d;->O:LB8/m;

    invoke-virtual {v0}, LB8/m;->i()LB8/E;

    move-result-object v0

    invoke-virtual {v0}, LB8/E;->j()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public C()Z
    .locals 2

    sget-object v0, Lk8/b;->i:Lk8/b$b;

    iget-object v1, p0, LD8/d;->H:Li8/c;

    invoke-virtual {v1}, Li8/c;->E0()I

    move-result v1

    invoke-virtual {v0, v1}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public E()Z
    .locals 2

    .prologue
    sget-object v0, Lk8/b;->f:Lk8/b$d;

    iget-object v1, p0, LD8/d;->H:Li8/c;

    invoke-virtual {v1}, Li8/c;->E0()I

    move-result v1

    invoke-virtual {v0, v1}, Lk8/b$d;->d(I)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Li8/c$c;->J:Li8/c$c;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public I()Z
    .locals 2

    sget-object v0, Lk8/b;->l:Lk8/b$b;

    iget-object v1, p0, LD8/d;->H:Li8/c;

    invoke-virtual {v1}, Li8/c;->E0()I

    move-result v1

    invoke-virtual {v0, v1}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public I0()LO7/h0;
    .locals 1

    iget-object v0, p0, LD8/d;->Y:LE8/j;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/h0;

    return-object v0
.end method

.method public N0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public O()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LD8/d;->X:LE8/i;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public P()Z
    .locals 4

    .prologue
    sget-object v0, Lk8/b;->k:Lk8/b$b;

    iget-object v1, p0, LD8/d;->H:Li8/c;

    invoke-virtual {v1}, Li8/c;->E0()I

    move-result v1

    invoke-virtual {v0, v1}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LD8/d;->I:Lk8/a;

    const/4 v1, 0x4

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v1, v2}, Lk8/a;->c(III)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    return v3
.end method

.method public P0()Ljava/util/List;
    .locals 7

    .prologue
    iget-object v0, p0, LD8/d;->H:Li8/c;

    iget-object v1, p0, LD8/d;->O:LB8/m;

    invoke-virtual {v1}, LB8/m;->j()Lk8/g;

    move-result-object v1

    invoke-static {v0, v1}, Lk8/f;->b(Li8/c;Lk8/g;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li8/q;

    iget-object v3, p0, LD8/d;->O:LB8/m;

    invoke-virtual {v3}, LB8/m;->i()LB8/E;

    move-result-object v3

    invoke-virtual {v3, v2}, LB8/E;->q(Li8/q;)LF8/E;

    move-result-object v2

    new-instance v3, LR7/F;

    invoke-virtual {p0}, LR7/a;->S0()LO7/X;

    move-result-object v4

    new-instance v5, Lz8/b;

    const/4 v6, 0x0

    invoke-direct {v5, p0, v2, v6, v6}, Lz8/b;-><init>(LO7/e;LF8/E;Ln8/f;Lz8/g;)V

    sget-object v2, LP7/g;->d:LP7/g$a;

    invoke-virtual {v2}, LP7/g$a;->b()LP7/g;

    move-result-object v2

    invoke-direct {v3, v4, v5, v2}, LR7/F;-><init>(LO7/m;Lz8/g;LP7/g;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method protected Q(LG8/g;)Ly8/h;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LD8/d;->R:LO7/Y;

    invoke-virtual {v0, p1}, LO7/Y;->c(LG8/g;)Ly8/h;

    move-result-object p1

    return-object p1
.end method

.method public R()Z
    .locals 2

    sget-object v0, Lk8/b;->j:Lk8/b$b;

    iget-object v1, p0, LD8/d;->H:Li8/c;

    invoke-virtual {v1}, Li8/c;->E0()I

    move-result v1

    invoke-virtual {v0, v1}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public R0()Z
    .locals 2

    sget-object v0, Lk8/b;->h:Lk8/b$b;

    iget-object v1, p0, LD8/d;->H:Li8/c;

    invoke-virtual {v1}, Li8/c;->E0()I

    move-result v1

    invoke-virtual {v0, v1}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public S()Z
    .locals 2

    sget-object v0, Lk8/b;->g:Lk8/b$b;

    iget-object v1, p0, LD8/d;->H:Li8/c;

    invoke-virtual {v1}, Li8/c;->E0()I

    move-result v1

    invoke-virtual {v0, v1}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public X()LO7/d;
    .locals 1

    iget-object v0, p0, LD8/d;->U:LE8/j;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/d;

    return-object v0
.end method

.method public bridge synthetic Y()Ly8/h;
    .locals 1

    invoke-virtual {p0}, LD8/d;->m1()Ly8/i;

    move-result-object v0

    return-object v0
.end method

.method public a0()LO7/e;
    .locals 1

    iget-object v0, p0, LD8/d;->W:LE8/j;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/e;

    return-object v0
.end method

.method public b()LO7/m;
    .locals 1

    iget-object v0, p0, LD8/d;->T:LO7/m;

    return-object v0
.end method

.method public h()LO7/u;
    .locals 1

    iget-object v0, p0, LD8/d;->M:LO7/u;

    return-object v0
.end method

.method public final i1()LB8/m;
    .locals 1

    iget-object v0, p0, LD8/d;->O:LB8/m;

    return-object v0
.end method

.method public j()LO7/f;
    .locals 1

    iget-object v0, p0, LD8/d;->N:LO7/f;

    return-object v0
.end method

.method public final j1()Li8/c;
    .locals 1

    iget-object v0, p0, LD8/d;->H:Li8/c;

    return-object v0
.end method

.method public k()LP7/g;
    .locals 1

    iget-object v0, p0, LD8/d;->a0:LP7/g;

    return-object v0
.end method

.method public final l1()Lk8/a;
    .locals 1

    iget-object v0, p0, LD8/d;->I:Lk8/a;

    return-object v0
.end method

.method public m()Z
    .locals 3

    .prologue
    sget-object v0, Lk8/b;->k:Lk8/b$b;

    iget-object v1, p0, LD8/d;->H:Li8/c;

    invoke-virtual {v1}, Li8/c;->E0()I

    move-result v1

    invoke-virtual {v0, v1}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LD8/d;->I:Lk8/a;

    const/4 v1, 0x4

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1, v2}, Lk8/a;->e(III)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public m1()Ly8/i;
    .locals 1

    iget-object v0, p0, LD8/d;->P:Ly8/i;

    return-object v0
.end method

.method public final n1()LB8/A$a;
    .locals 1

    iget-object v0, p0, LD8/d;->Z:LB8/A$a;

    return-object v0
.end method

.method public o()LO7/a0;
    .locals 1

    iget-object v0, p0, LD8/d;->J:LO7/a0;

    return-object v0
.end method

.method public p()LF8/e0;
    .locals 1

    iget-object v0, p0, LD8/d;->Q:LD8/d$b;

    return-object v0
.end method

.method public final p1(Ln8/f;)Z
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LD8/d;->k1()LD8/d$a;

    move-result-object v0

    invoke-virtual {v0}, LD8/h;->q()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public q()LO7/D;
    .locals 1

    iget-object v0, p0, LD8/d;->L:LO7/D;

    return-object v0
.end method

.method public r()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LD8/d;->V:LE8/i;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "deserialized "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LD8/d;->R()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "expect "

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LR7/a;->getName()Ln8/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
