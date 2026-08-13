.class public final Lcom/google/android/gms/internal/ads/Bq0;
.super Lcom/google/android/gms/internal/ads/lp0;
.source "SourceFile"


# static fields
.field private static final a:Lcom/google/android/gms/internal/ads/Bq0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Bq0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Bq0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Bq0;->a:Lcom/google/android/gms/internal/ads/Bq0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/lp0;-><init>()V

    return-void
.end method

.method public static d()Lcom/google/android/gms/internal/ads/Bq0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Bq0;->a:Lcom/google/android/gms/internal/ads/Bq0;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Vl0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/El0;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/Wp0;->a()Lcom/google/android/gms/internal/ads/Wp0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Wp0;->c(Lcom/google/android/gms/internal/ads/El0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lcom/google/android/gms/internal/ads/vq0;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    sget v0, Lcom/google/android/gms/internal/ads/Vl0;->a:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/Wp0;->a()Lcom/google/android/gms/internal/ads/Wp0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Wp0;->d(Lcom/google/android/gms/internal/ads/vq0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
