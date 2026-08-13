.class public final enum LF8/d0$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum C:LF8/d0$b;

.field public static final enum D:LF8/d0$b;

.field public static final enum E:LF8/d0$b;

.field private static final synthetic F:[LF8/d0$b;

.field private static final synthetic G:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LF8/d0$b;

    const-string v1, "CHECK_ONLY_LOWER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LF8/d0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF8/d0$b;->C:LF8/d0$b;

    new-instance v0, LF8/d0$b;

    const-string v1, "CHECK_SUBTYPE_AND_LOWER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF8/d0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF8/d0$b;->D:LF8/d0$b;

    new-instance v0, LF8/d0$b;

    const-string v1, "SKIP_LOWER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LF8/d0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF8/d0$b;->E:LF8/d0$b;

    invoke-static {}, LF8/d0$b;->e()[LF8/d0$b;

    move-result-object v0

    sput-object v0, LF8/d0$b;->F:[LF8/d0$b;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LF8/d0$b;->G:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LF8/d0$b;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LF8/d0$b;

    sget-object v1, LF8/d0$b;->C:LF8/d0$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LF8/d0$b;->D:LF8/d0$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LF8/d0$b;->E:LF8/d0$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LF8/d0$b;
    .locals 1

    const-class v0, LF8/d0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LF8/d0$b;

    return-object p0
.end method

.method public static values()[LF8/d0$b;
    .locals 1

    sget-object v0, LF8/d0$b;->F:[LF8/d0$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LF8/d0$b;

    return-object v0
.end method
