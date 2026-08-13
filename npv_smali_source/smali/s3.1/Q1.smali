.class public final Ls3/Q1;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ls3/Q1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final C:Z

.field public final D:Z

.field public final E:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/R1;

    invoke-direct {v0}, Ls3/R1;-><init>()V

    sput-object v0, Ls3/Q1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lk3/x;)V
    .locals 2

    invoke-virtual {p1}, Lk3/x;->c()Z

    move-result v0

    invoke-virtual {p1}, Lk3/x;->b()Z

    move-result v1

    invoke-virtual {p1}, Lk3/x;->a()Z

    move-result p1

    invoke-direct {p0, v0, v1, p1}, Ls3/Q1;-><init>(ZZZ)V

    return-void
.end method

.method public constructor <init>(ZZZ)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput-boolean p1, p0, Ls3/Q1;->C:Z

    iput-boolean p2, p0, Ls3/Q1;->D:Z

    iput-boolean p3, p0, Ls3/Q1;->E:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget-boolean p2, p0, Ls3/Q1;->C:Z

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x2

    invoke-static {p1, v1, p2}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x3

    iget-boolean v1, p0, Ls3/Q1;->D:Z

    invoke-static {p1, p2, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x4

    iget-boolean v1, p0, Ls3/Q1;->E:Z

    invoke-static {p1, p2, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
