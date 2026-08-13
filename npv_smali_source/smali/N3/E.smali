.class public final LN3/E;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LN3/E;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final C:Z

.field private final D:Ljava/lang/String;

.field private final E:I

.field private final F:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN3/F;

    invoke-direct {v0}, LN3/F;-><init>()V

    sput-object v0, LN3/E;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ZLjava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput-boolean p1, p0, LN3/E;->C:Z

    iput-object p2, p0, LN3/E;->D:Ljava/lang/String;

    invoke-static {p3}, LN3/M;->a(I)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, LN3/E;->E:I

    invoke-static {p4}, LN3/r;->a(I)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, LN3/E;->F:I

    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LN3/E;->D:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, LN3/E;->C:Z

    return v0
.end method

.method public final s()I
    .locals 1

    iget v0, p0, LN3/E;->F:I

    invoke-static {v0}, LN3/r;->a(I)I

    move-result v0

    return v0
.end method

.method public final w()I
    .locals 1

    iget v0, p0, LN3/E;->E:I

    invoke-static {v0}, LN3/M;->a(I)I

    move-result v0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    iget-boolean v1, p0, LN3/E;->C:Z

    invoke-static {p1, v0, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, LN3/E;->D:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v2, v0, v1}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x3

    iget v1, p0, LN3/E;->E:I

    invoke-static {p1, v0, v1}, LR3/c;->k(Landroid/os/Parcel;II)V

    const/4 v0, 0x4

    iget v1, p0, LN3/E;->F:I

    invoke-static {p1, v0, v1}, LR3/c;->k(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
