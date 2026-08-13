.class public final synthetic Lcom/google/android/gms/internal/ads/Ii;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/gj;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 6

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/zu;

    sget-object v0, Lcom/google/android/gms/internal/ads/fj;->a:Lcom/google/android/gms/internal/ads/gj;

    const-string v0, "u"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_0

    const-string p1, "URL missing from httpTrack GMSG."

    invoke-static {p1}, Lw3/p;->g(Ljava/lang/String;)V

    return-void

    :cond_0
    move-object p2, p1

    check-cast p2, Lcom/google/android/gms/internal/ads/Ft;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/Ft;->Q()Lcom/google/android/gms/internal/ads/R60;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/Ft;->Q()Lcom/google/android/gms/internal/ads/R60;

    move-result-object p2

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/R60;->x0:Lw3/w;

    :goto_0
    move-object v5, p2

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    goto :goto_0

    :goto_1
    new-instance p2, Lv3/Z;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zu;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast p1, Lcom/google/android/gms/internal/ads/Gu;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Gu;->n()Lw3/a;

    move-result-object p1

    iget-object v2, p1, Lw3/a;->C:Ljava/lang/String;

    const/4 v4, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lv3/Z;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Ba0;Lw3/w;)V

    invoke-virtual {p2}, Lv3/B;->b()LP4/d;

    return-void
.end method
