.class public final Lcom/google/android/gms/internal/ads/Mp;
.super Lcom/google/android/gms/internal/ads/rp;
.source "SourceFile"


# instance fields
.field private final C:Ljava/lang/String;

.field private final D:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/rp;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Mp;->C:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/internal/ads/Mp;->D:I

    return-void
.end method


# virtual methods
.method public final d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Mp;->D:I

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Mp;->C:Ljava/lang/String;

    return-object v0
.end method
