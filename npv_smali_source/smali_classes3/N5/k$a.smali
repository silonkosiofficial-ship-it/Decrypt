.class public final enum LN5/k$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN5/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum D:LN5/k$a;

.field public static final enum E:LN5/k$a;

.field public static final enum F:LN5/k$a;

.field public static final enum G:LN5/k$a;

.field public static final enum H:LN5/k$a;

.field private static final synthetic I:[LN5/k$a;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LN5/k$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LN5/k$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LN5/k$a;->D:LN5/k$a;

    new-instance v0, LN5/k$a;

    const-string v1, "CONFIG_UPDATE_STREAM_ERROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, LN5/k$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LN5/k$a;->E:LN5/k$a;

    new-instance v0, LN5/k$a;

    const-string v1, "CONFIG_UPDATE_MESSAGE_INVALID"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, LN5/k$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LN5/k$a;->F:LN5/k$a;

    new-instance v0, LN5/k$a;

    const-string v1, "CONFIG_UPDATE_NOT_FETCHED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, LN5/k$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LN5/k$a;->G:LN5/k$a;

    new-instance v0, LN5/k$a;

    const-string v1, "CONFIG_UPDATE_UNAVAILABLE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, LN5/k$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LN5/k$a;->H:LN5/k$a;

    invoke-static {}, LN5/k$a;->e()[LN5/k$a;

    move-result-object v0

    sput-object v0, LN5/k$a;->I:[LN5/k$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LN5/k$a;->C:I

    return-void
.end method

.method private static synthetic e()[LN5/k$a;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [LN5/k$a;

    sget-object v1, LN5/k$a;->D:LN5/k$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LN5/k$a;->E:LN5/k$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LN5/k$a;->F:LN5/k$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LN5/k$a;->G:LN5/k$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LN5/k$a;->H:LN5/k$a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LN5/k$a;
    .locals 1

    const-class v0, LN5/k$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LN5/k$a;

    return-object p0
.end method

.method public static values()[LN5/k$a;
    .locals 1

    sget-object v0, LN5/k$a;->I:[LN5/k$a;

    invoke-virtual {v0}, [LN5/k$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LN5/k$a;

    return-object v0
.end method
