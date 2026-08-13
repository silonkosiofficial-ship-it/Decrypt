.class public final Lcom/google/android/gms/internal/ads/mw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/lw;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/lw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/mw;->a:Lcom/google/android/gms/internal/ads/lw;

    return-void
.end method

.method public static c(Lcom/google/android/gms/internal/ads/lw;)Lr3/a;
    .locals 2

    new-instance p0, Lr3/a;

    new-instance v0, Lcom/google/android/gms/internal/ads/Ds;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Ds;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/Xr;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/Xr;-><init>()V

    invoke-direct {p0, v0, v1}, Lr3/a;-><init>(Lcom/google/android/gms/internal/ads/Ds;Lcom/google/android/gms/internal/ads/Lr;)V

    return-object p0
.end method


# virtual methods
.method public final a()Lr3/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mw;->a:Lcom/google/android/gms/internal/ads/lw;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/mw;->c(Lcom/google/android/gms/internal/ads/lw;)Lr3/a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mw;->a:Lcom/google/android/gms/internal/ads/lw;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/mw;->c(Lcom/google/android/gms/internal/ads/lw;)Lr3/a;

    move-result-object v0

    return-object v0
.end method
