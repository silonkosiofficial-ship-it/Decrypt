.class final Lcom/google/android/gms/internal/ads/Zu0;
.super Lcom/google/android/gms/internal/ads/cv0;
.source "SourceFile"


# instance fields
.field private final F:I

.field private final G:I


# direct methods
.method constructor <init>([BII)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/cv0;-><init>([B)V

    add-int v0, p2, p3

    array-length p1, p1

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/ads/fv0;->O(III)I

    iput p2, p0, Lcom/google/android/gms/internal/ads/Zu0;->F:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/Zu0;->G:I

    return-void
.end method


# virtual methods
.method protected final Y()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Zu0;->F:I

    return v0
.end method

.method public final e(I)B
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/Zu0;->G:I

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/fv0;->V(II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cv0;->E:[B

    iget v1, p0, Lcom/google/android/gms/internal/ads/Zu0;->F:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method final f(I)B
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/Zu0;->F:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/cv0;->E:[B

    add-int/2addr v0, p1

    aget-byte p1, v1, v0

    return p1
.end method

.method public final n()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Zu0;->G:I

    return v0
.end method

.method protected final o([BIII)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/Zu0;->F:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/cv0;->E:[B

    add-int/2addr v0, p2

    invoke-static {v1, v0, p1, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method
