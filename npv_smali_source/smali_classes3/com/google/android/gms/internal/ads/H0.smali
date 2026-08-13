.class public abstract Lcom/google/android/gms/internal/ads/H0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/T0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/T0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/T0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/H0;->a:Lcom/google/android/gms/internal/ads/T0;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H0;->a:Lcom/google/android/gms/internal/ads/T0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/T0;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public b(J)Lcom/google/android/gms/internal/ads/R0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H0;->a:Lcom/google/android/gms/internal/ads/T0;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/T0;->b(J)Lcom/google/android/gms/internal/ads/R0;

    move-result-object p1

    return-object p1
.end method

.method public final g()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H0;->a:Lcom/google/android/gms/internal/ads/T0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/T0;->g()Z

    move-result v0

    return v0
.end method
