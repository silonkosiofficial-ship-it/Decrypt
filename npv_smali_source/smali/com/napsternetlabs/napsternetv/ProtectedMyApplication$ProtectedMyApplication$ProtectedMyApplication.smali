.class public final Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$ProtectedMyApplication;
.super Ljava/lang/Object;


# static fields
.field public static final Cy:Ljava/lang/String;

.field public static DwG:Ljava/lang/String;


# instance fields
.field public final F:Z

.field public final FEuI:Z

.field public final He:Z

.field public final cJpkG:Ljava/lang/String;

.field public final hBty:Z

.field public final j:Z

.field public final je:I

.field public final mcJyl:Ljava/lang/String;

.field public final tDlb:Z

.field public final uDwg:I

.field public final wlAv:Z

.field public final z:Z

.field public final zy:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const/16 v0, 0x10

    shl-long/2addr v5, v0

    const-wide/32 v7, 0xffff

    and-long/2addr v1, v7

    or-long/2addr v1, v5

    new-instance v0, Ljava/util/UUID;

    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$ProtectedMyApplication;->Cy:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$ProtectedMyApplication;->Cy:Ljava/lang/String;

    iput-object p1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$ProtectedMyApplication;->mcJyl:Ljava/lang/String;

    iput-object p2, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$ProtectedMyApplication;->cJpkG:Ljava/lang/String;

    iput p3, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$ProtectedMyApplication;->je:I

    and-int/lit8 p1, p3, 0x1

    int-to-byte p1, p1

    iput-boolean p1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$ProtectedMyApplication;->hBty:Z

    ushr-int/lit8 p1, p3, 0x1

    and-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-boolean p1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$ProtectedMyApplication;->F:Z

    ushr-int/lit8 p1, p3, 0x2

    and-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-boolean p1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$ProtectedMyApplication;->FEuI:Z

    ushr-int/lit8 p1, p3, 0x3

    and-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-boolean p1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$ProtectedMyApplication;->j:Z

    ushr-int/lit8 p1, p3, 0x4

    and-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-boolean p1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$ProtectedMyApplication;->He:Z

    ushr-int/lit8 p1, p3, 0x5

    and-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-boolean p1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$ProtectedMyApplication;->zy:Z

    ushr-int/lit8 p1, p3, 0x6

    and-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-boolean p1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$ProtectedMyApplication;->tDlb:Z

    ushr-int/lit8 p1, p3, 0x7

    and-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-boolean p1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$ProtectedMyApplication;->z:Z

    ushr-int/lit8 p1, p3, 0x8

    and-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-boolean p1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$ProtectedMyApplication;->wlAv:Z

    const/4 p1, 0x2

    iput p1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$ProtectedMyApplication;->uDwg:I

    return-void
.end method

.method public static EApqlj(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public static native dkGvElB()Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$ProtectedMyApplication;
.end method


# virtual methods
.method public native n(Ljava/lang/String;)Ljava/lang/String;
.end method
