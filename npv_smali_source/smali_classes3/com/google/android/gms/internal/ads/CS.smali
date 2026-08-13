.class public final Lcom/google/android/gms/internal/ads/CS;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/CS;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/CS;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/CS;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/NS;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/NS;->a()Lcom/google/android/gms/internal/ads/LS;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/CS;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v1, Lcom/google/android/gms/internal/ads/Xu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Xu;->a()Lv3/s0;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/BS;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/ads/BS;-><init>(Lcom/google/android/gms/internal/ads/LS;Lv3/s0;)V

    return-object v2
.end method
