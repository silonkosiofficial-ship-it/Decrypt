.class final enum LY4/p$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY4/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "b"
.end annotation


# static fields
.field public static final enum C:LY4/p$b;

.field public static final enum D:LY4/p$b;

.field private static final synthetic E:[LY4/p$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LY4/p$b;

    const-string v1, "DEFAULT_APP_CHECK_TOKEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LY4/p$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY4/p$b;->C:LY4/p$b;

    new-instance v0, LY4/p$b;

    const-string v1, "UNKNOWN_APP_CHECK_TOKEN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LY4/p$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY4/p$b;->D:LY4/p$b;

    invoke-static {}, LY4/p$b;->e()[LY4/p$b;

    move-result-object v0

    sput-object v0, LY4/p$b;->E:[LY4/p$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic e()[LY4/p$b;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LY4/p$b;

    sget-object v1, LY4/p$b;->C:LY4/p$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LY4/p$b;->D:LY4/p$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LY4/p$b;
    .locals 1

    const-class v0, LY4/p$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LY4/p$b;

    return-object p0
.end method

.method public static values()[LY4/p$b;
    .locals 1

    sget-object v0, LY4/p$b;->E:[LY4/p$b;

    invoke-virtual {v0}, [LY4/p$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LY4/p$b;

    return-object v0
.end method
