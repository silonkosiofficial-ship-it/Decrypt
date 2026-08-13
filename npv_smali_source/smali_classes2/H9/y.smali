.class public final enum LH9/y;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH9/y$a;
    }
.end annotation


# static fields
.field public static final D:LH9/y$a;

.field public static final enum E:LH9/y;

.field public static final enum F:LH9/y;

.field public static final enum G:LH9/y;

.field public static final enum H:LH9/y;

.field public static final enum I:LH9/y;

.field public static final enum J:LH9/y;

.field private static final synthetic K:[LH9/y;


# instance fields
.field private final C:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LH9/y;

    const/4 v1, 0x0

    const-string v2, "http/1.0"

    const-string v3, "HTTP_1_0"

    invoke-direct {v0, v3, v1, v2}, LH9/y;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH9/y;->E:LH9/y;

    new-instance v0, LH9/y;

    const/4 v1, 0x1

    const-string v2, "http/1.1"

    const-string v3, "HTTP_1_1"

    invoke-direct {v0, v3, v1, v2}, LH9/y;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH9/y;->F:LH9/y;

    new-instance v0, LH9/y;

    const/4 v1, 0x2

    const-string v2, "spdy/3.1"

    const-string v3, "SPDY_3"

    invoke-direct {v0, v3, v1, v2}, LH9/y;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH9/y;->G:LH9/y;

    new-instance v0, LH9/y;

    const/4 v1, 0x3

    const-string v2, "h2"

    const-string v3, "HTTP_2"

    invoke-direct {v0, v3, v1, v2}, LH9/y;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH9/y;->H:LH9/y;

    new-instance v0, LH9/y;

    const/4 v1, 0x4

    const-string v2, "h2_prior_knowledge"

    const-string v3, "H2_PRIOR_KNOWLEDGE"

    invoke-direct {v0, v3, v1, v2}, LH9/y;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH9/y;->I:LH9/y;

    new-instance v0, LH9/y;

    const/4 v1, 0x5

    const-string v2, "quic"

    const-string v3, "QUIC"

    invoke-direct {v0, v3, v1, v2}, LH9/y;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH9/y;->J:LH9/y;

    invoke-static {}, LH9/y;->e()[LH9/y;

    move-result-object v0

    sput-object v0, LH9/y;->K:[LH9/y;

    new-instance v0, LH9/y$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LH9/y$a;-><init>(Ly7/k;)V

    sput-object v0, LH9/y;->D:LH9/y$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LH9/y;->C:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic e()[LH9/y;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [LH9/y;

    sget-object v1, LH9/y;->E:LH9/y;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LH9/y;->F:LH9/y;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LH9/y;->G:LH9/y;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LH9/y;->H:LH9/y;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LH9/y;->I:LH9/y;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, LH9/y;->J:LH9/y;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static final synthetic g(LH9/y;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LH9/y;->C:Ljava/lang/String;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LH9/y;
    .locals 1

    const-class v0, LH9/y;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LH9/y;

    return-object p0
.end method

.method public static values()[LH9/y;
    .locals 1

    sget-object v0, LH9/y;->K:[LH9/y;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LH9/y;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LH9/y;->C:Ljava/lang/String;

    return-object v0
.end method
