.class public final Lcom/google/android/gms/internal/ads/Zz0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Landroid/content/Context;

.field b:Lcom/google/android/gms/internal/ads/mD;

.field c:Lcom/google/android/gms/internal/ads/Tg0;

.field d:Lcom/google/android/gms/internal/ads/Tg0;

.field e:Lcom/google/android/gms/internal/ads/Tg0;

.field f:Lcom/google/android/gms/internal/ads/Tg0;

.field g:Lcom/google/android/gms/internal/ads/Tg0;

.field h:Lcom/google/android/gms/internal/ads/pg0;

.field i:Landroid/os/Looper;

.field j:I

.field k:Lcom/google/android/gms/internal/ads/vS;

.field l:I

.field m:Z

.field n:Lcom/google/android/gms/internal/ads/GB0;

.field o:J

.field p:J

.field q:Z

.field r:Z

.field s:Ljava/lang/String;

.field t:Lcom/google/android/gms/internal/ads/Jz0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ut;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v2, Lcom/google/android/gms/internal/ads/Sz0;

    move-object/from16 v3, p2

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/Sz0;-><init>(Lcom/google/android/gms/internal/ads/ut;)V

    new-instance v3, Lcom/google/android/gms/internal/ads/Tz0;

    invoke-direct {v3, v1}, Lcom/google/android/gms/internal/ads/Tz0;-><init>(Landroid/content/Context;)V

    new-instance v4, Lcom/google/android/gms/internal/ads/Uz0;

    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/ads/Uz0;-><init>(Landroid/content/Context;)V

    new-instance v5, Lcom/google/android/gms/internal/ads/Vz0;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/Vz0;-><init>()V

    new-instance v6, Lcom/google/android/gms/internal/ads/Wz0;

    invoke-direct {v6, v1}, Lcom/google/android/gms/internal/ads/Wz0;-><init>(Landroid/content/Context;)V

    new-instance v7, Lcom/google/android/gms/internal/ads/Xz0;

    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/Xz0;-><init>()V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/Zz0;->a:Landroid/content/Context;

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/Zz0;->c:Lcom/google/android/gms/internal/ads/Tg0;

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/Zz0;->d:Lcom/google/android/gms/internal/ads/Tg0;

    iput-object v4, v0, Lcom/google/android/gms/internal/ads/Zz0;->e:Lcom/google/android/gms/internal/ads/Tg0;

    iput-object v5, v0, Lcom/google/android/gms/internal/ads/Zz0;->f:Lcom/google/android/gms/internal/ads/Tg0;

    iput-object v6, v0, Lcom/google/android/gms/internal/ads/Zz0;->g:Lcom/google/android/gms/internal/ads/Tg0;

    iput-object v7, v0, Lcom/google/android/gms/internal/ads/Zz0;->h:Lcom/google/android/gms/internal/ads/pg0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/EW;->R()Landroid/os/Looper;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/Zz0;->i:Landroid/os/Looper;

    sget-object v1, Lcom/google/android/gms/internal/ads/vS;->b:Lcom/google/android/gms/internal/ads/vS;

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/Zz0;->k:Lcom/google/android/gms/internal/ads/vS;

    const/4 v1, 0x1

    iput v1, v0, Lcom/google/android/gms/internal/ads/Zz0;->l:I

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/Zz0;->m:Z

    sget-object v2, Lcom/google/android/gms/internal/ads/GB0;->d:Lcom/google/android/gms/internal/ads/GB0;

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/Zz0;->n:Lcom/google/android/gms/internal/ads/GB0;

    new-instance v2, Lcom/google/android/gms/internal/ads/Jz0;

    const-wide/16 v3, 0x14

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/ads/EW;->K(J)J

    move-result-wide v9

    const-wide/16 v14, 0x1f4

    invoke-static {v14, v15}, Lcom/google/android/gms/internal/ads/EW;->K(J)J

    move-result-wide v11

    const v13, 0x3f7fbe77    # 0.999f

    const/16 v16, 0x0

    const v4, 0x3f7851ec    # 0.97f

    const v5, 0x3f83d70a    # 1.03f

    const-wide/16 v6, 0x3e8

    const v8, 0x33d6bf95    # 1.0E-7f

    move-object v3, v2

    move-object/from16 v14, v16

    invoke-direct/range {v3 .. v14}, Lcom/google/android/gms/internal/ads/Jz0;-><init>(FFJFJJFLcom/google/android/gms/internal/ads/Iz0;)V

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/Zz0;->t:Lcom/google/android/gms/internal/ads/Jz0;

    sget-object v2, Lcom/google/android/gms/internal/ads/mD;->a:Lcom/google/android/gms/internal/ads/mD;

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/Zz0;->b:Lcom/google/android/gms/internal/ads/mD;

    const-wide/16 v2, 0x1f4

    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/Zz0;->o:J

    const-wide/16 v2, 0x7d0

    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/Zz0;->p:J

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/Zz0;->q:Z

    const-string v1, ""

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/Zz0;->s:Ljava/lang/String;

    const/16 v1, -0x3e8

    iput v1, v0, Lcom/google/android/gms/internal/ads/Zz0;->j:I

    return-void
.end method

.method static synthetic a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/KH0;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/xH0;

    new-instance v1, Lcom/google/android/gms/internal/ads/n0;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/n0;-><init>()V

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/xH0;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/y0;)V

    return-object v0
.end method
