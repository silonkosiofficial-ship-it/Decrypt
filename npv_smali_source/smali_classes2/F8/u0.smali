.class public final enum LF8/u0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum G:LF8/u0;

.field public static final enum H:LF8/u0;

.field public static final enum I:LF8/u0;

.field private static final synthetic J:[LF8/u0;

.field private static final synthetic K:Lp7/a;


# instance fields
.field private final C:Ljava/lang/String;

.field private final D:Z

.field private final E:Z

.field private final F:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v7, LF8/u0;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-string v1, "INVARIANT"

    const/4 v2, 0x0

    const-string v3, ""

    const/4 v4, 0x1

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LF8/u0;-><init>(Ljava/lang/String;ILjava/lang/String;ZZI)V

    sput-object v7, LF8/u0;->G:LF8/u0;

    new-instance v0, LF8/u0;

    const/4 v13, 0x0

    const/4 v14, -0x1

    const-string v9, "IN_VARIANCE"

    const/4 v10, 0x1

    const-string v11, "in"

    const/4 v12, 0x1

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, LF8/u0;-><init>(Ljava/lang/String;ILjava/lang/String;ZZI)V

    sput-object v0, LF8/u0;->H:LF8/u0;

    new-instance v0, LF8/u0;

    const/4 v6, 0x1

    const/4 v7, 0x1

    const-string v2, "OUT_VARIANCE"

    const/4 v3, 0x2

    const-string v4, "out"

    const/4 v5, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, LF8/u0;-><init>(Ljava/lang/String;ILjava/lang/String;ZZI)V

    sput-object v0, LF8/u0;->I:LF8/u0;

    invoke-static {}, LF8/u0;->e()[LF8/u0;

    move-result-object v0

    sput-object v0, LF8/u0;->J:[LF8/u0;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LF8/u0;->K:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;ZZI)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LF8/u0;->C:Ljava/lang/String;

    iput-boolean p4, p0, LF8/u0;->D:Z

    iput-boolean p5, p0, LF8/u0;->E:Z

    iput p6, p0, LF8/u0;->F:I

    return-void
.end method

.method private static final synthetic e()[LF8/u0;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LF8/u0;

    sget-object v1, LF8/u0;->G:LF8/u0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LF8/u0;->H:LF8/u0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LF8/u0;->I:LF8/u0;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LF8/u0;
    .locals 1

    const-class v0, LF8/u0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LF8/u0;

    return-object p0
.end method

.method public static values()[LF8/u0;
    .locals 1

    sget-object v0, LF8/u0;->J:[LF8/u0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LF8/u0;

    return-object v0
.end method


# virtual methods
.method public final g()Z
    .locals 1

    iget-boolean v0, p0, LF8/u0;->E:Z

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LF8/u0;->C:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LF8/u0;->C:Ljava/lang/String;

    return-object v0
.end method
