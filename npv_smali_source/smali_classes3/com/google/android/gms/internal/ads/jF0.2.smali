.class final Lcom/google/android/gms/internal/ads/jF0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/D;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:Lcom/google/android/gms/internal/ads/qt;

.field public final j:Z

.field public final k:Z

.field public final l:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/D;IIIIIIILcom/google/android/gms/internal/ads/qt;ZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jF0;->a:Lcom/google/android/gms/internal/ads/D;

    iput p2, p0, Lcom/google/android/gms/internal/ads/jF0;->b:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/jF0;->c:I

    iput p4, p0, Lcom/google/android/gms/internal/ads/jF0;->d:I

    iput p5, p0, Lcom/google/android/gms/internal/ads/jF0;->e:I

    iput p6, p0, Lcom/google/android/gms/internal/ads/jF0;->f:I

    iput p7, p0, Lcom/google/android/gms/internal/ads/jF0;->g:I

    iput p8, p0, Lcom/google/android/gms/internal/ads/jF0;->h:I

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/jF0;->i:Lcom/google/android/gms/internal/ads/qt;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/jF0;->j:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/jF0;->k:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/jF0;->l:Z

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/LE0;
    .locals 9

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/jF0;->c:I

    new-instance v8, Lcom/google/android/gms/internal/ads/LE0;

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    move v6, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move v6, v0

    :goto_0
    iget v4, p0, Lcom/google/android/gms/internal/ads/jF0;->f:I

    iget v3, p0, Lcom/google/android/gms/internal/ads/jF0;->e:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/jF0;->g:I

    const/4 v5, 0x0

    iget v7, p0, Lcom/google/android/gms/internal/ads/jF0;->h:I

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/LE0;-><init>(IIIZZI)V

    return-object v8
.end method
