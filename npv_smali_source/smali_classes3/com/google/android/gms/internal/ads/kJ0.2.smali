.class final Lcom/google/android/gms/internal/ads/kJ0;
.super Lcom/google/android/gms/internal/ads/BJ0;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field private final G:I

.field private final H:I


# direct methods
.method public constructor <init>(ILcom/google/android/gms/internal/ads/Pm;ILcom/google/android/gms/internal/ads/nJ0;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/BJ0;-><init>(ILcom/google/android/gms/internal/ads/Pm;I)V

    iget-boolean p1, p4, Lcom/google/android/gms/internal/ads/nJ0;->O:Z

    invoke-static {p5, p1}, Lcom/google/android/gms/internal/ads/BB0;->a(IZ)Z

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/kJ0;->G:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/D;->a()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/kJ0;->H:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/kJ0;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/kJ0;->i(Lcom/google/android/gms/internal/ads/kJ0;)I

    move-result p1

    return p1
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/kJ0;->G:I

    return v0
.end method

.method public final bridge synthetic g(Lcom/google/android/gms/internal/ads/BJ0;)Z
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/kJ0;

    const/4 p1, 0x0

    return p1
.end method

.method public final i(Lcom/google/android/gms/internal/ads/kJ0;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/kJ0;->H:I

    iget p1, p1, Lcom/google/android/gms/internal/ads/kJ0;->H:I

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
