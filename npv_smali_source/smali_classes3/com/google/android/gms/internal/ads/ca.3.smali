.class public final Lcom/google/android/gms/internal/ads/ca;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LP4/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/ba;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/ba;-><init>(Lcom/google/android/gms/internal/ads/ca;Landroid/content/Context;)V

    invoke-static {v0, p2}, Lcom/google/android/gms/internal/ads/Nk0;->j(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ca;->a:LP4/d;

    return-void
.end method


# virtual methods
.method public final a()LP4/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ca;->a:LP4/d;

    return-object v0
.end method
