.class public final Lcom/google/android/gms/internal/ads/L30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/L30;->a:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lcom/google/android/gms/internal/ads/Ow;->a()Lcom/google/android/gms/internal/ads/Iq;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/O80;->c()Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/L30;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v2, Lcom/google/android/gms/internal/ads/U30;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/U30;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/J30;

    invoke-direct {v3, v0, v1, v2}, Lcom/google/android/gms/internal/ads/J30;-><init>(Lcom/google/android/gms/internal/ads/Iq;Lcom/google/android/gms/internal/ads/Yk0;Ljava/lang/String;)V

    return-object v3
.end method
