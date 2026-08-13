.class final Lz0/X$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/c;
.implements LY0/e;
.implements Lm7/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz0/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final C:Lm7/e;

.field private final synthetic D:Lz0/X;

.field private E:LW8/l;

.field private F:Lz0/r;

.field private final G:Lm7/i;

.field final synthetic H:Lz0/X;


# direct methods
.method public constructor <init>(Lz0/X;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lz0/X$a;->H:Lz0/X;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lz0/X$a;->C:Lm7/e;

    iput-object p1, p0, Lz0/X$a;->D:Lz0/X;

    sget-object p1, Lz0/r;->D:Lz0/r;

    iput-object p1, p0, Lz0/X$a;->F:Lz0/r;

    sget-object p1, Lm7/j;->C:Lm7/j;

    iput-object p1, p0, Lz0/X$a;->G:Lm7/i;

    return-void
.end method

.method public static final synthetic H(Lz0/X$a;Lz0/r;)V
    .locals 0

    iput-object p1, p0, Lz0/X$a;->F:Lz0/r;

    return-void
.end method

.method public static final synthetic K(Lz0/X$a;LW8/l;)V
    .locals 0

    iput-object p1, p0, Lz0/X$a;->E:LW8/l;

    return-void
.end method

.method public static final synthetic y(Lz0/X$a;)LW8/l;
    .locals 0

    iget-object p0, p0, Lz0/X$a;->E:LW8/l;

    return-object p0
.end method


# virtual methods
.method public B0(F)F
    .locals 1

    iget-object v0, p0, Lz0/X$a;->D:Lz0/X;

    invoke-virtual {v0, p1}, Lz0/X;->B0(F)F

    move-result p1

    return p1
.end method

.method public G0(JLx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 10

    .prologue
    instance-of v0, p4, Lz0/X$a$a;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lz0/X$a$a;

    iget v1, v0, Lz0/X$a$a;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lz0/X$a$a;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lz0/X$a$a;

    invoke-direct {v0, p0, p4}, Lz0/X$a$a;-><init>(Lz0/X$a;Lm7/e;)V

    :goto_0
    iget-object p4, v0, Lz0/X$a$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lz0/X$a$a;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lz0/X$a$a;->F:Ljava/lang/Object;

    check-cast p1, LW8/z0;

    :try_start_0
    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    const-wide/16 v4, 0x0

    cmp-long p4, p1, v4

    if-gtz p4, :cond_3

    iget-object p4, p0, Lz0/X$a;->E:LW8/l;

    if-eqz p4, :cond_3

    sget-object v2, Li7/w;->D:Li7/w$a;

    new-instance v2, Lz0/s;

    invoke-direct {v2, p1, p2}, Lz0/s;-><init>(J)V

    invoke-static {v2}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p4, v2}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_3
    iget-object p4, p0, Lz0/X$a;->H:Lz0/X;

    invoke-virtual {p4}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v4

    new-instance v7, Lz0/X$a$b;

    const/4 p4, 0x0

    invoke-direct {v7, p1, p2, p0, p4}, Lz0/X$a$b;-><init>(JLz0/X$a;Lm7/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object p1

    :try_start_1
    iput-object p1, v0, Lz0/X$a$a;->F:Ljava/lang/Object;

    iput v3, v0, Lz0/X$a$a;->I:I

    invoke-interface {p3, p0, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p4, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    sget-object p2, Lz0/d;->C:Lz0/d;

    invoke-interface {p1, p2}, LW8/z0;->o(Ljava/util/concurrent/CancellationException;)V

    return-object p4

    :goto_2
    sget-object p3, Lz0/d;->C:Lz0/d;

    invoke-interface {p1, p3}, LW8/z0;->o(Ljava/util/concurrent/CancellationException;)V

    throw p2
.end method

.method public H0()J
    .locals 2

    iget-object v0, p0, Lz0/X$a;->H:Lz0/X;

    invoke-virtual {v0}, Lz0/X;->H0()J

    move-result-wide v0

    return-wide v0
.end method

.method public K0(J)I
    .locals 1

    iget-object v0, p0, Lz0/X$a;->D:Lz0/X;

    invoke-virtual {v0, p1, p2}, Lz0/X;->K0(J)I

    move-result p1

    return p1
.end method

.method public L()Lz0/p;
    .locals 1

    iget-object v0, p0, Lz0/X$a;->H:Lz0/X;

    invoke-static {v0}, Lz0/X;->U1(Lz0/X;)Lz0/p;

    move-result-object v0

    return-object v0
.end method

.method public final M(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lz0/X$a;->E:LW8/l;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, LW8/l;->k(Ljava/lang/Throwable;)Z

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lz0/X$a;->E:LW8/l;

    return-void
.end method

.method public final N(Lz0/p;Lz0/r;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lz0/X$a;->F:Lz0/r;

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Lz0/X$a;->E:LW8/l;

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lz0/X$a;->E:LW8/l;

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public O(F)J
    .locals 2

    iget-object v0, p0, Lz0/X$a;->D:Lz0/X;

    invoke-virtual {v0, p1}, Lz0/X;->O(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public P(J)J
    .locals 1

    iget-object v0, p0, Lz0/X$a;->D:Lz0/X;

    invoke-virtual {v0, p1, p2}, Lz0/X;->P(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public P0(JLx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p4, Lz0/X$a$c;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lz0/X$a$c;

    iget v1, v0, Lz0/X$a$c;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lz0/X$a$c;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lz0/X$a$c;

    invoke-direct {v0, p0, p4}, Lz0/X$a$c;-><init>(Lz0/X$a;Lm7/e;)V

    :goto_0
    iget-object p4, v0, Lz0/X$a$c;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lz0/X$a$c;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lz0/s; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_1
    iput v3, v0, Lz0/X$a$c;->H:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lz0/X$a;->G0(JLx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p4
    :try_end_1
    .catch Lz0/s; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p4, v1, :cond_3

    return-object v1

    :catch_0
    const/4 p4, 0x0

    :cond_3
    :goto_1
    return-object p4
.end method

.method public S0(F)I
    .locals 1

    iget-object v0, p0, Lz0/X$a;->D:Lz0/X;

    invoke-virtual {v0, p1}, Lz0/X;->S0(F)I

    move-result p1

    return p1
.end method

.method public X(J)F
    .locals 1

    iget-object v0, p0, Lz0/X$a;->D:Lz0/X;

    invoke-virtual {v0, p1, p2}, Lz0/X;->X(J)F

    move-result p1

    return p1
.end method

.method public X0(Lz0/r;Lm7/e;)Ljava/lang/Object;
    .locals 3

    .prologue
    new-instance v0, LW8/n;

    invoke-static {p2}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v0}, LW8/n;->E()V

    invoke-static {p0, p1}, Lz0/X$a;->H(Lz0/X$a;Lz0/r;)V

    invoke-static {p0, v0}, Lz0/X$a;->K(Lz0/X$a;LW8/l;)V

    invoke-virtual {v0}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lo7/h;->c(Lm7/e;)V

    :cond_0
    return-object p1
.end method

.method public a()J
    .locals 2

    iget-object v0, p0, Lz0/X$a;->H:Lz0/X;

    invoke-static {v0}, Lz0/X;->T1(Lz0/X;)J

    move-result-wide v0

    return-wide v0
.end method

.method public b1(J)J
    .locals 1

    iget-object v0, p0, Lz0/X$a;->D:Lz0/X;

    invoke-virtual {v0, p1, p2}, Lz0/X;->b1(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public g1(J)F
    .locals 1

    iget-object v0, p0, Lz0/X$a;->D:Lz0/X;

    invoke-virtual {v0, p1, p2}, Lz0/X;->g1(J)F

    move-result p1

    return p1
.end method

.method public getContext()Lm7/i;
    .locals 1

    iget-object v0, p0, Lz0/X$a;->G:Lm7/i;

    return-object v0
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, Lz0/X$a;->D:Lz0/X;

    invoke-virtual {v0}, Lz0/X;->getDensity()F

    move-result v0

    return v0
.end method

.method public getViewConfiguration()Landroidx/compose/ui/platform/A1;
    .locals 1

    iget-object v0, p0, Lz0/X$a;->H:Lz0/X;

    invoke-virtual {v0}, Lz0/X;->getViewConfiguration()Landroidx/compose/ui/platform/A1;

    move-result-object v0

    return-object v0
.end method

.method public k0(F)J
    .locals 2

    iget-object v0, p0, Lz0/X$a;->D:Lz0/X;

    invoke-virtual {v0, p1}, Lz0/X;->k0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public o0(I)F
    .locals 1

    iget-object v0, p0, Lz0/X$a;->D:Lz0/X;

    invoke-virtual {v0, p1}, Lz0/X;->o0(I)F

    move-result p1

    return p1
.end method

.method public q0(F)F
    .locals 1

    iget-object v0, p0, Lz0/X$a;->D:Lz0/X;

    invoke-virtual {v0, p1}, Lz0/X;->q0(F)F

    move-result p1

    return p1
.end method

.method public t(Ljava/lang/Object;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lz0/X$a;->H:Lz0/X;

    invoke-static {v0}, Lz0/X;->V1(Lz0/X;)LX/b;

    move-result-object v0

    iget-object v1, p0, Lz0/X$a;->H:Lz0/X;

    monitor-enter v0

    :try_start_0
    invoke-static {v1}, Lz0/X;->V1(Lz0/X;)LX/b;

    move-result-object v1

    invoke-virtual {v1, p0}, LX/b;->A(Ljava/lang/Object;)Z

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Lz0/X$a;->C:Lm7/e;

    invoke-interface {v0, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public v0()F
    .locals 1

    iget-object v0, p0, Lz0/X$a;->D:Lz0/X;

    invoke-virtual {v0}, Lz0/X;->v0()F

    move-result v0

    return v0
.end method
