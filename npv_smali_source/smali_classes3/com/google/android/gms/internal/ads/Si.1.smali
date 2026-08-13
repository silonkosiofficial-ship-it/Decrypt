.class final Lcom/google/android/gms/internal/ads/Si;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/gj;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/Ot;

    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Oe0;->k(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/Oe0;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Oe0;->l()V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Pe0;->j(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/Pe0;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Pe0;->k()V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Qe0;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/Qe0;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/Qe0;->b(Lcom/google/android/gms/internal/ads/Ke0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "DefaultGmsgHandlers.ResetPaid"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method
