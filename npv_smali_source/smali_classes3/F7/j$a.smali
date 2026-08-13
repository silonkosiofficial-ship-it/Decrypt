.class public final enum LF7/j$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF7/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum C:LF7/j$a;

.field public static final enum D:LF7/j$a;

.field public static final enum E:LF7/j$a;

.field private static final synthetic F:[LF7/j$a;

.field private static final synthetic G:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LF7/j$a;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LF7/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF7/j$a;->C:LF7/j$a;

    new-instance v0, LF7/j$a;

    const-string v1, "EXTENSION_RECEIVER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF7/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF7/j$a;->D:LF7/j$a;

    new-instance v0, LF7/j$a;

    const-string v1, "VALUE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LF7/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF7/j$a;->E:LF7/j$a;

    invoke-static {}, LF7/j$a;->e()[LF7/j$a;

    move-result-object v0

    sput-object v0, LF7/j$a;->F:[LF7/j$a;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LF7/j$a;->G:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LF7/j$a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LF7/j$a;

    sget-object v1, LF7/j$a;->C:LF7/j$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LF7/j$a;->D:LF7/j$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LF7/j$a;->E:LF7/j$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LF7/j$a;
    .locals 1

    const-class v0, LF7/j$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LF7/j$a;

    return-object p0
.end method

.method public static values()[LF7/j$a;
    .locals 1

    sget-object v0, LF7/j$a;->F:[LF7/j$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LF7/j$a;

    return-object v0
.end method
