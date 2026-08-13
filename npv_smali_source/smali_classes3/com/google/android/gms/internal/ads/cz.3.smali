.class public final Lcom/google/android/gms/internal/ads/cz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Xy;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Xy;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/cz;->a:Lcom/google/android/gms/internal/ads/Xy;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/cz;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method

.method public static c(Lcom/google/android/gms/internal/ads/Xy;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/Qy;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/Ty;

    return-object p1
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/Qy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cz;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/Uy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Uy;->a()Lcom/google/android/gms/internal/ads/Ty;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/cz;->a()Lcom/google/android/gms/internal/ads/Qy;

    move-result-object v0

    return-object v0
.end method
