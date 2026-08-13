.class public final Lcom/google/android/gms/internal/ads/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/yK0;

.field private final b:Lcom/google/android/gms/internal/ads/q;

.field private final c:Lcom/google/android/gms/internal/ads/r;

.field private d:Z

.field private e:Landroid/view/Surface;

.field private f:F

.field private g:F

.field private h:F

.field private i:F

.field private j:I

.field private k:J

.field private l:J

.field private m:J

.field private n:J

.field private o:J

.field private p:J

.field private q:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/yK0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/yK0;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/s;->a:Lcom/google/android/gms/internal/ads/yK0;

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    move-object v1, v0

    goto :goto_0

    :cond_1
    const-string v1, "display"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/display/DisplayManager;

    if-eqz p1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/q;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/q;-><init>(Lcom/google/android/gms/internal/ads/s;Landroid/hardware/display/DisplayManager;)V

    :goto_0
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/s;->b:Lcom/google/android/gms/internal/ads/q;

    if-eqz v1, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/ads/r;->a()Lcom/google/android/gms/internal/ads/r;

    move-result-object v0

    :cond_2
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/s;->c:Lcom/google/android/gms/internal/ads/r;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/s;->k:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/s;->l:J

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lcom/google/android/gms/internal/ads/s;->f:F

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/google/android/gms/internal/ads/s;->i:F

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/ads/s;->j:I

    return-void
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/ads/s;Landroid/view/Display;)V
    .locals 4

    .prologue
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/Display;->getRefreshRate()F

    move-result p1

    float-to-double v0, p1

    const-wide v2, 0x41cdcd6500000000L    # 1.0E9

    div-double/2addr v2, v0

    double-to-long v0, v2

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/s;->k:J

    const-wide/16 v2, 0x50

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x64

    div-long/2addr v0, v2

    :goto_0
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/s;->l:J

    return-void

    :cond_0
    const-string p1, "VideoFrameReleaseHelper"

    const-string v0, "Unable to query display refresh rate"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/eM;->f(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/s;->k:J

    goto :goto_0
.end method

.method private final k()V
    .locals 3

    .prologue
    sget v0, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s;->e:Landroid/view/Surface;

    if-eqz v0, :cond_1

    iget v1, p0, Lcom/google/android/gms/internal/ads/s;->j:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_1

    iget v1, p0, Lcom/google/android/gms/internal/ads/s;->h:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iput v2, p0, Lcom/google/android/gms/internal/ads/s;->h:F

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/p;->a(Landroid/view/Surface;F)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final l()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/s;->m:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/s;->p:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/s;->n:J

    return-void
.end method

.method private final m()V
    .locals 7

    .prologue
    sget v0, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s;->e:Landroid/view/Surface;

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s;->a:Lcom/google/android/gms/internal/ads/yK0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/yK0;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s;->a:Lcom/google/android/gms/internal/ads/yK0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/yK0;->a()F

    move-result v0

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/s;->f:F

    :goto_0
    iget v2, p0, Lcom/google/android/gms/internal/ads/s;->g:F

    cmpl-float v3, v0, v2

    if-eqz v3, :cond_5

    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v4, v0, v3

    if-eqz v4, :cond_3

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/s;->a:Lcom/google/android/gms/internal/ads/yK0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/yK0;->g()Z

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/s;->a:Lcom/google/android/gms/internal/ads/yK0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/yK0;->d()J

    move-result-wide v3

    const-wide v5, 0x12a05f200L

    cmp-long v1, v3, v5

    if-ltz v1, :cond_2

    const v2, 0x3ca3d70a    # 0.02f

    :cond_2
    iget v1, p0, Lcom/google/android/gms/internal/ads/s;->g:F

    sub-float v1, v0, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_5

    goto :goto_1

    :cond_3
    if-nez v4, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/s;->a:Lcom/google/android/gms/internal/ads/yK0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/yK0;->b()I

    move-result v2

    if-lt v2, v1, :cond_5

    :cond_4
    :goto_1
    iput v0, p0, Lcom/google/android/gms/internal/ads/s;->g:F

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/s;->n(Z)V

    :cond_5
    :goto_2
    return-void
.end method

.method private final n(Z)V
    .locals 4

    .prologue
    sget v0, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s;->e:Landroid/view/Surface;

    if-eqz v0, :cond_3

    iget v1, p0, Lcom/google/android/gms/internal/ads/s;->j:I

    const/high16 v2, -0x80000000

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/s;->d:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/google/android/gms/internal/ads/s;->g:F

    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v3, v1, v3

    if-eqz v3, :cond_1

    iget v2, p0, Lcom/google/android/gms/internal/ads/s;->i:F

    mul-float/2addr v2, v1

    :cond_1
    if-nez p1, :cond_2

    iget p1, p0, Lcom/google/android/gms/internal/ads/s;->h:F

    cmpl-float p1, p1, v2

    if-eqz p1, :cond_3

    :cond_2
    iput v2, p0, Lcom/google/android/gms/internal/ads/s;->h:F

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/p;->a(Landroid/view/Surface;F)V

    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 10

    .prologue
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/s;->p:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s;->a:Lcom/google/android/gms/internal/ads/yK0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/yK0;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s;->a:Lcom/google/android/gms/internal/ads/yK0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/yK0;->c()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/s;->q:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/s;->m:J

    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/s;->p:J

    sub-long/2addr v4, v6

    mul-long/2addr v0, v4

    iget v4, p0, Lcom/google/android/gms/internal/ads/s;->i:F

    long-to-float v0, v0

    div-float/2addr v0, v4

    float-to-long v0, v0

    add-long/2addr v2, v0

    sub-long v0, p1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v4, 0x1312d00

    cmp-long v0, v0, v4

    if-lez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s;->l()V

    goto :goto_0

    :cond_0
    move-wide p1, v2

    :cond_1
    :goto_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/s;->m:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/s;->n:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/s;->o:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s;->c:Lcom/google/android/gms/internal/ads/r;

    if-eqz v0, :cond_5

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/s;->k:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    if-nez v1, :cond_2

    goto :goto_3

    :cond_2
    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/r;->C:J

    cmp-long v2, v0, v3

    if-eqz v2, :cond_5

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/s;->k:J

    sub-long v4, p1, v0

    div-long/2addr v4, v2

    mul-long/2addr v4, v2

    add-long/2addr v0, v4

    cmp-long v4, p1, v0

    if-gtz v4, :cond_3

    sub-long v2, v0, v2

    goto :goto_1

    :cond_3
    add-long/2addr v2, v0

    move-wide v8, v0

    move-wide v0, v2

    move-wide v2, v8

    :goto_1
    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/s;->l:J

    sub-long v6, v0, p1

    sub-long/2addr p1, v2

    cmp-long p1, v6, p1

    if-gez p1, :cond_4

    goto :goto_2

    :cond_4
    move-wide v0, v2

    :goto_2
    sub-long/2addr v0, v4

    return-wide v0

    :cond_5
    :goto_3
    return-wide p1
.end method

.method public final c(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/s;->f:F

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/s;->a:Lcom/google/android/gms/internal/ads/yK0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/yK0;->f()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s;->m()V

    return-void
.end method

.method public final d(J)V
    .locals 4

    .prologue
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/s;->n:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/s;->p:J

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/s;->o:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/s;->q:J

    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/s;->m:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/s;->m:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s;->a:Lcom/google/android/gms/internal/ads/yK0;

    const-wide/16 v1, 0x3e8

    mul-long/2addr p1, v1

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/yK0;->e(J)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s;->m()V

    return-void
.end method

.method public final e(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/s;->i:F

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s;->l()V

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/s;->n(Z)V

    return-void
.end method

.method public final f()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s;->l()V

    return-void
.end method

.method public final g()V
    .locals 1

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/s;->d:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s;->l()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s;->b:Lcom/google/android/gms/internal/ads/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s;->c:Lcom/google/android/gms/internal/ads/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/r;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s;->b:Lcom/google/android/gms/internal/ads/q;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/q;->a()V

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/s;->n(Z)V

    return-void
.end method

.method public final h()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/s;->d:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s;->b:Lcom/google/android/gms/internal/ads/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/q;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s;->c:Lcom/google/android/gms/internal/ads/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/r;->c()V

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s;->k()V

    return-void
.end method

.method public final i(Landroid/view/Surface;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s;->e:Landroid/view/Surface;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s;->k()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/s;->e:Landroid/view/Surface;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/s;->n(Z)V

    return-void
.end method

.method public final j(I)V
    .locals 1

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/s;->j:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/s;->j:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/s;->n(Z)V

    return-void
.end method
