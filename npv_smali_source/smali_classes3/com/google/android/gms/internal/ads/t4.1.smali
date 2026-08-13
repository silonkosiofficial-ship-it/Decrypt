.class public final Lcom/google/android/gms/internal/ads/t4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/w0;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/w0;

.field private final D:Lcom/google/android/gms/internal/ads/q4;

.field private final E:Landroid/util/SparseArray;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/w0;Lcom/google/android/gms/internal/ads/q4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/t4;->C:Lcom/google/android/gms/internal/ads/w0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/t4;->D:Lcom/google/android/gms/internal/ads/q4;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/t4;->E:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public final Q()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t4;->C:Lcom/google/android/gms/internal/ads/w0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/w0;->Q()V

    return-void
.end method

.method public final R(Lcom/google/android/gms/internal/ads/T0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t4;->C:Lcom/google/android/gms/internal/ads/w0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/w0;->R(Lcom/google/android/gms/internal/ads/T0;)V

    return-void
.end method

.method public final S(II)Lcom/google/android/gms/internal/ads/a1;
    .locals 2

    .prologue
    const/4 v0, 0x3

    if-eq p2, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t4;->C:Lcom/google/android/gms/internal/ads/w0;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/t4;->E:Landroid/util/SparseArray;

    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/v4;

    if-eqz p2, :cond_1

    return-object p2

    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/t4;->C:Lcom/google/android/gms/internal/ads/w0;

    new-instance v1, Lcom/google/android/gms/internal/ads/v4;

    invoke-interface {p2, p1, v0}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t4;->D:Lcom/google/android/gms/internal/ads/q4;

    invoke-direct {v1, p2, v0}, Lcom/google/android/gms/internal/ads/v4;-><init>(Lcom/google/android/gms/internal/ads/a1;Lcom/google/android/gms/internal/ads/q4;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/t4;->E:Landroid/util/SparseArray;

    invoke-virtual {p2, p1, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object v1
.end method
