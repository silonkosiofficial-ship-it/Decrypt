.class final Lcom/google/android/gms/internal/ads/Qi0;
.super Lcom/google/android/gms/internal/ads/ci0;
.source "SourceFile"


# instance fields
.field final synthetic F:Lcom/google/android/gms/internal/ads/Ri0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Ri0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Qi0;->F:Lcom/google/android/gms/internal/ads/Ri0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ci0;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Qi0;->F:Lcom/google/android/gms/internal/ads/Ri0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Ri0;->Y(Lcom/google/android/gms/internal/ads/Ri0;)I

    move-result v0

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/Ag0;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Qi0;->F:Lcom/google/android/gms/internal/ads/Ri0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Ri0;->Z(Lcom/google/android/gms/internal/ads/Ri0;)[Ljava/lang/Object;

    move-result-object v0

    add-int/2addr p1, p1

    aget-object v0, v0, p1

    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Qi0;->F:Lcom/google/android/gms/internal/ads/Ri0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Ri0;->Z(Lcom/google/android/gms/internal/ads/Ri0;)[Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v1, p1

    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-direct {v1, v0, p1}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public final o()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Qi0;->F:Lcom/google/android/gms/internal/ads/Ri0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Ri0;->Y(Lcom/google/android/gms/internal/ads/Ri0;)I

    move-result v0

    return v0
.end method
