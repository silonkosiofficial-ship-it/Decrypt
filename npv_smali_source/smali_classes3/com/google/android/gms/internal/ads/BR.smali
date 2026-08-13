.class public final Lcom/google/android/gms/internal/ads/BR;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/io/InputStream;

.field private final b:Lcom/google/android/gms/internal/ads/Po;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Lcom/google/android/gms/internal/ads/Po;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/BR;->a:Ljava/io/InputStream;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/BR;->b:Lcom/google/android/gms/internal/ads/Po;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/Po;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/BR;->b:Lcom/google/android/gms/internal/ads/Po;

    return-object v0
.end method

.method public final b()Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/BR;->a:Ljava/io/InputStream;

    return-object v0
.end method
