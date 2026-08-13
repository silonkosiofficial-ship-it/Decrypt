.class final Lcom/google/android/gms/internal/ads/YH0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/IJ0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/IJ0;

.field private final b:Lcom/google/android/gms/internal/ads/Pm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/IJ0;Lcom/google/android/gms/internal/ads/Pm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/YH0;->a:Lcom/google/android/gms/internal/ads/IJ0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/YH0;->b:Lcom/google/android/gms/internal/ads/Pm;

    return-void
.end method


# virtual methods
.method public final F(I)Lcom/google/android/gms/internal/ads/D;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/YH0;->a:Lcom/google/android/gms/internal/ads/IJ0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/YH0;->b:Lcom/google/android/gms/internal/ads/Pm;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/MJ0;->r(I)I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/Pm;->b(I)Lcom/google/android/gms/internal/ads/D;

    move-result-object p1

    return-object p1
.end method

.method public final G(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/YH0;->a:Lcom/google/android/gms/internal/ads/IJ0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/MJ0;->G(I)I

    move-result p1

    return p1
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/YH0;->a:Lcom/google/android/gms/internal/ads/IJ0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/IJ0;->b()I

    move-result v0

    return v0
.end method

.method public final e()Lcom/google/android/gms/internal/ads/D;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/YH0;->a:Lcom/google/android/gms/internal/ads/IJ0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/YH0;->b:Lcom/google/android/gms/internal/ads/Pm;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/IJ0;->b()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/Pm;->b(I)Lcom/google/android/gms/internal/ads/D;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/ads/YH0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ads/YH0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/YH0;->a:Lcom/google/android/gms/internal/ads/IJ0;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/YH0;->a:Lcom/google/android/gms/internal/ads/IJ0;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/YH0;->b:Lcom/google/android/gms/internal/ads/Pm;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/YH0;->b:Lcom/google/android/gms/internal/ads/Pm;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/Pm;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final f()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/YH0;->a:Lcom/google/android/gms/internal/ads/IJ0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/MJ0;->f()I

    move-result v0

    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/YH0;->b:Lcom/google/android/gms/internal/ads/Pm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Pm;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/YH0;->a:Lcom/google/android/gms/internal/ads/IJ0;

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Lcom/google/android/gms/internal/ads/Pm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/YH0;->b:Lcom/google/android/gms/internal/ads/Pm;

    return-object v0
.end method

.method public final r(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/YH0;->a:Lcom/google/android/gms/internal/ads/IJ0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/MJ0;->r(I)I

    move-result p1

    return p1
.end method
