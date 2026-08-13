.class public final LQ3/O;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LQ3/O;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final C:I

.field final D:Landroid/os/IBinder;

.field private final E:LN3/b;

.field private final F:Z

.field private final G:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ3/P;

    invoke-direct {v0}, LQ3/P;-><init>()V

    sput-object v0, LQ3/O;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;LN3/b;ZZ)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput p1, p0, LQ3/O;->C:I

    iput-object p2, p0, LQ3/O;->D:Landroid/os/IBinder;

    iput-object p3, p0, LQ3/O;->E:LN3/b;

    iput-boolean p4, p0, LQ3/O;->F:Z

    iput-boolean p5, p0, LQ3/O;->G:Z

    return-void
.end method


# virtual methods
.method public final e()LN3/b;
    .locals 1

    iget-object v0, p0, LQ3/O;->E:LN3/b;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-ne p0, p1, :cond_1

    return v1

    :cond_1
    instance-of v2, p1, LQ3/O;

    if-nez v2, :cond_2

    return v0

    :cond_2
    check-cast p1, LQ3/O;

    iget-object v2, p0, LQ3/O;->E:LN3/b;

    iget-object v3, p1, LQ3/O;->E:LN3/b;

    invoke-virtual {v2, v3}, LN3/b;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, LQ3/O;->f()LQ3/j;

    move-result-object v2

    invoke-virtual {p1}, LQ3/O;->f()LQ3/j;

    move-result-object p1

    invoke-static {v2, p1}, LQ3/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public final f()LQ3/j;
    .locals 1

    .prologue
    iget-object v0, p0, LQ3/O;->D:Landroid/os/IBinder;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, LQ3/j$a;->y0(Landroid/os/IBinder;)LQ3/j;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, LQ3/O;->C:I

    invoke-static {p1, v1, v2}, LR3/c;->k(Landroid/os/Parcel;II)V

    iget-object v1, p0, LQ3/O;->D:Landroid/os/IBinder;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, LR3/c;->j(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 v1, 0x3

    iget-object v2, p0, LQ3/O;->E:LN3/b;

    invoke-static {p1, v1, v2, p2, v3}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x4

    iget-boolean v1, p0, LQ3/O;->F:Z

    invoke-static {p1, p2, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x5

    iget-boolean v1, p0, LQ3/O;->G:Z

    invoke-static {p1, p2, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
