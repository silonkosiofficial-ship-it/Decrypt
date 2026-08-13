.class public final Lcom/google/android/gms/internal/ads/Iw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zw;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Iw;->a:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/K70;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Iw;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/av;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/av;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/K70;->d(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/K70;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/iz0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Iw;->a()Lcom/google/android/gms/internal/ads/K70;

    move-result-object v0

    return-object v0
.end method
