.class public final Ls3/W0;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ls3/W0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final C:I

.field public final D:Ljava/lang/String;

.field public final E:Ljava/lang/String;

.field public F:Ls3/W0;

.field public G:Landroid/os/IBinder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/r1;

    invoke-direct {v0}, Ls3/r1;-><init>()V

    sput-object v0, Ls3/W0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ls3/W0;Landroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput p1, p0, Ls3/W0;->C:I

    iput-object p2, p0, Ls3/W0;->D:Ljava/lang/String;

    iput-object p3, p0, Ls3/W0;->E:Ljava/lang/String;

    iput-object p4, p0, Ls3/W0;->F:Ls3/W0;

    iput-object p5, p0, Ls3/W0;->G:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final e()Lk3/b;
    .locals 5

    .prologue
    iget-object v0, p0, Ls3/W0;->F:Ls3/W0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Ls3/W0;->E:Ljava/lang/String;

    iget-object v2, v0, Ls3/W0;->D:Ljava/lang/String;

    iget v0, v0, Ls3/W0;->C:I

    new-instance v3, Lk3/b;

    invoke-direct {v3, v0, v2, v1}, Lk3/b;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object v0, v3

    :goto_0
    iget v1, p0, Ls3/W0;->C:I

    iget-object v2, p0, Ls3/W0;->D:Ljava/lang/String;

    iget-object v3, p0, Ls3/W0;->E:Ljava/lang/String;

    new-instance v4, Lk3/b;

    invoke-direct {v4, v1, v2, v3, v0}, Lk3/b;-><init>(ILjava/lang/String;Ljava/lang/String;Lk3/b;)V

    return-object v4
.end method

.method public final f()Lk3/m;
    .locals 11

    .prologue
    iget-object v0, p0, Ls3/W0;->F:Ls3/W0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v9, v1

    goto :goto_0

    :cond_0
    iget-object v2, v0, Ls3/W0;->E:Ljava/lang/String;

    iget-object v3, v0, Ls3/W0;->D:Ljava/lang/String;

    iget v0, v0, Ls3/W0;->C:I

    new-instance v4, Lk3/b;

    invoke-direct {v4, v0, v3, v2}, Lk3/b;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object v9, v4

    :goto_0
    iget v6, p0, Ls3/W0;->C:I

    iget-object v7, p0, Ls3/W0;->D:Ljava/lang/String;

    iget-object v8, p0, Ls3/W0;->E:Ljava/lang/String;

    new-instance v0, Lk3/m;

    iget-object v2, p0, Ls3/W0;->G:Landroid/os/IBinder;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "com.google.android.gms.ads.internal.client.IResponseInfo"

    invoke-interface {v2, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    instance-of v3, v1, Ls3/U0;

    if-eqz v3, :cond_2

    check-cast v1, Ls3/U0;

    goto :goto_1

    :cond_2
    new-instance v1, Ls3/S0;

    invoke-direct {v1, v2}, Ls3/S0;-><init>(Landroid/os/IBinder;)V

    :goto_1
    invoke-static {v1}, Lk3/u;->d(Ls3/U0;)Lk3/u;

    move-result-object v10

    move-object v5, v0

    invoke-direct/range {v5 .. v10}, Lk3/m;-><init>(ILjava/lang/String;Ljava/lang/String;Lk3/b;Lk3/u;)V

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    iget v0, p0, Ls3/W0;->C:I

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x1

    invoke-static {p1, v2, v0}, LR3/c;->k(Landroid/os/Parcel;II)V

    iget-object v0, p0, Ls3/W0;->D:Ljava/lang/String;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x3

    iget-object v2, p0, Ls3/W0;->E:Ljava/lang/String;

    invoke-static {p1, v0, v2, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x4

    iget-object v2, p0, Ls3/W0;->F:Ls3/W0;

    invoke-static {p1, v0, v2, p2, v3}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x5

    iget-object v0, p0, Ls3/W0;->G:Landroid/os/IBinder;

    invoke-static {p1, p2, v0, v3}, LR3/c;->j(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    invoke-static {p1, v1}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
