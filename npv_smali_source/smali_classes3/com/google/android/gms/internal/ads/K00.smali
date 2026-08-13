.class public final Lcom/google/android/gms/internal/ads/K00;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/K00;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/K00;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/K00;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/l10;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/l10;->a()Lcom/google/android/gms/internal/ads/j10;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/K00;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v1, Lcom/google/android/gms/internal/ads/av;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/av;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->lb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    invoke-static {v1}, Lv3/E0;->c(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/hi0;->P(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/hi0;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/hi0;->O()Lcom/google/android/gms/internal/ads/hi0;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/iz0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
