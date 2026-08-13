.class final Lcom/google/android/gms/internal/ads/Fs;
.super Lcom/google/android/gms/internal/ads/L7;
.source "SourceFile"


# static fields
.field static final c:Lcom/google/android/gms/internal/ads/Fs;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Fs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Fs;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Fs;->c:Lcom/google/android/gms/internal/ads/Fs;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/L7;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;[BLjava/lang/String;)Lcom/google/android/gms/internal/ads/P7;
    .locals 0

    .prologue
    const-string p2, "moov"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/S7;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/S7;-><init>()V

    return-object p1

    :cond_0
    const-string p2, "mvhd"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p1, Lcom/google/android/gms/internal/ads/T7;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/T7;-><init>()V

    return-object p1

    :cond_1
    new-instance p2, Lcom/google/android/gms/internal/ads/U7;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/U7;-><init>(Ljava/lang/String;)V

    return-object p2
.end method
