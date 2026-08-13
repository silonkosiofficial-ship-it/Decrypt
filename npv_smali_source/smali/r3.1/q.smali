.class final Lr3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic a:Lr3/u;


# direct methods
.method constructor <init>(Lr3/u;)V
    .locals 0

    iput-object p1, p0, Lr3/q;->a:Lr3/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lr3/q;->a:Lr3/u;

    invoke-static {v0}, Lr3/u;->t6(Lr3/u;)Lw3/a;

    move-result-object v1

    iget-object v1, v1, Lw3/a;->C:Ljava/lang/String;

    invoke-static {v0}, Lr3/u;->p6(Lr3/u;)Landroid/content/Context;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/ads/V9;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lcom/google/android/gms/internal/ads/V9;-><init>(Ljava/lang/String;Z)V

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/X9;->y(Landroid/content/Context;Lcom/google/android/gms/internal/ads/V9;)Lcom/google/android/gms/internal/ads/X9;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/Z9;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/Z9;-><init>(Lcom/google/android/gms/internal/ads/T9;)V

    return-object v1
.end method
