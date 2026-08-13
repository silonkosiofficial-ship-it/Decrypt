.class public final synthetic Lcom/google/android/gms/internal/ads/Ek;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Ju;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/Mk;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Mk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ek;->a:Lcom/google/android/gms/internal/ads/Mk;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v0

    invoke-interface {v0}, LV3/f;->a()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Ek;->a:Lcom/google/android/gms/internal/ads/Mk;

    iget-wide v8, v2, Lcom/google/android/gms/internal/ads/Mk;->c:J

    sub-long/2addr v0, v8

    iget-object v7, v2, Lcom/google/android/gms/internal/ads/Mk;->b:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "LoadNewJavascriptEngine(onEngLoaded) latency is "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ms."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    sget-object v0, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v1, Lcom/google/android/gms/internal/ads/Nk;

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/Mk;->a:Lcom/google/android/gms/internal/ads/hl;

    iget-object v5, v2, Lcom/google/android/gms/internal/ads/Mk;->d:Lcom/google/android/gms/internal/ads/gl;

    iget-object v6, v2, Lcom/google/android/gms/internal/ads/Mk;->e:Lcom/google/android/gms/internal/ads/Bk;

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/Nk;-><init>(Lcom/google/android/gms/internal/ads/hl;Lcom/google/android/gms/internal/ads/gl;Lcom/google/android/gms/internal/ads/Bk;Ljava/util/ArrayList;J)V

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->b:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
