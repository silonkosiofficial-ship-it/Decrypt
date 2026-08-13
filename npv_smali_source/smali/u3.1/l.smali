.class public final Lu3/l;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lu3/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final C:Ljava/lang/String;

.field public final D:Ljava/lang/String;

.field public final E:Ljava/lang/String;

.field public final F:Ljava/lang/String;

.field public final G:Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final I:Ljava/lang/String;

.field public final J:Landroid/content/Intent;

.field public final K:Lu3/b;

.field public final L:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu3/k;

    invoke-direct {v0}, Lu3/k;-><init>()V

    sput-object v0, Lu3/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Intent;Lu3/b;)V
    .locals 11

    invoke-static {p2}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object p2

    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v8, p1

    invoke-direct/range {v0 .. v10}, Lu3/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;Landroid/os/IBinder;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;Landroid/os/IBinder;Z)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput-object p1, p0, Lu3/l;->C:Ljava/lang/String;

    iput-object p2, p0, Lu3/l;->D:Ljava/lang/String;

    iput-object p3, p0, Lu3/l;->E:Ljava/lang/String;

    iput-object p4, p0, Lu3/l;->F:Ljava/lang/String;

    iput-object p5, p0, Lu3/l;->G:Ljava/lang/String;

    iput-object p6, p0, Lu3/l;->H:Ljava/lang/String;

    iput-object p7, p0, Lu3/l;->I:Ljava/lang/String;

    iput-object p8, p0, Lu3/l;->J:Landroid/content/Intent;

    invoke-static {p9}, LX3/a$a;->y0(Landroid/os/IBinder;)LX3/a;

    move-result-object p1

    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu3/b;

    iput-object p1, p0, Lu3/l;->K:Lu3/b;

    iput-boolean p10, p0, Lu3/l;->L:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu3/b;)V
    .locals 12

    invoke-static/range {p8 .. p8}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v11}, Lu3/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;Landroid/os/IBinder;Z)V

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    iget-object v0, p0, Lu3/l;->C:Ljava/lang/String;

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x3

    iget-object v2, p0, Lu3/l;->D:Ljava/lang/String;

    invoke-static {p1, v0, v2, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x4

    iget-object v2, p0, Lu3/l;->E:Ljava/lang/String;

    invoke-static {p1, v0, v2, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x5

    iget-object v2, p0, Lu3/l;->F:Ljava/lang/String;

    invoke-static {p1, v0, v2, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x6

    iget-object v2, p0, Lu3/l;->G:Ljava/lang/String;

    invoke-static {p1, v0, v2, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x7

    iget-object v2, p0, Lu3/l;->H:Ljava/lang/String;

    invoke-static {p1, v0, v2, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v0, 0x8

    iget-object v2, p0, Lu3/l;->I:Ljava/lang/String;

    invoke-static {p1, v0, v2, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v0, 0x9

    iget-object v2, p0, Lu3/l;->J:Landroid/content/Intent;

    invoke-static {p1, v0, v2, p2, v3}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object p2, p0, Lu3/l;->K:Lu3/b;

    invoke-static {p2}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object p2

    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    const/16 v0, 0xa

    invoke-static {p1, v0, p2, v3}, LR3/c;->j(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/16 p2, 0xb

    iget-boolean v0, p0, Lu3/l;->L:Z

    invoke-static {p1, p2, v0}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v1}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
