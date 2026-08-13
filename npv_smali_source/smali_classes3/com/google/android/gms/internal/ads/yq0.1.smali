.class public final Lcom/google/android/gms/internal/ads/yq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Cq0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Lu0;

.field private final b:Lcom/google/android/gms/internal/ads/jt0;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/jt0;Lcom/google/android/gms/internal/ads/Lu0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yq0;->b:Lcom/google/android/gms/internal/ads/jt0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/yq0;->a:Lcom/google/android/gms/internal/ads/Lu0;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/jt0;)Lcom/google/android/gms/internal/ads/yq0;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/yq0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/jt0;->h0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Kq0;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Lu0;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/yq0;-><init>(Lcom/google/android/gms/internal/ads/jt0;Lcom/google/android/gms/internal/ads/Lu0;)V

    return-object v0
.end method

.method public static b(Lcom/google/android/gms/internal/ads/jt0;)Lcom/google/android/gms/internal/ads/yq0;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/yq0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/jt0;->h0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Kq0;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Lu0;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/yq0;-><init>(Lcom/google/android/gms/internal/ads/jt0;Lcom/google/android/gms/internal/ads/Lu0;)V

    return-object v0
.end method


# virtual methods
.method public final c()Lcom/google/android/gms/internal/ads/jt0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yq0;->b:Lcom/google/android/gms/internal/ads/jt0;

    return-object v0
.end method

.method public final f()Lcom/google/android/gms/internal/ads/Lu0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yq0;->a:Lcom/google/android/gms/internal/ads/Lu0;

    return-object v0
.end method
