.class public final Lcom/google/android/gms/internal/ads/Fq;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/ads/Fq;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final C:Ljava/lang/String;

.field public final D:Ljava/lang/String;

.field public final E:Ls3/c2;

.field public final F:Ls3/X1;

.field public final G:I

.field public final H:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Gq;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Gq;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Fq;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ls3/c2;Ls3/X1;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Fq;->C:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Fq;->D:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Fq;->E:Ls3/c2;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Fq;->F:Ls3/X1;

    iput p5, p0, Lcom/google/android/gms/internal/ads/Fq;->G:I

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/Fq;->H:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fq;->C:Ljava/lang/String;

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Fq;->D:Ljava/lang/String;

    invoke-static {p1, v0, v2, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Fq;->E:Ls3/c2;

    invoke-static {p1, v0, v2, p2, v3}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v0, 0x4

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Fq;->F:Ls3/X1;

    invoke-static {p1, v0, v2, p2, v3}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x5

    iget v0, p0, Lcom/google/android/gms/internal/ads/Fq;->G:I

    invoke-static {p1, p2, v0}, LR3/c;->k(Landroid/os/Parcel;II)V

    const/4 p2, 0x6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fq;->H:Ljava/lang/String;

    invoke-static {p1, p2, v0, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v1}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
