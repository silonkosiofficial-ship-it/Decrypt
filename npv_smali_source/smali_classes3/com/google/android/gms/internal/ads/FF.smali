.class public final Lcom/google/android/gms/internal/ads/FF;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/EF;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/EF;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/FF;->a:Lcom/google/android/gms/internal/ads/EF;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/FF;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/FF;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/pz0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pz0;->c()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/FF;->a:Lcom/google/android/gms/internal/ads/EF;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/EF;->a(Ljava/util/Set;)Lcom/google/android/gms/internal/ads/GC;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/iz0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
