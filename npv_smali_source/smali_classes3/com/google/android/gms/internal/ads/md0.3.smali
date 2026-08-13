.class final Lcom/google/android/gms/internal/ads/md0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/od0;


# static fields
.field private static final a:Lcom/google/android/gms/internal/ads/Q8;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/ads/Q8;->B0()Lcom/google/android/gms/internal/ads/u8;

    move-result-object v0

    const-string v1, "E"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/u8;->I0(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/u8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Q8;

    sput-object v0, Lcom/google/android/gms/internal/ads/md0;->a:Lcom/google/android/gms/internal/ads/Q8;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/Q8;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/md0;->a:Lcom/google/android/gms/internal/ads/Q8;

    return-object v0
.end method
