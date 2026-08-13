.class public final synthetic Lcom/google/android/gms/internal/ads/Di;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/gj;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/MG;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/Lx;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/MG;Lcom/google/android/gms/internal/ads/Lx;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Di;->a:Lcom/google/android/gms/internal/ads/MG;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Di;->b:Lcom/google/android/gms/internal/ads/Lx;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Di;->a:Lcom/google/android/gms/internal/ads/MG;

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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Di;->b:Lcom/google/android/gms/internal/ads/Lx;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/fj;->a(Lcom/google/android/gms/internal/ads/Ot;Ljava/lang/String;)LP4/d;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Dk0;->D(LP4/d;)Lcom/google/android/gms/internal/ads/Dk0;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/Gi;

    invoke-direct {v2, v0, p2}, Lcom/google/android/gms/internal/ads/Gi;-><init>(Lcom/google/android/gms/internal/ads/Lx;Ljava/lang/String;)V

    sget-object p2, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {v1, v2, p2}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Dk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/Ui;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/Ui;-><init>(Lcom/google/android/gms/internal/ads/Ot;)V

    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-void
.end method
