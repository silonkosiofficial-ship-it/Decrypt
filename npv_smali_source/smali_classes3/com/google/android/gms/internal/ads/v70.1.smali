.class public final synthetic Lcom/google/android/gms/internal/ads/v70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/gj;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/MG;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/Lx;

.field public final synthetic c:Lcom/google/android/gms/internal/ads/La0;

.field public final synthetic d:Lcom/google/android/gms/internal/ads/iT;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/MG;Lcom/google/android/gms/internal/ads/Lx;Lcom/google/android/gms/internal/ads/La0;Lcom/google/android/gms/internal/ads/iT;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/v70;->a:Lcom/google/android/gms/internal/ads/MG;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/v70;->b:Lcom/google/android/gms/internal/ads/Lx;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/v70;->c:Lcom/google/android/gms/internal/ads/La0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/v70;->d:Lcom/google/android/gms/internal/ads/iT;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/v70;->a:Lcom/google/android/gms/internal/ads/MG;

    check-cast p1, Lcom/google/android/gms/internal/ads/Ot;

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/fj;->c(Ljava/util/Map;Lcom/google/android/gms/internal/ads/MG;)V

    const-string v0, "u"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_0

    const-string p1, "URL missing from click GMSG."

    invoke-static {p1}, Lw3/p;->g(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/v70;->d:Lcom/google/android/gms/internal/ads/iT;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/v70;->c:Lcom/google/android/gms/internal/ads/La0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/v70;->b:Lcom/google/android/gms/internal/ads/Lx;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/fj;->a(Lcom/google/android/gms/internal/ads/Ot;Ljava/lang/String;)LP4/d;

    move-result-object p2

    new-instance v3, Lcom/google/android/gms/internal/ads/x70;

    invoke-direct {v3, p1, v2, v1, v0}, Lcom/google/android/gms/internal/ads/x70;-><init>(Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/Lx;Lcom/google/android/gms/internal/ads/La0;Lcom/google/android/gms/internal/ads/iT;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p2, v3, p1}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-void
.end method
