.class public final Lcom/google/android/gms/internal/ads/OR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/OR;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/OR;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/NR;
    .locals 4

    invoke-static {}, Lcom/google/android/gms/internal/ads/O80;->c()Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/OR;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v1, Lcom/google/android/gms/internal/ads/rR;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rR;->a()Lcom/google/android/gms/internal/ads/qR;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/OR;->b:Lcom/google/android/gms/internal/ads/rz0;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/mz0;->a(Lcom/google/android/gms/internal/ads/rz0;)Lcom/google/android/gms/internal/ads/kz0;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/Zy0;->a(Lcom/google/android/gms/internal/ads/kz0;)Lcom/google/android/gms/internal/ads/Uy0;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/NR;

    invoke-direct {v3, v0, v1, v2}, Lcom/google/android/gms/internal/ads/NR;-><init>(Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/qR;Lcom/google/android/gms/internal/ads/Uy0;)V

    return-object v3
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/OR;->a()Lcom/google/android/gms/internal/ads/NR;

    move-result-object v0

    return-object v0
.end method
