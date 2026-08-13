.class public final enum LH9/E;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH9/E$a;
    }
.end annotation


# static fields
.field public static final D:LH9/E$a;

.field public static final enum E:LH9/E;

.field public static final enum F:LH9/E;

.field public static final enum G:LH9/E;

.field public static final enum H:LH9/E;

.field public static final enum I:LH9/E;

.field private static final synthetic J:[LH9/E;


# instance fields
.field private final C:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LH9/E;

    const/4 v1, 0x0

    const-string v2, "TLSv1.3"

    const-string v3, "TLS_1_3"

    invoke-direct {v0, v3, v1, v2}, LH9/E;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH9/E;->E:LH9/E;

    new-instance v0, LH9/E;

    const/4 v1, 0x1

    const-string v2, "TLSv1.2"

    const-string v3, "TLS_1_2"

    invoke-direct {v0, v3, v1, v2}, LH9/E;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH9/E;->F:LH9/E;

    new-instance v0, LH9/E;

    const/4 v1, 0x2

    const-string v2, "TLSv1.1"

    const-string v3, "TLS_1_1"

    invoke-direct {v0, v3, v1, v2}, LH9/E;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH9/E;->G:LH9/E;

    new-instance v0, LH9/E;

    const/4 v1, 0x3

    const-string v2, "TLSv1"

    const-string v3, "TLS_1_0"

    invoke-direct {v0, v3, v1, v2}, LH9/E;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH9/E;->H:LH9/E;

    new-instance v0, LH9/E;

    const/4 v1, 0x4

    const-string v2, "SSLv3"

    const-string v3, "SSL_3_0"

    invoke-direct {v0, v3, v1, v2}, LH9/E;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH9/E;->I:LH9/E;

    invoke-static {}, LH9/E;->e()[LH9/E;

    move-result-object v0

    sput-object v0, LH9/E;->J:[LH9/E;

    new-instance v0, LH9/E$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LH9/E$a;-><init>(Ly7/k;)V

    sput-object v0, LH9/E;->D:LH9/E$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LH9/E;->C:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic e()[LH9/E;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [LH9/E;

    sget-object v1, LH9/E;->E:LH9/E;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LH9/E;->F:LH9/E;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LH9/E;->G:LH9/E;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LH9/E;->H:LH9/E;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LH9/E;->I:LH9/E;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LH9/E;
    .locals 1

    const-class v0, LH9/E;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LH9/E;

    return-object p0
.end method

.method public static values()[LH9/E;
    .locals 1

    sget-object v0, LH9/E;->J:[LH9/E;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LH9/E;

    return-object v0
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LH9/E;->C:Ljava/lang/String;

    return-object v0
.end method
