.class public final Lcom/google/android/gms/internal/ads/mk;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/ads/mk;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final C:I

.field public final D:I

.field public final E:Ljava/lang/String;

.field public final F:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/ok;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ok;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/mk;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/mk;->C:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/mk;->D:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/mk;->E:Ljava/lang/String;

    iput p4, p0, Lcom/google/android/gms/internal/ads/mk;->F:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget p2, p0, Lcom/google/android/gms/internal/ads/mk;->D:I

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, p2}, LR3/c;->k(Landroid/os/Parcel;II)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/mk;->E:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v2, p2, v1}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x3

    iget v1, p0, Lcom/google/android/gms/internal/ads/mk;->F:I

    invoke-static {p1, p2, v1}, LR3/c;->k(Landroid/os/Parcel;II)V

    const/16 p2, 0x3e8

    iget v1, p0, Lcom/google/android/gms/internal/ads/mk;->C:I

    invoke-static {p1, p2, v1}, LR3/c;->k(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
