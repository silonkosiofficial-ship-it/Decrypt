.class public final Lcom/google/android/gms/internal/ads/GQ;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/GQ;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/GQ;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final synthetic b()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GQ;->a:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/v90;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/GQ;->b:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {}, Lr3/v;->u()Lv3/b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lv3/b;->a(Landroid/content/Context;)Landroid/webkit/CookieManager;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/p90;->Y:Lcom/google/android/gms/internal/ads/p90;

    new-instance v3, Lcom/google/android/gms/internal/ads/BQ;

    invoke-direct {v3, v1}, Lcom/google/android/gms/internal/ads/BQ;-><init>(Landroid/webkit/CookieManager;)V

    invoke-static {v3, v2, v0}, Lcom/google/android/gms/internal/ads/e90;->a(Ljava/util/concurrent/Callable;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v0

    const-wide/16 v1, 0x1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/l90;->i(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/CQ;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/CQ;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/ads/f90;

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/ads/f90;-><init>(Lcom/google/android/gms/internal/ads/Y80;)V

    const-class v1, Ljava/lang/Exception;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/l90;->c(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/l90;->a()Lcom/google/android/gms/internal/ads/a90;

    move-result-object v0

    return-object v0
.end method
