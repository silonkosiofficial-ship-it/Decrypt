.class public final LK0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroidx/compose/ui/d$c;

.field private final b:Z

.field private final c:LF0/J;

.field private final d:LK0/k;

.field private e:Z

.field private f:LK0/o;

.field private final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/d$c;ZLF0/J;LK0/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK0/o;->a:Landroidx/compose/ui/d$c;

    iput-boolean p2, p0, LK0/o;->b:Z

    iput-object p3, p0, LK0/o;->c:LF0/J;

    iput-object p4, p0, LK0/o;->d:LK0/k;

    invoke-virtual {p3}, LF0/J;->q0()I

    move-result p1

    iput p1, p0, LK0/o;->g:I

    return-void
.end method

.method private final B(LK0/k;)V
    .locals 5

    .prologue
    iget-object v0, p0, LK0/o;->d:LK0/k;

    invoke-virtual {v0}, LK0/k;->E()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v2, v0, v1}, LK0/o;->D(LK0/o;ZZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LK0/o;

    invoke-direct {v3}, LK0/o;->y()Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v4, v3, LK0/o;->d:LK0/k;

    invoke-virtual {p1, v4}, LK0/k;->N(LK0/k;)V

    invoke-direct {v3, p1}, LK0/o;->B(LK0/k;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static synthetic D(LK0/o;ZZILjava/lang/Object;)Ljava/util/List;
    .locals 1

    .prologue
    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    :cond_1
    invoke-virtual {p0, p1, p2}, LK0/o;->C(ZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final b(Ljava/util/List;)V
    .locals 3

    .prologue
    invoke-static {p0}, LK0/p;->c(LK0/o;)LK0/h;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LK0/o;->d:LK0/k;

    invoke-virtual {v1}, LK0/k;->M()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    new-instance v1, LK0/o$a;

    invoke-direct {v1, v0}, LK0/o$a;-><init>(LK0/h;)V

    invoke-direct {p0, v0, v1}, LK0/o;->c(LK0/h;Lx7/l;)LK0/o;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, LK0/o;->d:LK0/k;

    sget-object v1, LK0/r;->a:LK0/r;

    invoke-virtual {v1}, LK0/r;->d()LK0/v;

    move-result-object v2

    invoke-virtual {v0, v2}, LK0/k;->f(LK0/v;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_2

    iget-object v0, p0, LK0/o;->d:LK0/k;

    invoke-virtual {v0}, LK0/k;->M()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LK0/o;->d:LK0/k;

    invoke-virtual {v1}, LK0/r;->d()LK0/v;

    move-result-object v1

    invoke-static {v0, v1}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lj7/v;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    new-instance v2, LK0/o$b;

    invoke-direct {v2, v0}, LK0/o$b;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1, v2}, LK0/o;->c(LK0/h;Lx7/l;)LK0/o;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_2
    return-void
.end method

.method private final c(LK0/h;Lx7/l;)LK0/o;
    .locals 5

    .prologue
    new-instance v0, LK0/k;

    invoke-direct {v0}, LK0/k;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LK0/k;->P(Z)V

    invoke-virtual {v0, v1}, LK0/k;->O(Z)V

    invoke-interface {p2, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LK0/o;

    new-instance v3, LK0/o$c;

    invoke-direct {v3, p2}, LK0/o$c;-><init>(Lx7/l;)V

    new-instance p2, LF0/J;

    if-eqz p1, :cond_0

    invoke-static {p0}, LK0/p;->d(LK0/o;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p0}, LK0/p;->b(LK0/o;)I

    move-result p1

    :goto_0
    const/4 v4, 0x1

    invoke-direct {p2, v4, p1}, LF0/J;-><init>(ZI)V

    invoke-direct {v2, v3, v1, p2, v0}, LK0/o;-><init>(Landroidx/compose/ui/d$c;ZLF0/J;LK0/k;)V

    iput-boolean v4, v2, LK0/o;->e:Z

    iput-object p0, v2, LK0/o;->f:LK0/o;

    return-object v2
.end method

.method private final d(LF0/J;Ljava/util/List;Z)V
    .locals 5

    .prologue
    invoke-virtual {p1}, LF0/J;->v0()LX/b;

    move-result-object p1

    invoke-virtual {p1}, LX/b;->t()I

    move-result v0

    if-lez v0, :cond_4

    invoke-virtual {p1}, LX/b;->s()[Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    :cond_0
    aget-object v2, p1, v1

    check-cast v2, LF0/J;

    invoke-virtual {v2}, LF0/J;->K0()Z

    move-result v3

    if-eqz v3, :cond_3

    if-nez p3, :cond_1

    invoke-virtual {v2}, LF0/J;->L0()Z

    move-result v3

    if-nez v3, :cond_3

    :cond_1
    invoke-virtual {v2}, LF0/J;->k0()LF0/b0;

    move-result-object v3

    const/16 v4, 0x8

    invoke-static {v4}, LF0/f0;->a(I)I

    move-result v4

    invoke-virtual {v3, v4}, LF0/b0;->q(I)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-boolean v3, p0, LK0/o;->b:Z

    invoke-static {v2, v3}, LK0/p;->a(LF0/J;Z)LK0/o;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-direct {p0, v2, p2, p3}, LK0/o;->d(LF0/J;Ljava/util/List;Z)V

    :cond_3
    :goto_0
    add-int/lit8 v1, v1, 0x1

    if-lt v1, v0, :cond_0

    :cond_4
    return-void
.end method

.method private final f(Ljava/util/List;)Ljava/util/List;
    .locals 5

    .prologue
    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v2, v0, v1}, LK0/o;->D(LK0/o;ZZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    if-ge v2, v1, :cond_2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LK0/o;

    invoke-direct {v3}, LK0/o;->y()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    iget-object v4, v3, LK0/o;->d:LK0/k;

    invoke-virtual {v4}, LK0/k;->E()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-direct {v3, p1}, LK0/o;->f(Ljava/util/List;)Ljava/util/List;

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method static synthetic g(LK0/o;Ljava/util/List;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    invoke-direct {p0, p1}, LK0/o;->f(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(LK0/o;ZZZILjava/lang/Object;)Ljava/util/List;
    .locals 1

    .prologue
    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, LK0/o;->b:Z

    xor-int/lit8 p1, p1, 0x1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move p3, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, LK0/o;->l(ZZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final y()Z
    .locals 1

    .prologue
    iget-boolean v0, p0, LK0/o;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LK0/o;->d:LK0/k;

    invoke-virtual {v0}, LK0/k;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public final A()Z
    .locals 2

    .prologue
    iget-boolean v0, p0, LK0/o;->e:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, LK0/o;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LK0/o;->c:LF0/J;

    sget-object v1, LK0/o$d;->D:LK0/o$d;

    invoke-static {v0, v1}, LK0/p;->f(LF0/J;Lx7/l;)LF0/J;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final C(ZZ)Ljava/util/List;
    .locals 2

    .prologue
    iget-boolean v0, p0, LK0/o;->e:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LK0/o;->c:LF0/J;

    invoke-direct {p0, v1, v0, p2}, LK0/o;->d(LF0/J;Ljava/util/List;Z)V

    if-eqz p1, :cond_1

    invoke-direct {p0, v0}, LK0/o;->b(Ljava/util/List;)V

    :cond_1
    return-object v0
.end method

.method public final a()LK0/o;
    .locals 5

    new-instance v0, LK0/o;

    iget-object v1, p0, LK0/o;->a:Landroidx/compose/ui/d$c;

    iget-object v2, p0, LK0/o;->c:LF0/J;

    iget-object v3, p0, LK0/o;->d:LK0/k;

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2, v3}, LK0/o;-><init>(Landroidx/compose/ui/d$c;ZLF0/J;LK0/k;)V

    return-object v0
.end method

.method public final e()LF0/d0;
    .locals 2

    .prologue
    iget-boolean v0, p0, LK0/o;->e:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LK0/o;->r()LK0/o;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LK0/o;->e()LF0/d0;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, LK0/o;->c:LF0/J;

    invoke-static {v0}, LK0/p;->g(LF0/J;)LF0/z0;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, LK0/o;->a:Landroidx/compose/ui/d$c;

    :goto_1
    const/16 v1, 0x8

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    invoke-static {v0, v1}, LF0/k;->h(LF0/j;I)LF0/d0;

    move-result-object v0

    return-object v0
.end method

.method public final h()Ln0/i;
    .locals 5

    .prologue
    invoke-virtual {p0}, LK0/o;->r()LK0/o;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ln0/i;->e:Ln0/i$a;

    invoke-virtual {v0}, Ln0/i$a;->a()Ln0/i;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, LK0/o;->e()LF0/d0;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LF0/d0;->K()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v1}, LF0/d0;->m1()LD0/t;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v0, v0, LK0/o;->a:Landroidx/compose/ui/d$c;

    const/16 v2, 0x8

    invoke-static {v2}, LF0/f0;->a(I)I

    move-result v2

    invoke-static {v0, v2}, LF0/k;->h(LF0/j;I)LF0/d0;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v1, v2, v4, v3}, LD0/s;->a(LD0/t;LD0/t;ZILjava/lang/Object;)Ln0/i;

    move-result-object v0

    return-object v0

    :cond_2
    sget-object v0, Ln0/i;->e:Ln0/i$a;

    invoke-virtual {v0}, Ln0/i$a;->a()Ln0/i;

    move-result-object v0

    return-object v0
.end method

.method public final i()Ln0/i;
    .locals 2

    .prologue
    invoke-virtual {p0}, LK0/o;->e()LF0/d0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF0/d0;->K()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, LD0/u;->b(LD0/t;)Ln0/i;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    sget-object v0, Ln0/i;->e:Ln0/i$a;

    invoke-virtual {v0}, Ln0/i$a;->a()Ln0/i;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public final j()Ln0/i;
    .locals 2

    .prologue
    invoke-virtual {p0}, LK0/o;->e()LF0/d0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF0/d0;->K()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, LD0/u;->c(LD0/t;)Ln0/i;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    sget-object v0, Ln0/i;->e:Ln0/i$a;

    invoke-virtual {v0}, Ln0/i$a;->a()Ln0/i;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public final k()Ljava/util/List;
    .locals 6

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LK0/o;->m(LK0/o;ZZZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final l(ZZZ)Ljava/util/List;
    .locals 0

    .prologue
    if-nez p1, :cond_0

    iget-object p1, p0, LK0/o;->d:LK0/k;

    invoke-virtual {p1}, LK0/k;->E()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0}, LK0/o;->y()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p0, p2, p1, p2}, LK0/o;->g(LK0/o;Ljava/util/List;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p0, p2, p3}, LK0/o;->C(ZZ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final n()LK0/k;
    .locals 1

    .prologue
    invoke-direct {p0}, LK0/o;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LK0/o;->d:LK0/k;

    invoke-virtual {v0}, LK0/k;->o()LK0/k;

    move-result-object v0

    invoke-direct {p0, v0}, LK0/o;->B(LK0/k;)V

    return-object v0

    :cond_0
    iget-object v0, p0, LK0/o;->d:LK0/k;

    return-object v0
.end method

.method public final o()I
    .locals 1

    iget v0, p0, LK0/o;->g:I

    return v0
.end method

.method public final p()LD0/x;
    .locals 1

    iget-object v0, p0, LK0/o;->c:LF0/J;

    return-object v0
.end method

.method public final q()LF0/J;
    .locals 1

    iget-object v0, p0, LK0/o;->c:LF0/J;

    return-object v0
.end method

.method public final r()LK0/o;
    .locals 3

    .prologue
    iget-object v0, p0, LK0/o;->f:LK0/o;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-boolean v0, p0, LK0/o;->b:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, LK0/o;->c:LF0/J;

    sget-object v2, LK0/o$e;->D:LK0/o$e;

    invoke-static {v0, v2}, LK0/p;->f(LF0/J;Lx7/l;)LF0/J;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_2

    iget-object v0, p0, LK0/o;->c:LF0/J;

    sget-object v2, LK0/o$f;->D:LK0/o$f;

    invoke-static {v0, v2}, LK0/p;->f(LF0/J;Lx7/l;)LF0/J;

    move-result-object v0

    :cond_2
    if-nez v0, :cond_3

    return-object v1

    :cond_3
    iget-boolean v1, p0, LK0/o;->b:Z

    invoke-static {v0, v1}, LK0/p;->a(LF0/J;Z)LK0/o;

    move-result-object v0

    return-object v0
.end method

.method public final s()J
    .locals 2

    .prologue
    invoke-virtual {p0}, LK0/o;->e()LF0/d0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF0/d0;->K()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, LD0/u;->e(LD0/t;)J

    move-result-wide v0

    goto :goto_1

    :cond_1
    sget-object v0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v0}, Ln0/g$a;->c()J

    move-result-wide v0

    :goto_1
    return-wide v0
.end method

.method public final t()Ljava/util/List;
    .locals 6

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LK0/o;->m(LK0/o;ZZZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final u()J
    .locals 2

    .prologue
    invoke-virtual {p0}, LK0/o;->e()LF0/d0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/d0;->a()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object v0, LY0/t;->b:LY0/t$a;

    invoke-virtual {v0}, LY0/t$a;->a()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final v()Ln0/i;
    .locals 2

    .prologue
    iget-object v0, p0, LK0/o;->d:LK0/k;

    invoke-virtual {v0}, LK0/k;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LK0/o;->c:LF0/J;

    invoke-static {v0}, LK0/p;->g(LF0/J;)LF0/z0;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LK0/o;->a:Landroidx/compose/ui/d$c;

    :goto_0
    invoke-interface {v0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    iget-object v1, p0, LK0/o;->d:LK0/k;

    invoke-static {v1}, LF0/A0;->a(LK0/k;)Z

    move-result v1

    invoke-static {v0, v1}, LF0/A0;->c(Landroidx/compose/ui/d$c;Z)Ln0/i;

    move-result-object v0

    return-object v0
.end method

.method public final w()LK0/k;
    .locals 1

    iget-object v0, p0, LK0/o;->d:LK0/k;

    return-object v0
.end method

.method public final x()Z
    .locals 1

    iget-boolean v0, p0, LK0/o;->e:Z

    return v0
.end method

.method public final z()Z
    .locals 1

    .prologue
    invoke-virtual {p0}, LK0/o;->e()LF0/d0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/d0;->A2()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
