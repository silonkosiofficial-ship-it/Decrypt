.class public final enum Lq8/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lq8/a;

.field public static final enum F:Lq8/a;

.field public static final enum G:Lq8/a;

.field private static final synthetic H:[Lq8/a;

.field private static final synthetic I:Lp7/a;


# instance fields
.field private final C:Z

.field private final D:Z


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v7, Lq8/a;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const-string v1, "NO_ARGUMENTS"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lq8/a;-><init>(Ljava/lang/String;IZZILy7/k;)V

    sput-object v7, Lq8/a;->E:Lq8/a;

    new-instance v0, Lq8/a;

    const/4 v13, 0x2

    const/4 v14, 0x0

    const-string v9, "UNLESS_EMPTY"

    const/4 v10, 0x1

    const/4 v11, 0x1

    const/4 v12, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Lq8/a;-><init>(Ljava/lang/String;IZZILy7/k;)V

    sput-object v0, Lq8/a;->F:Lq8/a;

    new-instance v0, Lq8/a;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const-string v3, "ALWAYS_PARENTHESIZED"

    invoke-direct {v0, v3, v1, v2, v2}, Lq8/a;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Lq8/a;->G:Lq8/a;

    invoke-static {}, Lq8/a;->e()[Lq8/a;

    move-result-object v0

    sput-object v0, Lq8/a;->H:[Lq8/a;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lq8/a;->I:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZZ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lq8/a;->C:Z

    iput-boolean p4, p0, Lq8/a;->D:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IZZILy7/k;)V
    .locals 1

    .prologue
    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    move p4, v0

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lq8/a;-><init>(Ljava/lang/String;IZZ)V

    return-void
.end method

.method private static final synthetic e()[Lq8/a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lq8/a;

    sget-object v1, Lq8/a;->E:Lq8/a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lq8/a;->F:Lq8/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lq8/a;->G:Lq8/a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lq8/a;
    .locals 1

    const-class v0, Lq8/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq8/a;

    return-object p0
.end method

.method public static values()[Lq8/a;
    .locals 1

    sget-object v0, Lq8/a;->H:[Lq8/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq8/a;

    return-object v0
.end method


# virtual methods
.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lq8/a;->C:Z

    return v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Lq8/a;->D:Z

    return v0
.end method
