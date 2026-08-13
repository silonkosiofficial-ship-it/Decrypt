.class public final Ls3/g2;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ls3/g2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final C:Ljava/lang/String;

.field public D:J

.field public E:Ls3/W0;

.field public final F:Landroid/os/Bundle;

.field public final G:Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final I:Ljava/lang/String;

.field public final J:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/h2;

    invoke-direct {v0}, Ls3/h2;-><init>()V

    sput-object v0, Ls3/g2;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLs3/W0;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput-object p1, p0, Ls3/g2;->C:Ljava/lang/String;

    iput-wide p2, p0, Ls3/g2;->D:J

    iput-object p4, p0, Ls3/g2;->E:Ls3/W0;

    iput-object p5, p0, Ls3/g2;->F:Landroid/os/Bundle;

    iput-object p6, p0, Ls3/g2;->G:Ljava/lang/String;

    iput-object p7, p0, Ls3/g2;->H:Ljava/lang/String;

    iput-object p8, p0, Ls3/g2;->I:Ljava/lang/String;

    iput-object p9, p0, Ls3/g2;->J:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

    iget-object v0, p0, Ls3/g2;->C:Ljava/lang/String;

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x2

    iget-wide v4, p0, Ls3/g2;->D:J

    invoke-static {p1, v0, v4, v5}, LR3/c;->n(Landroid/os/Parcel;IJ)V

    const/4 v0, 0x3

    iget-object v2, p0, Ls3/g2;->E:Ls3/W0;

    invoke-static {p1, v0, v2, p2, v3}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x4

    iget-object v0, p0, Ls3/g2;->F:Landroid/os/Bundle;

    invoke-static {p1, p2, v0, v3}, LR3/c;->e(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    const/4 p2, 0x5

    iget-object v0, p0, Ls3/g2;->G:Ljava/lang/String;

    invoke-static {p1, p2, v0, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x6

    iget-object v0, p0, Ls3/g2;->H:Ljava/lang/String;

    invoke-static {p1, p2, v0, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x7

    iget-object v0, p0, Ls3/g2;->I:Ljava/lang/String;

    invoke-static {p1, p2, v0, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0x8

    iget-object v0, p0, Ls3/g2;->J:Ljava/lang/String;

    invoke-static {p1, p2, v0, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v1}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
