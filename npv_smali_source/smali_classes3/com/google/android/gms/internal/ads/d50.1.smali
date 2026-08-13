.class public final synthetic Lcom/google/android/gms/internal/ads/d50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/l80;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/LA;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/f50;Lcom/google/android/gms/internal/ads/l80;Lcom/google/android/gms/internal/ads/LA;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/d50;->a:Lcom/google/android/gms/internal/ads/l80;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/d50;->b:Lcom/google/android/gms/internal/ads/LA;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d50;->a:Lcom/google/android/gms/internal/ads/l80;

    check-cast p1, Lcom/google/android/gms/internal/ads/e70;

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/l80;->b:Lcom/google/android/gms/internal/ads/e70;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/c70;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/R60;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/R60;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v3, "FirstPartyRenderer"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d50;->b:Lcom/google/android/gms/internal/ads/LA;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/LA;->h(LP4/d;)LP4/d;

    move-result-object p1

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    :goto_2
    return-object p1
.end method
