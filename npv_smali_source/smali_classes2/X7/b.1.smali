.class public final enum LX7/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum D:LX7/b;

.field public static final enum E:LX7/b;

.field public static final enum F:LX7/b;

.field public static final enum G:LX7/b;

.field public static final enum H:LX7/b;

.field public static final enum I:LX7/b;

.field private static final synthetic J:[LX7/b;

.field private static final synthetic K:Lp7/a;


# instance fields
.field private final C:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LX7/b;

    const/4 v1, 0x0

    const-string v2, "METHOD"

    const-string v3, "METHOD_RETURN_TYPE"

    invoke-direct {v0, v3, v1, v2}, LX7/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LX7/b;->D:LX7/b;

    new-instance v0, LX7/b;

    const/4 v1, 0x1

    const-string v2, "PARAMETER"

    const-string v3, "VALUE_PARAMETER"

    invoke-direct {v0, v3, v1, v2}, LX7/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LX7/b;->E:LX7/b;

    new-instance v0, LX7/b;

    const-string v1, "FIELD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v1}, LX7/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LX7/b;->F:LX7/b;

    new-instance v0, LX7/b;

    const/4 v1, 0x3

    const-string v2, "TYPE_USE"

    invoke-direct {v0, v2, v1, v2}, LX7/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LX7/b;->G:LX7/b;

    new-instance v0, LX7/b;

    const-string v1, "TYPE_PARAMETER_BOUNDS"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v3, v2}, LX7/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LX7/b;->H:LX7/b;

    new-instance v0, LX7/b;

    const-string v1, "TYPE_PARAMETER"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v1}, LX7/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LX7/b;->I:LX7/b;

    invoke-static {}, LX7/b;->e()[LX7/b;

    move-result-object v0

    sput-object v0, LX7/b;->J:[LX7/b;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LX7/b;->K:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LX7/b;->C:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic e()[LX7/b;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [LX7/b;

    sget-object v1, LX7/b;->D:LX7/b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LX7/b;->E:LX7/b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LX7/b;->F:LX7/b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LX7/b;->G:LX7/b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LX7/b;->H:LX7/b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, LX7/b;->I:LX7/b;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LX7/b;
    .locals 1

    const-class v0, LX7/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LX7/b;

    return-object p0
.end method

.method public static values()[LX7/b;
    .locals 1

    sget-object v0, LX7/b;->J:[LX7/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LX7/b;

    return-object v0
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LX7/b;->C:Ljava/lang/String;

    return-object v0
.end method
