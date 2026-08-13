.class public final Lcom/google/android/gms/internal/ads/fS;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lcom/google/android/gms/internal/ads/ol;


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/jS;

.field public final b:Lorg/json/JSONObject;

.field public final c:Lcom/google/android/gms/internal/ads/Ro;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/eS;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/eS;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/fS;->d:Lcom/google/android/gms/internal/ads/ol;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/jS;Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/Ro;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fS;->a:Lcom/google/android/gms/internal/ads/jS;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/fS;->b:Lorg/json/JSONObject;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/fS;->c:Lcom/google/android/gms/internal/ads/Ro;

    return-void
.end method
