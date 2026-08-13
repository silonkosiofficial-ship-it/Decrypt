.class final Lcom/google/android/gms/internal/ads/Nw0;
.super Lcom/google/android/gms/internal/ads/Lw0;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Lw0;-><init>()V

    return-void
.end method


# virtual methods
.method final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/Jv0;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/Jv0;->zzt:Lcom/google/android/gms/internal/ads/Mw0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Mw0;->c()Lcom/google/android/gms/internal/ads/Mw0;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/Mw0;->f()Lcom/google/android/gms/internal/ads/Mw0;

    move-result-object v0

    iput-object v0, p1, Lcom/google/android/gms/internal/ads/Jv0;->zzt:Lcom/google/android/gms/internal/ads/Mw0;

    :cond_0
    return-object v0
.end method

.method final synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/Mw0;->f()Lcom/google/android/gms/internal/ads/Mw0;

    move-result-object v0

    return-object v0
.end method

.method final synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/Mw0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Mw0;->h()V

    return-object p1
.end method

.method final bridge synthetic d(Ljava/lang/Object;II)V
    .locals 0

    shl-int/lit8 p2, p2, 0x3

    check-cast p1, Lcom/google/android/gms/internal/ads/Mw0;

    or-int/lit8 p2, p2, 0x5

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/ads/Mw0;->j(ILjava/lang/Object;)V

    return-void
.end method

.method final bridge synthetic e(Ljava/lang/Object;IJ)V
    .locals 0

    shl-int/lit8 p2, p2, 0x3

    check-cast p1, Lcom/google/android/gms/internal/ads/Mw0;

    or-int/lit8 p2, p2, 0x1

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/ads/Mw0;->j(ILjava/lang/Object;)V

    return-void
.end method

.method final bridge synthetic f(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    shl-int/lit8 p2, p2, 0x3

    check-cast p1, Lcom/google/android/gms/internal/ads/Mw0;

    or-int/lit8 p2, p2, 0x3

    check-cast p3, Lcom/google/android/gms/internal/ads/Mw0;

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/ads/Mw0;->j(ILjava/lang/Object;)V

    return-void
.end method

.method final bridge synthetic g(Ljava/lang/Object;ILcom/google/android/gms/internal/ads/fv0;)V
    .locals 0

    shl-int/lit8 p2, p2, 0x3

    check-cast p1, Lcom/google/android/gms/internal/ads/Mw0;

    or-int/lit8 p2, p2, 0x2

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/ads/Mw0;->j(ILjava/lang/Object;)V

    return-void
.end method

.method final bridge synthetic h(Ljava/lang/Object;IJ)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/Mw0;

    shl-int/lit8 p2, p2, 0x3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/ads/Mw0;->j(ILjava/lang/Object;)V

    return-void
.end method

.method final i(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/Jv0;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/Jv0;->zzt:Lcom/google/android/gms/internal/ads/Mw0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Mw0;->h()V

    return-void
.end method

.method final synthetic j(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/google/android/gms/internal/ads/Mw0;

    check-cast p1, Lcom/google/android/gms/internal/ads/Jv0;

    iput-object p2, p1, Lcom/google/android/gms/internal/ads/Jv0;->zzt:Lcom/google/android/gms/internal/ads/Mw0;

    return-void
.end method
