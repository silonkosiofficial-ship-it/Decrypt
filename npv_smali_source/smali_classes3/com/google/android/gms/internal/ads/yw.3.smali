.class public final Lcom/google/android/gms/internal/ads/yw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Vu;


# instance fields
.field private b:I

.field private c:F

.field private d:F

.field private e:Lcom/google/android/gms/internal/ads/Rt;

.field private f:Lcom/google/android/gms/internal/ads/Rt;

.field private g:Lcom/google/android/gms/internal/ads/Rt;

.field private h:Lcom/google/android/gms/internal/ads/Rt;

.field private i:Z

.field private j:Lcom/google/android/gms/internal/ads/Xv;

.field private k:Ljava/nio/ByteBuffer;

.field private l:Ljava/nio/ShortBuffer;

.field private m:Ljava/nio/ByteBuffer;

.field private n:J

.field private o:J

.field private p:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/google/android/gms/internal/ads/yw;->c:F

    iput v0, p0, Lcom/google/android/gms/internal/ads/yw;->d:F

    sget-object v0, Lcom/google/android/gms/internal/ads/Rt;->e:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->e:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->f:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->g:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->h:Lcom/google/android/gms/internal/ads/Rt;

    sget-object v0, Lcom/google/android/gms/internal/ads/Vu;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->k:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/yw;->l:Ljava/nio/ShortBuffer;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->m:Ljava/nio/ByteBuffer;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/yw;->b:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/nio/ByteBuffer;)V
    .locals 7

    .prologue
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->j:Lcom/google/android/gms/internal/ads/Xv;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v1

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/yw;->n:J

    int-to-long v5, v2

    add-long/2addr v3, v5

    iput-wide v3, p0, Lcom/google/android/gms/internal/ads/yw;->n:J

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Xv;->f(Ljava/nio/ShortBuffer;)V

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v0

    add-int/2addr v0, v2

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method

.method public final b()Ljava/nio/ByteBuffer;
    .locals 6

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->j:Lcom/google/android/gms/internal/ads/Xv;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Xv;->a()I

    move-result v1

    if-lez v1, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/yw;->k:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    move-result v2

    if-ge v2, v1, :cond_0

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/yw;->k:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/yw;->l:Ljava/nio/ShortBuffer;

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/yw;->k:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/yw;->l:Ljava/nio/ShortBuffer;

    invoke-virtual {v2}, Ljava/nio/ShortBuffer;->clear()Ljava/nio/Buffer;

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/yw;->l:Ljava/nio/ShortBuffer;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/Xv;->d(Ljava/nio/ShortBuffer;)V

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/yw;->o:J

    int-to-long v4, v1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/yw;->o:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->k:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->k:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->m:Ljava/nio/ByteBuffer;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->m:Ljava/nio/ByteBuffer;

    sget-object v1, Lcom/google/android/gms/internal/ads/Vu;->a:Ljava/nio/ByteBuffer;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/yw;->m:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final c()V
    .locals 9

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/yw;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->e:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->g:Lcom/google/android/gms/internal/ads/Rt;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/yw;->f:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/yw;->h:Lcom/google/android/gms/internal/ads/Rt;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/yw;->i:Z

    if-eqz v2, :cond_0

    new-instance v2, Lcom/google/android/gms/internal/ads/Xv;

    iget v4, v0, Lcom/google/android/gms/internal/ads/Rt;->a:I

    iget v5, v0, Lcom/google/android/gms/internal/ads/Rt;->b:I

    iget v6, p0, Lcom/google/android/gms/internal/ads/yw;->c:F

    iget v7, p0, Lcom/google/android/gms/internal/ads/yw;->d:F

    iget v8, v1, Lcom/google/android/gms/internal/ads/Rt;->a:I

    move-object v3, v2

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/ads/Xv;-><init>(IIFFI)V

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/yw;->j:Lcom/google/android/gms/internal/ads/Xv;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->j:Lcom/google/android/gms/internal/ads/Xv;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Xv;->c()V

    :cond_1
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Vu;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->m:Ljava/nio/ByteBuffer;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/yw;->n:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/yw;->o:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/yw;->p:Z

    return-void
.end method

.method public final d(Lcom/google/android/gms/internal/ads/Rt;)Lcom/google/android/gms/internal/ads/Rt;
    .locals 3

    .prologue
    iget v0, p1, Lcom/google/android/gms/internal/ads/Rt;->c:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/ads/yw;->b:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    iget v0, p1, Lcom/google/android/gms/internal/ads/Rt;->a:I

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yw;->e:Lcom/google/android/gms/internal/ads/Rt;

    new-instance v2, Lcom/google/android/gms/internal/ads/Rt;

    iget p1, p1, Lcom/google/android/gms/internal/ads/Rt;->b:I

    invoke-direct {v2, v0, p1, v1}, Lcom/google/android/gms/internal/ads/Rt;-><init>(III)V

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/yw;->f:Lcom/google/android/gms/internal/ads/Rt;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/yw;->i:Z

    return-object v2

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/uu;

    const-string v1, "Unhandled input format:"

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/uu;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/Rt;)V

    throw v0
.end method

.method public final e()V
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/google/android/gms/internal/ads/yw;->c:F

    iput v0, p0, Lcom/google/android/gms/internal/ads/yw;->d:F

    sget-object v0, Lcom/google/android/gms/internal/ads/Rt;->e:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->e:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->f:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->g:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->h:Lcom/google/android/gms/internal/ads/Rt;

    sget-object v0, Lcom/google/android/gms/internal/ads/Vu;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->k:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/yw;->l:Ljava/nio/ShortBuffer;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->m:Ljava/nio/ByteBuffer;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/yw;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/yw;->i:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/yw;->j:Lcom/google/android/gms/internal/ads/Xv;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/yw;->n:J

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/yw;->o:J

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/yw;->p:Z

    return-void
.end method

.method public final f()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->j:Lcom/google/android/gms/internal/ads/Xv;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Xv;->e()V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/yw;->p:Z

    return-void
.end method

.method public final g()Z
    .locals 3

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/yw;->p:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->j:Lcom/google/android/gms/internal/ads/Xv;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Xv;->a()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    move v1, v2

    :cond_2
    :goto_0
    return v1
.end method

.method public final h(J)J
    .locals 16

    .prologue
    move-object/from16 v0, p0

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/yw;->o:J

    const-wide/16 v1, 0x400

    cmp-long v1, v5, v1

    if-ltz v1, :cond_1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/yw;->n:J

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/yw;->j:Lcom/google/android/gms/internal/ads/Xv;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Xv;->b()I

    move-result v3

    int-to-long v3, v3

    sub-long v3, v1, v3

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/yw;->h:Lcom/google/android/gms/internal/ads/Rt;

    iget v1, v1, Lcom/google/android/gms/internal/ads/Rt;->a:I

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/yw;->g:Lcom/google/android/gms/internal/ads/Rt;

    iget v2, v2, Lcom/google/android/gms/internal/ads/Rt;->a:I

    if-ne v1, v2, :cond_0

    sget-object v7, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    move-wide/from16 v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/EW;->M(JJJLjava/math/RoundingMode;)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    int-to-long v7, v1

    mul-long v11, v3, v7

    int-to-long v1, v2

    mul-long v13, v5, v1

    sget-object v15, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    move-wide/from16 v9, p1

    invoke-static/range {v9 .. v15}, Lcom/google/android/gms/internal/ads/EW;->M(JJJLjava/math/RoundingMode;)J

    move-result-wide v1

    :goto_0
    return-wide v1

    :cond_1
    iget v1, v0, Lcom/google/android/gms/internal/ads/yw;->c:F

    float-to-double v1, v1

    move-wide/from16 v3, p1

    long-to-double v3, v3

    mul-double/2addr v1, v3

    double-to-long v1, v1

    return-wide v1
.end method

.method public final i()Z
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->f:Lcom/google/android/gms/internal/ads/Rt;

    iget v0, v0, Lcom/google/android/gms/internal/ads/Rt;->a:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    iget v0, p0, Lcom/google/android/gms/internal/ads/yw;->c:F

    const/high16 v1, -0x40800000    # -1.0f

    add-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v3, 0x38d1b717    # 1.0E-4f

    cmpl-float v0, v0, v3

    const/4 v4, 0x1

    if-gez v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/ads/yw;->d:F

    add-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float v0, v0, v3

    if-gez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yw;->f:Lcom/google/android/gms/internal/ads/Rt;

    iget v0, v0, Lcom/google/android/gms/internal/ads/Rt;->a:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/yw;->e:Lcom/google/android/gms/internal/ads/Rt;

    iget v1, v1, Lcom/google/android/gms/internal/ads/Rt;->a:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return v4

    :cond_1
    move v2, v4

    :cond_2
    :goto_0
    return v2
.end method

.method public final j(F)V
    .locals 1

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/yw;->d:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/ads/yw;->d:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/yw;->i:Z

    :cond_0
    return-void
.end method

.method public final k(F)V
    .locals 1

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/yw;->c:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/ads/yw;->c:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/yw;->i:Z

    :cond_0
    return-void
.end method
