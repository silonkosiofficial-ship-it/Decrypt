.class public final Lz0/X;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements Lz0/W;
.implements Lz0/K;
.implements LY0/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz0/X$a;,
        Lz0/X$b;
    }
.end annotation


# instance fields
.field private P:Ljava/lang/Object;

.field private Q:Ljava/lang/Object;

.field private R:[Ljava/lang/Object;

.field private S:Lx7/p;

.field private T:LW8/z0;

.field private U:Lz0/p;

.field private final V:LX/b;

.field private final W:LX/b;

.field private X:Lz0/p;

.field private Y:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lx7/p;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Lz0/X;->P:Ljava/lang/Object;

    iput-object p2, p0, Lz0/X;->Q:Ljava/lang/Object;

    iput-object p3, p0, Lz0/X;->R:[Ljava/lang/Object;

    iput-object p4, p0, Lz0/X;->S:Lx7/p;

    invoke-static {}, Lz0/U;->b()Lz0/p;

    move-result-object p1

    iput-object p1, p0, Lz0/X;->U:Lz0/p;

    new-instance p1, LX/b;

    const/16 p2, 0x10

    new-array p3, p2, [Lz0/X$a;

    const/4 p4, 0x0

    invoke-direct {p1, p3, p4}, LX/b;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, Lz0/X;->V:LX/b;

    new-instance p1, LX/b;

    new-array p2, p2, [Lz0/X$a;

    invoke-direct {p1, p2, p4}, LX/b;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, Lz0/X;->W:LX/b;

    sget-object p1, LY0/t;->b:LY0/t$a;

    invoke-virtual {p1}, LY0/t$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lz0/X;->Y:J

    return-void
.end method

.method public static final synthetic T1(Lz0/X;)J
    .locals 2

    iget-wide v0, p0, Lz0/X;->Y:J

    return-wide v0
.end method

.method public static final synthetic U1(Lz0/X;)Lz0/p;
    .locals 0

    iget-object p0, p0, Lz0/X;->U:Lz0/p;

    return-object p0
.end method

.method public static final synthetic V1(Lz0/X;)LX/b;
    .locals 0

    iget-object p0, p0, Lz0/X;->V:LX/b;

    return-object p0
.end method

.method private final W1(Lz0/p;Lz0/r;)V
    .locals 4

    .prologue
    iget-object v0, p0, Lz0/X;->V:LX/b;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz0/X;->W:LX/b;

    iget-object v2, p0, Lz0/X;->V:LX/b;

    invoke-virtual {v1}, LX/b;->t()I

    move-result v3

    invoke-virtual {v1, v3, v2}, LX/b;->e(ILX/b;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    :try_start_1
    sget-object v0, Lz0/X$b;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz0/X;->W:LX/b;

    invoke-virtual {v0}, LX/b;->t()I

    move-result v2

    if-lez v2, :cond_4

    sub-int/2addr v2, v1

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    :cond_1
    aget-object v1, v0, v2

    check-cast v1, Lz0/X$a;

    invoke-virtual {v1, p1, p2}, Lz0/X$a;->N(Lz0/p;Lz0/r;)V

    add-int/lit8 v2, v2, -0x1

    if-gez v2, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lz0/X;->W:LX/b;

    invoke-virtual {v0}, LX/b;->t()I

    move-result v1

    if-lez v1, :cond_4

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_3
    aget-object v3, v0, v2

    check-cast v3, Lz0/X$a;

    invoke-virtual {v3, p1, p2}, Lz0/X$a;->N(Lz0/p;Lz0/r;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_3

    :cond_4
    :goto_0
    iget-object p1, p0, Lz0/X;->W:LX/b;

    invoke-virtual {p1}, LX/b;->j()V

    return-void

    :goto_1
    iget-object p2, p0, Lz0/X;->W:LX/b;

    invoke-virtual {p2}, LX/b;->j()V

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method


# virtual methods
.method public synthetic B0(F)F
    .locals 0

    invoke-static {p0, p1}, LY0/d;->g(LY0/e;F)F

    move-result p1

    return p1
.end method

.method public E1()V
    .locals 0

    invoke-virtual {p0}, Lz0/X;->o1()V

    invoke-super {p0}, Landroidx/compose/ui/d$c;->E1()V

    return-void
.end method

.method public H0()J
    .locals 7

    invoke-virtual {p0}, Lz0/X;->getViewConfiguration()Landroidx/compose/ui/platform/A1;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/platform/A1;->e()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lz0/X;->b1(J)J

    move-result-wide v0

    invoke-virtual {p0}, Lz0/X;->a()J

    move-result-wide v2

    invoke-static {v0, v1}, Ln0/m;->i(J)F

    move-result v4

    invoke-static {v2, v3}, LY0/t;->g(J)I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    const/4 v5, 0x0

    invoke-static {v5, v4}, Ljava/lang/Math;->max(FF)F

    move-result v4

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v4, v6

    invoke-static {v0, v1}, Ln0/m;->g(J)F

    move-result v0

    invoke-static {v2, v3}, LY0/t;->f(J)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    invoke-static {v5, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    div-float/2addr v0, v6

    invoke-static {v4, v0}, Ln0/n;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic K0(J)I
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->a(LY0/e;J)I

    move-result p1

    return p1
.end method

.method public synthetic O(F)J
    .locals 2

    invoke-static {p0, p1}, LY0/m;->b(LY0/n;F)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic P(J)J
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->e(LY0/e;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public synthetic S0(F)I
    .locals 0

    invoke-static {p0, p1}, LY0/d;->b(LY0/e;F)I

    move-result p1

    return p1
.end method

.method public V(Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    new-instance v0, LW8/n;

    invoke-static {p2}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v0}, LW8/n;->E()V

    new-instance v1, Lz0/X$a;

    invoke-direct {v1, p0, v0}, Lz0/X$a;-><init>(Lz0/X;Lm7/e;)V

    invoke-static {p0}, Lz0/X;->V1(Lz0/X;)LX/b;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    invoke-static {p0}, Lz0/X;->V1(Lz0/X;)LX/b;

    move-result-object v3

    invoke-virtual {v3, v1}, LX/b;->d(Ljava/lang/Object;)Z

    invoke-static {p1, v1, v1}, Lm7/g;->a(Lx7/p;Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    sget-object v3, Li7/w;->D:Li7/w$a;

    sget-object v3, Li7/M;->a:Li7/M;

    invoke-static {v3}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1, v3}, Lm7/e;->t(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    new-instance p1, Lz0/X$c;

    invoke-direct {p1, v1}, Lz0/X$c;-><init>(Lz0/X$a;)V

    invoke-interface {v0, p1}, LW8/l;->G(Lx7/l;)V

    invoke-virtual {v0}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lo7/h;->c(Lm7/e;)V

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1
.end method

.method public synthetic X(J)F
    .locals 0

    invoke-static {p0, p1, p2}, LY0/m;->a(LY0/n;J)F

    move-result p1

    return p1
.end method

.method public X1()Lx7/p;
    .locals 1

    iget-object v0, p0, Lz0/X;->S:Lx7/p;

    return-object v0
.end method

.method public synthetic Y0()Z
    .locals 1

    invoke-static {p0}, LF0/u0;->d(LF0/v0;)Z

    move-result v0

    return v0
.end method

.method public final Y1(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lx7/p;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lz0/X;->P:Ljava/lang/Object;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iput-object p1, p0, Lz0/X;->P:Ljava/lang/Object;

    iget-object p1, p0, Lz0/X;->Q:Ljava/lang/Object;

    invoke-static {p1, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    move v0, v1

    :cond_0
    iput-object p2, p0, Lz0/X;->Q:Ljava/lang/Object;

    iget-object p1, p0, Lz0/X;->R:[Ljava/lang/Object;

    if-eqz p1, :cond_1

    if-nez p3, :cond_1

    move v0, v1

    :cond_1
    if-nez p1, :cond_2

    if-eqz p3, :cond_2

    move v0, v1

    :cond_2
    if-eqz p1, :cond_3

    if-eqz p3, :cond_3

    invoke-static {p3, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    move v1, v0

    :goto_0
    iput-object p3, p0, Lz0/X;->R:[Ljava/lang/Object;

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lz0/X;->o1()V

    :cond_4
    iput-object p4, p0, Lz0/X;->S:Lx7/p;

    return-void
.end method

.method public a()J
    .locals 2

    iget-wide v0, p0, Lz0/X;->Y:J

    return-wide v0
.end method

.method public synthetic b1(J)J
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->h(LY0/e;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public f1()V
    .locals 0

    invoke-virtual {p0}, Lz0/X;->o1()V

    return-void
.end method

.method public g0()V
    .locals 26

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, Lz0/X;->X:Lz0/p;

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v1}, Lz0/p;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_3

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lz0/B;

    invoke-virtual {v6}, Lz0/B;->i()Z

    move-result v6

    xor-int/lit8 v6, v6, 0x1

    if-nez v6, :cond_2

    invoke-virtual {v1}, Lz0/p;->c()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    :goto_1
    if-ge v4, v3, :cond_1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lz0/B;

    invoke-virtual {v5}, Lz0/B;->f()J

    move-result-wide v7

    invoke-virtual {v5}, Lz0/B;->h()J

    move-result-wide v11

    invoke-virtual {v5}, Lz0/B;->o()J

    move-result-wide v9

    invoke-virtual {v5}, Lz0/B;->j()F

    move-result v14

    invoke-virtual {v5}, Lz0/B;->h()J

    move-result-wide v17

    invoke-virtual {v5}, Lz0/B;->o()J

    move-result-wide v15

    invoke-virtual {v5}, Lz0/B;->i()Z

    move-result v19

    invoke-virtual {v5}, Lz0/B;->i()Z

    move-result v20

    new-instance v5, Lz0/B;

    move-object v6, v5

    const/16 v24, 0x600

    const/16 v25, 0x0

    const/4 v13, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    invoke-direct/range {v6 .. v25}, Lz0/B;-><init>(JJJZFJJZZIJILy7/k;)V

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    new-instance v1, Lz0/p;

    invoke-direct {v1, v2}, Lz0/p;-><init>(Ljava/util/List;)V

    iput-object v1, v0, Lz0/X;->U:Lz0/p;

    sget-object v2, Lz0/r;->C:Lz0/r;

    invoke-direct {v0, v1, v2}, Lz0/X;->W1(Lz0/p;Lz0/r;)V

    sget-object v2, Lz0/r;->D:Lz0/r;

    invoke-direct {v0, v1, v2}, Lz0/X;->W1(Lz0/p;Lz0/r;)V

    sget-object v2, Lz0/r;->E:Lz0/r;

    invoke-direct {v0, v1, v2}, Lz0/X;->W1(Lz0/p;Lz0/r;)V

    const/4 v1, 0x0

    iput-object v1, v0, Lz0/X;->X:Lz0/p;

    return-void

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public synthetic g1(J)F
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->f(LY0/e;J)F

    move-result p1

    return p1
.end method

.method public getDensity()F
    .locals 1

    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->K()LY0/e;

    move-result-object v0

    invoke-interface {v0}, LY0/e;->getDensity()F

    move-result v0

    return v0
.end method

.method public getViewConfiguration()Landroidx/compose/ui/platform/A1;
    .locals 1

    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->s0()Landroidx/compose/ui/platform/A1;

    move-result-object v0

    return-object v0
.end method

.method public synthetic k0(F)J
    .locals 2

    invoke-static {p0, p1}, LY0/d;->i(LY0/e;F)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic n0()Z
    .locals 1

    invoke-static {p0}, LF0/u0;->a(LF0/v0;)Z

    move-result v0

    return v0
.end method

.method public synthetic o0(I)F
    .locals 0

    invoke-static {p0, p1}, LY0/d;->d(LY0/e;I)F

    move-result p1

    return p1
.end method

.method public o1()V
    .locals 2

    .prologue
    iget-object v0, p0, Lz0/X;->T:LW8/z0;

    if-eqz v0, :cond_0

    new-instance v1, Lz0/J;

    invoke-direct {v1}, Lz0/J;-><init>()V

    invoke-interface {v0, v1}, LW8/z0;->o(Ljava/util/concurrent/CancellationException;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lz0/X;->T:LW8/z0;

    :cond_0
    return-void
.end method

.method public synthetic q0(F)F
    .locals 0

    invoke-static {p0, p1}, LY0/d;->c(LY0/e;F)F

    move-result p1

    return p1
.end method

.method public t0()V
    .locals 0

    invoke-virtual {p0}, Lz0/X;->o1()V

    return-void
.end method

.method public v0()F
    .locals 1

    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->K()LY0/e;

    move-result-object v0

    invoke-interface {v0}, LY0/n;->v0()F

    move-result v0

    return v0
.end method

.method public w0(Lz0/p;Lz0/r;J)V
    .locals 6

    .prologue
    iput-wide p3, p0, Lz0/X;->Y:J

    sget-object p3, Lz0/r;->C:Lz0/r;

    if-ne p2, p3, :cond_0

    iput-object p1, p0, Lz0/X;->U:Lz0/p;

    :cond_0
    iget-object p3, p0, Lz0/X;->T:LW8/z0;

    const/4 p4, 0x0

    if-nez p3, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v0

    sget-object v2, LW8/P;->F:LW8/P;

    new-instance v3, Lz0/X$d;

    invoke-direct {v3, p0, p4}, Lz0/X$d;-><init>(Lz0/X;Lm7/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object p3

    iput-object p3, p0, Lz0/X;->T:LW8/z0;

    :cond_1
    invoke-direct {p0, p1, p2}, Lz0/X;->W1(Lz0/p;Lz0/r;)V

    invoke-virtual {p1}, Lz0/p;->c()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x1

    if-ge v1, p3, :cond_3

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz0/B;

    invoke-static {v3}, Lz0/q;->d(Lz0/B;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    move v0, v2

    :goto_1
    xor-int/lit8 p2, v0, 0x1

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p4

    :goto_2
    iput-object p1, p0, Lz0/X;->X:Lz0/p;

    return-void
.end method
