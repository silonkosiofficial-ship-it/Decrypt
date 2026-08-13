.class public final Lcom/google/android/gms/internal/ads/Po;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/ads/Po;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final C:Landroid/os/Bundle;

.field public final D:Lw3/a;

.field public final E:Landroid/content/pm/ApplicationInfo;

.field public final F:Ljava/lang/String;

.field public final G:Ljava/util/List;

.field public final H:Landroid/content/pm/PackageInfo;

.field public final I:Ljava/lang/String;

.field public final J:Ljava/lang/String;

.field public K:Lcom/google/android/gms/internal/ads/j80;

.field public L:Ljava/lang/String;

.field public final M:Z

.field public final N:Z

.field public final O:Landroid/os/Bundle;

.field public final P:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Qo;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Qo;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Po;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;Lw3/a;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Ljava/util/List;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/j80;Ljava/lang/String;ZZLandroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Po;->C:Landroid/os/Bundle;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Po;->D:Lw3/a;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Po;->F:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Po;->E:Landroid/content/pm/ApplicationInfo;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/Po;->G:Ljava/util/List;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/Po;->H:Landroid/content/pm/PackageInfo;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/Po;->I:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/Po;->J:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/Po;->K:Lcom/google/android/gms/internal/ads/j80;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/Po;->L:Ljava/lang/String;

    iput-boolean p11, p0, Lcom/google/android/gms/internal/ads/Po;->M:Z

    iput-boolean p12, p0, Lcom/google/android/gms/internal/ads/Po;->N:Z

    iput-object p13, p0, Lcom/google/android/gms/internal/ads/Po;->O:Landroid/os/Bundle;

    iput-object p14, p0, Lcom/google/android/gms/internal/ads/Po;->P:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Po;->C:Landroid/os/Bundle;

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, v3}, LR3/c;->e(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    const/4 v0, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Po;->D:Lw3/a;

    invoke-static {p1, v0, v2, p2, v3}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v0, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Po;->E:Landroid/content/pm/ApplicationInfo;

    invoke-static {p1, v0, v2, p2, v3}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v0, 0x4

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Po;->F:Ljava/lang/String;

    invoke-static {p1, v0, v2, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x5

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Po;->G:Ljava/util/List;

    invoke-static {p1, v0, v2, v3}, LR3/c;->s(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/4 v0, 0x6

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Po;->H:Landroid/content/pm/PackageInfo;

    invoke-static {p1, v0, v2, p2, v3}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v0, 0x7

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Po;->I:Ljava/lang/String;

    invoke-static {p1, v0, v2, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v0, 0x9

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Po;->J:Ljava/lang/String;

    invoke-static {p1, v0, v2, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v0, 0xa

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Po;->K:Lcom/google/android/gms/internal/ads/j80;

    invoke-static {p1, v0, v2, p2, v3}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 p2, 0xb

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Po;->L:Ljava/lang/String;

    invoke-static {p1, p2, v0, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0xc

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/Po;->M:Z

    invoke-static {p1, p2, v0}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0xd

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/Po;->N:Z

    invoke-static {p1, p2, v0}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0xe

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Po;->O:Landroid/os/Bundle;

    invoke-static {p1, p2, v0, v3}, LR3/c;->e(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    const/16 p2, 0xf

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Po;->P:Landroid/os/Bundle;

    invoke-static {p1, p2, v0, v3}, LR3/c;->e(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    invoke-static {p1, v1}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
