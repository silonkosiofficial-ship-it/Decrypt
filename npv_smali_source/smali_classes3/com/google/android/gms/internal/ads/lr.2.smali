.class public final Lcom/google/android/gms/internal/ads/lr;
.super Lcom/google/android/gms/internal/ads/mr;
.source "SourceFile"


# instance fields
.field private final D:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/mr;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/lr;->D:Ljava/lang/Object;

    return-void
.end method

.method public static f(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lr;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/lr;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/lr;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final h()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lr;->D:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/mr;->c(Ljava/lang/Object;)Z

    return-void
.end method
