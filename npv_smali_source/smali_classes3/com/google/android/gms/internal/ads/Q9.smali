.class public final Lcom/google/android/gms/internal/ads/Q9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/T9;


# static fields
.field private static T:Lcom/google/android/gms/internal/ads/Q9;


# instance fields
.field private final C:Landroid/content/Context;

.field private final D:Lcom/google/android/gms/internal/ads/Ld0;

.field private final E:Lcom/google/android/gms/internal/ads/Td0;

.field private final F:Lcom/google/android/gms/internal/ads/Vd0;

.field private final G:Lcom/google/android/gms/internal/ads/wa;

.field private final H:Lcom/google/android/gms/internal/ads/Vc0;

.field private final I:Ljava/util/concurrent/Executor;

.field private final J:Lcom/google/android/gms/internal/ads/Sd0;

.field private final K:Ljava/util/concurrent/CountDownLatch;

.field private final L:Lcom/google/android/gms/internal/ads/Na;

.field private final M:Lcom/google/android/gms/internal/ads/Ea;

.field private final N:Lcom/google/android/gms/internal/ads/ua;

.field volatile O:J

.field private final P:Ljava/lang/Object;

.field private volatile Q:Z

.field private volatile R:Z

.field private final S:I


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Vc0;Lcom/google/android/gms/internal/ads/Ld0;Lcom/google/android/gms/internal/ads/Td0;Lcom/google/android/gms/internal/ads/Vd0;Lcom/google/android/gms/internal/ads/wa;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/Qc0;ILcom/google/android/gms/internal/ads/Na;Lcom/google/android/gms/internal/ads/Ea;Lcom/google/android/gms/internal/ads/ua;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/Q9;->O:J

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Q9;->P:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/Q9;->R:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Q9;->C:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Q9;->H:Lcom/google/android/gms/internal/ads/Vc0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Q9;->D:Lcom/google/android/gms/internal/ads/Ld0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Q9;->E:Lcom/google/android/gms/internal/ads/Td0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/Q9;->F:Lcom/google/android/gms/internal/ads/Vd0;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/Q9;->G:Lcom/google/android/gms/internal/ads/wa;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/Q9;->I:Ljava/util/concurrent/Executor;

    iput p9, p0, Lcom/google/android/gms/internal/ads/Q9;->S:I

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/Q9;->L:Lcom/google/android/gms/internal/ads/Na;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/Q9;->M:Lcom/google/android/gms/internal/ads/Ea;

    iput-object p12, p0, Lcom/google/android/gms/internal/ads/Q9;->N:Lcom/google/android/gms/internal/ads/ua;

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/Q9;->R:Z

    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Q9;->K:Ljava/util/concurrent/CountDownLatch;

    new-instance p1, Lcom/google/android/gms/internal/ads/O9;

    invoke-direct {p1, p0, p8}, Lcom/google/android/gms/internal/ads/O9;-><init>(Lcom/google/android/gms/internal/ads/Q9;Lcom/google/android/gms/internal/ads/Qc0;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Q9;->J:Lcom/google/android/gms/internal/ads/Sd0;

    return-void
.end method

.method public static declared-synchronized j(Landroid/content/Context;Lcom/google/android/gms/internal/ads/X7;Z)Lcom/google/android/gms/internal/ads/Q9;
    .locals 3

    .prologue
    const-class v0, Lcom/google/android/gms/internal/ads/Q9;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/Xc0;->c()Lcom/google/android/gms/internal/ads/Wc0;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/X7;->f0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/Wc0;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Wc0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/X7;->i0()Z

    move-result p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/Wc0;->g(Z)Lcom/google/android/gms/internal/ads/Wc0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Wc0;->h()Lcom/google/android/gms/internal/ads/Xc0;

    move-result-object p1

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    invoke-static {p0, v1, p1, p2}, Lcom/google/android/gms/internal/ads/Q9;->s(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/Xc0;Z)Lcom/google/android/gms/internal/ads/Q9;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method static bridge synthetic k(Lcom/google/android/gms/internal/ads/Q9;)Lcom/google/android/gms/internal/ads/Vc0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Q9;->H:Lcom/google/android/gms/internal/ads/Vc0;

    return-object p0
.end method

.method static bridge synthetic l(Lcom/google/android/gms/internal/ads/Q9;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Q9;->P:Ljava/lang/Object;

    return-object p0
.end method

.method static bridge synthetic m(Lcom/google/android/gms/internal/ads/Q9;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/Q9;->Q:Z

    return-void
.end method

.method static bridge synthetic n(Lcom/google/android/gms/internal/ads/Q9;)V
    .locals 12

    .prologue
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/ads/Q9;->u(I)Lcom/google/android/gms/internal/ads/Kd0;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Kd0;->a()Lcom/google/android/gms/internal/ads/Bb;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/Bb;->k0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Kd0;->a()Lcom/google/android/gms/internal/ads/Bb;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Bb;->j0()Ljava/lang/String;

    move-result-object v3

    move-object v9, v3

    move-object v8, v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    move-object v8, v4

    move-object v9, v8

    :goto_0
    :try_start_0
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/Q9;->C:Landroid/content/Context;

    iget v7, p0, Lcom/google/android/gms/internal/ads/Q9;->S:I

    const-string v10, "1"

    iget-object v11, p0, Lcom/google/android/gms/internal/ads/Q9;->H:Lcom/google/android/gms/internal/ads/Vc0;

    const/4 v6, 0x1

    invoke-static/range {v5 .. v11}, Lcom/google/android/gms/internal/ads/fd0;->a(Landroid/content/Context;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vc0;)Lcom/google/android/gms/internal/ads/Qd0;

    move-result-object v3

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/Qd0;->D:[B

    if-eqz v4, :cond_b

    array-length v5, v4
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/Vv0; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const/4 v6, 0x0

    :try_start_1
    invoke-static {v4, v6, v5}, Lcom/google/android/gms/internal/ads/fv0;->T([BII)Lcom/google/android/gms/internal/ads/fv0;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/ads/xv0;->a()Lcom/google/android/gms/internal/ads/xv0;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/ads/yb;->c0(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/yb;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/google/android/gms/internal/ads/Vv0; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/yb;->d0()Lcom/google/android/gms/internal/ads/Bb;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/Bb;->k0()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_a

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/yb;->d0()Lcom/google/android/gms/internal/ads/Bb;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/Bb;->j0()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_a

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/yb;->e0()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/fv0;->d()[B

    move-result-object v5

    array-length v5, v5

    if-nez v5, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/ads/Q9;->u(I)Lcom/google/android/gms/internal/ads/Kd0;

    move-result-object v5

    if-nez v5, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/Kd0;->a()Lcom/google/android/gms/internal/ads/Bb;

    move-result-object v5

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/yb;->d0()Lcom/google/android/gms/internal/ads/Bb;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/Bb;->k0()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/Bb;->k0()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/yb;->d0()Lcom/google/android/gms/internal/ads/Bb;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/Bb;->j0()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/Bb;->j0()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :catch_0
    move-exception v2

    goto/16 :goto_5

    :cond_4
    :goto_1
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/Q9;->J:Lcom/google/android/gms/internal/ads/Sd0;

    iget v3, v3, Lcom/google/android/gms/internal/ads/Qd0;->E:I

    sget-object v6, Lcom/google/android/gms/internal/ads/Af;->u2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v7

    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_6

    const/4 v6, 0x3

    if-ne v3, v6, :cond_5

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Q9;->E:Lcom/google/android/gms/internal/ads/Td0;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/Td0;->a(Lcom/google/android/gms/internal/ads/yb;)Z

    move-result v3

    goto :goto_2

    :cond_5
    const/4 v6, 0x4

    if-ne v3, v6, :cond_7

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Q9;->E:Lcom/google/android/gms/internal/ads/Td0;

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ads/Td0;->b(Lcom/google/android/gms/internal/ads/yb;Lcom/google/android/gms/internal/ads/Sd0;)Z

    move-result v3

    goto :goto_2

    :cond_6
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Q9;->D:Lcom/google/android/gms/internal/ads/Ld0;

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ads/Ld0;->a(Lcom/google/android/gms/internal/ads/yb;Lcom/google/android/gms/internal/ads/Sd0;)Z

    move-result v3

    :goto_2
    if-nez v3, :cond_8

    :cond_7
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Q9;->H:Lcom/google/android/gms/internal/ads/Vc0;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v0

    const/16 v5, 0xfa9

    invoke-virtual {v2, v5, v3, v4}, Lcom/google/android/gms/internal/ads/Vc0;->d(IJ)Ll4/l;

    goto :goto_6

    :cond_8
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/ads/Q9;->u(I)Lcom/google/android/gms/internal/ads/Kd0;

    move-result-object v3

    if-eqz v3, :cond_c

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/Q9;->F:Lcom/google/android/gms/internal/ads/Vd0;

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/Vd0;->c(Lcom/google/android/gms/internal/ads/Kd0;)Z

    move-result v3

    if-eqz v3, :cond_9

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/Q9;->R:Z

    :cond_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/Q9;->O:J

    goto :goto_6

    :cond_a
    :goto_3
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Q9;->H:Lcom/google/android/gms/internal/ads/Vc0;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v0

    const/16 v5, 0x1392

    invoke-virtual {v2, v5, v3, v4}, Lcom/google/android/gms/internal/ads/Vc0;->d(IJ)Ll4/l;

    goto :goto_6

    :catch_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Q9;->H:Lcom/google/android/gms/internal/ads/Vc0;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v0

    const/16 v5, 0x7ee

    invoke-virtual {v2, v5, v3, v4}, Lcom/google/android/gms/internal/ads/Vc0;->d(IJ)Ll4/l;

    goto :goto_6

    :cond_b
    :goto_4
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Q9;->H:Lcom/google/android/gms/internal/ads/Vc0;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v0

    const/16 v5, 0x1391

    invoke-virtual {v2, v5, v3, v4}, Lcom/google/android/gms/internal/ads/Vc0;->d(IJ)Ll4/l;
    :try_end_2
    .catch Lcom/google/android/gms/internal/ads/Vv0; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_6

    :goto_5
    :try_start_3
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Q9;->H:Lcom/google/android/gms/internal/ads/Vc0;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v0

    const/16 v0, 0xfa2

    invoke-virtual {v3, v0, v4, v5, v2}, Lcom/google/android/gms/internal/ads/Vc0;->c(IJLjava/lang/Exception;)Ll4/l;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_c
    :goto_6
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Q9;->K:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    :goto_7
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Q9;->K:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw v0
.end method

.method static bridge synthetic q(Lcom/google/android/gms/internal/ads/Q9;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/internal/ads/Q9;->Q:Z

    return p0
.end method

.method private static declared-synchronized s(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/Xc0;Z)Lcom/google/android/gms/internal/ads/Q9;
    .locals 24

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v8, p1

    const-class v14, Lcom/google/android/gms/internal/ads/Q9;

    monitor-enter v14

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/Q9;->T:Lcom/google/android/gms/internal/ads/Q9;

    if-nez v1, :cond_4

    move/from16 v1, p3

    invoke-static {v0, v8, v1}, Lcom/google/android/gms/internal/ads/Vc0;->a(Landroid/content/Context;Ljava/util/concurrent/Executor;Z)Lcom/google/android/gms/internal/ads/Vc0;

    move-result-object v3

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->w3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/fa;->c(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/fa;

    move-result-object v1

    move-object/from16 v20, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_0
    move-object/from16 v20, v2

    :goto_0
    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->x3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/Na;->d(Landroid/content/Context;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/Na;

    move-result-object v1

    move-object v11, v1

    goto :goto_1

    :cond_1
    move-object v11, v2

    :goto_1
    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->M2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Lcom/google/android/gms/internal/ads/Ea;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/Ea;-><init>()V

    move-object v12, v1

    goto :goto_2

    :cond_2
    move-object v12, v2

    :goto_2
    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->T2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Lcom/google/android/gms/internal/ads/ua;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/ua;-><init>()V

    move-object v13, v1

    move-object/from16 v1, p2

    goto :goto_3

    :cond_3
    move-object/from16 v1, p2

    move-object v13, v2

    :goto_3
    invoke-static {v0, v8, v3, v1}, Lcom/google/android/gms/internal/ads/pd0;->e(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/Vc0;Lcom/google/android/gms/internal/ads/Xc0;)Lcom/google/android/gms/internal/ads/pd0;

    move-result-object v17

    new-instance v2, Lcom/google/android/gms/internal/ads/va;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/va;-><init>(Landroid/content/Context;)V

    new-instance v4, Lcom/google/android/gms/internal/ads/Ka;

    invoke-direct {v4, v0, v2}, Lcom/google/android/gms/internal/ads/Ka;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/va;)V

    new-instance v7, Lcom/google/android/gms/internal/ads/wa;

    move-object v15, v7

    move-object/from16 v16, p2

    move-object/from16 v18, v4

    move-object/from16 v19, v2

    move-object/from16 v21, v11

    move-object/from16 v22, v12

    move-object/from16 v23, v13

    invoke-direct/range {v15 .. v23}, Lcom/google/android/gms/internal/ads/wa;-><init>(Lcom/google/android/gms/internal/ads/Xc0;Lcom/google/android/gms/internal/ads/pd0;Lcom/google/android/gms/internal/ads/Ka;Lcom/google/android/gms/internal/ads/va;Lcom/google/android/gms/internal/ads/fa;Lcom/google/android/gms/internal/ads/Na;Lcom/google/android/gms/internal/ads/Ea;Lcom/google/android/gms/internal/ads/ua;)V

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/ads/yd0;->b(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Vc0;)I

    move-result v10

    new-instance v9, Lcom/google/android/gms/internal/ads/Qc0;

    invoke-direct {v9}, Lcom/google/android/gms/internal/ads/Qc0;-><init>()V

    new-instance v15, Lcom/google/android/gms/internal/ads/Q9;

    new-instance v4, Lcom/google/android/gms/internal/ads/Ld0;

    invoke-direct {v4, v0, v10}, Lcom/google/android/gms/internal/ads/Ld0;-><init>(Landroid/content/Context;I)V

    new-instance v5, Lcom/google/android/gms/internal/ads/Td0;

    new-instance v1, Lcom/google/android/gms/internal/ads/N9;

    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/ads/N9;-><init>(Lcom/google/android/gms/internal/ads/Vc0;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->w2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v6

    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-direct {v5, v0, v10, v1, v2}, Lcom/google/android/gms/internal/ads/Td0;-><init>(Landroid/content/Context;ILcom/google/android/gms/internal/ads/zd0;Z)V

    new-instance v6, Lcom/google/android/gms/internal/ads/Vd0;

    invoke-direct {v6, v0, v7, v3, v9}, Lcom/google/android/gms/internal/ads/Vd0;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Wd0;Lcom/google/android/gms/internal/ads/Vc0;Lcom/google/android/gms/internal/ads/Qc0;)V

    move-object v1, v15

    move-object/from16 v2, p0

    move-object/from16 v8, p1

    invoke-direct/range {v1 .. v13}, Lcom/google/android/gms/internal/ads/Q9;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Vc0;Lcom/google/android/gms/internal/ads/Ld0;Lcom/google/android/gms/internal/ads/Td0;Lcom/google/android/gms/internal/ads/Vd0;Lcom/google/android/gms/internal/ads/wa;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/Qc0;ILcom/google/android/gms/internal/ads/Na;Lcom/google/android/gms/internal/ads/Ea;Lcom/google/android/gms/internal/ads/ua;)V

    sput-object v15, Lcom/google/android/gms/internal/ads/Q9;->T:Lcom/google/android/gms/internal/ads/Q9;

    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/Q9;->o()V

    sget-object v0, Lcom/google/android/gms/internal/ads/Q9;->T:Lcom/google/android/gms/internal/ads/Q9;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Q9;->p()V

    :cond_4
    sget-object v0, Lcom/google/android/gms/internal/ads/Q9;->T:Lcom/google/android/gms/internal/ads/Q9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v14

    return-object v0

    :goto_4
    :try_start_1
    monitor-exit v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private final t()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q9;->L:Lcom/google/android/gms/internal/ads/Na;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Na;->h()V

    :cond_0
    return-void
.end method

.method private final u(I)Lcom/google/android/gms/internal/ads/Kd0;
    .locals 1

    .prologue
    iget p1, p0, Lcom/google/android/gms/internal/ads/Q9;->S:I

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yd0;->a(I)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->u2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Q9;->E:Lcom/google/android/gms/internal/ads/Td0;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/Td0;->c(I)Lcom/google/android/gms/internal/ads/Kd0;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Q9;->D:Lcom/google/android/gms/internal/ads/Ld0;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/Ld0;->c(I)Lcom/google/android/gms/internal/ads/Kd0;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ljava/lang/String;
    .locals 10

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Q9;->t()V

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->M2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q9;->M:Lcom/google/android/gms/internal/ads/Ea;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ea;->j()V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Q9;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q9;->F:Lcom/google/android/gms/internal/ads/Vd0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Vd0;->a()Lcom/google/android/gms/internal/ads/Yc0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-interface {v0, p1, v3}, Lcom/google/android/gms/internal/ads/Yc0;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/Q9;->H:Lcom/google/android/gms/internal/ads/Vc0;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long v6, v5, v1

    const/4 v9, 0x0

    const/16 v5, 0x1389

    move-object v8, p1

    invoke-virtual/range {v4 .. v9}, Lcom/google/android/gms/internal/ads/Vc0;->f(IJLjava/lang/String;Ljava/util/Map;)Ll4/l;

    return-object p1

    :cond_1
    const-string p1, ""

    return-object p1
.end method

.method public final b(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q9;->G:Lcom/google/android/gms/internal/ads/wa;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/wa;->d(Landroid/view/View;)V

    return-void
.end method

.method public final c([Ljava/lang/StackTraceElement;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q9;->N:Lcom/google/android/gms/internal/ads/ua;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ua;->b(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public final d(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    const-string p1, "19"

    return-object p1
.end method

.method public final e(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/ads/Q9;->f(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final f(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 16

    .prologue
    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/Q9;->t()V

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->M2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/Q9;->M:Lcom/google/android/gms/internal/ads/Ea;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Ea;->i()V

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/Q9;->p()V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/Q9;->F:Lcom/google/android/gms/internal/ads/Vd0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Vd0;->a()Lcom/google/android/gms/internal/ads/Yc0;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    const/4 v4, 0x0

    move-object/from16 v3, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    invoke-interface/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/Yc0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v1

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/Q9;->H:Lcom/google/android/gms/internal/ads/Vc0;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v12, v2, v8

    const/4 v15, 0x0

    const/16 v11, 0x1388

    move-object v14, v1

    invoke-virtual/range {v10 .. v15}, Lcom/google/android/gms/internal/ads/Vc0;->f(IJLjava/lang/String;Ljava/util/Map;)Ll4/l;

    return-object v1

    :cond_1
    const-string v1, ""

    return-object v1
.end method

.method public final g(III)V
    .locals 19

    .prologue
    move-object/from16 v0, p0

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->Qb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/Q9;->C:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    int-to-float v2, v2

    iget v3, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float v9, v2, v3

    move/from16 v4, p2

    int-to-float v15, v4

    mul-float v10, v15, v3

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v3, 0x0

    move/from16 v18, v15

    move v15, v3

    invoke-static/range {v4 .. v17}, Landroid/view/MotionEvent;->obtain(JJIFFFFIFFII)Landroid/view/MotionEvent;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/Q9;->h(Landroid/view/MotionEvent;)V

    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    iget v3, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float v9, v2, v3

    mul-float v10, v18, v3

    const/4 v8, 0x2

    const/4 v15, 0x0

    invoke-static/range {v4 .. v17}, Landroid/view/MotionEvent;->obtain(JJIFFFFIFFII)Landroid/view/MotionEvent;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/Q9;->h(Landroid/view/MotionEvent;)V

    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    move/from16 v3, p3

    int-to-long v5, v3

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float v8, v2, v1

    mul-float v9, v18, v1

    const/4 v15, 0x0

    const-wide/16 v3, 0x0

    const/4 v7, 0x1

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v3 .. v16}, Landroid/view/MotionEvent;->obtain(JJIFFFFIFFII)Landroid/view/MotionEvent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Q9;->h(Landroid/view/MotionEvent;)V

    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final h(Landroid/view/MotionEvent;)V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q9;->F:Lcom/google/android/gms/internal/ads/Vd0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Vd0;->a()Lcom/google/android/gms/internal/ads/Yc0;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Yc0;->b(Ljava/lang/String;Landroid/view/MotionEvent;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/Ud0; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q9;->H:Lcom/google/android/gms/internal/ads/Vc0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ud0;->a()I

    move-result v1

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/google/android/gms/internal/ads/Vc0;->c(IJLjava/lang/Exception;)Ll4/l;

    :cond_0
    return-void
.end method

.method public final i(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 10

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Q9;->t()V

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->M2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q9;->M:Lcom/google/android/gms/internal/ads/Ea;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Ea;->k(Landroid/content/Context;Landroid/view/View;)V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Q9;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q9;->F:Lcom/google/android/gms/internal/ads/Vd0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Vd0;->a()Lcom/google/android/gms/internal/ads/Yc0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-interface {v0, p1, v3, p2, p3}, Lcom/google/android/gms/internal/ads/Yc0;->d(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/Q9;->H:Lcom/google/android/gms/internal/ads/Vc0;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    sub-long v6, p2, v1

    const/4 v9, 0x0

    const/16 v5, 0x138a

    move-object v8, p1

    invoke-virtual/range {v4 .. v9}, Lcom/google/android/gms/internal/ads/Vc0;->f(IJLjava/lang/String;Ljava/util/Map;)Ll4/l;

    return-object p1

    :cond_1
    const-string p1, ""

    return-object p1
.end method

.method final declared-synchronized o()V
    .locals 5

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/ads/Q9;->u(I)Lcom/google/android/gms/internal/ads/Kd0;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q9;->F:Lcom/google/android/gms/internal/ads/Vd0;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/Vd0;->c(Lcom/google/android/gms/internal/ads/Kd0;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/Q9;->R:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q9;->K:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Q9;->H:Lcom/google/android/gms/internal/ads/Vc0;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v0

    const/16 v0, 0xfad

    invoke-virtual {v2, v0, v3, v4}, Lcom/google/android/gms/internal/ads/Vc0;->d(IJ)Ll4/l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final p()V
    .locals 5

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/Q9;->Q:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q9;->P:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/Q9;->Q:Z

    if-nez v1, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/Q9;->O:J

    sub-long/2addr v1, v3

    const-wide/16 v3, 0xe10

    cmp-long v1, v1, v3

    if-gez v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Q9;->F:Lcom/google/android/gms/internal/ads/Vd0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Vd0;->b()Lcom/google/android/gms/internal/ads/Kd0;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/ads/Kd0;->d(J)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    iget v1, p0, Lcom/google/android/gms/internal/ads/Q9;->S:I

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/yd0;->a(I)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Q9;->I:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/google/android/gms/internal/ads/P9;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/P9;-><init>(Lcom/google/android/gms/internal/ads/Q9;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_2
    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_3
    return-void
.end method

.method public final declared-synchronized r()Z
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/Q9;->R:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
