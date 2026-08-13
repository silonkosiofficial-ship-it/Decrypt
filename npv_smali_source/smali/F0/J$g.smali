.class public final enum LF0/J$g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation


# static fields
.field public static final enum C:LF0/J$g;

.field public static final enum D:LF0/J$g;

.field public static final enum E:LF0/J$g;

.field private static final synthetic F:[LF0/J$g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LF0/J$g;

    const-string v1, "InMeasureBlock"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LF0/J$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF0/J$g;->C:LF0/J$g;

    new-instance v0, LF0/J$g;

    const-string v1, "InLayoutBlock"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF0/J$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF0/J$g;->D:LF0/J$g;

    new-instance v0, LF0/J$g;

    const-string v1, "NotUsed"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LF0/J$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF0/J$g;->E:LF0/J$g;

    invoke-static {}, LF0/J$g;->e()[LF0/J$g;

    move-result-object v0

    sput-object v0, LF0/J$g;->F:[LF0/J$g;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LF0/J$g;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LF0/J$g;

    sget-object v1, LF0/J$g;->C:LF0/J$g;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LF0/J$g;->D:LF0/J$g;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LF0/J$g;->E:LF0/J$g;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LF0/J$g;
    .locals 1

    const-class v0, LF0/J$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LF0/J$g;

    return-object p0
.end method

.method public static values()[LF0/J$g;
    .locals 1

    sget-object v0, LF0/J$g;->F:[LF0/J$g;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LF0/J$g;

    return-object v0
.end method
