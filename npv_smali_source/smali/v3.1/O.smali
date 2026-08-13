.class public final Lv3/O;
.super Lcom/google/android/gms/internal/ads/d7;
.source "SourceFile"


# instance fields
.field private final O:Lcom/google/android/gms/internal/ads/mr;

.field private final P:Lw3/m;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/ads/mr;)V
    .locals 1

    new-instance p2, Lv3/N;

    invoke-direct {p2, p3}, Lv3/N;-><init>(Lcom/google/android/gms/internal/ads/mr;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/internal/ads/d7;-><init>(ILjava/lang/String;Lcom/google/android/gms/internal/ads/f7;)V

    iput-object p3, p0, Lv3/O;->O:Lcom/google/android/gms/internal/ads/mr;

    new-instance p2, Lw3/m;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Lw3/m;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lv3/O;->P:Lw3/m;

    const-string v0, "GET"

    invoke-virtual {p2, p1, v0, p3, p3}, Lw3/m;->d(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[B)V

    return-void
.end method


# virtual methods
.method protected final q(Lcom/google/android/gms/internal/ads/Z6;)Lcom/google/android/gms/internal/ads/h7;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/z7;->b(Lcom/google/android/gms/internal/ads/Z6;)Lcom/google/android/gms/internal/ads/M6;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/h7;->b(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/M6;)Lcom/google/android/gms/internal/ads/h7;

    move-result-object p1

    return-object p1
.end method

.method protected final bridge synthetic x(Ljava/lang/Object;)V
    .locals 3

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/Z6;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/Z6;->c:Ljava/util/Map;

    iget v1, p1, Lcom/google/android/gms/internal/ads/Z6;->a:I

    iget-object v2, p0, Lv3/O;->P:Lw3/m;

    invoke-virtual {v2, v0, v1}, Lw3/m;->f(Ljava/util/Map;I)V

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/Z6;->b:[B

    invoke-static {}, Lw3/m;->k()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lv3/O;->P:Lw3/m;

    invoke-virtual {v1, v0}, Lw3/m;->h([B)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lv3/O;->O:Lcom/google/android/gms/internal/ads/mr;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/mr;->c(Ljava/lang/Object;)Z

    return-void
.end method
