.class public final LN3/C;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LN3/C;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final C:Ljava/lang/String;

.field private final D:Z

.field private final E:Z

.field private final F:Landroid/content/Context;

.field private final G:Z

.field private final H:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN3/D;

    invoke-direct {v0}, LN3/D;-><init>()V

    sput-object v0, LN3/C;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;ZZLandroid/os/IBinder;ZZ)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput-object p1, p0, LN3/C;->C:Ljava/lang/String;

    iput-boolean p2, p0, LN3/C;->D:Z

    iput-boolean p3, p0, LN3/C;->E:Z

    invoke-static {p4}, LX3/a$a;->y0(Landroid/os/IBinder;)LX3/a;

    move-result-object p1

    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, LN3/C;->F:Landroid/content/Context;

    iput-boolean p5, p0, LN3/C;->G:Z

    iput-boolean p6, p0, LN3/C;->H:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-object p2, p0, LN3/C;->C:Ljava/lang/String;

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x2

    iget-boolean v1, p0, LN3/C;->D:Z

    invoke-static {p1, p2, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x3

    iget-boolean v1, p0, LN3/C;->E:Z

    invoke-static {p1, p2, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    iget-object p2, p0, LN3/C;->F:Landroid/content/Context;

    invoke-static {p2}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object p2

    const/4 v1, 0x4

    invoke-static {p1, v1, p2, v2}, LR3/c;->j(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 p2, 0x5

    iget-boolean v1, p0, LN3/C;->G:Z

    invoke-static {p1, p2, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x6

    iget-boolean v1, p0, LN3/C;->H:Z

    invoke-static {p1, p2, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
