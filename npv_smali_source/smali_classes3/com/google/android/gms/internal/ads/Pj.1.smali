.class public final Lcom/google/android/gms/internal/ads/Pj;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/ads/Pj;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final C:Z

.field public final D:Ljava/lang/String;

.field public final E:I

.field public final F:[B

.field public final G:[Ljava/lang/String;

.field public final H:[Ljava/lang/String;

.field public final I:Z

.field public final J:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Qj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Qj;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Pj;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ZLjava/lang/String;I[B[Ljava/lang/String;[Ljava/lang/String;ZJ)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/Pj;->C:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Pj;->D:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/internal/ads/Pj;->E:I

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Pj;->F:[B

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/Pj;->G:[Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/Pj;->H:[Ljava/lang/String;

    iput-boolean p7, p0, Lcom/google/android/gms/internal/ads/Pj;->I:Z

    iput-wide p8, p0, Lcom/google/android/gms/internal/ads/Pj;->J:J

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/Pj;->C:Z

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, p2}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Pj;->D:Ljava/lang/String;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x3

    iget v1, p0, Lcom/google/android/gms/internal/ads/Pj;->E:I

    invoke-static {p1, p2, v1}, LR3/c;->k(Landroid/os/Parcel;II)V

    const/4 p2, 0x4

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Pj;->F:[B

    invoke-static {p1, p2, v1, v2}, LR3/c;->f(Landroid/os/Parcel;I[BZ)V

    const/4 p2, 0x5

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Pj;->G:[Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, LR3/c;->r(Landroid/os/Parcel;I[Ljava/lang/String;Z)V

    const/4 p2, 0x6

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Pj;->H:[Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, LR3/c;->r(Landroid/os/Parcel;I[Ljava/lang/String;Z)V

    const/4 p2, 0x7

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/Pj;->I:Z

    invoke-static {p1, p2, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x8

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/Pj;->J:J

    invoke-static {p1, p2, v1, v2}, LR3/c;->n(Landroid/os/Parcel;IJ)V

    invoke-static {p1, v0}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
