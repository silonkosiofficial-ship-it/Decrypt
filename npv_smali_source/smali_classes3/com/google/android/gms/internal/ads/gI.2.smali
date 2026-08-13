.class final Lcom/google/android/gms/internal/ads/gI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/jA;


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/util/Map;

.field private final c:Ljava/util/Map;

.field private final d:Lcom/google/android/gms/internal/ads/rz0;

.field private final e:Lcom/google/android/gms/internal/ads/pJ;


# direct methods
.method constructor <init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/pJ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gI;->a:Ljava/util/Map;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/gI;->b:Ljava/util/Map;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/gI;->c:Ljava/util/Map;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/gI;->d:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/gI;->e:Lcom/google/android/gms/internal/ads/pJ;

    return-void
.end method


# virtual methods
.method public final f(ILjava/lang/String;)Lcom/google/android/gms/internal/ads/VT;
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gI;->a:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/VT;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_3

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    return-object v1

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/gI;->c:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/mV;

    if-eqz p1, :cond_2

    new-instance v1, Lcom/google/android/gms/internal/ads/WT;

    new-instance p2, Lcom/google/android/gms/internal/ads/lA;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/lA;-><init>()V

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/ads/WT;-><init>(Lcom/google/android/gms/internal/ads/VT;Lcom/google/android/gms/internal/ads/pg0;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/gI;->b:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/VT;

    if-nez p1, :cond_5

    :goto_0
    return-object v1

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gI;->e:Lcom/google/android/gms/internal/ads/pJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pJ;->e()Lcom/google/android/gms/internal/ads/Zh;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gI;->d:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/jA;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/jA;->f(ILjava/lang/String;)Lcom/google/android/gms/internal/ads/VT;

    move-result-object p1

    if-nez p1, :cond_5

    :goto_1
    return-object v1

    :cond_5
    new-instance p2, Lcom/google/android/gms/internal/ads/WT;

    new-instance v0, Lcom/google/android/gms/internal/ads/mA;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/mA;-><init>()V

    invoke-direct {p2, p1, v0}, Lcom/google/android/gms/internal/ads/WT;-><init>(Lcom/google/android/gms/internal/ads/VT;Lcom/google/android/gms/internal/ads/pg0;)V

    return-object p2
.end method
