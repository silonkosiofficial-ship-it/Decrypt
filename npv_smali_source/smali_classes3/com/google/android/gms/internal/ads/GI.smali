.class public final Lcom/google/android/gms/internal/ads/GI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/BI;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/BI;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/GI;->a:Lcom/google/android/gms/internal/ads/BI;

    return-void
.end method

.method public static c(Lcom/google/android/gms/internal/ads/BI;)Lcom/google/android/gms/internal/ads/PL;
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/BI;->a()Lcom/google/android/gms/internal/ads/PL;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/iz0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/PL;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GI;->a:Lcom/google/android/gms/internal/ads/BI;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/GI;->c(Lcom/google/android/gms/internal/ads/BI;)Lcom/google/android/gms/internal/ads/PL;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GI;->a:Lcom/google/android/gms/internal/ads/BI;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/GI;->c(Lcom/google/android/gms/internal/ads/BI;)Lcom/google/android/gms/internal/ads/PL;

    move-result-object v0

    return-object v0
.end method
