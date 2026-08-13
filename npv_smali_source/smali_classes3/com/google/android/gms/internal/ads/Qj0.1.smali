.class final Lcom/google/android/gms/internal/ads/Qj0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final c:Lcom/google/android/gms/internal/ads/Qj0;

.field static final d:Lcom/google/android/gms/internal/ads/Qj0;


# instance fields
.field final a:Z

.field final b:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    sget-boolean v0, Lcom/google/android/gms/internal/ads/ak0;->F:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sput-object v1, Lcom/google/android/gms/internal/ads/Qj0;->d:Lcom/google/android/gms/internal/ads/Qj0;

    sput-object v1, Lcom/google/android/gms/internal/ads/Qj0;->c:Lcom/google/android/gms/internal/ads/Qj0;

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/Qj0;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/Qj0;-><init>(ZLjava/lang/Throwable;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Qj0;->d:Lcom/google/android/gms/internal/ads/Qj0;

    new-instance v0, Lcom/google/android/gms/internal/ads/Qj0;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/Qj0;-><init>(ZLjava/lang/Throwable;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Qj0;->c:Lcom/google/android/gms/internal/ads/Qj0;

    return-void
.end method

.method constructor <init>(ZLjava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/Qj0;->a:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Qj0;->b:Ljava/lang/Throwable;

    return-void
.end method
