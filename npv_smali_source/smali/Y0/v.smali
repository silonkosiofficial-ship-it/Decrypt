.class public final enum LY0/v;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LY0/v;

.field public static final enum D:LY0/v;

.field private static final synthetic E:[LY0/v;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LY0/v;

    const-string v1, "Ltr"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LY0/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY0/v;->C:LY0/v;

    new-instance v0, LY0/v;

    const-string v1, "Rtl"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LY0/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY0/v;->D:LY0/v;

    invoke-static {}, LY0/v;->e()[LY0/v;

    move-result-object v0

    sput-object v0, LY0/v;->E:[LY0/v;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LY0/v;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LY0/v;

    sget-object v1, LY0/v;->C:LY0/v;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LY0/v;->D:LY0/v;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LY0/v;
    .locals 1

    const-class v0, LY0/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LY0/v;

    return-object p0
.end method

.method public static values()[LY0/v;
    .locals 1

    sget-object v0, LY0/v;->E:[LY0/v;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LY0/v;

    return-object v0
.end method
