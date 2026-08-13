.class public final Lw3/a;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw3/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public C:Ljava/lang/String;

.field public D:I

.field public E:I

.field public F:Z

.field public G:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw3/z;

    invoke-direct {v0}, Lw3/z;-><init>()V

    sput-object v0, Lw3/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIZ)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Lw3/a;-><init>(IIZZZ)V

    return-void
.end method

.method public constructor <init>(IIZZ)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lw3/a;-><init>(IIZZZ)V

    return-void
.end method

.method public constructor <init>(IIZZZ)V
    .locals 8

    .prologue
    if-eqz p3, :cond_0

    const-string p4, "0"

    goto :goto_0

    :cond_0
    if-eqz p4, :cond_1

    const-string p4, "2"

    goto :goto_0

    :cond_1
    const-string p4, "1"

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "afma-sdk-a-v"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object v2, p0

    move v4, p1

    move v5, p2

    move v6, p3

    move v7, p5

    invoke-direct/range {v2 .. v7}, Lw3/a;-><init>(Ljava/lang/String;IIZZ)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;IIZZ)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput-object p1, p0, Lw3/a;->C:Ljava/lang/String;

    iput p2, p0, Lw3/a;->D:I

    iput p3, p0, Lw3/a;->E:I

    iput-boolean p4, p0, Lw3/a;->F:Z

    iput-boolean p5, p0, Lw3/a;->G:Z

    return-void
.end method

.method public static e()Lw3/a;
    .locals 3

    new-instance v0, Lw3/a;

    const v1, 0xbdfcb8

    const/4 v2, 0x1

    invoke-direct {v0, v1, v1, v2}, Lw3/a;-><init>(IIZ)V

    return-object v0
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lw3/a;->C:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v2, v0, v1}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x3

    iget v1, p0, Lw3/a;->D:I

    invoke-static {p1, v0, v1}, LR3/c;->k(Landroid/os/Parcel;II)V

    const/4 v0, 0x4

    iget v1, p0, Lw3/a;->E:I

    invoke-static {p1, v0, v1}, LR3/c;->k(Landroid/os/Parcel;II)V

    const/4 v0, 0x5

    iget-boolean v1, p0, Lw3/a;->F:Z

    invoke-static {p1, v0, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x6

    iget-boolean v1, p0, Lw3/a;->G:Z

    invoke-static {p1, v0, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, p2}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
