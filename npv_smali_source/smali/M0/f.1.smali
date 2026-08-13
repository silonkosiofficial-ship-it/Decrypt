.class final enum LM0/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LM0/f;

.field public static final enum D:LM0/f;

.field public static final enum E:LM0/f;

.field public static final enum F:LM0/f;

.field public static final enum G:LM0/f;

.field public static final enum H:LM0/f;

.field public static final enum I:LM0/f;

.field private static final synthetic J:[LM0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LM0/f;

    const-string v1, "Paragraph"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LM0/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LM0/f;->C:LM0/f;

    new-instance v0, LM0/f;

    const-string v1, "Span"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LM0/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LM0/f;->D:LM0/f;

    new-instance v0, LM0/f;

    const-string v1, "VerbatimTts"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LM0/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LM0/f;->E:LM0/f;

    new-instance v0, LM0/f;

    const-string v1, "Url"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LM0/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LM0/f;->F:LM0/f;

    new-instance v0, LM0/f;

    const-string v1, "Link"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LM0/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LM0/f;->G:LM0/f;

    new-instance v0, LM0/f;

    const-string v1, "Clickable"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LM0/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LM0/f;->H:LM0/f;

    new-instance v0, LM0/f;

    const-string v1, "String"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, LM0/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LM0/f;->I:LM0/f;

    invoke-static {}, LM0/f;->e()[LM0/f;

    move-result-object v0

    sput-object v0, LM0/f;->J:[LM0/f;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LM0/f;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [LM0/f;

    sget-object v1, LM0/f;->C:LM0/f;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LM0/f;->D:LM0/f;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LM0/f;->E:LM0/f;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LM0/f;->F:LM0/f;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LM0/f;->G:LM0/f;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, LM0/f;->H:LM0/f;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, LM0/f;->I:LM0/f;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LM0/f;
    .locals 1

    const-class v0, LM0/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LM0/f;

    return-object p0
.end method

.method public static values()[LM0/f;
    .locals 1

    sget-object v0, LM0/f;->J:[LM0/f;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LM0/f;

    return-object v0
.end method
