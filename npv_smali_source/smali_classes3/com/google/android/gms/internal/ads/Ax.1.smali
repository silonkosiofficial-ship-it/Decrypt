.class public final Lcom/google/android/gms/internal/ads/Ax;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/CharSequence;

.field private b:Landroid/graphics/Bitmap;

.field private c:Landroid/text/Layout$Alignment;

.field private d:Landroid/text/Layout$Alignment;

.field private e:F

.field private f:I

.field private g:I

.field private h:F

.field private i:I

.field private j:I

.field private k:F

.field private l:F

.field private m:F

.field private n:I

.field private o:F


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Ax;->a:Ljava/lang/CharSequence;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Ax;->b:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Ax;->c:Landroid/text/Layout$Alignment;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Ax;->d:Landroid/text/Layout$Alignment;

    const v0, -0x800001

    iput v0, p0, Lcom/google/android/gms/internal/ads/Ax;->e:F

    const/high16 v1, -0x80000000

    iput v1, p0, Lcom/google/android/gms/internal/ads/Ax;->f:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/Ax;->g:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Ax;->h:F

    iput v1, p0, Lcom/google/android/gms/internal/ads/Ax;->i:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/Ax;->j:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Ax;->k:F

    iput v0, p0, Lcom/google/android/gms/internal/ads/Ax;->l:F

    iput v0, p0, Lcom/google/android/gms/internal/ads/Ax;->m:F

    iput v1, p0, Lcom/google/android/gms/internal/ads/Ax;->n:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Dy;Lcom/google/android/gms/internal/ads/cy;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/Dy;->a:Ljava/lang/CharSequence;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ax;->a:Ljava/lang/CharSequence;

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/Dy;->d:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ax;->b:Landroid/graphics/Bitmap;

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/Dy;->b:Landroid/text/Layout$Alignment;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ax;->c:Landroid/text/Layout$Alignment;

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/Dy;->c:Landroid/text/Layout$Alignment;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ax;->d:Landroid/text/Layout$Alignment;

    iget p2, p1, Lcom/google/android/gms/internal/ads/Dy;->e:F

    iput p2, p0, Lcom/google/android/gms/internal/ads/Ax;->e:F

    iget p2, p1, Lcom/google/android/gms/internal/ads/Dy;->f:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/Ax;->f:I

    iget p2, p1, Lcom/google/android/gms/internal/ads/Dy;->g:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/Ax;->g:I

    iget p2, p1, Lcom/google/android/gms/internal/ads/Dy;->h:F

    iput p2, p0, Lcom/google/android/gms/internal/ads/Ax;->h:F

    iget p2, p1, Lcom/google/android/gms/internal/ads/Dy;->i:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/Ax;->i:I

    iget p2, p1, Lcom/google/android/gms/internal/ads/Dy;->l:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/Ax;->j:I

    iget p2, p1, Lcom/google/android/gms/internal/ads/Dy;->m:F

    iput p2, p0, Lcom/google/android/gms/internal/ads/Ax;->k:F

    iget p2, p1, Lcom/google/android/gms/internal/ads/Dy;->j:F

    iput p2, p0, Lcom/google/android/gms/internal/ads/Ax;->l:F

    iget p2, p1, Lcom/google/android/gms/internal/ads/Dy;->k:F

    iput p2, p0, Lcom/google/android/gms/internal/ads/Ax;->m:F

    iget p2, p1, Lcom/google/android/gms/internal/ads/Dy;->n:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/Ax;->n:I

    iget p1, p1, Lcom/google/android/gms/internal/ads/Dy;->o:F

    iput p1, p0, Lcom/google/android/gms/internal/ads/Ax;->o:F

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Ax;->g:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Ax;->i:I

    return v0
.end method

.method public final c(Landroid/graphics/Bitmap;)Lcom/google/android/gms/internal/ads/Ax;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ax;->b:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public final d(F)Lcom/google/android/gms/internal/ads/Ax;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/Ax;->m:F

    return-object p0
.end method

.method public final e(FI)Lcom/google/android/gms/internal/ads/Ax;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/Ax;->e:F

    iput p2, p0, Lcom/google/android/gms/internal/ads/Ax;->f:I

    return-object p0
.end method

.method public final f(I)Lcom/google/android/gms/internal/ads/Ax;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/Ax;->g:I

    return-object p0
.end method

.method public final g(Landroid/text/Layout$Alignment;)Lcom/google/android/gms/internal/ads/Ax;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ax;->d:Landroid/text/Layout$Alignment;

    return-object p0
.end method

.method public final h(F)Lcom/google/android/gms/internal/ads/Ax;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/Ax;->h:F

    return-object p0
.end method

.method public final i(I)Lcom/google/android/gms/internal/ads/Ax;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/Ax;->i:I

    return-object p0
.end method

.method public final j(F)Lcom/google/android/gms/internal/ads/Ax;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/Ax;->o:F

    return-object p0
.end method

.method public final k(F)Lcom/google/android/gms/internal/ads/Ax;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/Ax;->l:F

    return-object p0
.end method

.method public final l(Ljava/lang/CharSequence;)Lcom/google/android/gms/internal/ads/Ax;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ax;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final m(Landroid/text/Layout$Alignment;)Lcom/google/android/gms/internal/ads/Ax;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ax;->c:Landroid/text/Layout$Alignment;

    return-object p0
.end method

.method public final n(FI)Lcom/google/android/gms/internal/ads/Ax;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/Ax;->k:F

    iput p2, p0, Lcom/google/android/gms/internal/ads/Ax;->j:I

    return-object p0
.end method

.method public final o(I)Lcom/google/android/gms/internal/ads/Ax;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/Ax;->n:I

    return-object p0
.end method

.method public final p()Lcom/google/android/gms/internal/ads/Dy;
    .locals 21

    move-object/from16 v0, p0

    new-instance v20, Lcom/google/android/gms/internal/ads/Dy;

    move-object/from16 v1, v20

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/Ax;->a:Ljava/lang/CharSequence;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/Ax;->c:Landroid/text/Layout$Alignment;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/Ax;->d:Landroid/text/Layout$Alignment;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/Ax;->b:Landroid/graphics/Bitmap;

    iget v6, v0, Lcom/google/android/gms/internal/ads/Ax;->e:F

    iget v7, v0, Lcom/google/android/gms/internal/ads/Ax;->f:I

    iget v8, v0, Lcom/google/android/gms/internal/ads/Ax;->g:I

    iget v9, v0, Lcom/google/android/gms/internal/ads/Ax;->h:F

    iget v10, v0, Lcom/google/android/gms/internal/ads/Ax;->i:I

    iget v11, v0, Lcom/google/android/gms/internal/ads/Ax;->j:I

    iget v12, v0, Lcom/google/android/gms/internal/ads/Ax;->k:F

    iget v13, v0, Lcom/google/android/gms/internal/ads/Ax;->l:F

    iget v14, v0, Lcom/google/android/gms/internal/ads/Ax;->m:F

    iget v15, v0, Lcom/google/android/gms/internal/ads/Ax;->n:I

    move/from16 v17, v15

    iget v15, v0, Lcom/google/android/gms/internal/ads/Ax;->o:F

    move/from16 v18, v15

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/high16 v16, -0x1000000

    invoke-direct/range {v1 .. v19}, Lcom/google/android/gms/internal/ads/Dy;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIFLcom/google/android/gms/internal/ads/cy;)V

    return-object v20
.end method

.method public final q()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ax;->a:Ljava/lang/CharSequence;

    return-object v0
.end method
