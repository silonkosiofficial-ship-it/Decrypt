.class public final Lcom/google/android/gms/internal/ads/xv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xv;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/xv;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/Jo;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xv;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/av;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/av;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/xv;->b:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/T90;

    invoke-static {}, Lr3/v;->j()Lcom/google/android/gms/internal/ads/ml;

    move-result-object v2

    invoke-static {}, Lw3/a;->e()Lw3/a;

    move-result-object v3

    invoke-virtual {v2, v0, v3, v1}, Lcom/google/android/gms/internal/ads/ml;->b(Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/T90;)Lcom/google/android/gms/internal/ads/wl;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/ads/tl;->b:Lcom/google/android/gms/internal/ads/ql;

    const-string v4, "google.afma.request.getAdDictionary"

    invoke-virtual {v2, v4, v3, v3}, Lcom/google/android/gms/internal/ads/wl;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/ol;Lcom/google/android/gms/internal/ads/nl;)Lcom/google/android/gms/internal/ads/ll;

    invoke-static {}, Lr3/v;->j()Lcom/google/android/gms/internal/ads/ml;

    move-result-object v2

    invoke-static {}, Lw3/a;->e()Lw3/a;

    move-result-object v4

    invoke-virtual {v2, v0, v4, v1}, Lcom/google/android/gms/internal/ads/ml;->b(Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/T90;)Lcom/google/android/gms/internal/ads/wl;

    move-result-object v1

    const-string v2, "google.afma.sdkConstants.getSdkConstants"

    invoke-virtual {v1, v2, v3, v3}, Lcom/google/android/gms/internal/ads/wl;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/ol;Lcom/google/android/gms/internal/ads/nl;)Lcom/google/android/gms/internal/ads/ll;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/Lo;

    invoke-static {}, Lw3/a;->e()Lw3/a;

    move-result-object v3

    invoke-direct {v2, v0, v1, v3}, Lcom/google/android/gms/internal/ads/Lo;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ll;Lw3/a;)V

    return-object v2
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/xv;->a()Lcom/google/android/gms/internal/ads/Jo;

    move-result-object v0

    return-object v0
.end method
