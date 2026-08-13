.class final enum LN7/i$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN7/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field public static final enum C:LN7/i$a;

.field public static final enum D:LN7/i$a;

.field public static final enum E:LN7/i$a;

.field public static final enum F:LN7/i$a;

.field public static final enum G:LN7/i$a;

.field private static final synthetic H:[LN7/i$a;

.field private static final synthetic I:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LN7/i$a;

    const-string v1, "HIDDEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LN7/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LN7/i$a;->C:LN7/i$a;

    new-instance v0, LN7/i$a;

    const-string v1, "VISIBLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LN7/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LN7/i$a;->D:LN7/i$a;

    new-instance v0, LN7/i$a;

    const-string v1, "DEPRECATED_LIST_METHODS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LN7/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LN7/i$a;->E:LN7/i$a;

    new-instance v0, LN7/i$a;

    const-string v1, "NOT_CONSIDERED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LN7/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LN7/i$a;->F:LN7/i$a;

    new-instance v0, LN7/i$a;

    const-string v1, "DROP"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LN7/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LN7/i$a;->G:LN7/i$a;

    invoke-static {}, LN7/i$a;->e()[LN7/i$a;

    move-result-object v0

    sput-object v0, LN7/i$a;->H:[LN7/i$a;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LN7/i$a;->I:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LN7/i$a;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [LN7/i$a;

    sget-object v1, LN7/i$a;->C:LN7/i$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LN7/i$a;->D:LN7/i$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LN7/i$a;->E:LN7/i$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LN7/i$a;->F:LN7/i$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LN7/i$a;->G:LN7/i$a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LN7/i$a;
    .locals 1

    const-class v0, LN7/i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LN7/i$a;

    return-object p0
.end method

.method public static values()[LN7/i$a;
    .locals 1

    sget-object v0, LN7/i$a;->H:[LN7/i$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LN7/i$a;

    return-object v0
.end method
