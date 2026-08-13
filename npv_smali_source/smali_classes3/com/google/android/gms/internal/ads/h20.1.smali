.class public final Lcom/google/android/gms/internal/ads/h20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L20;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/h20;->a:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/internal/ads/h20;->b:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0x1f

    return v0
.end method

.method public final b()LP4/d;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/i20;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/h20;->a:Ljava/lang/String;

    iget v2, p0, Lcom/google/android/gms/internal/ads/h20;->b:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/i20;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    return-object v0
.end method
