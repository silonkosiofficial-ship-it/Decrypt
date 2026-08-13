.class final Lcom/google/android/gms/internal/ads/Xu0;
.super Lcom/google/android/gms/internal/ads/Yu0;
.source "SourceFile"


# instance fields
.field private C:I

.field private final D:I

.field final synthetic E:Lcom/google/android/gms/internal/ads/fv0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/fv0;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Xu0;->E:Lcom/google/android/gms/internal/ads/fv0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Yu0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/Xu0;->C:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fv0;->n()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/Xu0;->D:I

    return-void
.end method


# virtual methods
.method public final a()B
    .locals 2

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/Xu0;->C:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/Xu0;->D:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/android/gms/internal/ads/Xu0;->C:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Xu0;->E:Lcom/google/android/gms/internal/ads/fv0;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/fv0;->f(I)B

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/Xu0;->C:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/Xu0;->D:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
