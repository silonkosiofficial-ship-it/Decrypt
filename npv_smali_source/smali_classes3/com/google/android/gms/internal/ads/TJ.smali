.class public final Lcom/google/android/gms/internal/ads/TJ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/BM;

.field private final b:Lcom/google/android/gms/internal/ads/PL;

.field private final c:Lcom/google/android/gms/internal/ads/uy;

.field private final d:Lcom/google/android/gms/internal/ads/mJ;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/BM;Lcom/google/android/gms/internal/ads/PL;Lcom/google/android/gms/internal/ads/uy;Lcom/google/android/gms/internal/ads/mJ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/TJ;->a:Lcom/google/android/gms/internal/ads/BM;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/TJ;->b:Lcom/google/android/gms/internal/ads/PL;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/TJ;->c:Lcom/google/android/gms/internal/ads/uy;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/TJ;->d:Lcom/google/android/gms/internal/ads/mJ;

    return-void
.end method


# virtual methods
.method public final a()Landroid/view/View;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/TJ;->a:Lcom/google/android/gms/internal/ads/BM;

    invoke-static {}, Ls3/c2;->s()Ls3/c2;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/BM;->a(Ls3/c2;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;)Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    new-instance v1, Lcom/google/android/gms/internal/ads/NJ;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/NJ;-><init>(Lcom/google/android/gms/internal/ads/TJ;)V

    const-string v2, "/sendMessageToSdk"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/Ot;->g1(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/OJ;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/OJ;-><init>(Lcom/google/android/gms/internal/ads/TJ;)V

    const-string v2, "/adMuted"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/Ot;->g1(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/PJ;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/PJ;-><init>(Lcom/google/android/gms/internal/ads/TJ;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/TJ;->b:Lcom/google/android/gms/internal/ads/PL;

    const-string v4, "/loadHtml"

    invoke-virtual {v3, v1, v4, v2}, Lcom/google/android/gms/internal/ads/PL;->m(Ljava/lang/ref/WeakReference;Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/QJ;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/QJ;-><init>(Lcom/google/android/gms/internal/ads/TJ;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/TJ;->b:Lcom/google/android/gms/internal/ads/PL;

    const-string v4, "/showOverlay"

    invoke-virtual {v3, v1, v4, v2}, Lcom/google/android/gms/internal/ads/PL;->m(Ljava/lang/ref/WeakReference;Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/RJ;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/RJ;-><init>(Lcom/google/android/gms/internal/ads/TJ;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/TJ;->b:Lcom/google/android/gms/internal/ads/PL;

    const-string v4, "/hideOverlay"

    invoke-virtual {v3, v1, v4, v2}, Lcom/google/android/gms/internal/ads/PL;->m(Ljava/lang/ref/WeakReference;Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method final synthetic b(Lcom/google/android/gms/internal/ads/Ot;Ljava/util/Map;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/TJ;->b:Lcom/google/android/gms/internal/ads/PL;

    const-string v0, "sendMessageToNativeJs"

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/internal/ads/PL;->j(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method final synthetic c(Lcom/google/android/gms/internal/ads/Ot;Ljava/util/Map;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/TJ;->d:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/mJ;->g()V

    return-void
.end method

.method final synthetic d(Ljava/util/Map;ZILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string p3, "messageType"

    const-string p4, "htmlLoaded"

    invoke-interface {p2, p3, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p3, "id"

    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/TJ;->b:Lcom/google/android/gms/internal/ads/PL;

    const-string p3, "sendMessageToNativeJs"

    invoke-virtual {p1, p3, p2}, Lcom/google/android/gms/internal/ads/PL;->j(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method final synthetic e(Lcom/google/android/gms/internal/ads/Ot;Ljava/util/Map;)V
    .locals 0

    const-string p2, "Showing native ads overlay."

    invoke-static {p2}, Lw3/p;->f(Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/TJ;->c:Lcom/google/android/gms/internal/ads/uy;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/uy;->d(Z)V

    return-void
.end method

.method final synthetic f(Lcom/google/android/gms/internal/ads/Ot;Ljava/util/Map;)V
    .locals 0

    const-string p2, "Hiding native ads overlay."

    invoke-static {p2}, Lw3/p;->f(Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/TJ;->c:Lcom/google/android/gms/internal/ads/uy;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/uy;->d(Z)V

    return-void
.end method
