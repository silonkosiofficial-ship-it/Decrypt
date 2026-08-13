.class public final enum LS5/d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LB5/f;


# static fields
.field public static final enum D:LS5/d;

.field public static final enum E:LS5/d;

.field public static final enum F:LS5/d;

.field public static final enum G:LS5/d;

.field public static final enum H:LS5/d;

.field public static final enum I:LS5/d;

.field private static final synthetic J:[LS5/d;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LS5/d;

    const-string v1, "COLLECTION_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LS5/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, LS5/d;->D:LS5/d;

    new-instance v0, LS5/d;

    const-string v1, "COLLECTION_SDK_NOT_INSTALLED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, LS5/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, LS5/d;->E:LS5/d;

    new-instance v0, LS5/d;

    const-string v1, "COLLECTION_ENABLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, LS5/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, LS5/d;->F:LS5/d;

    new-instance v0, LS5/d;

    const-string v1, "COLLECTION_DISABLED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, LS5/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, LS5/d;->G:LS5/d;

    new-instance v0, LS5/d;

    const-string v1, "COLLECTION_DISABLED_REMOTE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, LS5/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, LS5/d;->H:LS5/d;

    new-instance v0, LS5/d;

    const-string v1, "COLLECTION_SAMPLED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, LS5/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, LS5/d;->I:LS5/d;

    invoke-static {}, LS5/d;->e()[LS5/d;

    move-result-object v0

    sput-object v0, LS5/d;->J:[LS5/d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LS5/d;->C:I

    return-void
.end method

.method private static final synthetic e()[LS5/d;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [LS5/d;

    sget-object v1, LS5/d;->D:LS5/d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LS5/d;->E:LS5/d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LS5/d;->F:LS5/d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LS5/d;->G:LS5/d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LS5/d;->H:LS5/d;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, LS5/d;->I:LS5/d;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LS5/d;
    .locals 1

    const-class v0, LS5/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LS5/d;

    return-object p0
.end method

.method public static values()[LS5/d;
    .locals 1

    sget-object v0, LS5/d;->J:[LS5/d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LS5/d;

    return-object v0
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, LS5/d;->C:I

    return v0
.end method
