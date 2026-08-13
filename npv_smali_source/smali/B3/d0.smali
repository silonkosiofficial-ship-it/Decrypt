.class public final LB3/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/d0;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p4, p0, LB3/d0;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, LB3/d0;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/av;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/av;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/Hw;->a()Lcom/google/android/gms/internal/ads/if;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ads/p00;->c()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    iget-object v3, p0, LB3/d0;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v3, Lcom/google/android/gms/internal/ads/ov;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/ov;->a()Lw3/a;

    move-result-object v3

    new-instance v4, LB3/c0;

    invoke-direct {v4, v0, v1, v2, v3}, LB3/c0;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/if;Ljava/util/List;Lw3/a;)V

    return-object v4
.end method
