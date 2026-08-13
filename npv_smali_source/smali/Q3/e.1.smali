.class public LQ3/e;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LQ3/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final C:LQ3/r;

.field private final D:Z

.field private final E:Z

.field private final F:[I

.field private final G:I

.field private final H:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ3/j0;

    invoke-direct {v0}, LQ3/j0;-><init>()V

    sput-object v0, LQ3/e;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(LQ3/r;ZZ[II[I)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput-object p1, p0, LQ3/e;->C:LQ3/r;

    iput-boolean p2, p0, LQ3/e;->D:Z

    iput-boolean p3, p0, LQ3/e;->E:Z

    iput-object p4, p0, LQ3/e;->F:[I

    iput p5, p0, LQ3/e;->G:I

    iput-object p6, p0, LQ3/e;->H:[I

    return-void
.end method


# virtual methods
.method public C()Z
    .locals 1

    iget-boolean v0, p0, LQ3/e;->E:Z

    return v0
.end method

.method public final D()LQ3/r;
    .locals 1

    iget-object v0, p0, LQ3/e;->C:LQ3/r;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, LQ3/e;->G:I

    return v0
.end method

.method public f()[I
    .locals 1

    iget-object v0, p0, LQ3/e;->F:[I

    return-object v0
.end method

.method public s()[I
    .locals 1

    iget-object v0, p0, LQ3/e;->H:[I

    return-object v0
.end method

.method public w()Z
    .locals 1

    iget-boolean v0, p0, LQ3/e;->D:Z

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, LQ3/e;->C:LQ3/r;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x2

    invoke-virtual {p0}, LQ3/e;->w()Z

    move-result v1

    invoke-static {p1, p2, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x3

    invoke-virtual {p0}, LQ3/e;->C()Z

    move-result v1

    invoke-static {p1, p2, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x4

    invoke-virtual {p0}, LQ3/e;->f()[I

    move-result-object v1

    invoke-static {p1, p2, v1, v3}, LR3/c;->l(Landroid/os/Parcel;I[IZ)V

    const/4 p2, 0x5

    invoke-virtual {p0}, LQ3/e;->e()I

    move-result v1

    invoke-static {p1, p2, v1}, LR3/c;->k(Landroid/os/Parcel;II)V

    const/4 p2, 0x6

    invoke-virtual {p0}, LQ3/e;->s()[I

    move-result-object v1

    invoke-static {p1, p2, v1, v3}, LR3/c;->l(Landroid/os/Parcel;I[IZ)V

    invoke-static {p1, v0}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
