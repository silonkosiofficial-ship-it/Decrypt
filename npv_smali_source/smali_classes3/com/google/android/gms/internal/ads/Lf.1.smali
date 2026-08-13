.class public abstract Lcom/google/android/gms/internal/ads/Lf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/internal/ads/Lf;

.field public static final b:Lcom/google/android/gms/internal/ads/Lf;

.field public static final c:Lcom/google/android/gms/internal/ads/Lf;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/If;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/If;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Lf;->a:Lcom/google/android/gms/internal/ads/Lf;

    new-instance v0, Lcom/google/android/gms/internal/ads/Jf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Jf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Lf;->b:Lcom/google/android/gms/internal/ads/Lf;

    new-instance v0, Lcom/google/android/gms/internal/ads/Kf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Kf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Lf;->c:Lcom/google/android/gms/internal/ads/Lf;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method
