.class public abstract Lcom/google/android/gms/internal/ads/eq0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Lu0;

.field private final b:Ljava/lang/Class;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Lu0;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/dq0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eq0;->a:Lcom/google/android/gms/internal/ads/Lu0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/eq0;->b:Ljava/lang/Class;

    return-void
.end method

.method public static b(Lcom/google/android/gms/internal/ads/cq0;Lcom/google/android/gms/internal/ads/Lu0;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/eq0;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/bq0;

    invoke-direct {v0, p1, p2, p0}, Lcom/google/android/gms/internal/ads/bq0;-><init>(Lcom/google/android/gms/internal/ads/Lu0;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/cq0;)V

    return-object v0
.end method


# virtual methods
.method public abstract a(Lcom/google/android/gms/internal/ads/Cq0;)Lcom/google/android/gms/internal/ads/Sl0;
.end method

.method public final c()Lcom/google/android/gms/internal/ads/Lu0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eq0;->a:Lcom/google/android/gms/internal/ads/Lu0;

    return-object v0
.end method

.method public final d()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eq0;->b:Ljava/lang/Class;

    return-object v0
.end method
