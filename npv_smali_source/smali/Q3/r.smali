.class public LQ3/r;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LQ3/r;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final C:I

.field private final D:Z

.field private final E:Z

.field private final F:I

.field private final G:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ3/a0;

    invoke-direct {v0}, LQ3/a0;-><init>()V

    sput-object v0, LQ3/r;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IZZII)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput p1, p0, LQ3/r;->C:I

    iput-boolean p2, p0, LQ3/r;->D:Z

    iput-boolean p3, p0, LQ3/r;->E:Z

    iput p4, p0, LQ3/r;->F:I

    iput p5, p0, LQ3/r;->G:I

    return-void
.end method


# virtual methods
.method public C()I
    .locals 1

    iget v0, p0, LQ3/r;->C:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, LQ3/r;->F:I

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, LQ3/r;->G:I

    return v0
.end method

.method public s()Z
    .locals 1

    iget-boolean v0, p0, LQ3/r;->D:Z

    return v0
.end method

.method public w()Z
    .locals 1

    iget-boolean v0, p0, LQ3/r;->E:Z

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p0}, LQ3/r;->C()I

    move-result v1

    invoke-static {p1, v0, v1}, LR3/c;->k(Landroid/os/Parcel;II)V

    const/4 v0, 0x2

    invoke-virtual {p0}, LQ3/r;->s()Z

    move-result v1

    invoke-static {p1, v0, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x3

    invoke-virtual {p0}, LQ3/r;->w()Z

    move-result v1

    invoke-static {p1, v0, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x4

    invoke-virtual {p0}, LQ3/r;->e()I

    move-result v1

    invoke-static {p1, v0, v1}, LR3/c;->k(Landroid/os/Parcel;II)V

    const/4 v0, 0x5

    invoke-virtual {p0}, LQ3/r;->f()I

    move-result v1

    invoke-static {p1, v0, v1}, LR3/c;->k(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
