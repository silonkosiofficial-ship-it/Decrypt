.class public final synthetic Lcom/google/android/gms/internal/ads/w70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/gj;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/La0;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/iT;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/La0;Lcom/google/android/gms/internal/ads/iT;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/w70;->a:Lcom/google/android/gms/internal/ads/La0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/w70;->b:Lcom/google/android/gms/internal/ads/iT;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 7

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/Ft;

    const-string v0, "u"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_0

    const-string p1, "URL missing from httpTrack GMSG."

    invoke-static {p1}, Lw3/p;->g(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ft;->Q()Lcom/google/android/gms/internal/ads/R60;

    move-result-object p2

    if-eqz p2, :cond_2

    iget-boolean v0, p2, Lcom/google/android/gms/internal/ads/R60;->i0:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/w70;->a:Lcom/google/android/gms/internal/ads/La0;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/R60;->x0:Lw3/w;

    const/4 v0, 0x0

    invoke-virtual {p1, v4, p2, v0}, Lcom/google/android/gms/internal/ads/La0;->d(Ljava/lang/String;Lw3/w;Lcom/google/android/gms/internal/ads/Q90;)V

    return-void

    :cond_2
    :goto_0
    check-cast p1, Lcom/google/android/gms/internal/ads/vu;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/vu;->h0()Lcom/google/android/gms/internal/ads/U60;

    move-result-object p1

    if-nez p1, :cond_3

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Common configuration cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const-string p2, "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void

    :cond_3
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/w70;->b:Lcom/google/android/gms/internal/ads/iT;

    new-instance v6, Lcom/google/android/gms/internal/ads/kT;

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v0

    invoke-interface {v0}, LV3/f;->a()J

    move-result-wide v1

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/U60;->b:Ljava/lang/String;

    const/4 v5, 0x2

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/kT;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {p2, v6}, Lcom/google/android/gms/internal/ads/iT;->i(Lcom/google/android/gms/internal/ads/kT;)V

    return-void
.end method
