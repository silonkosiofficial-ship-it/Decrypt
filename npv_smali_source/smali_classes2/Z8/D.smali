.class public LZ8/D;
.super La9/b;
.source "SourceFile"

# interfaces
.implements LZ8/x;
.implements LZ8/f;
.implements La9/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ8/D$a;,
        LZ8/D$b;
    }
.end annotation


# instance fields
.field private final G:I

.field private final H:I

.field private final I:LY8/d;

.field private J:[Ljava/lang/Object;

.field private K:J

.field private L:J

.field private M:I

.field private N:I


# direct methods
.method public constructor <init>(IILY8/d;)V
    .locals 0

    invoke-direct {p0}, La9/b;-><init>()V

    iput p1, p0, LZ8/D;->G:I

    iput p2, p0, LZ8/D;->H:I

    iput-object p3, p0, LZ8/D;->I:LY8/d;

    return-void
.end method

.method private final A(LZ8/F;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    new-instance v0, LW8/n;

    invoke-static {p2}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v0}, LW8/n;->E()V

    monitor-enter p0

    :try_start_0
    invoke-static {p0, p1}, LZ8/D;->z(LZ8/D;LZ8/F;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-gez v1, :cond_0

    iput-object v0, p1, LZ8/F;->b:Lm7/e;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    sget-object p1, Li7/w;->D:Li7/w$a;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    invoke-virtual {v0}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    invoke-static {p2}, Lo7/h;->c(Lm7/e;)V

    :cond_1
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method private final B(LZ8/D$a;)V
    .locals 4

    .prologue
    monitor-enter p0

    :try_start_0
    iget-wide v0, p1, LZ8/D$a;->D:J

    invoke-direct {p0}, LZ8/D;->N()J

    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, LZ8/D;->J:[Ljava/lang/Object;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-wide v1, p1, LZ8/D$a;->D:J

    invoke-static {v0, v1, v2}, LZ8/E;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eq v1, p1, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_2
    iget-wide v1, p1, LZ8/D$a;->D:J

    sget-object p1, LZ8/E;->a:Lb9/D;

    invoke-static {v0, v1, v2, p1}, LZ8/E;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-direct {p0}, LZ8/D;->C()V

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private final C()V
    .locals 5

    .prologue
    iget v0, p0, LZ8/D;->H:I

    if-nez v0, :cond_0

    iget v0, p0, LZ8/D;->N:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LZ8/D;->J:[Ljava/lang/Object;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    :goto_0
    iget v1, p0, LZ8/D;->N:I

    if-lez v1, :cond_1

    invoke-direct {p0}, LZ8/D;->N()J

    move-result-wide v1

    invoke-direct {p0}, LZ8/D;->S()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    invoke-static {v0, v1, v2}, LZ8/E;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LZ8/E;->a:Lb9/D;

    if-ne v1, v2, :cond_1

    iget v1, p0, LZ8/D;->N:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, LZ8/D;->N:I

    invoke-direct {p0}, LZ8/D;->N()J

    move-result-wide v1

    invoke-direct {p0}, LZ8/D;->S()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, LZ8/E;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method static synthetic D(LZ8/D;LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    instance-of v0, p2, LZ8/D$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LZ8/D$c;

    iget v1, v0, LZ8/D$c;->L:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LZ8/D$c;->L:I

    goto :goto_0

    :cond_0
    new-instance v0, LZ8/D$c;

    invoke-direct {v0, p0, p2}, LZ8/D$c;-><init>(LZ8/D;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LZ8/D$c;->J:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LZ8/D$c;->L:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LZ8/D$c;->I:Ljava/lang/Object;

    check-cast p0, LW8/z0;

    iget-object p1, v0, LZ8/D$c;->H:Ljava/lang/Object;

    check-cast p1, LZ8/F;

    iget-object v2, v0, LZ8/D$c;->G:Ljava/lang/Object;

    check-cast v2, LZ8/g;

    iget-object v5, v0, LZ8/D$c;->F:Ljava/lang/Object;

    check-cast v5, LZ8/D;

    :goto_1
    :try_start_0
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    goto/16 :goto_5

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, LZ8/D$c;->I:Ljava/lang/Object;

    check-cast p0, LW8/z0;

    iget-object p1, v0, LZ8/D$c;->H:Ljava/lang/Object;

    check-cast p1, LZ8/F;

    iget-object v2, v0, LZ8/D$c;->G:Ljava/lang/Object;

    check-cast v2, LZ8/g;

    iget-object v5, v0, LZ8/D$c;->F:Ljava/lang/Object;

    check-cast v5, LZ8/D;

    goto :goto_1

    :goto_2
    move-object p2, v2

    move-object v2, p0

    move-object p0, v5

    goto :goto_4

    :cond_3
    iget-object p0, v0, LZ8/D$c;->H:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LZ8/F;

    iget-object p0, v0, LZ8/D$c;->G:Ljava/lang/Object;

    check-cast p0, LZ8/g;

    iget-object v2, v0, LZ8/D$c;->F:Ljava/lang/Object;

    check-cast v2, LZ8/D;

    :try_start_1
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object p2, p0

    move-object p0, v2

    goto :goto_3

    :catchall_1
    move-exception p0

    move-object v5, v2

    goto/16 :goto_5

    :cond_4
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, La9/b;->h()La9/d;

    move-result-object p2

    check-cast p2, LZ8/F;

    :try_start_2
    instance-of v2, p1, LZ8/S;

    if-eqz v2, :cond_5

    move-object v2, p1

    check-cast v2, LZ8/S;

    iput-object p0, v0, LZ8/D$c;->F:Ljava/lang/Object;

    iput-object p1, v0, LZ8/D$c;->G:Ljava/lang/Object;

    iput-object p2, v0, LZ8/D$c;->H:Ljava/lang/Object;

    iput v5, v0, LZ8/D$c;->L:I

    invoke-virtual {v2, v0}, LZ8/S;->b(Lm7/e;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v2, v1, :cond_5

    return-object v1

    :catchall_2
    move-exception p1

    move-object v5, p0

    move-object p0, p1

    move-object p1, p2

    goto :goto_5

    :cond_5
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_3
    :try_start_3
    invoke-interface {v0}, Lm7/e;->getContext()Lm7/i;

    move-result-object v2

    sget-object v5, LW8/z0;->h:LW8/z0$b;

    invoke-interface {v2, v5}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v2

    check-cast v2, LW8/z0;

    :cond_6
    :goto_4
    invoke-direct {p0, p1}, LZ8/D;->X(LZ8/F;)Ljava/lang/Object;

    move-result-object v5

    sget-object v6, LZ8/E;->a:Lb9/D;

    if-ne v5, v6, :cond_7

    iput-object p0, v0, LZ8/D$c;->F:Ljava/lang/Object;

    iput-object p2, v0, LZ8/D$c;->G:Ljava/lang/Object;

    iput-object p1, v0, LZ8/D$c;->H:Ljava/lang/Object;

    iput-object v2, v0, LZ8/D$c;->I:Ljava/lang/Object;

    iput v4, v0, LZ8/D$c;->L:I

    invoke-direct {p0, p1, v0}, LZ8/D;->A(LZ8/F;Lm7/e;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_6

    return-object v1

    :catchall_3
    move-exception p2

    move-object v5, p0

    move-object p0, p2

    goto :goto_5

    :cond_7
    if-eqz v2, :cond_8

    invoke-static {v2}, LW8/C0;->k(LW8/z0;)V

    :cond_8
    iput-object p0, v0, LZ8/D$c;->F:Ljava/lang/Object;

    iput-object p2, v0, LZ8/D$c;->G:Ljava/lang/Object;

    iput-object p1, v0, LZ8/D$c;->H:Ljava/lang/Object;

    iput-object v2, v0, LZ8/D$c;->I:Ljava/lang/Object;

    iput v3, v0, LZ8/D$c;->L:I

    invoke-interface {p2, v5, v0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-ne v5, v1, :cond_6

    return-object v1

    :goto_5
    invoke-virtual {v5, p1}, La9/b;->k(La9/d;)V

    throw p0
.end method

.method private final E(J)V
    .locals 8

    .prologue
    invoke-static {p0}, La9/b;->e(La9/b;)I

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, La9/b;->f(La9/b;)[La9/d;

    move-result-object v0

    if-eqz v0, :cond_1

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-eqz v3, :cond_0

    check-cast v3, LZ8/F;

    iget-wide v4, v3, LZ8/F;->a:J

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-ltz v6, :cond_0

    cmp-long v4, v4, p1

    if-gez v4, :cond_0

    iput-wide p1, v3, LZ8/F;->a:J

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iput-wide p1, p0, LZ8/D;->L:J

    return-void
.end method

.method private final H()V
    .locals 4

    .prologue
    iget-object v0, p0, LZ8/D;->J:[Ljava/lang/Object;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0}, LZ8/D;->N()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, LZ8/E;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    iget v0, p0, LZ8/D;->M:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LZ8/D;->M:I

    invoke-direct {p0}, LZ8/D;->N()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iget-wide v2, p0, LZ8/D;->K:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_0

    iput-wide v0, p0, LZ8/D;->K:J

    :cond_0
    iget-wide v2, p0, LZ8/D;->L:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_1

    invoke-direct {p0, v0, v1}, LZ8/D;->E(J)V

    :cond_1
    return-void
.end method

.method static synthetic I(LZ8/D;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-virtual {p0, p1}, LZ8/D;->n(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0

    :cond_0
    invoke-direct {p0, p1, p2}, LZ8/D;->J(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private final J(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 10

    .prologue
    new-instance v6, LW8/n;

    invoke-static {p2}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v0

    const/4 v7, 0x1

    invoke-direct {v6, v0, v7}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v6}, LW8/n;->E()V

    sget-object v8, La9/c;->a:[Lm7/e;

    monitor-enter p0

    :try_start_0
    invoke-static {p0, p1}, LZ8/D;->y(LZ8/D;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Li7/w;->D:Li7/w$a;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v6, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    invoke-static {p0, v8}, LZ8/D;->s(LZ8/D;[Lm7/e;)[Lm7/e;

    move-result-object p1

    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance v9, LZ8/D$a;

    invoke-static {p0}, LZ8/D;->u(LZ8/D;)J

    move-result-wide v0

    invoke-static {p0}, LZ8/D;->w(LZ8/D;)I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v2, v0

    move-object v0, v9

    move-object v1, p0

    move-object v4, p1

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, LZ8/D$a;-><init>(LZ8/D;JLjava/lang/Object;Lm7/e;)V

    invoke-static {p0, v9}, LZ8/D;->r(LZ8/D;Ljava/lang/Object;)V

    invoke-static {p0}, LZ8/D;->v(LZ8/D;)I

    move-result p1

    add-int/2addr p1, v7

    invoke-static {p0, p1}, LZ8/D;->x(LZ8/D;I)V

    invoke-static {p0}, LZ8/D;->t(LZ8/D;)I

    move-result p1

    if-nez p1, :cond_1

    invoke-static {p0, v8}, LZ8/D;->s(LZ8/D;[Lm7/e;)[Lm7/e;

    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    move-object p1, v8

    move-object v0, v9

    :goto_0
    monitor-exit p0

    if-eqz v0, :cond_2

    invoke-static {v6, v0}, LW8/p;->a(LW8/l;LW8/f0;)V

    :cond_2
    array-length v0, p1

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_4

    aget-object v2, p1, v1

    if-eqz v2, :cond_3

    sget-object v3, Li7/w;->D:Li7/w$a;

    sget-object v3, Li7/M;->a:Li7/M;

    invoke-static {v3}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_3
    add-int/2addr v1, v7

    goto :goto_1

    :cond_4
    invoke-virtual {v6}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_5

    invoke-static {p2}, Lo7/h;->c(Lm7/e;)V

    :cond_5
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_6

    return-object p1

    :cond_6
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method private final K(Ljava/lang/Object;)V
    .locals 6

    .prologue
    invoke-direct {p0}, LZ8/D;->S()I

    move-result v0

    iget-object v1, p0, LZ8/D;->J:[Ljava/lang/Object;

    const/4 v2, 0x2

    if-nez v1, :cond_0

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v1, v3, v2}, LZ8/D;->T([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    array-length v3, v1

    if-lt v0, v3, :cond_1

    array-length v3, v1

    mul-int/2addr v3, v2

    invoke-direct {p0, v1, v0, v3}, LZ8/D;->T([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-direct {p0}, LZ8/D;->N()J

    move-result-wide v2

    int-to-long v4, v0

    add-long/2addr v2, v4

    invoke-static {v1, v2, v3, p1}, LZ8/E;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method private final L([Lm7/e;)[Lm7/e;
    .locals 10

    .prologue
    array-length v0, p1

    invoke-static {p0}, La9/b;->e(La9/b;)I

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p0}, La9/b;->f(La9/b;)[La9/d;

    move-result-object v1

    if-eqz v1, :cond_3

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, v1, v3

    if-eqz v4, :cond_2

    check-cast v4, LZ8/F;

    iget-object v5, v4, LZ8/F;->b:Lm7/e;

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    invoke-direct {p0, v4}, LZ8/D;->W(LZ8/F;)J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v6, v6, v8

    if-ltz v6, :cond_2

    array-length v6, p1

    if-lt v0, v6, :cond_1

    array-length v6, p1

    const/4 v7, 0x2

    mul-int/2addr v6, v7

    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v6, "copyOf(...)"

    invoke-static {p1, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    move-object v6, p1

    check-cast v6, [Lm7/e;

    add-int/lit8 v7, v0, 0x1

    aput-object v5, v6, v0

    const/4 v0, 0x0

    iput-object v0, v4, LZ8/F;->b:Lm7/e;

    move v0, v7

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    check-cast p1, [Lm7/e;

    return-object p1
.end method

.method private final M()J
    .locals 4

    invoke-direct {p0}, LZ8/D;->N()J

    move-result-wide v0

    iget v2, p0, LZ8/D;->M:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method private final N()J
    .locals 4

    iget-wide v0, p0, LZ8/D;->L:J

    iget-wide v2, p0, LZ8/D;->K:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method private final P(J)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, LZ8/D;->J:[Ljava/lang/Object;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0, p1, p2}, LZ8/E;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, LZ8/D$a;

    if-eqz p2, :cond_0

    check-cast p1, LZ8/D$a;

    iget-object p1, p1, LZ8/D$a;->E:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method private final Q()J
    .locals 4

    invoke-direct {p0}, LZ8/D;->N()J

    move-result-wide v0

    iget v2, p0, LZ8/D;->M:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget v2, p0, LZ8/D;->N:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method private final R()I
    .locals 4

    invoke-direct {p0}, LZ8/D;->N()J

    move-result-wide v0

    iget v2, p0, LZ8/D;->M:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget-wide v2, p0, LZ8/D;->K:J

    sub-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method private final S()I
    .locals 2

    iget v0, p0, LZ8/D;->M:I

    iget v1, p0, LZ8/D;->N:I

    add-int/2addr v0, v1

    return v0
.end method

.method private final T([Ljava/lang/Object;II)[Ljava/lang/Object;
    .locals 6

    .prologue
    if-lez p3, :cond_2

    new-array p3, p3, [Ljava/lang/Object;

    iput-object p3, p0, LZ8/D;->J:[Ljava/lang/Object;

    if-nez p1, :cond_0

    return-object p3

    :cond_0
    invoke-direct {p0}, LZ8/D;->N()J

    move-result-wide v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p2, :cond_1

    int-to-long v3, v2

    add-long/2addr v3, v0

    invoke-static {p1, v3, v4}, LZ8/E;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-static {p3, v3, v4, v5}, LZ8/E;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object p3

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Buffer size overflow"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final U(Ljava/lang/Object;)Z
    .locals 14

    .prologue
    invoke-virtual {p0}, La9/b;->l()I

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, LZ8/D;->V(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    iget v0, p0, LZ8/D;->M:I

    iget v1, p0, LZ8/D;->H:I

    const/4 v2, 0x1

    if-lt v0, v1, :cond_4

    iget-wide v0, p0, LZ8/D;->L:J

    iget-wide v3, p0, LZ8/D;->K:J

    cmp-long v0, v0, v3

    if-gtz v0, :cond_4

    iget-object v0, p0, LZ8/D;->I:LY8/d;

    sget-object v1, LZ8/D$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v2, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_2
    return v2

    :cond_3
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_0
    invoke-direct {p0, p1}, LZ8/D;->K(Ljava/lang/Object;)V

    iget p1, p0, LZ8/D;->M:I

    add-int/2addr p1, v2

    iput p1, p0, LZ8/D;->M:I

    iget v0, p0, LZ8/D;->H:I

    if-le p1, v0, :cond_5

    invoke-direct {p0}, LZ8/D;->H()V

    :cond_5
    invoke-direct {p0}, LZ8/D;->R()I

    move-result p1

    iget v0, p0, LZ8/D;->G:I

    if-le p1, v0, :cond_6

    iget-wide v0, p0, LZ8/D;->K:J

    const-wide/16 v3, 0x1

    add-long v6, v0, v3

    iget-wide v8, p0, LZ8/D;->L:J

    invoke-direct {p0}, LZ8/D;->M()J

    move-result-wide v10

    invoke-direct {p0}, LZ8/D;->Q()J

    move-result-wide v12

    move-object v5, p0

    invoke-direct/range {v5 .. v13}, LZ8/D;->Y(JJJJ)V

    :cond_6
    return v2
.end method

.method private final V(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    iget v0, p0, LZ8/D;->G:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0, p1}, LZ8/D;->K(Ljava/lang/Object;)V

    iget p1, p0, LZ8/D;->M:I

    add-int/2addr p1, v1

    iput p1, p0, LZ8/D;->M:I

    iget v0, p0, LZ8/D;->G:I

    if-le p1, v0, :cond_1

    invoke-direct {p0}, LZ8/D;->H()V

    :cond_1
    invoke-direct {p0}, LZ8/D;->N()J

    move-result-wide v2

    iget p1, p0, LZ8/D;->M:I

    int-to-long v4, p1

    add-long/2addr v2, v4

    iput-wide v2, p0, LZ8/D;->L:J

    return v1
.end method

.method private final W(LZ8/F;)J
    .locals 6

    .prologue
    iget-wide v0, p1, LZ8/F;->a:J

    invoke-direct {p0}, LZ8/D;->M()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    return-wide v0

    :cond_0
    iget p1, p0, LZ8/D;->H:I

    const-wide/16 v2, -0x1

    if-lez p1, :cond_1

    return-wide v2

    :cond_1
    invoke-direct {p0}, LZ8/D;->N()J

    move-result-wide v4

    cmp-long p1, v0, v4

    if-lez p1, :cond_2

    return-wide v2

    :cond_2
    iget p1, p0, LZ8/D;->N:I

    if-nez p1, :cond_3

    return-wide v2

    :cond_3
    return-wide v0
.end method

.method private final X(LZ8/F;)Ljava/lang/Object;
    .locals 8

    .prologue
    sget-object v0, La9/c;->a:[Lm7/e;

    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, LZ8/D;->W(LZ8/F;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-gez v3, :cond_0

    sget-object p1, LZ8/E;->a:Lb9/D;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    iget-wide v3, p1, LZ8/F;->a:J

    invoke-direct {p0, v1, v2}, LZ8/D;->P(J)Ljava/lang/Object;

    move-result-object v0

    const-wide/16 v5, 0x1

    add-long/2addr v1, v5

    iput-wide v1, p1, LZ8/F;->a:J

    invoke-virtual {p0, v3, v4}, LZ8/D;->Z(J)[Lm7/e;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v7, v0

    move-object v0, p1

    move-object p1, v7

    :goto_0
    monitor-exit p0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    if-eqz v3, :cond_1

    sget-object v4, Li7/w;->D:Li7/w$a;

    sget-object v4, Li7/M;->a:Li7/M;

    invoke-static {v4}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-object p1

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method private final Y(JJJJ)V
    .locals 6

    .prologue
    invoke-static {p3, p4, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-direct {p0}, LZ8/D;->N()J

    move-result-wide v2

    :goto_0
    cmp-long v4, v2, v0

    if-gez v4, :cond_0

    iget-object v4, p0, LZ8/D;->J:[Ljava/lang/Object;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v5, 0x0

    invoke-static {v4, v2, v3, v5}, LZ8/E;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    goto :goto_0

    :cond_0
    iput-wide p1, p0, LZ8/D;->K:J

    iput-wide p3, p0, LZ8/D;->L:J

    sub-long p1, p5, v0

    long-to-int p1, p1

    iput p1, p0, LZ8/D;->M:I

    sub-long/2addr p7, p5

    long-to-int p1, p7

    iput p1, p0, LZ8/D;->N:I

    return-void
.end method

.method public static final synthetic q(LZ8/D;LZ8/D$a;)V
    .locals 0

    invoke-direct {p0, p1}, LZ8/D;->B(LZ8/D$a;)V

    return-void
.end method

.method public static final synthetic r(LZ8/D;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, LZ8/D;->K(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic s(LZ8/D;[Lm7/e;)[Lm7/e;
    .locals 0

    invoke-direct {p0, p1}, LZ8/D;->L([Lm7/e;)[Lm7/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic t(LZ8/D;)I
    .locals 0

    iget p0, p0, LZ8/D;->H:I

    return p0
.end method

.method public static final synthetic u(LZ8/D;)J
    .locals 2

    invoke-direct {p0}, LZ8/D;->N()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic v(LZ8/D;)I
    .locals 0

    iget p0, p0, LZ8/D;->N:I

    return p0
.end method

.method public static final synthetic w(LZ8/D;)I
    .locals 0

    invoke-direct {p0}, LZ8/D;->S()I

    move-result p0

    return p0
.end method

.method public static final synthetic x(LZ8/D;I)V
    .locals 0

    iput p1, p0, LZ8/D;->N:I

    return-void
.end method

.method public static final synthetic y(LZ8/D;Ljava/lang/Object;)Z
    .locals 0

    invoke-direct {p0, p1}, LZ8/D;->U(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic z(LZ8/D;LZ8/F;)J
    .locals 0

    invoke-direct {p0, p1}, LZ8/D;->W(LZ8/F;)J

    move-result-wide p0

    return-wide p0
.end method


# virtual methods
.method protected F()LZ8/F;
    .locals 1

    new-instance v0, LZ8/F;

    invoke-direct {v0}, LZ8/F;-><init>()V

    return-object v0
.end method

.method protected G(I)[LZ8/F;
    .locals 0

    new-array p1, p1, [LZ8/F;

    return-object p1
.end method

.method protected final O()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, LZ8/D;->J:[Ljava/lang/Object;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-wide v1, p0, LZ8/D;->K:J

    invoke-direct {p0}, LZ8/D;->R()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    invoke-static {v0, v1, v2}, LZ8/E;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final Z(J)[Lm7/e;
    .locals 21

    .prologue
    move-object/from16 v9, p0

    iget-wide v0, v9, LZ8/D;->L:J

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    sget-object v0, La9/c;->a:[Lm7/e;

    return-object v0

    :cond_0
    invoke-direct/range {p0 .. p0}, LZ8/D;->N()J

    move-result-wide v0

    iget v2, v9, LZ8/D;->M:I

    int-to-long v2, v2

    add-long/2addr v2, v0

    iget v4, v9, LZ8/D;->H:I

    const-wide/16 v5, 0x1

    if-nez v4, :cond_1

    iget v4, v9, LZ8/D;->N:I

    if-lez v4, :cond_1

    add-long/2addr v2, v5

    :cond_1
    invoke-static/range {p0 .. p0}, La9/b;->e(La9/b;)I

    move-result v4

    if-eqz v4, :cond_3

    invoke-static/range {p0 .. p0}, La9/b;->f(La9/b;)[La9/d;

    move-result-object v4

    if-eqz v4, :cond_3

    array-length v7, v4

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_3

    aget-object v11, v4, v8

    if-eqz v11, :cond_2

    check-cast v11, LZ8/F;

    iget-wide v11, v11, LZ8/F;->a:J

    const-wide/16 v13, 0x0

    cmp-long v13, v11, v13

    if-ltz v13, :cond_2

    cmp-long v13, v11, v2

    if-gez v13, :cond_2

    move-wide v2, v11

    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_3
    iget-wide v7, v9, LZ8/D;->L:J

    cmp-long v4, v2, v7

    if-gtz v4, :cond_4

    sget-object v0, La9/c;->a:[Lm7/e;

    return-object v0

    :cond_4
    invoke-direct/range {p0 .. p0}, LZ8/D;->M()J

    move-result-wide v7

    invoke-virtual/range {p0 .. p0}, La9/b;->l()I

    move-result v4

    if-lez v4, :cond_5

    sub-long v11, v7, v2

    long-to-int v4, v11

    iget v11, v9, LZ8/D;->N:I

    iget v12, v9, LZ8/D;->H:I

    sub-int/2addr v12, v4

    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    move-result v4

    goto :goto_1

    :cond_5
    iget v4, v9, LZ8/D;->N:I

    :goto_1
    sget-object v11, La9/c;->a:[Lm7/e;

    iget v12, v9, LZ8/D;->N:I

    int-to-long v12, v12

    add-long/2addr v12, v7

    if-lez v4, :cond_9

    new-array v11, v4, [Lm7/e;

    iget-object v14, v9, LZ8/D;->J:[Ljava/lang/Object;

    invoke-static {v14}, Ly7/t;->c(Ljava/lang/Object;)V

    move-wide v5, v7

    const/4 v15, 0x0

    :goto_2
    cmp-long v16, v7, v12

    if-gez v16, :cond_8

    invoke-static {v14, v7, v8}, LZ8/E;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v10

    move-wide/from16 v17, v2

    sget-object v2, LZ8/E;->a:Lb9/D;

    if-eq v10, v2, :cond_7

    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter"

    invoke-static {v10, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, LZ8/D$a;

    add-int/lit8 v3, v15, 0x1

    move-wide/from16 v19, v12

    iget-object v12, v10, LZ8/D$a;->F:Lm7/e;

    aput-object v12, v11, v15

    invoke-static {v14, v7, v8, v2}, LZ8/E;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    iget-object v2, v10, LZ8/D$a;->E:Ljava/lang/Object;

    invoke-static {v14, v5, v6, v2}, LZ8/E;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    const-wide/16 v12, 0x1

    add-long/2addr v5, v12

    if-ge v3, v4, :cond_6

    move v15, v3

    goto :goto_4

    :cond_6
    :goto_3
    move-wide v7, v5

    goto :goto_5

    :cond_7
    move-wide/from16 v19, v12

    const-wide/16 v12, 0x1

    :goto_4
    add-long/2addr v7, v12

    move-wide/from16 v2, v17

    move-wide/from16 v12, v19

    goto :goto_2

    :cond_8
    move-wide/from16 v17, v2

    move-wide/from16 v19, v12

    goto :goto_3

    :cond_9
    move-wide/from16 v17, v2

    move-wide/from16 v19, v12

    :goto_5
    sub-long v0, v7, v0

    long-to-int v0, v0

    invoke-virtual/range {p0 .. p0}, La9/b;->l()I

    move-result v1

    if-nez v1, :cond_a

    move-wide v3, v7

    goto :goto_6

    :cond_a
    move-wide/from16 v3, v17

    :goto_6
    iget-wide v1, v9, LZ8/D;->K:J

    iget v5, v9, LZ8/D;->G:I

    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-long v5, v0

    sub-long v5, v7, v5

    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iget v2, v9, LZ8/D;->H:I

    if-nez v2, :cond_b

    cmp-long v2, v0, v19

    if-gez v2, :cond_b

    iget-object v2, v9, LZ8/D;->J:[Ljava/lang/Object;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v2, v0, v1}, LZ8/E;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    sget-object v5, LZ8/E;->a:Lb9/D;

    invoke-static {v2, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const-wide/16 v5, 0x1

    add-long/2addr v7, v5

    add-long/2addr v0, v5

    :cond_b
    move-wide v1, v0

    move-wide v5, v7

    move-object/from16 v0, p0

    move-wide/from16 v7, v19

    invoke-direct/range {v0 .. v8}, LZ8/D;->Y(JJJJ)V

    invoke-direct/range {p0 .. p0}, LZ8/D;->C()V

    array-length v0, v11

    const/4 v1, 0x1

    if-nez v0, :cond_c

    move v10, v1

    goto :goto_7

    :cond_c
    const/4 v10, 0x0

    :goto_7
    xor-int/lit8 v0, v10, 0x1

    if-eqz v0, :cond_d

    invoke-direct {v9, v11}, LZ8/D;->L([Lm7/e;)[Lm7/e;

    move-result-object v11

    :cond_d
    return-object v11
.end method

.method public a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LZ8/D;->I(LZ8/D;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a0()J
    .locals 4

    .prologue
    iget-wide v0, p0, LZ8/D;->K:J

    iget-wide v2, p0, LZ8/D;->L:J

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    iput-wide v0, p0, LZ8/D;->L:J

    :cond_0
    return-wide v0
.end method

.method public b(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LZ8/D;->D(LZ8/D;LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/List;
    .locals 8

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, LZ8/D;->R()I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :try_start_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, p0, LZ8/D;->J:[Ljava/lang/Object;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    iget-wide v4, p0, LZ8/D;->K:J

    int-to-long v6, v3

    add-long/2addr v4, v6

    invoke-static {v2, v4, v5}, LZ8/E;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    monitor-exit p0

    return-object v1

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public d(Lm7/i;ILY8/d;)LZ8/f;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LZ8/E;->e(LZ8/C;Lm7/i;ILY8/d;)LZ8/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i()La9/d;
    .locals 1

    invoke-virtual {p0}, LZ8/D;->F()LZ8/F;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic j(I)[La9/d;
    .locals 0

    invoke-virtual {p0, p1}, LZ8/D;->G(I)[LZ8/F;

    move-result-object p1

    return-object p1
.end method

.method public m()V
    .locals 9

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, LZ8/D;->M()J

    move-result-wide v1

    iget-wide v3, p0, LZ8/D;->L:J

    invoke-direct {p0}, LZ8/D;->M()J

    move-result-wide v5

    invoke-direct {p0}, LZ8/D;->Q()J

    move-result-wide v7

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, LZ8/D;->Y(JJJJ)V

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public n(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    sget-object v1, La9/c;->a:[Lm7/e;

    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, LZ8/D;->U(Ljava/lang/Object;)Z

    move-result p1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    invoke-direct {p0, v1}, LZ8/D;->L([Lm7/e;)[Lm7/e;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move p1, v0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    move p1, v2

    :goto_0
    monitor-exit p0

    array-length v3, v1

    :goto_1
    if-ge v2, v3, :cond_2

    aget-object v4, v1, v2

    if-eqz v4, :cond_1

    sget-object v5, Li7/w;->D:Li7/w$a;

    sget-object v5, Li7/M;->a:Li7/M;

    invoke-static {v5}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_1
    add-int/2addr v2, v0

    goto :goto_1

    :cond_2
    return p1

    :goto_2
    monitor-exit p0

    throw p1
.end method
