.class final Lcom/google/android/gms/internal/ads/Ri0;
.super Lcom/google/android/gms/internal/ads/hi0;
.source "SourceFile"


# instance fields
.field private final transient E:Lcom/google/android/gms/internal/ads/fi0;

.field private final transient F:[Ljava/lang/Object;

.field private final transient G:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/fi0;[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/hi0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ri0;->E:Lcom/google/android/gms/internal/ads/fi0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ri0;->F:[Ljava/lang/Object;

    iput p4, p0, Lcom/google/android/gms/internal/ads/Ri0;->G:I

    return-void
.end method

.method static bridge synthetic Y(Lcom/google/android/gms/internal/ads/Ri0;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/Ri0;->G:I

    return p0
.end method

.method static bridge synthetic Z(Lcom/google/android/gms/internal/ads/Ri0;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Ri0;->F:[Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method final C()Lcom/google/android/gms/internal/ads/ci0;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Qi0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/Qi0;-><init>(Lcom/google/android/gms/internal/ads/Ri0;)V

    return-object v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Ri0;->E:Lcom/google/android/gms/internal/ads/fi0;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/fi0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method final d([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Xh0;->g()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Xh0;->d([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Xh0;->g()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ci0;->V(I)Lcom/google/android/gms/internal/ads/kj0;

    move-result-object v0

    return-object v0
.end method

.method public final n()Lcom/google/android/gms/internal/ads/jj0;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Xh0;->g()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ci0;->V(I)Lcom/google/android/gms/internal/ads/kj0;

    move-result-object v0

    return-object v0
.end method

.method final o()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Ri0;->G:I

    return v0
.end method
