.class final Lcom/google/android/gms/internal/ads/nx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/ax;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)V
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->na:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "is_topics_ad_personalization_allowed"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Uq;->j()Lv3/s0;

    move-result-object v0

    invoke-interface {v0, p1}, Lv3/s0;->J(Z)V

    :cond_1
    :goto_0
    return-void
.end method
