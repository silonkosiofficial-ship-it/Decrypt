.class final Lcom/google/android/gms/internal/ads/g5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final C:I

.field public final D:Lcom/google/android/gms/internal/ads/b5;


# direct methods
.method public constructor <init>(ILcom/google/android/gms/internal/ads/b5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/g5;->C:I

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/g5;->D:Lcom/google/android/gms/internal/ads/b5;

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/g5;

    iget p1, p1, Lcom/google/android/gms/internal/ads/g5;->C:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/g5;->C:I

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
