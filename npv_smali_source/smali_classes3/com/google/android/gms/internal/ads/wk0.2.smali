.class abstract Lcom/google/android/gms/internal/ads/wk0;
.super Lcom/google/android/gms/internal/ads/mk0;
.source "SourceFile"


# instance fields
.field private R:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Xh0;Z)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/mk0;-><init>(Lcom/google/android/gms/internal/ads/Xh0;ZZ)V

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/ti0;->a(I)Ljava/util/ArrayList;

    move-result-object p2

    :goto_0
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/wk0;->R:Ljava/util/List;

    return-void
.end method


# virtual methods
.method final R(ILjava/lang/Object;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wk0;->R:Ljava/util/List;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/vk0;

    invoke-direct {v1, p2}, Lcom/google/android/gms/internal/ads/vk0;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method final S()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wk0;->R:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/wk0;->X(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/ak0;->f(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method final W(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/mk0;->W(I)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wk0;->R:Ljava/util/List;

    return-void
.end method

.method abstract X(Ljava/util/List;)Ljava/lang/Object;
.end method
