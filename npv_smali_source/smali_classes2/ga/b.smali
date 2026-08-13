.class public final enum Lga/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lga/b;

.field public static final enum F:Lga/b;

.field public static final enum G:Lga/b;

.field public static final enum H:Lga/b;

.field public static final enum I:Lga/b;

.field private static final synthetic J:[Lga/b;


# instance fields
.field private final C:I

.field private final D:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lga/b;

    const/16 v1, 0x28

    const-string v2, "ERROR"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1, v2}, Lga/b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lga/b;->E:Lga/b;

    new-instance v0, Lga/b;

    const/4 v1, 0x1

    const/16 v2, 0x1e

    const-string v4, "WARN"

    invoke-direct {v0, v4, v1, v2, v4}, Lga/b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lga/b;->F:Lga/b;

    new-instance v0, Lga/b;

    const/4 v1, 0x2

    const/16 v2, 0x14

    const-string v4, "INFO"

    invoke-direct {v0, v4, v1, v2, v4}, Lga/b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lga/b;->G:Lga/b;

    new-instance v0, Lga/b;

    const/4 v1, 0x3

    const/16 v2, 0xa

    const-string v4, "DEBUG"

    invoke-direct {v0, v4, v1, v2, v4}, Lga/b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lga/b;->H:Lga/b;

    new-instance v0, Lga/b;

    const-string v1, "TRACE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v3, v1}, Lga/b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lga/b;->I:Lga/b;

    invoke-static {}, Lga/b;->e()[Lga/b;

    move-result-object v0

    sput-object v0, Lga/b;->J:[Lga/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lga/b;->C:I

    iput-object p4, p0, Lga/b;->D:Ljava/lang/String;

    return-void
.end method

.method private static synthetic e()[Lga/b;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lga/b;

    sget-object v1, Lga/b;->E:Lga/b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lga/b;->F:Lga/b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lga/b;->G:Lga/b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lga/b;->H:Lga/b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lga/b;->I:Lga/b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lga/b;
    .locals 1

    const-class v0, Lga/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lga/b;

    return-object p0
.end method

.method public static values()[Lga/b;
    .locals 1

    sget-object v0, Lga/b;->J:[Lga/b;

    invoke-virtual {v0}, [Lga/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lga/b;

    return-object v0
.end method


# virtual methods
.method public g()I
    .locals 1

    iget v0, p0, Lga/b;->C:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lga/b;->D:Ljava/lang/String;

    return-object v0
.end method
