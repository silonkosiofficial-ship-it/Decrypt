.class public final Lk4/l;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lk4/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final C:I

.field private final D:LN3/b;

.field private final E:LQ3/O;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk4/m;

    invoke-direct {v0}, Lk4/m;-><init>()V

    sput-object v0, Lk4/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILN3/b;LQ3/O;)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput p1, p0, Lk4/l;->C:I

    iput-object p2, p0, Lk4/l;->D:LN3/b;

    iput-object p3, p0, Lk4/l;->E:LQ3/O;

    return-void
.end method


# virtual methods
.method public final e()LN3/b;
    .locals 1

    iget-object v0, p0, Lk4/l;->D:LN3/b;

    return-object v0
.end method

.method public final f()LQ3/O;
    .locals 1

    iget-object v0, p0, Lk4/l;->E:LQ3/O;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lk4/l;->C:I

    invoke-static {p1, v1, v2}, LR3/c;->k(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lk4/l;->D:LN3/b;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x3

    iget-object v2, p0, Lk4/l;->E:LQ3/O;

    invoke-static {p1, v1, v2, p2, v3}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
