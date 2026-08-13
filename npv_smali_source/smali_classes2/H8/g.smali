.class public final enum LH8/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum D:LH8/g;

.field public static final enum E:LH8/g;

.field public static final enum F:LH8/g;

.field public static final enum G:LH8/g;

.field public static final enum H:LH8/g;

.field public static final enum I:LH8/g;

.field public static final enum J:LH8/g;

.field public static final enum K:LH8/g;

.field public static final enum L:LH8/g;

.field public static final enum M:LH8/g;

.field private static final synthetic N:[LH8/g;

.field private static final synthetic O:Lp7/a;


# instance fields
.field private final C:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LH8/g;

    const/4 v1, 0x0

    const-string v2, "No member resolution should be done on captured type, it used only during constraint system resolution"

    const-string v3, "CAPTURED_TYPE_SCOPE"

    invoke-direct {v0, v3, v1, v2}, LH8/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH8/g;->D:LH8/g;

    new-instance v0, LH8/g;

    const/4 v1, 0x1

    const-string v2, "Scope for integer literal type (%s)"

    const-string v3, "INTEGER_LITERAL_TYPE_SCOPE"

    invoke-direct {v0, v3, v1, v2}, LH8/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH8/g;->E:LH8/g;

    new-instance v0, LH8/g;

    const/4 v1, 0x2

    const-string v2, "Error scope for erased receiver type"

    const-string v3, "ERASED_RECEIVER_TYPE_SCOPE"

    invoke-direct {v0, v3, v1, v2}, LH8/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH8/g;->F:LH8/g;

    new-instance v0, LH8/g;

    const/4 v1, 0x3

    const-string v2, "Scope for abbreviation %s"

    const-string v3, "SCOPE_FOR_ABBREVIATION_TYPE"

    invoke-direct {v0, v3, v1, v2}, LH8/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH8/g;->G:LH8/g;

    new-instance v0, LH8/g;

    const/4 v1, 0x4

    const-string v2, "Scope for stub type %s"

    const-string v3, "STUB_TYPE_SCOPE"

    invoke-direct {v0, v3, v1, v2}, LH8/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH8/g;->H:LH8/g;

    new-instance v0, LH8/g;

    const/4 v1, 0x5

    const-string v2, "A scope for common supertype which is not a normal classifier"

    const-string v3, "NON_CLASSIFIER_SUPER_TYPE_SCOPE"

    invoke-direct {v0, v3, v1, v2}, LH8/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH8/g;->I:LH8/g;

    new-instance v0, LH8/g;

    const/4 v1, 0x6

    const-string v2, "Scope for error type %s"

    const-string v3, "ERROR_TYPE_SCOPE"

    invoke-direct {v0, v3, v1, v2}, LH8/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH8/g;->J:LH8/g;

    new-instance v0, LH8/g;

    const/4 v1, 0x7

    const-string v2, "Scope for unsupported type %s"

    const-string v3, "UNSUPPORTED_TYPE_SCOPE"

    invoke-direct {v0, v3, v1, v2}, LH8/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH8/g;->K:LH8/g;

    new-instance v0, LH8/g;

    const/16 v1, 0x8

    const-string v2, "Error scope for class %s with arguments: %s"

    const-string v3, "SCOPE_FOR_ERROR_CLASS"

    invoke-direct {v0, v3, v1, v2}, LH8/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH8/g;->L:LH8/g;

    new-instance v0, LH8/g;

    const/16 v1, 0x9

    const-string v2, "Error resolution candidate for call %s"

    const-string v3, "SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE"

    invoke-direct {v0, v3, v1, v2}, LH8/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH8/g;->M:LH8/g;

    invoke-static {}, LH8/g;->e()[LH8/g;

    move-result-object v0

    sput-object v0, LH8/g;->N:[LH8/g;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LH8/g;->O:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LH8/g;->C:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic e()[LH8/g;
    .locals 3

    const/16 v0, 0xa

    new-array v0, v0, [LH8/g;

    sget-object v1, LH8/g;->D:LH8/g;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LH8/g;->E:LH8/g;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LH8/g;->F:LH8/g;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LH8/g;->G:LH8/g;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LH8/g;->H:LH8/g;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, LH8/g;->I:LH8/g;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, LH8/g;->J:LH8/g;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, LH8/g;->K:LH8/g;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, LH8/g;->L:LH8/g;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, LH8/g;->M:LH8/g;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LH8/g;
    .locals 1

    const-class v0, LH8/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LH8/g;

    return-object p0
.end method

.method public static values()[LH8/g;
    .locals 1

    sget-object v0, LH8/g;->N:[LH8/g;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LH8/g;

    return-object v0
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LH8/g;->C:Ljava/lang/String;

    return-object v0
.end method
