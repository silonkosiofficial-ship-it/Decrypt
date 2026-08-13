.class public final enum LY8/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LY8/d;

.field public static final enum D:LY8/d;

.field public static final enum E:LY8/d;

.field private static final synthetic F:[LY8/d;

.field private static final synthetic G:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LY8/d;

    const-string v1, "SUSPEND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LY8/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY8/d;->C:LY8/d;

    new-instance v0, LY8/d;

    const-string v1, "DROP_OLDEST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LY8/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY8/d;->D:LY8/d;

    new-instance v0, LY8/d;

    const-string v1, "DROP_LATEST"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LY8/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY8/d;->E:LY8/d;

    invoke-static {}, LY8/d;->e()[LY8/d;

    move-result-object v0

    sput-object v0, LY8/d;->F:[LY8/d;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LY8/d;->G:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LY8/d;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LY8/d;

    sget-object v1, LY8/d;->C:LY8/d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LY8/d;->D:LY8/d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LY8/d;->E:LY8/d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LY8/d;
    .locals 1

    const-class v0, LY8/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LY8/d;

    return-object p0
.end method

.method public static values()[LY8/d;
    .locals 1

    sget-object v0, LY8/d;->F:[LY8/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LY8/d;

    return-object v0
.end method
