.class public final Lcom/google/android/gms/internal/ads/j10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L20;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/Yk0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Yk0;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/j10;->b:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/j10;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0x39

    return v0
.end method

.method public final b()LP4/d;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/i10;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/i10;-><init>(Lcom/google/android/gms/internal/ads/j10;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/j10;->b:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/Yk0;->H0(Ljava/util/concurrent/Callable;)LP4/d;

    move-result-object v0

    return-object v0
.end method

.method final synthetic c()Lcom/google/android/gms/internal/ads/k10;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/k10;

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/j10;->a:Landroid/content/Context;

    invoke-static {v1}, Lv3/E0;->Y(Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/k10;-><init>(Ljava/lang/Integer;)V

    return-object v0
.end method
