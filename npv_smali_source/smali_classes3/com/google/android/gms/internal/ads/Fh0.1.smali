.class abstract Lcom/google/android/gms/internal/ads/Fh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field C:I

.field D:I

.field E:I

.field final synthetic F:Lcom/google/android/gms/internal/ads/Kh0;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Kh0;Lcom/google/android/gms/internal/ads/Jh0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Fh0;->F:Lcom/google/android/gms/internal/ads/Kh0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Kh0;->d(Lcom/google/android/gms/internal/ads/Kh0;)I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/Fh0;->C:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Kh0;->h()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/Fh0;->D:I

    const/4 p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/Fh0;->E:I

    return-void
.end method

.method private final c()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fh0;->F:Lcom/google/android/gms/internal/ads/Kh0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Kh0;->d(Lcom/google/android/gms/internal/ads/Kh0;)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/Fh0;->C:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method


# virtual methods
.method abstract b(I)Ljava/lang/Object;
.end method

.method public final hasNext()Z
    .locals 1

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/Fh0;->D:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Fh0;->c()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fh0;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/Fh0;->D:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Fh0;->E:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/Fh0;->b(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Fh0;->F:Lcom/google/android/gms/internal/ads/Kh0;

    iget v2, p0, Lcom/google/android/gms/internal/ads/Fh0;->D:I

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/Kh0;->j(I)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/Fh0;->D:I

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Fh0;->c()V

    iget v0, p0, Lcom/google/android/gms/internal/ads/Fh0;->E:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "no calls to next() since the last call to remove()"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/Ag0;->m(ZLjava/lang/Object;)V

    iget v0, p0, Lcom/google/android/gms/internal/ads/Fh0;->C:I

    add-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/google/android/gms/internal/ads/Fh0;->C:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/Fh0;->E:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Fh0;->F:Lcom/google/android/gms/internal/ads/Kh0;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/Kh0;->k(Lcom/google/android/gms/internal/ads/Kh0;I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/Kh0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lcom/google/android/gms/internal/ads/Fh0;->D:I

    const/4 v1, -0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/Fh0;->D:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/Fh0;->E:I

    return-void
.end method
