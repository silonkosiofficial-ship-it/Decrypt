.class public final Lcom/google/android/gms/internal/ads/yn0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lcom/google/android/gms/internal/ads/yn0;

.field public static final c:Lcom/google/android/gms/internal/ads/yn0;

.field public static final d:Lcom/google/android/gms/internal/ads/yn0;

.field public static final e:Lcom/google/android/gms/internal/ads/yn0;

.field public static final f:Lcom/google/android/gms/internal/ads/yn0;

.field public static final g:Lcom/google/android/gms/internal/ads/yn0;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/yn0;

    const-string v1, "ASSUME_AES_GCM"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/yn0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/yn0;->b:Lcom/google/android/gms/internal/ads/yn0;

    new-instance v0, Lcom/google/android/gms/internal/ads/yn0;

    const-string v1, "ASSUME_XCHACHA20POLY1305"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/yn0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/yn0;->c:Lcom/google/android/gms/internal/ads/yn0;

    new-instance v0, Lcom/google/android/gms/internal/ads/yn0;

    const-string v1, "ASSUME_CHACHA20POLY1305"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/yn0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/yn0;->d:Lcom/google/android/gms/internal/ads/yn0;

    new-instance v0, Lcom/google/android/gms/internal/ads/yn0;

    const-string v1, "ASSUME_AES_CTR_HMAC"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/yn0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/yn0;->e:Lcom/google/android/gms/internal/ads/yn0;

    new-instance v0, Lcom/google/android/gms/internal/ads/yn0;

    const-string v1, "ASSUME_AES_EAX"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/yn0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/yn0;->f:Lcom/google/android/gms/internal/ads/yn0;

    new-instance v0, Lcom/google/android/gms/internal/ads/yn0;

    const-string v1, "ASSUME_AES_GCM_SIV"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/yn0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/yn0;->g:Lcom/google/android/gms/internal/ads/yn0;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yn0;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yn0;->a:Ljava/lang/String;

    return-object v0
.end method
