.class public final Lcom/google/android/gms/internal/ads/vI0;
.super Lcom/google/android/gms/internal/ads/kH0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/mI0;


# instance fields
.field private final h:Lcom/google/android/gms/internal/ads/Oh0;

.field private final i:Lcom/google/android/gms/internal/ads/XF0;

.field private final j:I

.field private k:Z

.field private l:J

.field private m:Z

.field private n:Z

.field private o:Lcom/google/android/gms/internal/ads/Pv0;

.field private p:Lcom/google/android/gms/internal/ads/Q7;

.field private final q:Lcom/google/android/gms/internal/ads/sI0;

.field private final r:Lcom/google/android/gms/internal/ads/cK0;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Q7;Lcom/google/android/gms/internal/ads/Oh0;Lcom/google/android/gms/internal/ads/sI0;Lcom/google/android/gms/internal/ads/XF0;Lcom/google/android/gms/internal/ads/cK0;IZLcom/google/android/gms/internal/ads/Tg0;Lcom/google/android/gms/internal/ads/uI0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/kH0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vI0;->p:Lcom/google/android/gms/internal/ads/Q7;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/vI0;->h:Lcom/google/android/gms/internal/ads/Oh0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/vI0;->q:Lcom/google/android/gms/internal/ads/sI0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/vI0;->i:Lcom/google/android/gms/internal/ads/XF0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/vI0;->r:Lcom/google/android/gms/internal/ads/cK0;

    iput p6, p0, Lcom/google/android/gms/internal/ads/vI0;->j:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/vI0;->k:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/vI0;->l:J

    return-void
.end method

.method private final y()V
    .locals 25

    .prologue
    move-object/from16 v0, p0

    new-instance v10, Lcom/google/android/gms/internal/ads/JI0;

    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/vI0;->l:J

    iget-boolean v11, v0, Lcom/google/android/gms/internal/ads/vI0;->m:Z

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/vI0;->n:Z

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/vI0;->l0()Lcom/google/android/gms/internal/ads/Q7;

    move-result-object v14

    if-eqz v1, :cond_0

    iget-object v1, v14, Lcom/google/android/gms/internal/ads/Q7;->c:Lcom/google/android/gms/internal/ads/N4;

    :goto_0
    move-object/from16 v21, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    move-wide v6, v2

    move-wide v4, v2

    const-wide/16 v12, 0x0

    const-wide/16 v15, 0x0

    move-object/from16 v20, v14

    move-wide v14, v15

    const/16 v17, 0x0

    move-object v1, v10

    move-wide/from16 v22, v8

    move-object/from16 v24, v10

    move/from16 v16, v11

    move-wide/from16 v10, v22

    invoke-direct/range {v1 .. v21}, Lcom/google/android/gms/internal/ads/JI0;-><init>(JJJJJJJZZZLjava/lang/Object;Lcom/google/android/gms/internal/ads/Q7;Lcom/google/android/gms/internal/ads/N4;)V

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/vI0;->k:Z

    if-eqz v1, :cond_1

    new-instance v10, Lcom/google/android/gms/internal/ads/rI0;

    move-object/from16 v1, v24

    invoke-direct {v10, v0, v1}, Lcom/google/android/gms/internal/ads/rI0;-><init>(Lcom/google/android/gms/internal/ads/vI0;Lcom/google/android/gms/internal/ads/qm;)V

    goto :goto_2

    :cond_1
    move-object/from16 v1, v24

    move-object v10, v1

    :goto_2
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/ads/kH0;->u(Lcom/google/android/gms/internal/ads/qm;)V

    return-void
.end method


# virtual methods
.method public final J()V
    .locals 0

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/ads/JH0;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/qI0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/qI0;->z()V

    return-void
.end method

.method public final declared-synchronized c(Lcom/google/android/gms/internal/ads/Q7;)V
    .locals 0

    .prologue
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vI0;->p:Lcom/google/android/gms/internal/ads/Q7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final d(JZZ)V
    .locals 2

    .prologue
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/vI0;->l:J

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/vI0;->k:Z

    if-nez v0, :cond_1

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/vI0;->l:J

    cmp-long v0, v0, p1

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/vI0;->m:Z

    if-ne v0, p3, :cond_1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/vI0;->n:Z

    if-ne v0, p4, :cond_1

    return-void

    :cond_1
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/vI0;->l:J

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/vI0;->m:Z

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/vI0;->n:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/vI0;->k:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/vI0;->y()V

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/YJ0;J)Lcom/google/android/gms/internal/ads/JH0;
    .locals 18

    .prologue
    move-object/from16 v15, p0

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/vI0;->h:Lcom/google/android/gms/internal/ads/Oh0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Oh0;->a()Lcom/google/android/gms/internal/ads/pi0;

    move-result-object v2

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/vI0;->o:Lcom/google/android/gms/internal/ads/Pv0;

    if-eqz v0, :cond_0

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/pi0;->b(Lcom/google/android/gms/internal/ads/Pv0;)V

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/vI0;->l0()Lcom/google/android/gms/internal/ads/Q7;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Q7;->b:Lcom/google/android/gms/internal/ads/o5;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/o5;->a:Landroid/net/Uri;

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/vI0;->q:Lcom/google/android/gms/internal/ads/sI0;

    new-instance v16, Lcom/google/android/gms/internal/ads/qI0;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/kH0;->m()Lcom/google/android/gms/internal/ads/bE0;

    new-instance v3, Lcom/google/android/gms/internal/ads/mH0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/sI0;->a:Lcom/google/android/gms/internal/ads/y0;

    invoke-direct {v3, v0}, Lcom/google/android/gms/internal/ads/mH0;-><init>(Lcom/google/android/gms/internal/ads/y0;)V

    iget-object v4, v15, Lcom/google/android/gms/internal/ads/vI0;->i:Lcom/google/android/gms/internal/ads/XF0;

    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/kH0;->n(Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/SF0;

    move-result-object v5

    iget-object v6, v15, Lcom/google/android/gms/internal/ads/vI0;->r:Lcom/google/android/gms/internal/ads/cK0;

    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/kH0;->p(Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/VH0;

    move-result-object v7

    iget v11, v15, Lcom/google/android/gms/internal/ads/vI0;->j:I

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    invoke-static {v8, v9}, Lcom/google/android/gms/internal/ads/EW;->K(J)J

    move-result-wide v13

    const/16 v17, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v0, v16

    move-object/from16 v8, p0

    move-object/from16 v9, p2

    move-object/from16 v15, v17

    invoke-direct/range {v0 .. v15}, Lcom/google/android/gms/internal/ads/qI0;-><init>(Landroid/net/Uri;Lcom/google/android/gms/internal/ads/pi0;Lcom/google/android/gms/internal/ads/eI0;Lcom/google/android/gms/internal/ads/XF0;Lcom/google/android/gms/internal/ads/SF0;Lcom/google/android/gms/internal/ads/cK0;Lcom/google/android/gms/internal/ads/VH0;Lcom/google/android/gms/internal/ads/mI0;Lcom/google/android/gms/internal/ads/YJ0;Ljava/lang/String;IZJLcom/google/android/gms/internal/ads/vK0;)V

    return-object v16
.end method

.method public final declared-synchronized l0()Lcom/google/android/gms/internal/ads/Q7;
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vI0;->p:Lcom/google/android/gms/internal/ads/Q7;
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

.method protected final t(Lcom/google/android/gms/internal/ads/Pv0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vI0;->o:Lcom/google/android/gms/internal/ads/Pv0;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/kH0;->m()Lcom/google/android/gms/internal/ads/bE0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/vI0;->y()V

    return-void
.end method

.method protected final w()V
    .locals 0

    return-void
.end method
