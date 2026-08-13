.class public final Ls3/e2;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ls3/e2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final C:I

.field public final D:I

.field public final E:Ljava/lang/String;

.field public final F:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/f2;

    invoke-direct {v0}, Ls3/f2;-><init>()V

    sput-object v0, Ls3/e2;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput p1, p0, Ls3/e2;->C:I

    iput p2, p0, Ls3/e2;->D:I

    iput-object p3, p0, Ls3/e2;->E:Ljava/lang/String;

    iput-wide p4, p0, Ls3/e2;->F:J

    return-void
.end method

.method public static e(Lorg/json/JSONObject;)Ls3/e2;
    .locals 7

    const-string v0, "type_num"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    const-string v0, "precision_num"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    const-string v0, "currency"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "value"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v5

    new-instance p0, Ls3/e2;

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Ls3/e2;-><init>(IILjava/lang/String;J)V

    return-object p0
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget p2, p0, Ls3/e2;->C:I

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, p2}, LR3/c;->k(Landroid/os/Parcel;II)V

    const/4 p2, 0x2

    iget v1, p0, Ls3/e2;->D:I

    invoke-static {p1, p2, v1}, LR3/c;->k(Landroid/os/Parcel;II)V

    iget-object p2, p0, Ls3/e2;->E:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {p1, v2, p2, v1}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x4

    iget-wide v1, p0, Ls3/e2;->F:J

    invoke-static {p1, p2, v1, v2}, LR3/c;->n(Landroid/os/Parcel;IJ)V

    invoke-static {p1, v0}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
