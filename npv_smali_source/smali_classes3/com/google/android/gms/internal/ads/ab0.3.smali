.class public final Lcom/google/android/gms/internal/ads/ab0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/eO;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/eO;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ab0;->a:Lcom/google/android/gms/internal/ads/eO;

    return-void
.end method

.method private final g(Lk3/c;Lj$/util/Optional;Ljava/lang/String;JLj$/util/Optional;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ab0;->a:Lcom/google/android/gms/internal/ads/eO;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eO;->a()Lcom/google/android/gms/internal/ads/dO;

    move-result-object v0

    invoke-static {p4, p5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p3, p4}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    if-nez p1, :cond_0

    const-string p1, "unknown"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    :goto_0
    const-string p3, "ad_format"

    invoke-virtual {v0, p3, p1}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    new-instance p1, Lcom/google/android/gms/internal/ads/Ya0;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/Ya0;-><init>(Lcom/google/android/gms/internal/ads/dO;)V

    invoke-virtual {p2, p1}, Lj$/util/Optional;->ifPresent(Ljava/util/function/Consumer;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/Za0;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/Za0;-><init>(Lcom/google/android/gms/internal/ads/dO;)V

    invoke-virtual {p6, p1}, Lj$/util/Optional;->ifPresent(Ljava/util/function/Consumer;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dO;->g()V

    return-void
.end method


# virtual methods
.method public final a(Lk3/c;JLj$/util/Optional;Lj$/util/Optional;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ab0;->a:Lcom/google/android/gms/internal/ads/eO;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eO;->a()Lcom/google/android/gms/internal/ads/dO;

    move-result-object v0

    const-string v1, "plaac_ts"

    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    const-string p2, "ad_format"

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    const-string p1, "action"

    const-string p2, "is_ad_available"

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    new-instance p1, Lcom/google/android/gms/internal/ads/Wa0;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/Wa0;-><init>(Lcom/google/android/gms/internal/ads/dO;)V

    invoke-virtual {p4, p1}, Lj$/util/Optional;->ifPresent(Ljava/util/function/Consumer;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/Xa0;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/Xa0;-><init>(Lcom/google/android/gms/internal/ads/dO;)V

    invoke-virtual {p5, p1}, Lj$/util/Optional;->ifPresent(Ljava/util/function/Consumer;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dO;->g()V

    return-void
.end method

.method public final b(Lk3/c;JLj$/util/Optional;)V
    .locals 7

    invoke-static {}, Lj$/util/Optional;->empty()Lj$/util/Optional;

    move-result-object v2

    const-string v3, "pano_ts"

    move-object v0, p0

    move-object v1, p1

    move-wide v4, p2

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/ab0;->g(Lk3/c;Lj$/util/Optional;Ljava/lang/String;JLj$/util/Optional;)V

    return-void
.end method

.method public final c(Lk3/c;J)V
    .locals 7

    invoke-static {}, Lj$/util/Optional;->empty()Lj$/util/Optional;

    move-result-object v2

    invoke-static {}, Lj$/util/Optional;->empty()Lj$/util/Optional;

    move-result-object v6

    const-string v3, "paeo_ts"

    move-object v0, p0

    move-object v1, p1

    move-wide v4, p2

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/ab0;->g(Lk3/c;Lj$/util/Optional;Ljava/lang/String;JLj$/util/Optional;)V

    return-void
.end method

.method public final d(Lk3/c;J)V
    .locals 8

    const-string v0, "poll_ad"

    invoke-static {v0}, Lj$/util/Optional;->of(Ljava/lang/Object;)Lj$/util/Optional;

    move-result-object v3

    invoke-static {}, Lj$/util/Optional;->empty()Lj$/util/Optional;

    move-result-object v7

    const-string v4, "ppac_ts"

    move-object v1, p0

    move-object v2, p1

    move-wide v5, p2

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/ab0;->g(Lk3/c;Lj$/util/Optional;Ljava/lang/String;JLj$/util/Optional;)V

    return-void
.end method

.method public final e(Lk3/c;JLj$/util/Optional;)V
    .locals 8

    const-string v0, "poll_ad"

    invoke-static {v0}, Lj$/util/Optional;->of(Ljava/lang/Object;)Lj$/util/Optional;

    move-result-object v3

    const-string v4, "ppla_ts"

    move-object v1, p0

    move-object v2, p1

    move-wide v5, p2

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/ab0;->g(Lk3/c;Lj$/util/Optional;Ljava/lang/String;JLj$/util/Optional;)V

    return-void
.end method

.method public final f(Ljava/util/Map;J)V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ab0;->a:Lcom/google/android/gms/internal/ads/eO;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eO;->a()Lcom/google/android/gms/internal/ads/dO;

    move-result-object v0

    const-string v1, "action"

    const-string v2, "start_preload"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    const-string v1, "sp_ts"

    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lk3/c;

    invoke-virtual {p3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p3

    const-string v2, "_count"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p3}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dO;->g()V

    return-void
.end method
