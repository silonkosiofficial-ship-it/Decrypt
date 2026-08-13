.class public final enum LF0/D0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LF0/D0;

.field public static final enum D:LF0/D0;

.field public static final enum E:LF0/D0;

.field private static final synthetic F:[LF0/D0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LF0/D0;

    const-string v1, "ContinueTraversal"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LF0/D0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF0/D0;->C:LF0/D0;

    new-instance v0, LF0/D0;

    const-string v1, "SkipSubtreeAndContinueTraversal"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF0/D0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF0/D0;->D:LF0/D0;

    new-instance v0, LF0/D0;

    const-string v1, "CancelTraversal"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LF0/D0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF0/D0;->E:LF0/D0;

    invoke-static {}, LF0/D0;->e()[LF0/D0;

    move-result-object v0

    sput-object v0, LF0/D0;->F:[LF0/D0;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LF0/D0;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LF0/D0;

    sget-object v1, LF0/D0;->C:LF0/D0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LF0/D0;->D:LF0/D0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LF0/D0;->E:LF0/D0;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LF0/D0;
    .locals 1

    const-class v0, LF0/D0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LF0/D0;

    return-object p0
.end method

.method public static values()[LF0/D0;
    .locals 1

    sget-object v0, LF0/D0;->F:[LF0/D0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LF0/D0;

    return-object v0
.end method
