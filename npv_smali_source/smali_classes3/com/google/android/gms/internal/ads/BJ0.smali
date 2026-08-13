.class abstract Lcom/google/android/gms/internal/ads/BJ0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final C:I

.field public final D:Lcom/google/android/gms/internal/ads/Pm;

.field public final E:I

.field public final F:Lcom/google/android/gms/internal/ads/D;


# direct methods
.method public constructor <init>(ILcom/google/android/gms/internal/ads/Pm;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/BJ0;->C:I

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/BJ0;->D:Lcom/google/android/gms/internal/ads/Pm;

    iput p3, p0, Lcom/google/android/gms/internal/ads/BJ0;->E:I

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/Pm;->b(I)Lcom/google/android/gms/internal/ads/D;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    return-void
.end method


# virtual methods
.method public abstract e()I
.end method

.method public abstract g(Lcom/google/android/gms/internal/ads/BJ0;)Z
.end method
