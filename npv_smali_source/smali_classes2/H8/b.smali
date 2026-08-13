.class public final enum LH8/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum D:LH8/b;

.field public static final enum E:LH8/b;

.field public static final enum F:LH8/b;

.field public static final enum G:LH8/b;

.field public static final enum H:LH8/b;

.field public static final enum I:LH8/b;

.field public static final enum J:LH8/b;

.field private static final synthetic K:[LH8/b;

.field private static final synthetic L:Lp7/a;


# instance fields
.field private final C:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LH8/b;

    const/4 v1, 0x0

    const-string v2, "<Error class: %s>"

    const-string v3, "ERROR_CLASS"

    invoke-direct {v0, v3, v1, v2}, LH8/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH8/b;->D:LH8/b;

    new-instance v0, LH8/b;

    const/4 v1, 0x1

    const-string v2, "<Error function>"

    const-string v3, "ERROR_FUNCTION"

    invoke-direct {v0, v3, v1, v2}, LH8/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH8/b;->E:LH8/b;

    new-instance v0, LH8/b;

    const/4 v1, 0x2

    const-string v2, "<Error scope>"

    const-string v3, "ERROR_SCOPE"

    invoke-direct {v0, v3, v1, v2}, LH8/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH8/b;->F:LH8/b;

    new-instance v0, LH8/b;

    const/4 v1, 0x3

    const-string v2, "<Error module>"

    const-string v3, "ERROR_MODULE"

    invoke-direct {v0, v3, v1, v2}, LH8/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH8/b;->G:LH8/b;

    new-instance v0, LH8/b;

    const/4 v1, 0x4

    const-string v2, "<Error property>"

    const-string v3, "ERROR_PROPERTY"

    invoke-direct {v0, v3, v1, v2}, LH8/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH8/b;->H:LH8/b;

    new-instance v0, LH8/b;

    const/4 v1, 0x5

    const-string v2, "[Error type: %s]"

    const-string v3, "ERROR_TYPE"

    invoke-direct {v0, v3, v1, v2}, LH8/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH8/b;->I:LH8/b;

    new-instance v0, LH8/b;

    const/4 v1, 0x6

    const-string v2, "<Fake parent for error lexical scope>"

    const-string v3, "PARENT_OF_ERROR_SCOPE"

    invoke-direct {v0, v3, v1, v2}, LH8/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH8/b;->J:LH8/b;

    invoke-static {}, LH8/b;->e()[LH8/b;

    move-result-object v0

    sput-object v0, LH8/b;->K:[LH8/b;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LH8/b;->L:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LH8/b;->C:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic e()[LH8/b;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [LH8/b;

    sget-object v1, LH8/b;->D:LH8/b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LH8/b;->E:LH8/b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LH8/b;->F:LH8/b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LH8/b;->G:LH8/b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LH8/b;->H:LH8/b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, LH8/b;->I:LH8/b;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, LH8/b;->J:LH8/b;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LH8/b;
    .locals 1

    const-class v0, LH8/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LH8/b;

    return-object p0
.end method

.method public static values()[LH8/b;
    .locals 1

    sget-object v0, LH8/b;->K:[LH8/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LH8/b;

    return-object v0
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LH8/b;->C:Ljava/lang/String;

    return-object v0
.end method
