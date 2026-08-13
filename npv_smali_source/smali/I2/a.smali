.class public final enum LI2/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LI2/a;

.field public static final enum D:LI2/a;

.field private static final synthetic E:[LI2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LI2/a;

    const-string v1, "EXPONENTIAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LI2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LI2/a;->C:LI2/a;

    new-instance v1, LI2/a;

    const-string v3, "LINEAR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LI2/a;-><init>(Ljava/lang/String;I)V

    sput-object v1, LI2/a;->D:LI2/a;

    const/4 v3, 0x2

    new-array v3, v3, [LI2/a;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, LI2/a;->E:[LI2/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LI2/a;
    .locals 1

    const-class v0, LI2/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LI2/a;

    return-object p0
.end method

.method public static values()[LI2/a;
    .locals 1

    sget-object v0, LI2/a;->E:[LI2/a;

    invoke-virtual {v0}, [LI2/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LI2/a;

    return-object v0
.end method
