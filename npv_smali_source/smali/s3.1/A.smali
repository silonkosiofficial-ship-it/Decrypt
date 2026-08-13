.class public final Ls3/A;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ls3/A;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/sf;

.field private final b:Lcom/google/android/gms/internal/ads/tf;

.field private final c:Lcom/google/android/gms/internal/ads/yf;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/A;

    invoke-direct {v0}, Ls3/A;-><init>()V

    sput-object v0, Ls3/A;->d:Ls3/A;

    return-void
.end method

.method protected constructor <init>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/sf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/sf;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/tf;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/tf;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/ads/yf;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/yf;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ls3/A;->a:Lcom/google/android/gms/internal/ads/sf;

    iput-object v1, p0, Ls3/A;->b:Lcom/google/android/gms/internal/ads/tf;

    iput-object v2, p0, Ls3/A;->c:Lcom/google/android/gms/internal/ads/yf;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/ads/sf;
    .locals 1

    sget-object v0, Ls3/A;->d:Ls3/A;

    iget-object v0, v0, Ls3/A;->a:Lcom/google/android/gms/internal/ads/sf;

    return-object v0
.end method

.method public static b()Lcom/google/android/gms/internal/ads/tf;
    .locals 1

    sget-object v0, Ls3/A;->d:Ls3/A;

    iget-object v0, v0, Ls3/A;->b:Lcom/google/android/gms/internal/ads/tf;

    return-object v0
.end method

.method public static c()Lcom/google/android/gms/internal/ads/yf;
    .locals 1

    sget-object v0, Ls3/A;->d:Ls3/A;

    iget-object v0, v0, Ls3/A;->c:Lcom/google/android/gms/internal/ads/yf;

    return-object v0
.end method
