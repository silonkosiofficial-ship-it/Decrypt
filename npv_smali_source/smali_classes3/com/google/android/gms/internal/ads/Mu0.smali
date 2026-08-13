.class public final Lcom/google/android/gms/internal/ads/Mu0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Lu0;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/Lu0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Mu0;->a:Lcom/google/android/gms/internal/ads/Lu0;

    return-void
.end method

.method public static b([BLcom/google/android/gms/internal/ads/Wl0;)Lcom/google/android/gms/internal/ads/Mu0;
    .locals 0

    new-instance p1, Lcom/google/android/gms/internal/ads/Mu0;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Lu0;->b([B)Lcom/google/android/gms/internal/ads/Lu0;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/Mu0;-><init>(Lcom/google/android/gms/internal/ads/Lu0;)V

    return-object p1
.end method

.method public static c(I)Lcom/google/android/gms/internal/ads/Mu0;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Mu0;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Aq0;->b(I)[B

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Lu0;->b([B)Lcom/google/android/gms/internal/ads/Lu0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/Mu0;-><init>(Lcom/google/android/gms/internal/ads/Lu0;)V

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Mu0;->a:Lcom/google/android/gms/internal/ads/Lu0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Lu0;->a()I

    move-result v0

    return v0
.end method

.method public final d(Lcom/google/android/gms/internal/ads/Wl0;)[B
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Mu0;->a:Lcom/google/android/gms/internal/ads/Lu0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Lu0;->c()[B

    move-result-object p1

    return-object p1
.end method
