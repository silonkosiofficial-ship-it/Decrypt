.class public final LD0/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD0/C$a;,
        LD0/C$b;,
        LD0/C$c;
    }
.end annotation


# instance fields
.field private final C:LF0/J;

.field private D:LV/s;

.field private E:LD0/k0;

.field private F:I

.field private G:I

.field private final H:Ljava/util/HashMap;

.field private final I:Ljava/util/HashMap;

.field private final J:LD0/C$c;

.field private final K:LD0/C$b;

.field private final L:Ljava/util/HashMap;

.field private final M:LD0/k0$a;

.field private final N:Ljava/util/Map;

.field private final O:LX/b;

.field private P:I

.field private Q:I

.field private final R:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LF0/J;LD0/k0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD0/C;->C:LF0/J;

    iput-object p2, p0, LD0/C;->E:LD0/k0;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LD0/C;->H:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LD0/C;->I:Ljava/util/HashMap;

    new-instance p1, LD0/C$c;

    invoke-direct {p1, p0}, LD0/C$c;-><init>(LD0/C;)V

    iput-object p1, p0, LD0/C;->J:LD0/C$c;

    new-instance p1, LD0/C$b;

    invoke-direct {p1, p0}, LD0/C$b;-><init>(LD0/C;)V

    iput-object p1, p0, LD0/C;->K:LD0/C$b;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LD0/C;->L:Ljava/util/HashMap;

    new-instance p1, LD0/k0$a;

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-direct {p1, p2, v0, p2}, LD0/k0$a;-><init>(Ljava/util/Set;ILy7/k;)V

    iput-object p1, p0, LD0/C;->M:LD0/k0$a;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, LD0/C;->N:Ljava/util/Map;

    new-instance p1, LX/b;

    const/16 p2, 0x10

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, LX/b;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, LD0/C;->O:LX/b;

    const-string p1, "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve \'match parent\' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement."

    iput-object p1, p0, LD0/C;->R:Ljava/lang/String;

    return-void
.end method

.method private final A(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v0}, LF0/J;->M()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF0/J;

    iget-object v0, p0, LD0/C;->H:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast p1, LD0/C$a;

    invoke-virtual {p1}, LD0/C$a;->f()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final C(Z)V
    .locals 11

    .prologue
    const/4 v0, 0x0

    iput v0, p0, LD0/C;->Q:I

    iget-object v1, p0, LD0/C;->L:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    iget-object v1, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v1}, LF0/J;->M()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, LD0/C;->P:I

    if-eq v2, v1, :cond_5

    iput v1, p0, LD0/C;->P:I

    sget-object v2, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v2}, Lf0/k$a;->d()Lf0/k;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lf0/k;->h()Lx7/l;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v4

    :goto_0
    invoke-virtual {v2, v3}, Lf0/k$a;->f(Lf0/k;)Lf0/k;

    move-result-object v6

    move v7, v0

    :goto_1
    if-ge v7, v1, :cond_4

    :try_start_0
    iget-object v8, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v8}, LF0/J;->M()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LF0/J;

    iget-object v9, p0, LD0/C;->H:Ljava/util/HashMap;

    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LD0/C$a;

    if-eqz v9, :cond_3

    invoke-virtual {v9}, LD0/C$a;->a()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-direct {p0, v8}, LD0/C;->H(LF0/J;)V

    if-eqz p1, :cond_2

    invoke-virtual {v9}, LD0/C$a;->b()LV/b1;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-interface {v8}, LV/b1;->deactivate()V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    :goto_2
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v10, 0x2

    invoke-static {v8, v4, v10, v4}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v8

    invoke-virtual {v9, v8}, LD0/C$a;->h(LV/w0;)V

    goto :goto_3

    :cond_2
    invoke-virtual {v9, v0}, LD0/C$a;->g(Z)V

    :goto_3
    invoke-static {}, LD0/g0;->c()LD0/g0$a;

    move-result-object v8

    invoke-virtual {v9, v8}, LD0/C$a;->m(Ljava/lang/Object;)V

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_4
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2, v3, v6, v5}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    iget-object p1, p0, LD0/C;->I:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    goto :goto_5

    :goto_4
    invoke-virtual {v2, v3, v6, v5}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    throw p1

    :cond_5
    :goto_5
    invoke-virtual {p0}, LD0/C;->B()V

    return-void
.end method

.method private final D(III)V
    .locals 2

    iget-object v0, p0, LD0/C;->C:LF0/J;

    const/4 v1, 0x1

    invoke-static {v0, v1}, LF0/J;->s(LF0/J;Z)V

    iget-object v1, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v1, p1, p2, p3}, LF0/J;->e1(III)V

    const/4 p1, 0x0

    invoke-static {v0, p1}, LF0/J;->s(LF0/J;Z)V

    return-void
.end method

.method static synthetic E(LD0/C;IIIILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-direct {p0, p1, p2, p3}, LD0/C;->D(III)V

    return-void
.end method

.method private final F(Ljava/lang/Object;Lx7/p;)Ljava/util/List;
    .locals 8

    .prologue
    iget-object v0, p0, LD0/C;->O:LX/b;

    invoke-virtual {v0}, LX/b;->t()I

    move-result v0

    iget v1, p0, LD0/C;->G:I

    if-lt v0, v1, :cond_5

    iget-object v0, p0, LD0/C;->O:LX/b;

    invoke-virtual {v0}, LX/b;->t()I

    move-result v0

    iget v1, p0, LD0/C;->G:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LD0/C;->O:LX/b;

    invoke-virtual {v0, p1}, LX/b;->d(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, LD0/C;->O:LX/b;

    invoke-virtual {v0, v1, p1}, LX/b;->J(ILjava/lang/Object;)Ljava/lang/Object;

    :goto_0
    iget v0, p0, LD0/C;->G:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, LD0/C;->G:I

    iget-object v0, p0, LD0/C;->L:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0, p1, p2}, LD0/C;->G(Ljava/lang/Object;Lx7/p;)LD0/i0$a;

    move-result-object p2

    iget-object v0, p0, LD0/C;->N:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, LD0/C;->C:LF0/J;

    invoke-virtual {p2}, LF0/J;->X()LF0/J$e;

    move-result-object p2

    sget-object v0, LF0/J$e;->E:LF0/J$e;

    if-ne p2, v0, :cond_1

    iget-object p2, p0, LD0/C;->C:LF0/J;

    invoke-virtual {p2, v1}, LF0/J;->p1(Z)V

    goto :goto_1

    :cond_1
    iget-object v2, p0, LD0/C;->C:LF0/J;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LF0/J;->s1(LF0/J;ZZZILjava/lang/Object;)V

    :cond_2
    :goto_1
    iget-object p2, p0, LD0/C;->L:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF0/J;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LF0/J;->d0()LF0/O$b;

    move-result-object p1

    invoke-virtual {p1}, LF0/O$b;->o1()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    const/4 v0, 0x0

    :goto_2
    if-ge v0, p2, :cond_4

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF0/O$b;

    invoke-virtual {v1}, LF0/O$b;->y1()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    :cond_4
    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final H(LF0/J;)V
    .locals 2

    .prologue
    invoke-virtual {p1}, LF0/J;->d0()LF0/O$b;

    move-result-object v0

    sget-object v1, LF0/J$g;->E:LF0/J$g;

    invoke-virtual {v0, v1}, LF0/O$b;->L1(LF0/J$g;)V

    invoke-virtual {p1}, LF0/J;->a0()LF0/O$a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, v1}, LF0/O$a;->E1(LF0/J$g;)V

    :cond_0
    return-void
.end method

.method private final L(LF0/J;LD0/C$a;)V
    .locals 13

    .prologue
    sget-object v0, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v0}, Lf0/k$a;->d()Lf0/k;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lf0/k;->h()Lx7/l;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lf0/k$a;->f(Lf0/k;)Lf0/k;

    move-result-object v3

    :try_start_0
    iget-object v4, p0, LD0/C;->C:LF0/J;

    const/4 v5, 0x1

    invoke-static {v4, v5}, LF0/J;->s(LF0/J;Z)V

    invoke-virtual {p2}, LD0/C$a;->c()Lx7/p;

    move-result-object v6

    invoke-virtual {p2}, LD0/C$a;->b()LV/b1;

    move-result-object v8

    iget-object v11, p0, LD0/C;->D:LV/s;

    if-eqz v11, :cond_1

    invoke-virtual {p2}, LD0/C$a;->e()Z

    move-result v10

    new-instance v7, LD0/C$h;

    invoke-direct {v7, p2, v6}, LD0/C$h;-><init>(LD0/C$a;Lx7/p;)V

    const v6, -0x68551fe9

    invoke-static {v6, v5, v7}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object v12

    move-object v7, p0

    move-object v9, p1

    invoke-direct/range {v7 .. v12}, LD0/C;->N(LV/b1;LF0/J;ZLV/s;Lx7/p;)LV/b1;

    move-result-object p1

    invoke-virtual {p2, p1}, LD0/C$a;->i(LV/b1;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, LD0/C$a;->l(Z)V

    invoke-static {v4, p1}, LF0/J;->s(LF0/J;Z)V

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1, v3, v2}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "parent composition reference not set"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {v0, v1, v3, v2}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    throw p1
.end method

.method private final M(LF0/J;Ljava/lang/Object;Lx7/p;)V
    .locals 8

    .prologue
    iget-object v0, p0, LD0/C;->H:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, LD0/C$a;

    sget-object v2, LD0/g;->a:LD0/g;

    invoke-virtual {v2}, LD0/g;->a()Lx7/p;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v1

    move-object v3, p2

    invoke-direct/range {v2 .. v7}, LD0/C$a;-><init>(Ljava/lang/Object;Lx7/p;LV/b1;ILy7/k;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v1, LD0/C$a;

    invoke-virtual {v1}, LD0/C$a;->b()LV/b1;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p2}, LV/r;->s()Z

    move-result p2

    goto :goto_0

    :cond_1
    const/4 p2, 0x1

    :goto_0
    invoke-virtual {v1}, LD0/C$a;->c()Lx7/p;

    move-result-object v0

    if-ne v0, p3, :cond_2

    if-nez p2, :cond_2

    invoke-virtual {v1}, LD0/C$a;->d()Z

    move-result p2

    if-eqz p2, :cond_3

    :cond_2
    invoke-virtual {v1, p3}, LD0/C$a;->j(Lx7/p;)V

    invoke-direct {p0, p1, v1}, LD0/C;->L(LF0/J;LD0/C$a;)V

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, LD0/C$a;->k(Z)V

    :cond_3
    return-void
.end method

.method private final N(LV/b1;LF0/J;ZLV/s;Lx7/p;)LV/b1;
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    invoke-interface {p1}, LV/r;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-static {p2, p4}, Landroidx/compose/ui/platform/S1;->a(LF0/J;LV/s;)LV/b1;

    move-result-object p1

    :cond_1
    if-nez p3, :cond_2

    invoke-interface {p1, p5}, LV/r;->h(Lx7/p;)V

    goto :goto_0

    :cond_2
    invoke-interface {p1, p5}, LV/b1;->t(Lx7/p;)V

    :goto_0
    return-object p1
.end method

.method private final O(Ljava/lang/Object;)LF0/J;
    .locals 9

    .prologue
    iget v0, p0, LD0/C;->P:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v0}, LF0/J;->M()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v2, p0, LD0/C;->Q:I

    sub-int/2addr v0, v2

    iget v2, p0, LD0/C;->P:I

    sub-int v2, v0, v2

    const/4 v3, 0x1

    sub-int/2addr v0, v3

    move v4, v0

    :goto_0
    const/4 v5, -0x1

    if-lt v4, v2, :cond_2

    invoke-direct {p0, v4}, LD0/C;->A(I)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v4

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_2
    move v6, v5

    :goto_1
    if-ne v6, v5, :cond_6

    :goto_2
    if-lt v0, v2, :cond_5

    iget-object v4, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v4}, LF0/J;->M()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LF0/J;

    iget-object v7, p0, LD0/C;->H:Ljava/util/HashMap;

    invoke-virtual {v7, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v4, LD0/C$a;

    invoke-virtual {v4}, LD0/C$a;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {}, LD0/g0;->c()LD0/g0$a;

    move-result-object v8

    if-eq v7, v8, :cond_4

    iget-object v7, p0, LD0/C;->E:LD0/k0;

    invoke-virtual {v4}, LD0/C$a;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v7, p1, v8}, LD0/k0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    :cond_4
    :goto_3
    invoke-virtual {v4, p1}, LD0/C$a;->m(Ljava/lang/Object;)V

    move v4, v0

    move v6, v4

    goto :goto_4

    :cond_5
    move v4, v0

    :cond_6
    :goto_4
    if-ne v6, v5, :cond_7

    goto :goto_5

    :cond_7
    if-eq v4, v2, :cond_8

    invoke-direct {p0, v4, v2, v3}, LD0/C;->D(III)V

    :cond_8
    iget p1, p0, LD0/C;->P:I

    add-int/2addr p1, v5

    iput p1, p0, LD0/C;->P:I

    iget-object p1, p0, LD0/C;->C:LF0/J;

    invoke-virtual {p1}, LF0/J;->M()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF0/J;

    iget-object v0, p0, LD0/C;->H:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v0, LD0/C$a;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v4, 0x2

    invoke-static {v2, v1, v4, v1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v1

    invoke-virtual {v0, v1}, LD0/C$a;->h(LV/w0;)V

    invoke-virtual {v0, v3}, LD0/C$a;->l(Z)V

    invoke-virtual {v0, v3}, LD0/C$a;->k(Z)V

    move-object v1, p1

    :goto_5
    return-object v1
.end method

.method public static final synthetic a(LD0/C;)V
    .locals 0

    invoke-direct {p0}, LD0/C;->y()V

    return-void
.end method

.method public static final synthetic b(LD0/C;)I
    .locals 0

    iget p0, p0, LD0/C;->F:I

    return p0
.end method

.method public static final synthetic c(LD0/C;)I
    .locals 0

    iget p0, p0, LD0/C;->G:I

    return p0
.end method

.method public static final synthetic d(LD0/C;)LX/b;
    .locals 0

    iget-object p0, p0, LD0/C;->O:LX/b;

    return-object p0
.end method

.method public static final synthetic e(LD0/C;)LD0/C$b;
    .locals 0

    iget-object p0, p0, LD0/C;->K:LD0/C$b;

    return-object p0
.end method

.method public static final synthetic g(LD0/C;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, LD0/C;->L:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic h(LD0/C;)I
    .locals 0

    iget p0, p0, LD0/C;->Q:I

    return p0
.end method

.method public static final synthetic j(LD0/C;)I
    .locals 0

    iget p0, p0, LD0/C;->P:I

    return p0
.end method

.method public static final synthetic k(LD0/C;)LF0/J;
    .locals 0

    iget-object p0, p0, LD0/C;->C:LF0/J;

    return-object p0
.end method

.method public static final synthetic l(LD0/C;)LD0/C$c;
    .locals 0

    iget-object p0, p0, LD0/C;->J:LD0/C$c;

    return-object p0
.end method

.method public static final synthetic m(LD0/C;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, LD0/C;->I:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic n(LD0/C;III)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LD0/C;->D(III)V

    return-void
.end method

.method public static final synthetic o(LD0/C;Ljava/lang/Object;Lx7/p;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2}, LD0/C;->F(Ljava/lang/Object;Lx7/p;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q(LD0/C;I)V
    .locals 0

    iput p1, p0, LD0/C;->F:I

    return-void
.end method

.method public static final synthetic r(LD0/C;I)V
    .locals 0

    iput p1, p0, LD0/C;->G:I

    return-void
.end method

.method public static final synthetic s(LD0/C;I)V
    .locals 0

    iput p1, p0, LD0/C;->Q:I

    return-void
.end method

.method public static final synthetic t(LD0/C;I)V
    .locals 0

    iput p1, p0, LD0/C;->P:I

    return-void
.end method

.method private final v(I)LF0/J;
    .locals 5

    new-instance v0, LF0/J;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, LF0/J;-><init>(ZIILy7/k;)V

    iget-object v1, p0, LD0/C;->C:LF0/J;

    invoke-static {v1, v3}, LF0/J;->s(LF0/J;Z)V

    iget-object v2, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v2, p1, v0}, LF0/J;->B0(ILF0/J;)V

    invoke-static {v1, v4}, LF0/J;->s(LF0/J;Z)V

    return-object v0
.end method

.method private final w()V
    .locals 3

    .prologue
    iget-object v0, p0, LD0/C;->C:LF0/J;

    const/4 v1, 0x1

    invoke-static {v0, v1}, LF0/J;->s(LF0/J;Z)V

    iget-object v1, p0, LD0/C;->H:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LD0/C$a;

    invoke-virtual {v2}, LD0/C$a;->b()LV/b1;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, LV/r;->e()V

    goto :goto_0

    :cond_1
    iget-object v1, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v1}, LF0/J;->m1()V

    const/4 v1, 0x0

    invoke-static {v0, v1}, LF0/J;->s(LF0/J;Z)V

    iget-object v0, p0, LD0/C;->H:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, LD0/C;->I:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iput v1, p0, LD0/C;->Q:I

    iput v1, p0, LD0/C;->P:I

    iget-object v0, p0, LD0/C;->L:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    invoke-virtual {p0}, LD0/C;->B()V

    return-void
.end method

.method private final y()V
    .locals 2

    iget-object v0, p0, LD0/C;->N:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, LD0/C$e;

    invoke-direct {v1, p0}, LD0/C$e;-><init>(LD0/C;)V

    invoke-static {v0, v1}, Lj7/v;->H(Ljava/lang/Iterable;Lx7/l;)Z

    return-void
.end method


# virtual methods
.method public final B()V
    .locals 3

    .prologue
    iget-object v0, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v0}, LF0/J;->M()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, LD0/C;->H:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    if-ne v1, v0, :cond_2

    iget v1, p0, LD0/C;->P:I

    sub-int v1, v0, v1

    iget v2, p0, LD0/C;->Q:I

    sub-int/2addr v1, v2

    if-ltz v1, :cond_1

    iget-object v0, p0, LD0/C;->L:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    iget v1, p0, LD0/C;->Q:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Incorrect state. Precomposed children "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LD0/C;->Q:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ". Map size "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LD0/C;->L:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Incorrect state. Total children "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ". Reusable children "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LD0/C;->P:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ". Precomposed children "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LD0/C;->Q:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Inconsistency between the count of nodes tracked by the state ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LD0/C;->H:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ") and the children count on the SubcomposeLayout ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "). Are you trying to use the state of the disposed SubcomposeLayout?"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final G(Ljava/lang/Object;Lx7/p;)LD0/i0$a;
    .locals 5

    .prologue
    iget-object v0, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v0}, LF0/J;->K0()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, LD0/C$f;

    invoke-direct {p1}, LD0/C$f;-><init>()V

    return-object p1

    :cond_0
    invoke-virtual {p0}, LD0/C;->B()V

    iget-object v0, p0, LD0/C;->I:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, LD0/C;->N:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LD0/C;->L:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-direct {p0, p1}, LD0/C;->O(Ljava/lang/Object;)LF0/J;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iget-object v3, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v3}, LF0/J;->M()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v3

    iget-object v4, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v4}, LF0/J;->M()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {p0, v3, v4, v2}, LD0/C;->D(III)V

    :goto_0
    iget v3, p0, LD0/C;->Q:I

    add-int/2addr v3, v2

    iput v3, p0, LD0/C;->Q:I

    goto :goto_1

    :cond_1
    iget-object v1, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v1}, LF0/J;->M()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {p0, v1}, LD0/C;->v(I)LF0/J;

    move-result-object v1

    goto :goto_0

    :goto_1
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    check-cast v1, LF0/J;

    invoke-direct {p0, v1, p1, p2}, LD0/C;->M(LF0/J;Ljava/lang/Object;Lx7/p;)V

    :cond_3
    new-instance p2, LD0/C$g;

    invoke-direct {p2, p0, p1}, LD0/C$g;-><init>(LD0/C;Ljava/lang/Object;)V

    return-object p2
.end method

.method public final I(LV/s;)V
    .locals 0

    iput-object p1, p0, LD0/C;->D:LV/s;

    return-void
.end method

.method public final J(LD0/k0;)V
    .locals 6

    .prologue
    iget-object v0, p0, LD0/C;->E:LD0/k0;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, LD0/C;->E:LD0/k0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LD0/C;->C(Z)V

    iget-object v0, p0, LD0/C;->C:LF0/J;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LF0/J;->w1(LF0/J;ZZZILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final K(Ljava/lang/Object;Lx7/p;)Ljava/util/List;
    .locals 12

    .prologue
    invoke-virtual {p0}, LD0/C;->B()V

    iget-object v0, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v0}, LF0/J;->X()LF0/J$e;

    move-result-object v0

    sget-object v1, LF0/J$e;->C:LF0/J$e;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_1

    sget-object v4, LF0/J$e;->E:LF0/J$e;

    if-eq v0, v4, :cond_1

    sget-object v4, LF0/J$e;->D:LF0/J$e;

    if-eq v0, v4, :cond_1

    sget-object v4, LF0/J$e;->F:LF0/J$e;

    if-ne v0, v4, :cond_0

    goto :goto_0

    :cond_0
    move v4, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v4, v3

    :goto_1
    if-nez v4, :cond_2

    const-string v4, "subcompose can only be used inside the measure or layout blocks"

    invoke-static {v4}, LC0/a;->b(Ljava/lang/String;)V

    :cond_2
    iget-object v4, p0, LD0/C;->I:Ljava/util/HashMap;

    invoke-interface {v4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_7

    iget-object v5, p0, LD0/C;->L:Ljava/util/HashMap;

    invoke-virtual {v5, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LF0/J;

    if-eqz v5, :cond_5

    iget v6, p0, LD0/C;->Q:I

    if-lez v6, :cond_3

    move v2, v3

    :cond_3
    if-nez v2, :cond_4

    const-string v2, "Check failed."

    invoke-static {v2}, LC0/a;->b(Ljava/lang/String;)V

    :cond_4
    iget v2, p0, LD0/C;->Q:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, LD0/C;->Q:I

    goto :goto_2

    :cond_5
    invoke-direct {p0, p1}, LD0/C;->O(Ljava/lang/Object;)LF0/J;

    move-result-object v2

    if-nez v2, :cond_6

    iget v2, p0, LD0/C;->F:I

    invoke-direct {p0, v2}, LD0/C;->v(I)LF0/J;

    move-result-object v2

    :cond_6
    move-object v5, v2

    :goto_2
    invoke-interface {v4, p1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    check-cast v5, LF0/J;

    iget-object v2, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v2}, LF0/J;->M()Ljava/util/List;

    move-result-object v2

    iget v4, p0, LD0/C;->F:I

    invoke-static {v2, v4}, Lj7/v;->l0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v5, :cond_9

    iget-object v2, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v2}, LF0/J;->M()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v5}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v7

    iget v8, p0, LD0/C;->F:I

    if-lt v7, v8, :cond_8

    if-eq v8, v7, :cond_9

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v6, p0

    invoke-static/range {v6 .. v11}, LD0/C;->E(LD0/C;IIIILjava/lang/Object;)V

    goto :goto_3

    :cond_8
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Key \""

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_9
    :goto_3
    iget v2, p0, LD0/C;->F:I

    add-int/2addr v2, v3

    iput v2, p0, LD0/C;->F:I

    invoke-direct {p0, v5, p1, p2}, LD0/C;->M(LF0/J;Ljava/lang/Object;Lx7/p;)V

    if-eq v0, v1, :cond_b

    sget-object p1, LF0/J$e;->E:LF0/J$e;

    if-ne v0, p1, :cond_a

    goto :goto_4

    :cond_a
    invoke-virtual {v5}, LF0/J;->F()Ljava/util/List;

    move-result-object p1

    goto :goto_5

    :cond_b
    :goto_4
    invoke-virtual {v5}, LF0/J;->G()Ljava/util/List;

    move-result-object p1

    :goto_5
    return-object p1
.end method

.method public f()V
    .locals 0

    invoke-direct {p0}, LD0/C;->w()V

    return-void
.end method

.method public i()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LD0/C;->C(Z)V

    return-void
.end method

.method public p()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LD0/C;->C(Z)V

    return-void
.end method

.method public final u(Lx7/p;)LD0/I;
    .locals 2

    iget-object v0, p0, LD0/C;->R:Ljava/lang/String;

    new-instance v1, LD0/C$d;

    invoke-direct {v1, p0, p1, v0}, LD0/C$d;-><init>(LD0/C;Lx7/p;Ljava/lang/String;)V

    return-object v1
.end method

.method public final x(I)V
    .locals 13

    .prologue
    const/4 v0, 0x0

    iput v0, p0, LD0/C;->P:I

    iget-object v1, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v1}, LF0/J;->M()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, LD0/C;->Q:I

    sub-int/2addr v1, v2

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-gt p1, v1, :cond_6

    iget-object v3, p0, LD0/C;->M:LD0/k0$a;

    invoke-virtual {v3}, LD0/k0$a;->clear()V

    if-gt p1, v1, :cond_0

    move v3, p1

    :goto_0
    invoke-direct {p0, v3}, LD0/C;->A(I)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, LD0/C;->M:LD0/k0$a;

    invoke-virtual {v5, v4}, LD0/k0$a;->d(Ljava/lang/Object;)Z

    if-eq v3, v1, :cond_0

    add-int/2addr v3, v2

    goto :goto_0

    :cond_0
    iget-object v3, p0, LD0/C;->E:LD0/k0;

    iget-object v4, p0, LD0/C;->M:LD0/k0$a;

    invoke-interface {v3, v4}, LD0/k0;->b(LD0/k0$a;)V

    sget-object v3, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v3}, Lf0/k$a;->d()Lf0/k;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lf0/k;->h()Lx7/l;

    move-result-object v5

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v3, v4}, Lf0/k$a;->f(Lf0/k;)Lf0/k;

    move-result-object v6

    move v7, v0

    :goto_2
    if-lt v1, p1, :cond_5

    :try_start_0
    iget-object v8, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v8}, LF0/J;->M()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LF0/J;

    iget-object v9, p0, LD0/C;->H:Ljava/util/HashMap;

    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v9, LD0/C$a;

    invoke-virtual {v9}, LD0/C$a;->f()Ljava/lang/Object;

    move-result-object v10

    iget-object v11, p0, LD0/C;->M:LD0/k0$a;

    invoke-virtual {v11, v10}, LD0/k0$a;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    iget v11, p0, LD0/C;->P:I

    add-int/2addr v11, v2

    iput v11, p0, LD0/C;->P:I

    invoke-virtual {v9}, LD0/C$a;->a()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-direct {p0, v8}, LD0/C;->H(LF0/J;)V

    invoke-virtual {v9, v0}, LD0/C$a;->g(Z)V

    move v7, v2

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_2
    iget-object v11, p0, LD0/C;->C:LF0/J;

    invoke-static {v11, v2}, LF0/J;->s(LF0/J;Z)V

    iget-object v12, p0, LD0/C;->H:Ljava/util/HashMap;

    invoke-virtual {v12, v8}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9}, LD0/C$a;->b()LV/b1;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-interface {v8}, LV/r;->e()V

    :cond_3
    iget-object v8, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v8, v1, v2}, LF0/J;->n1(II)V

    invoke-static {v11, v0}, LF0/J;->s(LF0/J;Z)V

    :cond_4
    :goto_3
    iget-object v8, p0, LD0/C;->I:Ljava/util/HashMap;

    invoke-virtual {v8, v10}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    :cond_5
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3, v4, v6, v5}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    move v0, v7

    goto :goto_5

    :goto_4
    invoke-virtual {v3, v4, v6, v5}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    throw p1

    :cond_6
    :goto_5
    if-eqz v0, :cond_7

    sget-object p1, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {p1}, Lf0/k$a;->n()V

    :cond_7
    invoke-virtual {p0}, LD0/C;->B()V

    return-void
.end method

.method public final z()V
    .locals 7

    .prologue
    iget-object v0, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v0}, LF0/J;->M()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, LD0/C;->P:I

    if-eq v1, v0, :cond_1

    iget-object v0, p0, LD0/C;->H:Ljava/util/HashMap;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD0/C$a;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, LD0/C$a;->k(Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LD0/C;->C:LF0/J;

    invoke-virtual {v0}, LF0/J;->e0()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v1, p0, LD0/C;->C:LF0/J;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LF0/J;->w1(LF0/J;ZZZILjava/lang/Object;)V

    :cond_1
    return-void
.end method
