.class public final enum LX0/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LX0/i;

.field public static final enum D:LX0/i;

.field private static final synthetic E:[LX0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LX0/i;

    const-string v1, "Ltr"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LX0/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, LX0/i;->C:LX0/i;

    new-instance v0, LX0/i;

    const-string v1, "Rtl"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LX0/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, LX0/i;->D:LX0/i;

    invoke-static {}, LX0/i;->e()[LX0/i;

    move-result-object v0

    sput-object v0, LX0/i;->E:[LX0/i;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LX0/i;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LX0/i;

    sget-object v1, LX0/i;->C:LX0/i;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LX0/i;->D:LX0/i;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LX0/i;
    .locals 1

    const-class v0, LX0/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LX0/i;

    return-object p0
.end method

.method public static values()[LX0/i;
    .locals 1

    sget-object v0, LX0/i;->E:[LX0/i;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LX0/i;

    return-object v0
.end method
