.class final Lcom/google/android/gms/internal/ads/y8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Nv0;


# static fields
.field static final a:Lcom/google/android/gms/internal/ads/Nv0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/y8;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/y8;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/y8;->a:Lcom/google/android/gms/internal/ads/Nv0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final r(I)Z
    .locals 0

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/z8;->a(I)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
