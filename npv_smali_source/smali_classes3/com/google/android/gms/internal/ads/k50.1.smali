.class public final Lcom/google/android/gms/internal/ads/k50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/F50;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/F50;

.field private final b:Lcom/google/android/gms/internal/ads/F50;

.field private final c:Lcom/google/android/gms/internal/ads/y80;

.field private final d:Ljava/lang/String;

.field private e:Lcom/google/android/gms/internal/ads/jC;

.field private final f:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/F50;Lcom/google/android/gms/internal/ads/F50;Lcom/google/android/gms/internal/ads/y80;Ljava/lang/String;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/k50;->a:Lcom/google/android/gms/internal/ads/F50;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/k50;->b:Lcom/google/android/gms/internal/ads/F50;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/k50;->c:Lcom/google/android/gms/internal/ads/y80;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/k50;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/k50;->f:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private final g(Lcom/google/android/gms/internal/ads/l80;Lcom/google/android/gms/internal/ads/G50;)LP4/d;
    .locals 2

    .prologue
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/l80;->a:Lcom/google/android/gms/internal/ads/jC;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/k50;->e:Lcom/google/android/gms/internal/ads/jC;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/l80;->c:Lcom/google/android/gms/internal/ads/fA;

    if-eqz v1, :cond_1

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/jC;->e()Lcom/google/android/gms/internal/ads/C50;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/l80;->c:Lcom/google/android/gms/internal/ads/fA;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/fA;->f()Lcom/google/android/gms/internal/ads/C50;

    move-result-object p2

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/l80;->a:Lcom/google/android/gms/internal/ads/jC;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/jC;->e()Lcom/google/android/gms/internal/ads/C50;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/C50;->g(Lcom/google/android/gms/internal/ads/C50;)V

    :cond_0
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/l80;->c:Lcom/google/android/gms/internal/ads/fA;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/jC;->b()Lcom/google/android/gms/internal/ads/LA;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/l80;->b:Lcom/google/android/gms/internal/ads/e70;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/LA;->k(Lcom/google/android/gms/internal/ads/e70;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/k50;->a:Lcom/google/android/gms/internal/ads/F50;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/l80;->a:Lcom/google/android/gms/internal/ads/jC;

    check-cast v0, Lcom/google/android/gms/internal/ads/u50;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1, p1}, Lcom/google/android/gms/internal/ads/u50;->c(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/jC;)LP4/d;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Ljava/lang/Object;)LP4/d;
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/k50;->e(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/jC;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized b()Lcom/google/android/gms/internal/ads/jC;
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/k50;->e:Lcom/google/android/gms/internal/ads/jC;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method final synthetic c(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/j50;Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/jC;Lcom/google/android/gms/internal/ads/p50;)LP4/d;
    .locals 8

    .prologue
    if-eqz p5, :cond_2

    iget-object v1, p2, Lcom/google/android/gms/internal/ads/j50;->a:Lcom/google/android/gms/internal/ads/E50;

    iget-object v2, p2, Lcom/google/android/gms/internal/ads/j50;->b:Lcom/google/android/gms/internal/ads/G50;

    iget-object v3, p2, Lcom/google/android/gms/internal/ads/j50;->c:Ls3/X1;

    iget-object v4, p2, Lcom/google/android/gms/internal/ads/j50;->d:Ljava/lang/String;

    iget-object v5, p2, Lcom/google/android/gms/internal/ads/j50;->e:Ljava/util/concurrent/Executor;

    iget-object v6, p2, Lcom/google/android/gms/internal/ads/j50;->f:Ls3/i2;

    iget-object v7, p5, Lcom/google/android/gms/internal/ads/p50;->a:Lcom/google/android/gms/internal/ads/m80;

    new-instance p2, Lcom/google/android/gms/internal/ads/j50;

    move-object v0, p2

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/j50;-><init>(Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/G50;Ls3/X1;Ljava/lang/String;Ljava/util/concurrent/Executor;Ls3/i2;Lcom/google/android/gms/internal/ads/m80;)V

    iget-object v0, p5, Lcom/google/android/gms/internal/ads/p50;->c:Lcom/google/android/gms/internal/ads/l80;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/k50;->e:Lcom/google/android/gms/internal/ads/jC;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/k50;->c:Lcom/google/android/gms/internal/ads/y80;

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/y80;->e(Lcom/google/android/gms/internal/ads/x80;)V

    iget-object p2, p5, Lcom/google/android/gms/internal/ads/p50;->c:Lcom/google/android/gms/internal/ads/l80;

    invoke-direct {p0, p2, p1}, Lcom/google/android/gms/internal/ads/k50;->g(Lcom/google/android/gms/internal/ads/l80;Lcom/google/android/gms/internal/ads/G50;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/k50;->c:Lcom/google/android/gms/internal/ads/y80;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/y80;->a(Lcom/google/android/gms/internal/ads/x80;)LP4/d;

    move-result-object v0

    if-eqz v0, :cond_1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/k50;->e:Lcom/google/android/gms/internal/ads/jC;

    new-instance p1, Lcom/google/android/gms/internal/ads/g50;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/g50;-><init>(Lcom/google/android/gms/internal/ads/k50;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/k50;->f:Ljava/util/concurrent/Executor;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/k50;->c:Lcom/google/android/gms/internal/ads/y80;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/y80;->e(Lcom/google/android/gms/internal/ads/x80;)V

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/G50;->b:Lcom/google/android/gms/internal/ads/D50;

    iget-object p2, p5, Lcom/google/android/gms/internal/ads/p50;->b:Lcom/google/android/gms/internal/ads/Po;

    new-instance p5, Lcom/google/android/gms/internal/ads/G50;

    invoke-direct {p5, p1, p2}, Lcom/google/android/gms/internal/ads/G50;-><init>(Lcom/google/android/gms/internal/ads/D50;Lcom/google/android/gms/internal/ads/Po;)V

    move-object p1, p5

    :cond_2
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/k50;->a:Lcom/google/android/gms/internal/ads/F50;

    check-cast p2, Lcom/google/android/gms/internal/ads/u50;

    invoke-virtual {p2, p1, p3, p4}, Lcom/google/android/gms/internal/ads/u50;->c(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/jC;)LP4/d;

    move-result-object p1

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/k50;->e:Lcom/google/android/gms/internal/ads/jC;

    return-object p1
.end method

.method final synthetic d(Lcom/google/android/gms/internal/ads/v80;)LP4/d;
    .locals 4

    .prologue
    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/v80;->a:Lcom/google/android/gms/internal/ads/l80;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/v80;->b:Lcom/google/android/gms/internal/ads/x80;

    if-eqz v0, :cond_0

    check-cast v0, Lcom/google/android/gms/internal/ads/j50;

    invoke-static {}, Lcom/google/android/gms/internal/ads/se;->d0()Lcom/google/android/gms/internal/ads/le;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ads/ke;->h0()Lcom/google/android/gms/internal/ads/je;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/ads/me;->E:Lcom/google/android/gms/internal/ads/me;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/je;->z(Lcom/google/android/gms/internal/ads/me;)Lcom/google/android/gms/internal/ads/je;

    invoke-static {}, Lcom/google/android/gms/internal/ads/pe;->f0()Lcom/google/android/gms/internal/ads/pe;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/je;->B(Lcom/google/android/gms/internal/ads/pe;)Lcom/google/android/gms/internal/ads/je;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/le;->z(Lcom/google/android/gms/internal/ads/je;)Lcom/google/android/gms/internal/ads/le;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/se;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/v80;->a:Lcom/google/android/gms/internal/ads/l80;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/l80;->a:Lcom/google/android/gms/internal/ads/jC;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/jC;->b()Lcom/google/android/gms/internal/ads/LA;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/LA;->c()Lcom/google/android/gms/internal/ads/sF;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/sF;->z(Lcom/google/android/gms/internal/ads/se;)V

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/v80;->a:Lcom/google/android/gms/internal/ads/l80;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/j50;->b:Lcom/google/android/gms/internal/ads/G50;

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/k50;->g(Lcom/google/android/gms/internal/ads/l80;Lcom/google/android/gms/internal/ads/G50;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/oQ;

    const/4 v0, 0x1

    const-string v1, "Empty prefetch"

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/oQ;-><init>(ILjava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized e(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/jC;)LP4/d;
    .locals 16

    .prologue
    move-object/from16 v7, p0

    move-object/from16 v0, p1

    move-object/from16 v5, p2

    monitor-enter p0

    :try_start_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/G50;->b:Lcom/google/android/gms/internal/ads/D50;

    invoke-interface {v5, v1}, Lcom/google/android/gms/internal/ads/E50;->a(Lcom/google/android/gms/internal/ads/D50;)Lcom/google/android/gms/internal/ads/iC;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/l50;

    iget-object v3, v7, Lcom/google/android/gms/internal/ads/k50;->d:Ljava/lang/String;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/l50;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/iC;->u(Lcom/google/android/gms/internal/ads/l50;)Lcom/google/android/gms/internal/ads/iC;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/iC;->g()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/google/android/gms/internal/ads/jC;

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/jC;->i()Lcom/google/android/gms/internal/ads/n70;

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/jC;->i()Lcom/google/android/gms/internal/ads/n70;

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/jC;->i()Lcom/google/android/gms/internal/ads/n70;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    iget-object v2, v1, Ls3/X1;->U:Ls3/X;

    if-nez v2, :cond_1

    iget-object v1, v1, Ls3/X1;->Z:Ljava/lang/String;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/jC;->i()Lcom/google/android/gms/internal/ads/n70;

    move-result-object v1

    iget-object v11, v1, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    iget-object v12, v1, Lcom/google/android/gms/internal/ads/n70;->f:Ljava/lang/String;

    iget-object v14, v1, Lcom/google/android/gms/internal/ads/n70;->j:Ls3/i2;

    iget-object v13, v7, Lcom/google/android/gms/internal/ads/k50;->f:Ljava/util/concurrent/Executor;

    new-instance v4, Lcom/google/android/gms/internal/ads/j50;

    const/4 v15, 0x0

    move-object v8, v4

    move-object/from16 v9, p2

    move-object/from16 v10, p1

    invoke-direct/range {v8 .. v15}, Lcom/google/android/gms/internal/ads/j50;-><init>(Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/G50;Ls3/X1;Ljava/lang/String;Ljava/util/concurrent/Executor;Ls3/i2;Lcom/google/android/gms/internal/ads/m80;)V

    iget-object v1, v7, Lcom/google/android/gms/internal/ads/k50;->b:Lcom/google/android/gms/internal/ads/F50;

    check-cast v1, Lcom/google/android/gms/internal/ads/q50;

    invoke-virtual {v1, v0, v5, v6}, Lcom/google/android/gms/internal/ads/q50;->c(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/jC;)LP4/d;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Dk0;->D(LP4/d;)Lcom/google/android/gms/internal/ads/Dk0;

    move-result-object v8

    new-instance v9, Lcom/google/android/gms/internal/ads/h50;

    move-object v1, v9

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/h50;-><init>(Lcom/google/android/gms/internal/ads/k50;Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/j50;Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/jC;)V

    iget-object v0, v7, Lcom/google/android/gms/internal/ads/k50;->f:Ljava/util/concurrent/Executor;

    invoke-static {v8, v9, v0}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Dk0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    :try_start_1
    iput-object v6, v7, Lcom/google/android/gms/internal/ads/k50;->e:Lcom/google/android/gms/internal/ads/jC;

    iget-object v1, v7, Lcom/google/android/gms/internal/ads/k50;->a:Lcom/google/android/gms/internal/ads/F50;

    check-cast v1, Lcom/google/android/gms/internal/ads/u50;

    invoke-virtual {v1, v0, v5, v6}, Lcom/google/android/gms/internal/ads/u50;->c(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/jC;)LP4/d;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/k50;->b()Lcom/google/android/gms/internal/ads/jC;

    move-result-object v0

    return-object v0
.end method
