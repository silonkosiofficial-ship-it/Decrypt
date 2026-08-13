.class final Lcom/google/android/gms/internal/ads/lJ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field private final C:Z

.field private final D:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/D;I)V
    .locals 2

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget p1, p1, Lcom/google/android/gms/internal/ads/D;->e:I

    const/4 v0, 0x1

    and-int/2addr p1, v0

    const/4 v1, 0x0

    if-eq v0, p1, :cond_0

    move v0, v1

    :cond_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/lJ0;->C:Z

    invoke-static {p2, v1}, Lcom/google/android/gms/internal/ads/BB0;->a(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/lJ0;->D:Z

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/lJ0;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/lJ0;->e(Lcom/google/android/gms/internal/ads/lJ0;)I

    move-result p1

    return p1
.end method

.method public final e(Lcom/google/android/gms/internal/ads/lJ0;)I
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/ads/Rh0;->i()Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/lJ0;->D:Z

    iget-boolean v2, p1, Lcom/google/android/gms/internal/ads/lJ0;->D:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Rh0;->d(ZZ)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/lJ0;->C:Z

    iget-boolean p1, p1, Lcom/google/android/gms/internal/ads/lJ0;->C:Z

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Rh0;->d(ZZ)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Rh0;->a()I

    move-result p1

    return p1
.end method
