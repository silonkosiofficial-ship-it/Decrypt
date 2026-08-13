.class public final synthetic Lcom/google/android/gms/internal/ads/I30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:LP4/d;

.field public final synthetic b:LP4/d;


# direct methods
.method public synthetic constructor <init>(LP4/d;LP4/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/I30;->a:LP4/d;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/I30;->b:LP4/d;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I30;->a:LP4/d;

    new-instance v1, Lcom/google/android/gms/internal/ads/K30;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/I30;->b:LP4/d;

    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/K30;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method
