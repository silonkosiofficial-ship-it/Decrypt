.class public final enum LO7/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum D:LO7/f;

.field public static final enum E:LO7/f;

.field public static final enum F:LO7/f;

.field public static final enum G:LO7/f;

.field public static final enum H:LO7/f;

.field public static final enum I:LO7/f;

.field private static final synthetic J:[LO7/f;

.field private static final synthetic K:Lp7/a;


# instance fields
.field private final C:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LO7/f;

    const/4 v1, 0x0

    const-string v2, "class"

    const-string v3, "CLASS"

    invoke-direct {v0, v3, v1, v2}, LO7/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LO7/f;->D:LO7/f;

    new-instance v0, LO7/f;

    const/4 v1, 0x1

    const-string v2, "interface"

    const-string v3, "INTERFACE"

    invoke-direct {v0, v3, v1, v2}, LO7/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LO7/f;->E:LO7/f;

    new-instance v0, LO7/f;

    const/4 v1, 0x2

    const-string v2, "enum class"

    const-string v3, "ENUM_CLASS"

    invoke-direct {v0, v3, v1, v2}, LO7/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LO7/f;->F:LO7/f;

    new-instance v0, LO7/f;

    const/4 v1, 0x3

    const/4 v2, 0x0

    const-string v3, "ENUM_ENTRY"

    invoke-direct {v0, v3, v1, v2}, LO7/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LO7/f;->G:LO7/f;

    new-instance v0, LO7/f;

    const/4 v1, 0x4

    const-string v2, "annotation class"

    const-string v3, "ANNOTATION_CLASS"

    invoke-direct {v0, v3, v1, v2}, LO7/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LO7/f;->H:LO7/f;

    new-instance v0, LO7/f;

    const/4 v1, 0x5

    const-string v2, "object"

    const-string v3, "OBJECT"

    invoke-direct {v0, v3, v1, v2}, LO7/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LO7/f;->I:LO7/f;

    invoke-static {}, LO7/f;->e()[LO7/f;

    move-result-object v0

    sput-object v0, LO7/f;->J:[LO7/f;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LO7/f;->K:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LO7/f;->C:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic e()[LO7/f;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [LO7/f;

    sget-object v1, LO7/f;->D:LO7/f;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LO7/f;->E:LO7/f;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LO7/f;->F:LO7/f;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LO7/f;->G:LO7/f;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LO7/f;->H:LO7/f;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, LO7/f;->I:LO7/f;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LO7/f;
    .locals 1

    const-class v0, LO7/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LO7/f;

    return-object p0
.end method

.method public static values()[LO7/f;
    .locals 1

    sget-object v0, LO7/f;->J:[LO7/f;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LO7/f;

    return-object v0
.end method


# virtual methods
.method public final g()Z
    .locals 1

    .prologue
    sget-object v0, LO7/f;->I:LO7/f;

    if-eq p0, v0, :cond_1

    sget-object v0, LO7/f;->G:LO7/f;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
