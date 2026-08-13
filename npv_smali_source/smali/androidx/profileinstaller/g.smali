.class final enum Landroidx/profileinstaller/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum D:Landroidx/profileinstaller/g;

.field public static final enum E:Landroidx/profileinstaller/g;

.field public static final enum F:Landroidx/profileinstaller/g;

.field public static final enum G:Landroidx/profileinstaller/g;

.field public static final enum H:Landroidx/profileinstaller/g;

.field private static final synthetic I:[Landroidx/profileinstaller/g;


# instance fields
.field private final C:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Landroidx/profileinstaller/g;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-string v4, "DEX_FILES"

    invoke-direct {v0, v4, v1, v2, v3}, Landroidx/profileinstaller/g;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Landroidx/profileinstaller/g;->D:Landroidx/profileinstaller/g;

    new-instance v0, Landroidx/profileinstaller/g;

    const/4 v1, 0x1

    const-wide/16 v2, 0x1

    const-string v4, "EXTRA_DESCRIPTORS"

    invoke-direct {v0, v4, v1, v2, v3}, Landroidx/profileinstaller/g;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Landroidx/profileinstaller/g;->E:Landroidx/profileinstaller/g;

    new-instance v0, Landroidx/profileinstaller/g;

    const/4 v1, 0x2

    const-wide/16 v2, 0x2

    const-string v4, "CLASSES"

    invoke-direct {v0, v4, v1, v2, v3}, Landroidx/profileinstaller/g;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Landroidx/profileinstaller/g;->F:Landroidx/profileinstaller/g;

    new-instance v0, Landroidx/profileinstaller/g;

    const/4 v1, 0x3

    const-wide/16 v2, 0x3

    const-string v4, "METHODS"

    invoke-direct {v0, v4, v1, v2, v3}, Landroidx/profileinstaller/g;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Landroidx/profileinstaller/g;->G:Landroidx/profileinstaller/g;

    new-instance v0, Landroidx/profileinstaller/g;

    const/4 v1, 0x4

    const-wide/16 v2, 0x4

    const-string v4, "AGGREGATION_COUNT"

    invoke-direct {v0, v4, v1, v2, v3}, Landroidx/profileinstaller/g;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Landroidx/profileinstaller/g;->H:Landroidx/profileinstaller/g;

    invoke-static {}, Landroidx/profileinstaller/g;->e()[Landroidx/profileinstaller/g;

    move-result-object v0

    sput-object v0, Landroidx/profileinstaller/g;->I:[Landroidx/profileinstaller/g;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IJ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, Landroidx/profileinstaller/g;->C:J

    return-void
.end method

.method private static synthetic e()[Landroidx/profileinstaller/g;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Landroidx/profileinstaller/g;

    sget-object v1, Landroidx/profileinstaller/g;->D:Landroidx/profileinstaller/g;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Landroidx/profileinstaller/g;->E:Landroidx/profileinstaller/g;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Landroidx/profileinstaller/g;->F:Landroidx/profileinstaller/g;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Landroidx/profileinstaller/g;->G:Landroidx/profileinstaller/g;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Landroidx/profileinstaller/g;->H:Landroidx/profileinstaller/g;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/profileinstaller/g;
    .locals 1

    const-class v0, Landroidx/profileinstaller/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/profileinstaller/g;

    return-object p0
.end method

.method public static values()[Landroidx/profileinstaller/g;
    .locals 1

    sget-object v0, Landroidx/profileinstaller/g;->I:[Landroidx/profileinstaller/g;

    invoke-virtual {v0}, [Landroidx/profileinstaller/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/profileinstaller/g;

    return-object v0
.end method


# virtual methods
.method public g()J
    .locals 2

    iget-wide v0, p0, Landroidx/profileinstaller/g;->C:J

    return-wide v0
.end method
