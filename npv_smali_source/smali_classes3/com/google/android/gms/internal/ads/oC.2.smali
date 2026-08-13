.class public final Lcom/google/android/gms/internal/ads/oC;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/nC;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/nC;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/oC;->a:Lcom/google/android/gms/internal/ads/nC;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/oC;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final synthetic b()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oC;->b:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/oC;->a:Lcom/google/android/gms/internal/ads/nC;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/nC;->f(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/bU;

    move-result-object v0

    return-object v0
.end method
